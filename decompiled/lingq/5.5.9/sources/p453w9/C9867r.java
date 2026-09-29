package p453w9;

import java.util.Arrays;
import p479xa.C10129a;

/* JADX INFO: renamed from: w9.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9867r {

    /* JADX INFO: renamed from: a */
    public final int f50360a;

    /* JADX INFO: renamed from: b */
    public boolean f50361b;

    /* JADX INFO: renamed from: c */
    public boolean f50362c;

    /* JADX INFO: renamed from: d */
    public byte[] f50363d;

    /* JADX INFO: renamed from: e */
    public int f50364e;

    public C9867r(int i10) {
        this.f50360a = i10;
        byte[] bArr = new byte[131];
        this.f50363d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m18361a(byte[] bArr, int i10, int i11) {
        if (this.f50361b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f50363d;
            int length = bArr2.length;
            int i13 = this.f50364e;
            if (length < i13 + i12) {
                this.f50363d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f50363d, this.f50364e, i12);
            this.f50364e += i12;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18362b(int i10) {
        if (!this.f50361b) {
            return false;
        }
        this.f50364e -= i10;
        this.f50361b = false;
        this.f50362c = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m18363c() {
        this.f50361b = false;
        this.f50362c = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m18364d(int i10) {
        C10129a.m18992d(!this.f50361b);
        boolean z10 = i10 == this.f50360a;
        this.f50361b = z10;
        if (z10) {
            this.f50364e = 3;
            this.f50362c = false;
        }
    }
}
