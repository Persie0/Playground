package p000;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dv2 extends MediaDataSource {

    /* JADX INFO: renamed from: a */
    public long f36259a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iv2 f36260b;

    public dv2(iv2 iv2Var) {
        this.f36260b = iv2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        iv2 iv2Var = this.f36260b;
        DataInputStream dataInputStream = iv2Var.f37928a;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.f36259a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        iv2Var.m14156b(j);
                        this.f36259a = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = iv2Var.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f36259a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f36259a = -1L;
            return -1;
        }
        return -1;
    }
}
