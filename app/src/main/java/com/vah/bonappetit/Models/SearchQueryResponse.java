package com.vah.bonappetit.Models;

import java.util.ArrayList;
import java.util.List;

public class SearchQueryResponse {
    public List<Result> results;
    public int offset;
    public int number;
    public int totalResults;

    public List<Result> getResults() {
        return results;
    }
}
