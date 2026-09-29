package androidx.collection;

import java.util.Iterator;
import p000.j66;
import p000.omd;
import p000.q66;
import p000.tg4;
import p000.vx8;

/* JADX INFO: renamed from: androidx.collection.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0039b implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1289a = 0;

    /* JADX INFO: renamed from: b */
    public int f1290b = -1;

    /* JADX INFO: renamed from: c */
    public final vx8 f1291c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1292d;

    public C0039b(q66 q66Var) {
        this.f1292d = q66Var;
        this.f1291c = omd.m18129S(new MutableSetWrapper$iterator$1$iterator$1(q66Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1289a) {
            case 0:
                break;
        }
        return this.f1291c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1289a) {
            case 0:
                break;
        }
        return this.f1291c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f1289a;
        Object obj = this.f1292d;
        switch (i) {
            case 0:
                int i2 = this.f1290b;
                if (i2 != -1) {
                    ((j66) obj).f45118b.m13695h(i2);
                    this.f1290b = -1;
                }
                break;
            default:
                int i3 = this.f1290b;
                if (i3 != -1) {
                    ((q66) obj).f57325b.m17820m(i3);
                    this.f1290b = -1;
                }
                break;
        }
    }

    public C0039b(j66 j66Var) {
        this.f1292d = j66Var;
        this.f1291c = omd.m18129S(new MutableOrderedSetWrapper$iterator$1$iterator$1(j66Var, this, null));
    }
}
