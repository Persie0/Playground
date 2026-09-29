package p136gc;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: gc.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5759o {

    /* JADX INFO: renamed from: a */
    public final Object f34832a = new Object();

    /* JADX INFO: renamed from: b */
    public ArrayDeque f34833b;

    /* JADX INFO: renamed from: c */
    public boolean f34834c;

    /* JADX INFO: renamed from: a */
    public final void m12119a(InterfaceC5758n interfaceC5758n) {
        synchronized (this.f34832a) {
            if (this.f34833b == null) {
                this.f34833b = new ArrayDeque();
            }
            this.f34833b.add(interfaceC5758n);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m12120b(AbstractC5751g abstractC5751g) {
        InterfaceC5758n interfaceC5758n;
        synchronized (this.f34832a) {
            if (this.f34833b == null || this.f34834c) {
                return;
            }
            this.f34834c = true;
            while (true) {
                synchronized (this.f34832a) {
                    interfaceC5758n = (InterfaceC5758n) this.f34833b.poll();
                    if (interfaceC5758n == null) {
                        this.f34834c = false;
                        return;
                    }
                }
                interfaceC5758n.mo12118c(abstractC5751g);
            }
        }
    }
}
