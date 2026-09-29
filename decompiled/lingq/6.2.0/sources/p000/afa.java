package p000;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public abstract class afa {
    /* JADX INFO: renamed from: a */
    public static final void m351a(gw9 gw9Var, kg7 kg7Var) {
        cn5 cn5Var = (cn5) gw9Var.f41432b;
        cn5Var.getClass();
        fpa fpaVar = (fpa) cn5Var.f10328c;
        fpa fpaVar2 = (fpa) cn5Var.f10327b;
        boolean zM4723h = ci8.m4723h(kg7Var);
        long j = kg7Var.f47236b;
        if (zM4723h) {
            b02[] b02VarArr = fpaVar2.f39437d;
            AbstractC3550rv.m20833a0(0, b02VarArr.length, null, b02VarArr);
            fpaVar2.f39438e = 0;
            b02[] b02VarArr2 = fpaVar.f39437d;
            AbstractC3550rv.m20833a0(0, b02VarArr2.length, null, b02VarArr2);
            fpaVar.f39438e = 0;
            cn5Var.f10326a = 0L;
        }
        if (!ci8.m4725j(kg7Var)) {
            List listM15190b = kg7Var.m15190b();
            int size = listM15190b.size();
            for (int i = 0; i < size; i++) {
                zt3 zt3Var = (zt3) listM15190b.get(i);
                cn5Var.m4896a(zt3Var.f72140a, gq6.m12825f(zt3Var.f72144e, 0L));
            }
            cn5Var.m4896a(j, gq6.m12825f(kg7Var.f47248n, 0L));
        }
        if (ci8.m4725j(kg7Var) && j - cn5Var.f10326a > 40) {
            b02[] b02VarArr3 = fpaVar2.f39437d;
            AbstractC3550rv.m20833a0(0, b02VarArr3.length, null, b02VarArr3);
            fpaVar2.f39438e = 0;
            b02[] b02VarArr4 = fpaVar.f39437d;
            AbstractC3550rv.m20833a0(0, b02VarArr4.length, null, b02VarArr4);
            fpaVar.f39438e = 0;
            cn5Var.f10326a = 0L;
        }
        cn5Var.f10326a = j;
    }

    /* JADX INFO: renamed from: b */
    public static final float m352b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: renamed from: c */
    public static final void m353c(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            oj5.m18040f().m18042a(x7b.f67907a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = x7b.f67908b;
            int iM15363P = AbstractC3194a.m15363P(strArr.length);
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            for (Map.Entry entry : AbstractC3194a.m15368U(linkedHashMap, new Pair(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        oj5.m18040f().m18046j(x7b.f67907a, "Over-writing contents of " + file2);
                    }
                    oj5.m18040f().m18042a(x7b.f67907a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m354d(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            i54.m13662a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fM352b = m352b(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fM352b);
                }
            }
            float fSqrt = (float) Math.sqrt(m352b(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : m352b(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM352b2 = m352b(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM352b2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM352b2 / fArr11[i14];
        }
    }

    /* JADX INFO: renamed from: e */
    public static final jea m355e(String str) {
        int i;
        ci8.m4727l(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (fa4.m11651m(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new jea(i2);
    }

    /* JADX INFO: renamed from: f */
    public static final oea m356f(String str) {
        str.getClass();
        ci8.m4727l(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (fa4.m11651m(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new oea(j);
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo357g();

    /* JADX INFO: renamed from: h */
    public abstract end mo358h(int i);

    /* JADX INFO: renamed from: i */
    public abstract Object mo359i(int i);

    /* JADX INFO: renamed from: j */
    public abstract Object mo360j(end endVar);
}
