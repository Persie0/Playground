package p261m9;

import com.google.android.exoplayer2.C2416m;
import java.io.EOFException;
import java.io.IOException;
import p454wa.InterfaceC9880e;
import p479xa.C10151t;

/* JADX INFO: renamed from: m9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7506g implements InterfaceC7522w {

    /* JADX INFO: renamed from: a */
    public final byte[] f41489a = new byte[4096];

    @Override // p261m9.InterfaceC7522w
    /* JADX INFO: renamed from: a */
    public final int mo7385a(InterfaceC9880e interfaceC9880e, int i10, boolean z10) throws IOException {
        byte[] bArr = this.f41489a;
        int i11 = interfaceC9880e.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p261m9.InterfaceC7522w
    /* JADX INFO: renamed from: b */
    public final void mo7386b(int i10, C10151t c10151t) {
        c10151t.m19125F(i10);
    }

    @Override // p261m9.InterfaceC7522w
    /* JADX INFO: renamed from: e */
    public final void mo7387e(long j10, int i10, int i11, int i12, InterfaceC7522w.a aVar) {
    }

    @Override // p261m9.InterfaceC7522w
    /* JADX INFO: renamed from: f */
    public final void mo7388f(C2416m c2416m) {
    }
}
