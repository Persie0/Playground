package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mze implements Iterator {

    /* JADX INFO: renamed from: a */
    private final myy f41830a;

    /* JADX INFO: renamed from: b */
    private final Iterator f41831b;

    /* JADX INFO: renamed from: c */
    private myx f41832c;

    /* JADX INFO: renamed from: d */
    private int f41833d;

    /* JADX INFO: renamed from: e */
    private int f41834e;

    /* JADX INFO: renamed from: f */
    private boolean f41835f;

    public mze(myy myyVar, Iterator it) {
        this.f41830a = myyVar;
        this.f41831b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41833d > 0 || this.f41831b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iMo17161a = this.f41833d;
        if (iMo17161a == 0) {
            myx myxVar = (myx) this.f41831b.next();
            this.f41832c = myxVar;
            iMo17161a = myxVar.mo17161a();
            this.f41834e = iMo17161a;
        }
        this.f41833d = iMo17161a - 1;
        this.f41835f = true;
        myx myxVar2 = this.f41832c;
        myxVar2.getClass();
        return myxVar2.mo17162b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        lku.m15654h(this.f41835f);
        if (this.f41834e == 1) {
            this.f41831b.remove();
        } else {
            myy myyVar = this.f41830a;
            myx myxVar = this.f41832c;
            myxVar.getClass();
            myyVar.remove(myxVar.mo17162b());
        }
        this.f41834e--;
        this.f41835f = false;
    }
}
