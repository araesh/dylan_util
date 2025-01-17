Stanford Classifier - v2.0 - August, 2007
-------------------------------------------------

Copyright (c) 2003-2007 The Board of Trustees of 
The Leland Stanford Junior University. All Rights Reserved.

Original core classifier code and command line interface by Dan Klein and Chris Manning.
Support code, additional features, etc. by
Kristina Toutanova, Jenny Finkel, Galen Andrew, Joseph Smarr, Chris Cox, Roger Levy, Rajat Raina, Pi-Chuan Chang, Marie-Catherine de Marneffe, Eric Yeh, and Anna Rafferty.  
This release prepared by Anna Rafferty.

This package contains a maximum entropy classifier.

For more information about the classifier, point a web browser at the included javadoc directory, starting at the Package page for the edu.stanford.nlp.classify package, and looking also at the ColumnDataClassifier class documentation therein.

This software requires Java 5 (JDK 1.5.0+).  (You must have installed it
separately. Check the command "java -version".)


QUICKSTART

COMMAND LINE INTERFACE
To classify the included example dataset cheeseDisease (in the examples directory), type the following at the command line while in the main classifier directory:

java -jar stanford-classifier.jar -prop examples/cheese2007.prop

This will classify the included test data, cheeseDisease.test, based on the probability that each example is a cheese or a disease, as calculated by a linear classifier trained on cheeseDisease.train.  

The cheese2007.prop file demonstrates how the features are made.  The first feature in the file, useClassFeature, indicates that a prior should be used based on class frequency in the training set.  Most other features are calculated on specific columns of data in your tab-delimited text file.  For example, "1.useNGrams=true" indicates that n-gram features should be created for the values in column 1 (numbering begins at 0!).  Note that you must specify, for example, "true" in "1.useNGrams=true"; "1.useNGrams" alone will not cause n-gram features to be created.  The prop file also allows a choice of printing and optimization options, and allows you to specify training and test files (e.g., in cheese2006.prop under the "Training input" comment).  See the javadoc for ColumnDataClassifier within the edu.stanford.nlp.classify package for more information on these options.

Another included dataset is the iris dataset which uses numerical features to separate types of irises.   To specify the use of a real-valued rather than categorical feature, you can use one or more of "realValued", "logTransform", or "logitTransform" for a given column.  "realValued" adds the number in the given column as a feature value, while the transform options perform either a log or a logit transform on the value first.  The format of these feature options is the same as for categorical features; for instance, iris2007.prop shows the use of real valued features such as "2.realValued=true".

CLASSIFYING YOUR OWN DATA FILES
To classify your own data files, they should be in tab-delimited text from which to make features as shown above, SVMLight format, or as tab-delimited text with the exact feature values you would like.  Then specify the train and test files on the command line or in a .prop file with "trainFile=/myPath/myTrainFile.train" and "testFile==/myPath/myTestFile.test".  You can also create a serialized classifier using the serializeTo option followed by a file path.

CODE EXAMPLES
You can also directly use the classes in this package to train classifiers within other programs.  An example of this is shown in ClassifierExample, in the package edu.stanford.nlp.classify.  This class demonstrates how to build a classifier factory, creating a classifier and setting various parameters in the classifier, training the classifier, and finally testing the classifier on a different data set.  


LICENSE

// Stanford Classifier
// Copyright (c) 2003-2007 The Board of Trustees of 
// The Leland Stanford Junior University. All Rights Reserved.
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
//
// For more information, bug reports, fixes, contact:
//    Christopher Manning
//    Dept of Computer Science, Gates 1A
//    Stanford CA 94305-9010
//    USA
//    java-nlp-support@lists.stanford.edu
//    http://www-nlp.stanford.edu/software/classifier.shtml


CHANGES

This section summarizes changes between released versions of the classifier.

Version 2.0  2007-08-10
    Command line interface, substantial increase in options and features
Version 1.0  2003-05-26
    Initial release
