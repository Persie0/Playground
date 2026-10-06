package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fen implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21538a;

    /* JADX INFO: renamed from: b */
    private final oju f21539b;

    public fen(oju ojuVar, oju ojuVar2) {
        this.f21538a = ojuVar;
        this.f21539b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static fen m8299b(oju ojuVar, oju ojuVar2) {
        return new fen(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fem get() {
        return new fem((knx) this.f21538a.get(), ((geb) this.f21539b).get());
    }
}
