package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hti implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f29518a;

    /* JADX INFO: renamed from: b */
    private final oju f29519b;

    /* JADX INFO: renamed from: c */
    private final oju f29520c;

    /* JADX INFO: renamed from: d */
    private final oju f29521d;

    /* JADX INFO: renamed from: e */
    private final oju f29522e;

    /* JADX INFO: renamed from: f */
    private final oju f29523f;

    /* JADX INFO: renamed from: g */
    private final oju f29524g;

    /* JADX INFO: renamed from: h */
    private final oju f29525h;

    public hti(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        this.f29518a = ojuVar;
        this.f29519b = ojuVar2;
        this.f29520c = ojuVar3;
        this.f29521d = ojuVar4;
        this.f29522e = ojuVar5;
        this.f29523f = ojuVar6;
        this.f29524g = ojuVar7;
        this.f29525h = ojuVar8;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hth get() {
        return new hth(((iil) this.f29518a).get(), ((Boolean) this.f29519b.get()).booleanValue(), ((ers) this.f29520c).get(), (hlv) this.f29521d.get(), ohh.m18485a(this.f29522e), (jvd) this.f29523f.get(), (Executor) this.f29524g.get(), (hah) this.f29525h.get(), null, null);
    }
}
