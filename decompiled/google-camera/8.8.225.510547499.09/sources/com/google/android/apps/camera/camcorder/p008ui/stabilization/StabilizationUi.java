package com.google.android.apps.camera.camcorder.p008ui.stabilization;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuButton;
import p000.afx;
import p000.dbh;
import p000.ilk;
import p000.jvh;
import p000.mwx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StabilizationUi extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final mwx f6582a;

    /* JADX INFO: renamed from: b */
    public PopupMenuButton f6583b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f6584c;

    /* JADX INFO: renamed from: d */
    public ilk f6585d;

    /* JADX INFO: renamed from: e */
    private ValueAnimator f6586e;

    public StabilizationUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6582a = mwx.m17122q(dbh.STANDARD, Integer.valueOf(C0100R.drawable.quantum_gm_ic_stabilization_white_24), dbh.LOCKED, Integer.valueOf(C0100R.drawable.quantum_gm_ic_stabilization_lock_white_24), dbh.CINEMATIC, Integer.valueOf(C0100R.drawable.quantum_gm_ic_stabilization_pan_white_24), dbh.ACTIVE, Integer.valueOf(C0100R.drawable.quantum_gm_ic_stabilization_action_white_24));
        this.f6585d = ilk.PORTRAIT;
    }

    /* JADX INFO: renamed from: a */
    public final void m4081a(ilk ilkVar) {
        this.f6585d = ilkVar;
        jvh.m13577y(this, ilkVar);
        jvh.m13578z(this.f6583b, ilkVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m4082b(boolean z, boolean z2) {
        if (!z2) {
            this.f6583b.setAlpha(true == z ? 0.7f : 1.0f);
        } else if (z) {
            this.f6586e.start();
        } else {
            this.f6586e.cancel();
            this.f6583b.setAlpha(1.0f);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.stab_button_layout, this);
        this.f6584c = (FrameLayout) findViewById(C0100R.id.stab_button_place_holder);
        PopupMenuButton popupMenuButton = (PopupMenuButton) findViewById(C0100R.id.stab_button);
        this.f6583b = popupMenuButton;
        Integer num = (Integer) this.f6582a.get(dbh.STANDARD);
        num.getClass();
        popupMenuButton.setImageResource(num.intValue());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.7f);
        this.f6586e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.f6586e.setInterpolator(new LinearInterpolator());
        this.f6586e.setRepeatCount(-1);
        this.f6586e.setRepeatMode(2);
        this.f6586e.addUpdateListener(new afx(this, 4));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4081a(this.f6585d);
        }
    }
}
