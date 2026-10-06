package p021j$.adapter;

/* JADX INFO: renamed from: j$.adapter.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0284a {

    /* JADX INFO: renamed from: a */
    public static final boolean f32758a;

    /* JADX INFO: renamed from: b */
    public static final boolean f32759b;

    /* JADX INFO: renamed from: c */
    public static final boolean f32760c;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        try {
            Class.forName("java.util.StringJoiner");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f32758a = z;
        try {
            Class.forName("java.nio.file.FileSystems");
            z2 = true;
        } catch (ClassNotFoundException unused2) {
            z2 = false;
        }
        f32759b = z2;
        try {
            Class.forName("android.os.Build");
            z3 = true;
        } catch (ClassNotFoundException unused3) {
        }
        f32760c = z3;
    }
}
