package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class y38 {

    /* JADX INFO: renamed from: a */
    public static final z38 f69246a;

    static {
        z38 z38Var = null;
        try {
            z38Var = (z38) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (z38Var == null) {
            z38Var = new z38();
        }
        f69246a = z38Var;
    }

    /* JADX INFO: renamed from: a */
    public static z21 m24933a(Class cls) {
        f69246a.getClass();
        return new z21(cls);
    }
}
