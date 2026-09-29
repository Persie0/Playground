package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p026b5.AbstractC1314g;
import p026b5.C1310c;
import p041c5.C1699a0;
import p041c5.C1722t;
import p041c5.InterfaceC1704d;
import p131g5.C5700d;
import p131g5.InterfaceC5699c;
import p191j5.RunnableC6410c;
import p191j5.RunnableC6411d;
import p214k5.C6610l;
import p214k5.C6617s;
import p235l5.RunnableC7272s;
import p257m5.InterfaceC7479a;
import p260m8.C7499b;

/* JADX INFO: renamed from: androidx.work.impl.foreground.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1258a implements InterfaceC5699c, InterfaceC1704d {

    /* JADX INFO: renamed from: j */
    public static final String f7899j = AbstractC1314g.m4868f("SystemFgDispatcher");

    /* JADX INFO: renamed from: a */
    public final C1699a0 f7900a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7479a f7901b;

    /* JADX INFO: renamed from: c */
    public final Object f7902c = new Object();

    /* JADX INFO: renamed from: d */
    public C6610l f7903d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f7904e;

    /* JADX INFO: renamed from: f */
    public final HashMap f7905f;

    /* JADX INFO: renamed from: g */
    public final HashSet f7906g;

    /* JADX INFO: renamed from: h */
    public final C5700d f7907h;

    /* JADX INFO: renamed from: i */
    public a f7908i;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a */
    public interface a {
    }

    public C1258a(Context context) {
        C1699a0 c1699a0M5430d = C1699a0.m5430d(context);
        this.f7900a = c1699a0M5430d;
        this.f7901b = c1699a0M5430d.f9478d;
        this.f7903d = null;
        this.f7904e = new LinkedHashMap();
        this.f7906g = new HashSet();
        this.f7905f = new HashMap();
        this.f7907h = new C5700d(c1699a0M5430d.f9484j, this);
        c1699a0M5430d.f9480f.m5454a(this);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m4748a(Context context, C6610l c6610l, C1310c c1310c) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c1310c.f8056a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1310c.f8057b);
        intent.putExtra("KEY_NOTIFICATION", c1310c.f8058c);
        intent.putExtra("KEY_WORKSPEC_ID", c6610l.f37514a);
        intent.putExtra("KEY_GENERATION", c6610l.f37515b);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m4749b(Context context, C6610l c6610l, C1310c c1310c) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c6610l.f37514a);
        intent.putExtra("KEY_GENERATION", c6610l.f37515b);
        intent.putExtra("KEY_NOTIFICATION_ID", c1310c.f8056a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1310c.f8057b);
        intent.putExtra("KEY_NOTIFICATION", c1310c.f8058c);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public final void m4750c(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C6610l c6610l = new C6610l(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
        StringBuilder sb2 = new StringBuilder("Notifying with (id:");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType :");
        abstractC1314gM4867d.mo4869a(f7899j, C0166e.m768o(sb2, intExtra2, ")"));
        if (notification != null && this.f7908i != null) {
            C1310c c1310c = new C1310c(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.f7904e;
            linkedHashMap.put(c6610l, c1310c);
            if (this.f7903d == null) {
                this.f7903d = c6610l;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f7908i;
                systemForegroundService.f7895b.post(new RunnableC1259b(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f7908i;
            systemForegroundService2.f7895b.post(new RunnableC6410c(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= ((C1310c) ((Map.Entry) it.next()).getValue()).f8057b;
                }
                C1310c c1310c2 = (C1310c) linkedHashMap.get(this.f7903d);
                if (c1310c2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f7908i;
                    systemForegroundService3.f7895b.post(new RunnableC1259b(systemForegroundService3, c1310c2.f8056a, c1310c2.f8058c, i10));
                }
            }
        }
    }

    @Override // p131g5.InterfaceC5699c
    /* JADX INFO: renamed from: d */
    public final void mo4734d(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C6617s c6617s = (C6617s) it.next();
                String str = c6617s.f37524a;
                AbstractC1314g.m4867d().mo4869a(f7899j, C0204c.m852k("Constraints unmet for WorkSpec ", str));
                C6610l c6610lM14892A = C7499b.m14892A(c6617s);
                C1699a0 c1699a0 = this.f7900a;
                c1699a0.f9478d.m14863a(new RunnableC7272s(c1699a0, new C1722t(c6610lM14892A), true));
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p041c5.InterfaceC1704d
    /* JADX INFO: renamed from: e */
    public final void mo4730e(C6610l c6610l, boolean z10) {
        synchronized (this.f7902c) {
            try {
                C6617s c6617s = (C6617s) this.f7905f.remove(c6610l);
                if (c6617s != null ? this.f7906g.remove(c6617s) : false) {
                    this.f7907h.m12066d(this.f7906g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C1310c c1310c = (C1310c) this.f7904e.remove(c6610l);
        if (c6610l.equals(this.f7903d) && this.f7904e.size() > 0) {
            Iterator it = this.f7904e.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            while (it.hasNext()) {
                entry = (Map.Entry) it.next();
            }
            this.f7903d = (C6610l) entry.getKey();
            if (this.f7908i != null) {
                C1310c c1310c2 = (C1310c) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f7908i;
                systemForegroundService.f7895b.post(new RunnableC1259b(systemForegroundService, c1310c2.f8056a, c1310c2.f8058c, c1310c2.f8057b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f7908i;
                systemForegroundService2.f7895b.post(new RunnableC6411d(systemForegroundService2, c1310c2.f8056a));
            }
        }
        a aVar = this.f7908i;
        if (c1310c != null && aVar != null) {
            AbstractC1314g.m4867d().mo4869a(f7899j, "Removing Notification (id: " + c1310c.f8056a + ", workSpecId: " + c6610l + ", notificationType: " + c1310c.f8057b);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar;
            systemForegroundService3.f7895b.post(new RunnableC6411d(systemForegroundService3, c1310c.f8056a));
        }
    }

    @Override // p131g5.InterfaceC5699c
    /* JADX INFO: renamed from: f */
    public final void mo4736f(List<C6617s> list) {
    }
}
