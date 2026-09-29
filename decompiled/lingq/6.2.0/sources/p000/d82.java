package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class d82 implements t89 {

    /* JADX INFO: renamed from: a */
    public final OutputStream f35115a;

    /* JADX INFO: renamed from: b */
    public final kd9 f35116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ny8 f35117c;

    public d82(ny8 ny8Var) {
        this.f35117c = ny8Var;
        Socket socket = (Socket) ny8Var.f53414b;
        this.f35115a = socket.getOutputStream();
        this.f35116b = new kd9(socket);
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) throws IOException {
        te1.m22001o(aj0Var.f723b, 0L, j);
        while (j > 0) {
            kd9 kd9Var = this.f35116b;
            kd9Var.mo3172f();
            zt8 zt8Var = aj0Var.f722a;
            zt8Var.getClass();
            int iMin = (int) Math.min(j, zt8Var.f72155c - zt8Var.f72154b);
            kd9Var.m24714h();
            try {
                try {
                    this.f35115a.write(zt8Var.f72153a, zt8Var.f72154b, iMin);
                    if (kd9Var.m24715i()) {
                        throw kd9Var.mo15138j(null);
                    }
                    int i = zt8Var.f72154b + iMin;
                    zt8Var.f72154b = i;
                    long j2 = iMin;
                    j -= j2;
                    aj0Var.f723b -= j2;
                    if (i == zt8Var.f72155c) {
                        aj0Var.f722a = zt8Var.m25776a();
                        cu8.m9897a(zt8Var);
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
    }

    @Override // p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f35115a;
        ny8 ny8Var = this.f35117c;
        kd9 kd9Var = this.f35116b;
        kd9Var.m24714h();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) ny8Var.f53415c;
                Socket socket = (Socket) ny8Var.f53414b;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    kd9Var.m24715i();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    kd9Var.m24715i();
                    return;
                }
                socket.close();
                if (kd9Var.m24715i()) {
                    throw kd9Var.mo15138j(null);
                }
            } catch (Throwable th) {
                kd9Var.m24715i();
                throw th;
            }
        } catch (IOException e) {
            if (!kd9Var.m24715i()) {
                throw e;
            }
            throw kd9Var.mo15138j(e);
        }
    }

    @Override // p000.t89, java.io.Flushable
    public final void flush() throws IOException {
        kd9 kd9Var = this.f35116b;
        kd9Var.m24714h();
        try {
            try {
                this.f35115a.flush();
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

    @Override // p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f35116b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f35117c.f53414b) + ')';
    }
}
