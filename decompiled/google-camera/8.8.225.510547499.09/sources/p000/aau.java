package p000;

import android.app.AppOpsManager;
import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aau {
    /* JADX INFO: renamed from: a */
    static int m52a(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static int m53b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static Object m54c(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: d */
    public static String m55d(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[Catch: NumberFormatException -> 0x00d1, TryCatch #0 {NumberFormatException -> 0x00d1, blocks: (B:35:0x007a, B:38:0x008d, B:40:0x0093, B:41:0x0097, B:55:0x00b3, B:57:0x00b8, B:60:0x00c9, B:61:0x00cc), top: B:69:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00c7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static acs[] m56e(String str) {
        String strTrim;
        float[] fArrM58g;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (((cCharAt - 'A') * (cCharAt - 'Z') > 0 && (cCharAt - 'a') * (cCharAt - 'z') > 0) || cCharAt == 'e' || cCharAt == 'E') {
                    i++;
                } else {
                    strTrim = str.substring(i2, i).trim();
                    if (strTrim.length() <= 0) {
                        if (strTrim.charAt(0) != 'z' || strTrim.charAt(0) == 'Z') {
                            fArrM58g = new float[0];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i3 = 1;
                                int i4 = 0;
                                while (i3 < length) {
                                    boolean z = false;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    for (int i5 = i3; i5 < strTrim.length(); i5++) {
                                        switch (strTrim.charAt(i5)) {
                                            case ' ':
                                            case ',':
                                                z2 = false;
                                                z3 = true;
                                                break;
                                            case '-':
                                                if (i5 == i3 || z2) {
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                    z3 = true;
                                                    z4 = true;
                                                }
                                                break;
                                            case '.':
                                                if (z) {
                                                    z = true;
                                                    z2 = false;
                                                    z3 = true;
                                                    z4 = true;
                                                } else {
                                                    z = true;
                                                    z2 = false;
                                                }
                                                break;
                                            case 'E':
                                            case 'e':
                                                z2 = true;
                                                break;
                                            default:
                                                z2 = false;
                                                break;
                                        }
                                        if (z3) {
                                            if (i3 < i5) {
                                                fArr[i4] = Float.parseFloat(strTrim.substring(i3, i5));
                                                i4++;
                                            }
                                            i3 = z4 ? i5 : i5 + 1;
                                        }
                                    }
                                    if (i3 < i5) {
                                        fArr[i4] = Float.parseFloat(strTrim.substring(i3, i5));
                                        i4++;
                                    }
                                    if (z4) {
                                    }
                                }
                                fArrM58g = m58g(fArr, i4);
                            } catch (NumberFormatException e) {
                                throw new RuntimeException("error in parsing \"" + strTrim + "\"", e);
                            }
                        }
                        m59h(arrayList, strTrim.charAt(0), fArrM58g);
                    }
                    i2 = i;
                    i++;
                }
            }
            strTrim = str.substring(i2, i).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(0) != 'z') {
                    fArrM58g = new float[0];
                } else {
                    fArrM58g = new float[0];
                }
                m59h(arrayList, strTrim.charAt(0), fArrM58g);
            }
            i2 = i;
            i++;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m59h(arrayList, str.charAt(i2), new float[0]);
        }
        return (acs[]) arrayList.toArray(new acs[arrayList.size()]);
    }

    /* JADX INFO: renamed from: f */
    public static acs[] m57f(acs[] acsVarArr) {
        if (acsVarArr == null) {
            return null;
        }
        acs[] acsVarArr2 = new acs[acsVarArr.length];
        for (int i = 0; i < acsVarArr.length; i++) {
            acsVarArr2[i] = new acs(acsVarArr[i]);
        }
        return acsVarArr2;
    }

    /* JADX INFO: renamed from: g */
    public static float[] m58g(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: h */
    private static void m59h(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new acs(c, fArr));
    }
}
