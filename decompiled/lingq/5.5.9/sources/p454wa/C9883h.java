package p454wa;

import java.io.IOException;
import java.io.InputStream;
import p479xa.C10129a;

/* JADX INFO: renamed from: wa.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9883h extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9882g f50430a;

    /* JADX INFO: renamed from: b */
    public final C9884i f50431b;

    /* JADX INFO: renamed from: d */
    public boolean f50433d = false;

    /* JADX INFO: renamed from: e */
    public boolean f50434e = false;

    /* JADX INFO: renamed from: c */
    public final byte[] f50432c = new byte[1];

    public C9883h(InterfaceC9882g interfaceC9882g, C9884i c9884i) {
        this.f50430a = interfaceC9882g;
        this.f50431b = c9884i;
    }

    /* JADX INFO: renamed from: a */
    public final void m18380a() throws IOException {
        if (!this.f50433d) {
            this.f50430a.mo7273e(this.f50431b);
            this.f50433d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f50434e) {
            return;
        }
        this.f50430a.close();
        this.f50434e = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f50432c;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        C10129a.m18992d(!this.f50434e);
        m18380a();
        int i12 = this.f50430a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        return i12;
    }
}
