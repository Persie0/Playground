package p000;

import androidx.media3.common.C0713b;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class ug2 implements n8a {

    /* JADX INFO: renamed from: a */
    public final byte[] f63880a = new byte[4096];

    @Override // p000.n8a
    /* JADX INFO: renamed from: a */
    public final void mo2531a(long j, int i, int i2, int i3, m8a m8aVar) {
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: b */
    public final void mo2532b(k47 k47Var, int i, int i2) {
        k47Var.m14819N(i);
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: f */
    public final int mo2536f(h02 h02Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.f63880a;
        int i2 = h02Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: g */
    public final void mo2537g(C0713b c0713b) {
    }
}
