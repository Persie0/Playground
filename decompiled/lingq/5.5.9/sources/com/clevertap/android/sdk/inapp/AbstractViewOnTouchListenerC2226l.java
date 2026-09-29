package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2226l extends AbstractC2221h implements View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: D0 */
    public final GestureDetector f11209D0 = new GestureDetector(this.f11184x0, new a());

    /* JADX INFO: renamed from: E0 */
    public View f11210E0;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.l$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m6535a(boolean z10) {
            AnimationSet animationSet = new AnimationSet(true);
            AbstractViewOnTouchListenerC2226l abstractViewOnTouchListenerC2226l = AbstractViewOnTouchListenerC2226l.this;
            animationSet.addAnimation(z10 ? new TranslateAnimation(0.0f, abstractViewOnTouchListenerC2226l.m6517r0(50), 0.0f, 0.0f) : new TranslateAnimation(0.0f, -abstractViewOnTouchListenerC2226l.m6517r0(50), 0.0f, 0.0f));
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new AnimationAnimationListenerC2225k(this));
            abstractViewOnTouchListenerC2226l.f11210E0.startAnimation(animationSet);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
            if (motionEvent.getX() - motionEvent2.getX() > 120.0f && Math.abs(f3) > 200.0f) {
                m6535a(false);
                return true;
            }
            if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f3) <= 200.0f) {
                return false;
            }
            m6535a(true);
            return true;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f11209D0.onTouchEvent(motionEvent) || motionEvent.getAction() == 2;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m6534s0(Button button, CTInAppNotificationButton cTInAppNotificationButton, int i10) {
        if (cTInAppNotificationButton == null) {
            button.setVisibility(8);
            return;
        }
        button.setTag(Integer.valueOf(i10));
        button.setVisibility(0);
        button.setText(cTInAppNotificationButton.f11130h);
        button.setTextColor(Color.parseColor(cTInAppNotificationButton.f11131i));
        button.setBackgroundColor(Color.parseColor(cTInAppNotificationButton.f11124b));
        button.setOnClickListener(new AbstractC2211c.a());
    }
}
