package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fze implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23962a;

    /* JADX INFO: renamed from: b */
    private final oju f23963b;

    /* JADX INFO: renamed from: c */
    private final oju f23964c;

    public fze(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f23962a = ojuVar;
        this.f23963b = ojuVar2;
        this.f23964c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static fze m8969a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fze(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final glk get() {
        return new glk(((dki) this.f23962a).get(), ((ohm) this.f23963b).get(), (jvd) this.f23964c.get(), dvb.m6761a());
    }
}
