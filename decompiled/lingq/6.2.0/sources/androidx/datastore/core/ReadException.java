package androidx.datastore.core;

/* JADX INFO: loaded from: classes.dex */
public final class ReadException<T> extends State<T> {
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th, int i) {
        super(i, null);
        th.getClass();
        this.readException = th;
    }

    public final Throwable getReadException() {
        return this.readException;
    }
}
