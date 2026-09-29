package p115fb;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzq;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import lb.C7297a;
import p289o5.RunnableC7930j;
import p289o5.RunnableC7943w;
import p434vb.HandlerC9708b;

/* JADX INFO: renamed from: fb.k */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC5495k implements ServiceConnection {

    /* JADX INFO: renamed from: c */
    public C5496l f34096c;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C5500p f34099f;

    /* JADX INFO: renamed from: a */
    public int f34094a = 0;

    /* JADX INFO: renamed from: b */
    public final Messenger f34095b = new Messenger(new HandlerC9708b(Looper.getMainLooper(), new Handler.Callback() { // from class: fb.h
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC5495k serviceConnectionC5495k = this.f34088a;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i10);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (serviceConnectionC5495k) {
                AbstractC5498n<?> abstractC5498n = serviceConnectionC5495k.f34098e.get(i10);
                if (abstractC5498n == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i10);
                    Log.w("MessengerIpcClient", sb3.toString());
                } else {
                    serviceConnectionC5495k.f34098e.remove(i10);
                    serviceConnectionC5495k.m11720c();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC5498n.m11724c(new zzq("Not supported by GmsCore", null));
                    } else {
                        abstractC5498n.mo11722a(data);
                    }
                }
            }
            return true;
        }
    }));

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f34097d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final SparseArray<AbstractC5498n<?>> f34098e = new SparseArray<>();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m11718a(String str, int i10) {
        try {
            m11719b(i10, str, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m11719b(int i10, String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            int i11 = this.f34094a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f34094a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f34094a = 4;
            C7297a.m14688b().m14690c(this.f34099f.f34107a, this);
            zzq zzqVar = new zzq(str, securityException);
            Iterator it = this.f34097d.iterator();
            while (it.hasNext()) {
                ((AbstractC5498n) it.next()).m11724c(zzqVar);
            }
            this.f34097d.clear();
            for (int i12 = 0; i12 < this.f34098e.size(); i12++) {
                this.f34098e.valueAt(i12).m11724c(zzqVar);
            }
            this.f34098e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m11720c() {
        if (this.f34094a == 2 && this.f34097d.isEmpty() && this.f34098e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f34094a = 3;
            C7297a.m14688b().m14690c(this.f34099f.f34107a, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m11721d(AbstractC5498n<?> abstractC5498n) {
        int i10 = this.f34094a;
        int i11 = 1;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f34097d.add(abstractC5498n);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f34097d.add(abstractC5498n);
            this.f34099f.f34108b.execute(new RunnableC7943w(i11, this));
            return true;
        }
        this.f34097d.add(abstractC5498n);
        if (!(this.f34094a == 0)) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f34094a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C7297a.m14688b().m14689a(this.f34099f.f34107a, intent, this, 1)) {
                this.f34099f.f34108b.schedule(new RunnableC5493i(i12, this), 30L, TimeUnit.SECONDS);
            } else {
                m11718a("Unable to bind to service", 0);
            }
        } catch (SecurityException e10) {
            m11719b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f34099f.f34108b.execute(new RunnableC5494j(this, 0, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f34099f.f34108b.execute(new RunnableC7930j(i10, this));
    }
}
