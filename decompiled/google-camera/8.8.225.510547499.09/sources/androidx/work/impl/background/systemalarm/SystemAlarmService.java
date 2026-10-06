package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.aky;
import p000.ayc;
import p000.bae;
import p000.bag;
import p000.bee;
import p000.bef;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends aky implements bae {

    /* JADX INFO: renamed from: a */
    private bag f1811a;

    /* JADX INFO: renamed from: b */
    private boolean f1812b;

    static {
        ayc.m2100b("SystemAlarmService");
    }

    /* JADX INFO: renamed from: b */
    private final void m1711b() {
        bag bagVar = new bag(this);
        this.f1811a = bagVar;
        if (bagVar.f2864i == null) {
            bagVar.f2864i = this;
        } else {
            ayc.m2099a();
            Log.e(bag.f2856a, "A completion listener for SystemAlarmDispatcher already exists.");
        }
    }

    @Override // p000.bae
    /* JADX INFO: renamed from: a */
    public final void mo1712a() {
        this.f1812b = true;
        ayc.m2099a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (bef.f3032a) {
            linkedHashMap.putAll(bef.f3033b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                ayc.m2099a();
                Log.w(bee.f3031a, "WakeLock held for ".concat(String.valueOf(str)));
            }
        }
        stopSelf();
    }

    @Override // p000.aky, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m1711b();
        this.f1812b = false;
    }

    @Override // p000.aky, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1812b = true;
        this.f1811a.m2154b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1812b) {
            ayc.m2099a();
            this.f1811a.m2154b();
            m1711b();
            this.f1812b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1811a.m2156d(intent, i2);
        return 3;
    }
}
