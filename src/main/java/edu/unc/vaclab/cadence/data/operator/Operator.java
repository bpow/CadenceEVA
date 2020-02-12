package edu.unc.vaclab.cadence.data.operator;

import edu.unc.vaclab.cadence.data.Cohort;
import edu.unc.vaclab.cadence.data.JSONSerializable;
import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.JSONObject;


public abstract class Operator implements JSONSerializable {
    protected Cohort parentCohort;
    protected Cohort incCohort;
    protected Cohort exCohort;

    public Cohort getParentCohort() {
        return parentCohort;
    }

    public Cohort getExCohort() {
        return exCohort;
    }

    public Cohort getIncCohort() {
        return incCohort;
    }

    @Override
    public JSONObject toJSON() throws JSONException{
        JSONObject _json = new JSONObject();
        _json.put("parCohort", parentCohort.getID());
        _json.put("incCohort", incCohort.getID());
        _json.put("exCohort", exCohort.getID());
        return _json;
    }
}
