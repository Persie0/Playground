package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nbm extends ncr {

    /* JADX INFO: renamed from: a */
    public Object[] f41943a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int f41944b = 0;

    /* JADX INFO: renamed from: a */
    public final int m17263a(nbz nbzVar) {
        for (int i = 0; i < this.f41944b; i++) {
            if (this.f41943a[i + i].equals(nbzVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.ncr
    /* JADX INFO: renamed from: b */
    public final int mo17264b() {
        return this.f41944b;
    }

    @Override // p000.ncr
    /* JADX INFO: renamed from: c */
    public final nbz mo17265c(int i) {
        if (i < this.f41944b) {
            return (nbz) this.f41943a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p000.ncr
    /* JADX INFO: renamed from: d */
    public final Object mo17266d(nbz nbzVar) {
        int iM17263a = m17263a(nbzVar);
        if (iM17263a != -1) {
            return nbzVar.m17310d(this.f41943a[iM17263a + iM17263a + 1]);
        }
        return null;
    }

    @Override // p000.ncr
    /* JADX INFO: renamed from: e */
    public final Object mo17267e(int i) {
        if (i < this.f41944b) {
            return this.f41943a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f41944b; i++) {
            sb.append(" '");
            sb.append(mo17265c(i));
            sb.append("': ");
            sb.append(mo17267e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
