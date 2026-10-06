package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msw extends naz {

    /* JADX INFO: renamed from: a */
    public int f41568a = 2;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Iterator f41569b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mrp f41570c;

    /* JADX INFO: renamed from: d */
    private Object f41571d;

    protected msw() {
    }

    public msw(Iterator it, mrp mrpVar) {
        this.f41569b = it;
        this.f41570c = mrpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        lku.m15613H(this.f41568a != 4);
        int i = this.f41568a;
        int i2 = i - 1;
        Object obj = null;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return true;
            case 1:
            default:
                this.f41568a = 4;
                while (true) {
                    if (this.f41569b.hasNext()) {
                        Object next = this.f41569b.next();
                        if (this.f41570c.mo8324a(next)) {
                            obj = next;
                        }
                    } else {
                        this.f41568a = 3;
                    }
                }
                this.f41571d = obj;
                if (this.f41568a == 3) {
                    return false;
                }
                this.f41568a = 1;
                return true;
            case 2:
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f41568a = 2;
        Object obj = this.f41571d;
        this.f41571d = null;
        return obj;
    }
}
