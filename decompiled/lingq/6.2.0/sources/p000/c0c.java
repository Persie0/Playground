package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c0c {

    /* JADX INFO: renamed from: a */
    public static final uzb f9294a;

    /* JADX INFO: renamed from: b */
    public static final uzb f9295b;

    static {
        uzb uzbVar = null;
        try {
            uzbVar = (uzb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f9294a = uzbVar;
        f9295b = new uzb();
    }
}
