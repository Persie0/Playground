package no;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C7151a;
import tl.C9322j;

/* JADX INFO: renamed from: no.l0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7847l0 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f42946f = 0;

    /* JADX INFO: renamed from: c */
    public long f42947c;

    /* JADX INFO: renamed from: d */
    public boolean f42948d;

    /* JADX INFO: renamed from: e */
    public C7151a<AbstractC7826e0<?>> f42949e;

    /* JADX INFO: renamed from: C1 */
    public final void m15600C1(boolean z10) {
        long j10 = this.f42947c - (z10 ? 4294967296L : 1L);
        this.f42947c = j10;
        if (j10 > 0) {
            return;
        }
        if (this.f42948d) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: D1 */
    public final void m15601D1(AbstractC7826e0<?> abstractC7826e0) {
        C7151a<AbstractC7826e0<?>> c7151a = this.f42949e;
        if (c7151a == null) {
            c7151a = new C7151a<>();
            this.f42949e = c7151a;
        }
        Object[] objArr = c7151a.f40412a;
        int i10 = c7151a.f40414c;
        objArr[i10] = abstractC7826e0;
        int length = (objArr.length - 1) & (i10 + 1);
        c7151a.f40414c = length;
        int i11 = c7151a.f40413b;
        if (length == i11) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            C9322j.m17675c0(objArr, objArr2, 0, i11, 0, 10);
            Object[] objArr3 = c7151a.f40412a;
            int length3 = objArr3.length;
            int i12 = c7151a.f40413b;
            C9322j.m17675c0(objArr3, objArr2, length3 - i12, 0, i12, 4);
            c7151a.f40412a = objArr2;
            c7151a.f40413b = 0;
            c7151a.f40414c = length2;
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m15602E1(boolean z10) {
        this.f42947c = (z10 ? 4294967296L : 1L) + this.f42947c;
        if (!z10) {
            this.f42948d = true;
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final boolean m15603F1() {
        return this.f42947c >= 4294967296L;
    }

    /* JADX INFO: renamed from: G1 */
    public long mo14325G1() {
        return !m15604H1() ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: H1 */
    public final boolean m15604H1() {
        C7151a<AbstractC7826e0<?>> c7151a = this.f42949e;
        if (c7151a == null) {
            return false;
        }
        int i10 = c7151a.f40413b;
        Object obj = null;
        if (i10 != c7151a.f40414c) {
            Object[] objArr = c7151a.f40412a;
            Object obj2 = objArr[i10];
            objArr[i10] = null;
            c7151a.f40413b = (i10 + 1) & (objArr.length - 1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            obj = obj2;
        }
        AbstractC7826e0 abstractC7826e0 = (AbstractC7826e0) obj;
        if (abstractC7826e0 == null) {
            return false;
        }
        abstractC7826e0.run();
        return true;
    }

    public void shutdown() {
    }
}
