package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rtb extends fdd {
    @Override // p000.fdd
    /* JADX INFO: renamed from: a */
    public final mtb mo11788a(pxb pxbVar) {
        mtb mtbVar;
        mtb mtbVar2 = mtb.f51835d;
        synchronized (pxbVar) {
            try {
                mtbVar = pxbVar.f70459b;
                if (mtbVar != mtbVar2) {
                    pxbVar.f70459b = mtbVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mtbVar;
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: b */
    public final ttb mo11789b(pxb pxbVar) {
        ttb ttbVar;
        ttb ttbVar2 = ttb.f62872c;
        synchronized (pxbVar) {
            try {
                ttbVar = pxbVar.f70460c;
                if (ttbVar != ttbVar2) {
                    pxbVar.f70460c = ttbVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ttbVar;
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: c */
    public final void mo11790c(ttb ttbVar, ttb ttbVar2) {
        ttbVar.f62874b = ttbVar2;
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: d */
    public final void mo11791d(ttb ttbVar, Thread thread) {
        ttbVar.f62873a = thread;
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: e */
    public final boolean mo11792e(pxb pxbVar, mtb mtbVar, mtb mtbVar2) {
        synchronized (pxbVar) {
            try {
                if (pxbVar.f70459b != mtbVar) {
                    return false;
                }
                pxbVar.f70459b = mtbVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: f */
    public final boolean mo11793f(ytb ytbVar, Object obj, Object obj2) {
        synchronized (ytbVar) {
            try {
                if (ytbVar.f70458a != obj) {
                    return false;
                }
                ytbVar.f70458a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: g */
    public final boolean mo11794g(ytb ytbVar, ttb ttbVar, ttb ttbVar2) {
        synchronized (ytbVar) {
            try {
                if (ytbVar.f70460c != ttbVar) {
                    return false;
                }
                ytbVar.f70460c = ttbVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
