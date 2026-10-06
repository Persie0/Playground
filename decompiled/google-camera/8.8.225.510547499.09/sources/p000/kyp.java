package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyp extends Exception {
    public kyp(String str) {
        super(str);
    }

    public kyp(Exception exc) {
        super("Exception while parsing video", exc);
    }
}
