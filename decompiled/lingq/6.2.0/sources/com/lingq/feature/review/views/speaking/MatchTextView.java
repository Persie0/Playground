package com.lingq.feature.review.views.speaking;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;
import p000.ar5;
import p000.ix1;
import p000.y52;

/* JADX INFO: loaded from: classes3.dex */
public final class MatchTextView extends MaterialTextView {

    /* JADX INFO: renamed from: g */
    public ar5 f32800g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setTransformationMethod(null);
        setMovementMethod(ix1.f44725a);
        setHighlightColor(0);
    }

    public final void setInteraction(ar5 ar5Var) {
        ar5Var.getClass();
        this.f32800g = ar5Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MatchTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ MatchTextView(Context context, AttributeSet attributeSet, int i, y52 y52Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
