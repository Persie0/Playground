package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dmd extends aqa {
    public dmd(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "DELETE FROM shots WHERE start_millis < ?";
    }
}
