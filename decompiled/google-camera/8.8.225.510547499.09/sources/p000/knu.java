package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knu {

    /* JADX INFO: renamed from: a */
    public final nqf f36650a;

    /* JADX INFO: renamed from: b */
    public final long f36651b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ knv f36652c;

    public knu(knv knvVar, long j) {
        this.f36652c = knvVar;
        this.f36651b = j;
        nqf nqfVarM17621g = nqf.m17621g();
        this.f36650a = nqfVarM17621g;
        nqfVarM17621g.mo2282d(new jzq(this, 18), not.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    final void m14602a(knt kntVar) {
        if (kntVar == null) {
            this.f36650a.mo8566a(new kec());
        } else {
            if (this.f36650a.mo14894e(kntVar)) {
                return;
            }
            kntVar.close();
        }
    }
}
