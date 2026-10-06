package p000;

import android.content.Context;
import android.os.Debug;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llu {

    /* JADX INFO: renamed from: a */
    public static final nbh f38615a = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture");

    /* JADX INFO: renamed from: b */
    public final oju f38616b;

    /* JADX INFO: renamed from: c */
    public final Context f38617c;

    static {
        lku.m15663q(ffw.f21761g);
    }

    public llu(oju ojuVar, Context context) {
        this.f38616b = ojuVar;
        this.f38617c = context;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ mrm m15711a() {
        try {
            return mrm.m16829i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((nbe) ((nbe) ((nbe) f38615a.m17251b()).mo17283h(e)).mo17276G((char) 4538)).mo17290o("MemoryInfo.getOtherPss(which) failure");
            return mqu.f41450a;
        } catch (NoSuchMethodException e2) {
            return mqu.f41450a;
        } catch (Exception e3) {
            e = e3;
            ((nbe) ((nbe) ((nbe) f38615a.m17251b()).mo17283h(e)).mo17276G((char) 4538)).mo17290o("MemoryInfo.getOtherPss(which) failure");
            return mqu.f41450a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Long m15712b(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String strGroup = matcher.group(1);
            lku.m15662p(strGroup);
            return Long.valueOf(Long.parseLong(strGroup));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
