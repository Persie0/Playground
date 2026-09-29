package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class d18 implements gj0 {

    /* JADX INFO: renamed from: a */
    public final t89 f34849a;

    /* JADX INFO: renamed from: b */
    public final aj0 f34850b;

    /* JADX INFO: renamed from: c */
    public boolean f34851c;

    public d18(t89 t89Var) {
        t89Var.getClass();
        this.f34849a = t89Var;
        this.f34850b = new aj0();
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: B */
    public final long mo456B(yd9 yd9Var) throws IOException {
        long j = 0;
        while (true) {
            long jMo459F = ((f64) yd9Var).mo459F(this.f34850b, 8192L);
            if (jMo459F == -1) {
                return j;
            }
            j += jMo459F;
            m9991a();
        }
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: G */
    public final gj0 mo460G(int i, byte[] bArr) {
        bArr.getClass();
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        this.f34850b.write(bArr, 0, i);
        m9991a();
        return this;
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: H */
    public final gj0 mo461H(String str) {
        str.getClass();
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        this.f34850b.m495q0(str);
        m9991a();
        return this;
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: U */
    public final gj0 mo468U(ByteString byteString) {
        byteString.getClass();
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        this.f34850b.m486j0(byteString);
        m9991a();
        return this;
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) {
        aj0Var.getClass();
        if (this.f34851c) {
            C3386nv.m17633t("closed");
        } else {
            this.f34850b.mo471X(aj0Var, j);
            m9991a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final gj0 m9991a() {
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        aj0 aj0Var = this.f34850b;
        long jM476c = aj0Var.m476c();
        if (jM476c > 0) {
            this.f34849a.mo471X(aj0Var, jM476c);
        }
        return this;
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: c0 */
    public final gj0 mo477c0(long j) {
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        this.f34850b.m488l0(j);
        m9991a();
        return this;
    }

    @Override // p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        t89 t89Var = this.f34849a;
        if (this.f34851c) {
            return;
        }
        aj0 aj0Var = this.f34850b;
        long j = aj0Var.f723b;
        if (j > 0) {
            t89Var.mo471X(aj0Var, j);
        }
        th = null;
        try {
            t89Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f34851c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: d0 */
    public final OutputStream mo478d0() {
        return new zi0(this, 1);
    }

    @Override // p000.gj0, p000.t89, java.io.Flushable
    public final void flush() {
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return;
        }
        aj0 aj0Var = this.f34850b;
        long j = aj0Var.f723b;
        t89 t89Var = this.f34849a;
        if (j > 0) {
            t89Var.mo471X(aj0Var, j);
        }
        t89Var.flush();
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: h */
    public final aj0 mo482h() {
        return this.f34850b;
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f34849a.mo484i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f34851c;
    }

    public final String toString() {
        return "buffer(" + this.f34849a + ')';
    }

    @Override // p000.gj0
    public final gj0 write(byte[] bArr) {
        bArr.getClass();
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        this.f34850b.write(bArr, 0, bArr.length);
        m9991a();
        return this;
    }

    @Override // p000.gj0
    public final gj0 writeByte(int i) {
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        this.f34850b.m487k0(i);
        m9991a();
        return this;
    }

    @Override // p000.gj0
    public final gj0 writeInt(int i) {
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        this.f34850b.m490n0(i);
        m9991a();
        return this;
    }

    @Override // p000.gj0
    public final gj0 writeShort(int i) {
        if (this.f34851c) {
            C3386nv.m17633t("closed");
            return null;
        }
        this.f34850b.m491o0(i);
        m9991a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f34851c) {
            int iWrite = this.f34850b.write(byteBuffer);
            m9991a();
            return iWrite;
        }
        C3386nv.m17633t("closed");
        return 0;
    }
}
