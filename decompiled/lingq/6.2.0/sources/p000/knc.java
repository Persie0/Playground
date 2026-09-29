package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class knc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b9d f47570b;

    public /* synthetic */ knc(b9d b9dVar, int i) {
        this.f47569a = i;
        this.f47570b = b9dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47569a) {
            case 0:
                break;
            case 1:
                b9d b9dVar = this.f47570b;
                synchronized (b9dVar) {
                    if (b9dVar.f8194a == 1) {
                        b9dVar.m3493a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.f47570b.m3493a("Service disconnected");
                return;
        }
        while (true) {
            b9d b9dVar2 = this.f47570b;
            synchronized (b9dVar2) {
                try {
                    if (b9dVar2.f8194a != 2) {
                        return;
                    }
                    if (b9dVar2.f8197d.isEmpty()) {
                        b9dVar2.m3495c();
                        return;
                    }
                    ged gedVar = (ged) b9dVar2.f8197d.poll();
                    b9dVar2.f8198e.put(gedVar.f40688a, gedVar);
                    ((ScheduledExecutorService) b9dVar2.f8199f.f40986c).schedule(new gvb(25, b9dVar2, gedVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(gedVar)));
                    }
                    gld gldVar = b9dVar2.f8199f;
                    Messenger messenger = b9dVar2.f8195b;
                    int i = gedVar.f40690c;
                    Context context = (Context) gldVar.f40985b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = gedVar.f40688a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", gedVar.m12564a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", gedVar.f40691d);
                    messageObtain.setData(bundle);
                    try {
                        cdb cdbVar = b9dVar2.f8196c;
                        Messenger messenger2 = (Messenger) cdbVar.f9945b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = (zzd) cdbVar.f9946c;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            zzdVar.m5277a(messageObtain);
                        }
                    } catch (RemoteException e) {
                        b9dVar2.m3493a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
