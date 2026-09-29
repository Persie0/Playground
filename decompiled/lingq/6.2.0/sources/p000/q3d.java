package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class q3d extends bga implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f57230b;

    /* JADX INFO: renamed from: c */
    public int f57231c;

    /* JADX INFO: renamed from: d */
    public final zzp f57232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3d(zzp zzpVar, int i) {
        super(1);
        int size = zzpVar.size();
        if (i < 0 || i > size) {
            v63.m23143u(ama.m578c(i, "index", size));
            throw null;
        }
        this.f57230b = size;
        this.f57231c = i;
        this.f57232d = zzpVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m19632a(int i) {
        return this.f57232d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f57231c < this.f57230b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f57231c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f57231c;
        this.f57231c = i + 1;
        return m19632a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f57231c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f57231c - 1;
        this.f57231c = i;
        return m19632a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f57231c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
