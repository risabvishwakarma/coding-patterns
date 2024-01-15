package tri;

public class Trie {

     class TrieNode {
        char alpha = 0;
        int count = 0;
        TrieDataStructure nextNode = null;
    }

     class TrieDataStructure {
        private TrieNode[] array;

        public TrieDataStructure() {
            array = new TrieNode[26];
            for (int i = 0; i < 26; i++) {
                this.array[i] = new TrieNode();
            }
        }

        public TrieNode[] getArray() {
            return array;
        }
    }

//    public static class TrieService {
        private TrieDataStructure root = null;

        public void insertWord(String word) {
            if (root == null) {
                root = new TrieDataStructure();
            }
            insertWord(root, word, 0);
        }

        private void insertWord(TrieDataStructure currentNode, String word, int charPointer) {
            int u = word.charAt(charPointer) - 'a';

            currentNode.getArray()[u].alpha = word.charAt(charPointer);
            if (word.length() - 1 == charPointer) {
                currentNode.getArray()[u].count++;
            } else {
                if (currentNode.getArray()[u].nextNode == null) {
                    currentNode.getArray()[u].nextNode = new TrieDataStructure();
                }
                insertWord(currentNode.getArray()[u].nextNode, word, charPointer + 1);
            }
        }

        public void countTheWords() {
            if (root == null) {
                return;
            }
            countTheWords(root, new StringBuilder());
        }

        private void countTheWords(TrieDataStructure root, StringBuilder sb) {
            if (root == null) return;
            for (int i = 0; i < 26; i++) {
                sb.append(root.getArray()[i].alpha);
                if (root.getArray()[i].count > 0) {
                    System.out.println(sb + " " + root.getArray()[i].count);
                }
                countTheWords(root.getArray()[i].nextNode, sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
//    }
}
