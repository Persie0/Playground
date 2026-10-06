package com.google.android.apps.camera.rewind.p013ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RewindControllerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ilk f6920a;

    public RewindControllerView(Context context) {
        super(context);
        this.f6920a = ilk.PORTRAIT;
    }

    /* JADX INFO: renamed from: a */
    public final void m4287a() {
        jvh.m13576x(this, this.f6920a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f6920a == null || !z) {
            return;
        }
        m4287a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ilk ilkVar = this.f6920a;
        if (ilkVar == null || ilk.m11427e(ilkVar)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }

    public RewindControllerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6920a = ilk.PORTRAIT;
    }

    public RewindControllerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6920a = ilk.PORTRAIT;
    }
}
