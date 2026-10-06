package com.google.android.apps.camera.smarts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.hed;
import p000.jvd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SmartsUiGleamingView extends View {

    /* JADX INFO: renamed from: a */
    public AnimatedVectorDrawable f6947a;

    /* JADX INFO: renamed from: b */
    public int f6948b;

    /* JADX INFO: renamed from: c */
    private AnimatedVectorDrawable f6949c;

    public SmartsUiGleamingView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m4294a() {
        jvd.m13538a();
        this.f6949c.setVisible(false, false);
        this.f6947a.setVisible(false, false);
        setVisibility(4);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        this.f6949c.draw(canvas);
        this.f6947a.draw(canvas);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        hed hedVar = new hed(this);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getResources().getDrawable(C0100R.drawable.gleam_animated_vector, null);
        this.f6949c = animatedVectorDrawable;
        animatedVectorDrawable.setCallback(this);
        getResources().getDimensionPixelSize(C0100R.dimen.smarts_gleam_animation_width);
        this.f6949c.registerAnimationCallback(hedVar);
        this.f6949c.setVisible(false, false);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) getResources().getDrawable(C0100R.drawable.longpress_gleam_animated_vector, null);
        this.f6947a = animatedVectorDrawable2;
        animatedVectorDrawable2.setCallback(this);
        this.f6948b = getResources().getDimensionPixelSize(C0100R.dimen.smarts_longpress_gleam_animation_width) / 2;
        this.f6947a.registerAnimationCallback(hedVar);
        this.f6947a.setVisible(false, false);
        setVisibility(4);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f6949c || drawable == this.f6947a || super.verifyDrawable(drawable);
    }

    public SmartsUiGleamingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
