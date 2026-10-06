package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fjp implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f22274a;

    /* JADX INFO: renamed from: b */
    private final Object f22275b;

    public fjp(fws fwsVar, int i) {
        this.f22274a = i;
        this.f22275b = fwsVar;
    }

    public fjp(oju ojuVar, int i) {
        this.f22274a = i;
        this.f22275b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static fjp m8492a(oju ojuVar) {
        return new fjp(ojuVar, 0);
    }

    /* JADX INFO: renamed from: c */
    public static fjp m8493c(oju ojuVar) {
        return new fjp(ojuVar, 2);
    }

    /* JADX INFO: renamed from: d */
    public static fjp m8494d(oju ojuVar) {
        return new fjp(ojuVar, 6);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f22274a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return m8495b();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: b */
    public final mrm m8495b() {
        Object obj;
        switch (this.f22274a) {
            case 0:
                return (mrm) ((mrq) ((etl) this.f22275b).m7866a()).f41482a;
            case 1:
                dhv dhvVar = (dhv) this.f22275b.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6177e();
                return mqu.f41450a;
            case 2:
                return (mrm) ((mrq) ((etl) this.f22275b).m7866a()).f41482a;
            case 3:
                dhv dhvVar2 = (dhv) this.f22275b.get();
                dhx dhxVar2 = dib.f11240a;
                dhvVar2.mo6178f();
                return mqu.f41450a;
            case 4:
                obj = ((fws) this.f22275b).f23773j;
                break;
            case 5:
                obj = ((fws) this.f22275b).f23772i;
                break;
            case 6:
                return ((dhv) this.f22275b.get()).mo6184l(did.f11439ar) ? mrm.m16829i(259L) : mqu.f41450a;
            case 7:
                ((cde) this.f22275b).m3490a().booleanValue();
                return mqu.f41450a;
            case 8:
                return mrm.m16828h(((dws) this.f22275b).m6830a().getExternalCacheDir());
            case 9:
                dhv dhvVar3 = (dhv) this.f22275b.get();
                dhx dhxVar3 = diw.f11719a;
                dhvVar3.mo6179g();
                return mqu.f41450a;
            case 10:
                return mrm.m16828h((Integer) ((dhv) this.f22275b.get()).mo6173a(diu.f11711a).orElse(null));
            default:
                mrm mrmVar = (mrm) ((ohj) this.f22275b).f46012a;
                return mrmVar.mo16813g() ? mrm.m16828h((liy) ((oju) mrmVar.mo16809c()).get()) : mqu.f41450a;
        }
        return (mrm) obj;
    }
}
