package com.google.android.apps.camera.p014ui.views;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GradientBar extends View {

    /* JADX INFO: renamed from: a */
    public ilk f7243a;

    public GradientBar(Context context) {
        super(context);
        this.f7243a = ilk.PORTRAIT;
    }

    /* JADX INFO: renamed from: a */
    public final void m4451a() {
        Trace.beginSection("unionBottombar2Navibar:applyOrientation");
        jvh.m13577y(this, this.f7243a);
        Trace.endSection();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("gradientBar:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4451a();
        }
        Trace.endSection();
    }

    public GradientBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7243a = ilk.PORTRAIT;
    }
}
