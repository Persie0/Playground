package p000;

import android.app.Activity;
import android.view.Display;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmz {

    /* JADX INFO: renamed from: d */
    private static final nbh f22753d = nbh.m17259h("com/google/android/apps/camera/modules/common/AspectRatioHelper");

    /* JADX INFO: renamed from: a */
    public final jwn f22754a;

    /* JADX INFO: renamed from: b */
    public final dbr f22755b;

    /* JADX INFO: renamed from: c */
    public final jww f22756c = new jwf(false);

    /* JADX INFO: renamed from: e */
    private final boolean f22757e;

    /* JADX INFO: renamed from: f */
    private final hah f22758f;

    /* JADX INFO: renamed from: g */
    private final Activity f22759g;

    /* JADX INFO: renamed from: h */
    private final dhv f22760h;

    /* JADX INFO: renamed from: i */
    private final fve f22761i;

    /* JADX INFO: renamed from: j */
    private final kme f22762j;

    public fmz(Activity activity, cdu cduVar, dbr dbrVar, dhv dhvVar, hah hahVar, jwn jwnVar, jwn jwnVar2, fve fveVar, kme kmeVar, jwn jwnVar3) {
        boolean zMo6184l = dhvVar.mo6184l(dib.f11311bR);
        this.f22757e = zMo6184l;
        this.f22758f = hahVar;
        this.f22754a = jwnVar;
        this.f22759g = activity;
        this.f22755b = dbrVar;
        this.f22760h = dhvVar;
        this.f22761i = fveVar;
        this.f22762j = kmeVar;
        if (zMo6184l) {
            cduVar.m3529i().m13537d(jwnVar2.mo3830a(new euz(this, 19), not.INSTANCE));
            cduVar.m3529i().m13537d(jwnVar.mo3830a(new ecr(this, jwnVar2, 9), not.INSTANCE));
            cduVar.m3529i().m13537d(jwnVar3.mo3830a(new ecr(this, jwnVar2, 10), not.INSTANCE));
        }
    }

    /* JADX INFO: renamed from: e */
    private final int m8596e(kmq kmqVar) {
        kmg kmgVarMo13858e = this.f22762j.mo13858e(kmqVar);
        if (kmgVarMo13858e != null) {
            return gls.m9446h(kmgVarMo13858e, this.f22762j, this.f22761i, this.f22760h).mo14553f();
        }
        ((nbe) ((nbe) f22753d.m17252c()).mo17276G((char) 2375)).mo17293r("Can't find camera ID with facing %s", kmqVar);
        return 90;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8597a(hyd hydVar, int i) {
        if (!this.f22757e || this.f22759g.isInMultiWindowMode()) {
            return false;
        }
        if (hydVar.f29901a == hye.UNKNOWN && this.f22759g.getDisplay() != null) {
            Activity activity = this.f22759g;
            Display display = activity.getDisplay();
            display.getClass();
            return jpd.m13429j(activity, display, null, null, null, null) == hzj.STARFISH_LAYOUT && i % 180 == 90;
        }
        hye hyeVar = hydVar.f29901a;
        int i2 = i % 180;
        if (hyeVar == hye.JARVIS) {
            return i2 == 0;
        }
        return i2 == 90 && hyeVar == hye.FLAT;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8598b() {
        if (this.f22757e) {
            return m8597a((hyd) this.f22754a.mo3831be(), m8596e(this.f22755b.mo5895d())) && jib.m13193B(((Integer) this.f22758f.mo10031c(gzy.f27047f)).intValue()) == 2;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8599c(kmq kmqVar) {
        return kmqVar == kmq.f36557a && ((hyd) this.f22754a.mo3831be()).f29901a == hye.FLAT;
    }

    /* JADX INFO: renamed from: d */
    public final int m8600d(kmq kmqVar) {
        if (!this.f22757e) {
            return inr.m11541m(((Integer) this.f22758f.mo10031c(gzy.f27046e)).intValue());
        }
        if (m8597a((hyd) this.f22754a.mo3831be(), m8596e(kmqVar))) {
            return inr.m11541m(((Integer) this.f22758f.mo10031c(gzy.f27048g)).intValue());
        }
        if (m8599c(kmqVar)) {
            return 2;
        }
        return inr.m11541m(((Integer) this.f22758f.mo10031c(gzy.f27046e)).intValue());
    }
}
