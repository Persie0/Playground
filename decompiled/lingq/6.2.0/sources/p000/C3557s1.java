package p000;

/* JADX INFO: renamed from: s1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3557s1 extends zyc {
    @Override // p000.zyc
    /* JADX INFO: renamed from: f */
    public final boolean mo20237f(AbstractC3632u1 abstractC3632u1, C3481q1 c3481q1, C3481q1 c3481q2) {
        synchronized (abstractC3632u1) {
            try {
                if (abstractC3632u1.f63230b != c3481q1) {
                    return false;
                }
                abstractC3632u1.f63230b = c3481q2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: g */
    public final boolean mo20238g(AbstractC3632u1 abstractC3632u1, Object obj, Object obj2) {
        synchronized (abstractC3632u1) {
            try {
                if (abstractC3632u1.f63229a != obj) {
                    return false;
                }
                abstractC3632u1.f63229a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: h */
    public final boolean mo20239h(AbstractC3632u1 abstractC3632u1, C3595t1 c3595t1, C3595t1 c3595t2) {
        synchronized (abstractC3632u1) {
            try {
                if (abstractC3632u1.f63231c != c3595t1) {
                    return false;
                }
                abstractC3632u1.f63231c = c3595t2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: i */
    public final void mo20240i(C3595t1 c3595t1, C3595t1 c3595t2) {
        c3595t1.f61731b = c3595t2;
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: j */
    public final void mo20241j(C3595t1 c3595t1, Thread thread) {
        c3595t1.f61730a = thread;
    }
}
