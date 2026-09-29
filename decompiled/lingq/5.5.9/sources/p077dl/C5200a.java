package p077dl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.kochava.core.BuildConfig;
import dm.C5207g;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.TypeCastException;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: renamed from: dl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5200a {

    /* JADX INFO: renamed from: a */
    public final Object f33250a;

    /* JADX INFO: renamed from: b */
    public final HashSet<a> f33251b;

    /* JADX INFO: renamed from: c */
    public final ConnectivityManager f33252c;

    /* JADX INFO: renamed from: d */
    public final c f33253d;

    /* JADX INFO: renamed from: e */
    public final boolean f33254e;

    /* JADX INFO: renamed from: f */
    public final b f33255f;

    /* JADX INFO: renamed from: g */
    public final Context f33256g;

    /* JADX INFO: renamed from: h */
    public final String f33257h;

    /* JADX INFO: renamed from: dl.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10666a();
    }

    /* JADX INFO: renamed from: dl.a$b */
    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            C5207g.m11112g(network, "network");
            C5200a.m10970a(C5200a.this);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            C5207g.m11112g(network, "network");
            C5200a.m10970a(C5200a.this);
        }
    }

    /* JADX INFO: renamed from: dl.a$c */
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C5200a.m10970a(C5200a.this);
        }
    }

    public C5200a(Context context, String str) {
        C5207g.m11112g(context, "context");
        this.f33256g = context;
        this.f33257h = str;
        this.f33250a = new Object();
        this.f33251b = new HashSet<>();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = (ConnectivityManager) (systemService instanceof ConnectivityManager ? systemService : null);
        this.f33252c = connectivityManager;
        c cVar = new c();
        this.f33253d = cVar;
        if (connectivityManager == null) {
            try {
                context.registerReceiver(cVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f33254e = true;
            } catch (Exception unused) {
            }
        } else {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(3).build();
            b bVar = new b();
            this.f33255f = bVar;
            connectivityManager.registerNetworkCallback(networkRequestBuild, bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m10970a(C5200a c5200a) {
        synchronized (c5200a.f33250a) {
            Iterator<a> it = c5200a.f33251b.iterator();
            C5207g.m11107b(it, "networkChangeListenerSet.iterator()");
            while (it.hasNext()) {
                it.next().mo10666a();
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10971b() {
        String str = this.f33257h;
        if (str == null) {
            return C9000b.m17250p(this.f33256g);
        }
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.connect();
            boolean z10 = httpURLConnection.getResponseCode() != -1;
            httpURLConnection.disconnect();
            return z10;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10972c() {
        synchronized (this.f33250a) {
            try {
                this.f33251b.clear();
                if (this.f33254e) {
                    try {
                        this.f33256g.unregisterReceiver(this.f33253d);
                    } catch (Exception unused) {
                    }
                }
                ConnectivityManager connectivityManager = this.f33252c;
                if (connectivityManager != null) {
                    b bVar = this.f33255f;
                    if (bVar instanceof ConnectivityManager.NetworkCallback) {
                        connectivityManager.unregisterNetworkCallback(bVar);
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
