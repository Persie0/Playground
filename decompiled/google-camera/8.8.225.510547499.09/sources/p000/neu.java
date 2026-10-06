package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class neu {

    /* JADX INFO: renamed from: a */
    public static final nex f42156a;

    /* JADX INFO: renamed from: b */
    private static final String[] f42157b;

    static {
        nex neyVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        f42157b = strArr;
        for (int i = 0; i < 2; i++) {
            try {
                neyVar = (nex) Class.forName(strArr[i]).asSubclass(nex.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                neyVar = null;
            }
            if (neyVar != null) {
                f42156a = neyVar;
            }
        }
        neyVar = new ney();
        f42156a = neyVar;
    }
}
