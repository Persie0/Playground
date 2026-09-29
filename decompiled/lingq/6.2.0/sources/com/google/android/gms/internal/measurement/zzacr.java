package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC3393o1;
import p000.dhb;
import p000.kcd;
import p000.kib;
import p000.nhb;
import p000.vk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzacr implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final zzacr f11869b = new zzacq(kib.f47356a);

    /* JADX INFO: renamed from: a */
    public int f11870a;

    static {
        int i = dhb.f35664a;
    }

    /* JADX INFO: renamed from: l */
    public static zzacr m5430l(byte[] bArr, int i, int i2) {
        try {
            return m5431m(bArr, i, i2);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static zzacr m5431m(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return f11869b;
        }
        m5432o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzacq(bArr2);
    }

    /* JADX INFO: renamed from: o */
    public static int m5432o(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m5433r(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        m5432o(i, i4, bArr.length);
        m5432o(i2, i3 + i2, bArr2.length);
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
    public abstract byte mo5421d(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacrVar = (zzacr) obj;
        int iMo5422f = mo5422f();
        if (iMo5422f != zzacrVar.mo5422f()) {
            return false;
        }
        if (iMo5422f == 0) {
            return true;
        }
        int i = this.f11870a;
        int i2 = zzacrVar.f11870a;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo5426j(zzacrVar);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo5422f();

    /* JADX INFO: renamed from: g */
    public abstract zzacr mo5423g(int i, int i2);

    /* JADX INFO: renamed from: h */
    public abstract void mo5424h(int i, byte[] bArr);

    public final int hashCode() {
        int iMo5427k = this.f11870a;
        if (iMo5427k == 0) {
            int iMo5422f = mo5422f();
            iMo5427k = mo5427k(iMo5422f, iMo5422f);
            if (iMo5427k == 0) {
                iMo5427k = 1;
            }
            this.f11870a = iMo5427k;
        }
        return iMo5427k;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo5425i(nhb nhbVar);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new vk0(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo5426j(zzacr zzacrVar);

    /* JADX INFO: renamed from: k */
    public abstract int mo5427k(int i, int i2);

    /* JADX INFO: renamed from: n */
    public final byte[] m5434n() {
        int iMo5422f = mo5422f();
        if (iMo5422f == 0) {
            return kib.f47356a;
        }
        byte[] bArr = new byte[iMo5422f];
        mo5424h(iMo5422f, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(mo5422f(), "<ByteString@", hexString, " size=", " contents=\""), mo5422f() <= 50 ? kcd.m15123c(m5434n()) : kcd.m15123c(mo5423g(0, 47).m5434n()).concat("..."), "\">");
    }
}
