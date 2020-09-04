package no.kristiania.http;

import java.util.HashMap;
import java.util.Map;

public class QueryString {
    private final Map<String, String> parameters=new HashMap<>();

    /*Dette er metoden som kalles,
        når jeg kjører new og den tar inn et parameter som jeg kaller for queryString som er string. */
    public QueryString(String queryString) {
        for (String parameter : queryString.split("&")) {
            int equalPos = parameter.indexOf('=');
            String parameterName = parameter.substring(0, equalPos);
            String parameterValue = parameter.substring(equalPos + 1);
            parameters.put(parameterName, parameterValue);
        }

    }

    public String getParameter(String parameterName) {
        return parameters.get(parameterName);
        }
    }

