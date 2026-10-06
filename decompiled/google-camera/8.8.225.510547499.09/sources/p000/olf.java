package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class olf {

    /* JADX INFO: renamed from: a */
    public final olh f46239a;

    /* JADX INFO: renamed from: b */
    public int f46240b;

    /* JADX INFO: renamed from: c */
    public int f46241c = -1;

    public olf(olh olhVar) {
        this.f46239a = olhVar;
        m18617a();
    }

    /* JADX INFO: renamed from: a */
    public final void m18617a() {
        while (true) {
            int i = this.f46240b;
            olh olhVar = this.f46239a;
            if (i >= olhVar.f46246d || olhVar.f46245c[i] >= 0) {
                return;
            } else {
                this.f46240b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.f46240b < this.f46239a.f46246d;
    }

    public final void remove() {
        if (this.f46241c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        this.f46239a.m18628f();
        this.f46239a.m18629g(this.f46241c);
        this.f46241c = -1;
    }
}
