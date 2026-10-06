package p000;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class krx extends FileOutputStream {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RandomAccessFile f37095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krx(FileDescriptor fileDescriptor, RandomAccessFile randomAccessFile) {
        super(fileDescriptor);
        this.f37095a = randomAccessFile;
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f37095a.close();
    }
}
