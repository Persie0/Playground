package com.lingq.core.tooltips;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.lingq.core.designsystem.R$color;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class TooltipContainer extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(context.getColor(R$color.transparent));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipContainer(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ TooltipContainer(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
