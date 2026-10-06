package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class orj extends oqo {

    /* JADX INFO: renamed from: c */
    private long f46452c;

    /* JADX INFO: renamed from: d */
    public oww f46453d;

    /* JADX INFO: renamed from: e */
    private boolean f46454e;

    /* JADX INFO: renamed from: cO */
    private static final long m18950cO(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* JADX INFO: renamed from: c */
    protected abstract Thread mo18868c();

    /* JADX INFO: renamed from: h */
    protected void mo18942h(long j, orm ormVar) {
        oqw.f46435c.m18966s(j, ormVar);
    }

    /* JADX INFO: renamed from: i */
    public void mo18943i() {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public long mo18953j() {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final void m18954k(boolean z) {
        long jM18950cO = this.f46452c - m18950cO(z);
        this.f46452c = jM18950cO;
        if (jM18950cO > 0) {
            return;
        }
        boolean z2 = oqu.f46432a;
        if (this.f46454e) {
            mo18943i();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18955l(orb orbVar) {
        oww owwVar = this.f46453d;
        if (owwVar == null) {
            owwVar = new oww();
            this.f46453d = owwVar;
        }
        Object[] objArr = owwVar.f46743a;
        int i = owwVar.f46745c;
        objArr[i] = orbVar;
        int length = objArr.length;
        int i2 = (i + 1) & (length - 1);
        owwVar.f46745c = i2;
        int i3 = owwVar.f46744b;
        if (i2 == i3) {
            Object[] objArr2 = new Object[length + length];
            omn.m18696aj(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = owwVar.f46743a;
            int length2 = objArr3.length;
            int i4 = owwVar.f46744b;
            omn.m18696aj(objArr3, objArr2, length2 - i4, 0, i4, 4);
            owwVar.f46743a = objArr2;
            owwVar.f46744b = 0;
            owwVar.f46745c = length;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m18956m(boolean z) {
        this.f46452c += m18950cO(z);
        if (z) {
            return;
        }
        this.f46454e = true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m18957n() {
        return this.f46452c >= m18950cO(true);
    }

    /* JADX INFO: renamed from: p */
    protected final void m18959p() {
        Thread threadMo18868c = mo18868c();
        if (Thread.currentThread() != threadMo18868c) {
            LockSupport.unpark(threadMo18868c);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m18958o() {
        oww owwVar = this.f46453d;
        if (owwVar == null) {
            return false;
        }
        int i = owwVar.f46744b;
        Object obj = null;
        if (i != owwVar.f46745c) {
            Object[] objArr = owwVar.f46743a;
            Object obj2 = objArr[i];
            objArr[i] = null;
            owwVar.f46744b = (i + 1) & (objArr.length - 1);
            obj2.getClass();
            obj = obj2;
        }
        orb orbVar = (orb) obj;
        if (orbVar == null) {
            return false;
        }
        orbVar.run();
        return true;
    }
}
