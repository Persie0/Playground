package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class x68 extends z68 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xv5 f67833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f67834c;

    public x68(xv5 xv5Var, File file) {
        this.f67833b = xv5Var;
        this.f67834c = file;
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: a */
    public final long mo159a() {
        return this.f67834c.length();
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: b */
    public final xv5 mo160b() {
        return this.f67833b;
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: d */
    public final void mo161d(gj0 gj0Var) throws IOException {
        f64 f64Var = new f64(new FileInputStream(this.f67834c), c1a.f9314d);
        try {
            gj0Var.mo456B(f64Var);
            f64Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3584sr.m21646y(f64Var, th);
                throw th2;
            }
        }
    }
}
