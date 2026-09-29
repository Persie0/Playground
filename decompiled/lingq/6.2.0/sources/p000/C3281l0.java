package p000;

import com.google.common.util.concurrent.AbstractC1112b;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3281l0 extends vz1 {
    @Override // p000.vz1
    /* JADX INFO: renamed from: E */
    public final C3095i0 mo14229E(AbstractC1112b abstractC1112b) {
        C3095i0 c3095i0;
        C3095i0 c3095i1 = C3095i0.f43266d;
        synchronized (abstractC1112b) {
            try {
                c3095i0 = abstractC1112b.f13525b;
                if (c3095i0 != c3095i1) {
                    abstractC1112b.f13525b = c3095i1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3095i0;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: F */
    public final C3594t0 mo14230F(AbstractC1112b abstractC1112b) {
        C3594t0 c3594t0;
        C3594t0 c3594t1 = C3594t0.f61684c;
        synchronized (abstractC1112b) {
            try {
                c3594t0 = abstractC1112b.f13526c;
                if (c3594t0 != c3594t1) {
                    abstractC1112b.f13526c = c3594t1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3594t0;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: S */
    public final void mo14231S(C3594t0 c3594t0, C3594t0 c3594t1) {
        c3594t0.f61686b = c3594t1;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: U */
    public final void mo14232U(C3594t0 c3594t0, Thread thread) {
        c3594t0.f61685a = thread;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: k */
    public final boolean mo14233k(AbstractC1112b abstractC1112b, C3095i0 c3095i0, C3095i0 c3095i1) {
        synchronized (abstractC1112b) {
            try {
                if (abstractC1112b.f13525b != c3095i0) {
                    return false;
                }
                abstractC1112b.f13525b = c3095i1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: l */
    public final boolean mo14234l(AbstractC1112b abstractC1112b, Object obj, Object obj2) {
        synchronized (abstractC1112b) {
            try {
                if (abstractC1112b.f13524a != obj) {
                    return false;
                }
                abstractC1112b.f13524a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: m */
    public final boolean mo14235m(AbstractC1112b abstractC1112b, C3594t0 c3594t0, C3594t0 c3594t1) {
        synchronized (abstractC1112b) {
            try {
                if (abstractC1112b.f13526c != c3594t0) {
                    return false;
                }
                abstractC1112b.f13526c = c3594t1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
