package p000;

import android.view.Surface;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eim {

    /* JADX INFO: renamed from: p */
    private static final nbh f14149p = nbh.m17259h("com/google/android/apps/camera/imax/ImaxFrameServer");

    /* JADX INFO: renamed from: a */
    public final kbz f14150a;

    /* JADX INFO: renamed from: b */
    public final kbo f14151b;

    /* JADX INFO: renamed from: c */
    public final eka f14152c;

    /* JADX INFO: renamed from: d */
    public final ekd f14153d;

    /* JADX INFO: renamed from: e */
    public final jvd f14154e;

    /* JADX INFO: renamed from: g */
    public final cgb f14156g;

    /* JADX INFO: renamed from: h */
    public kfk f14157h;

    /* JADX INFO: renamed from: i */
    public Surface f14158i;

    /* JADX INFO: renamed from: j */
    public kgg f14159j;

    /* JADX INFO: renamed from: k */
    public kfc f14160k;

    /* JADX INFO: renamed from: l */
    public eil f14161l;

    /* JADX INFO: renamed from: m */
    public kfb f14162m;

    /* JADX INFO: renamed from: o */
    public final khy f14164o;

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f14163n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final jwf f14155f = new jwf(false);

    public eim(khy khyVar, kbo kboVar, kbz kbzVar, eka ekaVar, ekd ekdVar, jvd jvdVar, cgb cgbVar) {
        this.f14164o = khyVar;
        this.f14150a = kbzVar;
        this.f14152c = ekaVar;
        this.f14153d = ekdVar;
        this.f14154e = jvdVar;
        this.f14151b = kboVar.mo6314a("ImaxFrameServer");
        this.f14156g = cgbVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m7360a(boolean z) {
        if (!z) {
            try {
                kfk kfkVar = this.f14157h;
                kfkVar.getClass();
                kfkVar.mo14126m(true, true, true);
                return;
            } catch (Exception e) {
                ((nbe) ((nbe) ((nbe) f14149p.m17251b()).mo17283h(e)).mo17276G((char) 1494)).mo17290o("Panorama failed to unlock 3A.");
                return;
            }
        }
        try {
            kfk kfkVar2 = this.f14157h;
            kfkVar2.getClass();
            kfkVar2.mo14136w(true);
        } catch (Exception e2) {
            ((nbe) ((nbe) ((nbe) f14149p.m17251b()).mo17283h(e2)).mo17276G((char) 1496)).mo17290o(KMNlNMe.nTvzjFba);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7361b() {
        return ((Boolean) this.f14155f.f34942d).booleanValue();
    }
}
