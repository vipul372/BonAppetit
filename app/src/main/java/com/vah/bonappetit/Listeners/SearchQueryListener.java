package com.vah.bonappetit.Listeners;

import com.vah.bonappetit.Models.Result;

import java.util.List;

public interface SearchQueryListener {
    void didFetch(List<Result> responses, String message);
    void didError(String message);
}
