package com.google.android.gms.internal.vision;

import p000.g9a;
import p000.gfc;
import p000.iwc;
import p000.izc;
import p000.olc;
import p000.ozc;
import p000.rnc;
import p000.vnb;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C1038w implements iwc {

    /* JADX INFO: renamed from: a */
    public final gfc f12259a;

    /* JADX INFO: renamed from: b */
    public final izc f12260b;

    /* JADX INFO: renamed from: c */
    public final olc f12261c;

    public C1038w(izc izcVar, olc olcVar, gfc gfcVar) {
        this.f12260b = izcVar;
        olcVar.getClass();
        this.f12261c = olcVar;
        this.f12259a = gfcVar;
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: a */
    public final void mo5759a(Object obj) {
        this.f12260b.getClass();
        ((AbstractC1034s) obj).zzb.f55346e = false;
        this.f12261c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: b */
    public final boolean mo5760b(Object obj) {
        this.f12261c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: c */
    public final int mo5761c(AbstractC1034s abstractC1034s) {
        this.f12260b.getClass();
        return abstractC1034s.zzb.hashCode();
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: d */
    public final void mo5762d(Object obj, C1032q c1032q) {
        this.f12261c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: e */
    public final int mo5763e(Object obj) {
        this.f12260b.getClass();
        ozc ozcVar = ((AbstractC1034s) obj).zzb;
        int i = ozcVar.f55345d;
        if (i != -1) {
            return i;
        }
        int iM5716h = 0;
        for (int i2 = 0; i2 < ozcVar.f55342a; i2++) {
            int i3 = ozcVar.f55343b[i2] >>> 3;
            iM5716h += C1031p.m5716h(3, (zzht) ozcVar.f55344c[i2]) + C1031p.m5724s(2, i3) + (C1031p.m5725t(8) << 1);
        }
        ozcVar.f55345d = iM5716h;
        return iM5716h;
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: f */
    public final void mo5764f(Object obj, byte[] bArr, int i, int i2, vnb vnbVar) {
        AbstractC1034s abstractC1034s = (AbstractC1034s) obj;
        if (abstractC1034s.zzb == ozc.f55341f) {
            abstractC1034s.zzb = ozc.m18846b();
        }
        throw g9a.m12430g(obj);
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: g */
    public final void mo5765g(AbstractC1034s abstractC1034s, AbstractC1034s abstractC1034s2) {
        AbstractC1039x.m5802h(this.f12260b, abstractC1034s, abstractC1034s2);
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: h */
    public final boolean mo5766h(AbstractC1034s abstractC1034s, AbstractC1034s abstractC1034s2) {
        this.f12260b.getClass();
        return abstractC1034s.zzb.equals(abstractC1034s2.zzb);
    }

    @Override // p000.iwc
    public final Object zza() {
        return ((rnc) ((AbstractC1034s) this.f12259a).mo5699e(5)).m20724e();
    }
}
