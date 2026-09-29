package com.lingq.feature.reader.pagination.p015ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p000.C3048gr;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonTextView extends C3048gr {

    /* JADX INFO: renamed from: g */
    public boolean f29723g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f29723g) {
                super.setEnabled(false);
                super.setEnabled(this.f29723g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        this.f29723g = z;
        super.setEnabled(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonTextView(Context context) {
        super(context, null);
        context.getClass();
    }
}
