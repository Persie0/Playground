package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tgb {

    /* JADX INFO: renamed from: a */
    public static final String[] f62260a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX INFO: renamed from: b */
    public static final vgb f62261b;

    static {
        vgb vgbVar;
        for (int i = 0; i < 2; i++) {
            vgbVar = null;
            try {
                vgbVar = (vgb) Class.forName(f62260a[i]).asSubclass(vgb.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (vgbVar != null) {
                f62261b = vgbVar;
            }
        }
        vgbVar = new vgb();
        f62261b = vgbVar;
    }

    /* JADX INFO: renamed from: a */
    public static StackTraceElement[] m22029a(int i) {
        if (i <= 0 && i != -1) {
            C3386nv.m17626m("invalid maximum depth: 0");
            return null;
        }
        f62261b.getClass();
        if (!(i == -1 || i > 0)) {
            C3386nv.m17626m("maxDepth must be > 0 or -1");
            return null;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = rmd.class.getName();
        int i2 = 3;
        boolean z = false;
        while (true) {
            if (i2 >= stackTrace.length) {
                i2 = -1;
                break;
            }
            if (stackTrace[i2].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - i2;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, i2, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
