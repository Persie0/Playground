package androidx.view;

import android.os.Handler;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.lifecycle.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1034g0 {

    /* JADX INFO: renamed from: a */
    public final C1052r f6649a;

    /* JADX INFO: renamed from: b */
    public final Handler f6650b;

    /* JADX INFO: renamed from: c */
    public a f6651c;

    /* JADX INFO: renamed from: androidx.lifecycle.g0$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C1052r f6652a;

        /* JADX INFO: renamed from: b */
        public final Lifecycle.Event f6653b;

        /* JADX INFO: renamed from: c */
        public boolean f6654c;

        public a(C1052r c1052r, Lifecycle.Event event) {
            C5207g.m11111f(c1052r, "registry");
            C5207g.m11111f(event, "event");
            this.f6652a = c1052r;
            this.f6653b = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f6654c) {
                this.f6652a.m3955f(this.f6653b);
                this.f6654c = true;
            }
        }
    }

    public C1034g0(InterfaceC1051q interfaceC1051q) {
        C5207g.m11111f(interfaceC1051q, "provider");
        this.f6649a = new C1052r(interfaceC1051q);
        this.f6650b = new Handler();
    }

    /* JADX INFO: renamed from: a */
    public final void m3938a(Lifecycle.Event event) {
        a aVar = this.f6651c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f6649a, event);
        this.f6651c = aVar2;
        this.f6650b.postAtFrontOfQueue(aVar2);
    }
}
