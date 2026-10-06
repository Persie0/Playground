package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fks implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22406a;

    public fks(oju ojuVar) {
        this.f22406a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bkn get() {
        return new bkn((Executor) this.f22406a.get());
    }
}
