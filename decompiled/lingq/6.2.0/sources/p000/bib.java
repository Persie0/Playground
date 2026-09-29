package p000;

import com.google.android.gms.internal.common.zzah;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bib extends xkb implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f8567b;

    /* JADX INFO: renamed from: c */
    public int f8568c;

    /* JADX INFO: renamed from: d */
    public final zzah f8569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bib(zzah zzahVar, int i) {
        super(1);
        int size = zzahVar.size();
        if (i < 0 || i > size) {
            v63.m23143u(ted.m22022d(i, "index", size));
            throw null;
        }
        this.f8567b = size;
        this.f8568c = i;
        this.f8569d = zzahVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m3743a(int i) {
        return this.f8569d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8568c < this.f8567b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8568c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f8568c;
        this.f8568c = i + 1;
        return m3743a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8568c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f8568c - 1;
        this.f8568c = i;
        return m3743a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8568c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
