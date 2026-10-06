package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dfx implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10823a;

    /* JADX INFO: renamed from: b */
    private final oju f10824b;

    public dfx(oju ojuVar, oju ojuVar2) {
        this.f10823a = ojuVar;
        this.f10824b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dgn get() {
        return new dfv((Executor) this.f10823a.get(), ((ohm) this.f10824b).get());
    }
}
