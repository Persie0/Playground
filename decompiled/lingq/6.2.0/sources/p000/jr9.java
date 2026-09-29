package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jr9 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final Iterator f46044a;

    /* JADX INFO: renamed from: b */
    public int f46045b = -1;

    /* JADX INFO: renamed from: c */
    public Object f46046c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kr9 f46047d;

    public jr9(kr9 kr9Var) {
        this.f46047d = kr9Var;
        this.f46044a = kr9Var.f48369a.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m14629a() {
        Iterator it = this.f46044a;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) this.f46047d.f48370b.invoke(next)).booleanValue()) {
                this.f46045b = 1;
                this.f46046c = next;
                return;
            }
        }
        this.f46045b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f46045b == -1) {
            m14629a();
        }
        return this.f46045b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f46045b == -1) {
            m14629a();
        }
        if (this.f46045b == 0) {
            uk9.m22784s();
            return null;
        }
        Object obj = this.f46046c;
        this.f46046c = null;
        this.f46045b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
