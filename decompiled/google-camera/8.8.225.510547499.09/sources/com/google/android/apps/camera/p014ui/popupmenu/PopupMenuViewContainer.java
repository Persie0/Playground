package com.google.android.apps.camera.p014ui.popupmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PopupMenuViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private ilk f7103a;

    public PopupMenuViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7103a = ilk.PORTRAIT;
    }

    /* JADX INFO: renamed from: a */
    public final void m4409a(ilk ilkVar) {
        this.f7103a = ilkVar;
        jvh.m13577y(this, ilkVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4409a(this.f7103a);
        }
    }
}
