package p000;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.domain.model.lesson.Note;
import com.lingq.core.domain.model.lesson.Translation;
import com.lingq.core.network.api.result.ResultNote;
import com.lingq.core.network.api.result.ResultTranslation;
import com.lingq.core.network.api.result.ResultTranslationSentence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class puc {

    /* JADX INFO: renamed from: a */
    public static final int[][] f56840a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b */
    public static final int[][] f56841b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f56842c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f56843d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Code duplicated, block: B:103:0x021f  */
    /* JADX INFO: renamed from: a */
    public static void m19484a(zc0 zc0Var, ErrorCorrectionLevel errorCorrectionLevel, jpa jpaVar, int i, doa doaVar) {
        int i2;
        boolean zM25547d;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[][] bArr = (byte[][]) doaVar.f35974d;
        int i7 = doaVar.f35972b;
        int i8 = doaVar.f35973c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = f56840a[0].length;
        m19487d(0, 0, doaVar);
        int i9 = i7 - length;
        m19487d(i9, 0, doaVar);
        m19487d(0, i9, doaVar);
        m19486c(0, 7, doaVar);
        int i10 = i7 - 8;
        m19486c(i10, 7, doaVar);
        m19486c(0, i10, doaVar);
        m19488e(7, 0, doaVar);
        int i11 = i8 - 8;
        m19488e(i11, 0, doaVar);
        int i12 = i8 - 7;
        m19488e(7, i12, doaVar);
        if (doaVar.m10557f(8, i11) == 0) {
            throw new WriterException();
        }
        doaVar.m10559h(8, i11, 1);
        int i13 = jpaVar.f45978a;
        int i14 = 5;
        if (i13 < 2) {
            i2 = 0;
        } else {
            int[] iArr = f56842c[i13 - 1];
            i2 = 0;
            int length2 = iArr.length;
            int i15 = 0;
            while (i15 < length2) {
                int i16 = iArr[i15];
                if (i16 >= 0) {
                    int length3 = iArr.length;
                    int i17 = 0;
                    while (i17 < length3) {
                        int i18 = iArr[i17];
                        if (i18 >= 0 && m19489f(doaVar.m10557f(i18, i16))) {
                            int i19 = i18 - 2;
                            int i20 = i16 - 2;
                            int i21 = 0;
                            while (i21 < i14) {
                                int[] iArr2 = f56841b[i21];
                                int i22 = i21;
                                int i23 = 0;
                                while (i23 < i14) {
                                    int i24 = i23;
                                    doaVar.m10559h(i19 + i23, i20 + i22, iArr2[i24]);
                                    i23 = i24 + 1;
                                    i7 = i7;
                                    i14 = 5;
                                }
                                i21 = i22 + 1;
                                i14 = 5;
                            }
                        }
                        i17++;
                        i7 = i7;
                        i14 = 5;
                    }
                }
                i15++;
                i7 = i7;
                i14 = 5;
            }
        }
        int i25 = i7;
        int i26 = 8;
        while (i26 < i10) {
            int i27 = i26 + 1;
            int i28 = i27 % 2;
            if (m19489f(doaVar.m10557f(i26, 6))) {
                doaVar.m10559h(i26, 6, i28);
            }
            if (m19489f(doaVar.m10557f(6, i26))) {
                doaVar.m10559h(6, i26, i28);
            }
            i26 = i27;
        }
        zc0 zc0Var2 = new zc0();
        if (i < 0 || i >= 8) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        zc0Var2.m25545b(bits, 5);
        zc0Var2.m25545b(m19485b(bits, 1335), 10);
        zc0 zc0Var3 = new zc0();
        zc0Var3.m25545b(21522, 15);
        if (zc0Var2.f71347b != zc0Var3.f71347b) {
            C3386nv.m17626m("Sizes don't match");
            return;
        }
        int i29 = i2;
        while (true) {
            int[] iArr3 = zc0Var2.f71346a;
            if (i29 >= iArr3.length) {
                break;
            }
            iArr3[i29] = iArr3[i29] ^ zc0Var3.f71346a[i29];
            i29++;
        }
        if (zc0Var2.f71347b != 15) {
            throw new WriterException("should not happen but we got: " + zc0Var2.f71347b);
        }
        int i30 = i2;
        while (true) {
            int i31 = zc0Var2.f71347b;
            if (i30 >= i31) {
                break;
            }
            boolean zM25547d2 = zc0Var2.m25547d((i31 - 1) - i30);
            int[] iArr4 = f56843d[i30];
            doaVar.m10560i(iArr4[i2], iArr4[1], zM25547d2);
            if (i30 < 8) {
                doaVar.m10560i((i25 - i30) - 1, 8, zM25547d2);
            } else {
                doaVar.m10560i(8, (i30 - 8) + i12, zM25547d2);
            }
            i30++;
        }
        if (i13 >= 7) {
            zc0 zc0Var4 = new zc0();
            zc0Var4.m25545b(i13, 6);
            zc0Var4.m25545b(m19485b(i13, 7973), 12);
            if (zc0Var4.f71347b != 18) {
                throw new WriterException("should not happen but we got: " + zc0Var4.f71347b);
            }
            int i32 = 17;
            for (int i33 = i2; i33 < 6; i33++) {
                for (int i34 = i2; i34 < 3; i34++) {
                    boolean zM25547d3 = zc0Var4.m25547d(i32);
                    i32--;
                    int i35 = (i8 - 11) + i34;
                    doaVar.m10560i(i33, i35, zM25547d3);
                    doaVar.m10560i(i35, i33, zM25547d3);
                }
            }
        }
        int i36 = i25 - 1;
        int i37 = i8 - 1;
        int i38 = i2;
        int i39 = -1;
        while (i36 > 0) {
            if (i36 == 6) {
                i36--;
            }
            while (i37 >= 0 && i37 < i8) {
                for (int i40 = i2; i40 < 2; i40++) {
                    int i41 = i36 - i40;
                    if (m19489f(doaVar.m10557f(i41, i37))) {
                        if (i38 < zc0Var.f71347b) {
                            zM25547d = zc0Var.m25547d(i38);
                            i38++;
                        } else {
                            zM25547d = i2;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i3 = i37 + i41;
                                    i4 = i3 & 1;
                                    if (i4 == 0) {
                                        zM25547d = !zM25547d;
                                    }
                                    break;
                                case 1:
                                    i4 = i37 & 1;
                                    if (i4 == 0) {
                                        zM25547d = !zM25547d;
                                    }
                                    break;
                                case 2:
                                    i4 = i41 % 3;
                                    if (i4 == 0) {
                                        zM25547d = !zM25547d;
                                    }
                                    break;
                                case 3:
                                    i4 = (i37 + i41) % 3;
                                    if (i4 == 0) {
                                        zM25547d = !zM25547d;
                                    }
                                    break;
                                case 4:
                                    i4 = ((i41 / 3) + (i37 / 2)) & 1;
                                    if (i4 == 0) {
                                        zM25547d = !zM25547d;
                                    }
                                    break;
                                case 5:
                                    int i42 = i37 * i41;
                                    i4 = (i42 % 3) + (i42 & 1);
                                    if (i4 == 0) {
                                        zM25547d = !zM25547d;
                                    }
                                    break;
                                case 6:
                                    int i43 = i37 * i41;
                                    i5 = i43 & 1;
                                    i6 = i43 % 3;
                                    i3 = i6 + i5;
                                    i4 = i3 & 1;
                                    if (i4 == 0) {
                                        zM25547d = !zM25547d;
                                    }
                                    break;
                                case 7:
                                    i6 = (i37 * i41) % 3;
                                    i5 = (i37 + i41) & 1;
                                    i3 = i6 + i5;
                                    i4 = i3 & 1;
                                    if (i4 == 0) {
                                        zM25547d = !zM25547d;
                                    }
                                    break;
                                default:
                                    C3386nv.m17626m("Invalid mask pattern: ".concat(String.valueOf(i)));
                                    return;
                            }
                        }
                        doaVar.m10560i(i41, i37, zM25547d);
                    }
                }
                i37 += i39;
            }
            i39 = -i39;
            i37 += i39;
            i36 -= 2;
        }
        if (i38 == zc0Var.f71347b) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i38 + '/' + zc0Var.f71347b);
    }

    /* JADX INFO: renamed from: b */
    public static int m19485b(int i, int i2) {
        if (i2 == 0) {
            C3386nv.m17626m("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i3) {
            iNumberOfLeadingZeros2 ^= i2 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i3);
        }
        return iNumberOfLeadingZeros2;
    }

    /* JADX INFO: renamed from: c */
    public static void m19486c(int i, int i2, doa doaVar) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!m19489f(doaVar.m10557f(i4, i2))) {
                throw new WriterException();
            }
            doaVar.m10559h(i4, i2, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m19487d(int i, int i2, doa doaVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f56840a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                doaVar.m10559h(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m19488e(int i, int i2, doa doaVar) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!m19489f(doaVar.m10557f(i, i4))) {
                throw new WriterException();
            }
            doaVar.m10559h(i, i4, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m19489f(int i) {
        return i == -1;
    }

    /* JADX INFO: renamed from: g */
    public static final TranslationSentenceEntity m19490g(ResultTranslationSentence resultTranslationSentence, int i) {
        resultTranslationSentence.getClass();
        int i2 = resultTranslationSentence.f21611a;
        List list = resultTranslationSentence.f21612b;
        Double d = (Double) u91.m22591I0(list);
        Double d2 = (Double) u91.m22592J0(1, list);
        String str = resultTranslationSentence.f21613c;
        List<ResultTranslation> list2 = resultTranslationSentence.f21614d;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (ResultTranslation resultTranslation : list2) {
            arrayList.add(new Translation(resultTranslation.f21604a, resultTranslation.f21605b, fa4.m11650l(resultTranslation.f21606c, "Google")));
        }
        List<ResultNote> list3 = resultTranslationSentence.f21615e;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
        for (ResultNote resultNote : list3) {
            arrayList2.add(new Note(resultNote.f21336a, resultNote.f21337b));
        }
        return new TranslationSentenceEntity(i2, i, d, d2, str, arrayList, arrayList2);
    }
}
