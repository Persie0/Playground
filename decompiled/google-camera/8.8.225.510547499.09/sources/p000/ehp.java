package p000;

import android.hardware.HardwareBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ehp implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eez f14059a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f14060b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ehq f14061c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ hcu f14062d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ ihk f14063e;

    public ehp(ehq ehqVar, hcu hcuVar, eez eezVar, long j, ihk ihkVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14061c = ehqVar;
        this.f14062d = hcuVar;
        this.f14059a = eezVar;
        this.f14060b = j;
        this.f14063e = ihkVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        this.f14062d.close();
        this.f14061c.m7329f(this.f14060b, mqu.f41450a);
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        fxt fxtVar = (fxt) obj;
        this.f14061c.f14066c |= fxtVar != null;
        this.f14062d.close();
        if (fxtVar == null) {
            ((nbe) ((nbe) ehr.f14086b.m17251b()).mo17276G(1465)).mo17293r("Error encoding the image: %s", this.f14059a);
            this.f14061c.m7329f(this.f14060b, mqu.f41450a);
            return;
        }
        if (this.f14059a == eez.PRIMARY) {
            this.f14061c.f14064a.mo9905k().mo10402d(fxtVar.f23818b.length);
            mrm mrmVar = (mrm) this.f14063e.f30966a;
            if (mrmVar.mo16813g()) {
                ((HardwareBuffer) mrmVar.mo16809c()).close();
            }
        }
        nbh nbhVar = ehr.f14086b;
        this.f14061c.m7329f(this.f14060b, mrm.m16829i(fxtVar.f23820d));
    }
}
