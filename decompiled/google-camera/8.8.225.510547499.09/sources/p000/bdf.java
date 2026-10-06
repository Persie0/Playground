package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bdf extends aqa {
    public bdf(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
