package hm;

import kotlin.random.Random;

/* JADX INFO: renamed from: hm.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6079a extends Random {
    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: a */
    public final int mo12509a(int i10) {
        return ((-i10) >> 31) & (mo12512e().nextInt() >>> (32 - i10));
    }

    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: b */
    public final int mo12510b() {
        return mo12512e().nextInt();
    }

    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: c */
    public final int mo12511c(int i10) {
        return mo12512e().nextInt(i10);
    }

    /* JADX INFO: renamed from: e */
    public abstract java.util.Random mo12512e();
}
