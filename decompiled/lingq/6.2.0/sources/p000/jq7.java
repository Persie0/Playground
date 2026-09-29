package p000;

import kotlin.random.Random$Default;

/* JADX INFO: loaded from: classes.dex */
public abstract class jq7 {

    /* JADX INFO: renamed from: a */
    public static final Random$Default f46010a = new Random$Default();

    /* JADX INFO: renamed from: b */
    public static final AbstractC3131j1 f46011b;

    static {
        Integer num = wc4.f66616a;
        f46011b = (num == null || num.intValue() >= 34) ? new j97() : new mz2();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo14244a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo14245b();

    /* JADX INFO: renamed from: c */
    public int mo14353c(int i, int i2) {
        int iMo14245b;
        int i3;
        int iMo14244a;
        pic.m19187a(i, i2);
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iMo14244a = mo14244a(pic.m19188b(i4));
            } else {
                do {
                    iMo14245b = mo14245b() >>> 1;
                    i3 = iMo14245b % i4;
                } while ((i4 - 1) + (iMo14245b - i3) < 0);
                iMo14244a = i3;
            }
            return i + iMo14244a;
        }
        while (true) {
            int iMo14245b2 = mo14245b();
            if (i <= iMo14245b2 && iMo14245b2 < i2) {
                return iMo14245b2;
            }
        }
    }
}
