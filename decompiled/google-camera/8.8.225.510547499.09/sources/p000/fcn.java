package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fco f21264a;

    /* JADX INFO: renamed from: b */
    private final Future f21265b;

    /* JADX INFO: renamed from: c */
    private long f21266c;

    /* JADX INFO: renamed from: e */
    private String f21268e;

    /* JADX INFO: renamed from: d */
    private long f21267d = 0;

    /* JADX INFO: renamed from: f */
    private final List f21269f = new ArrayList();

    public fcn(fco fcoVar) {
        this.f21264a = fcoVar;
        this.f21266c = 0L;
        this.f21265b = fcoVar.f21273d.schedule(new evu(this, 15), 60L, TimeUnit.SECONDS);
        this.f21266c = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8122a() {
        long jElapsedRealtime;
        this.f21265b.cancel(true);
        synchronized (this) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.f21266c;
        }
        if (jElapsedRealtime > fco.f21270a) {
            this.f21264a.f21272c.mo8127B(jElapsedRealtime, this.f21269f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8123b() {
        m8124c(true);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8124c(boolean z) {
        List list = this.f21269f;
        nxl nxlVarM18137O = nln.f43552e.m18137O();
        String str = this.f21268e;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nln nlnVar = (nln) nxlVarM18137O.f44974b;
        str.getClass();
        nlnVar.f43554a |= 2;
        nlnVar.f43556c = str;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f21267d;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nln nlnVar2 = (nln) nxqVar;
        nlnVar2.f43554a |= 1;
        nlnVar2.f43555b = jElapsedRealtime;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nln nlnVar3 = (nln) nxlVarM18137O.f44974b;
        nlnVar3.f43554a |= 4;
        nlnVar3.f43557d = z;
        list.add((nln) nxlVarM18137O.mo18103l());
        if (z) {
            this.f21264a.f21271b.mo13940b("Task is complete:".concat(String.valueOf(this.f21268e)));
        } else {
            this.f21264a.f21271b.mo13947i("Task seems stuck:".concat(String.valueOf(this.f21268e)));
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8125d(String str) {
        this.f21264a.f21271b.mo13940b("Task started:".concat(str));
        this.f21267d = SystemClock.elapsedRealtime();
        this.f21268e = str;
    }
}
