package p000;

import android.content.Context;
import android.util.Pair;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadType;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ke4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f47091r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f47092s;

    /* JADX INFO: renamed from: q */
    public long f47093q;

    static {
        List list = se4.f60736a;
        f47091r = "JobSamsungCloudAdvertisingId";
        sj5 sj5VarM20396w = r46.m20396w();
        f47092s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobSamsungCloudAdvertisingId");
    }

    /* JADX INFO: renamed from: q */
    public static void m15157q(ce4 ce4Var) {
        CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
        Context context = ((d74) ce4Var.f9968c).f35077a;
        List listSingletonList = Collections.singletonList("gaid");
        je4 je4Var = new je4();
        new AtomicBoolean(false);
        cloudDevSdk.request(context, "KVA", listSingletonList, je4Var);
    }

    /* JADX INFO: renamed from: r */
    public static ke4 m15158r() {
        ke4 ke4Var = new ke4(f47091r, Arrays.asList("JobInit", se4.f60739d), JobType.Persistent, TaskQueue.IO, f47092s);
        ke4Var.f47093q = 0L;
        return ke4Var;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        Pair pair = (Pair) obj;
        if (z) {
            this.f47093q = System.currentTimeMillis();
            g02 g02Var = (g02) ce4Var.f9969d;
            if (pair != null) {
                d02 d02VarM12256d = g02Var.m12256d();
                String str = (String) pair.first;
                Boolean bool = (Boolean) pair.second;
                synchronized (d02VarM12256d) {
                    d02VarM12256d.f34768n = str;
                    d02VarM12256d.f34769o = bool;
                }
            } else {
                d02 d02VarM12256d2 = g02Var.m12256d();
                synchronized (d02VarM12256d2) {
                    d02VarM12256d2.f34768n = null;
                    d02VarM12256d2.f34769o = null;
                }
            }
            ((g02) ce4Var.f9969d).m12254b(SdkTimingAction.SamsungCloudAdvertisingIdCompleted);
        }
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo298i(ce4 ce4Var) {
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        long jM25691E = ((rl7) ce4Var.f9967b).m20693i().m25691E();
        long jM13600e = ((hz8) ce4Var.f9970e).m13600e();
        long j = this.f47093q;
        return j >= jM25691E && j >= jM13600e;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        if (jobAction == JobAction.ResumeAsyncTimeOut) {
            r46.m20394u(f47092s, "Collection of CGID failed");
            return ie4.m13808b(null);
        }
        if (!((g02) ce4Var.f9969d).m12259g(PayloadType.Install, "cgid")) {
            r46.m20394u(f47092s, "Collection of CGID denied");
            return ie4.m13808b(null);
        }
        try {
            if (!CloudDevSdk.INSTANCE.isCloudEnvironment(((d74) ce4Var.f9968c).f35077a)) {
                r46.m20394u(f47092s, "Collection of CGID skipped");
                return ie4.m13808b(null);
            }
            try {
                m15157q(ce4Var);
                return ie4.m13809c(10000L);
            } catch (Throwable th) {
                r46.m20394u(f47092s, "Collection of CGID failed");
                f47092s.m21555D(r46.m20395v(th));
                return ie4.m13808b(null);
            }
        } catch (Throwable th2) {
            sq5 sq5Var = f47092s;
            r46.m20394u(sq5Var, "Collection of CGID failed");
            sq5Var.m21555D(r46.m20395v(th2));
            return ie4.m13808b(null);
        }
    }
}
