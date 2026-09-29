package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC3393o1;
import p000.a3d;
import p000.gna;
import p000.led;
import p000.noc;
import p000.sic;
import p000.vk0;
import p000.wfc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzht implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b */
    public static final zzht f12293b = new zzid(noc.f53083b);

    /* JADX INFO: renamed from: c */
    public static final sic f12294c;

    /* JADX INFO: renamed from: a */
    public int f12295a;

    static {
        f12294c = wfc.m23932a() ? new a3d() : new gna();
    }

    /* JADX INFO: renamed from: g */
    public static zzht m5829g(byte[] bArr, int i, int i2) {
        m5830i(i, i + i2, bArr.length);
        return new zzid(f12294c.mo83c(bArr, i, i2));
    }

    /* JADX INFO: renamed from: i */
    public static int m5830i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: renamed from: d */
    public abstract byte mo5831d(int i);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo5832f();

    /* JADX INFO: renamed from: h */
    public abstract byte mo5833h(int i);

    public final int hashCode() {
        int i = this.f12295a;
        if (i != 0) {
            return i;
        }
        int iMo5832f = mo5832f();
        zzid zzidVar = (zzid) this;
        int iMo5834j = zzidVar.mo5834j();
        int i2 = iMo5832f;
        for (int i3 = iMo5834j; i3 < iMo5834j + iMo5832f; i3++) {
            i2 = (i2 * 31) + zzidVar.f12298d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f12295a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new vk0(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo5832f = mo5832f();
        if (mo5832f() <= 50) {
            strConcat = led.m16157b(this);
        } else {
            zzid zzidVar = (zzid) this;
            int iM5830i = m5830i(0, 47, zzidVar.mo5832f());
            strConcat = led.m16157b(iM5830i == 0 ? f12293b : new zzhw(zzidVar.f12298d, zzidVar.mo5834j(), iM5830i)).concat("...");
        }
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(iMo5832f, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
