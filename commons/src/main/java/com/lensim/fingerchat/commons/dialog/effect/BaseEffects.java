package com.lensim.fingerchat.commons.dialog.effect;

import android.animation.AnimatorSet;
import android.view.View;

/**
 * Created by LY309313 on 2016/11/10.
 */

public abstract class BaseEffects {

    private static final int DURATION = 1 * 700;

    protected long mDuration =DURATION ;

    private AnimatorSet mAnimatorSet;

    {
        mAnimatorSet = new AnimatorSet();
    }

    protected abstract void setupAnimation(View view);

    public void start(View view) {
        reset(view);
        setupAnimation(view);
        mAnimatorSet.start();
    }
    public void reset(View view) {
        view.setPivotX(view.getMeasuredWidth() / 2.0f);
        view.setPivotY(view.getMeasuredHeight() / 2.0f);
    }


    public AnimatorSet getAnimatorSet() {
        return mAnimatorSet;
    }

    public void setDuration(long duration) {
        this.mDuration = duration;
    }

}
