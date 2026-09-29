package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wuc {

    /* JADX INFO: renamed from: a */
    public static final cvc f67324a;

    /* JADX INFO: renamed from: b */
    public static final cvc f67325b;

    static {
        cvc cvcVar = null;
        try {
            cvcVar = (cvc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f67324a = cvcVar;
        f67325b = new cvc();
    }
}
