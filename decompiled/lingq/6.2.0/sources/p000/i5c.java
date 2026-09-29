package p000;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i5c {

    /* JADX INFO: renamed from: a */
    public static final mdd f43560a;

    static {
        mdd c5cVar;
        int i = 0;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                c5cVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new z5c() : new c5c(i);
            } else {
                c5cVar = new c5c(1);
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = c5c.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            c5cVar = new c5c(i);
        }
        f43560a = c5cVar;
    }
}
