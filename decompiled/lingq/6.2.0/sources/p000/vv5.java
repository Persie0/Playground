package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class vv5 implements pv5 {

    /* JADX INFO: renamed from: a */
    public final qq5 f65982a;

    /* JADX INFO: renamed from: d */
    public int f65985d;

    /* JADX INFO: renamed from: e */
    public boolean f65986e;

    /* JADX INFO: renamed from: c */
    public final ArrayList f65984c = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Object f65983b = new Object();

    public vv5(q90 q90Var, boolean z) {
        this.f65982a = new qq5(q90Var, z);
    }

    @Override // p000.pv5
    /* JADX INFO: renamed from: a */
    public final Object mo12928a() {
        return this.f65983b;
    }

    @Override // p000.pv5
    /* JADX INFO: renamed from: b */
    public final z0a mo12929b() {
        return this.f65982a.f58075o;
    }

    /* JADX INFO: renamed from: c */
    public final void m23559c(int i) {
        this.f65985d = i;
        this.f65986e = false;
        this.f65984c.clear();
    }
}
