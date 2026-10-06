package p000;

import android.view.WindowManager;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed.RecordSpeedSlider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dah implements daj {

    /* JADX INFO: renamed from: c */
    public final BottomBarController f10250c;

    /* JADX INFO: renamed from: d */
    public final elx f10251d;

    /* JADX INFO: renamed from: e */
    public final eoq f10252e;

    /* JADX INFO: renamed from: f */
    public final jvd f10253f;

    /* JADX INFO: renamed from: g */
    public final icf f10254g;

    /* JADX INFO: renamed from: h */
    public final igb f10255h;

    /* JADX INFO: renamed from: i */
    public final WindowManager f10256i;

    /* JADX INFO: renamed from: j */
    public RecordSpeedSlider f10257j;

    /* JADX INFO: renamed from: l */
    public boolean f10259l;

    /* JADX INFO: renamed from: m */
    public int f10260m;

    /* JADX INFO: renamed from: n */
    public int f10261n;

    /* JADX INFO: renamed from: o */
    public final cdu f10262o;

    /* JADX INFO: renamed from: p */
    public AmbientModeSupport.AmbientController f10263p;

    /* JADX INFO: renamed from: q */
    public final jfs f10264q;

    /* JADX INFO: renamed from: s */
    private Optional f10266s;

    /* JADX INFO: renamed from: t */
    private int f10267t;

    /* JADX INFO: renamed from: a */
    public final ArrayList f10248a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f10249b = new AtomicInteger(-1);

    /* JADX INFO: renamed from: r */
    private final Set f10265r = new HashSet();

    /* JADX INFO: renamed from: k */
    public kba f10258k = cgw.f5696i;

    public dah(cdu cduVar, BottomBarController bottomBarController, elx elxVar, eoq eoqVar, jvd jvdVar, icf icfVar, igb igbVar, jfs jfsVar, WindowManager windowManager, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10262o = cduVar;
        this.f10250c = bottomBarController;
        this.f10251d = elxVar;
        this.f10252e = eoqVar;
        this.f10253f = jvdVar;
        this.f10254g = icfVar;
        this.f10255h = igbVar;
        this.f10264q = jfsVar;
        this.f10256i = windowManager;
    }

    /* JADX INFO: renamed from: q */
    private final void m5806q(int i) {
        if (this.f10257j.getChildAt(i) == null) {
            return;
        }
        this.f10257j.getChildAt(i).setVisibility(8);
    }

    /* JADX INFO: renamed from: r */
    private final void m5807r(int i) {
        Iterator it = this.f10265r.iterator();
        while (it.hasNext()) {
            ((dak) it.next()).mo5826a(i);
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m5808s(int i) {
        if (this.f10257j.getChildAt(i) == null) {
            return;
        }
        this.f10257j.getChildAt(i).setVisibility(0);
    }

    /* JADX INFO: renamed from: t */
    private final int m5809t() {
        ilk ilkVar = ilk.PORTRAIT;
        int i = this.f10267t;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return 1;
            case 1:
            default:
                return 0;
        }
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: a */
    public final void mo5810a(dak dakVar) {
        this.f10265r.add(dakVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m5811b() {
        this.f10250c.setClickable(false);
        this.f10254g.mo11013l(false);
        this.f10255h.mo11197E(false);
        this.f10252e.m7600g(2);
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: c */
    public final void mo5812c() {
        RecordSpeedSlider recordSpeedSlider = this.f10257j;
        if (recordSpeedSlider != null) {
            recordSpeedSlider.mo4074e();
        }
        AmbientModeSupport.AmbientController ambientController = this.f10263p;
        if (ambientController != null) {
            ((dab) ambientController.f1702a).f10211f.mo10992a();
        }
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: d */
    public final void mo5813d() {
        m5806q(this.f10260m);
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: e */
    public final void mo5814e() {
        this.f10257j.m4075f(this.f10260m);
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: f */
    public final void mo5815f() {
        int i = 1;
        mo5818i(true);
        RecordSpeedSlider recordSpeedSlider = this.f10257j;
        if (recordSpeedSlider == null || !recordSpeedSlider.mo4079j()) {
            return;
        }
        this.f10266s.ifPresent(new dco(this, i));
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: g */
    public final void mo5816g(dak dakVar) {
        this.f10265r.remove(dakVar);
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: h */
    public final void mo5817h(boolean z) {
        this.f10259l = z;
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: i */
    public final void mo5818i(boolean z) {
        RecordSpeedSlider recordSpeedSlider = this.f10257j;
        if (recordSpeedSlider == null) {
            return;
        }
        if (z) {
            recordSpeedSlider.mo4073d();
        } else {
            recordSpeedSlider.mo4072c();
        }
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: j */
    public final void mo5819j() {
        RecordSpeedSlider recordSpeedSlider = this.f10257j;
        if (recordSpeedSlider != null) {
            recordSpeedSlider.mo4077h();
        }
        AmbientModeSupport.AmbientController ambientController = this.f10263p;
        if (ambientController != null) {
            ((dab) ambientController.f1702a).f10211f.mo10992a();
            ((dab) ambientController.f1702a).f10211f.mo10995d();
        }
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: k */
    public final void mo5820k() {
        m5808s(this.f10260m);
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: l */
    public final void mo5821l() {
        m5806q(m5809t());
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: m */
    public final void mo5822m() {
        m5808s(m5809t());
    }

    /* JADX INFO: renamed from: n */
    public final void m5823n(int i, int i2) {
        if (!this.f10257j.m4078i()) {
            ilk ilkVar = ilk.PORTRAIT;
            switch (i - 1) {
                case 0:
                    m5807r(i2 - 1);
                    break;
                default:
                    m5807r(i2);
                    break;
            }
        }
        ilk ilkVar2 = ilk.PORTRAIT;
        switch (i - 1) {
            case 0:
                if (i2 > this.f10260m) {
                    m5807r(i2 - 1);
                }
                break;
            default:
                if (i2 < this.f10260m) {
                    m5807r(i2);
                }
                break;
        }
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: o */
    public final void mo5824o(mty mtyVar, ibm ibmVar, int i, int i2, int i3, boolean z, int i4, Optional optional) {
        this.f10257j = (RecordSpeedSlider) ibmVar;
        mo5818i(false);
        this.f10260m = i != 1 ? mtyVar.mo16913r().size() : 0;
        this.f10259l = true;
        this.f10248a.clear();
        this.f10267t = i;
        this.f10266s = optional;
        if (i == 1) {
            i2++;
        }
        this.f10261n = i2;
        if (this.f10249b.get() == -1) {
            this.f10249b.set(this.f10261n);
        }
        this.f10257j.getLayoutParams().width = i4;
        this.f10257j.addOnLayoutChangeListener(new dag(this, i4, mtyVar, i, i3, z));
    }

    @Override // p000.daj
    /* JADX INFO: renamed from: p */
    public final void mo5825p(AmbientModeSupport.AmbientController ambientController) {
        this.f10263p = ambientController;
    }
}
