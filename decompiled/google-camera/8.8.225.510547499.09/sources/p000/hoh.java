package p000;

import p021j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hoh implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f28573a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f28574b;

    public hoh(oju ojuVar, int i) {
        this.f28574b = i;
        this.f28573a = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f28574b) {
            case 0:
                break;
        }
        return m10533a();
    }

    /* JADX INFO: renamed from: a */
    public final hnx m10533a() {
        switch (this.f28574b) {
            case 0:
                jdx jdxVarM10521a = hnx.m10521a();
                jdxVarM10521a.m12954c(hnv.HEAT_CRITICAL);
                jdxVarM10521a.m12955d(hnv.HEAT_EMERGENCY);
                hnx hnxVarM12953b = jdxVarM10521a.m12953b();
                dhv dhvVar = (dhv) this.f28573a.get();
                jdx jdxVarM10521a2 = hnx.m10521a();
                jdxVarM10521a2.m12954c((hnv) Map.EL.getOrDefault(hnw.f28546b, dhvVar.mo6173a(dix.f11740r).get(), hnxVarM12953b.f28547a));
                jdxVarM10521a2.m12955d((hnv) Map.EL.getOrDefault(hnw.f28546b, dhvVar.mo6173a(dix.f11741s).get(), hnxVarM12953b.f28548b));
                return jdxVarM10521a2.m12953b();
            default:
                jdx jdxVarM10521a3 = hnx.m10521a();
                jdxVarM10521a3.m12954c(hnv.HEAT_SEVERE);
                jdxVarM10521a3.m12955d(hnv.HEAT_CRITICAL);
                hnx hnxVarM12953b2 = jdxVarM10521a3.m12953b();
                dhv dhvVar2 = (dhv) this.f28573a.get();
                jdx jdxVarM10521a4 = hnx.m10521a();
                jdxVarM10521a4.m12954c((hnv) Map.EL.getOrDefault(hnw.f28546b, dhvVar2.mo6173a(dix.f11738p).get(), hnxVarM12953b2.f28547a));
                jdxVarM10521a4.m12955d((hnv) Map.EL.getOrDefault(hnw.f28546b, dhvVar2.mo6173a(dix.f11739q).get(), hnxVarM12953b2.f28548b));
                return jdxVarM10521a4.m12953b();
        }
    }
}
