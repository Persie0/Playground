package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class t7a {

    /* JADX INFO: renamed from: a */
    public final Context f61955a;

    /* JADX INFO: renamed from: b */
    public final lj1 f61956b;

    /* JADX INFO: renamed from: c */
    public final co7 f61957c;

    /* JADX INFO: renamed from: d */
    public final FirebaseMessaging f61958d;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f61960f;

    /* JADX INFO: renamed from: h */
    public final r7a f61962h;

    /* JADX INFO: renamed from: e */
    public final C3275kv f61959e = new C3275kv(0);

    /* JADX INFO: renamed from: g */
    public boolean f61961g = false;

    public t7a(FirebaseMessaging firebaseMessaging, lj1 lj1Var, r7a r7aVar, co7 co7Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f61958d = firebaseMessaging;
        this.f61956b = lj1Var;
        this.f61962h = r7aVar;
        this.f61957c = co7Var;
        this.f61955a = context;
        this.f61960f = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static void m21888a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21889b(String str) throws IOException {
        String strM6706a = this.f61958d.m6706a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        co7 co7Var = this.f61957c;
        m21888a(co7Var.m4935m(co7Var.m4940v(strM6706a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: c */
    public final void m21890c(String str) throws IOException {
        String strM6706a = this.f61958d.m6706a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        co7 co7Var = this.f61957c;
        m21888a(co7Var.m4935m(co7Var.m4940v(strM6706a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m21891d(boolean z) {
        this.f61961g = z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0105 */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m21892e() throws IOException {
        n7a n7aVarM20436a;
        while (true) {
            synchronized (this) {
                try {
                    n7aVarM20436a = this.f61962h.m20436a();
                    if (n7aVarM20436a == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = n7aVarM20436a.f52466b;
                String str2 = n7aVarM20436a.f52465a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        m21890c(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + n7aVarM20436a + ".");
                    }
                } else if (str.equals("S")) {
                    m21889b(str2);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + n7aVarM20436a + ".");
                }
                r7a r7aVar = this.f61962h;
                synchronized (r7aVar) {
                    w41 w41Var = r7aVar.f58861a;
                    String str3 = n7aVarM20436a.f52467c;
                    synchronized (((ArrayDeque) w41Var.f66368d)) {
                        try {
                            if (((ArrayDeque) w41Var.f66368d).remove(str3)) {
                                ((ScheduledThreadPoolExecutor) w41Var.f66369e).execute(new mt6(w41Var, 7));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this.f61959e) {
                    try {
                        String str4 = n7aVarM20436a.f52467c;
                        if (this.f61959e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.f61959e.get(str4);
                            wr9 wr9Var = (wr9) arrayDeque.poll();
                            if (wr9Var != null) {
                                wr9Var.m24138b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.f61959e.remove(str4);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m21893f(long j) {
        this.f61960f.schedule(new v7a(this, this.f61955a, this.f61956b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        m21891d(true);
    }
}
