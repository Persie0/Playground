package p000;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bab implements ban, bej {

    /* JADX INFO: renamed from: a */
    public final Context f2839a;

    /* JADX INFO: renamed from: b */
    public final int f2840b;

    /* JADX INFO: renamed from: c */
    public final bcj f2841c;

    /* JADX INFO: renamed from: d */
    public final bag f2842d;

    /* JADX INFO: renamed from: e */
    public final bap f2843e;

    /* JADX INFO: renamed from: f */
    public int f2844f;

    /* JADX INFO: renamed from: g */
    public final Executor f2845g;

    /* JADX INFO: renamed from: h */
    public final Executor f2846h;

    /* JADX INFO: renamed from: i */
    public PowerManager.WakeLock f2847i;

    /* JADX INFO: renamed from: j */
    public boolean f2848j;

    /* JADX INFO: renamed from: k */
    public final bkn f2849k;

    /* JADX INFO: renamed from: l */
    private final Object f2850l;

    static {
        ayc.m2100b(BcwGDRhrTsnlj.ehVAx);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public bab(Context context, int i, bag bagVar, bkn bknVar, byte[] bArr) {
        this.f2839a = context;
        this.f2840b = i;
        this.f2842d = bagVar;
        this.f2841c = (bcj) bknVar.f3651a;
        this.f2849k = bknVar;
        bbo bboVar = bagVar.f2860e.f2787i;
        C1058va c1058va = bagVar.f2865j;
        this.f2845g = c1058va.f47802a;
        this.f2846h = c1058va.f47803b;
        this.f2843e = new bap(bboVar, this);
        this.f2848j = false;
        this.f2844f = 0;
        this.f2850l = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final void m2151a() {
        synchronized (this.f2850l) {
            this.f2843e.mo2167b();
            this.f2842d.f2858c.m2265a(this.f2841c);
            PowerManager.WakeLock wakeLock = this.f2847i;
            if (wakeLock != null && wakeLock.isHeld()) {
                ayc.m2099a();
                StringBuilder sb = new StringBuilder();
                sb.append("Releasing wakelock ");
                sb.append(this.f2847i);
                sb.append("for WorkSpec ");
                sb.append(this.f2841c);
                this.f2847i.release();
            }
        }
    }

    @Override // p000.bej
    /* JADX INFO: renamed from: b */
    public final void mo2152b(bcj bcjVar) {
        ayc.m2099a();
        StringBuilder sb = new StringBuilder();
        sb.append("Exceeded time limits on execution for ");
        sb.append(bcjVar);
        bcjVar.toString();
        this.f2845g.execute(new baa(this, 0));
    }

    @Override // p000.ban
    /* JADX INFO: renamed from: e */
    public final void mo1720e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (bbu.m2189b((bcv) it.next()).equals(this.f2841c)) {
                this.f2845g.execute(new baa(this, 2));
                return;
            }
        }
    }

    @Override // p000.ban
    /* JADX INFO: renamed from: f */
    public final void mo1721f(List list) {
        this.f2845g.execute(new baa(this, 0));
    }
}
