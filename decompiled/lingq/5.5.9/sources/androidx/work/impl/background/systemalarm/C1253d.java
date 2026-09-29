package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.appcompat.widget.C0322j;
import java.util.ArrayList;
import java.util.Iterator;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;
import p041c5.C1719q;
import p041c5.InterfaceC1704d;
import p214k5.C6610l;
import p235l5.C7254a0;
import p235l5.C7274u;
import p235l5.ExecutorC7270q;
import p257m5.C7480b;
import p257m5.InterfaceC7479a;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1253d implements InterfaceC1704d {

    /* JADX INFO: renamed from: j */
    public static final String f7874j = AbstractC1314g.m4868f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a */
    public final Context f7875a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7479a f7876b;

    /* JADX INFO: renamed from: c */
    public final C7254a0 f7877c;

    /* JADX INFO: renamed from: d */
    public final C1719q f7878d;

    /* JADX INFO: renamed from: e */
    public final C1699a0 f7879e;

    /* JADX INFO: renamed from: f */
    public final C1250a f7880f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7881g;

    /* JADX INFO: renamed from: h */
    public Intent f7882h;

    /* JADX INFO: renamed from: i */
    public c f7883i;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // java.lang.Runnable
        public final void run() {
            C7480b.a aVar;
            d dVar;
            synchronized (C1253d.this.f7881g) {
                C1253d c1253d = C1253d.this;
                c1253d.f7882h = (Intent) c1253d.f7881g.get(0);
            }
            Intent intent = C1253d.this.f7882h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1253d.this.f7882h.getIntExtra("KEY_START_ID", 0);
                AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
                String str = C1253d.f7874j;
                abstractC1314gM4867d.mo4869a(str, "Processing command " + C1253d.this.f7882h + ", " + intExtra);
                PowerManager.WakeLock wakeLockM14661a = C7274u.m14661a(C1253d.this.f7875a, action + " (" + intExtra + ")");
                try {
                    AbstractC1314g.m4867d().mo4869a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockM14661a);
                    wakeLockM14661a.acquire();
                    C1253d c1253d2 = C1253d.this;
                    c1253d2.f7880f.m4729a(intExtra, c1253d2.f7882h, c1253d2);
                    AbstractC1314g.m4867d().mo4869a(str, "Releasing operation wake lock (" + action + ") " + wakeLockM14661a);
                    wakeLockM14661a.release();
                    C1253d c1253d3 = C1253d.this;
                    aVar = ((C7480b) c1253d3.f7876b).f41354c;
                    dVar = new d(c1253d3);
                } catch (Throwable th2) {
                    try {
                        AbstractC1314g abstractC1314gM4867d2 = AbstractC1314g.m4867d();
                        String str2 = C1253d.f7874j;
                        abstractC1314gM4867d2.mo4871c(str2, "Unexpected error in onHandleIntent", th2);
                        AbstractC1314g.m4867d().mo4869a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockM14661a);
                        wakeLockM14661a.release();
                        C1253d c1253d4 = C1253d.this;
                        aVar = ((C7480b) c1253d4.f7876b).f41354c;
                        dVar = new d(c1253d4);
                    } catch (Throwable th3) {
                        AbstractC1314g.m4867d().mo4869a(C1253d.f7874j, "Releasing operation wake lock (" + action + ") " + wakeLockM14661a);
                        wakeLockM14661a.release();
                        C1253d c1253d5 = C1253d.this;
                        ((C7480b) c1253d5.f7876b).f41354c.execute(new d(c1253d5));
                        throw th3;
                    }
                }
                aVar.execute(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C1253d f7885a;

        /* JADX INFO: renamed from: b */
        public final Intent f7886b;

        /* JADX INFO: renamed from: c */
        public final int f7887c;

        public b(int i10, Intent intent, C1253d c1253d) {
            this.f7885a = c1253d;
            this.f7886b = intent;
            this.f7887c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7885a.m4739a(this.f7886b, this.f7887c);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$c */
    public interface c {
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$d */
    public static class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C1253d f7888a;

        public d(C1253d c1253d) {
            this.f7888a = c1253d;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[Catch: all -> 0x00c6, TryCatch #1 {, blocks: (B:4:0x001e, B:6:0x0022, B:8:0x004d, B:13:0x005f, B:14:0x006c, B:19:0x007a, B:21:0x0084, B:22:0x0088, B:26:0x0096, B:28:0x00a5, B:40:0x00bf, B:34:0x00b1, B:36:0x00b3, B:38:0x00bb, B:45:0x00c4, B:9:0x0054, B:10:0x005c, B:15:0x006d, B:16:0x0076, B:23:0x0089, B:24:0x0093), top: B:52:0x001e, inners: #0, #2 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00bb A[Catch: all -> 0x00c6, TryCatch #1 {, blocks: (B:4:0x001e, B:6:0x0022, B:8:0x004d, B:13:0x005f, B:14:0x006c, B:19:0x007a, B:21:0x0084, B:22:0x0088, B:26:0x0096, B:28:0x00a5, B:40:0x00bf, B:34:0x00b1, B:36:0x00b3, B:38:0x00bb, B:45:0x00c4, B:9:0x0054, B:10:0x005c, B:15:0x006d, B:16:0x0076, B:23:0x0089, B:24:0x0093), top: B:52:0x001e, inners: #0, #2 }] */
        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            C1253d c1253d = this.f7888a;
            c1253d.getClass();
            AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
            String str = C1253d.f7874j;
            abstractC1314gM4867d.mo4869a(str, "Checking if commands are complete.");
            C1253d.m4738b();
            synchronized (c1253d.f7881g) {
                if (c1253d.f7882h != null) {
                    AbstractC1314g.m4867d().mo4869a(str, "Removing command " + c1253d.f7882h);
                    if (!((Intent) c1253d.f7881g.remove(0)).equals(c1253d.f7882h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    c1253d.f7882h = null;
                }
                ExecutorC7270q executorC7270q = ((C7480b) c1253d.f7876b).f41352a;
                C1250a c1250a = c1253d.f7880f;
                synchronized (c1250a.f7855c) {
                    try {
                        z10 = !c1250a.f7854b.isEmpty();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z10 && c1253d.f7881g.isEmpty()) {
                    synchronized (executorC7270q.f40763d) {
                        try {
                            z11 = !executorC7270q.f40760a.isEmpty();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!z11) {
                        AbstractC1314g.m4867d().mo4869a(str, "No more commands & intents.");
                        c cVar = c1253d.f7883i;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).m4726a();
                        }
                    } else if (!c1253d.f7881g.isEmpty()) {
                        c1253d.m4740c();
                    }
                } else if (!c1253d.f7881g.isEmpty()) {
                    c1253d.m4740c();
                }
            }
        }
    }

    public C1253d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7875a = applicationContext;
        this.f7880f = new C1250a(applicationContext, new C0322j(4));
        C1699a0 c1699a0M5430d = C1699a0.m5430d(context);
        this.f7879e = c1699a0M5430d;
        this.f7877c = new C7254a0(c1699a0M5430d.f9476b.f7814e);
        C1719q c1719q = c1699a0M5430d.f9480f;
        this.f7878d = c1719q;
        this.f7876b = c1699a0M5430d.f9478d;
        c1719q.m5454a(this);
        this.f7881g = new ArrayList();
        this.f7882h = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m4738b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m4739a(Intent intent, int i10) {
        boolean z10;
        AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
        String str = f7874j;
        abstractC1314gM4867d.mo4869a(str, "Adding command " + intent + " (" + i10 + ")");
        m4738b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC1314g.m4867d().mo4873g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m4738b();
            synchronized (this.f7881g) {
                Iterator it = this.f7881g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f7881g) {
            boolean z11 = !this.f7881g.isEmpty();
            this.f7881g.add(intent);
            if (!z11) {
                m4740c();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4740c() {
        m4738b();
        PowerManager.WakeLock wakeLockM14661a = C7274u.m14661a(this.f7875a, "ProcessCommand");
        try {
            wakeLockM14661a.acquire();
            this.f7879e.f9478d.m14863a(new a());
            wakeLockM14661a.release();
        } catch (Throwable th2) {
            wakeLockM14661a.release();
            throw th2;
        }
    }

    @Override // p041c5.InterfaceC1704d
    /* JADX INFO: renamed from: e */
    public final void mo4730e(C6610l c6610l, boolean z10) {
        C7480b.a aVar = ((C7480b) this.f7876b).f41354c;
        String str = C1250a.f7852e;
        Intent intent = new Intent(this.f7875a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        C1250a.m4728c(intent, c6610l);
        aVar.execute(new b(0, intent, this));
    }
}
