package trie;

import dk.cphbusiness.shakespeare.FileUtility;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import shakespeare.Shakespeare;

/**
 *
 * @author Cherry Rose Semeña
 */
public class Trie {

    public static void main(String[] args) {

        try {
            ShakespeareTrie st = new ShakespeareTrie();
            String[] array = FileUtility.toStringArray("shakespeare-complete-works.txt", "[^A-Za-z']");
            String[] partialShakespeare = getPartialArray(array, 100000);
            for (String word : partialShakespeare) {
//                String word1 = word.toUpperCase();
                st.put(word,word);
            }
            
            System.out.println("SHAKESPEARE WORDS:");
            st.print(System.out);
            
        } catch (IOException ex) {
            Logger.getLogger(Shakespeare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String[] getPartialArray(String[] array, int size) {
        String[] toReturn = new String[size];
        for (int i = 0; i < size; i++) {
            toReturn[i] = array[i];
        }
        return toReturn;
    }
}
