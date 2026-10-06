package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edc extends RuntimeException {
    public edc(String str) {
        super(str);
    }

    public edc(Throwable th) {
        super("Error processing secondary payload.", th);
    }
}
