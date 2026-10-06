package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bag implements ayo {

    /* JADX INFO: renamed from: a */
    public static final String f2856a = ayc.m2100b("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: b */
    final Context f2857b;

    /* JADX INFO: renamed from: c */
    public final bel f2858c;

    /* JADX INFO: renamed from: d */
    public final azb f2859d;

    /* JADX INFO: renamed from: e */
    public final azp f2860e;

    /* JADX INFO: renamed from: f */
    final azx f2861f;

    /* JADX INFO: renamed from: g */
    final List f2862g;

    /* JADX INFO: renamed from: h */
    Intent f2863h;

    /* JADX INFO: renamed from: i */
    public bae f2864i;

    /* JADX INFO: renamed from: j */
    final C1058va f2865j;

    /* JADX INFO: renamed from: k */
    private final bck f2866k;

    public bag(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2857b = applicationContext;
        bck bckVar = new bck();
        this.f2866k = bckVar;
        this.f2861f = new azx(applicationContext, bckVar, null);
        azp azpVarM2125e = azp.m2125e(context);
        this.f2860e = azpVarM2125e;
        this.f2858c = new bel(azpVarM2125e.f2781c.f2675f, null, null);
        azb azbVar = azpVarM2125e.f2784f;
        this.f2859d = azbVar;
        this.f2865j = azpVarM2125e.f2789k;
        azbVar.m2112b(this);
        this.f2862g = new ArrayList();
        this.f2863h = null;
    }

    /* JADX INFO: renamed from: e */
    public static final void m2153e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.ayo
    /* JADX INFO: renamed from: a */
    public final void mo1714a(bcj bcjVar, boolean z) {
        ?? r0 = this.f2865j.f47803b;
        Intent intent = new Intent(this.f2857b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        azx.m2149f(intent, bcjVar);
        r0.execute(new bad(this, intent, 0));
    }

    /* JADX INFO: renamed from: b */
    public final void m2154b() {
        ayc.m2099a();
        this.f2859d.m2113c(this);
        this.f2864i = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2155c() {
        m2153e();
        PowerManager.WakeLock wakeLockM2264a = bee.m2264a(this.f2857b, "ProcessCommand");
        try {
            wakeLockM2264a.acquire();
            bdx.m2257b(this.f2860e.f2789k, new bac(this));
        } finally {
            wakeLockM2264a.release();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2156d(Intent intent, int i) {
        ayc.m2099a();
        StringBuilder sb = new StringBuilder();
        sb.append("Adding command ");
        sb.append(intent);
        sb.append(" (");
        sb.append(i);
        sb.append(hsSUWRJfoeC.cqGqqO);
        m2153e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ayc.m2099a();
            Log.w(f2856a, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m2153e();
            synchronized (this.f2862g) {
                Iterator it = this.f2862g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f2862g) {
            boolean z = !this.f2862g.isEmpty();
            this.f2862g.add(intent);
            if (!z) {
                m2155c();
            }
        }
    }
}
