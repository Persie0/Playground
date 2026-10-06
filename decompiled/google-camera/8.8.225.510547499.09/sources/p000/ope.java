package p000;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ope implements Iterable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f46371a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f46372b;

    public /* synthetic */ ope(Deque deque, int i) {
        this.f46372b = i;
        this.f46371a = deque;
    }

    public ope(opa opaVar, int i) {
        this.f46372b = i;
        this.f46371a = opaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, opa] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Deque] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f46372b) {
            case 0:
                return this.f46371a.mo18817a();
            default:
                return this.f46371a.descendingIterator();
        }
    }
}
