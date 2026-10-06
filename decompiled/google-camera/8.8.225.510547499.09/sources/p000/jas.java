package p000;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jas extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    static final String f33617a = jas.class.getName();

    /* JADX INFO: renamed from: b */
    public final izv f33618b;

    /* JADX INFO: renamed from: c */
    public boolean f33619c;

    /* JADX INFO: renamed from: d */
    public boolean f33620d;

    public jas(izv izvVar) {
        this.f33618b = izvVar;
    }

    /* JADX INFO: renamed from: e */
    private final izq m12792e() {
        return this.f33618b.m11950b();
    }

    /* JADX INFO: renamed from: f */
    private final jar m12793f() {
        return this.f33618b.m11951d();
    }

    /* JADX INFO: renamed from: a */
    public final Context m12794a() {
        return this.f33618b.f32728a;
    }

    /* JADX INFO: renamed from: b */
    public final void m12795b() {
        m12793f();
        m12792e();
    }

    /* JADX INFO: renamed from: c */
    public final void m12796c() {
        if (this.f33619c) {
            this.f33618b.m11951d().m11936q("Unregistering connectivity change receiver");
            this.f33619c = false;
            this.f33620d = false;
            try {
                m12794a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                m12793f().m11934o("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    protected final boolean m12797d() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) m12794a().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e) {
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m12795b();
        String action = intent.getAction();
        this.f33618b.m11951d().m11937r("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zM12797d = m12797d();
            if (this.f33620d != zM12797d) {
                this.f33620d = zM12797d;
                izq izqVarM12792e = m12792e();
                izqVarM12792e.m11937r("Network connectivity status changed", Boolean.valueOf(zM12797d));
                izqVarM12792e.m11925e().m11917b(new ith(izqVarM12792e, 10));
                return;
            }
            return;
        }
        if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f33618b.m11951d().m11940u("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        if (intent.hasExtra(f33617a)) {
            return;
        }
        izq izqVarM12792e2 = m12792e();
        izqVarM12792e2.m11936q("Radio powered up");
        izqVarM12792e2.m11946z();
        Context contextM11924d = izqVarM12792e2.m11924d();
        if (!jav.m12809a(contextM11924d) || !ihk.m11327B(contextM11924d)) {
            izqVarM12792e2.m11919b(null);
            return;
        }
        Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent2.setComponent(new ComponentName(contextM11924d, "com.google.android.gms.analytics.AnalyticsService"));
        contextM11924d.startService(intent2);
    }
}
