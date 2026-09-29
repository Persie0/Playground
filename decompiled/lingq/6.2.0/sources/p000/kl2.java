package p000;

import android.os.Build;
import android.util.Log;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kl2 {

    /* JADX INFO: renamed from: a */
    public int f47481a;

    /* JADX INFO: renamed from: b */
    public long f47482b;

    /* JADX INFO: renamed from: c */
    public Object f47483c;

    /* JADX INFO: renamed from: d */
    public Object f47484d;

    /* JADX INFO: renamed from: e */
    public final Object f47485e;

    public kl2(as9 as9Var, int i, long j, TimeUnit timeUnit) {
        as9Var.getClass();
        timeUnit.getClass();
        this.f47481a = i;
        this.f47482b = timeUnit.toNanos(j);
        this.f47483c = as9Var.m3023d();
        this.f47484d = new dh2(AbstractC3393o1.m17738m(new StringBuilder(), kcb.f47052b, " ConnectionPool connection closer"), 1, this);
        this.f47485e = new ConcurrentLinkedQueue();
        if (j > 0) {
            return;
        }
        C3386nv.m17624j(wq1.m24116l("keepAliveDuration <= 0: ", j));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public int m15328a(j18 j18Var, long j) {
        TimeZone timeZone = kcb.f47051a;
        ArrayList arrayList = j18Var.f44911p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String strConcat = "A connection to " + j18Var.f44898c.f44192a.f43720h + " was leaked. Did you forget to close a response body?";
                C2927dg c2927dg = u87.f63590a;
                C2927dg c2927dg2 = u87.f63590a;
                Object obj = ((g18) reference).f40050a;
                c2927dg2.getClass();
                if (Build.VERSION.SDK_INT >= 30) {
                    obj.getClass();
                    AbstractC3289l8.m15999i(obj).warnIfOpen();
                } else {
                    if (obj == null) {
                        strConcat = strConcat.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
                    }
                    Log.w("OkHttp", strConcat, (Throwable) obj);
                }
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    j18Var.f44912q = j - this.f47482b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public kl2() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        this.f47482b = 0L;
        this.f47481a = 0;
        this.f47485e = new an0();
    }
}
