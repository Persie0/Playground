package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class us3 {

    /* JADX INFO: renamed from: a */
    public static final String[] f64283a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: b */
    public static final int[][] f64284b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f64285c;

    /* JADX INFO: renamed from: d */
    public static final int[][] f64286d;

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f64285c = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f64285c[0][i] = i - 63;
        }
        f64285c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f64285c[1][i2] = i2 - 95;
        }
        f64285c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f64285c[2][i3] = i3 - 46;
        }
        int[] iArr2 = f64285c[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f64285c[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f64285c[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f64286d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f64286d;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    /* JADX INFO: renamed from: a */
    public static LinkedList m22897a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ch9 ch9Var = (ch9) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.add(ch9Var);
                    break;
                }
                ch9 ch9Var2 = (ch9) it2.next();
                if (ch9Var2.m4661c(ch9Var)) {
                    break;
                }
                if (ch9Var.m4661c(ch9Var2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }
}
