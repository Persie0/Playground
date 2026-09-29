package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class uc4 extends bga {

    /* JADX INFO: renamed from: b */
    public final Object f63712b;

    /* JADX INFO: renamed from: c */
    public boolean f63713c;

    public uc4(Object obj) {
        super(0);
        this.f63712b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f63713c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f63713c) {
            uk9.m22784s();
            return null;
        }
        this.f63713c = true;
        return this.f63712b;
    }
}
