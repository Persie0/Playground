package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hec implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42282a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f42283b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Parcelable f42284c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f42285d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f42286e;

    public hec(v4d v4dVar, zzr zzrVar, boolean z, zzah zzahVar) {
        this.f42284c = zzrVar;
        this.f42283b = z;
        this.f42285d = zzahVar;
        Objects.requireNonNull(v4dVar);
        this.f42286e = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iM6693a;
        switch (this.f42282a) {
            case 0:
                Intent intent = (Intent) this.f42284c;
                Context context = (Context) this.f42285d;
                boolean z = this.f42283b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f42286e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            CloudMessage cloudMessage = new CloudMessage(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f13702b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o76("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f13702b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new kr3(5, context, cloudMessage, countDownLatch, false));
                            try {
                                iIntValue = ((Integer) Tasks.await(new C3156jq(context).m14592F(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iM6693a = iIntValue;
                        break;
                    } else {
                        iM6693a = FirebaseInstanceIdReceiver.m6693a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iM6693a);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            default:
                v4d v4dVar = (v4d) this.f42286e;
                q9c q9cVar = v4dVar.f64866d;
                if (q9cVar != null) {
                    v4dVar.m23121V(q9cVar, this.f42283b ? null : (zzah) this.f42285d, (zzr) this.f42284c);
                    v4dVar.m23116Q();
                    return;
                } else {
                    xcc xccVar = ((kjc) v4dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17923a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ hec(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f42284c = intent;
        this.f42285d = context;
        this.f42283b = z;
        this.f42286e = pendingResult;
    }
}
