package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.KeyEvent;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eoq implements fbp, fbn, fbl, fbo, ezv, ezw {

    /* JADX INFO: renamed from: a */
    public static final nbh f14891a = nbh.m17259h("com/google/android/apps/camera/keycontrol/KeyController");

    /* JADX INFO: renamed from: d */
    public final fcp f14894d;

    /* JADX INFO: renamed from: f */
    public int f14896f;

    /* JADX INFO: renamed from: g */
    private final hbm f14897g;

    /* JADX INFO: renamed from: h */
    private final mtz f14898h;

    /* JADX INFO: renamed from: i */
    private final jww f14899i;

    /* JADX INFO: renamed from: j */
    private final jww f14900j;

    /* JADX INFO: renamed from: k */
    private final jww f14901k;

    /* JADX INFO: renamed from: l */
    private final jww f14902l;

    /* JADX INFO: renamed from: m */
    private final jww f14903m;

    /* JADX INFO: renamed from: n */
    private final jww f14904n;

    /* JADX INFO: renamed from: o */
    private final dhv f14905o;

    /* JADX INFO: renamed from: p */
    private final Executor f14906p;

    /* JADX INFO: renamed from: q */
    private final amp f14907q;

    /* JADX INFO: renamed from: r */
    private boolean f14908r;

    /* JADX INFO: renamed from: b */
    public final Set f14892b = mpw.m16749A();

    /* JADX INFO: renamed from: c */
    public final Set f14893c = mpw.m16749A();

    /* JADX INFO: renamed from: e */
    public final Object f14895e = new Object();

    /* JADX INFO: renamed from: s */
    private final BroadcastReceiver f14909s = new eoo(this);

    public eoq(hbm hbmVar, Context context, mtz mtzVar, jww jwwVar, jww jwwVar2, jww jwwVar3, jww jwwVar4, jww jwwVar5, jww jwwVar6, dhv dhvVar, fcp fcpVar, Executor executor) {
        this.f14897g = hbmVar;
        this.f14899i = jwwVar;
        this.f14900j = jwwVar2;
        this.f14901k = jwwVar3;
        this.f14902l = jwwVar4;
        this.f14903m = jwwVar5;
        this.f14904n = jwwVar6;
        this.f14905o = dhvVar;
        this.f14898h = mtzVar;
        this.f14894d = fcpVar;
        this.f14906p = executor;
        this.f14907q = amp.m961a(context);
    }

    /* JADX INFO: renamed from: j */
    private final boolean m7596j(int i, boolean z) {
        eom eomVar = eom.SHUTTER;
        hbl hblVar = hbl.SHUTTER;
        boolean z2 = false;
        switch ((hbl) this.f14897g.mo3831be()) {
            case SHUTTER:
                synchronized (this.f14895e) {
                    Iterator it = this.f14892b.iterator();
                    while (it.hasNext()) {
                        ((eop) it.next()).mo5224d(z);
                        z2 = true;
                    }
                    break;
                }
                return z2;
            case ZOOM:
                if (i != 25) {
                    synchronized (this.f14895e) {
                        Iterator it2 = this.f14892b.iterator();
                        while (it2.hasNext()) {
                            ((eop) it2.next()).mo5225e(z);
                        }
                        break;
                    }
                } else {
                    synchronized (this.f14895e) {
                        Iterator it3 = this.f14892b.iterator();
                        while (it3.hasNext()) {
                            ((eop) it3.next()).mo5226f(z);
                        }
                        break;
                    }
                }
                return true;
            case VOLUME:
                return false;
            case OFF:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7597a(eop eopVar) {
        this.f14906p.execute(new ekr(this, eopVar, 9));
    }

    /* JADX INFO: renamed from: b */
    public final void m7598b(eop eopVar) {
        this.f14906p.execute(new ekr(this, eopVar, 10));
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f14898h.mo16883k((Integer) this.f14899i.mo3831be(), eom.SHUTTER);
        this.f14898h.mo16883k((Integer) this.f14900j.mo3831be(), eom.ZOOM_IN);
        this.f14898h.mo16883k((Integer) this.f14901k.mo3831be(), eom.ZOOM_OUT);
        this.f14898h.mo16883k((Integer) this.f14902l.mo3831be(), eom.SWITCH_CAMERA);
        this.f14898h.mo16883k((Integer) this.f14903m.mo3831be(), eom.NEXT_MODE);
        this.f14898h.mo16883k((Integer) this.f14904n.mo3831be(), eom.PREV_MODE);
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        this.f14907q.m962b(this.f14909s, new IntentFilter(EArqVBjecl.bjPCrHgL));
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        this.f14907q.m963c(this.f14909s);
    }

    @Override // p000.ezv
    /* JADX INFO: renamed from: f */
    public final boolean mo7599f(int i, KeyEvent keyEvent) {
        if (i == 22) {
            m7601h(true);
            return true;
        }
        dhv dhvVar = this.f14905o;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        if (this.f14896f == 3) {
            return false;
        }
        if (keyEvent.getRepeatCount() == 0) {
            this.f14908r = false;
        }
        if (this.f14896f == 2 || this.f14908r) {
            return true;
        }
        if (i == 24 || i == 25 || i == 27) {
            return m7596j(i, true);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m7600g(int i) {
        this.f14896f = i;
        this.f14908r = (i == 2) | this.f14908r;
    }

    /* JADX INFO: renamed from: h */
    public final void m7601h(boolean z) {
        synchronized (this.f14895e) {
            Iterator it = this.f14892b.iterator();
            while (it.hasNext()) {
                ((eop) it.next()).mo5221a(z);
            }
        }
    }

    @Override // p000.ezw
    /* JADX INFO: renamed from: i */
    public final boolean mo7602i(int i) {
        if (i == 22) {
            m7601h(false);
            return true;
        }
        dhv dhvVar = this.f14905o;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        int i2 = this.f14896f;
        if (i2 == 3) {
            return false;
        }
        if (i2 == 2 || this.f14908r) {
            return true;
        }
        if (i == 24 || i == 25 || i == 27) {
            return m7596j(i, false);
        }
        return false;
    }
}
