package p457wd;

import p176ib.C6259c1;

/* JADX INFO: renamed from: wd.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9910k<ResultT> {

    /* JADX INFO: renamed from: a */
    public final Object f50543a = new Object();

    /* JADX INFO: renamed from: b */
    public final C6259c1 f50544b = new C6259c1();

    /* JADX INFO: renamed from: c */
    public boolean f50545c;

    /* JADX INFO: renamed from: d */
    public Object f50546d;

    /* JADX INFO: renamed from: e */
    public Exception f50547e;

    /* JADX INFO: renamed from: a */
    public final boolean m18408a() {
        boolean z10;
        synchronized (this.f50543a) {
            z10 = false;
            if (this.f50545c && this.f50547e == null) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public final void m18409b() {
        synchronized (this.f50543a) {
            try {
                if (this.f50545c) {
                    this.f50544b.m12895c(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
