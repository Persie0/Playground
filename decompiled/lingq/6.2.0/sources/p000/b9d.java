package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class b9d implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public int f8194a = 0;

    /* JADX INFO: renamed from: b */
    public final Messenger f8195b;

    /* JADX INFO: renamed from: c */
    public cdb f8196c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f8197d;

    /* JADX INFO: renamed from: e */
    public final SparseArray f8198e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gld f8199f;

    public b9d(gld gldVar) {
        this.f8199f = gldVar;
        wdb wdbVar = new wdb(Looper.getMainLooper(), new cc9(this, 1));
        Looper.getMainLooper();
        this.f8195b = new Messenger(wdbVar);
        this.f8197d = new ArrayDeque();
        this.f8198e = new SparseArray();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3493a(String str) {
        m3494b(str, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3494b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f8194a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f8194a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f8194a = 4;
            li1.m16230b().m16232c((Context) this.f8199f.f40985b, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.f8197d.iterator();
            while (it.hasNext()) {
                ((ged) it.next()).m12565b(zztVar);
            }
            this.f8197d.clear();
            int i2 = 0;
            while (true) {
                int size = this.f8198e.size();
                SparseArray sparseArray = this.f8198e;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((ged) sparseArray.valueAt(i2)).m12565b(zztVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3495c() {
        try {
            if (this.f8194a == 2 && this.f8197d.isEmpty() && this.f8198e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f8194a = 3;
                li1.m16230b().m16232c((Context) this.f8199f.f40985b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final synchronized boolean m3496d(ged gedVar) {
        try {
            int i = this.f8194a;
            Object[] objArr = 0;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    this.f8197d.add(gedVar);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                this.f8197d.add(gedVar);
                ((ScheduledExecutorService) this.f8199f.f40986c).execute(new knc(this, objArr == true ? 1 : 0));
                return true;
            }
            this.f8197d.add(gedVar);
            lda.m16133s(this.f8194a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f8194a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (li1.m16230b().m16231a((Context) this.f8199f.f40985b, intent, this, 1)) {
                    ((ScheduledExecutorService) this.f8199f.f40986c).schedule(new knc(this, i2), 30L, TimeUnit.SECONDS);
                } else {
                    m3493a("Unable to bind to service");
                }
            } catch (SecurityException e) {
                m3494b("Unable to bind to service", e);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f8199f.f40986c).execute(new gvb(17, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f8199f.f40986c).execute(new knc(this, i));
    }
}
