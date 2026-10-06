package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldz extends lcf {
    public ldz(lby lbyVar, kzx kzxVar) {
        super(lbyVar, kzxVar);
    }

    /* JADX INFO: renamed from: g */
    public static ldz m15227g(lby lbyVar, lbl lblVar) {
        return new ldz(lbyVar, lcf.m15165d(lbyVar, new lbx(lbyVar, lblVar, 2)));
    }

    /* JADX INFO: renamed from: h */
    public static ldz m15228h(lby lbyVar, lbl lblVar, int i, int i2) {
        ldu lduVar = new ldu(lbyVar.mo15153e(), i, i2, lblVar);
        lduVar.f38002e = true;
        return new ldz(lbyVar, lqi.m15864i(lduVar));
    }

    /* JADX INFO: renamed from: b */
    public final lbl m15229b() {
        return ((ldv) m15167f()).f38003f;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int iHashCode = hashCode();
        m15229b();
        return simpleName + "@" + iHashCode + "[layout=RGBA8888]";
    }
}
