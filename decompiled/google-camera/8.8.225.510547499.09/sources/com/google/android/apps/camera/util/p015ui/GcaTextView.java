package com.google.android.apps.camera.util.p015ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import p000.C0752js;
import p000.idd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GcaTextView extends C0752js {
    public GcaTextView(Context context) {
        super(context);
        m4513a();
    }

    /* JADX INFO: renamed from: a */
    private final void m4513a() {
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(-1);
        postDelayed(new idd(this, 15), 1500L);
    }

    public GcaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4513a();
    }

    public GcaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4513a();
    }
}
