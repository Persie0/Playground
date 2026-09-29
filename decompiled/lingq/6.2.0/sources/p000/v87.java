package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class v87 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC3760xi f65022a;

    /* JADX INFO: renamed from: b */
    public static final p58 f65023b;

    /* JADX INFO: renamed from: c */
    public static final ho5 f65024c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        int i = 8;
        if (property.equals("RoboVM")) {
            f65022a = null;
            f65023b = new p58(15);
            f65024c = new ho5(i);
        } else if (property.equals("Dalvik")) {
            f65022a = new ExecutorC3760xi(0);
            f65023b = new w38(15);
            f65024c = new pj0(i);
        } else {
            f65022a = null;
            f65023b = new x38();
            f65024c = new pj0(i);
        }
    }
}
