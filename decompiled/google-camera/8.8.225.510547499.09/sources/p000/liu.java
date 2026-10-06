package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class liu {

    /* JADX INFO: renamed from: a */
    public final ozj f38331a;

    /* JADX INFO: renamed from: b */
    public final Long f38332b;

    /* JADX INFO: renamed from: c */
    public final Long f38333c;

    /* JADX INFO: renamed from: d */
    public final Long f38334d;

    /* JADX INFO: renamed from: e */
    public final Long f38335e;

    /* JADX INFO: renamed from: f */
    public final oyz f38336f;

    /* JADX INFO: renamed from: g */
    public final String f38337g;

    /* JADX INFO: renamed from: h */
    public final ozk f38338h;

    public liu(ozj ozjVar, Long l, Long l2, Long l3, Long l4, oyz oyzVar, String str, ozk ozkVar) {
        this.f38331a = ozjVar;
        this.f38332b = l;
        this.f38333c = l2;
        this.f38334d = l3;
        this.f38335e = l4;
        this.f38336f = oyzVar;
        this.f38337g = str;
        this.f38338h = ozkVar;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.f38332b, this.f38333c, this.f38334d, this.f38335e, this.f38337g);
    }
}
