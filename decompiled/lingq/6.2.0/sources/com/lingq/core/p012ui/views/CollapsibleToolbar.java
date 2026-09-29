package com.lingq.core.p012ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public final class CollapsibleToolbar extends AbstractC0475b {

    /* JADX INFO: renamed from: T0 */
    public boolean f24178T0;

    public /* synthetic */ CollapsibleToolbar(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0475b, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        AppBarLayout appBarLayout = parent instanceof AppBarLayout ? (AppBarLayout) parent : null;
        if (appBarLayout != null) {
            if (appBarLayout.f12585h == null) {
                appBarLayout.f12585h = new ArrayList();
            }
            if (appBarLayout.f12585h.contains(this)) {
                return;
            }
            appBarLayout.f12585h.add(this);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0475b, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f24178T0 = motionEvent.getAction() == 1;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsibleToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsibleToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.f24178T0 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsibleToolbar(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
