package uk.ac.ox.it.cancer_model.client;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>ExperimentServiceAsync</code>.
 */
public interface ExperimentServiceAsync {
    void experimentServer(long numberOfReplicates,
	                  String email,
	                  String startTime,
	                  ArrayList<String> parameterNames,
	                  ArrayList<Double> parameterValues,
	                  HashMap<String, String> serverFiles,
	                  AsyncCallback<String> callback)
	    throws IllegalArgumentException;
}
