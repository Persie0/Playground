package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class otz extends otk {

    /* JADX INFO: renamed from: b */
    private final ReentrantLock f46552b = new ReentrantLock();

    /* JADX INFO: renamed from: c */
    private Object f46553c = otl.f46527a;

    @Override // p000.otk
    /* JADX INFO: renamed from: a */
    protected final Object mo19036a() {
        ReentrantLock reentrantLock = this.f46552b;
        reentrantLock.lock();
        try {
            Object obj = this.f46553c;
            oxz oxzVar = otl.f46527a;
            if (obj != oxzVar) {
                this.f46553c = oxzVar;
                return obj;
            }
            Object objM19059u = m19059u();
            if (objM19059u == null) {
                objM19059u = otl.f46530d;
            }
            return objM19059u;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otk
    /* JADX INFO: renamed from: e */
    protected final void mo19040e(boolean z) {
        ReentrantLock reentrantLock = this.f46552b;
        reentrantLock.lock();
        try {
            this.f46553c = otl.f46527a;
            reentrantLock.unlock();
            super.mo19040e(z);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p000.otk
    /* JADX INFO: renamed from: g */
    protected final boolean mo19042g(ouc oucVar) {
        ReentrantLock reentrantLock = this.f46552b;
        reentrantLock.lock();
        try {
            return super.mo19042g(oucVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otk
    /* JADX INFO: renamed from: h */
    protected final boolean mo19043h() {
        return false;
    }

    @Override // p000.otk
    /* JADX INFO: renamed from: i */
    protected final boolean mo19044i() {
        ReentrantLock reentrantLock = this.f46552b;
        reentrantLock.lock();
        try {
            return this.f46553c == otl.f46527a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otk, p000.oud
    /* JADX INFO: renamed from: k */
    public final boolean mo19046k() {
        ReentrantLock reentrantLock = this.f46552b;
        reentrantLock.lock();
        try {
            return m19047l();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: p */
    protected final Object mo19055p(Object obj) {
        ReentrantLock reentrantLock = this.f46552b;
        reentrantLock.lock();
        try {
            otw otwVarM19059u = m19059u();
            if (otwVarM19059u != null) {
                reentrantLock.unlock();
                return otwVarM19059u;
            }
            if (this.f46553c == otl.f46527a) {
                while (true) {
                    oue oueVarMo19039d = mo19039d();
                    if (oueVarMo19039d == null) {
                        break;
                    }
                    if (oueVarMo19039d instanceof otw) {
                        reentrantLock.unlock();
                        return oueVarMo19039d;
                    }
                    if (oueVarMo19039d.mo19033d(obj) != null) {
                        boolean z = oqu.f46432a;
                        reentrantLock.unlock();
                        oueVarMo19039d.mo19031b(obj);
                        return oueVarMo19039d.mo19068cP();
                    }
                }
            }
            this.f46553c = obj;
            oxz oxzVar = otl.f46528b;
            reentrantLock.unlock();
            return oxzVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: t */
    protected final String mo19058t() {
        ReentrantLock reentrantLock = this.f46552b;
        reentrantLock.lock();
        try {
            return "(value=" + this.f46553c + ")";
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: y */
    protected final boolean mo19063y() {
        return false;
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: z */
    protected final boolean mo19064z() {
        return false;
    }
}
