package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class u98 extends AbstractC3816z0 {

    /* JADX INFO: renamed from: a */
    public final List f63619a;

    public u98(List list) {
        list.getClass();
        this.f63619a = list;
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f63619a.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f63619a.get(u91.m22628u0(i, this));
    }

    @Override // p000.AbstractC3816z0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new s98(this, 0);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final ListIterator listIterator() {
        return new s98(this, 0);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final ListIterator listIterator(int i) {
        return new s98(this, i);
    }
}
