package edu.unc.vaclab.cadence.data;

import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.JSONObject;

public interface JSONSerializable {

	JSONObject toJSON() throws JSONException;
	
}
