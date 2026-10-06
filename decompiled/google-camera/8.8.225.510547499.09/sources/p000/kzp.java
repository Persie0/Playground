package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final lav f37775a = lav.m15121j();

    /* JADX INFO: renamed from: b */
    protected final nps f37776b;

    /* JADX INFO: renamed from: c */
    public final kzo f37777c;

    /* JADX INFO: renamed from: d */
    protected final kzo f37778d;

    /* JADX INFO: renamed from: e */
    public final Executor f37779e;

    /* JADX INFO: renamed from: f */
    protected final lzd f37780f;

    public kzp(nps npsVar, kzo kzoVar, kzo kzoVar2, Executor executor, lzd lzdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37776b = npsVar;
        this.f37777c = kzoVar;
        this.f37778d = kzoVar2;
        this.f37779e = executor;
        this.f37780f = lzdVar;
    }

    /* JADX INFO: renamed from: b */
    private final void m15093b(Throwable th) {
        kzy kzyVarM15111a = kzy.m15111a(th);
        if (this.f37778d == null) {
            this.f37775a.m15131m(kzyVarM15111a);
            return;
        }
        try {
            this.f37779e.execute(new lae(this, kzyVarM15111a, 1));
        } catch (Throwable th2) {
            m15094a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15094a(Throwable th) {
        this.f37775a.m15131m(kzy.m15111a(th));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object objM17727m = ntw.m17727m(this.f37776b);
            if (objM17727m == null) {
                m15094a(new IllegalStateException("Result value is null"));
                return;
            }
            try {
                this.f37779e.execute(new kds(this, objM17727m, 18));
            } catch (Throwable th) {
                m15094a(th);
            }
        } catch (ExecutionException e) {
            m15093b(e.getCause());
        } catch (Throwable th2) {
            m15093b(th2);
        }
    }

    public final String toString() {
        return this.f37777c.toString();
    }
}
