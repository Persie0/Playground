package com.google.android.apps.camera.focusindicator;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.HashMap;
import p000.C0004ad;
import p000.C0005ae;
import p000.C0006af;
import p000.C0273iq;
import p000.dwi;
import p000.dwj;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class FocusIndicatorAccessoryView extends C0273iq {

    /* JADX INFO: renamed from: a */
    public View f6680a;

    /* JADX INFO: renamed from: b */
    private final Duration f6681b;

    /* JADX INFO: renamed from: c */
    private Animator f6682c;

    FocusIndicatorAccessoryView(Context context) {
        super(context);
        this.f6682c = new AnimatorSet();
        this.f6681b = Duration.ofMillis(context.getResources().getInteger(C0100R.integer.accessory_indicator_animation_millis));
    }

    /* JADX INFO: renamed from: a */
    public final void m4126a() {
        this.f6682c.cancel();
    }

    /* JADX INFO: renamed from: b */
    public final void m4127b() {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_in);
        this.f6682c = animatorLoadAnimator;
        animatorLoadAnimator.setDuration(this.f6681b.toMillis());
        this.f6682c.setTarget(this);
        this.f6682c.addListener(new dwi(this));
        this.f6682c.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m4128c(boolean z) {
        if (!z) {
            setVisibility(8);
            return;
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_out);
        this.f6682c = animatorLoadAnimator;
        animatorLoadAnimator.setDuration(this.f6681b.toMillis());
        this.f6682c.setTarget(this);
        this.f6682c.addListener(new dwj(this));
        this.f6682c.start();
    }

    /* JADX INFO: renamed from: d */
    public final void m4129d(float f) {
        setImageAlpha((int) (f * 255.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m4130e() {
        View view = this.f6680a;
        view.getClass();
        C0004ad c0004ad = (C0004ad) view.getLayoutParams();
        int iRound = c0004ad.leftMargin + Math.round(this.f6680a.getTranslationX());
        int iRound2 = c0004ad.topMargin + Math.round(this.f6680a.getTranslationY());
        Point point = new Point(iRound + (this.f6680a.getWidth() / 2), iRound2 + (this.f6680a.getHeight() / 2));
        int dimensionPixelSize = (getResources().getDimensionPixelSize(C0100R.dimen.square_focus_ring_size) / 2) + getHeight();
        Rect rect = new Rect(point.x - dimensionPixelSize, point.y - dimensionPixelSize, point.x + dimensionPixelSize, point.y + dimensionPixelSize);
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        C0006af c0006af = new C0006af();
        int id = getId();
        int id2 = this.f6680a.getId();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.focus_indicator_ring_view_size) / 2;
        int childCount = constraintLayout.getChildCount();
        c0006af.f271a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            C0004ad c0004ad2 = (C0004ad) childAt.getLayoutParams();
            int id3 = childAt.getId();
            HashMap map = c0006af.f271a;
            Integer numValueOf = Integer.valueOf(id3);
            if (!map.containsKey(numValueOf)) {
                c0006af.f271a.put(numValueOf, new C0005ae());
            }
            C0005ae c0005ae = (C0005ae) c0006af.f271a.get(numValueOf);
            c0005ae.f224d = id3;
            c0005ae.f228h = c0004ad2.f138d;
            c0005ae.f229i = c0004ad2.f139e;
            c0005ae.f230j = c0004ad2.f140f;
            c0005ae.f231k = c0004ad2.f141g;
            c0005ae.f232l = c0004ad2.f142h;
            c0005ae.f233m = c0004ad2.f143i;
            c0005ae.f234n = c0004ad2.f144j;
            c0005ae.f235o = c0004ad2.f145k;
            c0005ae.f236p = c0004ad2.f146l;
            c0005ae.f237q = c0004ad2.f147m;
            c0005ae.f238r = c0004ad2.f148n;
            c0005ae.f239s = c0004ad2.f149o;
            c0005ae.f240t = c0004ad2.f150p;
            c0005ae.f241u = c0004ad2.f157w;
            c0005ae.f242v = c0004ad2.f158x;
            c0005ae.f243w = c0004ad2.f159y;
            c0005ae.f244x = c0004ad2.f120K;
            c0005ae.f245y = c0004ad2.f121L;
            c0005ae.f246z = c0004ad2.f122M;
            c0005ae.f227g = c0004ad2.f137c;
            c0005ae.f225e = c0004ad2.f135a;
            c0005ae.f226f = c0004ad2.f136b;
            c0005ae.f222b = c0004ad2.width;
            c0005ae.f223c = c0004ad2.height;
            c0005ae.f186A = c0004ad2.leftMargin;
            c0005ae.f187B = c0004ad2.rightMargin;
            c0005ae.f188C = c0004ad2.topMargin;
            c0005ae.f189D = c0004ad2.bottomMargin;
            c0005ae.f199N = c0004ad2.f111B;
            c0005ae.f200O = c0004ad2.f110A;
            c0005ae.f202Q = c0004ad2.f113D;
            c0005ae.f201P = c0004ad2.f112C;
            c0005ae.f216ad = c0004ad2.f114E;
            c0005ae.f217ae = c0004ad2.f115F;
            c0005ae.f218af = c0004ad2.f118I;
            c0005ae.f219ag = c0004ad2.f119J;
            c0005ae.f220ah = c0004ad2.f116G;
            c0005ae.f221ai = c0004ad2.f117H;
            c0005ae.f190E = c0004ad2.getMarginEnd();
            c0005ae.f191F = c0004ad2.getMarginStart();
            c0005ae.f192G = childAt.getVisibility();
            c0005ae.f203R = childAt.getAlpha();
            c0005ae.f206U = childAt.getRotationX();
            c0005ae.f207V = childAt.getRotationY();
            c0005ae.f208W = childAt.getScaleX();
            c0005ae.f209X = childAt.getScaleY();
            c0005ae.f210Y = childAt.getPivotX();
            c0005ae.f211Z = childAt.getPivotY();
            c0005ae.f213aa = childAt.getTranslationX();
            c0005ae.f214ab = childAt.getTranslationY();
            c0005ae.f215ac = childAt.getTranslationZ();
            if (c0005ae.f204S) {
                c0005ae.f205T = childAt.getElevation();
            }
        }
        c0006af.m414b(id, 3);
        c0006af.m414b(id, 4);
        c0006af.m414b(id, 6);
        c0006af.m414b(id, 7);
        int i2 = dimensionPixelSize2 - dimensionPixelSize;
        if (rect.top >= 0) {
            c0006af.m416d(id, 3, id2, 3, i2);
            c0006af.m415c(id, 6, id2, 6);
            c0006af.m415c(id, 7, id2, 7);
        } else {
            c0006af.m415c(id, 3, id2, 3);
            c0006af.m415c(id, 4, id2, 4);
            if (rect.left > constraintLayout.getWidth() - rect.width()) {
                c0006af.m416d(id, 6, id2, 6, i2);
            } else {
                c0006af.m416d(id, 7, id2, 7, i2);
            }
        }
        c0006af.m413a(constraintLayout);
        constraintLayout.f854c = null;
        setTranslationX(this.f6680a.getTranslationX());
        setTranslationY(this.f6680a.getTranslationY());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4131f() {
        return this.f6682c.isRunning();
    }

    public FocusIndicatorAccessoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6682c = new AnimatorSet();
        this.f6681b = Duration.ofMillis(context.getResources().getInteger(C0100R.integer.accessory_indicator_animation_millis));
    }
}
