package p000;

import java.util.Map;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class egf implements ego {

    /* JADX INFO: renamed from: a */
    public static final nbh f13912a = nbh.m17259h("com/google/android/apps/camera/hdrplus/fusion/FusionDetectorImpl");

    /* JADX INFO: renamed from: b */
    private final jwn f13913b;

    /* JADX INFO: renamed from: c */
    private final jwn f13914c;

    /* JADX INFO: renamed from: d */
    private final dhv f13915d;

    /* JADX INFO: renamed from: e */
    private final jww f13916e;

    /* JADX INFO: renamed from: f */
    private final jwn f13917f;

    /* JADX INFO: renamed from: g */
    private final Optional f13918g;

    /* JADX INFO: renamed from: h */
    private final Optional f13919h;

    /* JADX INFO: renamed from: i */
    private final Optional f13920i;

    /* JADX INFO: renamed from: j */
    private final Optional f13921j;

    /* JADX INFO: renamed from: k */
    private final String f13922k;

    /* JADX INFO: renamed from: l */
    private final String f13923l;

    /* JADX INFO: renamed from: m */
    private final String f13924m;

    /* JADX INFO: renamed from: n */
    private final boolean f13925n;

    /* JADX INFO: renamed from: o */
    private final Map f13926o = new ege();

    /* JADX INFO: renamed from: p */
    private final Map f13927p = new ege();

    public egf(jwn jwnVar, jwn jwnVar2, Map map, jww jwwVar, jwn jwnVar3, fnm fnmVar, dhv dhvVar) {
        this.f13913b = jwnVar;
        this.f13914c = jwnVar2;
        this.f13915d = dhvVar;
        kgg kggVar = (kgg) map.get(gnf.RAW_WIDE_ZOOM_UPPER);
        this.f13922k = kggVar != null ? kggVar.mo14193c().f36540a : null;
        kgg kggVar2 = (kgg) map.get(gnf.RAW_WIDE_UPPER);
        this.f13923l = kggVar2 != null ? kggVar2.mo14193c().f36540a : null;
        kgg kggVar3 = (kgg) map.get(gnf.RAW_TELE);
        this.f13924m = kggVar3 != null ? kggVar3.mo14193c().f36540a : null;
        this.f13916e = jwwVar;
        this.f13917f = jwnVar3;
        this.f13918g = fnmVar.f22790a;
        this.f13919h = fnmVar.f22791b;
        this.f13920i = fnmVar.f22792c;
        this.f13921j = fnmVar.f22793d;
        this.f13925n = dhvVar.mo6184l(dht.f11168A);
        dhvVar.mo6178f();
    }

    /* JADX INFO: renamed from: b */
    private static final void m7293b(kpp kppVar) {
        kppVar.mo9515b();
        kppVar.mo9518e();
    }

    @Override // p000.ego
    /* JADX INFO: renamed from: a */
    public final egm mo7294a(kpp kppVar, boolean z) {
        egn egnVar;
        kppVar.mo9518e();
        m7293b(kppVar);
        if (!((Boolean) this.f13913b.mo3831be()).booleanValue() && !((Boolean) this.f13914c.mo3831be()).booleanValue()) {
            m7293b(kppVar);
            return egm.m7309a(egl.NONE, egn.NOT_AVAILABLE);
        }
        egl eglVar = egl.ZOOM;
        if (((Boolean) this.f13914c.mo3831be()).booleanValue()) {
            if (this.f13925n) {
                String.format("FusionZoom: expecting physical results from [(%s | %s), %s], got %s", this.f13923l, this.f13922k, this.f13924m, ((mwx) kppVar.mo9520g()).keySet());
                m7293b(kppVar);
            }
            egnVar = (egn) this.f13927p.remove(Long.valueOf(kppVar.mo9515b()));
            if (egnVar == null) {
                float fFloatValue = ((Float) this.f13916e.mo3831be()).floatValue();
                float fFloatValue2 = ((Float) this.f13915d.mo6180h(dht.f11193u).orElse(Float.valueOf(2.45f))).floatValue();
                float fFloatValue3 = ((Float) this.f13915d.mo6180h(dht.f11194v).orElse(Float.valueOf(4.9f))).floatValue();
                if (fFloatValue < fFloatValue2 || fFloatValue > fFloatValue3) {
                    egnVar = egn.NOT_REQUESTED;
                } else if (!kppVar.mo9520g().containsKey(this.f13923l) && !kppVar.mo9520g().containsKey(this.f13922k)) {
                    egnVar = egn.NOT_REQUESTED;
                } else if (!((Boolean) this.f13917f.mo3831be()).booleanValue()) {
                    egnVar = egn.THROTTLED;
                } else if (kppVar.mo9520g().containsKey(this.f13924m)) {
                    m7293b(kppVar);
                    egnVar = egn.ENABLED;
                } else {
                    egnVar = egn.NOT_REQUESTED;
                }
            }
        } else {
            egnVar = egn.NOT_AVAILABLE;
        }
        if (egnVar == egn.NOT_REQUESTED || egnVar == egn.NOT_AVAILABLE) {
            eglVar = egl.DEBLUR;
            if (!((Boolean) this.f13913b.mo3831be()).booleanValue()) {
                m7293b(kppVar);
                egnVar = egn.NOT_AVAILABLE;
            } else if (this.f13915d.mo6184l(dht.f11184l)) {
                egnVar = egn.ENABLED;
            } else if (this.f13915d.mo6184l(dht.f11177e) && ((Boolean) this.f13921j.map(new cwp(kppVar, 10)).map(cqk.f8934u).orElse(false)).booleanValue()) {
                m7293b(kppVar);
                egnVar = egn.ENABLED;
            } else {
                int i = 8;
                if (((Boolean) this.f13918g.map(new cwp(kppVar, i)).orElse(false)).booleanValue()) {
                    m7293b(kppVar);
                    egnVar = egn.ENABLED;
                } else {
                    int iIntValue = ((Integer) this.f13919h.map(new cwp(kppVar, 9)).orElse(0)).intValue();
                    if (iIntValue == 0) {
                        m7293b(kppVar);
                        egnVar = egn.NOT_REQUESTED;
                    } else if (iIntValue == 2) {
                        m7293b(kppVar);
                        egnVar = egn.DISABLED;
                    } else if (((Boolean) this.f13920i.map(new cwp(kppVar, i)).orElse(false)).booleanValue()) {
                        m7293b(kppVar);
                        egnVar = egn.ENABLED;
                    } else {
                        m7293b(kppVar);
                        egnVar = (egn) this.f13926o.remove(Long.valueOf(kppVar.mo9515b()));
                        if (egnVar == null) {
                            egnVar = egn.DISABLED;
                        }
                    }
                }
            }
        }
        if (z && eglVar == egl.ZOOM) {
            this.f13927p.put(Long.valueOf(kppVar.mo9515b()), egnVar);
        }
        if (egnVar == egn.ENABLED || (egnVar == egn.THROTTLED && eglVar == egl.ZOOM)) {
            return egm.m7309a(eglVar, egnVar);
        }
        if (this.f13925n && eglVar == egl.ZOOM && ((Float) this.f13916e.mo3831be()).floatValue() > ((Float) this.f13915d.mo6180h(dht.f11193u).get()).floatValue()) {
            lku.m15607B(egnVar == egn.ENABLED, "Failed to engage Fusion Zoom at %sx zoom", ((Float) this.f13916e.mo3831be()).toString());
        }
        return egm.m7309a(egl.NONE, egnVar);
    }
}
