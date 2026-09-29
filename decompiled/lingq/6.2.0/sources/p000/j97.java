package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class j97 extends AbstractC3131j1 {
    @Override // p000.jq7
    /* JADX INFO: renamed from: c */
    public final int mo14353c(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p000.AbstractC3131j1
    /* JADX INFO: renamed from: d */
    public final Random mo14246d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
