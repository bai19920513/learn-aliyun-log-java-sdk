package com.aliyun.openservices.log.common;

import com.alibaba.fastjson.annotation.JSONField;
import net.sf.json.JSONObject;

import java.io.Serializable;

public class ETL extends AbstractJob implements Serializable {

    private static final long serialVersionUID = 949447748635414993L;

    /**
     * ETL configuration.
     */
    @JSONField
    private ETLConfiguration configuration;

    public ETL() {
        setType(JobType.ETL);
    }

    @Override
    public ETLConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ETLConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void deserialize(JSONObject value) {
        super.deserialize(value);
        configuration = new ETLConfiguration();
        configuration.deserialize(value.getJSONObject("configuration"));
    }
}
