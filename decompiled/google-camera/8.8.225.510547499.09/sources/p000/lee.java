package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lee extends Exception {
    public lee(String str) {
        super("Failed to link shader program:\n".concat(String.valueOf(str)));
    }
}
