package p000;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class e82 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final InputStream f36834a;

    /* JADX INFO: renamed from: b */
    public final kd9 f36835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ny8 f36836c;

    public e82(ny8 ny8Var) {
        this.f36836c = ny8Var;
        Socket socket = (Socket) ny8Var.f53414b;
        this.f36834a = socket.getInputStream();
        this.f36835b = new kd9(socket);
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        aj0Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        kd9 kd9Var = this.f36835b;
        kd9Var.mo3172f();
        zt8 zt8VarM485i0 = aj0Var.m485i0(1);
        int iMin = (int) Math.min(j, 8192 - zt8VarM485i0.f72155c);
        try {
            kd9Var.m24714h();
            try {
                try {
                    int i = this.f36834a.read(zt8VarM485i0.f72153a, zt8VarM485i0.f72155c, iMin);
                    if (kd9Var.m24715i()) {
                        throw kd9Var.mo15138j(null);
                    }
                    if (i != -1) {
                        zt8VarM485i0.f72155c += i;
                        long j2 = i;
                        aj0Var.f723b += j2;
                        return j2;
                    }
                    if (zt8VarM485i0.f72154b != zt8VarM485i0.f72155c) {
                        return -1L;
                    }
                    aj0Var.f722a = zt8VarM485i0.m25776a();
                    cu8.m9897a(zt8VarM485i0);
                    return -1L;
                } catch (IOException e) {
                    if (kd9Var.m24715i()) {
                        throw kd9Var.mo15138j(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                kd9Var.m24715i();
                throw th;
            }
        } catch (AssertionError e2) {
            if (hcb.m13198b(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        ny8 ny8Var = this.f36836c;
        kd9 kd9Var = this.f36835b;
        kd9Var.m24714h();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) ny8Var.f53415c;
                Socket socket = (Socket) ny8Var.f53414b;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    kd9Var.m24715i();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    kd9Var.m24715i();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f36834a.close();
                    }
                }
                if (kd9Var.m24715i()) {
                    throw kd9Var.mo15138j(null);
                }
            } catch (IOException e) {
                if (!kd9Var.m24715i()) {
                    throw e;
                }
                throw kd9Var.mo15138j(e);
            }
        } catch (Throwable th) {
            kd9Var.m24715i();
            throw th;
        }
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f36835b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.f36836c.f53414b) + ')';
    }
}
