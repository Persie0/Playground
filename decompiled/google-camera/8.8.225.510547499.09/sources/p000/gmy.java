package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gmy {

    /* JADX INFO: renamed from: a */
    public kmg f25660a;

    /* JADX INFO: renamed from: b */
    public kna f25661b;

    /* JADX INFO: renamed from: f */
    public Long f25665f;

    /* JADX INFO: renamed from: c */
    public int f25662c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f25663d = false;

    /* JADX INFO: renamed from: e */
    public boolean f25664e = false;

    /* JADX INFO: renamed from: g */
    public boolean f25666g = true;

    public gmy(dhv dhvVar, ikw ikwVar, fvu fvuVar) {
        if (ikwVar == ikw.PHOTO && fvuVar.mo14558k() == kmq.BACK) {
            goy.m9590c(dhvVar);
            dhx dhxVar = dib.f11240a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final kgi m9532a() {
        kna knaVar = this.f25661b;
        lku.m15661o(knaVar, "format", new Object[0]);
        kgh kghVarM14208a = kgi.m14208a();
        kmg kmgVar = this.f25660a;
        lku.m15661o(kmgVar, "cameraId", new Object[0]);
        kghVarM14208a.m14197b(kmgVar);
        kghVarM14208a.m14204i(knaVar.f36581b);
        kghVarM14208a.m14203h(knaVar.f36580a);
        kghVarM14208a.m14198c(this.f25662c);
        kghVarM14208a.m14206k(kgj.f35913a);
        kghVarM14208a.m14202g(this.f25664e);
        kghVarM14208a.m14200e(this.f25663d);
        kghVarM14208a.m14201f(this.f25666g);
        Long l = this.f25665f;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (jLongValue != 0) {
            kghVarM14208a.m14207l(jLongValue);
        }
        return kghVarM14208a.m14196a();
    }
}
