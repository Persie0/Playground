package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gic implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24882a;

    /* JADX INFO: renamed from: b */
    private final oju f24883b;

    public gic(oju ojuVar, oju ojuVar2) {
        this.f24882a = ojuVar;
        this.f24883b = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static gic m9275a(oju ojuVar, oju ojuVar2) {
        return new gic(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gtd get() {
        return new gtd((kpb) this.f24882a.get(), (dhv) this.f24883b.get());
    }
}
