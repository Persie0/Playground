package com.google.android.apps.camera.rewind;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class RewindThumbnailScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: f */
    private static final nbh f6910f = nbh.m17259h("com/google/android/apps/camera/rewind/RewindThumbnailScrollView");

    /* JADX INFO: renamed from: a */
    public final Context f6911a;

    /* JADX INFO: renamed from: b */
    public final Drawable f6912b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout.LayoutParams f6913c;

    /* JADX INFO: renamed from: d */
    public int f6914d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f6915e;

    /* JADX INFO: renamed from: g */
    private final int f6916g;

    /* JADX INFO: renamed from: h */
    private final PropertyValuesHolder f6917h;

    /* JADX INFO: renamed from: i */
    private LayoutInflater f6918i;

    /* JADX INFO: renamed from: j */
    private int f6919j;

    public RewindThumbnailScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6914d = -1;
        this.f6919j = -1;
        this.f6911a = context;
        Drawable drawable = context.getDrawable(C0100R.drawable.mcfly_high_quality_thumbnail_dot);
        drawable.getClass();
        this.f6912b = drawable;
        this.f6916g = getResources().getDimensionPixelSize(C0100R.dimen.mcfly_thumbnails_height);
        this.f6913c = new FrameLayout.LayoutParams(-2, -1, 83);
        this.f6917h = PropertyValuesHolder.ofFloat("translationY", 0.0f, -7.0f);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f6918i = LayoutInflater.from(getContext());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f6915e == null && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
