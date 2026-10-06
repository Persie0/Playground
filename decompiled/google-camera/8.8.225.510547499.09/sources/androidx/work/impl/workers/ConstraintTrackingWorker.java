package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.List;
import p000.ayb;
import p000.ayc;
import p000.baa;
import p000.ban;
import p000.bev;
import p000.bez;
import p000.nps;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends ayb implements ban {

    /* JADX INFO: renamed from: a */
    public final WorkerParameters f1823a;

    /* JADX INFO: renamed from: b */
    public final Object f1824b;

    /* JADX INFO: renamed from: g */
    public volatile boolean f1825g;

    /* JADX INFO: renamed from: h */
    public ayb f1826h;

    /* JADX INFO: renamed from: i */
    public final bev f1827i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f1823a = workerParameters;
        this.f1824b = new Object();
        this.f1827i = bev.m2275g();
    }

    @Override // p000.ayb
    /* JADX INFO: renamed from: a */
    public final nps mo1695a() {
        m2097g().execute(new baa(this, 3));
        return this.f1827i;
    }

    @Override // p000.ayb
    /* JADX INFO: renamed from: c */
    public final void mo1697c() {
        ayb aybVar = this.f1826h;
        if (aybVar == null || aybVar.f2707e) {
            return;
        }
        aybVar.m2098h();
    }

    @Override // p000.ban
    /* JADX INFO: renamed from: e */
    public final void mo1720e(List list) {
    }

    @Override // p000.ban
    /* JADX INFO: renamed from: f */
    public final void mo1721f(List list) {
        ayc.m2099a();
        String str = bez.f3077a;
        StringBuilder sb = new StringBuilder();
        sb.append("Constraints changed for ");
        sb.append(list);
        list.toString();
        synchronized (this.f1824b) {
            this.f1825g = true;
        }
    }
}
