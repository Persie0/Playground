package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m9a implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50819a;

    /* JADX INFO: renamed from: b */
    public final Iterator f50820b;

    public m9a(Iterator it, int i) {
        this.f50819a = i;
        switch (i) {
            case 1:
                it.getClass();
                this.f50820b = it;
                break;
            default:
                it.getClass();
                this.f50820b = it;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo6345a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo5476b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f50819a) {
            case 0:
                break;
        }
        return this.f50820b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f50819a) {
            case 0:
                return mo6345a(this.f50820b.next());
            default:
                return mo5476b(this.f50820b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f50819a) {
            case 0:
                this.f50820b.remove();
                break;
            default:
                this.f50820b.remove();
                break;
        }
    }
}
