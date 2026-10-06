package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fuj implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23587a;

    /* JADX INFO: renamed from: b */
    private final oju f23588b;

    public fuj(oju ojuVar, oju ojuVar2) {
        this.f23587a = ojuVar;
        this.f23588b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static fuj m8809b(oju ojuVar, oju ojuVar2) {
        return new fuj(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fui get() {
        return new fui((jwf) this.f23587a.get(), (jwn) this.f23588b.get());
    }
}
