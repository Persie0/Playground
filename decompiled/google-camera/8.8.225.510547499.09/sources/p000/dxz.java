package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12861a;

    /* JADX INFO: renamed from: b */
    private final oju f12862b;

    /* JADX INFO: renamed from: c */
    private final oju f12863c;

    /* JADX INFO: renamed from: d */
    private final oju f12864d;

    public dxz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f12861a = ojuVar;
        this.f12862b = ojuVar2;
        this.f12863c = ojuVar3;
        this.f12864d = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static dxz m6892a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dxz(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean get() {
        dsx dsxVar = ((dms) this.f12861a).get();
        dhv dhvVar = (dhv) this.f12862b.get();
        lqc lqcVar = ((fxb) this.f12863c).get();
        fvu fvuVarM8922a = ((fxj) this.f12864d).m8922a();
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        boolean z = true;
        boolean z2 = dsxVar.m6692g() && lqcVar.f38949a;
        boolean z3 = dhvVar.mo6183k(diu.f11712b) && fvuVarM8922a.mo14558k() == kmq.BACK;
        if (!z2 && !z3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
