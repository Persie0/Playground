package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p258m6.C7486f;
import p258m6.C7492l;
import p258m6.InterfaceC7487g;

/* JADX INFO: renamed from: com.bumptech.glide.manager.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2160p {

    /* JADX INFO: renamed from: d */
    public static volatile C2160p f10880d;

    /* JADX INFO: renamed from: a */
    public final c f10881a;

    /* JADX INFO: renamed from: b */
    public final HashSet f10882b = new HashSet();

    /* JADX INFO: renamed from: c */
    public boolean f10883c;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.p$a */
    public class a implements InterfaceC7487g<ConnectivityManager> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f10884a;

        public a(Context context) {
            this.f10884a = context;
        }

        @Override // p258m6.InterfaceC7487g
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f10884a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.p$b */
    public class b implements InterfaceC2146b.a {
        public b() {
        }

        @Override // com.bumptech.glide.manager.InterfaceC2146b.a
        /* JADX INFO: renamed from: a */
        public final void mo6264a(boolean z10) {
            ArrayList arrayList;
            C7492l.m14880a();
            synchronized (C2160p.this) {
                arrayList = new ArrayList(C2160p.this.f10882b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC2146b.a) it.next()).mo6264a(z10);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.p$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public boolean f10886a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2146b.a f10887b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7487g<ConnectivityManager> f10888c;

        /* JADX INFO: renamed from: d */
        public final a f10889d = new a();

        /* JADX INFO: renamed from: com.bumptech.glide.manager.p$c$a */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                C7492l.m14884e().post(new RunnableC2161q(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                C7492l.m14884e().post(new RunnableC2161q(this, false));
            }
        }

        public c(C7486f c7486f, b bVar) {
            this.f10888c = c7486f;
            this.f10887b = bVar;
        }
    }

    public C2160p(Context context) {
        this.f10881a = new c(new C7486f(new a(context)), new b());
    }

    /* JADX INFO: renamed from: a */
    public static C2160p m6379a(Context context) {
        if (f10880d == null) {
            synchronized (C2160p.class) {
                if (f10880d == null) {
                    f10880d = new C2160p(context.getApplicationContext());
                }
            }
        }
        return f10880d;
    }

    /* JADX INFO: renamed from: b */
    public final void m6380b() {
        if (!this.f10883c) {
            if (this.f10882b.isEmpty()) {
                return;
            }
            c cVar = this.f10881a;
            InterfaceC7487g<ConnectivityManager> interfaceC7487g = cVar.f10888c;
            boolean z10 = true;
            cVar.f10886a = interfaceC7487g.get().getActiveNetwork() != null;
            try {
                interfaceC7487g.get().registerDefaultNetworkCallback(cVar.f10889d);
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                z10 = false;
            }
            this.f10883c = z10;
        }
    }
}
