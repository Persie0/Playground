package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyb {

    /* JADX INFO: renamed from: a */
    public static final oxz f46804a = new oxz("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    private static final onm f46805b = olx.f46278g;

    /* JADX INFO: renamed from: c */
    private static final onm f46806c = olx.f46279h;

    /* JADX INFO: renamed from: d */
    private static final onm f46807d = olx.f46280i;

    /* JADX INFO: renamed from: a */
    public static final Object m19164a(oly olyVar) {
        olyVar.getClass();
        Object objFold = olyVar.fold(0, f46805b);
        objFold.getClass();
        return objFold;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m19165b(oly olyVar, Object obj) {
        olyVar.getClass();
        if (obj == null) {
            obj = m19164a(olyVar);
        }
        if (obj == 0) {
            return f46804a;
        }
        return obj instanceof Integer ? olyVar.fold(new oyg(olyVar, ((Number) obj).intValue()), f46807d) : ((osr) obj).mo18918cK(olyVar);
    }

    /* JADX INFO: renamed from: c */
    public static final void m19166c(oly olyVar, Object obj) {
        olyVar.getClass();
        if (obj == f46804a) {
            return;
        }
        if (!(obj instanceof oyg)) {
            Object objFold = olyVar.fold(null, f46806c);
            objFold.getClass();
            ((osr) objFold).mo18919cL(obj);
            return;
        }
        oyg oygVar = (oyg) obj;
        int length = oygVar.f46816c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            osr osrVar = oygVar.f46816c[length];
            osrVar.getClass();
            osrVar.mo18919cL(oygVar.f46815b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
