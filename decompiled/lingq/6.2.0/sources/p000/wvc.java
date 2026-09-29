package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wvc extends idd {
    @Override // p000.idd
    /* JADX INFO: renamed from: b */
    public final void mo13802b(yzc yzcVar, yzc yzcVar2) {
        yzcVar.f70721b = yzcVar2;
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: c */
    public final void mo13803c(yzc yzcVar, Thread thread) {
        yzcVar.f70720a = thread;
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: d */
    public final boolean mo13804d(m6d m6dVar, fec fecVar, fec fecVar2) {
        synchronized (m6dVar) {
            try {
                if (m6dVar.f50689b != fecVar) {
                    return false;
                }
                m6dVar.f50689b = fecVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: e */
    public final boolean mo13805e(m6d m6dVar, Object obj, Object obj2) {
        synchronized (m6dVar) {
            try {
                if (m6dVar.f50688a != obj) {
                    return false;
                }
                m6dVar.f50688a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: f */
    public final boolean mo13806f(m6d m6dVar, yzc yzcVar, yzc yzcVar2) {
        synchronized (m6dVar) {
            try {
                if (m6dVar.f50690c != yzcVar) {
                    return false;
                }
                m6dVar.f50690c = yzcVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
