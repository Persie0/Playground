package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fzx implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24003a;

    /* JADX INFO: renamed from: b */
    private final oju f24004b;

    /* JADX INFO: renamed from: c */
    private final oju f24005c;

    /* JADX INFO: renamed from: d */
    private final oju f24006d;

    public fzx(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f24003a = ojuVar;
        this.f24004b = ojuVar2;
        this.f24005c = ojuVar3;
        this.f24006d = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static fzx m8987a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fzx(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fzw get() {
        return new fzw(((ohm) this.f24003a).get(), (nqf) this.f24004b.get(), (Executor) this.f24005c.get(), (kbz) this.f24006d.get());
    }
}
