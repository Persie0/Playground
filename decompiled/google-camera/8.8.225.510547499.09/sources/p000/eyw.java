package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eyw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21012a;

    /* JADX INFO: renamed from: b */
    private final oju f21013b;

    /* JADX INFO: renamed from: c */
    private final oju f21014c;

    public eyw(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f21012a = ojuVar;
        this.f21013b = ojuVar2;
        this.f21014c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyv get() {
        return new eyv((Executor) this.f21012a.get(), eng.m7558a(), ((hog) this.f21013b).m10532a(), ((egx) this.f21014c).m7318b().booleanValue());
    }
}
