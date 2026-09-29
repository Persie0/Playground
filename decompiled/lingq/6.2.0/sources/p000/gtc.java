package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtc {

    /* JADX INFO: renamed from: a */
    public static final wsc f41314a;

    /* JADX INFO: renamed from: b */
    public static final wsc f41315b;

    static {
        wsc wscVar = null;
        try {
            wscVar = (wsc) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f41314a = wscVar;
        f41315b = new wsc();
    }
}
