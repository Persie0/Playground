package p115fb;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p136gc.C5761q;
import p276nb.ThreadFactoryC7736a;

/* JADX INFO: renamed from: fb.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5485a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f34070a;

    public AbstractC5485a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC7736a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f34070a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo9187a(Context context, CloudMessage cloudMessage);

    /* JADX INFO: renamed from: b */
    public void mo9188b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: c */
    public final int m11714c(Context context, Intent intent) {
        int i10;
        C5761q c5761qM11727b;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            c5761qM11727b = Tasks.m8539c(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            C5500p c5500pM11726a = C5500p.m11726a(context);
            synchronized (c5500pM11726a) {
                i10 = c5500pM11726a.f34110d;
                c5500pM11726a.f34110d = i10 + 1;
            }
            c5761qM11727b = c5500pM11726a.m11727b(new C5497m(i10, bundle));
        }
        int iMo9187a = mo9187a(context, new CloudMessage(intent));
        try {
            Tasks.await(c5761qM11727b, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            String strValueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(strValueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return iMo9187a;
    }

    /* JADX INFO: renamed from: d */
    public final int m11715d(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo9188b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        this.f34070a.execute(new RunnableC5491g(this, intent, context, isOrderedBroadcast(), goAsync()));
    }
}
