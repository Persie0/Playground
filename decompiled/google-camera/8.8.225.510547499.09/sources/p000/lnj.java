package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lnj extends lku implements ljh, lnf {

    /* JADX INFO: renamed from: b */
    public final ohb f38750b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f38751c;

    /* JADX INFO: renamed from: d */
    public final liv f38752d;

    /* JADX INFO: renamed from: e */
    private final npv f38753e;

    public lnj(ljf ljfVar, npv npvVar, ohb ohbVar, oju ojuVar, liv livVar, byte[] bArr) {
        AtomicReference atomicReference = new AtomicReference();
        this.f38751c = atomicReference;
        this.f38753e = npvVar;
        this.f38750b = ohbVar;
        this.f38752d = livVar;
        ljfVar.m15526b(npvVar, new ohb() { // from class: lni
            @Override // p000.ohb
            public final Object get() {
                lng lngVarM15767c = lnh.m15767c();
                lngVarM15767c.m15766b(true);
                return lngVarM15767c.m15765a();
            }
        }, ojuVar);
        atomicReference.set(livVar.m15478a(1.0f));
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public final void mo15463ao() {
        kxk.m14968N(new lmg(this, 3), this.f38753e);
    }
}
