package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bek implements Runnable {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f3037a;

    /* JADX INFO: renamed from: b */
    private final Object f3038b;

    /* JADX INFO: renamed from: c */
    private final Object f3039c;

    public bek(Activity activity, ceb cebVar, int i) {
        this.f3037a = i;
        this.f3038b = cebVar;
        this.f3039c = activity;
    }

    public bek(beb bebVar, Runnable runnable, int i) {
        this.f3037a = i;
        this.f3039c = bebVar;
        this.f3038b = runnable;
    }

    public bek(bel belVar, bcj bcjVar, int i) {
        this.f3037a = i;
        this.f3038b = belVar;
        this.f3039c = bcjVar;
    }

    public bek(fao faoVar, fbp fbpVar, int i) {
        this.f3037a = i;
        this.f3039c = faoVar;
        this.f3038b = fbpVar;
    }

    public bek(fba fbaVar, fbp fbpVar, int i) {
        this.f3037a = i;
        this.f3039c = fbaVar;
        this.f3038b = fbpVar;
    }

    public bek(Runnable runnable, Executor executor, int i) {
        this.f3037a = i;
        this.f3038b = executor;
        this.f3039c = runnable;
    }

    public bek(nps npsVar, opx opxVar, int i) {
        this.f3037a = i;
        this.f3039c = npsVar;
        this.f3038b = opxVar;
    }

    public bek(oqo oqoVar, opx opxVar, int i) {
        this.f3037a = i;
        this.f3038b = oqoVar;
        this.f3039c = opxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [ceb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, opx] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, ols] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, opx] */
    /* JADX WARN: Type inference failed for: r1v15, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ols] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3037a) {
            case 0:
                synchronized (((bel) this.f3038b).f3042c) {
                    if (((bek) ((bel) this.f3038b).f3040a.remove(this.f3039c)) != null) {
                        bej bejVar = (bej) ((bel) this.f3038b).f3041b.remove(this.f3039c);
                        if (bejVar != null) {
                            bejVar.mo2152b((bcj) this.f3039c);
                        }
                    } else {
                        ayc.m2099a();
                        String.format("Timer with %s is already marked as complete.", this.f3039c);
                    }
                    break;
                }
                return;
            case 1:
                try {
                    this.f3038b.run();
                    synchronized (((beb) this.f3039c).f3021b) {
                        ((beb) this.f3039c).m2263a();
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (((beb) this.f3039c).f3021b) {
                        ((beb) this.f3039c).m2263a();
                        throw th;
                    }
                }
            case 2:
                ((fao) this.f3039c).m8083g(this.f3038b);
                return;
            case 3:
                ((fba) this.f3039c).m8097e(this.f3038b);
                return;
            case 4:
                if (this.f3038b.mo3541b()) {
                    return;
                }
                Intent intent = ((Activity) this.f3039c).getIntent();
                int i = cds.f5326a;
                if (("android.intent.action.MAIN".equals(intent.getAction()) && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER")) || cds.m3514m(((Activity) this.f3039c).getIntent().getAction())) {
                    lmk lmkVar = lmk.f38672a;
                    Object obj = this.f3039c;
                    if (lij.m15455y() && lmkVar.f38681j == 0) {
                        lmkVar.f38681j = SystemClock.elapsedRealtime();
                        lmk.m15730a("Primes-tti-end-and-length-ms", lmkVar.f38681j);
                        lmkVar.f38683l.f38671k = true;
                        try {
                            ((Activity) obj).reportFullyDrawn();
                            return;
                        } catch (RuntimeException e) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                this.f3038b.execute(this.f3039c);
                return;
            case 6:
                this.f3039c.mo18872c((oqo) this.f3038b, oki.f46196a);
                return;
            default:
                if (this.f3039c.isCancelled()) {
                    this.f3038b.mo18876k(null);
                    return;
                }
                try {
                    this.f3038b.mo18640e(ntw.m17727m(this.f3039c));
                    return;
                } catch (ExecutionException e2) {
                    this.f3038b.mo18640e(lkm.m15591r(lku.m15645an(e2)));
                    return;
                }
        }
    }
}
