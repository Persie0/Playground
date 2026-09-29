package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class wj8 {

    /* JADX INFO: renamed from: h */
    public static int f66934h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f66935i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f66936j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: a */
    public final l79 f66937a = new l79(0);

    /* JADX INFO: renamed from: b */
    public final Context f66938b;

    /* JADX INFO: renamed from: c */
    public final sq6 f66939c;

    /* JADX INFO: renamed from: d */
    public final ScheduledThreadPoolExecutor f66940d;

    /* JADX INFO: renamed from: e */
    public final Messenger f66941e;

    /* JADX INFO: renamed from: f */
    public Messenger f66942f;

    /* JADX INFO: renamed from: g */
    public zzd f66943g;

    public wj8(Context context) {
        this.f66938b = context;
        sq6 sq6Var = new sq6();
        sq6Var.f61254b = 0;
        sq6Var.f61255c = context;
        this.f66939c = sq6Var;
        this.f66941e = new Messenger(new gib(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f66940d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX INFO: renamed from: a */
    public final tld m24020a(Bundle bundle) {
        String string;
        int iM21587x;
        Context context;
        synchronized (wj8.class) {
            int i = f66934h;
            f66934h = i + 1;
            string = Integer.toString(i);
        }
        wr9 wr9Var = new wr9();
        synchronized (this.f66937a) {
            this.f66937a.put(string, wr9Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f66939c.m21587x() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.f66938b;
        synchronized (wj8.class) {
            try {
                if (f66935i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f66935i = PendingIntent.getBroadcast(context2, 0, intent2, kfb.f47152a);
                }
                intent.putExtra("app", f66935i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f66941e);
        if (this.f66942f == null && this.f66943g == null) {
            iM21587x = this.f66939c.m21587x();
            context = this.f66938b;
            if (iM21587x == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f66942f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f66943g.m5277a(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iM21587x = this.f66939c.m21587x();
                context = this.f66938b;
                if (iM21587x == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        wr9Var.f67208a.mo5960b(qg2.f57747c, new mq7(this, string, this.f66940d.schedule(new RunnableC3468pp(wr9Var, 24), 30L, TimeUnit.SECONDS), 9));
        return wr9Var.f67208a;
    }

    /* JADX INFO: renamed from: b */
    public final void m24021b(String str, Bundle bundle) {
        synchronized (this.f66937a) {
            try {
                wr9 wr9Var = (wr9) this.f66937a.remove(str);
                if (wr9Var != null) {
                    wr9Var.m24138b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
