package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class yi0 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hj0 f69861b;

    public /* synthetic */ yi0(hj0 hj0Var, int i) {
        this.f69860a = i;
        this.f69861b = hj0Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m25152a() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.f69860a;
        hj0 hj0Var = this.f69861b;
        switch (i) {
            case 0:
                return (int) Math.min(((aj0) hj0Var).f723b, 2147483647L);
            default:
                e18 e18Var = (e18) hj0Var;
                if (!e18Var.f36576c) {
                    return (int) Math.min(e18Var.f36575b.f723b, 2147483647L);
                }
                v63.m23133k("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f69860a) {
            case 0:
                break;
            default:
                ((e18) this.f69861b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f69860a;
        hj0 hj0Var = this.f69861b;
        switch (i) {
            case 0:
                aj0 aj0Var = (aj0) hj0Var;
                if (aj0Var.f723b > 0) {
                    return aj0Var.readByte() & 255;
                }
                return -1;
            default:
                e18 e18Var = (e18) hj0Var;
                aj0 aj0Var2 = e18Var.f36575b;
                if (e18Var.f36576c) {
                    v63.m23133k("closed");
                    return 0;
                }
                if (aj0Var2.f723b == 0 && e18Var.f36574a.mo459F(aj0Var2, 8192L) == -1) {
                    return -1;
                }
                return aj0Var2.readByte() & 255;
        }
    }

    public final String toString() {
        int i = this.f69860a;
        hj0 hj0Var = this.f69861b;
        switch (i) {
            case 0:
                return ((aj0) hj0Var) + ".inputStream()";
            default:
                return ((e18) hj0Var) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f69860a) {
            case 1:
                outputStream.getClass();
                e18 e18Var = (e18) this.f69861b;
                aj0 aj0Var = e18Var.f36575b;
                if (e18Var.f36576c) {
                    v63.m23133k("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (aj0Var.f723b == 0 && e18Var.f36574a.mo459F(aj0Var, 8192L) == -1) {
                        return j;
                    }
                    long j2 = aj0Var.f723b;
                    j += j2;
                    te1.m22001o(j2, 0L, j2);
                    zt8 zt8Var = aj0Var.f722a;
                    while (j2 > 0) {
                        zt8Var.getClass();
                        int iMin = (int) Math.min(j2, zt8Var.f72155c - zt8Var.f72154b);
                        outputStream.write(zt8Var.f72153a, zt8Var.f72154b, iMin);
                        int i = zt8Var.f72154b + iMin;
                        zt8Var.f72154b = i;
                        long j3 = iMin;
                        aj0Var.f723b -= j3;
                        j2 -= j3;
                        if (i == zt8Var.f72155c) {
                            zt8 zt8VarM25776a = zt8Var.m25776a();
                            aj0Var.f722a = zt8VarM25776a;
                            cu8.m9897a(zt8Var);
                            zt8Var = zt8VarM25776a;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f69860a;
        hj0 hj0Var = this.f69861b;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((aj0) hj0Var).read(bArr, i, i2);
            default:
                e18 e18Var = (e18) hj0Var;
                aj0 aj0Var = e18Var.f36575b;
                if (!e18Var.f36576c) {
                    te1.m22001o(bArr.length, i, i2);
                    if (aj0Var.f723b == 0 && e18Var.f36574a.mo459F(aj0Var, 8192L) == -1) {
                        return -1;
                    }
                    return aj0Var.read(bArr, i, i2);
                }
                v63.m23133k("closed");
                return 0;
        }
    }
}
