package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmx implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f6326a;

    /* JADX INFO: renamed from: b */
    private final oju f6327b;

    public cmx(oju ojuVar, oju ojuVar2) {
        this.f6326a = ojuVar;
        this.f6327b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cna get() {
        return new cmt((Executor) this.f6326a.get(), ((ohm) this.f6327b).get());
    }
}
