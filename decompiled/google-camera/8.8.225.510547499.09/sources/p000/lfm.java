package p000;

import java.io.FileDescriptor;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfm {

    /* JADX INFO: renamed from: a */
    public final Executor f38147a;

    /* JADX INFO: renamed from: e */
    private nps f38151e = null;

    /* JADX INFO: renamed from: b */
    public nps f38148b = kxk.m14965K(null);

    /* JADX INFO: renamed from: c */
    public nps f38149c = kxk.m14965K(null);

    /* JADX INFO: renamed from: f */
    private nps f38152f = kxk.m14965K(null);

    /* JADX INFO: renamed from: d */
    public boolean f38150d = true;

    public lfm(Executor executor) {
        this.f38147a = executor;
    }

    /* JADX INFO: renamed from: b */
    public final void m15283b(int i) {
        this.f38152f = kxk.m14965K(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public final void m15284c(FileDescriptor fileDescriptor) {
        this.f38151e = kxk.m14965K(fileDescriptor);
    }

    /* JADX INFO: renamed from: a */
    public final lfi m15282a() {
        nps npsVar = this.f38151e;
        if (npsVar != null) {
            return new lfj(nod.m17553i(npm.m17611q(npsVar), hnk.f28503p, this.f38147a), this.f38152f, this.f38148b, this.f38149c, this.f38150d, this.f38147a);
        }
        throw new IllegalArgumentException("Output not properly specified");
    }
}
