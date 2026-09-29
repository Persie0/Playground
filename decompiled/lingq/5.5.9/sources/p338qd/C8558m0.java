package p338qd;

import com.google.android.play.core.assetpacks.C3124o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: qd.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8558m0 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final C8529c1 f45920a = new C8529c1();

    /* JADX INFO: renamed from: b */
    public final File f45921b;

    /* JADX INFO: renamed from: c */
    public final C3124o f45922c;

    /* JADX INFO: renamed from: d */
    public long f45923d;

    /* JADX INFO: renamed from: e */
    public long f45924e;

    /* JADX INFO: renamed from: f */
    public FileOutputStream f45925f;

    /* JADX INFO: renamed from: g */
    public C8528c0 f45926g;

    public C8558m0(File file, C3124o c3124o) {
        this.f45921b = file;
        this.f45922c = c3124o;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        while (i11 > 0) {
            long j10 = this.f45923d;
            C3124o c3124o = this.f45922c;
            if (j10 == 0 && this.f45924e == 0) {
                C8529c1 c8529c1 = this.f45920a;
                int iM16647a = c8529c1.m16647a(bArr, i10, i11);
                if (iM16647a == -1) {
                    return;
                }
                i10 += iM16647a;
                i11 -= iM16647a;
                C8528c0 c8528c0M16648b = c8529c1.m16648b();
                this.f45926g = c8528c0M16648b;
                if (c8528c0M16648b.f45805e) {
                    this.f45923d = 0L;
                    byte[] bArr2 = c8528c0M16648b.f45806f;
                    int length = bArr2.length;
                    c3124o.f15969g++;
                    FileOutputStream fileOutputStream = new FileOutputStream(c3124o.m9001c());
                    try {
                        fileOutputStream.write(bArr2, 0, length);
                        fileOutputStream.close();
                        this.f45924e = this.f45926g.f45806f.length;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                } else {
                    if (!(c8528c0M16648b.mo16641a() == 0) || this.f45926g.m16659g()) {
                        byte[] bArr3 = this.f45926g.f45806f;
                        int length2 = bArr3.length;
                        c3124o.f15969g++;
                        FileOutputStream fileOutputStream2 = new FileOutputStream(c3124o.m9001c());
                        try {
                            fileOutputStream2.write(bArr3, 0, length2);
                            fileOutputStream2.close();
                            this.f45923d = this.f45926g.f45802b;
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable unused2) {
                            }
                            throw th3;
                        }
                    } else {
                        c3124o.m9006h(this.f45926g.f45806f);
                        File file = new File(this.f45921b, this.f45926g.f45801a);
                        file.getParentFile().mkdirs();
                        this.f45923d = this.f45926g.f45802b;
                        this.f45925f = new FileOutputStream(file);
                    }
                }
            }
            if (!this.f45926g.m16659g()) {
                C8528c0 c8528c0 = this.f45926g;
                if (c8528c0.f45805e) {
                    long j11 = this.f45924e;
                    RandomAccessFile randomAccessFile = new RandomAccessFile(c3124o.m9001c(), "rw");
                    try {
                        randomAccessFile.seek(j11);
                        randomAccessFile.write(bArr, i10, i11);
                        randomAccessFile.close();
                        this.f45924e += (long) i11;
                        iMin = i11;
                    } catch (Throwable th4) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable unused3) {
                        }
                        throw th4;
                    }
                } else {
                    if (c8528c0.mo16641a() == 0) {
                        iMin = (int) Math.min(i11, this.f45923d);
                        this.f45925f.write(bArr, i10, iMin);
                        long j12 = this.f45923d - ((long) iMin);
                        this.f45923d = j12;
                        if (j12 == 0) {
                            this.f45925f.close();
                        }
                    } else {
                        iMin = (int) Math.min(i11, this.f45923d);
                        C8528c0 c8528c1 = this.f45926g;
                        long length3 = (((long) c8528c1.f45806f.length) + c8528c1.f45802b) - this.f45923d;
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(c3124o.m9001c(), "rw");
                        try {
                            randomAccessFile2.seek(length3);
                            randomAccessFile2.write(bArr, i10, iMin);
                            randomAccessFile2.close();
                            this.f45923d -= (long) iMin;
                        } catch (Throwable th5) {
                            try {
                                randomAccessFile2.close();
                            } catch (Throwable unused4) {
                            }
                            throw th5;
                        }
                    }
                }
                i10 += iMin;
                i11 -= iMin;
            }
        }
    }
}
