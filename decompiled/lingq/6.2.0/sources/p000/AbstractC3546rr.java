package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.FlushResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: rr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3546rr {

    /* JADX INFO: renamed from: c */
    public static ScheduledFuture f59734c;

    /* JADX INFO: renamed from: a */
    public static volatile qn3 f59732a = new qn3(10);

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService f59733b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d */
    public static final RunnableC3637u6 f59735d = new RunnableC3637u6(4);

    /* JADX INFO: renamed from: a */
    public static final mp3 m20752a(final AccessTokenAppIdPair accessTokenAppIdPair, final cz8 cz8Var, boolean z, final C3126ix c3126ix) {
        Set set = lp1.f49971a;
        if (!set.contains(AbstractC3546rr.class)) {
            try {
                String str = accessTokenAppIdPair.f11376a;
                w23 w23VarM24862k = y23.m24862k(str, false);
                String str2 = mp3.f51688j;
                final mp3 mp3VarM21069q = s46.m21069q(null, String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1)), null, null);
                mp3VarM21069q.f51699i = true;
                Bundle bundle = mp3VarM21069q.f51694d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String str3 = accessTokenAppIdPair.f11377b;
                if (str3 == null) {
                    Date date = AccessToken.f11306l;
                    AccessToken accessTokenM24363t = x74.m24363t();
                    str3 = accessTokenM24363t != null ? accessTokenM24363t.f11311e : null;
                }
                if (str3 != null) {
                    bundle.putString("access_token", str3);
                }
                synchronized (C3012fs.m12036c()) {
                    set.contains(C3012fs.class);
                }
                String str4 = C3012fs.f39540c;
                String strM14195j = iy5.m14195j();
                if (strM14195j != null) {
                    bundle.putString("install_referrer", strM14195j);
                }
                mp3VarM21069q.f51694d = bundle;
                int iM9943d = cz8Var.m9943d(mp3VarM21069q, sy2.m21766a(), w23VarM24862k != null ? w23VarM24862k.f66252a : false, z);
                if (iM9943d != 0) {
                    c3126ix.f44720b += iM9943d;
                    mp3VarM21069q.m16988j(new kp3() { // from class: qr
                        @Override // p000.kp3
                        /* JADX INFO: renamed from: a */
                        public final void mo3204a(pp3 pp3Var) {
                            AccessTokenAppIdPair accessTokenAppIdPair2 = accessTokenAppIdPair;
                            mp3 mp3Var = mp3VarM21069q;
                            cz8 cz8Var2 = cz8Var;
                            C3126ix c3126ix2 = c3126ix;
                            if (lp1.f49971a.contains(AbstractC3546rr.class)) {
                                return;
                            }
                            try {
                                AbstractC3546rr.m20756e(accessTokenAppIdPair2, mp3Var, pp3Var, cz8Var2, c3126ix2);
                            } catch (Throwable th) {
                                lp1.m16420a(AbstractC3546rr.class, th);
                            }
                        }
                    });
                    return mp3VarM21069q;
                }
            } catch (Throwable th) {
                lp1.m16420a(AbstractC3546rr.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m20753b(qn3 qn3Var, C3126ix c3126ix) {
        cz8 cz8Var;
        if (lp1.f49971a.contains(AbstractC3546rr.class)) {
            return null;
        }
        try {
            qn3Var.getClass();
            boolean zM21771f = sy2.m21771f(sy2.m21766a());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : qn3Var.m20077w()) {
                synchronized (qn3Var) {
                    accessTokenAppIdPair.getClass();
                    cz8Var = (cz8) ((HashMap) qn3Var.f57974a).get(accessTokenAppIdPair);
                }
                if (cz8Var == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                mp3 mp3VarM20752a = m20752a(accessTokenAppIdPair, cz8Var, zM21771f, c3126ix);
                if (mp3VarM20752a != null) {
                    arrayList.add(mp3VarM20752a);
                    if (AbstractC3489q9.f57406a) {
                        AbstractC2975es.m11326c(mp3VarM20752a);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3546rr.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20754c(FlushReason flushReason) {
        if (lp1.f49971a.contains(AbstractC3546rr.class)) {
            return;
        }
        try {
            flushReason.getClass();
            f59733b.execute(new RunnableC0002a0(flushReason, 3));
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3546rr.class, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20755d(FlushReason flushReason) {
        if (lp1.f49971a.contains(AbstractC3546rr.class)) {
            return;
        }
        try {
            flushReason.getClass();
            f59732a.m20069j(AbstractC3423or.m18237V());
            try {
                C3126ix c3126ixM20757f = m20757f(flushReason, f59732a);
                if (c3126ixM20757f != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", c3126ixM20757f.f44720b);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (FlushResult) c3126ixM20757f.f44721c);
                    w41.m23706r(sy2.m21766a()).m23711E(intent);
                }
            } catch (Exception e) {
                Log.w("rr", "Caught unexpected exception while flushing app events: ", e);
            }
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3546rr.class, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m20756e(AccessTokenAppIdPair accessTokenAppIdPair, mp3 mp3Var, pp3 pp3Var, cz8 cz8Var, C3126ix c3126ix) {
        FlushResult flushResult;
        if (lp1.f49971a.contains(AbstractC3546rr.class)) {
            return;
        }
        try {
            FacebookRequestError facebookRequestError = pp3Var.f56629c;
            FlushResult flushResult2 = FlushResult.SUCCESS;
            if (facebookRequestError == null) {
                flushResult = flushResult2;
            } else if (facebookRequestError.f11358b == -1) {
                flushResult = FlushResult.NO_CONNECTIVITY;
            } else {
                String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{pp3Var.toString(), facebookRequestError.toString()}, 2));
                flushResult = FlushResult.SERVER_ERROR;
            }
            sy2.m21773h(LoggingBehavior.APP_EVENTS);
            int i = 1;
            cz8Var.m9941b(facebookRequestError != null);
            FlushResult flushResult3 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult3) {
                sy2.m21768c().execute(new RunnableC3470pr(i, accessTokenAppIdPair, cz8Var));
            }
            if (flushResult == flushResult2 || ((FlushResult) c3126ix.f44721c) == flushResult3) {
                return;
            }
            flushResult.getClass();
            c3126ix.f44721c = flushResult;
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3546rr.class, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C3126ix m20757f(FlushReason flushReason, qn3 qn3Var) {
        if (!lp1.f49971a.contains(AbstractC3546rr.class)) {
            try {
                flushReason.getClass();
                qn3Var.getClass();
                C3126ix c3126ix = new C3126ix(2, (byte) 0);
                c3126ix.f44721c = FlushResult.SUCCESS;
                ArrayList arrayListM20753b = m20753b(qn3Var, c3126ix);
                if (!arrayListM20753b.isEmpty()) {
                    iy5 iy5Var = qj5.f57852d;
                    iy5.m14198n(LoggingBehavior.APP_EVENTS, "rr", "Flushing %d events due to %s.", Integer.valueOf(c3126ix.f44720b), flushReason.toString());
                    Iterator it = arrayListM20753b.iterator();
                    while (it.hasNext()) {
                        ((mp3) it.next()).m16982c();
                    }
                    return c3126ix;
                }
            } catch (Throwable th) {
                lp1.m16420a(AbstractC3546rr.class, th);
                return null;
            }
        }
        return null;
    }
}
