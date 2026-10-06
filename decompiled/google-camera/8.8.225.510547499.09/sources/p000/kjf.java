package p000;

import android.os.Handler;
import android.view.Surface;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kjf implements kjn {

    /* JADX INFO: renamed from: a */
    public final kkk f36253a;

    /* JADX INFO: renamed from: b */
    public final kbo f36254b;

    /* JADX INFO: renamed from: c */
    public final kbz f36255c;

    /* JADX INFO: renamed from: d */
    private final kkz f36256d;

    public kjf(kkz kkzVar, kkk kkkVar, kbo kboVar, kbz kbzVar) {
        this.f36256d = kkzVar;
        this.f36253a = kkkVar;
        this.f36254b = kboVar.mo6314a("HfrCCSOpener");
        this.f36255c = kbzVar;
    }

    @Override // p000.kjn
    /* JADX INFO: renamed from: d */
    public final void mo14373d(kpj kpjVar, kjo kjoVar, jvb jvbVar, Handler handler) {
        lku.m15670x(this.f36256d.f36449b.isEmpty(), "Cannot create a ConstrainedHighSpeedCaptureSession with buffered streams!");
        lku.m15670x(!this.f36256d.f36450c.isEmpty(), "Cannot create a ConstrainedHighSpeedCaptureSession without streams!");
        lku.m15670x(this.f36256d.f36450c.size() <= 2, YmzeHXaMYOLk.PMmq);
        ArrayList arrayList = new ArrayList();
        mws mwsVarM17103r = mws.m17103r(kjv.f36311a, this.f36256d.f36450c);
        int i = ((mzr) mwsVarM17103r).f41859c;
        for (int i2 = 0; i2 < i; i2++) {
            kkr kkrVar = (kkr) mwsVarM17103r.get(i2);
            Surface surfaceMo14452g = kkrVar.mo14452g();
            if (surfaceMo14452g != null) {
                arrayList.add(kxk.m14965K(surfaceMo14452g));
            } else {
                final nqf nqfVarM17621g = nqf.m17621g();
                nqfVarM17621g.mo2282d(new jzq(kkrVar.f36403a.mo3830a(new kbg() { // from class: kjd
                    @Override // p000.kbg
                    /* JADX INFO: renamed from: bf */
                    public final void mo3415bf(Object obj) {
                        nqf nqfVar = nqfVarM17621g;
                        mrm mrmVar = (mrm) obj;
                        if (mrmVar.mo16813g()) {
                            nqfVar.mo14894e((Surface) mrmVar.mo16809c());
                        }
                    }
                }, not.INSTANCE), 10), not.INSTANCE);
                arrayList.add(nqfVarM17621g);
            }
        }
        lku.m15670x(!arrayList.isEmpty(), "Surface cannot be null");
        lku.m15670x(arrayList.size() <= 2, "No more than two surfaces can be accepted");
        kxk.m14975U(kxk.m14961G(arrayList), new kje(this, kjoVar, kpjVar, handler, jvbVar), not.INSTANCE);
    }
}
