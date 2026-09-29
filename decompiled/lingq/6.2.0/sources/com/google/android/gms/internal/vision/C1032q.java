package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import p000.gfc;
import p000.iwc;
import p000.noc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C1032q {

    /* JADX INFO: renamed from: a */
    public final C1031p f12240a;

    public C1032q(C1031p c1031p) {
        Charset charset = noc.f53082a;
        this.f12240a = c1031p;
        c1031p.f12236a = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m5737a(int i, zzht zzhtVar) {
        C1031p c1031p = this.f12240a;
        c1031p.m5730c(i, 2);
        c1031p.m5733g(zzhtVar.mo5832f());
        zzid zzidVar = (zzid) zzhtVar;
        c1031p.m5735k(zzidVar.f12298d, zzidVar.mo5834j(), zzidVar.mo5832f());
    }

    /* JADX INFO: renamed from: b */
    public final void m5738b(int i, Object obj, iwc iwcVar) throws zzii$zzb {
        gfc gfcVar = (gfc) obj;
        C1031p c1031p = this.f12240a;
        c1031p.m5730c(i, 2);
        int iMo5745c = gfcVar.mo5745c();
        if (iMo5745c == -1) {
            iMo5745c = iwcVar.mo5763e(gfcVar);
            gfcVar.mo5744b(iMo5745c);
        }
        c1031p.m5733g(iMo5745c);
        iwcVar.mo5762d(gfcVar, c1031p.f12236a);
    }

    /* JADX INFO: renamed from: c */
    public final void m5739c(int i, Object obj, iwc iwcVar) {
        C1031p c1031p = this.f12240a;
        c1031p.m5730c(i, 3);
        iwcVar.mo5762d((gfc) obj, c1031p.f12236a);
        c1031p.m5730c(i, 4);
    }
}
