package com.google.android.apps.camera.progressoverlay;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ProgressOverlay extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimatedVectorDrawable f6881a;

    /* JADX INFO: renamed from: b */
    private ImageView f6882b;

    public ProgressOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m4253a() {
        super.onFinishInflate();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        removeAllViewsInLayout();
        layoutInflater.inflate(C0100R.layout.large_progress_overlay, this);
        this.f6882b = (ImageView) findViewById(C0100R.id.large_progress_circular);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(C0100R.drawable.large_processing_indicator_animation);
        this.f6881a = animatedVectorDrawable;
        this.f6882b.setImageDrawable(animatedVectorDrawable);
    }

    /* JADX INFO: renamed from: b */
    public final void m4254b() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.progress_overlay, this);
        this.f6882b = (ImageView) findViewById(C0100R.id.progress_circular);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(C0100R.drawable.processing_indicator_animation);
        this.f6881a = animatedVectorDrawable;
        this.f6882b.setImageDrawable(animatedVectorDrawable);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        m4254b();
    }
}
