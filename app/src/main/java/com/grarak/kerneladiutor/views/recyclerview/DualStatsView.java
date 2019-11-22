package com.grarak.kerneladiutor.views.recyclerview;

import android.view.View;
import android.widget.TextView;

import com.grarak.kerneladiutor.R;

public class DualStatsView extends RecyclerViewItem {

    private TextView mStatLeftView, mStatRightView;
    private TextView mTitleLeftView, mTitleRightView;

    private CharSequence mStatLeft, mStatRight;
    private CharSequence mTitleLeft, mTitleRight;

    @Override
    public int getLayoutRes() {
        return R.layout.rv_dual_stats_view;
    }

    @Override
    public void onCreateView(View view) {
        mStatLeftView = view.findViewById(R.id.statLeft);
        mTitleLeftView = view.findViewById(R.id.titleLeft);

        mStatRightView = view.findViewById(R.id.statRight);
        mTitleRightView = view.findViewById(R.id.titleRight);

        super.onCreateView(view);
    }

    public void setStatLeft(CharSequence stat) {
        mStatLeft = stat;
        refresh();
    }

    public void setStatRight(CharSequence stat) {
        mStatRight = stat;
        refresh();
    }

    public void setTitleLeft(CharSequence title) {
        mTitleLeft = title;
        refresh();
    }

    public void setTitleRight(CharSequence title) {
        mTitleRight = title;
        refresh();
    }

    @Override
    protected void refresh() {
        super.refresh();

        if (mStatLeftView != null && mStatLeft != null) {
            mStatLeftView.setText(mStatLeft);
        }
        if (mTitleLeftView != null && mTitleLeft != null) {
            mTitleLeftView.setText(mTitleLeft);
        }

        if (mStatRightView != null && mStatRight != null) {
            mStatRightView.setText(mStatRight);
        }
        if (mTitleRightView != null && mTitleRight != null) {
            mTitleRightView.setText(mTitleRight);
        }
    }

}
