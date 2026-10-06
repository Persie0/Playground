package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffh implements gyi {

    /* JADX INFO: renamed from: c */
    public final mrm f21617c;

    /* JADX INFO: renamed from: f */
    private final iid f21620f;

    /* JADX INFO: renamed from: g */
    private final Resources f21621g;

    /* JADX INFO: renamed from: h */
    private final elx f21622h;

    /* JADX INFO: renamed from: i */
    private final gxa f21623i;

    /* JADX INFO: renamed from: j */
    private final ScheduledExecutorService f21624j;

    /* JADX INFO: renamed from: l */
    private final jfs f21626l;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f21615a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f21625k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f21616b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public kba f21618d = cgw.f5700m;

    /* JADX INFO: renamed from: e */
    public final hgp f21619e = new ffg(this);

    public ffh(iid iidVar, Resources resources, jfs jfsVar, elx elxVar, ScheduledExecutorService scheduledExecutorService, gxa gxaVar, mrm mrmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21620f = iidVar;
        this.f21621g = resources;
        this.f21626l = jfsVar;
        this.f21623i = gxaVar;
        this.f21622h = elxVar;
        this.f21624j = scheduledExecutorService;
        this.f21617c = mrmVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized kba m8335a() {
        kba kbaVarMo11297a;
        if (this.f21625k.compareAndSet(true, false) && this.f21626l.m13088X("long_press_photos_edu") == 0) {
            float thumbnailFinalDiameter = this.f21620f.f31069f.getThumbnailButton().getThumbnailFinalDiameter();
            float dimensionPixelSize = this.f21621g.getDimensionPixelSize(C0100R.dimen.long_press_tooltip_above_thumbnail);
            igt igtVar = new igt(icp.f30366b);
            igtVar.m11299c(this.f21620f.f31069f.getThumbnailButton(), (int) ((-(thumbnailFinalDiameter / 2.0f)) + dimensionPixelSize));
            igtVar.mo11305i();
            igtVar.mo11307k();
            igtVar.mo11309m();
            igtVar.mo11310n();
            igtVar.f30869d = 200;
            igtVar.f30870e = 30000;
            igtVar.mo11300d(new fff(this, 0));
            igtVar.mo11308l();
            igtVar.f30872g = true;
            igtVar.f30873h = false;
            igtVar.f30866a.add(new igp(new fdo(this, 6), this.f21624j, TimeUnit.MILLISECONDS.convert(1L, TimeUnit.SECONDS)));
            igtVar.f30874i = this.f21622h;
            igtVar.f30878m = 4;
            igtVar.f30871f = false;
            kbaVarMo11297a = igtVar.mo11297a();
        } else {
            kbaVarMo11297a = cgw.f5701n;
        }
        return kbaVarMo11297a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8336b() {
        this.f21626l.m13091aa("long_press_photos_edu", this.f21626l.m13088X("long_press_photos_edu") + 1);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo3957j(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3958k(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final void mo3959l(gyu gyuVar) {
        this.f21625k.set(((Boolean) mrm.m16828h(this.f21623i.mo9921a(gyuVar)).mo16808b(ddu.f10602s).mo16811e(false)).booleanValue());
        if (this.f21615a.get()) {
            return;
        }
        this.f21618d = m8335a();
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
    public final /* synthetic */ void mo3963p(gyu gyuVar, kbb kbbVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo3964q(gyu gyuVar, gyp gypVar, gyx gyxVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo3965r(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void mo3971x(gyu gyuVar) {
    }
}
