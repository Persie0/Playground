package p000;

import com.google.android.gms.internal.play_billing.zzbw;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yqb extends xkb implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f70303b;

    /* JADX INFO: renamed from: c */
    public int f70304c;

    /* JADX INFO: renamed from: d */
    public final zzbw f70305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqb(zzbw zzbwVar, int i) {
        super(2);
        int size = zzbwVar.size();
        rla.m20708b(i, size);
        this.f70303b = size;
        this.f70304c = i;
        this.f70305d = zzbwVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m25287a(int i) {
        return this.f70305d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f70304c < this.f70303b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f70304c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f70304c;
        this.f70304c = i + 1;
        return m25287a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f70304c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f70304c - 1;
        this.f70304c = i;
        return m25287a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f70304c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
