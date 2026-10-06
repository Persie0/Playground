package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbb extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ pbc f47310a;

    public pbb(pbc pbcVar) {
        this.f47310a = pbcVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        pbc pbcVar = this.f47310a;
        if (pbcVar.f47313c) {
            throw new IOException("closed");
        }
        return (int) Math.min(pbcVar.f47312b.f47299b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47310a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        pbc pbcVar = this.f47310a;
        if (pbcVar.f47313c) {
            throw new IOException("closed");
        }
        pau pauVar = pbcVar.f47312b;
        if (pauVar.f47299b == 0 && pbcVar.f47311a.mo19277t(pauVar) == -1) {
            return -1;
        }
        return this.f47310a.f47312b.m19259b() & 255;
    }

    public final String toString() {
        pbc pbcVar = this.f47310a;
        StringBuilder sb = new StringBuilder();
        sb.append(pbcVar);
        sb.append(".inputStream()");
        return pbcVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (this.f47310a.f47313c) {
            throw new IOException("closed");
        }
        lku.m15624S(bArr.length, i, i2);
        pbc pbcVar = this.f47310a;
        pau pauVar = pbcVar.f47312b;
        if (pauVar.f47299b == 0 && pbcVar.f47311a.mo19277t(pauVar) == -1) {
            return -1;
        }
        return this.f47310a.f47312b.m19260c(bArr, i, i2);
    }
}
