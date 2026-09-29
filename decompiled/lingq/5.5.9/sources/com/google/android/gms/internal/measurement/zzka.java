package com.google.android.gms.internal.measurement;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzka implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final zzka f14563b = new zzjx(C2849t6.f14440b);

    /* JADX INFO: renamed from: a */
    public int f14564a = 0;

    static {
        int i10 = C2783o5.f14362a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: G */
    public static int m8498G(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(C0166e.m762h("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(C0204c.m851j("End index: ", i11, " >= ", i12));
    }

    /* JADX INFO: renamed from: Q */
    public static zzka m8499Q(byte[] bArr, int i10, int i11) {
        m8498G(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzjx(bArr2);
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo8493C(AbstractC2887w5 abstractC2887w5) throws IOException;

    /* JADX INFO: renamed from: D */
    public abstract boolean mo8494D();

    /* JADX INFO: renamed from: a */
    public abstract byte mo8490a(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iMo8495s = this.f14564a;
        if (iMo8495s == 0) {
            int iMo8492q = mo8492q();
            iMo8495s = mo8495s(iMo8492q, iMo8492q);
            if (iMo8495s == 0) {
                iMo8495s = 1;
            }
            this.f14564a = iMo8495s;
        }
        return iMo8495s;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2835s5(this);
    }

    /* JADX INFO: renamed from: l */
    public abstract byte mo8491l(int i10);

    /* JADX INFO: renamed from: q */
    public abstract int mo8492q();

    /* JADX INFO: renamed from: s */
    public abstract int mo8495s(int i10, int i11);

    /* JADX INFO: renamed from: t */
    public abstract zzka mo8496t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo8492q());
        objArr[2] = mo8492q() <= 50 ? C0062b.m267F2(this) : C0062b.m267F2(mo8496t()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: renamed from: y */
    public abstract String mo8497y(Charset charset);
}
