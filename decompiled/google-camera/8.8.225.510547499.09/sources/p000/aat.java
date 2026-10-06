package p000;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aat extends abx {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m51a(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = hashSet.size();
                String[] strArr2 = size > 0 ? new String[length - size] : strArr;
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                }
                if (activity instanceof aas) {
                }
                aaq.m34b(activity, strArr, i);
                return;
            }
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            int i5 = adg.f162a;
            i2++;
        }
    }
}
