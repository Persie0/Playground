package p000;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u2d {
    /* JADX INFO: renamed from: a */
    public static float m22407a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    /* JADX INFO: renamed from: b */
    public static float m22408b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    /* JADX INFO: renamed from: c */
    public static final Integer m22409c(String str) {
        Integer numM4844a0;
        int iIntValue;
        str.getClass();
        if (str.length() <= 0) {
            str = null;
            break;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                str = null;
                break;
            }
        }
        if (str == null || (numM4844a0 = cl9.m4844a0(str)) == null || 1 > (iIntValue = numM4844a0.intValue()) || iIntValue >= 1001) {
            return null;
        }
        return numM4844a0;
    }
}
