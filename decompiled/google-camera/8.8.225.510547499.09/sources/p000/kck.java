package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kck implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f35573a;

    /* JADX INFO: renamed from: b */
    private final oju f35574b;

    public kck(oju ojuVar, oju ojuVar2) {
        this.f35573a = ojuVar;
        this.f35574b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kcj get() {
        return new kcj(((kbm) this.f35573a).get(), (Executor) this.f35574b.get());
    }
}
