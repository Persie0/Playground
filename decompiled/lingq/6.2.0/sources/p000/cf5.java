package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cf5 {

    /* JADX INFO: renamed from: a */
    public static final bf5 f10001a;

    /* JADX INFO: renamed from: b */
    public static final bf5 f10002b;

    static {
        ho7 ho7Var = ho7.f42713c;
        bf5 bf5Var = null;
        try {
            bf5Var = (bf5) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10001a = bf5Var;
        f10002b = new bf5();
    }
}
