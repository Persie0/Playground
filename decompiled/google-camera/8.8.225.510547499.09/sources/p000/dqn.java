package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqn implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12337a;

    /* JADX INFO: renamed from: b */
    private final oju f12338b;

    /* JADX INFO: renamed from: c */
    private final oju f12339c;

    /* JADX INFO: renamed from: d */
    private final oju f12340d;

    /* JADX INFO: renamed from: e */
    private final oju f12341e;

    /* JADX INFO: renamed from: f */
    private final oju f12342f;

    /* JADX INFO: renamed from: g */
    private final oju f12343g;

    public dqn(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        this.f12337a = ojuVar;
        this.f12338b = ojuVar2;
        this.f12339c = ojuVar3;
        this.f12340d = ojuVar4;
        this.f12341e = ojuVar5;
        this.f12342f = ojuVar6;
        this.f12343g = ojuVar7;
    }

    /* JADX INFO: renamed from: a */
    public static dqn m6595a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new dqn(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Runnable get() {
        return !((Boolean) this.f12337a.get()).booleanValue() ? nqb.f44047a : new dqm(((fxj) this.f12343g).m8922a(), (dqv) this.f12338b.get(), ((Boolean) this.f12339c.get()).booleanValue(), this.f12340d, ((Boolean) this.f12341e.get()).booleanValue(), this.f12342f, 0);
    }
}
