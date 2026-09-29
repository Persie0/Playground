package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class mpb extends bga implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f51714b;

    /* JADX INFO: renamed from: c */
    public int f51715c;

    /* JADX INFO: renamed from: d */
    public final zzbk f51716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpb(zzbk zzbkVar, int i) {
        super(3);
        int size = zzbkVar.size();
        if (i < 0 || i > size) {
            v63.m23143u(yda.m25099f(i, "index", size));
            throw null;
        }
        this.f51714b = size;
        this.f51715c = i;
        this.f51716d = zzbkVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m16991a(int i) {
        return this.f51716d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f51715c < this.f51714b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f51715c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f51715c;
        this.f51715c = i + 1;
        return m16991a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f51715c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f51715c - 1;
        this.f51715c = i;
        return m16991a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f51715c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
