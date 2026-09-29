package p067d8;

import android.util.Log;
import com.facebook.LoggingBehavior;
import dm.C5207g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import mo.C7661i;
import p291o7.C8004n;

/* JADX INFO: renamed from: d8.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5078r {

    /* JADX INFO: renamed from: e */
    public static final a f32986e = new a();

    /* JADX INFO: renamed from: f */
    public static final HashMap<String, String> f32987f = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final LoggingBehavior f32988a;

    /* JADX INFO: renamed from: b */
    public final String f32989b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f32990c;

    /* JADX INFO: renamed from: d */
    public final int f32991d;

    /* JADX INFO: renamed from: d8.r$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m10779a(LoggingBehavior loggingBehavior, int i10, String str, String str2) {
            C5207g.m11111f(loggingBehavior, "behavior");
            C5207g.m11111f(str, "tag");
            C5207g.m11111f(str2, "string");
            if (C8004n.m15879i(loggingBehavior)) {
                synchronized (this) {
                    try {
                        for (Map.Entry<String, String> entry : C5078r.f32987f.entrySet()) {
                            str2 = C7661i.m15254T2(str2, entry.getKey(), entry.getValue());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!C7661i.m15256V2(str, "FacebookSDK.", false)) {
                    str = C5207g.m11116k(str, "FacebookSDK.");
                }
                Log.println(i10, str, str2);
                if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m10780b(LoggingBehavior loggingBehavior, String str, String str2) {
            C5207g.m11111f(loggingBehavior, "behavior");
            C5207g.m11111f(str, "tag");
            C5207g.m11111f(str2, "string");
            m10779a(loggingBehavior, 3, str, str2);
        }

        /* JADX INFO: renamed from: c */
        public final void m10781c(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
            C5207g.m11111f(loggingBehavior, "behavior");
            C5207g.m11111f(str, "tag");
            if (C8004n.m15879i(loggingBehavior)) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                C5207g.m11110e(str3, "java.lang.String.format(format, *args)");
                m10779a(loggingBehavior, 3, str, str3);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: d */
        public final synchronized void m10782d(String str) {
            C5207g.m11111f(str, "accessToken");
            C8004n c8004n = C8004n.f43550a;
            if (!C8004n.m15879i(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                synchronized (this) {
                    C5078r.f32987f.put(str, "ACCESS_TOKEN_REMOVED");
                }
            }
        }
    }

    public C5078r(LoggingBehavior loggingBehavior) {
        C5207g.m11111f(loggingBehavior, "behavior");
        this.f32991d = 3;
        this.f32988a = loggingBehavior;
        C5056a0.m10746d("Request", "tag");
        this.f32989b = C5207g.m11116k("Request", "FacebookSDK.");
        this.f32990c = new StringBuilder();
    }

    /* JADX INFO: renamed from: a */
    public final void m10776a(String str) {
        C8004n c8004n = C8004n.f43550a;
        if (C8004n.m15879i(this.f32988a)) {
            this.f32990c.append(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10777b(Object obj, String str) {
        C5207g.m11111f(str, "key");
        C5207g.m11111f(obj, "value");
        Object[] objArr = {str, obj};
        C8004n c8004n = C8004n.f43550a;
        if (C8004n.m15879i(this.f32988a)) {
            StringBuilder sb2 = this.f32990c;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 2);
            String str2 = String.format("  %s:\t%s\n", Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            C5207g.m11110e(str2, "java.lang.String.format(format, *args)");
            sb2.append(str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10778c() {
        String string = this.f32990c.toString();
        C5207g.m11110e(string, "contents.toString()");
        f32986e.m10779a(this.f32988a, this.f32991d, this.f32989b, string);
        this.f32990c = new StringBuilder();
    }
}
