package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jrb {

    /* JADX INFO: renamed from: a */
    public static final zqb f46049a = new zqb();

    /* JADX INFO: renamed from: b */
    public static final zqb f46050b;

    static {
        zqb zqbVar = null;
        try {
            zqbVar = (zqb) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f46050b = zqbVar;
    }
}
