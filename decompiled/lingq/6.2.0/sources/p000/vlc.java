package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vlc {

    /* JADX INFO: renamed from: a */
    public static final olc f65574a = new olc();

    /* JADX INFO: renamed from: b */
    public static final olc f65575b;

    static {
        olc olcVar = null;
        try {
            olcVar = (olc) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f65575b = olcVar;
    }
}
