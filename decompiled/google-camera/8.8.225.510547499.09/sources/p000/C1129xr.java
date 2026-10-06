package p000;

/* JADX INFO: renamed from: xr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1129xr extends AbstractC1121xj {
    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: a */
    public final void mo19573a(C1130xs c1130xs, C1130xs c1130xs2) {
        c1130xs.next = c1130xs2;
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: b */
    public final void mo19574b(C1130xs c1130xs, Thread thread) {
        c1130xs.thread = thread;
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: c */
    public final boolean mo19575c(AbstractC1131xt abstractC1131xt, C1125xn c1125xn, C1125xn c1125xn2) {
        synchronized (abstractC1131xt) {
            if (abstractC1131xt.listeners != c1125xn) {
                return false;
            }
            abstractC1131xt.listeners = c1125xn2;
            return true;
        }
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: d */
    public final boolean mo19576d(AbstractC1131xt abstractC1131xt, Object obj, Object obj2) {
        synchronized (abstractC1131xt) {
            if (abstractC1131xt.value != obj) {
                return false;
            }
            abstractC1131xt.value = obj2;
            return true;
        }
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: e */
    public final boolean mo19577e(AbstractC1131xt abstractC1131xt, C1130xs c1130xs, C1130xs c1130xs2) {
        synchronized (abstractC1131xt) {
            if (abstractC1131xt.waiters != c1130xs) {
                return false;
            }
            abstractC1131xt.waiters = c1130xs2;
            return true;
        }
    }
}
