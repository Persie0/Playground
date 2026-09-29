package com.lingq.core.token.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import com.lingq.core.p012ui.R$id;
import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenMotionLayout extends AbstractC0475b {
    public /* synthetic */ TokenMotionLayout(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m8706C(View view, MotionEvent motionEvent) {
        return motionEvent.getX() > ((float) view.getLeft()) && motionEvent.getX() < ((float) view.getRight()) && motionEvent.getY() > ((float) view.getTop()) && motionEvent.getY() < ((float) view.getBottom());
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0475b, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        boolean z = getProgress() > 0.0f && getProgress() < 1.0f;
        View viewFindViewById = findViewById(R$id.cardView);
        viewFindViewById.getClass();
        boolean zM8706C = m8706C(viewFindViewById, motionEvent);
        if (z || zM8706C) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0475b, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        boolean z = getProgress() > 0.0f && getProgress() < 1.0f;
        View viewFindViewById = findViewById(R$id.cardView);
        viewFindViewById.getClass();
        boolean zM8706C = m8706C(viewFindViewById, motionEvent);
        if (z || zM8706C) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenMotionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenMotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenMotionLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
