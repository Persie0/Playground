package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h43 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final Iterator f41771a;

    /* JADX INFO: renamed from: b */
    public int f41772b = -1;

    /* JADX INFO: renamed from: c */
    public Object f41773c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ i43 f41774d;

    public h43(i43 i43Var) {
        this.f41774d = i43Var;
        this.f41771a = i43Var.f43477a.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m13042a() {
        Object next;
        i43 i43Var;
        do {
            Iterator it = this.f41771a;
            if (!it.hasNext()) {
                this.f41772b = 0;
                return;
            } else {
                next = it.next();
                i43Var = this.f41774d;
            }
        } while (((Boolean) i43Var.f43479c.invoke(next)).booleanValue() != i43Var.f43478b);
        this.f41773c = next;
        this.f41772b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f41772b == -1) {
            m13042a();
        }
        return this.f41772b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f41772b == -1) {
            m13042a();
        }
        if (this.f41772b == 0) {
            uk9.m22784s();
            return null;
        }
        Object obj = this.f41773c;
        this.f41773c = null;
        this.f41772b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
