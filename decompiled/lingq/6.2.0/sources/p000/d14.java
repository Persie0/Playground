package p000;

import com.google.common.collect.ImmutableList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class d14 extends bga implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f34830b;

    /* JADX INFO: renamed from: c */
    public int f34831c;

    /* JADX INFO: renamed from: d */
    public final ImmutableList f34832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d14(int i, ImmutableList immutableList) {
        super(0);
        int size = immutableList.size();
        bna.m3981w(i, size);
        this.f34830b = size;
        this.f34831c = i;
        this.f34832d = immutableList;
    }

    /* JADX INFO: renamed from: a */
    public final Object m9970a(int i) {
        return this.f34832d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f34831c < this.f34830b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f34831c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f34831c;
        this.f34831c = i + 1;
        return m9970a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34831c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f34831c - 1;
        this.f34831c = i;
        return m9970a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34831c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
