package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class fib implements js6, yr6, sr6 {

    /* JADX INFO: renamed from: a */
    public final Object f39161a = new Object();

    /* JADX INFO: renamed from: b */
    public final int f39162b;

    /* JADX INFO: renamed from: c */
    public final tld f39163c;

    /* JADX INFO: renamed from: d */
    public int f39164d;

    /* JADX INFO: renamed from: e */
    public int f39165e;

    /* JADX INFO: renamed from: f */
    public int f39166f;

    /* JADX INFO: renamed from: g */
    public Exception f39167g;

    /* JADX INFO: renamed from: h */
    public boolean f39168h;

    public fib(int i, tld tldVar) {
        this.f39162b = i;
        this.f39163c = tldVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m11860a() {
        int i = this.f39164d;
        int i2 = this.f39165e;
        int i3 = i + i2 + this.f39166f;
        int i4 = this.f39162b;
        if (i3 == i4) {
            Exception exc = this.f39167g;
            tld tldVar = this.f39163c;
            if (exc == null) {
                if (this.f39168h) {
                    tldVar.m22204s();
                    return;
                } else {
                    tldVar.m22201p(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            tldVar.m22203r(new ExecutionException(sb.toString(), this.f39167g));
        }
    }

    @Override // p000.sr6
    /* JADX INFO: renamed from: b */
    public final void mo319b() {
        synchronized (this.f39161a) {
            this.f39166f++;
            this.f39168h = true;
            m11860a();
        }
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public final void mo320g(Object obj) {
        synchronized (this.f39161a) {
            this.f39164d++;
            m11860a();
        }
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public final void mo321m(Exception exc) {
        synchronized (this.f39161a) {
            this.f39165e++;
            this.f39167g = exc;
            m11860a();
        }
    }
}
