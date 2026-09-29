package p118fe;

import ae.C0062b;
import com.google.firebase.messaging.C3248k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p533ze.InterfaceC10480b;
import p533ze.InterfaceC10481c;
import p533ze.InterfaceC10482d;

/* JADX INFO: renamed from: fe.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5522n implements InterfaceC10482d, InterfaceC10481c {

    /* JADX INFO: renamed from: a */
    public final HashMap f34185a = new HashMap();

    /* JADX INFO: renamed from: b */
    public ArrayDeque f34186b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final Executor f34187c;

    public C5522n(Executor executor) {
        this.f34187c = executor;
    }

    @Override // p533ze.InterfaceC10482d
    /* JADX INFO: renamed from: a */
    public final void mo11762a(C3248k c3248k) {
        mo11763b(this.f34187c, c3248k);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p533ze.InterfaceC10482d
    /* JADX INFO: renamed from: b */
    public final synchronized void mo11763b(Executor executor, InterfaceC10480b interfaceC10480b) {
        executor.getClass();
        if (!this.f34185a.containsKey(C0062b.class)) {
            this.f34185a.put(C0062b.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f34185a.get(C0062b.class)).put(interfaceC10480b, executor);
    }
}
