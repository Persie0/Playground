package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f8c {
    /* JADX INFO: renamed from: b */
    public static final void m11601b(f8c f8cVar, byte[] bArr, int i) {
        try {
            jh9 jh9Var = new jh9(i, bArr);
            f8cVar.mo11602a(jh9Var);
            ByteBuffer byteBuffer = (ByteBuffer) jh9Var.f45552b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e) {
            ij6.m13958p("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11602a(jh9 jh9Var);

    /* JADX INFO: renamed from: c */
    public final int m11603c() {
        int iM14463r;
        int[] iArr;
        mec mecVar = (mec) this;
        String str = mecVar.f51237l;
        String str2 = mecVar.f51234i;
        String str3 = mecVar.f51233h;
        String str4 = mecVar.f51232g;
        byte[] bArr = mecVar.f51230e;
        long j = mecVar.f51226a;
        int i = 0;
        if (j != 0) {
            iM14463r = jh9.m14465v(j) + jh9.m14466w(1);
        } else {
            iM14463r = 0;
        }
        qec[] qecVarArr = mecVar.f51229d;
        if (qecVarArr != null && qecVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                qec[] qecVarArr2 = mecVar.f51229d;
                if (i2 >= qecVarArr2.length) {
                    break;
                }
                qec qecVar = qecVarArr2[i2];
                i2++;
            }
        }
        byte[] bArr2 = myc.f52054b;
        if (!Arrays.equals(bArr, bArr2)) {
            iM14463r += jh9.m14467x(bArr.length) + bArr.length + jh9.m14466w(4);
        }
        if (!Arrays.equals(mecVar.f51231f, bArr2)) {
            byte[] bArr3 = mecVar.f51231f;
            iM14463r += jh9.m14467x(bArr3.length) + bArr3.length + jh9.m14466w(6);
        }
        if (str4 != null && !str4.equals("")) {
            iM14463r += jh9.m14463r(8, str4);
        }
        int i3 = mecVar.f51228c;
        if (i3 != 0) {
            iM14463r += (i3 >= 0 ? jh9.m14467x(i3) : 10) + jh9.m14466w(11);
        }
        if (str3 != null && !str3.equals("")) {
            iM14463r += jh9.m14463r(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            iM14463r += jh9.m14463r(14, str2);
        }
        long j2 = mecVar.f51235j;
        if (j2 != 180000) {
            iM14463r += jh9.m14465v((j2 >> 63) ^ (j2 << 1)) + jh9.m14466w(15);
        }
        long j3 = mecVar.f51227b;
        if (j3 != 0) {
            iM14463r += jh9.m14465v(j3) + jh9.m14466w(17);
        }
        if (!Arrays.equals(mecVar.f51236k, bArr2)) {
            byte[] bArr4 = mecVar.f51236k;
            iM14463r += jh9.m14467x(bArr4.length) + bArr4.length + jh9.m14466w(18);
        }
        int[] iArr2 = mecVar.f51224H;
        if (iArr2 != null && iArr2.length > 0) {
            int iM14467x = 0;
            while (true) {
                iArr = mecVar.f51224H;
                if (i >= iArr.length) {
                    break;
                }
                int i4 = iArr[i];
                iM14467x += i4 >= 0 ? jh9.m14467x(i4) : 10;
                i++;
            }
            iM14463r = iM14463r + iM14467x + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            iM14463r += jh9.m14463r(24, str);
        }
        return mecVar.f51225I ? jh9.m14466w(25) + 1 + iM14463r : iM14463r;
    }

    /* JADX INFO: renamed from: d */
    public final f8c m11604d() {
        f8c f8cVar = (f8c) super.clone();
        Object obj = a9c.f391a;
        return f8cVar;
    }

    public final String toString() {
        String strValueOf;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            odd.m17942b(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            strValueOf = String.valueOf(e.getMessage());
            if (strValueOf.length() == 0) {
                return new String("Error printing proto: ");
            }
            return "Error printing proto: ".concat(strValueOf);
        } catch (InvocationTargetException e2) {
            strValueOf = String.valueOf(e2.getMessage());
            if (strValueOf.length() == 0) {
                return new String("Error printing proto: ");
            }
            return "Error printing proto: ".concat(strValueOf);
        }
    }
}
