package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class wx2 {

    /* JADX INFO: renamed from: a */
    public static final tx2 f67468a = new tx2();

    /* JADX INFO: renamed from: b */
    public static final tx2 f67469b;

    static {
        tx2 tx2Var = null;
        try {
            tx2Var = (tx2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f67469b = tx2Var;
    }
}
