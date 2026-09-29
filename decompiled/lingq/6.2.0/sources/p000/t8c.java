package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t8c {

    /* JADX INFO: renamed from: f */
    public static final Object f61995f = new Object();

    /* JADX INFO: renamed from: a */
    public final String f61996a;

    /* JADX INFO: renamed from: b */
    public final dqb f61997b;

    /* JADX INFO: renamed from: c */
    public final Object f61998c;

    /* JADX INFO: renamed from: d */
    public final Object f61999d = new Object();

    /* JADX INFO: renamed from: e */
    public volatile Object f62000e = null;

    public /* synthetic */ t8c(String str, Object obj, dqb dqbVar) {
        this.f61996a = str;
        this.f61998c = obj;
        this.f61997b = dqbVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m21901a(Object obj) {
        synchronized (this.f61999d) {
        }
        if (obj != null) {
            return obj;
        }
        if (bma.f8697b == null) {
            return this.f61998c;
        }
        synchronized (f61995f) {
            try {
                if (s46.m21077y()) {
                    return this.f62000e == null ? this.f61998c : this.f62000e;
                }
                try {
                    for (t8c t8cVar : z8c.f71153a) {
                        if (s46.m21077y()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            dqb dqbVar = t8cVar.f61997b;
                            if (dqbVar != null) {
                                objZza = dqbVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f61995f) {
                            t8cVar.f62000e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                dqb dqbVar2 = this.f61997b;
                if (dqbVar2 != null) {
                    try {
                        return dqbVar2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f61998c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
