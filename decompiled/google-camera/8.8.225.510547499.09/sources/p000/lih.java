package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lih {

    /* JADX INFO: renamed from: a */
    public int f38303a;

    /* JADX INFO: renamed from: b */
    public Object f38304b;

    public lih() {
    }

    public lih(byte[] bArr) {
        this.f38303a = 1;
    }

    /* JADX INFO: renamed from: a */
    public final lii m15384a() {
        Object obj;
        int i = this.f38303a;
        if (i != 0 && (obj = this.f38304b) != null) {
            return new lii(i, (lig) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38303a == 0) {
            sb.append(" enablement");
        }
        if (this.f38304b == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m15385b(boolean z) {
        this.f38303a = true != z ? 2 : 3;
    }

    /* JADX INFO: renamed from: c */
    public final void m15386c(int i) {
        this.f38303a = i;
        Object obj = this.f38304b;
        if (obj != null) {
            switch (i - 1) {
                case 2:
                    ((hcd) obj).m10100a();
                    break;
                case 3:
                    hcd hcdVar = (hcd) obj;
                    hcdVar.f27230b.m13541c(new gxw(hcdVar, 3));
                    hcdVar.f27232d.f38304b = null;
                    hcdVar.f27231c.mo14894e(true);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m15387d() {
        boolean z = true;
        if (this.f38303a != 1) {
            z = false;
        }
        lku.m15613H(z);
        this.f38303a = 4;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m15388e() {
        boolean z = true;
        if (this.f38303a != 1) {
            z = false;
        }
        lku.m15613H(z);
        this.f38303a = 3;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m15389f(mws mwsVar) {
        this.f38304b = mwsVar;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m15390g() {
        boolean z = true;
        if (this.f38303a != 1) {
            z = false;
        }
        lku.m15613H(z);
        this.f38303a = 2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final synchronized void m15391h(nxl nxlVar) {
        ?? r0 = this.f38304b;
        if (r0 != 0) {
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nkm nkmVar = (nkm) nxlVar.f44974b;
            nkm nkmVar2 = nkm.f43229n;
            nkmVar.f43239i = nzg.f45063b;
            for (int i = 0; i < r0.size(); i++) {
                nxl nxlVarM18137O = nkp.f43258c.m18137O();
                Long l = (Long) r0.get(i);
                l.getClass();
                int iLongValue = (int) l.longValue();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nkp nkpVar = (nkp) nxlVarM18137O.f44974b;
                nkpVar.f43260a |= 1;
                nkpVar.f43261b = iLongValue;
                nkp nkpVar2 = (nkp) nxlVarM18137O.mo18103l();
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nkm nkmVar3 = (nkm) nxlVar.f44974b;
                nkpVar2.getClass();
                nxy nxyVar = nkmVar3.f43239i;
                if (!nxyVar.mo17770c()) {
                    nkmVar3.f43239i = nxq.m18127U(nxyVar);
                }
                nkmVar3.f43239i.add(nkpVar2);
            }
        }
        int i2 = this.f38303a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nkm nkmVar4 = (nkm) nxlVar.f44974b;
        nkm nkmVar5 = nkm.f43229n;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        nkmVar4.f43241k = i3;
        nkmVar4.f43231a |= 256;
    }
}
