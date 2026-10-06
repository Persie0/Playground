package p000;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dfw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10821a;

    /* JADX INFO: renamed from: b */
    private final oju f10822b;

    public dfw(oju ojuVar, oju ojuVar2) {
        this.f10821a = ojuVar;
        this.f10822b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dgg get() {
        final Executor executor = (Executor) this.f10821a.get();
        final Set set = ((ohm) this.f10822b).get();
        return new dgg() { // from class: dfu
            @Override // p000.dgg
            /* JADX INFO: renamed from: g */
            public final void mo3954g(long j, Map map) {
                executor.execute(new dcr(set, j, map, 2));
            }
        };
    }
}
