package p000;

/* JADX INFO: renamed from: cd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0085cd {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5249a = 0;

    /* JADX INFO: renamed from: b */
    private static final C1117xf f5250b = new C1117xf();

    /* JADX INFO: renamed from: a */
    public static Class m3475a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C1117xf c1117xf = f5250b;
        C1117xf c1117xf2 = (C1117xf) c1117xf.get(classLoader);
        if (c1117xf2 == null) {
            c1117xf2 = new C1117xf();
            c1117xf.put(classLoader, c1117xf2);
        }
        Class cls = (Class) c1117xf2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1117xf2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: b */
    public ComponentCallbacksC0077bw mo3476b(String str) {
        throw null;
    }
}
