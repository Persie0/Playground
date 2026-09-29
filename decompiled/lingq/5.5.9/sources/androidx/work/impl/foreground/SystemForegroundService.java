package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.view.ServiceC1054t;
import java.util.UUID;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;
import p041c5.C1719q;
import p191j5.RunnableC6409b;
import p235l5.C7255b;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends ServiceC1054t implements C1258a.a {

    /* JADX INFO: renamed from: f */
    public static final String f7894f = AbstractC1314g.m4868f("SystemFgService");

    /* JADX INFO: renamed from: b */
    public Handler f7895b;

    /* JADX INFO: renamed from: c */
    public boolean f7896c;

    /* JADX INFO: renamed from: d */
    public C1258a f7897d;

    /* JADX INFO: renamed from: e */
    public NotificationManager f7898e;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    public static class C1256a {
        /* JADX INFO: renamed from: a */
        public static void m4746a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    public static class C1257b {
        /* JADX INFO: renamed from: a */
        public static void m4747a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
                String str = SystemForegroundService.f7894f;
                if (((AbstractC1314g.a) abstractC1314gM4867d).f8062c <= 5) {
                    Log.w(str, "Unable to start foreground service", e10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4745a() {
        this.f7895b = new Handler(Looper.getMainLooper());
        this.f7898e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1258a c1258a = new C1258a(getApplicationContext());
        this.f7897d = c1258a;
        if (c1258a.f7908i != null) {
            AbstractC1314g.m4867d().mo4870b(C1258a.f7899j, "A callback already exists.");
        } else {
            c1258a.f7908i = this;
        }
    }

    @Override // androidx.view.ServiceC1054t, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m4745a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.view.ServiceC1054t, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C1258a c1258a = this.f7897d;
        c1258a.f7908i = null;
        synchronized (c1258a.f7902c) {
            c1258a.f7907h.m12067e();
        }
        C1719q c1719q = c1258a.f7900a.f9480f;
        synchronized (c1719q.f9548l) {
            c1719q.f9547k.remove(c1258a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.view.ServiceC1054t, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f7896c;
        String str = f7894f;
        if (z10) {
            AbstractC1314g.m4867d().mo4872e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            C1258a c1258a = this.f7897d;
            c1258a.f7908i = null;
            synchronized (c1258a.f7902c) {
                try {
                    c1258a.f7907h.m12067e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C1719q c1719q = c1258a.f7900a.f9480f;
            synchronized (c1719q.f9548l) {
                c1719q.f9547k.remove(c1258a);
            }
            m4745a();
            this.f7896c = false;
        }
        if (intent != null) {
            C1258a c1258a2 = this.f7897d;
            c1258a2.getClass();
            String action = intent.getAction();
            boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = C1258a.f7899j;
            if (zEquals) {
                AbstractC1314g.m4867d().mo4872e(str2, "Started foreground service " + intent);
                c1258a2.f7901b.m14863a(new RunnableC6409b(c1258a2, intent.getStringExtra("KEY_WORKSPEC_ID")));
                c1258a2.m4750c(intent);
            } else if ("ACTION_NOTIFY".equals(action)) {
                c1258a2.m4750c(intent);
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                AbstractC1314g.m4867d().mo4872e(str2, "Stopping foreground work for " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID uuidFromString = UUID.fromString(stringExtra);
                    C1699a0 c1699a0 = c1258a2.f7900a;
                    c1699a0.getClass();
                    c1699a0.f9478d.m14863a(new C7255b(c1699a0, uuidFromString));
                }
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                AbstractC1314g.m4867d().mo4872e(str2, "Stopping foreground service");
                C1258a.a aVar = c1258a2.f7908i;
                if (aVar != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) aVar;
                    systemForegroundService.f7896c = true;
                    AbstractC1314g.m4867d().mo4869a(str, "All commands completed.");
                    systemForegroundService.stopForeground(true);
                    systemForegroundService.stopSelf();
                }
            }
        }
        return 3;
    }
}
