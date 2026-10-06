package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhf {

    /* JADX INFO: renamed from: a */
    public static final dhx f11040a;

    /* JADX INFO: renamed from: b */
    public static final dhw f11041b;

    /* JADX INFO: renamed from: c */
    public static final dhw f11042c;

    /* JADX INFO: renamed from: d */
    public static final dhw f11043d;

    /* JADX INFO: renamed from: e */
    public static final dhw f11044e;

    /* JADX INFO: renamed from: f */
    public static final dhw f11045f;

    static {
        npa npaVar = new npa();
        npaVar.f44017b = "camera.advice";
        f11041b = npaVar.m17594q();
        npa npaVar2 = new npa();
        npaVar2.f44017b = "camera.advice.dirtylens";
        f11042c = npaVar2.m17597t();
        npa npaVar3 = new npa();
        npaVar3.f44017b = "camera.advice.distance";
        f11043d = npaVar3.m17594q();
        npa npaVar4 = new npa();
        npaVar4.f44017b = "advice_total_exposure_threshold_front";
        f11044e = npaVar4.m17596s();
        npa npaVar5 = new npa();
        npaVar5.f44017b = "advice_total_exposure_threshold_rear";
        f11045f = npaVar5.m17596s();
        npa npaVar6 = new npa();
        npaVar6.f44017b = "dirty_lens_detector_timeout";
        f11040a = npaVar6.m17589l();
        new npa().f44017b = "camera.advice.dld_log";
        new npa().f44017b = "camera.advice.dld_fast";
        new npa().f44017b = "camera.advice.dld_v2";
        new npa().f44017b = "camera.advice.dld_frame_meta";
    }

    /* JADX INFO: renamed from: a */
    public static void m6150a(dhz dhzVar) {
        dhzVar.mo6191r(f11041b);
        dhzVar.mo6194u(f11042c, true);
        dhzVar.mo6191r(f11043d);
        dhw dhwVar = f11044e;
        Float fValueOf = Float.valueOf(Float.POSITIVE_INFINITY);
        dhzVar.mo6193t(dhwVar, fValueOf);
        dhzVar.mo6193t(f11045f, fValueOf);
        dhzVar.mo6190q(f11040a, 15000);
    }
}
