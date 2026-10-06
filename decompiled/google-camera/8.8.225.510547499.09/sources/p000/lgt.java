package p000;

import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lgt implements lgs {

    /* JADX INFO: renamed from: a */
    private static final nbh f38230a = nbh.m17259h("com/google/android/libraries/performance/primes/PrimesApiImpl");

    /* JADX INFO: renamed from: b */
    private final lha f38231b;

    /* JADX INFO: renamed from: c */
    private final oju f38232c;

    /* JADX INFO: renamed from: d */
    private final oju f38233d;

    /* JADX INFO: renamed from: e */
    private final oju f38234e;

    public lgt(lha lhaVar, oju ojuVar, oju ojuVar2, oju ojuVar3, mrm mrmVar, lhz lhzVar, byte[] bArr, byte[] bArr2) {
        this.f38231b = lhaVar;
        this.f38232c = ojuVar;
        this.f38233d = ojuVar2;
        this.f38234e = ojuVar3;
        if (!lij.m15455y() && !lhzVar.m15362c()) {
            throw new IllegalStateException("Primes init triggered from background in package: ".concat(String.valueOf(lhzVar.f38277a)));
        }
        if (((Boolean) mrmVar.mo16811e(Boolean.FALSE)).booleanValue()) {
            return;
        }
        try {
            WeakHashMap weakHashMap = moz.f41222a;
            Iterator it = ((ohm) ojuVar).get().iterator();
            while (it.hasNext()) {
                ((ljh) it.next()).mo15463ao();
            }
        } catch (RuntimeException e) {
            ((nbe) ((nbe) ((nbe) f38230a.m17252c()).mo17283h(e)).mo17276G((char) 4485)).mo17290o("Primes failed to initialize");
            this.f38231b.m15329a();
        }
    }

    @Override // p000.lgs
    /* JADX INFO: renamed from: a */
    public final void mo15322a() {
        ((ljw) this.f38233d.get()).mo15548e();
    }

    @Override // p000.lgs
    /* JADX INFO: renamed from: b */
    public final void mo15323b() {
        ((llq) this.f38234e.get()).m15710a();
    }
}
