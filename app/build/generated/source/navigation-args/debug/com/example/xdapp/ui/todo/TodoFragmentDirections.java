package com.example.xdapp.ui.todo;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.xdapp.R;

public class TodoFragmentDirections {
  private TodoFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationTodoToFragment1() {
    return new ActionOnlyNavDirections(R.id.action_navigation_todo_to_fragment1);
  }
}
