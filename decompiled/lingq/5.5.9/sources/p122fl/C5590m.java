package p122fl;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: fl.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C5590m extends AbstractC5588k {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f34399a;

    public C5590m(FileOutputStream fileOutputStream) throws IOException {
        this.f34399a = fileOutputStream;
        fileOutputStream.getChannel().position(0L);
    }

    @Override // p122fl.AbstractC5588k
    /* JADX INFO: renamed from: a */
    public final void mo11840a(long j10) throws IOException {
        this.f34399a.getChannel().position(j10);
    }

    @Override // p122fl.AbstractC5588k
    /* JADX INFO: renamed from: b */
    public final void mo11841b(byte[] bArr, int i10) throws IOException {
        this.f34399a.write(bArr, 0, i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34399a.close();
    }

    @Override // p122fl.AbstractC5588k
    public final void flush() throws IOException {
        this.f34399a.flush();
    }
}
