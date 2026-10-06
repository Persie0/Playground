package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24945a;

    /* JADX INFO: renamed from: b */
    private final oju f24946b;

    /* JADX INFO: renamed from: c */
    private final oju f24947c;

    public gjb(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f24945a = ojuVar;
        this.f24946b = ojuVar2;
        this.f24947c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static gjb m9317a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new gjb(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1058va get() {
        return new C1058va(this.f24945a, this.f24946b, this.f24947c, (byte[]) null);
    }
}
