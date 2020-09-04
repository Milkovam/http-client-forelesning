package no.kristiania.http;

public class QueryString {
    private final String parameterValue;

    /*Dette er metoden som kalles,
        når jeg kjører new og den tar inn et parameter som jeg kaller for queryString som er string. */
    public QueryString(String queryString) {
        int equalPos=queryString.indexOf('=');
        parameterValue=queryString.substring(equalPos+1);
    }

    public String getParameter(String status) {
        return parameterValue;
    }
}
