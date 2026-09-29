package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p000.C3386nv;
import p000.lm1;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p000.im1
    /* JADX INFO: renamed from: f */
    public final boolean mo6005f(View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        C3386nv.m17633t("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: g */
    public final void mo6044g(lm1 lm1Var) {
        if (lm1Var.f49821h == 0) {
            lm1Var.f49821h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
