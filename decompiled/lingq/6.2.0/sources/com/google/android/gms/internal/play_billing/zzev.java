package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC3393o1;
import p000.m9c;
import p000.tdd;
import p000.ux5;
import p000.v63;
import p000.vk0;
import p000.w1c;
import p000.wq1;
import p000.z3c;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzev implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final zzev f12230b = new zzet(m9c.f50824b);

    /* JADX INFO: renamed from: a */
    public int f12231a;

    static {
        int i = w1c.f66234a;
    }

    /* JADX INFO: renamed from: l */
    public static int m5685l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            v63.m23143u(ux5.m22989l("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            v63.m23143u(wq1.m24115k("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        v63.m23143u(wq1.m24115k("End index: ", i2, i3, " >= "));
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static zzev m5686m(byte[] bArr, int i, int i2) {
        try {
            m5685l(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new zzet(bArr2);
        } catch (zzgc e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m5687n(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        m5685l(i, i4, bArr.length);
        m5685l(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public abstract byte mo5678d(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzev)) {
            return false;
        }
        zzev zzevVar = (zzev) obj;
        int iMo5681h = mo5681h();
        if (iMo5681h != zzevVar.mo5681h()) {
            return false;
        }
        if (iMo5681h == 0) {
            return true;
        }
        int i = this.f12231a;
        int i2 = zzevVar.f12231a;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo5684k(zzevVar);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract byte mo5679f(int i);

    /* JADX INFO: renamed from: g */
    public abstract int mo5680g(int i, int i2);

    /* JADX INFO: renamed from: h */
    public abstract int mo5681h();

    public final int hashCode() {
        int iMo5680g = this.f12231a;
        if (iMo5680g == 0) {
            int iMo5681h = mo5681h();
            iMo5680g = mo5680g(iMo5681h, iMo5681h);
            if (iMo5680g == 0) {
                iMo5680g = 1;
            }
            this.f12231a = iMo5680g;
        }
        return iMo5680g;
    }

    /* JADX INFO: renamed from: i */
    public abstract zzev mo5682i(int i, int i2);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new vk0(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo5683j(z3c z3cVar);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo5684k(zzev zzevVar);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(mo5681h(), "<ByteString@", hexString, " size=", " contents=\""), mo5681h() <= 50 ? tdd.m21967b(this) : tdd.m21967b(mo5682i(0, 47)).concat("..."), "\">");
    }
}
