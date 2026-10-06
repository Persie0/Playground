package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class brx extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public brx(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
