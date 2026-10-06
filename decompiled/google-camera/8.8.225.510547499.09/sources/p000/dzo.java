package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12998a;

    /* JADX INFO: renamed from: b */
    private final oju f12999b;

    public dzo(oju ojuVar, oju ojuVar2) {
        this.f12998a = ojuVar;
        this.f12999b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dzn get() {
        return new dzn(((dzq) this.f12998a).get(), (Executor) this.f12999b.get());
    }
}
