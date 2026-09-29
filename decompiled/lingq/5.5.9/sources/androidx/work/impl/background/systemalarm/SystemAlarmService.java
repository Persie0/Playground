package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.view.ServiceC1054t;
import java.util.LinkedHashMap;
import java.util.Map;
import p026b5.AbstractC1314g;
import p041c5.C1719q;
import p235l5.C7274u;
import p235l5.C7275v;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends ServiceC1054t implements C1253d.c {

    /* JADX INFO: renamed from: d */
    public static final String f7849d = AbstractC1314g.m4868f("SystemAlarmService");

    /* JADX INFO: renamed from: b */
    public C1253d f7850b;

    /* JADX INFO: renamed from: c */
    public boolean f7851c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m4726a() {
        this.f7851c = true;
        AbstractC1314g.m4867d().mo4869a(f7849d, "All commands completed in dispatcher");
        String str = C7274u.f40773a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (C7275v.f40774a) {
            try {
                linkedHashMap.putAll(C7275v.f40775b);
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC1314g.m4867d().mo4873g(C7274u.f40773a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.view.ServiceC1054t, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1253d c1253d = new C1253d(this);
        this.f7850b = c1253d;
        if (c1253d.f7883i != null) {
            AbstractC1314g.m4867d().mo4870b(C1253d.f7874j, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            c1253d.f7883i = this;
        }
        this.f7851c = false;
    }

    @Override // androidx.view.ServiceC1054t, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f7851c = true;
        C1253d c1253d = this.f7850b;
        c1253d.getClass();
        AbstractC1314g.m4867d().mo4869a(C1253d.f7874j, "Destroying SystemAlarmDispatcher");
        C1719q c1719q = c1253d.f7878d;
        synchronized (c1719q.f9548l) {
            try {
                c1719q.f9547k.remove(c1253d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c1253d.f7883i = null;
    }

    @Override // androidx.view.ServiceC1054t, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f7851c) {
            AbstractC1314g.m4867d().mo4872e(f7849d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            C1253d c1253d = this.f7850b;
            c1253d.getClass();
            AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
            String str = C1253d.f7874j;
            abstractC1314gM4867d.mo4869a(str, "Destroying SystemAlarmDispatcher");
            C1719q c1719q = c1253d.f7878d;
            synchronized (c1719q.f9548l) {
                c1719q.f9547k.remove(c1253d);
            }
            c1253d.f7883i = null;
            C1253d c1253d2 = new C1253d(this);
            this.f7850b = c1253d2;
            if (c1253d2.f7883i != null) {
                AbstractC1314g.m4867d().mo4870b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                c1253d2.f7883i = this;
            }
            this.f7851c = false;
        }
        if (intent != null) {
            this.f7850b.m4739a(intent, i11);
        }
        return 3;
    }
}
