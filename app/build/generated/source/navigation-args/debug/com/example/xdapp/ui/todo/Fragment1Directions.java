package com.example.xdapp.ui.todo;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.xdapp.R;

public class Fragment1Directions {
  private Fragment1Directions() {
  }

  @NonNull
  public static NavDirections actionFragment1ToFragment2() {
    return new ActionOnlyNavDirections(R.id.action_fragment1_to_fragment2);
  }
}
