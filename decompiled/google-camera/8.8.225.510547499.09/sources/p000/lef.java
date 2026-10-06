package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lef extends Exception {
    public lef(String str) {
        super("Failed to compile shader:\n".concat(String.valueOf(str)));
    }
}
