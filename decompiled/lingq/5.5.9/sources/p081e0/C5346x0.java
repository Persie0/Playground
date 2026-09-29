package p081e0;

import androidx.compose.runtime.C0480e;
import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: e0.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5346x0 implements Iterator<Object>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public int f33641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0480e f33643c;

    public C5346x0(int i10, int i11, C0480e c0480e) {
        this.f33642b = i11;
        this.f33643c = c0480e;
        this.f33641a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33641a < this.f33642b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            return null;
        }
        C0480e c0480e = this.f33643c;
        Object[] objArr = c0480e.f3168c;
        int i10 = this.f33641a;
        this.f33641a = i10 + 1;
        return objArr[c0480e.m1795h(i10)];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
