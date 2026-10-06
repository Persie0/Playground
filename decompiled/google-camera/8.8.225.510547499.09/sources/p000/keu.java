package p000;

import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class keu extends OutputStream {

    /* JADX INFO: renamed from: a */
    private final ket f35797a;

    public keu(ket ketVar) {
        this.f35797a = ketVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ket ketVar = this.f35797a;
        ked kedVar = ketVar.f35792b;
        if (kedVar.m14012a() > 0) {
            Log.w("CAM_ProcFSM", "Warning: unwritten bytes in the buffer: ".concat(kedVar.toString()));
        }
        int i = ketVar.f35795e;
        if (i > 0) {
            Log.w("CAM_ProcFSM", "Warning: still need to forward " + i + " bytes");
        }
        if (ketVar.f35794d > 0) {
            Log.w("CAM_ProcFSM", "Warning: still need to skip " + ketVar.f35795e + " bytes");
        }
        ketVar.f35793c.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f35797a.f35793c.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        ket ketVar = this.f35797a;
        int i2 = ketVar.f35794d;
        if (i2 != 0) {
            if (i2 > 0) {
                ketVar.f35794d = i2 - 1;
            }
        } else {
            if (ketVar.f35795e != 0) {
                ketVar.f35793c.write(i);
                int i3 = ketVar.f35795e;
                if (i3 > 0) {
                    ketVar.f35795e = i3 - 1;
                    return;
                }
                return;
            }
            ked kedVar = ketVar.f35792b;
            kedVar.m14013b(1);
            byte[] bArr = kedVar.f35712a;
            int i4 = kedVar.f35714c;
            bArr[i4] = (byte) (i & 255);
            kedVar.f35714c = i4 + 1;
            ketVar.m14085f();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f35797a.m14084e(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f35797a.m14084e(bArr, i, i2);
    }
}
