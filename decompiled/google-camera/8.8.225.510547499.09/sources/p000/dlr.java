package p000;

import android.content.Context;
import android.os.Trace;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dlr implements hjk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f11988a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f11989b;

    public /* synthetic */ dlr(dlw dlwVar, int i) {
        this.f11989b = i;
        this.f11988a = dlwVar;
    }

    public /* synthetic */ dlr(gtd gtdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f11989b = i;
        this.f11988a = gtdVar;
    }

    public /* synthetic */ dlr(hjk hjkVar, int i) {
        this.f11989b = i;
        this.f11988a = hjkVar;
    }

    public /* synthetic */ dlr(hrh hrhVar, int i) {
        this.f11989b = i;
        this.f11988a = hrhVar;
    }

    public /* synthetic */ dlr(Runnable runnable, int i) {
        this.f11989b = i;
        this.f11988a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [hrh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11989b) {
            case 0:
                ?? r0 = this.f11988a;
                Trace.beginSection("ShotTracker#checkForLostShots");
                r0.mo6354b();
                Trace.endSection();
                return;
            case 1:
                this.f11988a.run();
                return;
            case 2:
                this.f11988a.run();
                return;
            case 3:
                gtd gtdVar = (gtd) this.f11988a;
                if (gtdVar.m9749n()) {
                    gtd.m9734o((Context) gtdVar.f26335b);
                    return;
                }
                return;
            case 4:
                ?? r1 = this.f11988a;
                kba kbaVarM6062g = dfm.m6062g();
                try {
                    r1.run();
                    kbaVarM6062g.close();
                    return;
                } catch (Throwable th) {
                    try {
                        kbaVarM6062g.close();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    throw th;
                }
            case 5:
                this.f11988a.run();
                return;
            default:
                this.f11988a.mo10651a();
                return;
        }
    }
}
