package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.util.Iterator;
import p000.btb;
import p000.dpb;
import p000.my5;
import p000.onb;
import p000.vk0;
import p000.x24;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbb implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b */
    public static final zzbb f11801b = new zzbi(btb.f8995b);

    /* JADX INFO: renamed from: c */
    public static final dpb f11802c;

    /* JADX INFO: renamed from: a */
    public int f11803a;

    static {
        f11802c = onb.m18176a() ? new my5(13) : new x24();
    }

    /* JADX INFO: renamed from: d */
    public static zzbb m5342d(byte[] bArr, int i, int i2) {
        return new zzbi(f11802c.mo10577c(bArr, i, i2));
    }

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract byte mo5343f(int i);

    public final int hashCode() {
        int i = this.f11803a;
        if (i != 0) {
            return i;
        }
        int size = size();
        zzbi zzbiVar = (zzbi) this;
        int iM5344g = zzbiVar.m5344g();
        int i2 = size;
        for (int i3 = iM5344g; i3 < iM5344g + size; i3++) {
            i2 = (i2 * 31) + zzbiVar.f11804d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f11803a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new vk0(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
