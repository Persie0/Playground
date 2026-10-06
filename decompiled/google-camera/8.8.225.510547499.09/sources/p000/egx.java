package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egx implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14020a;

    /* JADX INFO: renamed from: b */
    private final oju f14021b;

    /* JADX INFO: renamed from: c */
    private final oju f14022c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f14023d;

    public egx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f14023d = i;
        this.f14020a = ojuVar;
        this.f14021b = ojuVar2;
        this.f14022c = ojuVar3;
    }

    public egx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f14023d = i;
        this.f14022c = ojuVar;
        this.f14021b = ojuVar2;
        this.f14020a = ojuVar3;
    }

    public egx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f14023d = i;
        this.f14020a = ojuVar;
        this.f14022c = ojuVar2;
        this.f14021b = ojuVar3;
    }

    public egx(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f14023d = i;
        this.f14022c = ojuVar;
        this.f14021b = ojuVar2;
        this.f14020a = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static egx m7315a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new egx(ojuVar, ojuVar2, ojuVar3, 0);
    }

    /* JADX INFO: renamed from: c */
    public static egx m7316c(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new egx(ojuVar, ojuVar2, ojuVar3, 1);
    }

    /* JADX INFO: renamed from: d */
    public static egx m7317d(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new egx(ojuVar, ojuVar2, ojuVar3, 3, (char[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f14023d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return m7318b();
    }

    /* JADX INFO: renamed from: b */
    public final Boolean m7318b() {
        boolean z = true;
        switch (this.f14023d) {
            case 0:
                dhv dhvVar = (dhv) this.f14020a.get();
                return Boolean.valueOf(dht.m6171a(dhvVar).contains(((ikv) this.f14022c).m11415a()) && ((fxj) this.f14021b).m8922a().mo14558k() == kmq.BACK && dhvVar.mo6184l(dht.f11186n) && dhvVar.mo6184l(dib.f11333bn));
            case 1:
                dhv dhvVar2 = (dhv) this.f14020a.get();
                return Boolean.valueOf(((ikv) this.f14022c).m11415a() == ikw.PHOTO && ((fxj) this.f14021b).m8922a().mo14558k() == kmq.BACK && dhvVar2.mo6184l(dht.f11176d) && dhvVar2.mo6184l(dib.f11333bn));
            case 2:
                dhv dhvVar3 = (dhv) this.f14022c.get();
                boolean zBooleanValue = ((cde) this.f14021b).m3490a().booleanValue();
                boolean zBooleanValue2 = ((cde) this.f14020a).m3490a().booleanValue();
                jww jwwVar = eza.f21026a;
                if ((!zBooleanValue && !zBooleanValue2 && !dhvVar3.mo6184l(dig.f11495i)) || ((!dhvVar3.mo6184l(dig.f11492f) && !dhvVar3.mo6184l(dig.f11491e)) || (dhvVar3.mo6184l(dig.f11505s) && dhvVar3.mo6184l(dig.f11504r)))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return Boolean.valueOf(((dhv) this.f14020a.get()).mo6184l(dht.f11186n) && ((ikv) this.f14022c).m11415a().equals(ikw.PHOTO) && ((fxj) this.f14021b).m8922a().mo14558k() == kmq.BACK);
            default:
                mrm mrmVar = (mrm) ((ohj) this.f14022c).f46012a;
                oju ojuVar = this.f14021b;
                if (!((Boolean) ((mrm) ((ohj) this.f14020a).f46012a).mo16811e(false)).booleanValue() && (!((Boolean) mrmVar.mo16811e(false)).booleanValue() || !((Boolean) ojuVar.get()).booleanValue())) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
