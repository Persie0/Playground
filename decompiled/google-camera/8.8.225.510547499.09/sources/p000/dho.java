package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dho {

    /* JADX INFO: renamed from: a */
    public static final dhw f11141a;

    /* JADX INFO: renamed from: b */
    public static final dhw f11142b;

    /* JADX INFO: renamed from: c */
    public static final dhw f11143c;

    static {
        npa npaVar = new npa();
        npaVar.f44017b = "camera.dualev.singleKnob";
        f11141a = npaVar.m17597t();
        npa npaVar2 = new npa();
        npaVar2.f44017b = "camera.dualev.nightFactor";
        f11142b = npaVar2.m17595r();
        npa npaVar3 = new npa();
        npaVar3.f44017b = "camera.dualev.limitUltrawide";
        f11143c = npaVar3.m17597t();
    }

    /* JADX INFO: renamed from: a */
    public static void m6168a(dhz dhzVar) {
        dhzVar.mo6194u(f11141a, false);
        dhzVar.mo6192s(f11142b, true);
        dhzVar.mo6194u(f11143c, false);
    }
}
