package androidx.view;

import p208k.C6560c;

/* JADX INFO: renamed from: androidx.lifecycle.v */
/* JADX INFO: loaded from: classes.dex */
public class C1056v<T> extends LiveData<T> {
    @Override // androidx.view.LiveData
    /* JADX INFO: renamed from: i */
    public void mo3900i(T t10) {
        LiveData.m3892a("setValue");
        this.f6538g++;
        this.f6536e = t10;
        m3894c(null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m3963j(T t10) {
        boolean z10;
        synchronized (this.f6532a) {
            try {
                z10 = this.f6537f == LiveData.f6531k;
                this.f6537f = t10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            C6560c.m13159k0().m13160l0(this.f6541j);
        }
    }
}
