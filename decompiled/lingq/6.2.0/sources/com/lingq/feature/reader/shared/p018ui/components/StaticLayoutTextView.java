package com.lingq.feature.reader.shared.p018ui.components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public final class StaticLayoutTextView extends View {

    /* JADX INFO: renamed from: a */
    public StaticLayout f30443a;

    public /* synthetic */ StaticLayoutTextView(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final StaticLayout getTextContainer() {
        return this.f30443a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        StaticLayout staticLayout = this.f30443a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
    }

    public final void setTextContainer(StaticLayout staticLayout) {
        this.f30443a = staticLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StaticLayoutTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticLayoutTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StaticLayoutTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
