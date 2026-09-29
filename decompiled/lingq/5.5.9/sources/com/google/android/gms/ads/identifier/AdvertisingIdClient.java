package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.ServiceConnectionC2541a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import lb.C7297a;
import p176ib.C6272i;
import p362rb.AbstractBinderC8763d;
import p362rb.C8762c;
import p362rb.InterfaceC8764e;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {
    ServiceConnectionC2541a zza;
    InterfaceC8764e zzb;
    boolean zzc;
    final Object zzd;
    C2539b zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {

        /* JADX INFO: renamed from: a */
        public final String f13792a;

        /* JADX INFO: renamed from: b */
        public final boolean f13793b;

        @Deprecated
        public Info(String str, boolean z10) {
            this.f13792a = str;
            this.f13793b = z10;
        }

        public String getId() {
            return this.f13792a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f13793b;
        }

        public final String toString() {
            String str = this.f13792a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(this.f13793b);
            return sb2.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public AdvertisingIdClient(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.zzd = new Object();
        C6272i.m12915i(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j10;
    }

    public static Info getAdvertisingIdInfo(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            advertisingIdClient.zza();
            return infoZzd;
        } catch (Throwable th2) {
            try {
                advertisingIdClient.zzc(null, true, 0.0f, -1L, "", th2);
                throw th2;
            } catch (Throwable th3) {
                advertisingIdClient.zza();
                throw th3;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zMo17012a;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            C6272i.m12914h("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            try {
                                C2539b c2539b = advertisingIdClient.zze;
                                if (c2539b == null || !c2539b.f13798d) {
                                    throw new IOException("AdvertisingIdClient is not connected.");
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e10) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                        }
                    }
                    C6272i.m12915i(advertisingIdClient.zza);
                    C6272i.m12915i(advertisingIdClient.zzb);
                    try {
                        zMo17012a = advertisingIdClient.zzb.mo17012a();
                    } catch (RemoteException e11) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return zMo17012a;
        } catch (Throwable th4) {
            advertisingIdClient.zza();
            throw th4;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z10) {
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    private final Info zzd(int i10) throws IOException {
        Info info;
        C6272i.m12914h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                C6272i.m12915i(this.zza);
                C6272i.m12915i(this.zzb);
                info = new Info(this.zzb.mo17014d(), this.zzb.mo17013b());
            } else {
                synchronized (this.zzd) {
                    try {
                        C2539b c2539b = this.zze;
                        if (c2539b == null || !c2539b.f13798d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    C6272i.m12915i(this.zza);
                    C6272i.m12915i(this.zzb);
                    try {
                        info = new Info(this.zzb.mo17014d(), this.zzb.mo17013b());
                    } catch (RemoteException e10) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e11) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                }
            }
            throw th;
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            C2539b c2539b = this.zze;
            if (c2539b != null) {
                c2539b.f13797c.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.zzf;
            if (j10 > 0) {
                this.zze = new C2539b(this, j10);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzb(true);
    }

    public final void zza() {
        C6272i.m12914h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg != null && this.zza != null) {
                try {
                    if (this.zzc) {
                        C7297a.m14688b().m14690c(this.zzg, this.zza);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public final void zzb(boolean z10) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        C6272i.m12914h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iMo7586c = C2549d.f13922b.mo7586c(context, 12451000);
                if (iMo7586c != 0 && iMo7586c != 2) {
                    throw new IOException("Google Play services not available");
                }
                ServiceConnectionC2541a serviceConnectionC2541a = new ServiceConnectionC2541a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!C7297a.m14688b().m14689a(context, intent, serviceConnectionC2541a, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.zza = serviceConnectionC2541a;
                    try {
                        IBinder iBinderM7533a = serviceConnectionC2541a.m7533a(TimeUnit.MILLISECONDS);
                        int i10 = AbstractBinderC8763d.f46479a;
                        IInterface iInterfaceQueryLocalInterface = iBinderM7533a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.zzb = iInterfaceQueryLocalInterface instanceof InterfaceC8764e ? (InterfaceC8764e) iInterfaceQueryLocalInterface : new C8762c(iBinderM7533a);
                        this.zzc = true;
                        if (z10) {
                            zze();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (Throwable th3) {
                    throw new IOException(th3);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException();
            }
        }
    }

    public final boolean zzc(Info info, boolean z10, float f3, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id2 = info.getId();
            if (id2 != null) {
                map.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            map.put("error", th2.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new C2538a(map).start();
        return true;
    }
}
