package p000;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class v07 implements t89 {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f64660a;

    /* JADX INFO: renamed from: b */
    public final c1a f64661b;

    public v07(FileOutputStream fileOutputStream, c1a c1aVar) {
        this.f64660a = fileOutputStream;
        this.f64661b = c1aVar;
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) throws IOException {
        te1.m22001o(aj0Var.f723b, 0L, j);
        while (j > 0) {
            this.f64661b.mo3172f();
            zt8 zt8Var = aj0Var.f722a;
            zt8Var.getClass();
            int iMin = (int) Math.min(j, zt8Var.f72155c - zt8Var.f72154b);
            this.f64660a.write(zt8Var.f72153a, zt8Var.f72154b, iMin);
            int i = zt8Var.f72154b + iMin;
            zt8Var.f72154b = i;
            long j2 = iMin;
            j -= j2;
            aj0Var.f723b -= j2;
            if (i == zt8Var.f72155c) {
                aj0Var.f722a = zt8Var.m25776a();
                cu8.m9897a(zt8Var);
            }
        }
    }

    @Override // p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        this.f64660a.close();
    }

    @Override // p000.t89, java.io.Flushable
    public final void flush() throws IOException {
        this.f64660a.flush();
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f64661b;
    }

    public final String toString() {
        return "sink(" + this.f64660a + ')';
    }
}
