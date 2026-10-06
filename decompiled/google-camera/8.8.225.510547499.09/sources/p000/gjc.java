package p000;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24948a;

    /* JADX INFO: renamed from: b */
    private final oju f24949b;

    /* JADX INFO: renamed from: c */
    private final oju f24950c;

    /* JADX INFO: renamed from: d */
    private final oju f24951d;

    /* JADX INFO: renamed from: e */
    private final oju f24952e;

    /* JADX INFO: renamed from: f */
    private final oju f24953f;

    public gjc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        this.f24948a = ojuVar;
        this.f24949b = ojuVar2;
        this.f24950c = ojuVar3;
        this.f24951d = ojuVar4;
        this.f24952e = ojuVar5;
        this.f24953f = ojuVar6;
    }

    /* JADX INFO: renamed from: a */
    public static gjc m9319a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gjc(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kqj get() {
        return new kqj((kfk) this.f24948a.get(), (Map) this.f24949b.get(), (jwn) this.f24950c.get(), (jvb) this.f24951d.get(), (Executor) this.f24952e.get(), (Map) this.f24953f.get());
    }
}
