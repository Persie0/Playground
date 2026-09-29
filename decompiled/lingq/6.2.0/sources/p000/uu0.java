package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class uu0 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final int f64356a;

    /* JADX INFO: renamed from: b */
    public final int f64357b;

    /* JADX INFO: renamed from: c */
    public boolean f64358c;

    /* JADX INFO: renamed from: d */
    public int f64359d;

    public uu0(char c, char c2, int i) {
        this.f64356a = i;
        this.f64357b = c2;
        boolean z = false;
        if (i <= 0 ? fa4.m11651m(c, c2) >= 0 : fa4.m11651m(c, c2) <= 0) {
            z = true;
        }
        this.f64358c = z;
        this.f64359d = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f64358c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f64359d;
        if (i != this.f64357b) {
            this.f64359d = this.f64356a + i;
        } else {
            if (!this.f64358c) {
                uk9.m22784s();
                return null;
            }
            this.f64358c = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
