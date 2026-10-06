package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyl extends oym {

    /* JADX INFO: renamed from: c */
    public static final oyl f46842c = new oyl();

    private oyl() {
        super(oyq.f46850b, oyq.f46851c, oyq.f46852d);
    }

    @Override // p000.oym, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.oqo
    public final String toString() {
        return "Dispatchers.Default";
    }
}
