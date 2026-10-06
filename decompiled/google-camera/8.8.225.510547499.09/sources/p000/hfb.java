package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27532a;

    /* JADX INFO: renamed from: b */
    private final oju f27533b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f27534c;

    public hfb(oju ojuVar, oju ojuVar2, int i) {
        this.f27534c = i;
        this.f27532a = ojuVar;
        this.f27533b = ojuVar2;
    }

    public hfb(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f27534c = i;
        this.f27533b = ojuVar;
        this.f27532a = ojuVar2;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f27534c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return m10179a();
    }

    /* JADX INFO: renamed from: a */
    public final mrm m10179a() {
        switch (this.f27534c) {
            case 0:
                return !((Boolean) this.f27533b.get()).booleanValue() ? mqu.f41450a : ((etl) this.f27532a).m7866a();
            case 1:
                return !((Boolean) this.f27533b.get()).booleanValue() ? mqu.f41450a : ((etl) this.f27532a).m7866a();
            case 2:
                return ((cde) this.f27533b).m3490a().booleanValue() ? ((etl) this.f27532a).m7866a() : mqu.f41450a;
            case 3:
                return ((cde) this.f27533b).m3490a().booleanValue() ? ((etl) this.f27532a).m7866a() : mqu.f41450a;
            case 4:
                return ((cde) this.f27533b).m3490a().booleanValue() ? ((etl) this.f27532a).m7866a() : mqu.f41450a;
            case 5:
                return ((cde) this.f27533b).m3490a().booleanValue() ? ((etl) this.f27532a).m7866a() : mqu.f41450a;
            case 6:
                return ((dhv) this.f27533b.get()).mo6184l(dib.f11349cc) ? mrm.m16829i(((kqj) this.f27532a.get()).m14703e(mzx.f41874a)) : mqu.f41450a;
            case 7:
                return !((Boolean) this.f27533b.get()).booleanValue() ? mqu.f41450a : ((etl) this.f27532a).m7866a();
            case 8:
                return !((Boolean) this.f27532a.get()).booleanValue() ? mqu.f41450a : ((etl) this.f27533b).m7866a();
            case 9:
                return !((Boolean) this.f27533b.get()).booleanValue() ? mqu.f41450a : ((etl) this.f27532a).m7866a();
            default:
                mrm mrmVar = (mrm) ((ohj) this.f27532a).f46012a;
                ((dws) this.f27533b).m6830a();
                return mrmVar.mo16813g() ? mrm.m16829i(new dfg(mrmVar, 17)) : mqu.f41450a;
        }
    }
}
