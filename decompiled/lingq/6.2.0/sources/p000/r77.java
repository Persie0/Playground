package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r77 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58857a = 0;

    /* JADX INFO: renamed from: b */
    public final Iterator f58858b;

    public r77(o77 o77Var) {
        zba[] zbaVarArr = new zba[8];
        for (int i = 0; i < 8; i++) {
            zbaVarArr[i] = new cca(this);
        }
        this.f58858b = new p77(o77Var, zbaVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f58857a) {
            case 0:
                return ((p77) this.f58858b).f52444c;
            default:
                return this.f58858b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f58857a) {
            case 0:
                return (Map.Entry) ((p77) this.f58858b).next();
            default:
                return (toa) this.f58858b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f58857a) {
            case 0:
                ((p77) this.f58858b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r77(roa roaVar) {
        this.f58858b = roaVar.f59665j.iterator();
    }
}
