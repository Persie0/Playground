package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class egg implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f13928a;

    /* JADX INFO: renamed from: b */
    private final oju f13929b;

    /* JADX INFO: renamed from: c */
    private final oju f13930c;

    /* JADX INFO: renamed from: d */
    private final oju f13931d;

    /* JADX INFO: renamed from: e */
    private final oju f13932e;

    /* JADX INFO: renamed from: f */
    private final oju f13933f;

    /* JADX INFO: renamed from: g */
    private final oju f13934g;

    public egg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        this.f13928a = ojuVar;
        this.f13929b = ojuVar2;
        this.f13930c = ojuVar3;
        this.f13931d = ojuVar4;
        this.f13932e = ojuVar5;
        this.f13933f = ojuVar6;
        this.f13934g = ojuVar7;
    }

    /* JADX INFO: renamed from: b */
    public static egg m7295b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new egg(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egf get() {
        return new egf((jwn) this.f13928a.get(), (jwn) this.f13929b.get(), (Map) this.f13930c.get(), (jww) this.f13931d.get(), (jwn) this.f13932e.get(), (fnm) this.f13933f.get(), (dhv) this.f13934g.get());
    }
}
