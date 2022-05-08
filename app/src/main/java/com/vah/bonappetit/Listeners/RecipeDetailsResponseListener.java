package com.vah.bonappetit.Listeners;

import com.vah.bonappetit.Models.RecipeDetailsResponse;

public interface RecipeDetailsResponseListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
