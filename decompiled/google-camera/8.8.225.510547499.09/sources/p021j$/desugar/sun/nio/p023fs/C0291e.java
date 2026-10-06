package p021j$.desugar.sun.nio.p023fs;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Set;
import p021j$.nio.file.EnumC0315D;
import p021j$.nio.file.Path;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.e */
/* JADX INFO: loaded from: classes3.dex */
final class C0291e extends FileChannel implements SeekableByteChannel {

    /* JADX INFO: renamed from: a */
    final FileChannel f32777a;

    /* JADX INFO: renamed from: b */
    final boolean f32778b;

    /* JADX INFO: renamed from: c */
    final boolean f32779c;

    /* JADX INFO: renamed from: d */
    final Path f32780d;

    private C0291e(FileChannel fileChannel, boolean z, boolean z2, Path path) {
        this.f32777a = fileChannel;
        this.f32778b = z;
        this.f32779c = z2;
        this.f32780d = z ? path : null;
    }

    /* JADX INFO: renamed from: b */
    public static FileChannel m11976b(FileChannel fileChannel, Set set, Path path) {
        if (fileChannel instanceof C0291e) {
            fileChannel = ((C0291e) fileChannel).f32777a;
        }
        return new C0291e(fileChannel, set.contains(EnumC0315D.DELETE_ON_CLOSE), set.contains(EnumC0315D.APPEND), path);
    }

    /* JADX INFO: renamed from: c */
    public static FileChannel m11977c(FileChannel fileChannel) {
        return fileChannel instanceof C0291e ? fileChannel : new C0291e(fileChannel, false, false, null);
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z) throws IOException {
        this.f32777a.force(z);
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() throws IOException {
        this.f32777a.close();
        if (this.f32778b) {
            this.f32780d.toFile().delete();
        }
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock lock(long j, long j2, boolean z) throws IOException {
        FileLock fileLockLock = this.f32777a.lock(j, j2, z);
        if (fileLockLock == null) {
            return null;
        }
        return new C0292f(fileLockLock, this);
    }

    @Override // java.nio.channels.FileChannel
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j, long j2) {
        return this.f32777a.map(mapMode, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final long position() {
        return this.f32777a.position();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f32777a.read(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel
    public final long size() {
        return this.f32777a.size();
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(ReadableByteChannel readableByteChannel, long j, long j2) {
        return this.f32777a.transferFrom(readableByteChannel, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.f32777a.transferTo(j, j2, writableByteChannel);
    }

    @Override // java.nio.channels.FileChannel
    public final FileChannel truncate(long j) {
        return m11977c(this.f32777a.truncate(j));
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock tryLock(long j, long j2, boolean z) throws IOException {
        FileLock fileLockTryLock = this.f32777a.tryLock(j, j2, z);
        if (fileLockTryLock == null) {
            return null;
        }
        return new C0292f(fileLockTryLock, this);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        boolean z = this.f32779c;
        FileChannel fileChannel = this.f32777a;
        return z ? fileChannel.write(byteBuffer, size()) : fileChannel.write(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel
    public final FileChannel position(long j) {
        return m11977c(this.f32777a.position(j));
    }

    @Override // java.nio.channels.FileChannel
    public final int read(ByteBuffer byteBuffer, long j) {
        return this.f32777a.read(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel
    public final int write(ByteBuffer byteBuffer, long j) {
        return this.f32777a.write(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.f32777a.read(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.f32777a.write(byteBufferArr, i, i2);
    }
}
