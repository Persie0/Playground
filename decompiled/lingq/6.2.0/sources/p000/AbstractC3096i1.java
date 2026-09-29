package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: i1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3096i1 extends AbstractC3816z0 {
    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract AbstractC3096i1 mo13604f(int i, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract AbstractC3096i1 mo13605g(Object obj);

    /* JADX INFO: renamed from: h */
    public AbstractC3096i1 mo13606h(Collection collection) {
        x77 x77VarMo13607i = mo13607i();
        x77VarMo13607i.addAll(collection);
        return x77VarMo13607i.m24385g();
    }

    /* JADX INFO: renamed from: i */
    public abstract x77 mo13607i();

    @Override // p000.AbstractC3816z0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC3096i1 mo13608j(C3059h1 c3059h1);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC3096i1 mo13609k(int i);

    /* JADX INFO: renamed from: l */
    public abstract AbstractC3096i1 mo13610l(int i, Object obj);

    @Override // p000.AbstractC3816z0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final List subList(int i, int i2) {
        return new e14(this, i, i2);
    }
}
