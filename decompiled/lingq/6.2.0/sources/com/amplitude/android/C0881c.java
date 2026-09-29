package com.amplitude.android;

import com.amplitude.core.AbstractC0903a;
import java.util.concurrent.ConcurrentHashMap;
import p000.pg9;
import p000.pj5;
import p000.ui3;
import p000.wfb;

/* JADX INFO: renamed from: com.amplitude.android.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0881c {

    /* JADX INFO: renamed from: a */
    public final AbstractC0903a f10810a;

    /* JADX INFO: renamed from: b */
    public final pj5 f10811b;

    /* JADX INFO: renamed from: c */
    public final ui3 f10812c;

    /* JADX INFO: renamed from: d */
    public final float f10813d;

    /* JADX INFO: renamed from: e */
    public pg9 f10814e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f10815f;

    public C0881c(AbstractC0903a abstractC0903a, pj5 pj5Var, float f, ui3 ui3Var) {
        pj5Var.getClass();
        this.f10810a = abstractC0903a;
        this.f10811b = pj5Var;
        this.f10812c = ui3Var;
        this.f10813d = f * 50.0f;
        this.f10815f = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m5062a() {
        AbstractC0903a abstractC0903a = this.f10810a;
        this.f10814e = wfb.m23926u(abstractC0903a.f11018c, abstractC0903a.f11019d, null, new FrustrationInteractionsDetector$startUiChangeCollection$1(this, null), 2);
        this.f10811b.mo16256b("FrustrationInteractionsDetector started - UI change collection is now active");
    }
}
