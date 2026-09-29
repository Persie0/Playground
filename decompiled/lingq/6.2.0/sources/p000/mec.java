package p000;

import com.google.android.gms.internal.clearcut.zzft;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mec extends f8c implements Cloneable {

    /* JADX INFO: renamed from: H */
    public int[] f51224H;

    /* JADX INFO: renamed from: I */
    public boolean f51225I;

    /* JADX INFO: renamed from: a */
    public long f51226a;

    /* JADX INFO: renamed from: b */
    public long f51227b;

    /* JADX INFO: renamed from: c */
    public int f51228c;

    /* JADX INFO: renamed from: d */
    public qec[] f51229d;

    /* JADX INFO: renamed from: e */
    public byte[] f51230e;

    /* JADX INFO: renamed from: f */
    public byte[] f51231f;

    /* JADX INFO: renamed from: g */
    public String f51232g;

    /* JADX INFO: renamed from: h */
    public String f51233h;

    /* JADX INFO: renamed from: i */
    public String f51234i;

    /* JADX INFO: renamed from: j */
    public long f51235j;

    /* JADX INFO: renamed from: k */
    public byte[] f51236k;

    /* JADX INFO: renamed from: l */
    public String f51237l;

    @Override // p000.f8c
    /* JADX INFO: renamed from: a */
    public final void mo11602a(jh9 jh9Var) throws zzft {
        String str = this.f51237l;
        String str2 = this.f51234i;
        String str3 = this.f51233h;
        String str4 = this.f51232g;
        byte[] bArr = this.f51230e;
        long j = this.f51226a;
        if (j != 0) {
            jh9Var.m14481s(1, 0);
            jh9Var.m14482u(j);
        }
        qec[] qecVarArr = this.f51229d;
        if (qecVarArr != null && qecVarArr.length > 0) {
            int i = 0;
            while (true) {
                qec[] qecVarArr2 = this.f51229d;
                if (i >= qecVarArr2.length) {
                    break;
                }
                qec qecVar = qecVarArr2[i];
                i++;
            }
        }
        byte[] bArr2 = myc.f52054b;
        if (!Arrays.equals(bArr, bArr2)) {
            jh9Var.m14477n(4, bArr);
        }
        if (!Arrays.equals(this.f51231f, bArr2)) {
            jh9Var.m14477n(6, this.f51231f);
        }
        if (str4 != null && !str4.equals("")) {
            jh9Var.m14476m(8, str4);
        }
        int i2 = this.f51228c;
        if (i2 != 0) {
            jh9Var.m14481s(11, 0);
            if (i2 >= 0) {
                jh9Var.m14480q(i2);
            } else {
                jh9Var.m14482u(i2);
            }
        }
        if (str3 != null && !str3.equals("")) {
            jh9Var.m14476m(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            jh9Var.m14476m(14, str2);
        }
        long j2 = this.f51235j;
        if (j2 != 180000) {
            jh9Var.m14481s(15, 0);
            jh9Var.m14482u((j2 >> 63) ^ (j2 << 1));
        }
        long j3 = this.f51227b;
        if (j3 != 0) {
            jh9Var.m14481s(17, 0);
            jh9Var.m14482u(j3);
        }
        if (!Arrays.equals(this.f51236k, bArr2)) {
            jh9Var.m14477n(18, this.f51236k);
        }
        int[] iArr = this.f51224H;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f51224H;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i3];
                jh9Var.m14481s(20, 0);
                if (i4 >= 0) {
                    jh9Var.m14480q(i4);
                } else {
                    jh9Var.m14482u(i4);
                }
                i3++;
            }
        }
        if (str != null && !str.equals("")) {
            jh9Var.m14476m(24, str);
        }
        boolean z = this.f51225I;
        if (z) {
            jh9Var.m14481s(25, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) jh9Var.f45552b;
            if (!byteBuffer.hasRemaining()) {
                throw new zzft(byteBuffer.position(), byteBuffer.limit());
            }
            byteBuffer.put(b);
        }
    }

    public final Object clone() {
        try {
            mec mecVar = (mec) m11604d();
            qec[] qecVarArr = this.f51229d;
            if (qecVarArr != null && qecVarArr.length > 0) {
                mecVar.f51229d = new qec[qecVarArr.length];
                int i = 0;
                while (true) {
                    qec[] qecVarArr2 = this.f51229d;
                    if (i >= qecVarArr2.length) {
                        break;
                    }
                    qec qecVar = qecVarArr2[i];
                    i++;
                }
            }
            int[] iArr = this.f51224H;
            if (iArr != null && iArr.length > 0) {
                mecVar.f51224H = (int[]) iArr.clone();
            }
            return mecVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mec)) {
            return false;
        }
        mec mecVar = (mec) obj;
        if (this.f51226a != mecVar.f51226a || this.f51227b != mecVar.f51227b || this.f51228c != mecVar.f51228c) {
            return false;
        }
        qec[] qecVarArr = this.f51229d;
        qec[] qecVarArr2 = mecVar.f51229d;
        Object obj2 = a9c.f391a;
        int length = qecVarArr == null ? 0 : qecVarArr.length;
        int length2 = qecVarArr2 == null ? 0 : qecVarArr2.length;
        int i = 0;
        while (i < length) {
            qec qecVar = qecVarArr[i];
            i++;
        }
        int i2 = 0;
        while (i2 < length2) {
            qec qecVar2 = qecVarArr2[i2];
            i2++;
        }
        boolean z = i >= length;
        boolean z2 = i2 >= length2;
        if (!z || !z2) {
            if (z != z2) {
                return false;
            }
            qec qecVar3 = qecVarArr[i];
            qec qecVar4 = qecVarArr2[i2];
            throw null;
        }
        if (!Arrays.equals(this.f51230e, mecVar.f51230e) || !Arrays.equals(this.f51231f, mecVar.f51231f)) {
            return false;
        }
        String str = this.f51232g;
        String str2 = mecVar.f51232g;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.f51233h;
        String str4 = mecVar.f51233h;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        String str5 = this.f51234i;
        String str6 = mecVar.f51234i;
        if (str5 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str5.equals(str6)) {
            return false;
        }
        if (this.f51235j != mecVar.f51235j || !Arrays.equals(this.f51236k, mecVar.f51236k)) {
            return false;
        }
        String str7 = this.f51237l;
        String str8 = mecVar.f51237l;
        if (str7 == null) {
            if (str8 != null) {
                return false;
            }
        } else if (!str7.equals(str8)) {
            return false;
        }
        int[] iArr = this.f51224H;
        int[] iArr2 = mecVar.f51224H;
        if (iArr == null || iArr.length == 0) {
            zEquals = iArr2 == null || iArr2.length == 0;
        } else {
            zEquals = Arrays.equals(iArr, iArr2);
        }
        return zEquals && this.f51225I == mecVar.f51225I;
    }

    public final int hashCode() {
        int iHashCode = (mec.class.getName().hashCode() + 527) * 31;
        long j = this.f51226a;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f51227b;
        int i2 = ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 29791) + this.f51228c) * 29791) + 1237;
        qec[] qecVarArr = this.f51229d;
        Object obj = a9c.f391a;
        int iHashCode2 = 0;
        int length = qecVarArr == null ? 0 : qecVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            qec qecVar = qecVarArr[i3];
        }
        int iHashCode3 = (Arrays.hashCode(this.f51231f) + ((Arrays.hashCode(this.f51230e) + (i2 * 961)) * 961)) * 31;
        String str = this.f51232g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51233h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.f51234i;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        long j3 = this.f51235j;
        int iHashCode7 = (Arrays.hashCode(this.f51236k) + ((((iHashCode5 + iHashCode6) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 961)) * 31;
        String str4 = this.f51237l;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 961;
        int[] iArr = this.f51224H;
        if (iArr != null && iArr.length != 0) {
            iHashCode2 = Arrays.hashCode(iArr);
        }
        return (((iHashCode8 + iHashCode2) * 29791) + (this.f51225I ? 1231 : 1237)) * 31;
    }
}
