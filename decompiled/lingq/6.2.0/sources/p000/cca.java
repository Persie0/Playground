package p000;

/* JADX INFO: loaded from: classes.dex */
public final class cca extends zba {

    /* JADX INFO: renamed from: d */
    public final r77 f9894d;

    public cca(r77 r77Var) {
        this.f9894d = r77Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f71321c;
        this.f71321c = i + 2;
        Object[] objArr = this.f71319a;
        return new a66(this.f9894d, objArr[i], objArr[i + 1]);
    }
}
