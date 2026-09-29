package p136gc;

/* JADX INFO: renamed from: gc.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5752h<TResult> {

    /* JADX INFO: renamed from: a */
    public final C5761q f34812a = new C5761q();

    /* JADX INFO: renamed from: a */
    public final void m12113a(Exception exc) {
        this.f34812a.m12122p(exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m12114b(TResult tresult) {
        this.f34812a.m12123q(tresult);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final boolean m12115c(Exception exc) {
        C5761q c5761q = this.f34812a;
        c5761q.getClass();
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (c5761q.f34835a) {
            try {
                if (c5761q.f34837c) {
                    return false;
                }
                c5761q.f34837c = true;
                c5761q.f34840f = exc;
                c5761q.f34836b.m12120b(c5761q);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m12116d(Object obj) {
        C5761q c5761q = this.f34812a;
        synchronized (c5761q.f34835a) {
            try {
                if (c5761q.f34837c) {
                    return;
                }
                c5761q.f34837c = true;
                c5761q.f34839e = obj;
                c5761q.f34836b.m12120b(c5761q);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
