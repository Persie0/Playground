package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cen implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5459a;

    /* JADX INFO: renamed from: b */
    private final oju f5460b;

    /* JADX INFO: renamed from: c */
    private final oju f5461c;

    /* JADX INFO: renamed from: d */
    private final oju f5462d;

    /* JADX INFO: renamed from: e */
    private final oju f5463e;

    public cen(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f5459a = ojuVar;
        this.f5460b = ojuVar2;
        this.f5461c = ojuVar3;
        this.f5462d = ojuVar4;
        this.f5463e = ojuVar5;
    }

    /* JADX INFO: renamed from: b */
    public static cen m3568b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new cen(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cem get() {
        kov kovVar = (kov) this.f5459a.get();
        inm inmVar = (inm) this.f5460b.get();
        kmd kmdVar = (kmd) this.f5461c.get();
        return new cem(kovVar, inmVar, (dhv) this.f5462d.get(), kmdVar.mo14553f(), kmdVar.mo14558k() == kmq.f36557a, (jwn) this.f5463e.get());
    }
}
