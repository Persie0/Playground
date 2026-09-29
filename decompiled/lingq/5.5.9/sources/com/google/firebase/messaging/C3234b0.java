package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.RunnableC0191j;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p326q.C8446b;

/* JADX INFO: renamed from: com.google.firebase.messaging.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3234b0 {

    /* JADX INFO: renamed from: i */
    public static final long f16351i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f16352j = 0;

    /* JADX INFO: renamed from: a */
    public final Context f16353a;

    /* JADX INFO: renamed from: b */
    public final C3252o f16354b;

    /* JADX INFO: renamed from: c */
    public final C3249l f16355c;

    /* JADX INFO: renamed from: d */
    public final FirebaseMessaging f16356d;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f16358f;

    /* JADX INFO: renamed from: h */
    public final C3263z f16360h;

    /* JADX INFO: renamed from: e */
    public final C8446b f16357e = new C8446b();

    /* JADX INFO: renamed from: g */
    public boolean f16359g = false;

    public C3234b0(FirebaseMessaging firebaseMessaging, C3252o c3252o, C3263z c3263z, C3249l c3249l, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16356d = firebaseMessaging;
        this.f16354b = c3252o;
        this.f16360h = c3263z;
        this.f16355c = c3249l;
        this.f16353a = context;
        this.f16358f = scheduledExecutorService;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public static <T> void m9239a(AbstractC5751g<T> abstractC5751g) throws IOException {
        try {
            Tasks.await(abstractC5751g, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9240d() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m9241b(String str) throws IOException {
        String strM9229a = this.f16356d.m9229a();
        C3249l c3249l = this.f16355c;
        c3249l.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        m9239a(c3249l.m9265a(c3249l.m9267c(strM9229a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: c */
    public final void m9242c(String str) throws IOException {
        String strM9229a = this.f16356d.m9229a();
        C3249l c3249l = this.f16355c;
        c3249l.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        m9239a(c3249l.m9265a(c3249l.m9267c(strM9229a, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: e */
    public final boolean m9243e() throws IOException {
        byte b10;
        while (true) {
            synchronized (this) {
                try {
                    C3262y c3262yM9299a = this.f16360h.m9299a();
                    boolean z10 = true;
                    if (c3262yM9299a == null) {
                        if (m9240d()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    try {
                        String str = c3262yM9299a.f16458b;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 83) {
                            b10 = (iHashCode == 85 && str.equals("U")) ? (byte) 1 : (byte) -1;
                        } else if (str.equals("S")) {
                            b10 = 0;
                        }
                        String str2 = c3262yM9299a.f16457a;
                        if (b10 == 0) {
                            m9241b(str2);
                            if (m9240d()) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        } else if (b10 == 1) {
                            m9242c(str2);
                            if (m9240d()) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                            }
                        } else if (m9240d()) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + c3262yM9299a + ".");
                        }
                    } catch (IOException e10) {
                        if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                        } else {
                            if (e10.getMessage() != null) {
                                throw e10;
                            }
                            Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                        }
                        z10 = false;
                    }
                    if (!z10) {
                        return false;
                    }
                    C3263z c3263z = this.f16360h;
                    synchronized (c3263z) {
                        C3259v c3259v = c3263z.f16461a;
                        String str3 = c3262yM9299a.f16459c;
                        synchronized (c3259v.f16445d) {
                            try {
                                if (c3259v.f16445d.remove(str3)) {
                                    c3259v.f16446e.execute(new RunnableC0191j(18, c3259v));
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    synchronized (this.f16357e) {
                        String str4 = c3262yM9299a.f16459c;
                        if (this.f16357e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.f16357e.getOrDefault(str4, null);
                            C5752h c5752h = (C5752h) arrayDeque.poll();
                            if (c5752h != null) {
                                c5752h.m12114b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.f16357e.remove(str4);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m9244f(long j10) {
        this.f16358f.schedule(new RunnableC3236c0(this, this.f16353a, this.f16354b, Math.min(Math.max(30L, 2 * j10), f16351i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f16359g = true;
        }
    }
}
