package com.example.xdapp.ui.todo;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.xdapp.R;

public class Fragment2Directions {
  private Fragment2Directions() {
  }

  @NonNull
  public static NavDirections actionFragment2ToFragment12() {
    return new ActionOnlyNavDirections(R.id.action_fragment2_to_fragment12);
  }

  @NonNull
  public static NavDirections actionFragment2ToFragment13() {
    return new ActionOnlyNavDirections(R.id.action_fragment2_to_fragment13);
  }
}
