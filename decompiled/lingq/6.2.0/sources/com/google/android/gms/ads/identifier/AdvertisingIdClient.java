package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import p000.f4c;
import p000.gwb;
import p000.job;
import p000.lda;
import p000.li1;
import p000.m0c;
import p000.po3;
import p000.wd0;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: a */
    public wd0 f11540a;

    /* JADX INFO: renamed from: b */
    public f4c f11541b;

    /* JADX INFO: renamed from: c */
    public boolean f11542c;

    /* JADX INFO: renamed from: d */
    public final Object f11543d = new Object();

    /* JADX INFO: renamed from: e */
    public job f11544e;

    /* JADX INFO: renamed from: f */
    public final Context f11545f;

    /* JADX INFO: renamed from: g */
    public final long f11546g;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Info {

        /* JADX INFO: renamed from: a */
        public final String f11547a;

        /* JADX INFO: renamed from: b */
        public final boolean f11548b;

        public Info(String str, boolean z) {
            this.f11547a = str;
            this.f11548b = z;
        }

        public String getId() {
            return this.f11547a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f11548b;
        }

        public final String toString() {
            String str = this.f11547a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.f11548b);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        lda.m16130p(context);
        Context applicationContext = context.getApplicationContext();
        this.f11545f = applicationContext != null ? applicationContext : context;
        this.f11542c = false;
        this.f11546g = -1L;
    }

    /* JADX INFO: renamed from: c */
    public static void m5263c(Info info, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (info != null) {
                map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
                String id = info.getId();
                if (id != null) {
                    map.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new C0943a(map).start();
        }
    }

    public static Info getAdvertisingIdInfo(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.m5265b();
            Info infoM5266d = advertisingIdClient.m5266d();
            m5263c(infoM5266d, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            advertisingIdClient.m5264a();
            return infoM5266d;
        } catch (Throwable th) {
            try {
                m5263c(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.m5264a();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5264a() {
        lda.m16129o("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f11545f == null || this.f11540a == null) {
                    return;
                }
                try {
                    if (this.f11542c) {
                        li1.m16230b().m16232c(this.f11545f, this.f11540a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f11542c = false;
                this.f11541b = null;
                this.f11540a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5265b() {
        lda.m16129o("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f11542c) {
                    m5264a();
                }
                Context context = this.f11545f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iM19432c = po3.f56584b.m19432c(context, 12451000);
                    if (iM19432c != 0 && iM19432c != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    wd0 wd0Var = new wd0();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!li1.m16230b().m16231a(context, intent, wd0Var, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f11540a = wd0Var;
                        try {
                            this.f11541b = m0c.m16591F(wd0Var.m23852a());
                            this.f11542c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Info m5266d() {
        Info info;
        lda.m16129o("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f11542c) {
                    synchronized (this.f11543d) {
                        job jobVar = this.f11544e;
                        if (jobVar == null || !jobVar.f45939d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m5265b();
                        if (!this.f11542c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                lda.m16130p(this.f11540a);
                lda.m16130p(this.f11541b);
                try {
                    info = new Info(((gwb) this.f11541b).m12947G(), ((gwb) this.f11541b).m12948H());
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f11543d) {
            job jobVar2 = this.f11544e;
            if (jobVar2 != null) {
                jobVar2.f45938c.countDown();
                try {
                    this.f11544e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f11546g;
            if (j > 0) {
                this.f11544e = new job(this, j);
            }
        }
        return info;
    }

    public final void finalize() throws Throwable {
        m5264a();
        super.finalize();
    }
}
