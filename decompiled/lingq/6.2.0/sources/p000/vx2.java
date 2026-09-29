package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vx2 {

    /* JADX INFO: renamed from: a */
    public static final sx2 f66042a = new sx2();

    /* JADX INFO: renamed from: b */
    public static final rx2 f66043b;

    static {
        rx2 rx2Var = null;
        try {
            rx2Var = (rx2) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f66043b = rx2Var;
    }

    /* JADX INFO: renamed from: a */
    public static rx2 m23565a() {
        rx2 rx2Var = f66043b;
        if (rx2Var != null) {
            return rx2Var;
        }
        C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
        return null;
    }
}
