package p000;

import android.os.Build;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ky3 {

    /* JADX INFO: renamed from: a */
    public static final ImmutableSet f48773a;

    static {
        f48773a = Build.VERSION.SDK_INT < 32 ? ImmutableSet.m6307m(new Object[]{12, 252, 6396, 4}, 4) : ImmutableSet.m6311t(12, 252, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }

    /* JADX INFO: renamed from: a */
    public static int m15732a(C3627tx c3627tx) {
        int i;
        ImmutableSet immutableSet;
        int iIntValue;
        Integer num;
        Iterator<E> it = c3627tx.f63035d.iterator();
        do {
            boolean zHasNext = it.hasNext();
            i = 0;
            immutableSet = f48773a;
            if (!zHasNext) {
                iIntValue = 0;
                break;
            }
            num = (Integer) it.next();
            iIntValue = num.intValue();
        } while (!immutableSet.contains(num));
        if (iIntValue != 0) {
            return iIntValue;
        }
        for (Integer num2 : c3627tx.f63034c) {
            int iIntValue2 = num2.intValue();
            if (immutableSet.contains(num2)) {
                i = iIntValue2;
                break;
            }
        }
        if (i != 0) {
            return i;
        }
        return 12;
    }
}
