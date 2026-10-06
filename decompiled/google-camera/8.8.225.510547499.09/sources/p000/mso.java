package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mso extends RuntimeException {
    public mso() {
    }

    public mso(String str) {
        super(str);
    }

    public mso(Throwable th, byte[] bArr) {
        super("Initialize library failed.", th);
    }

    public mso(Throwable th) {
        super(th);
    }
}
