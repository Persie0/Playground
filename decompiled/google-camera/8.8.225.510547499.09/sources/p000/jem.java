package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jem extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a */
    private final jcw f33834a;

    public jem(jcw jcwVar) {
        this.f33834a = jcwVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.f33834a)));
    }
}
