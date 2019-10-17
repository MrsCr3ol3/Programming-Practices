import java.util.Map;

/**
 * Implements construction, encoding, and decoding logic of the Huffman coding algorithm. Characters
 * not in the given seed or alphabet should not be compressible, and attempts to use those
 * characters should result in the throwing of an {@link IllegalArgumentException} if used in {@link
 * #compress(String)}.
 *
 */
public class Huffman {

    /**
     * Constructs a {@code Huffman} instance from a seed string, from which to deduce the alphabet
     * and corresponding frequencies.
     * <p/>
     * Do NOT modify this constructor header.
     *
     * @param seed the String from which to build the encoding
     * @throws IllegalArgumentException seed is null, seed is empty, or resulting alphabet only has
     * 1 character
     */
    public Huffman(String seed) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * Constructs a {@code Huffman} instance from a frequency map of the input alphabet.
     * <p/>
     * Do NOT modify this constructor header.
     *
     * @param alphabet a frequency map for characters in the alphabet
     * @throws IllegalArgumentException if the alphabet is null, empty, has fewer than 2 characters,
     * or has any non-positive frequencies
     */
    public Huffman(Map<Character, Integer> alphabet) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * Compresses the input string.
     *
     * @param input the string to compress, can be the empty string
     * @return a string of ones and zeroes, representing the binary encoding of the inputted String.
     * @throws IllegalArgumentException if the input is null or if the input contains characters
     * that are not compressible
     */
    public String compress(String input) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * Decompresses the input string.
     *
     * @param input the String of binary digits to decompress, given that it was generated by a
     * matching instance of the same compression strategy
     * @return the decoded version of the compressed input string
     * @throws IllegalArgumentException if the input is null, or if the input contains characters
     * that are NOT 0 or 1, or input contains a sequence of bits that is not decodable
     */
    public String decompress(String input) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

  /**
     * Computes the compression ratio so far. This is the length of all output strings from {@link
     * #compress(String)} divided by the length of all input strings to {@link #compress(String)}.
     * Assume that each char in the input string is a 16 bit int.
     *
     * @return the ratio of the total output length to the total input length in bits
     * @throws IllegalStateException if no calls have been made to {@link #compress(String)} before
     * calling this method
     */
    public double compressionRatio() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * Computes the expected encoding length of an arbitrary character in the alphabet based on the
     * objective function of the compression.
     * 
     * The expected encoding length is simply the sum of the length of the encoding of each 
     * character multiplied by the probability that character occurs. 
     *
     * @return the expected encoding length of an arbitrary character in the alphabet
     */
    public double expectedEncodingLength() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
}
