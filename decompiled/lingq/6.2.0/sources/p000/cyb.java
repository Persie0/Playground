package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cyb {

    /* JADX INFO: renamed from: a */
    public static final byb f34715a;

    /* JADX INFO: renamed from: b */
    public static final byb f34716b;

    static {
        byb bybVar = null;
        try {
            bybVar = (byb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f34715a = bybVar;
        f34716b = new byb();
    }
}
