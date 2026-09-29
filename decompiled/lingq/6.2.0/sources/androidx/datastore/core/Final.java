package androidx.datastore.core;

/* JADX INFO: loaded from: classes.dex */
public final class Final<T> extends State<T> {
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable th) {
        super(Integer.MAX_VALUE, null);
        th.getClass();
        this.finalException = th;
    }

    public final Throwable getFinalException() {
        return this.finalException;
    }
}
