package p000;

import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grz {

    /* JADX INFO: renamed from: a */
    public final Object f26197a;

    /* JADX INFO: renamed from: b */
    public int f26198b;

    /* JADX INFO: renamed from: c */
    public final Object f26199c;

    /* JADX INFO: renamed from: d */
    public final Object f26200d;

    public grz(kbz kbzVar, ScheduledExecutorService scheduledExecutorService) {
        this.f26198b = 0;
        this.f26200d = new ArrayList();
        kce kceVarMo13958b = kbzVar.mo13958b("InteractivityReadinessLatch");
        this.f26197a = kceVarMo13958b;
        this.f26199c = scheduledExecutorService;
        kceVarMo13958b.mo13955c(this.f26198b);
    }

    /* JADX INFO: renamed from: a */
    public static final void m9692a() {
        lku.m15670x(true, "Size was < 0.");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final synchronized ckg m9693b(Executor executor) {
        ckg ckgVar;
        ckgVar = new ckg(executor);
        if (this.f26198b > 0) {
            ckgVar.m3836a();
        }
        this.f26200d.add(ckgVar);
        return ckgVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kce] */
    /* JADX INFO: renamed from: c */
    public final synchronized kba m9694c() {
        int i = this.f26198b + 1;
        this.f26198b = i;
        this.f26197a.mo13955c(i);
        if (this.f26198b == 1) {
            Iterator it = this.f26200d.iterator();
            while (it.hasNext()) {
                ((ckg) it.next()).m3836a();
            }
        }
        return new ckd(this, null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kce] */
    /* JADX INFO: renamed from: d */
    public final synchronized void m9695d() {
        int i = this.f26198b - 1;
        this.f26198b = i;
        this.f26197a.mo13955c(i);
        lku.m15613H(this.f26198b >= 0);
        if (this.f26198b == 0) {
            Iterator it = this.f26200d.iterator();
            while (it.hasNext()) {
                ((ckg) it.next()).m3837b();
            }
        }
    }

    public grz() {
        lku.m15670x(true, rmwTRjObXLGH.mbKQfnra);
        this.f26197a = new Object();
        this.f26199c = new LinkedList();
        this.f26200d = new HashMap();
    }
}
