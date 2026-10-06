package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.toast.EducationToastView;
import com.google.android.apps.camera.toast.ToastView;
import java.util.Date;
import p021j$.time.Duration;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrg implements elw {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f29275a;

    /* JADX INFO: renamed from: b */
    public final Runnable f29276b;

    /* JADX INFO: renamed from: c */
    public Runnable f29277c;

    /* JADX INFO: renamed from: e */
    private final Duration f29279e;

    /* JADX INFO: renamed from: f */
    private final View f29280f;

    /* JADX INFO: renamed from: j */
    private final boolean f29284j;

    /* JADX INFO: renamed from: k */
    private final gfa f29285k;

    /* JADX INFO: renamed from: l */
    private final fcp f29286l;

    /* JADX INFO: renamed from: m */
    private Date f29287m;

    /* JADX INFO: renamed from: o */
    private ToastView f29289o;

    /* JADX INFO: renamed from: p */
    private final int f29290p;

    /* JADX INFO: renamed from: d */
    public Runnable f29278d = hde.f27301c;

    /* JADX INFO: renamed from: n */
    private ilk f29288n = ilk.PORTRAIT;

    /* JADX INFO: renamed from: g */
    private final String f29281g = null;

    /* JADX INFO: renamed from: h */
    private final String f29282h = null;

    /* JADX INFO: renamed from: i */
    private final int f29283i = 0;

    public hrg(Duration duration, ViewGroup viewGroup, View view, Runnable runnable, int i, boolean z, gfa gfaVar, fcp fcpVar) {
        this.f29279e = duration;
        this.f29275a = viewGroup;
        this.f29280f = view;
        this.f29276b = runnable;
        this.f29290p = i;
        this.f29284j = z;
        this.f29285k = gfaVar;
        this.f29286l = fcpVar;
    }

    /* JADX INFO: renamed from: r */
    private static void m10650r(ToastView toastView, View view) {
        FrameLayout frameLayout = (FrameLayout) toastView.findViewById(C0100R.id.toast_inner_layout);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams(marginLayoutParams);
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.removeAllViewsInLayout();
        frameLayout.addView(view);
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: a */
    public final int mo7492a() {
        return (int) (this.f29279e.toMillis() + ToastView.f6979d.toMillis() + ToastView.f6980e.toMillis());
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: b */
    public final ely mo7493b() {
        return this.f29284j ? ely.SECOND_RUN_TOAST : ely.FIRST_RUN_TOAST;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo7494c() {
        return gmz.m9541i();
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Runnable mo7495d() {
        return null;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: e */
    public final Date mo7496e() {
        return this.f29287m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrg)) {
            return false;
        }
        hrg hrgVar = (hrg) obj;
        int i = hrgVar.f29283i;
        if (this.f29284j == hrgVar.f29284j && Objects.equals(this.f29279e, hrgVar.f29279e) && Objects.equals(this.f29275a, hrgVar.f29275a)) {
            String str = hrgVar.f29281g;
            if (Objects.equals(null, null)) {
                String str2 = hrgVar.f29282h;
                if (Objects.equals(null, null) && this.f29290p == hrgVar.f29290p) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: f */
    public final void mo7497f(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: g */
    public final void mo7498g() {
        ToastView toastView = this.f29289o;
        if (toastView != null) {
            toastView.m4313f();
        }
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo7499h() {
    }

    public final int hashCode() {
        return Objects.hash(this.f29279e, this.f29275a, null, null, 0, Integer.valueOf(this.f29290p), Boolean.valueOf(this.f29284j));
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: i */
    public final void mo7500i(Date date) {
        this.f29287m = date;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: j */
    public final void mo7501j() {
        if (!this.f29284j) {
            Duration duration = ToastView.f6979d;
            ViewGroup viewGroup = this.f29275a;
            View.inflate(viewGroup.getContext(), C0100R.layout.toast_view_layout, viewGroup);
            ToastView toastView = (ToastView) viewGroup.findViewById(C0100R.id.toast_view_layout);
            toastView.mo4309b(this);
            this.f29289o = toastView;
            View view = this.f29280f;
            if (view != null) {
                m10650r(toastView, view);
            }
            this.f29289o.mo4311d(this.f29288n);
            this.f29289o.m4315h();
            return;
        }
        View view2 = this.f29280f;
        if (view2 != null) {
            EducationToastView educationToastViewM4307a = EducationToastView.m4307a(this);
            this.f29289o = educationToastViewM4307a;
            m10650r(educationToastViewM4307a, view2);
            this.f29289o.mo4311d(this.f29288n);
            this.f29289o.m4315h();
            return;
        }
        if (this.f29285k.mo9108G()) {
            this.f29277c.run();
            return;
        }
        this.f29285k.mo9121g(new hre(this, 0));
        EducationToastView educationToastViewM4307a2 = EducationToastView.m4307a(this);
        this.f29289o = educationToastViewM4307a2;
        educationToastViewM4307a2.mo4311d(this.f29288n);
        this.f29289o.m4315h();
        this.f29286l.mo8181az();
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo7502k() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean mo7503l() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: m */
    public final boolean mo7504m() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo7505n() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean mo7506o() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: p */
    public final int mo7507p() {
        return this.f29290p;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: q */
    public final void mo7508q(int i, boolean z, boolean z2, ilk ilkVar, hzj hzjVar) {
        this.f29288n = ilkVar;
        ToastView toastView = this.f29289o;
        if (toastView != null) {
            toastView.mo4311d(ilkVar);
        }
    }
}
