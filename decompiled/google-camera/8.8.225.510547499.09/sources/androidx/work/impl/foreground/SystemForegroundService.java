package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.UUID;
import p000.RunnableC0904pi;
import p000.aky;
import p000.ayc;
import p000.azp;
import p000.bbq;
import p000.bbr;
import p000.bbs;
import p000.bbt;
import p000.bdq;
import p000.bdx;
import p000.bey;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SystemForegroundService extends aky implements bbq {

    /* JADX INFO: renamed from: a */
    public static final String f1818a = ayc.m2100b("SystemFgService");

    /* JADX INFO: renamed from: b */
    bbr f1819b;

    /* JADX INFO: renamed from: c */
    public NotificationManager f1820c;

    /* JADX INFO: renamed from: d */
    private Handler f1821d;

    /* JADX INFO: renamed from: e */
    private boolean f1822e;

    /* JADX INFO: renamed from: e */
    private final void m1715e() {
        this.f1821d = new Handler(Looper.getMainLooper());
        this.f1820c = (NotificationManager) getApplicationContext().getSystemService("notification");
        bbr bbrVar = new bbr(getApplicationContext());
        this.f1819b = bbrVar;
        if (bbrVar.f2919i == null) {
            bbrVar.f2919i = this;
        } else {
            ayc.m2099a();
            Log.e(bbr.f2911a, "A callback already exists.");
        }
    }

    @Override // p000.bbq
    /* JADX INFO: renamed from: a */
    public final void mo1716a(int i) {
        this.f1821d.post(new bbt(this, i, 0));
    }

    @Override // p000.bbq
    /* JADX INFO: renamed from: b */
    public final void mo1717b(int i, Notification notification) {
        this.f1821d.post(new RunnableC0904pi(this, i, notification, 5));
    }

    @Override // p000.bbq
    /* JADX INFO: renamed from: c */
    public final void mo1718c(int i, int i2, Notification notification) {
        this.f1821d.post(new bbs(this, i, notification, i2));
    }

    @Override // p000.bbq
    /* JADX INFO: renamed from: d */
    public final void mo1719d() {
        this.f1822e = true;
        ayc.m2099a();
        stopForeground(true);
        stopSelf();
    }

    @Override // p000.aky, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m1715e();
    }

    @Override // p000.aky, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1819b.m2187c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1822e) {
            ayc.m2099a();
            this.f1819b.m2187c();
            m1715e();
            this.f1822e = false;
        }
        if (intent == null) {
            return 3;
        }
        bbr bbrVar = this.f1819b;
        String action = intent.getAction();
        if (EArqVBjecl.VcMHaNnyxYszJLA.equals(action)) {
            ayc.m2099a();
            StringBuilder sb = new StringBuilder();
            sb.append("Started foreground service ");
            sb.append(intent);
            intent.toString();
            bdx.m2257b(bbrVar.f2920j, new bey(bbrVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 1));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if (!"ACTION_CANCEL_WORK".equals(action)) {
                if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                    return 3;
                }
                ayc.m2099a();
                bbq bbqVar = bbrVar.f2919i;
                if (bbqVar == null) {
                    return 3;
                }
                bbqVar.mo1719d();
                return 3;
            }
            ayc.m2099a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Stopping foreground work for ");
            sb2.append(intent);
            intent.toString();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            azp azpVar = bbrVar.f2912b;
            bdx.m2257b(azpVar.f2789k, new bdq(azpVar, UUID.fromString(stringExtra)));
            return 3;
        }
        bbrVar.m2186b(intent);
        return 3;
    }
}
