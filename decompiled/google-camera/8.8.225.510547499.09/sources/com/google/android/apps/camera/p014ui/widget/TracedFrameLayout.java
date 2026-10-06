package com.google.android.apps.camera.p014ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000.ijh;
import p000.iji;
import p000.ijj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TracedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final iji f7296a;

    public TracedFrameLayout(Context context) {
        super(context);
        this.f7296a = m4505a(this);
    }

    /* JADX INFO: renamed from: a */
    private static iji m4505a(View view) {
        Object tag = view.getTag();
        return tag == null ? ijh.f31172a : new ijj(tag.toString());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.f7296a.mo11399a("draw");
        super.draw(canvas);
        this.f7296a.mo11400b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f7296a.mo11399a("onLayout");
        super.onLayout(z, i, i2, i3, i4);
        this.f7296a.mo11400b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.f7296a.mo11399a("onMeasure");
        super.onMeasure(i, i2);
        this.f7296a.mo11400b();
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7296a = m4505a(this);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7296a = m4505a(this);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7296a = m4505a(this);
    }
}
