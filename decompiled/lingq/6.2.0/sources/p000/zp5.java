package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class zp5 {

    /* JADX INFO: renamed from: a */
    public static final wp5 f71937a;

    /* JADX INFO: renamed from: b */
    public static final wp5 f71938b;

    static {
        wp5 wp5Var = null;
        try {
            wp5Var = (wp5) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f71937a = wp5Var;
        f71938b = new wp5();
    }
}
