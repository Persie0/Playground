package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oto extends otk {

    /* JADX INFO: renamed from: b */
    private final int f46536b;

    /* JADX INFO: renamed from: c */
    private final ReentrantLock f46537c;

    /* JADX INFO: renamed from: d */
    private Object[] f46538d;

    /* JADX INFO: renamed from: e */
    private int f46539e;

    /* JADX INFO: renamed from: f */
    private final opl f46540f;

    /* JADX INFO: renamed from: g */
    private final int f46541g;

    public oto(int i, int i2) {
        this.f46536b = i;
        this.f46541g = i2;
        if (i <= 0) {
            throw new IllegalArgumentException("ArrayChannel capacity must be at least 1, but " + i + " was specified");
        }
        this.f46537c = new ReentrantLock();
        int iMin = Math.min(i, 8);
        Object[] objArr = new Object[iMin];
        omn.m18684X(objArr, otl.f46527a, 0, iMin);
        this.f46538d = objArr;
        this.f46540f = ook.m18794h(0);
    }

    @Override // p000.otk
    /* JADX INFO: renamed from: a */
    protected final Object mo19036a() {
        ReentrantLock reentrantLock = this.f46537c;
        reentrantLock.lock();
        try {
            int i = this.f46540f.f46391b;
            if (i == 0) {
                Object objM19059u = m19059u();
                if (objM19059u == null) {
                    objM19059u = otl.f46530d;
                }
                return objM19059u;
            }
            Object[] objArr = this.f46538d;
            int i2 = this.f46539e;
            Object obj = objArr[i2];
            oug ougVar = null;
            objArr[i2] = null;
            this.f46540f.f46391b = i - 1;
            Object objMo19067c = otl.f46530d;
            boolean z = false;
            if (i == this.f46536b) {
                while (true) {
                    oug ougVarM19060v = m19060v();
                    if (ougVarM19060v == null) {
                        break;
                    }
                    if (ougVarM19060v.mo19073i() != null) {
                        boolean z2 = oqu.f46432a;
                        objMo19067c = ougVarM19060v.mo19067c();
                        ougVar = ougVarM19060v;
                        z = true;
                        break;
                    }
                    ougVar = ougVarM19060v;
                }
            }
            if (objMo19067c != otl.f46530d && !(objMo19067c instanceof otw)) {
                this.f46540f.f46391b = i;
                Object[] objArr2 = this.f46538d;
                objArr2[(this.f46539e + i) % objArr2.length] = objMo19067c;
            }
            this.f46539e = (this.f46539e + 1) % this.f46538d.length;
            if (z) {
                ougVar.getClass();
                ougVar.mo19071g();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otk
    /* JADX INFO: renamed from: e */
    protected final void mo19040e(boolean z) {
        ReentrantLock reentrantLock = this.f46537c;
        reentrantLock.lock();
        try {
            int i = this.f46540f.f46391b;
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr = this.f46538d;
                int i3 = this.f46539e;
                Object obj = objArr[i3];
                objArr[i3] = otl.f46527a;
                this.f46539e = (i3 + 1) % objArr.length;
            }
            this.f46540f.f46391b = 0;
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
        ReentrantLock reentrantLock = this.f46537c;
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
        return this.f46540f.f46391b == 0;
    }

    @Override // p000.otk
    /* JADX INFO: renamed from: j */
    public final boolean mo19045j() {
        ReentrantLock reentrantLock = this.f46537c;
        reentrantLock.lock();
        try {
            return super.mo19045j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otk, p000.oud
    /* JADX INFO: renamed from: k */
    public final boolean mo19046k() {
        ReentrantLock reentrantLock = this.f46537c;
        reentrantLock.lock();
        try {
            return m19047l();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: o */
    protected final Object mo19054o(oug ougVar) {
        ReentrantLock reentrantLock = this.f46537c;
        reentrantLock.lock();
        try {
            return super.mo19054o(ougVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: p */
    protected final Object mo19055p(Object obj) {
        oxz oxzVar;
        ReentrantLock reentrantLock = this.f46537c;
        reentrantLock.lock();
        try {
            int i = this.f46540f.f46391b;
            otw otwVarM19059u = m19059u();
            if (otwVarM19059u != null) {
                reentrantLock.unlock();
                return otwVarM19059u;
            }
            if (i >= this.f46536b) {
                switch (this.f46541g - 1) {
                    case 0:
                        oxzVar = otl.f46529c;
                        break;
                    default:
                        oxzVar = null;
                        break;
                }
            } else {
                this.f46540f.f46391b = i + 1;
                oxzVar = null;
            }
            if (oxzVar != null) {
                reentrantLock.unlock();
                return oxzVar;
            }
            if (i == 0) {
                while (true) {
                    oue oueVarMo19039d = mo19039d();
                    if (oueVarMo19039d == null) {
                        i = 0;
                    } else {
                        if (oueVarMo19039d instanceof otw) {
                            this.f46540f.f46391b = 0;
                            reentrantLock.unlock();
                            return oueVarMo19039d;
                        }
                        if (oueVarMo19039d.mo19033d(obj) != null) {
                            boolean z = oqu.f46432a;
                            this.f46540f.f46391b = 0;
                            reentrantLock.unlock();
                            oueVarMo19039d.mo19031b(obj);
                            return oueVarMo19039d.mo19068cP();
                        }
                    }
                }
            }
            int i2 = this.f46536b;
            if (i < i2) {
                int length = this.f46538d.length;
                if (i >= length) {
                    int iMin = Math.min(length + length, i2);
                    Object[] objArr = new Object[iMin];
                    for (int i3 = 0; i3 < i; i3++) {
                        Object[] objArr2 = this.f46538d;
                        objArr[i3] = objArr2[(this.f46539e + i3) % objArr2.length];
                    }
                    omn.m18684X(objArr, otl.f46527a, i, iMin);
                    this.f46538d = objArr;
                    this.f46539e = 0;
                }
                Object[] objArr3 = this.f46538d;
                objArr3[(this.f46539e + i) % objArr3.length] = obj;
            } else {
                boolean z2 = oqu.f46432a;
                Object[] objArr4 = this.f46538d;
                int i4 = this.f46539e;
                int length2 = objArr4.length;
                objArr4[i4 % length2] = null;
                objArr4[(i + i4) % length2] = obj;
                this.f46539e = (i4 + 1) % length2;
            }
            oxz oxzVar2 = otl.f46528b;
            reentrantLock.unlock();
            return oxzVar2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: t */
    protected final String mo19058t() {
        return "(buffer:capacity=" + this.f46536b + ",size=" + this.f46540f.f46391b + ")";
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: y */
    protected final boolean mo19063y() {
        return false;
    }

    @Override // p000.otn
    /* JADX INFO: renamed from: z */
    protected final boolean mo19064z() {
        return this.f46540f.f46391b == this.f46536b && this.f46541g == 1;
    }
}
