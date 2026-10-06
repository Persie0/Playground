package p000;

import java.io.Closeable;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nfz implements nga {

    /* JADX INFO: renamed from: a */
    private final Method f42207a;

    public nfz(Method method) {
        this.f42207a = method;
    }

    @Override // p000.nga
    /* JADX INFO: renamed from: a */
    public final void mo17458a(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            this.f42207a.invoke(th, th2);
        } catch (Throwable th3) {
            nfy.f42206a.mo17458a(closeable, th, th2);
        }
    }
}
