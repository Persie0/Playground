package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ald extends alc {
    @Override // p000.alc
    /* JADX INFO: renamed from: g */
    public final void mo904g(Object obj) {
        alc.m897a("setValue");
        this.f630h++;
        this.f628f = obj;
        m899b(null);
    }

    /* JADX INFO: renamed from: h */
    public final void m905h(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.f624b) {
            obj2 = this.f629g;
            obj3 = alc.f623a;
            this.f629g = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        C0933qk c0933qkM19346b = C0933qk.m19346b();
        Runnable runnable = this.f631i;
        C0210gh c0210gh = c0933qkM19346b.f47492b;
        C0935qm c0935qm = (C0935qm) c0210gh;
        if (c0935qm.f47497c == null) {
            synchronized (c0935qm.f47495a) {
                if (((C0935qm) c0210gh).f47497c == null) {
                    ((C0935qm) c0210gh).f47497c = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        c0935qm.f47497c.post(runnable);
    }
}
