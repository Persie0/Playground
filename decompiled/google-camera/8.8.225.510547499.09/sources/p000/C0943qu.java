package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: qu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0943qu implements Iterable {

    /* JADX INFO: renamed from: b */
    public C0939qq f47508b;

    /* JADX INFO: renamed from: c */
    public C0939qq f47509c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f47510d = new WeakHashMap();

    /* JADX INFO: renamed from: e */
    public int f47511e = 0;

    /* JADX INFO: renamed from: a */
    protected C0939qq mo19348a(Object obj) {
        C0939qq c0939qq = this.f47508b;
        while (c0939qq != null && !c0939qq.f47499a.equals(obj)) {
            c0939qq = c0939qq.f47501c;
        }
        return c0939qq;
    }

    /* JADX INFO: renamed from: b */
    public Object mo19349b(Object obj) {
        C0939qq c0939qqMo19348a = mo19348a(obj);
        if (c0939qqMo19348a == null) {
            return null;
        }
        this.f47511e--;
        if (!this.f47510d.isEmpty()) {
            Iterator it = this.f47510d.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0942qt) it.next()).mo19354aQ(c0939qqMo19348a);
            }
        }
        C0939qq c0939qq = c0939qqMo19348a.f47502d;
        C0939qq c0939qq2 = c0939qqMo19348a.f47501c;
        if (c0939qq != null) {
            c0939qq.f47501c = c0939qq2;
        } else {
            this.f47508b = c0939qq2;
        }
        C0939qq c0939qq3 = c0939qqMo19348a.f47501c;
        if (c0939qq3 != null) {
            c0939qq3.f47502d = c0939qq;
        } else {
            this.f47509c = c0939qq;
        }
        c0939qqMo19348a.f47501c = null;
        c0939qqMo19348a.f47502d = null;
        return c0939qqMo19348a.f47500b;
    }

    /* JADX INFO: renamed from: d */
    public final C0939qq m19357d(Object obj, Object obj2) {
        C0939qq c0939qq = new C0939qq(obj, obj2);
        this.f47511e++;
        C0939qq c0939qq2 = this.f47509c;
        if (c0939qq2 == null) {
            this.f47508b = c0939qq;
        } else {
            c0939qq2.f47501c = c0939qq;
            c0939qq.f47502d = c0939qq2;
        }
        this.f47509c = c0939qq;
        return c0939qq;
    }

    /* JADX INFO: renamed from: e */
    public final C0940qr m19358e() {
        C0940qr c0940qr = new C0940qr(this);
        this.f47510d.put(c0940qr, false);
        return c0940qr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0943qu)) {
            return false;
        }
        C0943qu c0943qu = (C0943qu) obj;
        if (this.f47511e != c0943qu.f47511e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0943qu.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((AbstractC0941qs) it).next();
            Map.Entry next2 = ((AbstractC0941qs) it2).next();
            if (next != null) {
                if (next != null || next.equals(next2)) {
                }
            } else if (next2 == null) {
                next2 = null;
                if (next != null) {
                }
            }
            return false;
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final Object m19359f(Object obj, Object obj2) {
        C0939qq c0939qqMo19348a = mo19348a(obj);
        if (c0939qqMo19348a != null) {
            return c0939qqMo19348a.f47500b;
        }
        m19357d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((AbstractC0941qs) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0937qo c0937qo = new C0937qo(this.f47508b, this.f47509c);
        this.f47510d.put(c0937qo, false);
        return c0937qo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0941qs) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
