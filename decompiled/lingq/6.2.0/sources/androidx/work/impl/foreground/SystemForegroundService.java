package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle$Event;
import androidx.work.impl.C0773b;
import java.util.UUID;
import p000.AbstractC3572sf;
import p000.C3577sk;
import p000.by8;
import p000.iy5;
import p000.kj3;
import p000.mq7;
import p000.oj5;
import p000.op9;
import p000.pyb;
import p000.ub5;
import p000.wb5;

/* JADX INFO: loaded from: classes2.dex */
public class SystemForegroundService extends Service implements ub5 {

    /* JADX INFO: renamed from: e */
    public static final String f7254e = oj5.m18041h("SystemFgService");

    /* JADX INFO: renamed from: a */
    public final mq7 f7255a = new mq7(this);

    /* JADX INFO: renamed from: b */
    public boolean f7256b;

    /* JADX INFO: renamed from: c */
    public op9 f7257c;

    /* JADX INFO: renamed from: d */
    public NotificationManager f7258d;

    @Override // p000.ub5
    /* JADX INFO: renamed from: K */
    public final AbstractC3572sf mo256K() {
        return (wb5) this.f7255a.f51733b;
    }

    /* JADX INFO: renamed from: a */
    public final void m2930a() {
        this.f7258d = (NotificationManager) getApplicationContext().getSystemService("notification");
        op9 op9Var = new op9(getApplicationContext());
        this.f7257c = op9Var;
        if (op9Var.f54702i != null) {
            oj5.m18040f().m18043c(op9.f54693j, "A callback already exists.");
        } else {
            op9Var.f54702i = this;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2931b() {
        mq7 mq7Var = this.f7255a;
        mq7Var.getClass();
        mq7Var.m17000j(Lifecycle$Event.ON_CREATE);
        super.onCreate();
    }

    /* JADX INFO: renamed from: d */
    public final void m2932d() {
        mq7 mq7Var = this.f7255a;
        mq7Var.getClass();
        mq7Var.m17000j(Lifecycle$Event.ON_STOP);
        mq7Var.m17000j(Lifecycle$Event.ON_DESTROY);
        super.onDestroy();
    }

    /* JADX INFO: renamed from: e */
    public final void m2933e(int i, int i2, Notification notification) {
        String str = f7254e;
        if (Build.VERSION.SDK_INT < 31) {
            startForeground(i, notification, i2);
            return;
        }
        try {
            startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            if (oj5.m18040f().f54464a <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            if (oj5.m18040f().f54464a <= 5) {
                Log.w(str, "Unable to start foreground service", e2);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        mq7 mq7Var = this.f7255a;
        mq7Var.getClass();
        mq7Var.m17000j(Lifecycle$Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        m2931b();
        m2930a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m2932d();
        this.f7257c.m18200f();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        mq7 mq7Var = this.f7255a;
        mq7Var.getClass();
        mq7Var.m17000j(Lifecycle$Event.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f7256b;
        String str = f7254e;
        if (z) {
            oj5.m18040f().m18045g(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f7257c.m18200f();
            m2930a();
            this.f7256b = false;
        }
        if (intent == null) {
            return 3;
        }
        op9 op9Var = this.f7257c;
        op9Var.getClass();
        String str2 = op9.f54693j;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            oj5.m18040f().m18045g(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            op9Var.f54695b.f36847a.execute(new kj3(op9Var, stringExtra, false, 10));
            op9Var.m18199e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            op9Var.m18199e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            oj5.m18040f().m18045g(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = op9Var.f54702i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f7256b = true;
            oj5.m18040f().m18042a(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        oj5.m18040f().m18045g(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        C0773b c0773b = op9Var.f54694a;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        c0773b.getClass();
        uuidFromString.getClass();
        iy5 iy5Var = c0773b.f7205b.f42359m;
        by8 by8Var = c0773b.f7207d.f36847a;
        by8Var.getClass();
        pyb.m19571a(iy5Var, "CancelWorkById", by8Var, new C3577sk(4, c0773b, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f7257c.m18201g(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.f7257c.m18201g(i, i2);
    }
}
