package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhm {

    /* JADX INFO: renamed from: a */
    public static final dhx f11136a;

    /* JADX INFO: renamed from: b */
    public static final dhx f11137b;

    /* JADX INFO: renamed from: c */
    public static final dhw f11138c;

    /* JADX INFO: renamed from: d */
    private static final mwx f11139d;

    static {
        mwt mwtVarM17115i = mwx.m17115i();
        mwtVarM17115i.mo17110e(0, new dhl(0.0f, 0.0f, 0.0f, 0.0f));
        mwtVarM17115i.mo17110e(1, new dhl(83.0f, 83.0f, 65.0f, 55.0f));
        mwtVarM17115i.mo17110e(2, new dhl(77.0f, 77.0f, 65.0f, 55.0f));
        mwtVarM17115i.mo17110e(3, new dhl(80.9f, 76.9f, 65.0f, 55.0f));
        mwtVarM17115i.mo17110e(4, new dhl(74.0f, 74.0f, 55.0f, 46.0f));
        mwtVarM17115i.mo17110e(5, new dhl(540.0f, 63.0f, 55.0f, 50.0f));
        mwtVarM17115i.mo17110e(6, new dhl(722.0f, 73.0f, 70.0f, 62.0f));
        mwtVarM17115i.mo17110e(7, new dhl(0.0f, 0.0f, 65.0f, 50.0f));
        mwtVarM17115i.mo17110e(8, new dhl(0.0f, 0.0f, 65.0f, 49.0f));
        mwtVarM17115i.mo17110e(9, new dhl(0.0f, 0.0f, 20.0f, 16.9f));
        mwtVarM17115i.mo17110e(10, new dhl(0.0f, 0.0f, 65.0f, 50.0f));
        mwtVarM17115i.mo17110e(11, new dhl(0.0f, 0.0f, 55.0f, 49.0f));
        mwtVarM17115i.mo17110e(12, new dhl(0.0f, 0.0f, 65.0f, 49.0f));
        mwtVarM17115i.mo17110e(13, new dhl(0.0f, 0.0f, 65.0f, 49.0f));
        f11139d = mwtVarM17115i.mo17059b();
        npa npaVar = new npa();
        npaVar.f44017b = "device_config";
        f11136a = npaVar.m17589l();
        npa npaVar2 = new npa();
        npaVar2.f44017b = "camera.cutout_trial_size";
        f11137b = npaVar2.m17589l();
        npa npaVar3 = new npa();
        npaVar3.f44017b = "camera.front_lens_indicator";
        f11138c = npaVar3.m17597t();
    }

    /* JADX INFO: renamed from: a */
    public static dhl m6166a(dhv dhvVar, int i) {
        lku.m15615J(i <= 13, "Invalid device enum: %s", i);
        dhl dhlVar = (dhl) f11139d.get(Integer.valueOf(i));
        int iIntValue = ((Integer) dhvVar.mo6173a(f11137b).get()).intValue();
        if (dhlVar == null || iIntValue == 0) {
            return dhlVar != null ? dhlVar : new dhl(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float f = iIntValue + 40.0f;
        return new dhl(dhlVar.f11132a, dhlVar.f11133b, f, f);
    }

    /* JADX INFO: renamed from: b */
    public static void m6167b(dhz dhzVar, kpb kpbVar) {
        dhzVar.mo6190q(f11137b, 0);
        dhzVar.mo6194u(f11138c, false);
        if (kpbVar.f36770c) {
            dhzVar.mo6190q(f11136a, 1);
            return;
        }
        if (kpbVar.f36772e) {
            dhzVar.mo6190q(f11136a, 2);
            return;
        }
        if (kpbVar.f36771d) {
            dhzVar.mo6190q(f11136a, 3);
            return;
        }
        if (kpbVar.f36773f) {
            dhzVar.mo6190q(f11136a, 4);
            return;
        }
        if (kpbVar.f36774g) {
            dhzVar.mo6190q(f11136a, 5);
            return;
        }
        if (kpbVar.f36775h) {
            dhzVar.mo6190q(f11136a, 6);
            return;
        }
        if (kpbVar.f36777j) {
            dhzVar.mo6190q(f11136a, 7);
            return;
        }
        if (kpbVar.f36780m) {
            dhzVar.mo6190q(f11136a, 8);
            return;
        }
        if (kpbVar.f36779l) {
            dhzVar.mo6190q(f11136a, 9);
            return;
        }
        if (kpbVar.f36781n) {
            dhzVar.mo6190q(f11136a, 10);
        } else if (kpbVar.f36782o) {
            dhzVar.mo6190q(f11136a, 11);
        } else {
            dhzVar.mo6190q(f11136a, 0);
        }
    }
}
