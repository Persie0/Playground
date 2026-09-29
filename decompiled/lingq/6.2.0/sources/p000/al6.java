package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class al6 {

    /* JADX INFO: renamed from: a */
    public static final xk6 f805a;

    /* JADX INFO: renamed from: b */
    public static final xk6 f806b;

    static {
        xk6 xk6Var = null;
        try {
            xk6Var = (xk6) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f805a = xk6Var;
        f806b = new xk6();
    }
}
