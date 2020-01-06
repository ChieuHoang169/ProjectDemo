package com.example.xdapp.ui.calendar;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.xdapp.R;

public class CalendarFragmentDirections {
  private CalendarFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationCalendarToPageTileFragment() {
    return new ActionOnlyNavDirections(R.id.action_navigation_calendar_to_pageTileFragment);
  }
}
