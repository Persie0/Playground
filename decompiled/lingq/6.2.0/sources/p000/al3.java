package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class al3 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f797a;

    /* JADX INFO: renamed from: b */
    public Object f798b;

    /* JADX INFO: renamed from: c */
    public int f799c;

    /* JADX INFO: renamed from: d */
    public final Object f800d;

    public al3(bl3 bl3Var) {
        this.f797a = 0;
        this.f800d = bl3Var;
        this.f799c = -2;
    }

    /* JADX INFO: renamed from: a */
    public void m539a() {
        Object objInvoke;
        int i = this.f799c;
        bl3 bl3Var = (bl3) this.f800d;
        if (i == -2) {
            objInvoke = ((ui3) bl3Var.f8659c).mo0a();
        } else {
            vi3 vi3Var = bl3Var.f8658b;
            Object obj = this.f798b;
            obj.getClass();
            objInvoke = vi3Var.invoke(obj);
        }
        this.f798b = objInvoke;
        this.f799c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f797a) {
            case 0:
                if (this.f799c < 0) {
                    m539a();
                }
                return this.f799c == 1;
            default:
                return this.f799c < ((Map) this.f800d).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.f797a) {
            case 0:
                if (this.f799c < 0) {
                    m539a();
                }
                if (this.f799c == 0) {
                    uk9.m22784s();
                    return null;
                }
                Object obj2 = this.f798b;
                obj2.getClass();
                this.f799c = -1;
                return obj2;
            default:
                if (hasNext()) {
                    obj = this.f798b;
                    this.f799c++;
                    Object obj3 = ((Map) this.f800d).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.f798b = ((me5) obj3).f51206b;
                } else {
                    uk9.m22784s();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f797a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public al3(Object obj, Map map) {
        this.f797a = 1;
        this.f798b = obj;
        this.f800d = map;
    }
}
