package no.bekk.cv.graphsearch.parser;

public class SearchForUsedTechology extends Query {
    public SearchForUsedTechology() {
        super("wildcard");
    }

    @Override
    public void initQuery(StringBuilder start, StringBuilder match, String searchFor, Query middleTarget) {
        start.append("start wildcard=node(*) \n");
        match.append("match ")
                .append(searchFor)
                .append(" ")
                .append(getRelationType(searchFor).print())
                .append(" wildcard \n");
    }

    @Override
    public void appendQuery(StringBuilder start, StringBuilder match, String searchFor, Query middleTarget, int count) {

        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "wildcard";
    }
}