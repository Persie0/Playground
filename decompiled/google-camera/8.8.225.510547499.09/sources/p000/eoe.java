package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eoe implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14847a;

    /* JADX INFO: renamed from: b */
    private final oju f14848b;

    /* JADX INFO: renamed from: c */
    private final oju f14849c;

    /* JADX INFO: renamed from: d */
    private final oju f14850d;

    public eoe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f14847a = ojuVar;
        this.f14848b = ojuVar2;
        this.f14849c = ojuVar3;
        this.f14850d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final glk get() {
        return new glk((bko) this.f14847a.get(), (fca) this.f14848b.get(), (Executor) this.f14849c.get(), (dhv) this.f14850d.get(), (byte[]) null, (byte[]) null, (byte[]) null);
    }
}
