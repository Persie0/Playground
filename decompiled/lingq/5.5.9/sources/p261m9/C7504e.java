package p261m9;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p150h9.C5941x;
import p454wa.InterfaceC9880e;
import p479xa.C10134c0;

/* JADX INFO: renamed from: m9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7504e implements InterfaceC7508i {

    /* JADX INFO: renamed from: b */
    public final InterfaceC9880e f41475b;

    /* JADX INFO: renamed from: c */
    public final long f41476c;

    /* JADX INFO: renamed from: d */
    public long f41477d;

    /* JADX INFO: renamed from: f */
    public int f41479f;

    /* JADX INFO: renamed from: g */
    public int f41480g;

    /* JADX INFO: renamed from: e */
    public byte[] f41478e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f41474a = new byte[4096];

    static {
        C5941x.m12374a("goog.exo.extractor");
    }

    public C7504e(InterfaceC9880e interfaceC9880e, long j10, long j11) {
        this.f41475b = interfaceC9880e;
        this.f41477d = j10;
        this.f41476c = j11;
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: a */
    public final long mo14992a() {
        return this.f41476c;
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: b */
    public final boolean mo14993b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iMin;
        int i12 = this.f41480g;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f41478e, 0, bArr, i10, iMin);
            m15006s(iMin);
        }
        int iM15004q = iMin;
        while (iM15004q < i11 && iM15004q != -1) {
            iM15004q = m15004q(bArr, i10, i11, iM15004q, z10);
        }
        if (iM15004q != -1) {
            this.f41477d += (long) iM15004q;
        }
        return iM15004q != -1;
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: c */
    public final boolean mo14994c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!m15001n(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f41478e, this.f41479f - i11, bArr, i10, i11);
        return true;
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: d */
    public final long mo14995d() {
        return this.f41477d + ((long) this.f41479f);
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: f */
    public final void mo14996f(int i10) throws IOException {
        m15001n(i10, false);
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: i */
    public final void mo14997i() {
        this.f41479f = 0;
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: j */
    public final void mo14998j(int i10) throws IOException {
        int iMin = Math.min(this.f41480g, i10);
        m15006s(iMin);
        int iM15004q = iMin;
        while (iM15004q < i10 && iM15004q != -1) {
            iM15004q = m15004q(this.f41474a, -iM15004q, Math.min(i10, this.f41474a.length + iM15004q), iM15004q, false);
        }
        if (iM15004q != -1) {
            this.f41477d += (long) iM15004q;
        }
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: l */
    public final void mo14999l(byte[] bArr, int i10, int i11) throws IOException {
        mo14994c(bArr, i10, i11, false);
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: m */
    public final long mo15000m() {
        return this.f41477d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m15001n(int i10, boolean z10) throws IOException {
        m15002o(i10);
        int iM15004q = this.f41480g - this.f41479f;
        while (iM15004q < i10) {
            iM15004q = m15004q(this.f41478e, this.f41479f, i10, iM15004q, z10);
            if (iM15004q == -1) {
                return false;
            }
            this.f41480g = this.f41479f + iM15004q;
        }
        this.f41479f += i10;
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m15002o(int i10) {
        int i11 = this.f41479f + i10;
        byte[] bArr = this.f41478e;
        if (i11 > bArr.length) {
            this.f41478e = Arrays.copyOf(this.f41478e, C10134c0.m19041h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m15003p(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        m15002o(i11);
        int i12 = this.f41480g;
        int i13 = this.f41479f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = m15004q(this.f41478e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f41480g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f41478e, this.f41479f, bArr, i10, iMin);
        this.f41479f += iMin;
        return iMin;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final int m15004q(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f41475b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: r */
    public final int m15005r(int i10) throws IOException {
        int iMin = Math.min(this.f41480g, i10);
        m15006s(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f41474a;
            iMin = m15004q(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f41477d += (long) iMin;
        }
        return iMin;
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f41480g;
        int iM15004q = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f41478e, 0, bArr, i10, iMin);
            m15006s(iMin);
            iM15004q = iMin;
        }
        if (iM15004q == 0) {
            iM15004q = m15004q(bArr, i10, i11, 0, true);
        }
        if (iM15004q != -1) {
            this.f41477d += (long) iM15004q;
        }
        return iM15004q;
    }

    @Override // p261m9.InterfaceC7508i
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        mo14993b(bArr, i10, i11, false);
    }

    /* JADX INFO: renamed from: s */
    public final void m15006s(int i10) {
        int i11 = this.f41480g - i10;
        this.f41480g = i11;
        this.f41479f = 0;
        byte[] bArr = this.f41478e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f41478e = bArr2;
    }
}
