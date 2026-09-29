package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v4.media.session.C0166e;
import androidx.activity.RunnableC0183b;
import androidx.activity.RunnableC0190i;
import androidx.activity.RunnableC0191j;
import androidx.activity.RunnableC0193l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p003a2.C0009a;
import p026b5.AbstractC1314g;
import p041c5.C1722t;
import p131g5.C5700d;
import p131g5.InterfaceC5699c;
import p170i5.C6195n;
import p214k5.C6610l;
import p214k5.C6617s;
import p235l5.C7254a0;
import p235l5.C7274u;
import p235l5.ExecutorC7270q;
import p257m5.C7480b;
import p260m8.C7499b;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1252c implements InterfaceC5699c, C7254a0.a {

    /* JADX INFO: renamed from: H */
    public static final String f7861H = AbstractC1314g.m4868f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a */
    public final Context f7862a;

    /* JADX INFO: renamed from: b */
    public final int f7863b;

    /* JADX INFO: renamed from: c */
    public final C6610l f7864c;

    /* JADX INFO: renamed from: d */
    public final C1253d f7865d;

    /* JADX INFO: renamed from: e */
    public final C5700d f7866e;

    /* JADX INFO: renamed from: f */
    public final Object f7867f;

    /* JADX INFO: renamed from: g */
    public int f7868g;

    /* JADX INFO: renamed from: h */
    public final ExecutorC7270q f7869h;

    /* JADX INFO: renamed from: i */
    public final C7480b.a f7870i;

    /* JADX INFO: renamed from: j */
    public PowerManager.WakeLock f7871j;

    /* JADX INFO: renamed from: k */
    public boolean f7872k;

    /* JADX INFO: renamed from: l */
    public final C1722t f7873l;

    public C1252c(Context context, int i10, C1253d c1253d, C1722t c1722t) {
        this.f7862a = context;
        this.f7863b = i10;
        this.f7865d = c1253d;
        this.f7864c = c1722t.f9553a;
        this.f7873l = c1722t;
        C6195n c6195n = c1253d.f7879e.f9484j;
        C7480b c7480b = (C7480b) c1253d.f7876b;
        this.f7869h = c7480b.f41352a;
        this.f7870i = c7480b.f41354c;
        this.f7866e = new C5700d(c6195n, this);
        this.f7872k = false;
        this.f7868g = 0;
        this.f7867f = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m4731b(C1252c c1252c) {
        C6610l c6610l = c1252c.f7864c;
        String str = c6610l.f37514a;
        int i10 = c1252c.f7868g;
        String str2 = f7861H;
        if (i10 >= 2) {
            AbstractC1314g.m4867d().mo4869a(str2, "Already stopped work for " + str);
            return;
        }
        c1252c.f7868g = 2;
        AbstractC1314g.m4867d().mo4869a(str2, "Stopping work for WorkSpec " + str);
        String str3 = C1250a.f7852e;
        Context context = c1252c.f7862a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        C1250a.m4728c(intent, c6610l);
        int i11 = c1252c.f7863b;
        C1253d c1253d = c1252c.f7865d;
        C1253d.b bVar = new C1253d.b(i11, intent, c1253d);
        C7480b.a aVar = c1252c.f7870i;
        aVar.execute(bVar);
        if (!c1253d.f7878d.m5455c(c6610l.f37514a)) {
            AbstractC1314g.m4867d().mo4869a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        AbstractC1314g.m4867d().mo4869a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        C1250a.m4728c(intent2, c6610l);
        aVar.execute(new C1253d.b(i11, intent2, c1253d));
    }

    @Override // p235l5.C7254a0.a
    /* JADX INFO: renamed from: a */
    public final void mo4732a(C6610l c6610l) {
        AbstractC1314g.m4867d().mo4869a(f7861H, "Exceeded time limits on execution for " + c6610l);
        this.f7869h.execute(new RunnableC0190i(8, this));
    }

    /* JADX INFO: renamed from: c */
    public final void m4733c() {
        synchronized (this.f7867f) {
            this.f7866e.m12067e();
            this.f7865d.f7877c.m14601a(this.f7864c);
            PowerManager.WakeLock wakeLock = this.f7871j;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC1314g.m4867d().mo4869a(f7861H, "Releasing wakelock " + this.f7871j + "for WorkSpec " + this.f7864c);
                this.f7871j.release();
            }
        }
    }

    @Override // p131g5.InterfaceC5699c
    /* JADX INFO: renamed from: d */
    public final void mo4734d(ArrayList arrayList) {
        this.f7869h.execute(new RunnableC0191j(5, this));
    }

    /* JADX INFO: renamed from: e */
    public final void m4735e() {
        String str = this.f7864c.f37514a;
        this.f7871j = C7274u.m14661a(this.f7862a, C0166e.m768o(C0009a.m26o(str, " ("), this.f7863b, ")"));
        AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
        String str2 = "Acquiring wakelock " + this.f7871j + "for WorkSpec " + str;
        String str3 = f7861H;
        abstractC1314gM4867d.mo4869a(str3, str2);
        this.f7871j.acquire();
        C6617s c6617sMo13237o = this.f7865d.f7879e.f9477c.mo4718z().mo13237o(str);
        if (c6617sMo13237o == null) {
            this.f7869h.execute(new RunnableC0193l(7, this));
            return;
        }
        boolean zM13221b = c6617sMo13237o.m13221b();
        this.f7872k = zM13221b;
        if (zM13221b) {
            this.f7866e.m12066d(Collections.singletonList(c6617sMo13237o));
            return;
        }
        AbstractC1314g.m4867d().mo4869a(str3, "No constraints for " + str);
        mo4736f(Collections.singletonList(c6617sMo13237o));
    }

    @Override // p131g5.InterfaceC5699c
    /* JADX INFO: renamed from: f */
    public final void mo4736f(List<C6617s> list) {
        Iterator<C6617s> it = list.iterator();
        while (it.hasNext()) {
            if (C7499b.m14892A(it.next()).equals(this.f7864c)) {
                this.f7869h.execute(new RunnableC0183b(5, this));
                break;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4737g(boolean z10) {
        AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        C6610l c6610l = this.f7864c;
        sb2.append(c6610l);
        sb2.append(", ");
        sb2.append(z10);
        abstractC1314gM4867d.mo4869a(f7861H, sb2.toString());
        m4733c();
        int i10 = this.f7863b;
        C1253d c1253d = this.f7865d;
        C7480b.a aVar = this.f7870i;
        Context context = this.f7862a;
        if (z10) {
            String str = C1250a.f7852e;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C1250a.m4728c(intent, c6610l);
            aVar.execute(new C1253d.b(i10, intent, c1253d));
        }
        if (this.f7872k) {
            String str2 = C1250a.f7852e;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new C1253d.b(i10, intent2, c1253d));
        }
    }
}
