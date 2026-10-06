package p000;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llz extends lle implements lhv, ljh {

    /* JADX INFO: renamed from: a */
    public final ohb f38635a;

    /* JADX INFO: renamed from: b */
    public final mbl f38636b;

    /* JADX INFO: renamed from: c */
    private final npv f38637c;

    /* JADX INFO: renamed from: d */
    private final Object f38638d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f38639e;

    /* JADX INFO: renamed from: f */
    private final AtomicInteger f38640f;

    public llz(ljf ljfVar, Context context, lhz lhzVar, npv npvVar, ohb ohbVar, ohb ohbVar2, oju ojuVar, Executor executor) {
        super((byte[]) null);
        this.f38638d = new Object();
        this.f38639e = new ArrayList(0);
        this.f38640f = new AtomicInteger();
        this.f38636b = ljfVar.m15526b(executor, ohbVar, ojuVar);
        this.f38637c = npvVar;
        this.f38635a = ohbVar2;
        lhzVar.m15360a(this);
    }

    /* JADX INFO: renamed from: a */
    public final nps m15714a() {
        llx[] llxVarArr;
        if (this.f38640f.get() > 0) {
            return kxk.m14967M(new cnm(this, 11), 1L, TimeUnit.SECONDS, this.f38637c);
        }
        synchronized (this.f38638d) {
            if (this.f38639e.isEmpty()) {
                llxVarArr = null;
            } else {
                ArrayList arrayList = this.f38639e;
                llxVarArr = (llx[]) arrayList.toArray(new llx[arrayList.size()]);
                this.f38639e.clear();
            }
        }
        return llxVarArr == null ? npp.f44031a : kxk.m14970P(new cnn(this, llxVarArr, 7), this.f38637c);
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public final /* synthetic */ void mo15463ao() {
    }

    @Override // p000.lhv
    /* JADX INFO: renamed from: d */
    public final void mo15356d(Activity activity) {
        m15714a();
    }
}
