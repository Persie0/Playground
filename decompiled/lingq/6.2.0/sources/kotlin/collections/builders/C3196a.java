package kotlin.collections.builders;

import java.util.AbstractList;
import java.util.ListIterator;
import p000.C3386nv;
import p000.tg4;
import p000.uk9;

/* JADX INFO: renamed from: kotlin.collections.builders.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3196a implements ListIterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final ListBuilder.BuilderSubList f47678a;

    /* JADX INFO: renamed from: b */
    public int f47679b;

    /* JADX INFO: renamed from: c */
    public int f47680c = -1;

    /* JADX INFO: renamed from: d */
    public int f47681d;

    public C3196a(ListBuilder.BuilderSubList builderSubList, int i) {
        this.f47678a = builderSubList;
        this.f47679b = i;
        this.f47681d = ((AbstractList) builderSubList).modCount;
    }

    /* JADX INFO: renamed from: a */
    public final void m15402a() {
        if (((AbstractList) this.f47678a.f47658e).modCount == this.f47681d) {
            return;
        }
        C3386nv.m17619e();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m15402a();
        int i = this.f47679b;
        this.f47679b = i + 1;
        ListBuilder.BuilderSubList builderSubList = this.f47678a;
        builderSubList.add(i, obj);
        this.f47680c = -1;
        this.f47681d = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f47679b < this.f47678a.f47656c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f47679b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m15402a();
        int i = this.f47679b;
        ListBuilder.BuilderSubList builderSubList = this.f47678a;
        if (i >= builderSubList.f47656c) {
            uk9.m22784s();
            return null;
        }
        this.f47679b = i + 1;
        this.f47680c = i;
        return builderSubList.f47654a[builderSubList.f47655b + i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47679b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m15402a();
        int i = this.f47679b;
        if (i <= 0) {
            uk9.m22784s();
            return null;
        }
        int i2 = i - 1;
        this.f47679b = i2;
        this.f47680c = i2;
        ListBuilder.BuilderSubList builderSubList = this.f47678a;
        return builderSubList.f47654a[builderSubList.f47655b + i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f47679b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m15402a();
        int i = this.f47680c;
        if (i == -1) {
            C3386nv.m17633t("Call next() or previous() before removing element from the iterator.");
            return;
        }
        ListBuilder.BuilderSubList builderSubList = this.f47678a;
        builderSubList.mo4183f(i);
        this.f47679b = this.f47680c;
        this.f47680c = -1;
        this.f47681d = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m15402a();
        int i = this.f47680c;
        if (i != -1) {
            this.f47678a.set(i, obj);
        } else {
            C3386nv.m17633t("Call next() or previous() before replacing element from the iterator.");
        }
    }
}
