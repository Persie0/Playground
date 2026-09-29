package p000;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.C0773b;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class op9 implements vr6, vu2 {

    /* JADX INFO: renamed from: j */
    public static final String f54693j = oj5.m18041h("SystemFgDispatcher");

    /* JADX INFO: renamed from: a */
    public final C0773b f54694a;

    /* JADX INFO: renamed from: b */
    public final e8b f54695b;

    /* JADX INFO: renamed from: c */
    public final Object f54696c = new Object();

    /* JADX INFO: renamed from: d */
    public a8b f54697d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f54698e;

    /* JADX INFO: renamed from: f */
    public final HashMap f54699f;

    /* JADX INFO: renamed from: g */
    public final HashMap f54700g;

    /* JADX INFO: renamed from: h */
    public final f57 f54701h;

    /* JADX INFO: renamed from: i */
    public SystemForegroundService f54702i;

    public op9(Context context) {
        C0773b c0773bM2910c = C0773b.m2910c(context);
        this.f54694a = c0773bM2910c;
        this.f54695b = c0773bM2910c.f7207d;
        this.f54697d = null;
        this.f54698e = new LinkedHashMap();
        this.f54700g = new HashMap();
        this.f54699f = new HashMap();
        this.f54701h = new f57(c0773bM2910c.f7213j);
        c0773bM2910c.f7209f.m14012a(this);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m18196c(Context context, a8b a8bVar, gc3 gc3Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", a8bVar.f364a);
        intent.putExtra("KEY_GENERATION", a8bVar.f365b);
        intent.putExtra("KEY_NOTIFICATION_ID", gc3Var.f40525a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gc3Var.f40526b);
        intent.putExtra("KEY_NOTIFICATION", gc3Var.f40527c);
        return intent;
    }

    /* JADX INFO: renamed from: d */
    public static Intent m18197d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // p000.vr6
    /* JADX INFO: renamed from: a */
    public final void mo18198a(p8b p8bVar, hk1 hk1Var) {
        if (hk1Var instanceof gk1) {
            String str = p8bVar.f55772a;
            oj5.m18040f().m18042a(f54693j, "Constraints unmet for WorkSpec " + str);
            a8b a8bVarM270b = acd.m270b(p8bVar);
            int i = ((gk1) hk1Var).f40903a;
            C0773b c0773b = this.f54694a;
            c0773b.f7207d.f36847a.execute(new yi9(c0773b.f7209f, new zg9(a8bVarM270b), true, i));
        }
    }

    @Override // p000.vu2
    /* JADX INFO: renamed from: b */
    public final void mo2918b(a8b a8bVar, boolean z) {
        Map.Entry entry;
        synchronized (this.f54696c) {
            try {
                cd4 cd4Var = ((p8b) this.f54699f.remove(a8bVar)) != null ? (cd4) this.f54700g.remove(a8bVar) : null;
                if (cd4Var != null) {
                    cd4Var.mo4537a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gc3 gc3Var = (gc3) this.f54698e.remove(a8bVar);
        if (a8bVar.equals(this.f54697d)) {
            if (this.f54698e.size() > 0) {
                Iterator it = this.f54698e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f54697d = (a8b) entry.getKey();
                if (this.f54702i != null) {
                    gc3 gc3Var2 = (gc3) entry.getValue();
                    this.f54702i.m2933e(gc3Var2.f40525a, gc3Var2.f40526b, gc3Var2.f40527c);
                    this.f54702i.f7258d.cancel(gc3Var2.f40525a);
                }
            } else {
                this.f54697d = null;
            }
        }
        SystemForegroundService systemForegroundService = this.f54702i;
        if (gc3Var == null || systemForegroundService == null) {
            return;
        }
        oj5.m18040f().m18042a(f54693j, "Removing Notification (id: " + gc3Var.f40525a + ", workSpecId: " + a8bVar + ", notificationType: " + gc3Var.f40526b);
        systemForegroundService.f7258d.cancel(gc3Var.f40525a);
    }

    /* JADX INFO: renamed from: e */
    public final void m18199e(Intent intent) {
        if (this.f54702i == null) {
            C3386nv.m17633t("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        a8b a8bVar = new a8b(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        oj5 oj5VarM18040f = oj5.m18040f();
        StringBuilder sbM22995r = ux5.m22995r(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :");
        sbM22995r.append(intExtra2);
        sbM22995r.append(")");
        oj5VarM18040f.m18042a(f54693j, sbM22995r.toString());
        if (notification == null) {
            C3386nv.m17626m("Notification passed in the intent was null.");
            return;
        }
        gc3 gc3Var = new gc3(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f54698e;
        linkedHashMap.put(a8bVar, gc3Var);
        gc3 gc3Var2 = (gc3) linkedHashMap.get(this.f54697d);
        if (gc3Var2 == null) {
            this.f54697d = a8bVar;
        } else {
            this.f54702i.f7258d.notify(intExtra, notification);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((gc3) ((Map.Entry) it.next()).getValue()).f40526b;
            }
            gc3Var = new gc3(gc3Var2.f40525a, i, gc3Var2.f40527c);
        }
        this.f54702i.m2933e(gc3Var.f40525a, gc3Var.f40526b, gc3Var.f40527c);
    }

    /* JADX INFO: renamed from: f */
    public final void m18200f() {
        this.f54702i = null;
        synchronized (this.f54696c) {
            try {
                Iterator it = this.f54700g.values().iterator();
                while (it.hasNext()) {
                    ((cd4) it.next()).mo4537a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        il7 il7Var = this.f54694a.f7209f;
        synchronized (il7Var.f44277k) {
            il7Var.f44276j.remove(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18201g(int i, int i2) {
        oj5.m18040f().m18045g(f54693j, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.f54698e.entrySet()) {
            if (((gc3) entry.getValue()).f40526b == i2) {
                a8b a8bVar = (a8b) entry.getKey();
                C0773b c0773b = this.f54694a;
                c0773b.f7207d.f36847a.execute(new yi9(c0773b.f7209f, new zg9(a8bVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f54702i;
        if (systemForegroundService != null) {
            systemForegroundService.f7256b = true;
            oj5.m18040f().m18042a(SystemForegroundService.f7254e, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
