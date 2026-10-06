package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvz implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mwa f41698a;

    /* JADX INFO: renamed from: b */
    private int f41699b;

    /* JADX INFO: renamed from: c */
    private int f41700c;

    /* JADX INFO: renamed from: d */
    private int f41701d;

    /* JADX INFO: renamed from: e */
    private int f41702e;

    public mvz(mwa mwaVar) {
        this.f41698a = mwaVar;
        mwb mwbVar = mwaVar.f41705b;
        this.f41699b = mwbVar.f41710e;
        this.f41700c = -1;
        this.f41701d = mwbVar.f41709d;
        this.f41702e = mwbVar.f41708c;
    }

    /* JADX INFO: renamed from: a */
    private final void m17040a() {
        if (this.f41698a.f41705b.f41709d != this.f41701d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m17040a();
        return this.f41699b != -2 && this.f41702e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo17039a = this.f41698a.mo17039a(this.f41699b);
        int i = this.f41699b;
        this.f41700c = i;
        this.f41699b = this.f41698a.f41705b.f41711f[i];
        this.f41702e--;
        return objMo17039a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m17040a();
        lku.m15654h(this.f41700c != -1);
        mwb mwbVar = this.f41698a.f41705b;
        int i = this.f41700c;
        mwbVar.m17053h(i, mkv.m16523ae(mwbVar.f41706a[i]));
        int i2 = this.f41699b;
        mwb mwbVar2 = this.f41698a.f41705b;
        if (i2 == mwbVar2.f41708c) {
            this.f41699b = this.f41700c;
        }
        this.f41700c = -1;
        this.f41701d = mwbVar2.f41709d;
    }
}
