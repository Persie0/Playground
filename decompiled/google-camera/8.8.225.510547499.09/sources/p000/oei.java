package p000;

import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oei implements oeh {

    /* JADX INFO: renamed from: a */
    private final RandomAccessFile f45734a;

    /* JADX INFO: renamed from: b */
    private long f45735b = 0;

    /* JADX INFO: renamed from: c */
    private long f45736c = 0;

    public oei(File file) {
        this.f45734a = new RandomAccessFile(file, "r");
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: a */
    public final synchronized int mo18407a(byte[] bArr, int i, int i2) {
        lku.m15670x(65536 - i >= i2, "Buffer length must be greater than desired number of bytes.");
        if (i2 == 0) {
            return 0;
        }
        if (this.f45736c != this.f45734a.getFilePointer()) {
            this.f45734a.seek(this.f45736c);
        }
        int i3 = this.f45734a.read(bArr, i, i2);
        if (i3 == -1) {
            return 0;
        }
        this.f45736c += (long) i3;
        return i3;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: b */
    public final synchronized long mo18408b() {
        return this.f45735b;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: c */
    public final synchronized long mo18409c() {
        return this.f45736c;
    }

    @Override // p000.oeh, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f45734a.close();
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: d */
    public final synchronized long mo18410d() {
        try {
        } catch (IOException e) {
            return -1L;
        }
        return this.f45734a.length();
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: e */
    public final synchronized void mo18411e() {
        this.f45735b = this.f45736c;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: f */
    public final synchronized void mo18412f() {
        this.f45736c = this.f45735b;
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: g */
    public final synchronized boolean mo18413g() {
        return this.f45736c < this.f45734a.length();
    }

    @Override // p000.oeh
    /* JADX INFO: renamed from: h */
    public final synchronized void mo18414h(long j) {
        lku.m15670x(j >= 0, CswIK.fsSS);
        if (j == 0) {
            return;
        }
        long jMin = Math.min(this.f45736c + j, this.f45734a.length());
        this.f45734a.seek(jMin);
        this.f45736c = jMin;
    }
}
