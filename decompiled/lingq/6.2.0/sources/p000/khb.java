package p000;

import com.google.android.gms.internal.mlkit_common.zzaf;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class khb extends bga implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f47307b;

    /* JADX INFO: renamed from: c */
    public int f47308c;

    /* JADX INFO: renamed from: d */
    public final zzaf f47309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khb(zzaf zzafVar, int i) {
        super(2);
        int size = zzafVar.size();
        nda.m17386j(i, size);
        this.f47307b = size;
        this.f47308c = i;
        this.f47309d = zzafVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m15243a(int i) {
        return this.f47309d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f47308c < this.f47307b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f47308c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f47308c;
        this.f47308c = i + 1;
        return m15243a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47308c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f47308c - 1;
        this.f47308c = i;
        return m15243a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f47308c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
