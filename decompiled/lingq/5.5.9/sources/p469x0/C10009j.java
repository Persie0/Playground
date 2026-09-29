package p469x0;

import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p387t0.C9169u;

/* JADX INFO: renamed from: x0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10009j {

    /* JADX INFO: renamed from: a */
    public static final EmptyList f50944a = EmptyList.f38032a;

    static {
        int i10 = C9169u.f47704g;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX INFO: renamed from: a */
    public static final List<AbstractC10003d> m18595a(String str) {
        char c10;
        int i10;
        float[] fArr;
        if (str == null) {
            return f50944a;
        }
        C10004e c10004e = new C10004e();
        ArrayList arrayList = c10004e.f50925a;
        arrayList.clear();
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (i14 < str.length()) {
            while (i14 < str.length()) {
                char cCharAt = str.charAt(i14);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        break;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i14++;
            }
            String strSubstring = str.substring(i13, i14);
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring.length() - i12;
            int i15 = i11;
            int i16 = i15;
            while (true) {
                c10 = ' ';
                if (i15 > length) {
                    break;
                }
                int i17 = C5207g.m11113h(strSubstring.charAt(i16 == 0 ? i15 : length), 32) <= 0 ? i12 : i11;
                if (i16 == 0) {
                    if (i17 == 0) {
                        i16 = i12;
                    } else {
                        i15++;
                    }
                } else {
                    if (i17 == 0) {
                        break;
                    }
                    length--;
                }
            }
            String string = strSubstring.subSequence(i15, length + 1).toString();
            if ((string.length() > 0 ? i12 : i11) != 0) {
                if (string.charAt(i11) == 'z' || string.charAt(i11) == 'Z') {
                    i10 = i11;
                    fArr = new float[i10];
                } else {
                    int length2 = string.length();
                    float[] fArr2 = new float[length2];
                    int length3 = string.length();
                    int i18 = i11;
                    int i19 = i12;
                    while (i19 < length3) {
                        int i20 = i11;
                        int i21 = i20;
                        int i22 = i21;
                        int i23 = i22;
                        int i24 = i19;
                        while (i24 < string.length()) {
                            char cCharAt2 = string.charAt(i24);
                            if (cCharAt2 == c10 || cCharAt2 == ',') {
                                i21 = 0;
                                i23 = 1;
                            } else if (cCharAt2 != '-') {
                                if (cCharAt2 == '.') {
                                    if (i20 == 0) {
                                        i20 = 1;
                                    }
                                    i22 = 1;
                                    i21 = 0;
                                    i23 = 1;
                                } else {
                                    if (cCharAt2 == 'e' || cCharAt2 == 'E') {
                                        i21 = 1;
                                    }
                                }
                                i21 = 0;
                            } else if (i24 == i19 || i21 != 0) {
                                i21 = 0;
                            } else {
                                i22 = 1;
                                i21 = 0;
                                i23 = 1;
                            }
                            if (i23 != 0) {
                                break;
                            }
                            i24++;
                            c10 = ' ';
                        }
                        if (i19 < i24) {
                            String strSubstring2 = string.substring(i19, i24);
                            C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            fArr2[i18] = Float.parseFloat(strSubstring2);
                            i18++;
                        }
                        if (i22 == 0) {
                            i24++;
                        }
                        i19 = i24;
                        i11 = 0;
                        c10 = ' ';
                    }
                    if (i18 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (length2 < 0) {
                        throw new IndexOutOfBoundsException();
                    }
                    int i25 = i18 + 0;
                    fArr = new float[i25];
                    i10 = 0;
                    System.arraycopy(fArr2, 0, fArr, 0, (Math.min(i25, length2 + 0) + 0) - 0);
                }
                c10004e.m18590a(string.charAt(i10), fArr);
            }
            i13 = i14;
            i12 = 1;
            i14++;
            i11 = 0;
        }
        if (i14 - i13 == 1 && i13 < str.length()) {
            c10004e.m18590a(str.charAt(i13), new float[0]);
        }
        return arrayList;
    }
}
