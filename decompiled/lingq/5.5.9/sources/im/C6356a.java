package im;

import dm.C5207g;
import hm.AbstractC6079a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: im.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6356a extends AbstractC6079a {
    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: d */
    public final int mo12968d(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // hm.AbstractC6079a
    /* JADX INFO: renamed from: e */
    public final Random mo12512e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        C5207g.m11110e(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
