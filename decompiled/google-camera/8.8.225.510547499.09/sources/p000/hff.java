package p000;

import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hff implements hfo {

    /* JADX INFO: renamed from: a */
    public final ActivityC0157ei f27535a;

    /* JADX INFO: renamed from: b */
    protected final msi f27536b;

    /* JADX INFO: renamed from: c */
    protected final int f27537c;

    /* JADX INFO: renamed from: d */
    protected final WindowManager f27538d;

    /* JADX INFO: renamed from: e */
    protected final hmy f27539e;

    /* JADX INFO: renamed from: f */
    public final Rect f27540f = new Rect();

    /* JADX INFO: renamed from: g */
    public FrameLayout f27541g;

    /* JADX INFO: renamed from: h */
    public ViewGroup f27542h;

    /* JADX INFO: renamed from: i */
    public View f27543i;

    /* JADX INFO: renamed from: j */
    private chp f27544j;

    /* JADX INFO: renamed from: k */
    private ilk f27545k;

    public hff(ActivityC0157ei activityC0157ei, hmy hmyVar, msi msiVar, WindowManager windowManager) {
        this.f27535a = activityC0157ei;
        this.f27539e = hmyVar;
        this.f27536b = msiVar;
        this.f27538d = windowManager;
        this.f27537c = activityC0157ei.getResources().getInteger(C0100R.integer.social_anim_duration_default);
    }

    /* JADX INFO: renamed from: h */
    private final mrm m10181h(chp chpVar, msi msiVar) {
        kan kanVarM13871g = kan.m13871g(chpVar.mo3733b().mo3745e());
        if (kan.f35486a.m13883m(kanVarM13871g) || kan.f35486a.m13884n(kanVarM13871g)) {
            return m10184a(kan.f35486a, msiVar);
        }
        return (kan.f35487b.m13883m(kanVarM13871g) || kan.f35487b.m13884n(kanVarM13871g)) ? m10184a(kan.f35487b, msiVar) : mqu.f41450a;
    }

    /* JADX INFO: renamed from: i */
    private final void m10182i() {
        View view = this.f27543i;
        view.getClass();
        view.setPadding(this.f27540f.left, this.f27540f.top, this.f27540f.right, this.f27540f.bottom);
    }

    /* JADX INFO: renamed from: j */
    private final void m10183j(mrm mrmVar) {
        if (!mrmVar.mo16813g()) {
            this.f27540f.setEmpty();
            return;
        }
        Rect rect = ((hzm) mrmVar.mo16809c()).f30047k;
        Rect rect2 = ((hzm) mrmVar.mo16809c()).f30041e;
        if (ilk.LANDSCAPE.equals(this.f27545k)) {
            this.f27540f.set(rect2.left, 0, (rect.width() - rect2.width()) - rect2.left, 0);
            return;
        }
        if (ilk.REVERSE_LANDSCAPE.equals(this.f27545k)) {
            int i = rect.right - rect2.right;
            this.f27540f.set((rect.width() - rect2.width()) - i, 0, i, 0);
        } else {
            hzj hzjVar = ((hzp) this.f27536b.mo6051a()).f30074a.f30073i;
            if (hzjVar.equals(hzj.PHONE_LAYOUT) || hzjVar.equals(hzj.SIMPLIFIED_LAYOUT)) {
                this.f27540f.set(0, rect2.top, 0, (rect.height() - rect2.height()) - rect2.top);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final mrm m10184a(kan kanVar, msi msiVar) {
        Size size;
        boolean z = true;
        if (!kan.f35486a.m13883m(kanVar) && !kan.f35487b.m13883m(kanVar)) {
            z = false;
        }
        lku.m15613H(z);
        hzp hzpVar = (hzp) this.f27536b.mo6051a();
        hzo hzoVar = hzpVar.f30074a;
        Size size2 = hzoVar.f30066b;
        if (size2 == null) {
            return mqu.f41450a;
        }
        Size size3 = hzoVar.f30068d;
        kan kanVarM13872i = size3 == null ? null : kan.m13872i(size3);
        if (kanVarM13872i != null && kanVarM13872i.m13883m(kanVar)) {
            return mrm.m16829i(hzpVar.f30075b);
        }
        if (ilk.LANDSCAPE.equals(hzoVar.f30071g) || ilk.REVERSE_LANDSCAPE.equals(hzoVar.f30071g)) {
            size = new Size((int) ((size2.getHeight() * kanVar.f35489d) / kanVar.f35490e), size2.getHeight());
        } else {
            size = new Size(size2.getWidth(), (int) kanVar.m13876b(size2.getWidth()));
        }
        hzn hznVarM10948b = hzoVar.m10948b();
        hznVarM10948b.f30057b = size;
        return mrm.m16829i(hzk.m10916d(hznVarM10948b.m10941a(), jpd.m13432m(this.f27535a, this.f27538d.getDefaultDisplay()), this.f27535a, this.f27539e, msiVar));
    }

    /* JADX INFO: renamed from: b */
    protected final void m10185b() {
        C0111cq c0111cqM3206bA = this.f27535a.m3206bA();
        ComponentCallbacksC0077bw componentCallbacksC0077bwM5325e = c0111cqM3206bA.m5325e("VIDEO_PLAYER_TAG");
        if (componentCallbacksC0077bwM5325e != null) {
            AbstractC0118cx abstractC0118cxM5327i = c0111cqM3206bA.m5327i();
            abstractC0118cxM5327i.mo2024k(componentCallbacksC0077bwM5325e);
            abstractC0118cxM5327i.mo2015b();
        }
    }

    @Override // p000.hfo
    /* JADX INFO: renamed from: c */
    public final void mo10186c(boolean z) {
        m10185b();
        FrameLayout frameLayout = this.f27541g;
        frameLayout.getClass();
        bnp bnpVar = new bnp(this, z, 15);
        frameLayout.animate().cancel();
        if (frameLayout.getAlpha() != 0.0f || frameLayout.getVisibility() != 8) {
            if (z) {
                frameLayout.animate().alpha(0.0f).setDuration((int) (this.f27537c * frameLayout.getAlpha())).withEndAction(new hea(frameLayout, bnpVar, 9)).start();
            } else {
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                bnpVar.run();
            }
        }
        this.f27544j = null;
    }

    @Override // p000.hfo
    /* JADX INFO: renamed from: d */
    public final void mo10187d(View view) {
        View viewFindViewById = view.findViewById(C0100R.id.social_root_background);
        View viewFindViewById2 = view.findViewById(C0100R.id.social_preview_container);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        FrameLayout frameLayout = (FrameLayout) ((ViewGroup) view.getParent()).findViewById(C0100R.id.social_preview_container2);
        this.f27541g = frameLayout;
        this.f27542h = (ViewGroup) frameLayout.findViewById(C0100R.id.social_preview_video_container);
    }

    @Override // p000.hfo
    /* JADX INFO: renamed from: e */
    public final void mo10188e(ilk ilkVar) {
        this.f27545k = ilkVar;
        chp chpVar = this.f27544j;
        if (chpVar != null) {
            FrameLayout frameLayout = this.f27541g;
            frameLayout.getClass();
            m10183j(m10181h(chpVar, new dfg(frameLayout, 3)));
            m10182i();
            ComponentCallbacksC0077bw componentCallbacksC0077bwM5325e = this.f27535a.m3206bA().m5325e("VIDEO_PLAYER_TAG");
            if (componentCallbacksC0077bwM5325e instanceof ioa) {
                ((ioa) componentCallbacksC0077bwM5325e).f31625a.m11577d(this.f27540f);
            }
        }
    }

    @Override // p000.hfo
    /* JADX INFO: renamed from: f */
    public final void mo10189f(View.OnTouchListener onTouchListener) {
        FrameLayout frameLayout = this.f27541g;
        frameLayout.getClass();
        frameLayout.setOnTouchListener(onTouchListener);
    }

    @Override // p000.hfo
    /* JADX INFO: renamed from: g */
    public final void mo10190g(chp chpVar) {
        chp chpVar2 = this.f27544j;
        boolean z = true;
        if (chpVar2 != null && !chpVar.equals(chpVar2)) {
            z = false;
        }
        lku.m15613H(z);
        if (chpVar.equals(this.f27544j) && (chpVar instanceof dkf)) {
            dkf dkfVar = (dkf) chpVar;
            View view = this.f27543i;
            view.getClass();
            djw djwVarK = dkf.m6262k(view);
            dkfVar.f11881g = mrm.m16828h(djwVarK == null ? null : djwVarK.f11825a.getDrawable());
        }
        this.f27544j = chpVar;
        FrameLayout frameLayout = this.f27541g;
        frameLayout.getClass();
        mrm mrmVarM10181h = m10181h(chpVar, new dfg(frameLayout, 3));
        if (mrmVarM10181h.mo16813g()) {
            chp chpVar3 = this.f27544j;
            chpVar3.getClass();
            kbc kbcVarMo3745e = chpVar3.mo3733b().mo3745e();
            kbc kbcVarM13902g = kbc.m13902g(((hzm) mrmVarM10181h.mo16809c()).f30041e);
            kbc kbcVarM13907d = kbcVarMo3745e.m13911k() ? kbcVarM13902g.m13907d() : kbcVarM13902g.m13908e();
            chp chpVar4 = this.f27544j;
            chpVar4.getClass();
            chpVar4.mo3739h(kbcVarM13907d.f35517a, kbcVarM13907d.f35518b);
        }
        mrm mrmVarM16828h = mrm.m16828h(this.f27543i);
        FrameLayout frameLayout2 = this.f27541g;
        frameLayout2.getClass();
        View viewMo3732a = chpVar.mo3732a(mrmVarM16828h, frameLayout2);
        this.f27543i = viewMo3732a;
        viewMo3732a.setVisibility(0);
        m10183j(mrmVarM10181h);
        m10182i();
        if (this.f27543i.getParent() == null) {
            this.f27541g.addView(this.f27543i);
        }
        FrameLayout frameLayout3 = this.f27541g;
        hea heaVar = new hea(this, chpVar, 10);
        frameLayout3.animate().cancel();
        if (frameLayout3.getAlpha() == 1.0f && frameLayout3.getVisibility() == 0) {
            return;
        }
        frameLayout3.setAlpha(Math.max(frameLayout3.getAlpha(), 1.0E-4f));
        frameLayout3.setVisibility(0);
        frameLayout3.animate().alpha(1.0f).setDuration((int) (this.f27537c * (1.0f - frameLayout3.getAlpha()))).withEndAction(new hea(frameLayout3, heaVar, 8)).start();
    }
}
