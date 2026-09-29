package p175ia;

import java.util.ArrayList;

/* JADX INFO: renamed from: ia.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6240d implements InterfaceC6243g {

    /* JADX INFO: renamed from: b */
    public static final int[] f36242b = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a */
    public static void m12838a(int i10, ArrayList arrayList) {
        int[] iArr = f36242b;
        int i11 = 0;
        while (true) {
            if (i11 >= 7) {
                i11 = -1;
                break;
            } else if (iArr[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }
}
