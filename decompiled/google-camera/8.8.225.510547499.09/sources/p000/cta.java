package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.provider.Settings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cta implements csx, fbp, fbo {

    /* JADX INFO: renamed from: a */
    public final csv f9407a;

    /* JADX INFO: renamed from: b */
    ContentObserver f9408b;

    /* JADX INFO: renamed from: c */
    boolean f9409c;

    /* JADX INFO: renamed from: d */
    boolean f9410d;

    /* JADX INFO: renamed from: e */
    public boolean f9411e;

    /* JADX INFO: renamed from: f */
    private final cuh f9412f;

    /* JADX INFO: renamed from: g */
    private final kpb f9413g;

    /* JADX INFO: renamed from: h */
    private final Object f9414h = new Object();

    /* JADX INFO: renamed from: i */
    private csz f9415i = csz.UNINITIALIZED;

    /* JADX INFO: renamed from: j */
    private final fws f9416j;

    /* JADX INFO: renamed from: k */
    private final jfs f9417k;

    public cta(fan fanVar, fws fwsVar, cuh cuhVar, kpb kpbVar, csv csvVar, jvd jvdVar, jfs jfsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f9416j = fwsVar;
        this.f9412f = cuhVar;
        this.f9413g = kpbVar;
        this.f9407a = csvVar;
        this.f9417k = jfsVar;
        jvdVar.m13541c(new cgl(this, fanVar, 17));
    }

    @Override // p000.csx
    /* JADX INFO: renamed from: a */
    public final mrm mo5483a() {
        mrm mrmVarM16829i;
        synchronized (this.f9414h) {
            nxl nxlVarM18137O = nmg.f43777e.m18137O();
            boolean zEquals = this.f9415i.equals(csz.STARTED);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            nmg nmgVar = (nmg) nxqVar;
            nmgVar.f43779a |= 1;
            nmgVar.f43780b = zEquals;
            boolean z = this.f9410d;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar2 = nxlVarM18137O.f44974b;
            nmg nmgVar2 = (nmg) nxqVar2;
            nmgVar2.f43779a |= 2;
            nmgVar2.f43781c = z;
            boolean z2 = this.f9411e;
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmg nmgVar3 = (nmg) nxlVarM18137O.f44974b;
            nmgVar3.f43779a |= 4;
            nmgVar3.f43782d = z2;
            mrmVarM16829i = mrm.m16829i((nmg) nxlVarM18137O.mo18103l());
        }
        return mrmVarM16829i;
    }

    @Override // p000.csx
    /* JADX INFO: renamed from: b */
    public final void mo5484b(csn csnVar) {
        synchronized (this.f9414h) {
            boolean z = false;
            if (!this.f9417k.m13112v()) {
                if (csnVar.f9339d.m13663d() && csnVar.f9338c.equals(jxn.FPS_60)) {
                    z = true;
                } else if (csnVar.f9339d.m13662c() && csnVar.f9338c.equals(jxn.FPS_60)) {
                    z = true;
                }
            }
            this.f9409c = z;
            cuh cuhVar = this.f9412f;
            cuhVar.getClass();
            this.f9408b = new csy(this, cuhVar.m5525a());
            this.f9415i = csz.INITIALIZED;
        }
    }

    @Override // p000.csx
    /* JADX INFO: renamed from: c */
    public final void mo5485c(boolean z) {
        this.f9411e = z;
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        this.f9410d = false;
    }

    @Override // p000.csx
    /* JADX INFO: renamed from: f */
    public final void mo5487f() {
        synchronized (this.f9414h) {
            if (this.f9415i.equals(csz.STARTED)) {
                this.f9407a.m5478b();
                ContentObserver contentObserver = this.f9408b;
                if (contentObserver != null) {
                    ((ContentResolver) this.f9416j.f23766c).unregisterContentObserver(contentObserver);
                }
                this.f9415i = csz.STOPPED;
            }
        }
    }

    @Override // p000.csx
    /* JADX INFO: renamed from: d */
    public final void mo5486d() {
        if (this.f9411e || (this.f9409c && !this.f9410d)) {
            kpb kpbVar = this.f9413g;
            if (kpbVar.f36772e || kpbVar.f36771d || kpbVar.f36773f || this.f9407a.m5477a() <= 158) {
                synchronized (this.f9414h) {
                    boolean z = this.f9415i.equals(csz.INITIALIZED) || this.f9415i.equals(csz.STOPPED);
                    lku.m15616K(z, "Cannot start from %s", this.f9415i);
                    this.f9407a.m5480d(2, true);
                    if (this.f9408b != null) {
                        ((ContentResolver) this.f9416j.f23766c).registerContentObserver(Settings.System.getUriFor("screen_brightness"), false, this.f9408b);
                    }
                    this.f9415i = csz.STARTED;
                }
            }
        }
    }
}
