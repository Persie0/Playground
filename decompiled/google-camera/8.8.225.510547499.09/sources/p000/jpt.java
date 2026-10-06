package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpt extends jpp {

    /* JADX INFO: renamed from: b */
    public boolean f34564b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f34565c;

    /* JADX INFO: renamed from: d */
    public Object f34566d;

    /* JADX INFO: renamed from: e */
    public Exception f34567e;

    /* JADX INFO: renamed from: a */
    public final Object f34563a = new Object();

    /* JADX INFO: renamed from: f */
    public final moy f34568f = new moy(null, null);

    /* JADX INFO: renamed from: q */
    private final void m13460q() {
        String strConcat;
        if (this.f34564b) {
            if (!mo13451d()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excMo13449b = mo13449b();
            if (excMo13449b != null) {
                strConcat = "failure";
            } else if (mo13452e()) {
                strConcat = "result ".concat(String.valueOf(String.valueOf(mo13450c())));
            } else {
                strConcat = this.f34565c ? "cancellation" : "unknown issue";
            }
        }
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: a */
    public final jpp mo13448a(Executor executor, jpf jpfVar) {
        jpt jptVar = new jpt();
        this.f34568f.m16721d(new jph(executor, jpfVar, jptVar, 1));
        m13461m();
        return jptVar;
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: b */
    public final Exception mo13449b() {
        Exception exc;
        synchronized (this.f34563a) {
            exc = this.f34567e;
        }
        return exc;
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: c */
    public final Object mo13450c() {
        Object obj;
        synchronized (this.f34563a) {
            jib.m13202g(this.f34564b, "Task is not yet complete");
            if (this.f34565c) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.f34567e;
            if (exc != null) {
                throw new jpo(exc);
            }
            obj = this.f34566d;
        }
        return obj;
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: d */
    public final boolean mo13451d() {
        boolean z;
        synchronized (this.f34563a) {
            z = this.f34564b;
        }
        return z;
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: e */
    public final boolean mo13452e() {
        boolean z;
        synchronized (this.f34563a) {
            z = false;
            if (this.f34564b && !this.f34565c && this.f34567e == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: f */
    public final void mo13453f(Executor executor, jpi jpiVar) {
        this.f34568f.m16721d(new jph(executor, jpiVar, 0));
        m13461m();
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: g */
    public final void mo13454g(jpj jpjVar) {
        mo13455h(jps.f34561a, jpjVar);
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: h */
    public final void mo13455h(Executor executor, jpj jpjVar) {
        this.f34568f.m16721d(new jph(executor, jpjVar, 2));
        m13461m();
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: i */
    public final void mo13456i(jpk jpkVar) {
        mo13457j(jps.f34561a, jpkVar);
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: j */
    public final void mo13457j(Executor executor, jpk jpkVar) {
        this.f34568f.m16721d(new jph(executor, jpkVar, 3));
        m13461m();
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: k */
    public final void mo13458k(Executor executor, jpl jplVar) {
        this.f34568f.m16721d(new jph(executor, jplVar, 4));
        m13461m();
    }

    @Override // p000.jpp
    /* JADX INFO: renamed from: l */
    public final void mo13459l(jpl jplVar) {
        mo13458k(jps.f34561a, jplVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m13461m() {
        synchronized (this.f34563a) {
            if (this.f34564b) {
                this.f34568f.m16722e(this);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13462n(Exception exc) {
        jib.m13206k(exc, "Exception must not be null");
        synchronized (this.f34563a) {
            m13460q();
            this.f34564b = true;
            this.f34567e = exc;
        }
        this.f34568f.m16722e(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m13463o(Object obj) {
        synchronized (this.f34563a) {
            m13460q();
            this.f34564b = true;
            this.f34566d = obj;
        }
        this.f34568f.m16722e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m13464p() {
        synchronized (this.f34563a) {
            if (this.f34564b) {
                return;
            }
            this.f34564b = true;
            this.f34565c = true;
            this.f34568f.m16722e(this);
        }
    }
}
