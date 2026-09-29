package p000;

import com.google.android.gms.internal.mlkit_vision_document_scanner.zzx;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dld extends xkb implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f35801b;

    /* JADX INFO: renamed from: c */
    public int f35802c;

    /* JADX INFO: renamed from: d */
    public final zzx f35803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dld(zzx zzxVar, int i) {
        super(0);
        int size = zzxVar.size();
        if (i < 0 || i > size) {
            v63.m23143u(oed.m17958f(i, "index", size));
            throw null;
        }
        this.f35801b = size;
        this.f35802c = i;
        this.f35803d = zzxVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m10455a(int i) {
        return this.f35803d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f35802c < this.f35801b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f35802c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f35802c;
        this.f35802c = i + 1;
        return m10455a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f35802c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f35802c - 1;
        this.f35802c = i;
        return m10455a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f35802c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
