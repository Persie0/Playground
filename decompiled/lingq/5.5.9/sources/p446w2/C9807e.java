package p446w2;

import p081e0.C5339u;

/* JADX INFO: renamed from: w2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9807e<T> extends C5339u {

    /* JADX INFO: renamed from: c */
    public final Object f49926c;

    public C9807e(int i10) {
        super(i10);
        this.f49926c = new Object();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.C5339u, p446w2.InterfaceC9806d
    /* JADX INFO: renamed from: a */
    public final boolean mo11464a(T t10) {
        boolean zMo11464a;
        synchronized (this.f49926c) {
            zMo11464a = super.mo11464a(t10);
        }
        return zMo11464a;
    }

    @Override // p081e0.C5339u, p446w2.InterfaceC9806d
    /* JADX INFO: renamed from: b */
    public final T mo11465b() {
        T t10;
        synchronized (this.f49926c) {
            t10 = (T) super.mo11465b();
        }
        return t10;
    }
}
