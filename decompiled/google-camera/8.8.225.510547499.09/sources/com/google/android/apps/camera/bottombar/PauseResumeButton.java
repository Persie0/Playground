package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PauseResumeButton extends ImageButton {
    private static final int[] STATE_PAUSED = {C0100R.attr.state_paused};
    private final Context context;
    private boolean firstTimeLaunch;
    private boolean isResumeState;
    private PauseResumeButtonListener listener;
    private Drawable pauseResumeAnimatable;
    private Drawable resumePauseAnimatable;

    /* JADX INFO: compiled from: PG */
    public interface PauseResumeButtonListener {
        void onPauseButtonClicked();

        void onResumeButtonClicked();
    }

    public PauseResumeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.firstTimeLaunch = true;
        this.context = context;
    }

    public boolean isResumeState() {
        return this.isResumeState;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.isResumeState) {
            return super.onCreateDrawableState(i);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(iArrOnCreateDrawableState, STATE_PAUSED);
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        transitionToPauseState();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.firstTimeLaunch) {
            transitionToPauseState();
            this.firstTimeLaunch = false;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.isResumeState) {
            PauseResumeButtonListener pauseResumeButtonListener = this.listener;
            if (pauseResumeButtonListener != null) {
                pauseResumeButtonListener.onResumeButtonClicked();
            }
        } else {
            PauseResumeButtonListener pauseResumeButtonListener2 = this.listener;
            if (pauseResumeButtonListener2 != null) {
                pauseResumeButtonListener2.onPauseButtonClicked();
            }
        }
        return super.performClick();
    }

    public void resetButton() {
        transitionToPauseState();
        refreshDrawableState();
    }

    public void setListener(PauseResumeButtonListener pauseResumeButtonListener) {
        this.listener = pauseResumeButtonListener;
    }

    protected void transitionToPauseState() {
        if (this.resumePauseAnimatable == null || this.firstTimeLaunch) {
            this.resumePauseAnimatable = this.context.getResources().getDrawable(C0100R.drawable.ic_pause_circle_outline_24px, null);
        }
        setImageDrawable(this.resumePauseAnimatable);
        setBackground(this.context.getResources().getDrawable(C0100R.drawable.crossfade_button_background));
        this.isResumeState = false;
        setContentDescription(getResources().getString(C0100R.string.pause_video_recording));
        refreshDrawableState();
    }

    protected void transitionToResumeState() {
        if (this.pauseResumeAnimatable == null || this.firstTimeLaunch) {
            this.pauseResumeAnimatable = this.context.getResources().getDrawable(C0100R.drawable.resume_center_circle, null);
        }
        setImageDrawable(this.pauseResumeAnimatable);
        this.isResumeState = true;
        setContentDescription(getResources().getString(C0100R.string.resume_video_recording));
        refreshDrawableState();
    }
}
