package com.google.android.gms.internal.play_billing;

import p000.C0787av;
import p000.e41;
import p000.g9a;
import p000.gw9;
import p000.jjc;
import p000.lgc;
import p000.p7c;
import p000.q6c;
import p000.s46;
import p000.vfc;
import p000.z3c;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C1002m implements lgc {

    /* JADX INFO: renamed from: a */
    public final AbstractC0997h f12197a;

    /* JADX INFO: renamed from: b */
    public final e41 f12198b;

    public C1002m(e41 e41Var, AbstractC0997h abstractC0997h) {
        s46 s46Var = q6c.f57331a;
        this.f12198b = e41Var;
        this.f12197a = abstractC0997h;
    }

    /* JADX INFO: renamed from: j */
    public static C1002m m5578j(e41 e41Var, AbstractC0997h abstractC0997h) {
        s46 s46Var = q6c.f57331a;
        return new C1002m(e41Var, abstractC0997h);
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: a */
    public final boolean mo5557a(Object obj) {
        throw g9a.m12430g(obj);
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: b */
    public final AbstractC0998i mo5558b() {
        AbstractC0997h abstractC0997h = this.f12197a;
        if (abstractC0997h instanceof AbstractC0998i) {
            return ((AbstractC0998i) abstractC0997h).m5542n();
        }
        p7c p7cVar = (p7c) ((AbstractC0998i) abstractC0997h).mo5511j(5);
        boolean zM5539h = p7cVar.f55715b.m5539h();
        AbstractC0998i abstractC0998i = p7cVar.f55715b;
        if (!zM5539h) {
            return abstractC0998i;
        }
        abstractC0998i.getClass();
        vfc.f65328c.m23265a(abstractC0998i.getClass()).mo5559c(abstractC0998i);
        abstractC0998i.m5537e();
        return p7cVar.f55715b;
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: c */
    public final void mo5559c(Object obj) {
        this.f12198b.getClass();
        jjc jjcVar = ((AbstractC0998i) obj).zzc;
        if (jjcVar.f45644e) {
            jjcVar.f45644e = false;
        }
        s46 s46Var = q6c.f57331a;
        throw g9a.m12430g(obj);
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: d */
    public final int mo5560d(AbstractC0997h abstractC0997h) {
        jjc jjcVar = ((AbstractC0998i) abstractC0997h).zzc;
        int i = jjcVar.f45643d;
        if (i != -1) {
            return i;
        }
        int iM12436m = 0;
        for (int i2 = 0; i2 < jjcVar.f45640a; i2++) {
            int i3 = jjcVar.f45641b[i2] >>> 3;
            zzev zzevVar = (zzev) jjcVar.f45642c[i2];
            int iM25433o = z3c.m25433o(8);
            int iM25433o2 = z3c.m25433o(i3) + z3c.m25433o(16);
            int iM25433o3 = z3c.m25433o(24);
            int iMo5681h = zzevVar.mo5681h();
            iM12436m += iM25433o + iM25433o + iM25433o2 + g9a.m12436m(iMo5681h, iMo5681h, iM25433o3);
        }
        jjcVar.f45643d = iM12436m;
        return iM12436m;
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: e */
    public final void mo5561e(Object obj, byte[] bArr, int i, int i2, C0787av c0787av) {
        AbstractC0998i abstractC0998i = (AbstractC0998i) obj;
        if (abstractC0998i.zzc == jjc.f45639f) {
            abstractC0998i.zzc = jjc.m14504b();
        }
        throw g9a.m12430g(obj);
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: f */
    public final int mo5562f(AbstractC0998i abstractC0998i) {
        return abstractC0998i.zzc.hashCode();
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: g */
    public final void mo5563g(Object obj, Object obj2) {
        AbstractC1003n.m5594p(obj, obj2);
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: h */
    public final void mo5564h(Object obj, gw9 gw9Var) {
        throw g9a.m12430g(obj);
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: i */
    public final boolean mo5565i(AbstractC0998i abstractC0998i, AbstractC0998i abstractC0998i2) {
        return abstractC0998i.zzc.equals(abstractC0998i2.zzc);
    }
}
