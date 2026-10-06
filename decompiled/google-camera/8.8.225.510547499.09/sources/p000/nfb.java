package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfb extends nfc implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final byte[] f42168a;

    public nfb(byte[] bArr) {
        bArr.getClass();
        this.f42168a = bArr;
    }

    @Override // p000.nfc
    /* JADX INFO: renamed from: a */
    public final int mo17436a() {
        int length = this.f42168a.length;
        lku.m15615J(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.f42168a;
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // p000.nfc
    /* JADX INFO: renamed from: b */
    public final int mo17437b() {
        return this.f42168a.length * 8;
    }

    @Override // p000.nfc
    /* JADX INFO: renamed from: c */
    public final boolean mo17438c(nfc nfcVar) {
        if (this.f42168a.length != nfcVar.mo17439d().length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.f42168a;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == nfcVar.mo17439d()[i];
            i++;
        }
    }

    @Override // p000.nfc
    /* JADX INFO: renamed from: d */
    public final byte[] mo17439d() {
        return this.f42168a;
    }
}
