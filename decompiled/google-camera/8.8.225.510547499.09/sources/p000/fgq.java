package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgq implements kpy {

    /* JADX INFO: renamed from: a */
    private final fgy f21930a;

    /* JADX INFO: renamed from: b */
    private final fgh f21931b;

    public fgq(fgy fgyVar, fgh fghVar) {
        this.f21930a = fgyVar;
        this.f21931b = fghVar;
    }

    @Override // p000.kpy
    /* JADX INFO: renamed from: ca */
    public final void mo8395ca() {
        long jMo8326a = this.f21930a.mo8326a();
        if (jMo8326a >= 0) {
            fgh fghVar = this.f21931b;
            synchronized (fghVar.f21853e) {
                long jConvert = TimeUnit.MICROSECONDS.convert(jMo8326a, TimeUnit.NANOSECONDS);
                if (jConvert < fghVar.f21868t) {
                    ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17276G(2229)).mo17297v("Out of order timestamp %d came after %d", jConvert, fghVar.f21868t);
                }
                fghVar.f21868t = Math.max(fghVar.f21868t, jConvert);
                if (fghVar.f21869u.isEmpty()) {
                    fghVar.f21858j.mo8422a(fghVar.f21868t - 1500000);
                }
            }
        }
    }
}
