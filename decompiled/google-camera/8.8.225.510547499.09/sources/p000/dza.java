package p000;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Set;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dza implements gyi {

    /* JADX INFO: renamed from: a */
    private static final nbh f12949a = nbh.m17259h("com/google/android/apps/camera/gallery/processing/ProcessingSessionManagerListener");

    /* JADX INFO: renamed from: b */
    private final dzr f12950b;

    /* JADX INFO: renamed from: c */
    private final hlp f12951c;

    /* JADX INFO: renamed from: d */
    private final Set f12952d = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: e */
    private final dyy f12953e;

    public dza(hlp hlpVar, dzr dzrVar, dyy dyyVar) {
        this.f12951c = hlpVar;
        this.f12950b = dzrVar;
        this.f12953e = dyyVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m6957a(gyu gyuVar) {
        this.f12952d.add(gyuVar);
        if (this.f12953e.m6953b(gyuVar).mo16813g()) {
            this.f12953e.m6955d(gyuVar).close();
        } else {
            ((nbe) ((nbe) f12949a.m17252c()).mo17276G((char) 1208)).mo17293r("Refusing to remove %s from processingMediaManager because it is not present. It's likely the mediaStoreInsertion future was canceled", gyuVar);
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final void mo3957j(gyu gyuVar) {
        m6957a(gyuVar);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final void mo3958k(gyu gyuVar) {
        if (this.f12952d.contains(gyuVar)) {
            return;
        }
        dyw dywVar = (dyw) this.f12953e.m6953b(gyuVar).mo16812f();
        if (dywVar == null) {
            ((nbe) ((nbe) f12949a.m17252c()).mo17276G((char) 1202)).mo17293r("#onSessionCaptureIndicatorUpdate Update for neither completed nor queued shot %s", gyuVar);
            return;
        }
        Bitmap bitmapM10449a = this.f12951c.m10449a(gyuVar);
        if (bitmapM10449a == null) {
            ((nbe) ((nbe) f12949a.m17251b()).mo17276G((char) 1201)).mo17293r("thumbnailBitmap not present for shot %s", gyuVar);
        } else {
            Integer numM10450b = this.f12951c.m10450b(gyuVar);
            dywVar.m6947d(bitmapM10449a, numM10450b != null ? numM10450b.intValue() : 0);
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final void mo3959l(gyu gyuVar) {
        m6957a(gyuVar);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo3960m(long j) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo3961n(Bitmap bitmap) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo3962o(Bitmap bitmap, int i) {
        jib.m13195D(this, bitmap);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: p */
    public final void mo3963p(gyu gyuVar, kbb kbbVar) {
        if (this.f12952d.contains(gyuVar)) {
            return;
        }
        dyw dywVar = (dyw) this.f12953e.m6953b(gyuVar).mo16812f();
        if (dywVar == null) {
            ((nbe) ((nbe) f12949a.m17252c()).mo17276G((char) 1205)).mo17293r("#onSessionProgress update for neither completed nor queued shot %s", gyuVar);
        } else {
            dywVar.m6948e(kbbVar);
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: q */
    public final void mo3964q(gyu gyuVar, gyp gypVar, gyx gyxVar) {
        this.f12953e.m6956e(gyuVar, new dyw(gypVar));
        if (gyxVar == gyx.MEDIA_STORE) {
            this.f12950b.mo6973b(gypVar.f26865a, (dzk) dzk.m6966c(gypVar.f26867c).mo16807a(mrm.m16829i(dzk.NONE)).mo16809c());
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo3965r(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final void mo3971x(gyu gyuVar) {
        m6957a(gyuVar);
    }
}
