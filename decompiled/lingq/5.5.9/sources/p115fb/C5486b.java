package p115fb;

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
import p136gc.C5752h;
import p136gc.C5761q;
import p289o5.RunnableC7930j;
import p326q.C8452h;
import p434vb.C9707a;

/* JADX INFO: renamed from: fb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5486b {

    /* JADX INFO: renamed from: h */
    public static int f34071h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f34072i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f34073j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f34075b;

    /* JADX INFO: renamed from: c */
    public final C5501q f34076c;

    /* JADX INFO: renamed from: d */
    public final ScheduledThreadPoolExecutor f34077d;

    /* JADX INFO: renamed from: f */
    public Messenger f34079f;

    /* JADX INFO: renamed from: g */
    public zzd f34080g;

    /* JADX INFO: renamed from: a */
    public final C8452h<String, C5752h<Bundle>> f34074a = new C8452h<>();

    /* JADX INFO: renamed from: e */
    public final Messenger f34078e = new Messenger(new HandlerC5488d(this, Looper.getMainLooper()));

    public C5486b(Context context) {
        this.f34075b = context;
        this.f34076c = new C5501q(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f34077d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    /* JADX WARN: Code duplicated, block: B:41:0x012c  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final C5761q m11716a(Bundle bundle) {
        String string;
        synchronized (C5486b.class) {
            try {
                int i10 = f34071h;
                f34071h = i10 + 1;
                string = Integer.toString(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C5752h<Bundle> c5752h = new C5752h<>();
        synchronized (this.f34074a) {
            this.f34074a.put(string, c5752h);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f34076c.m11728a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f34075b;
        synchronized (C5486b.class) {
            if (f34072i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f34072i = PendingIntent.getBroadcast(context, 0, intent2, C9707a.f49714a);
            }
            intent.putExtra("app", f34072i);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 5);
        sb2.append("|ID|");
        sb2.append(string);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        int i11 = 3;
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(strValueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f34078e);
        if (this.f34079f != null || this.f34080g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f34079f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f34080g.f13854a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f34076c.m11728a() == 2) {
                    this.f34075b.sendBroadcast(intent);
                } else {
                    this.f34075b.startService(intent);
                }
            }
        } else if (this.f34076c.m11728a() == 2) {
            this.f34075b.sendBroadcast(intent);
        } else {
            this.f34075b.startService(intent);
        }
        c5752h.f34812a.mo12101c(ExecutorC5503s.f34117a, new C5502r(this, string, this.f34077d.schedule(new RunnableC7930j(i11, c5752h), 30L, TimeUnit.SECONDS)));
        return c5752h.f34812a;
    }

    /* JADX INFO: renamed from: b */
    public final void m11717b(Bundle bundle, String str) {
        synchronized (this.f34074a) {
            C5752h<Bundle> c5752hRemove = this.f34074a.remove(str);
            if (c5752hRemove != null) {
                c5752hRemove.m12114b(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }
}
