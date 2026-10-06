package p000;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ipi implements ipq {

    /* JADX INFO: renamed from: a */
    public static final nbh f31729a = nbh.m17259h("com/google/android/apps/camera/viewfindereffects/ViewfinderEffectsRunner");

    /* JADX INFO: renamed from: b */
    public final CameraActivityTiming f31730b;

    /* JADX INFO: renamed from: c */
    private final Set f31731c;

    /* JADX INFO: renamed from: d */
    private final dhv f31732d;

    /* JADX INFO: renamed from: e */
    private final kbz f31733e;

    /* JADX INFO: renamed from: f */
    private final Executor f31734f;

    /* JADX INFO: renamed from: g */
    private final dbr f31735g;

    /* JADX INFO: renamed from: h */
    private final jwn f31736h;

    public ipi(Set set, dhv dhvVar, kbz kbzVar, Executor executor, CameraActivityTiming cameraActivityTiming, dbr dbrVar, jwn jwnVar) {
        this.f31731c = set;
        this.f31732d = dhvVar;
        this.f31733e = kbzVar;
        this.f31734f = executor;
        this.f31730b = cameraActivityTiming;
        this.f31735g = dbrVar;
        this.f31736h = jwnVar;
    }

    @Override // p000.ipq
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ipp mo11593a() {
        Executor executor = this.f31734f;
        dbr dbrVar = this.f31735g;
        jwn jwnVar = this.f31736h;
        kbz kbzVar = this.f31733e;
        dhv dhvVar = this.f31732d;
        lby lbyVarM16231j = lzd.m16231j(lzd.m16232k(leb.f38016a, EArqVBjecl.OZnI));
        lbyVarM16231j.execute(hde.f27310l);
        boolean zMo6184l = dhvVar.mo6184l(dib.f11242aB);
        ((Integer) dhvVar.mo6173a(dib.f11380v).orElse(0)).intValue();
        ((Integer) dhvVar.mo6173a(dib.f11379u).orElse(0)).intValue();
        ipg ipgVar = new ipg(executor, lbyVarM16231j, dbrVar, jwnVar, kbzVar, zMo6184l);
        jvh.m13562j(ipgVar.f31702f, new gjd(this, 13), not.INSTANCE);
        Set set = this.f31731c;
        iph iphVar = new iph(set, ipgVar, this.f31733e);
        iphVar.m11591b();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            iphVar.f31722a.add(jwj.m13624c(((ipn) it.next()).f31752b).mo3830a(new ijp(iphVar, 5), not.INSTANCE));
        }
        return iphVar;
    }
}
