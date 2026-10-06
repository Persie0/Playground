package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grn extends grg {

    /* JADX INFO: renamed from: e */
    public static final nbh f26164e = nbh.m17259h("com/google/android/apps/camera/processing/imagebackend/LuckyShotImageFilter");

    /* JADX INFO: renamed from: f */
    public final fct f26165f;

    /* JADX INFO: renamed from: g */
    private final mrm f26166g;

    /* JADX INFO: renamed from: h */
    private grm f26167h;

    /* JADX INFO: renamed from: i */
    private double f26168i;

    public grn(gre greVar, hrl hrlVar, mrm mrmVar, fct fctVar, byte[] bArr) {
        super(greVar, hrlVar, null);
        this.f26167h = null;
        this.f26168i = 0.0d;
        this.f26166g = mrmVar;
        this.f26165f = fctVar;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [fzt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [fzt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [fzt, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m9674c(Set set, gyh gyhVar) {
        fya fyaVar;
        hkb hkbVar;
        ArrayList arrayList;
        if (set.isEmpty()) {
            ((nbe) ((nbe) f26164e.m17252c()).mo17276G(3213)).mo17291p("Filtered Image future failed to return a single image. There are %d images.  No Image produced.", set.size());
            return;
        }
        if (set.size() > 1) {
            ((nbe) ((nbe) f26164e.m17251b()).mo17276G(3212)).mo17291p("Filtered Image return multiple images. There are %d images.  No Image produced.", set.size());
            throw new IllegalStateException("Lucky Shot Filter returned multiple images.");
        }
        this.f26165f.f21286e = SystemClock.elapsedRealtimeNanos();
        hjy hjyVarMo9905k = gyhVar.mo9905k();
        if (hjyVarMo9905k == null || (hkbVar = ((hjz) hjyVarMo9905k).f28084j) == null) {
            fyaVar = (fya) ((mrq) this.f26166g).f41482a;
            grm grmVar = (grm) set.iterator().next();
            ((hjz) gyhVar.mo9905k()).f28083i = this.f26165f;
            ((fyb) fyaVar.f23858b).f23859a.f23867a.mo13946h("finish lucky shot selection, pass to the piped image saver");
            try {
                ?? r6 = fyaVar.f23857a;
                kpw kpwVar = grmVar.f26152a;
                nps npsVar = grmVar.f26154c;
                npsVar.getClass();
                r6.mo3602a(kpwVar, npsVar);
                fyaVar.f23857a.close();
                return;
            } catch (Throwable th) {
                fyaVar.f23857a.close();
                throw th;
            }
        }
        fct fctVar = this.f26165f;
        hkbVar.f28106d = fctVar.f21285d;
        hkbVar.f28107e = fctVar.f21286e;
        synchronized (fctVar.f21282a) {
            List list = fctVar.f21287f;
            arrayList = list != null ? new ArrayList(list) : null;
        }
        hkbVar.f28108f = arrayList;
        fyaVar = (fya) ((mrq) this.f26166g).f41482a;
        grm grmVar2 = (grm) set.iterator().next();
        ((hjz) gyhVar.mo9905k()).f28083i = this.f26165f;
        ((fyb) fyaVar.f23858b).f23859a.f23867a.mo13946h("finish lucky shot selection, pass to the piped image saver");
        ?? r7 = fyaVar.f23857a;
        kpw kpwVar2 = grmVar2.f26152a;
        nps npsVar2 = grmVar2.f26154c;
        npsVar2.getClass();
        r7.mo3602a(kpwVar2, npsVar2);
        fyaVar.f23857a.close();
        return;
        throw th;
    }

    @Override // p000.grg, p000.grf, p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        SystemClock.elapsedRealtimeNanos();
        super.close();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized grm m9675d(grm grmVar, double d) {
        grm grmVar2 = this.f26167h;
        if (grmVar2 != null && d <= this.f26168i) {
            return grmVar;
        }
        this.f26167h = grmVar;
        this.f26168i = d;
        return grmVar2;
    }
}
