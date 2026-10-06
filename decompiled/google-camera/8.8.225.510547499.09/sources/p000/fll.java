package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fll implements flp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ float f22506a;

    public fll(float f) {
        this.f22506a = f;
    }

    @Override // p000.flp
    /* JADX INFO: renamed from: a */
    public final fli mo8554a() {
        return fli.TOTAL_SENSITIVITY;
    }

    @Override // p000.flp
    /* JADX INFO: renamed from: b */
    public final boolean mo8555b(gsr gsrVar, gsr gsrVar2) {
        if (gsrVar.f26261u == 1 && gsrVar.f26262v == 0) {
            return false;
        }
        long j = ((((long) gsrVar2.f26246f) * gsrVar2.f26244d) * ((long) gsrVar2.f26247g)) / 100;
        return ((float) Math.abs((((((long) gsrVar.f26246f) * gsrVar.f26244d) * ((long) gsrVar.f26247g)) / 100) - j)) > ((float) j) * this.f22506a;
    }
}
