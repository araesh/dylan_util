package qmul.util.parse;

import edu.stanford.nlp.parser.Parser;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.trees.Tree;

/**
 * Just an extension to allow a {@link Parser} to return you the best {@link Tree} (as the {@link LexicalizedParser}
 * implementation already does)
 * 
 * @author mpurver
 */
public interface TreeParser extends Parser {

	public Tree getBestParse();

}
