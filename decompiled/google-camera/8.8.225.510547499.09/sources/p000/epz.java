package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.googlex.gcam.Gcam;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epz {

    /* JADX INFO: renamed from: a */
    public static final nbh f15068a = nbh.m17259h(WIxTIdUIdfb.beveBlxCI);

    /* JADX INFO: renamed from: b */
    public final epy f15069b;

    /* JADX INFO: renamed from: c */
    public final eqc f15070c;

    /* JADX INFO: renamed from: d */
    public final jwf f15071d;

    /* JADX INFO: renamed from: e */
    public final kbz f15072e;

    /* JADX INFO: renamed from: f */
    public final eqm f15073f;

    /* JADX INFO: renamed from: g */
    public final float f15074g;

    /* JADX INFO: renamed from: h */
    public final int f15075h;

    /* JADX INFO: renamed from: j */
    private final Map f15077j;

    /* JADX INFO: renamed from: k */
    private final jwn f15078k;

    /* JADX INFO: renamed from: l */
    private final ecq f15079l;

    /* JADX INFO: renamed from: m */
    private final Gcam f15080m;

    /* JADX INFO: renamed from: n */
    private final Executor f15081n;

    /* JADX INFO: renamed from: o */
    private final jvb f15082o;

    /* JADX INFO: renamed from: p */
    private final jwn f15083p;

    /* JADX INFO: renamed from: i */
    public final Map f15076i = new HashMap();

    /* JADX INFO: renamed from: q */
    private final AtomicBoolean f15084q = new AtomicBoolean(false);

    public epz(epy epyVar, eqc eqcVar, Executor executor, jwf jwfVar, Map map, jwn jwnVar, ecq ecqVar, Gcam gcam, kbz kbzVar, dhv dhvVar, eqm eqmVar, hah hahVar, jvb jvbVar) {
        this.f15069b = epyVar;
        this.f15070c = eqcVar;
        this.f15081n = executor;
        this.f15071d = jwfVar;
        this.f15077j = map;
        this.f15078k = jwnVar;
        this.f15079l = ecqVar;
        this.f15080m = gcam;
        this.f15072e = kbzVar;
        this.f15073f = eqmVar;
        this.f15082o = jvbVar;
        this.f15083p = jwr.m13640j(hahVar.mo10029a(gzy.f27033aq), new ceg(dhvVar, 20));
        this.f15074g = ((Integer) dhvVar.mo6173a(dik.f11604b).orElse(7)).intValue();
        this.f15075h = ((Integer) dhvVar.mo6173a(dik.f11605c).orElse(16)).intValue();
        dhvVar.mo6179g();
        dhvVar.mo6177e();
    }

    /* JADX INFO: renamed from: a */
    public final void m7668a() {
        if (this.f15084q.getAndSet(true)) {
            return;
        }
        for (Map.Entry entry : this.f15077j.entrySet()) {
            if (gnf.f25715q.contains((gnf) entry.getKey())) {
                kmg kmgVar = (kmg) entry.getValue();
                try {
                    this.f15076i.put(kmgVar.f36540a, this.f15080m.m4972b(this.f15079l.mo7134a(kmgVar)));
                } catch (IllegalStateException e) {
                    ((nbe) ((nbe) f15068a.m17252c()).mo17276G((char) 1767)).mo17293r("Invalid camera ID: %s.", kmgVar);
                }
            }
        }
        this.f15082o.m13537d(jwr.m13632b(this.f15083p, this.f15078k).mo3830a(new dsu(this, 11), this.f15081n));
    }
}
