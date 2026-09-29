package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zi0 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gj0 f71587b;

    public /* synthetic */ zi0(gj0 gj0Var, int i) {
        this.f71586a = i;
        this.f71587b = gj0Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m25665a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m25666b() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f71586a) {
            case 0:
                break;
            default:
                ((d18) this.f71587b).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f71586a) {
            case 0:
                break;
            default:
                d18 d18Var = (d18) this.f71587b;
                if (!d18Var.f34851c) {
                    d18Var.flush();
                }
                break;
        }
    }

    public final String toString() {
        int i = this.f71586a;
        gj0 gj0Var = this.f71587b;
        switch (i) {
            case 0:
                return ((aj0) gj0Var) + ".outputStream()";
            default:
                return ((d18) gj0Var) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f71586a;
        gj0 gj0Var = this.f71587b;
        bArr.getClass();
        switch (i3) {
            case 0:
                ((aj0) gj0Var).write(bArr, i, i2);
                break;
            default:
                d18 d18Var = (d18) gj0Var;
                if (!d18Var.f34851c) {
                    d18Var.f34850b.write(bArr, i, i2);
                    d18Var.m9991a();
                } else {
                    v63.m23133k("closed");
                }
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f71586a;
        gj0 gj0Var = this.f71587b;
        switch (i2) {
            case 0:
                ((aj0) gj0Var).m487k0(i);
                break;
            default:
                d18 d18Var = (d18) gj0Var;
                if (!d18Var.f34851c) {
                    d18Var.f34850b.m487k0((byte) i);
                    d18Var.m9991a();
                } else {
                    v63.m23133k("closed");
                }
                break;
        }
    }
}
