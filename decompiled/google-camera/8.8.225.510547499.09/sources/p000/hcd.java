package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcd implements hce {

    /* JADX INFO: renamed from: a */
    public final oju f27229a;

    /* JADX INFO: renamed from: b */
    public final jvd f27230b;

    /* JADX INFO: renamed from: c */
    public final nqf f27231c = nqf.m17621g();

    /* JADX INFO: renamed from: d */
    public final lih f27232d;

    /* JADX INFO: renamed from: e */
    private final oju f27233e;

    /* JADX INFO: renamed from: f */
    private final oju f27234f;

    public hcd(lih lihVar, oju ojuVar, oju ojuVar2, oju ojuVar3, jvd jvdVar, byte[] bArr) {
        this.f27232d = lihVar;
        this.f27229a = ojuVar;
        this.f27233e = ojuVar2;
        this.f27234f = ojuVar3;
        this.f27230b = jvdVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10100a() {
        hca hcaVar = (hca) this.f27234f.get();
        ksa ksaVar = hcaVar.f27218a;
        hcaVar.f27223f = SystemClock.elapsedRealtime();
        this.f27230b.m13541c(new gxw(this, 4));
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        return dez.m6039i(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        int i = this.f27232d.f38303a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                hbz hbzVar = (hbz) this.f27233e.get();
                if (hbzVar.m10097b()) {
                    if (hbzVar.f27210c > ((Long) hbzVar.f27208a.mo10031c(gzy.f27026aj)).longValue()) {
                        hbzVar.f27209b.mo10032d(gzy.f27027ak);
                        this.f27232d.f38304b = this;
                        hbzVar.m10096a();
                        return this.f27231c;
                    }
                }
                return kxk.m14965K(true);
            case 1:
                this.f27232d.f38304b = this;
                return this.f27231c;
            case 2:
                m10100a();
                this.f27232d.f38304b = this;
                return this.f27231c;
            default:
                return kxk.m14965K(true);
        }
    }
}
