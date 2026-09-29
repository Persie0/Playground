package p233l3;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import p258m6.C7492l;
import p407u5.InterfaceC9460k;

/* JADX INFO: renamed from: l3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7248c {

    /* JADX INFO: renamed from: a */
    public final Object f40719a;

    public AbstractC7248c(int i10) {
        if (i10 == 2) {
            this.f40719a = new HashSet();
        } else {
            char[] cArr = C7492l.f41383a;
            this.f40719a = new ArrayDeque(20);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12193a();

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC9460k mo14594b();

    /* JADX INFO: renamed from: c */
    public final InterfaceC9460k m14595c() {
        InterfaceC9460k interfaceC9460kMo14594b = (InterfaceC9460k) ((Queue) this.f40719a).poll();
        if (interfaceC9460kMo14594b == null) {
            interfaceC9460kMo14594b = mo14594b();
        }
        return interfaceC9460kMo14594b;
    }

    /* JADX INFO: renamed from: d */
    public abstract float mo4953d(Object obj);

    /* JADX INFO: renamed from: e */
    public final void m14596e(InterfaceC9460k interfaceC9460k) {
        Object obj = this.f40719a;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(interfaceC9460k);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo4954f(float f3, Object obj);
}
