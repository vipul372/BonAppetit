package com.vah.bonappetit.Listeners;

import com.vah.bonappetit.Models.RandomRecipe;

import java.util.List;

public interface RandomAPIResponseListener {
    void didFetch(List<RandomRecipe> responses, String message);
    void didError(String message);
}
