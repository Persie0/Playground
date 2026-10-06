package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.mji;
import p000.mjj;
import p000.mjk;
import p000.mjp;
import p000.mjq;
import p000.mjs;
import p000.mjz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CircularProgressIndicator extends mji {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // p000.mji
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ mjj mo4845a(Context context, AttributeSet attributeSet) {
        return new mjq(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, C0100R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context2 = getContext();
        mjq mjqVar = (mjq) this.f40731a;
        setIndeterminateDrawable(new mjz(context2, mjqVar, new mjk(mjqVar), new mjp(mjqVar)));
        Context context3 = getContext();
        mjq mjqVar2 = (mjq) this.f40731a;
        setProgressDrawable(new mjs(context3, mjqVar2, new mjk(mjqVar2)));
    }
}
