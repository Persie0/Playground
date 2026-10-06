package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngb implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final nga f42208a;

    /* JADX INFO: renamed from: b */
    final nga f42209b;

    /* JADX INFO: renamed from: c */
    public final Deque f42210c = new ArrayDeque(4);

    /* JADX INFO: renamed from: d */
    public Throwable f42211d;

    static {
        nga nfzVar;
        try {
            nfzVar = new nfz(Throwable.class.getMethod(NptsKnlVczSZ.ISXNLelMChiyYtF, Throwable.class));
        } catch (Throwable th) {
            nfzVar = null;
        }
        if (nfzVar == null) {
            nfzVar = nfy.f42206a;
        }
        f42208a = nfzVar;
    }

    public ngb(nga ngaVar) {
        ngaVar.getClass();
        this.f42209b = ngaVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.f42211d;
        while (!this.f42210c.isEmpty()) {
            Closeable closeable = (Closeable) this.f42210c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f42209b.mo17458a(closeable, th, th2);
                }
            }
        }
        if (this.f42211d != null || th == null) {
            return;
        }
        msm.m16868c(th, IOException.class);
        throw new AssertionError(th);
    }
}
