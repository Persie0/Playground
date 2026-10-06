package com.google.android.apps.camera.p014ui.breadcrumbs;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import p000.ife;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BreadcrumbsView extends ife {

    /* JADX INFO: renamed from: a */
    public ilk f6992a;

    public BreadcrumbsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6992a = ilk.PORTRAIT;
    }

    /* JADX INFO: renamed from: a */
    public final void m4316a() {
        Trace.beginSection("Breadcrumbs:applyOrientation");
        jvh.m13577y(this, this.f6992a);
        Trace.endSection();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("Breadcrumbs:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4316a();
        }
        Trace.endSection();
    }
}
