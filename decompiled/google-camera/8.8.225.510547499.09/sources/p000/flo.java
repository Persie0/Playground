package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class flo implements flp {

    /* JADX INFO: renamed from: a */
    private gsr f22512a = null;

    /* JADX INFO: renamed from: b */
    private final fkp f22513b;

    public flo(fkp fkpVar) {
        this.f22513b = fkpVar;
    }

    @Override // p000.flp
    /* JADX INFO: renamed from: a */
    public final fli mo8554a() {
        return fli.f22491h;
    }

    @Override // p000.flp
    /* JADX INFO: renamed from: b */
    public final synchronized boolean mo8555b(gsr gsrVar, gsr gsrVar2) {
        gsr gsrVar3 = this.f22512a;
        if (gsrVar3 != null && Math.abs(gsrVar.f26243c - gsrVar3.f26243c) <= 100000000) {
            float fM8525a = this.f22513b.m8525a(gsrVar, gsrVar3) * gsrVar.f26244d;
            this.f22512a = gsrVar;
            if (fM8525a <= 1.0E9f) {
                return false;
            }
            this.f22512a = null;
            return true;
        }
        this.f22512a = gsrVar;
        return false;
    }
}
