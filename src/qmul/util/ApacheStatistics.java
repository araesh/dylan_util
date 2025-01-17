package qmul.util;

import java.util.Collection;

import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;

/**
 * A wrapper for the Apache {@link DescriptiveStatistics} class with convenience constructors/methods
 * 
 * @author mpurver
 */
public class ApacheStatistics extends DescriptiveStatistics {

	private static final long serialVersionUID = 4900195586011507444L;

	public ApacheStatistics() {
		super();
	}

	public ApacheStatistics(Collection<Double> data) {
		this();
		addValues(data);
	}

	public ApacheStatistics(double[] data) {
		this();
		addValues(data);
	}

	/**
	 * @param data
	 *            a collection of values to be added
	 */
	public void addValues(Collection<Double> data) {
		for (Double datum : data) {
			addValue(datum);
		}
	}

	/**
	 * @param data
	 *            an array of values to be added
	 */
	public void addValues(double[] data) {
		for (double datum : data) {
			addValue(datum);
		}
	}

}
