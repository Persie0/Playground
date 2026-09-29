package p474x5;

import java.util.ArrayDeque;
import p258m6.C7489i;

/* JADX INFO: renamed from: x5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C10088m extends C7489i<C10089n.a<Object>, Object> {
    public C10088m() {
        super(500L);
    }

    @Override // p258m6.C7489i
    /* JADX INFO: renamed from: c */
    public final void mo14875c(C10089n.a<Object> aVar, Object obj) {
        C10089n.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = C10089n.a.f51175d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
