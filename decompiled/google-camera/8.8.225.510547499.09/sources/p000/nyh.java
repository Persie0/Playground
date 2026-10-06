package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nyh {

    /* JADX INFO: renamed from: a */
    protected volatile nyw f45018a;

    /* JADX INFO: renamed from: b */
    public volatile nwr f45019b;

    static {
        nxf nxfVar = nxf.f44904a;
    }

    /* JADX INFO: renamed from: a */
    public final nwr m18171a() {
        if (this.f45019b != null) {
            return this.f45019b;
        }
        synchronized (this) {
            if (this.f45019b != null) {
                return this.f45019b;
            }
            if (this.f45018a == null) {
                this.f45019b = nwr.f44839b;
            } else {
                this.f45019b = this.f45018a.mo17758H();
            }
            return this.f45019b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyh)) {
            return false;
        }
        nyh nyhVar = (nyh) obj;
        nyw nywVar = this.f45018a;
        nyw nywVar2 = nyhVar.f45018a;
        if (nywVar == null && nywVar2 == null) {
            return m18171a().equals(nyhVar.m18171a());
        }
        if (nywVar == null || nywVar2 == null) {
            return nywVar != null ? nywVar.equals(nyhVar.m18172b(nywVar.mo18097cx())) : m18172b(nywVar2.mo18097cx()).equals(nywVar2);
        }
        return nywVar.equals(nywVar2);
    }

    public int hashCode() {
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final nyw m18172b(nyw nywVar) {
        if (this.f45018a == null) {
            synchronized (this) {
                if (this.f45018a == null) {
                    try {
                        this.f45018a = nywVar;
                        this.f45019b = nwr.f44839b;
                    } catch (nyb e) {
                        this.f45018a = nywVar;
                        this.f45019b = nwr.f44839b;
                    }
                }
            }
        }
        return this.f45018a;
    }
}
