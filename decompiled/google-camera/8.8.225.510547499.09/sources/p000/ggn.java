package p000;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggn implements ggm, fbp, fbn, fbo {

    /* JADX INFO: renamed from: a */
    public final kbz f24677a;

    /* JADX INFO: renamed from: b */
    public final kov f24678b;

    /* JADX INFO: renamed from: c */
    private final Activity f24679c;

    /* JADX INFO: renamed from: d */
    private final WindowManager f24680d;

    /* JADX INFO: renamed from: e */
    private final boolean f24681e;

    /* JADX INFO: renamed from: f */
    private final kbo f24682f;

    /* JADX INFO: renamed from: g */
    private final Executor f24683g;

    /* JADX INFO: renamed from: h */
    private final List f24684h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private final jvb f24685i;

    public ggn(Activity activity, kov kovVar, WindowManager windowManager, kbn kbnVar, cdu cduVar, Executor executor, kbz kbzVar) {
        this.f24679c = activity;
        this.f24685i = cduVar.m3529i();
        kovVar.getClass();
        this.f24678b = kovVar;
        this.f24680d = windowManager;
        this.f24683g = executor;
        this.f24677a = kbzVar;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int rotation = defaultDisplay.getRotation();
        kbc kbcVarM13901f = kbc.m13901f(point);
        kbcVarM13901f = (rotation == 1 || rotation == 3) ? kbcVarM13901f.m13910j() : kbcVarM13901f;
        this.f24681e = kbcVarM13901f.f35517a <= kbcVarM13901f.f35518b;
        this.f24682f = kbnVar.mo6314a("OrientMgrImpl");
    }

    @Override // p000.ggl
    /* JADX INFO: renamed from: a */
    public final void mo9213a(Class cls) {
        if (!this.f24684h.contains(cls)) {
            this.f24684h.add(cls);
        }
        this.f24682f.mo13940b("Lock orientation requests: " + this.f24684h.size());
        this.f24679c.setRequestedOrientation(14);
    }

    @Override // p000.ggl
    /* JADX INFO: renamed from: b */
    public final void mo9214b(Class cls) {
        this.f24682f.mo13940b("Try to unlock Orientation");
        this.f24684h.remove(cls);
        if (this.f24684h.isEmpty()) {
            this.f24682f.mo13940b("Orientation unlocked");
            this.f24679c.setRequestedOrientation(2);
            return;
        }
        this.f24682f.mo13947i("Can't unlock orientation now. Lock is held by " + this.f24684h.size() + " requests.");
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        dez.m6035e(this.f24685i, kxk.m14970P(new cnm(this, 3), this.f24683g));
    }

    @Override // p000.ggm
    /* JADX INFO: renamed from: c */
    public final kay mo9215c() {
        return this.f24678b.m14647a();
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        this.f24677a.mo13960d(zuAgeeF.ZrQ, new fzz(this.f24678b, 15));
    }

    @Override // p000.ggm
    /* JADX INFO: renamed from: f */
    public final kay mo9216f() {
        return kay.m13890c(this.f24680d.getDefaultDisplay());
    }

    @Override // p000.ggm
    /* JADX INFO: renamed from: g */
    public final void mo9217g(kos kosVar) {
        this.f24678b.m14648b(kosVar);
    }

    @Override // p000.ggm
    /* JADX INFO: renamed from: h */
    public final void mo9218h(kos kosVar) {
        this.f24678b.m14649c(kosVar);
    }

    @Override // p000.ggm
    /* JADX INFO: renamed from: i */
    public final boolean mo9219i() {
        return this.f24681e;
    }

    @Override // p000.ggm
    /* JADX INFO: renamed from: j */
    public final int mo9220j() {
        return ggi.m9209a(mo9215c(), this.f24681e);
    }

    @Override // p000.ggm
    /* JADX INFO: renamed from: k */
    public final void mo9221k(AmbientModeSupport.AmbientController ambientController) {
        kov kovVar = this.f24678b;
        synchronized (kovVar.f36716c) {
            if (kovVar.f36715b.contains(ambientController)) {
                return;
            }
            kovVar.f36715b.add(ambientController);
        }
    }

    @Override // p000.ggm
    /* JADX INFO: renamed from: l */
    public final void mo9222l(AmbientModeSupport.AmbientController ambientController) {
        kov kovVar = this.f24678b;
        synchronized (kovVar.f36716c) {
            if (!kovVar.f36715b.remove(ambientController)) {
                kovVar.f36719f.mo13946h("Removing non-existing raw listener.");
            }
        }
    }
}
