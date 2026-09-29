package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t98 extends AbstractC2985f1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62023a;

    public t98(ArrayList arrayList) {
        this.f62023a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f62023a.add(u91.m22629v0(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f62023a.clear();
    }

    @Override // p000.AbstractC2985f1
    /* JADX INFO: renamed from: d */
    public final int mo4182d() {
        return this.f62023a.size();
    }

    @Override // p000.AbstractC2985f1
    /* JADX INFO: renamed from: f */
    public final Object mo4183f(int i) {
        return this.f62023a.remove(u91.m22628u0(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f62023a.get(u91.m22628u0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new s98(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new s98(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f62023a.set(u91.m22628u0(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new s98(this, i);
    }
}
