package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrk implements hrh, fbp, fbd, fbn, fbo, ezx, ezt {

    /* JADX INFO: renamed from: a */
    public final Activity f29296a;

    /* JADX INFO: renamed from: b */
    public final chk f29297b;

    /* JADX INFO: renamed from: c */
    public final jww f29298c;

    /* JADX INFO: renamed from: d */
    public final gfa f29299d;

    /* JADX INFO: renamed from: e */
    public final ceb f29300e;

    /* JADX INFO: renamed from: f */
    public final hah f29301f;

    /* JADX INFO: renamed from: g */
    public final fls f29302g;

    /* JADX INFO: renamed from: h */
    public DialogInterfaceC0155eg f29303h;

    /* JADX INFO: renamed from: i */
    public final gfg f29304i = new hrj(this, 0);

    /* JADX INFO: renamed from: j */
    private final mrm f29305j;

    /* JADX INFO: renamed from: k */
    private final hro f29306k;

    /* JADX INFO: renamed from: l */
    private final jww f29307l;

    /* JADX INFO: renamed from: m */
    private final boolean f29308m;

    /* JADX INFO: renamed from: n */
    private final dhv f29309n;

    /* JADX INFO: renamed from: o */
    private final jvd f29310o;

    /* JADX INFO: renamed from: p */
    private final hai f29311p;

    /* JADX INFO: renamed from: q */
    private final guk f29312q;

    /* JADX INFO: renamed from: r */
    private final jfs f29313r;

    /* JADX INFO: renamed from: s */
    private final jfs f29314s;

    public hrk(Activity activity, mrm mrmVar, chk chkVar, jfs jfsVar, hro hroVar, jww jwwVar, jww jwwVar2, fba fbaVar, boolean z, dhv dhvVar, jvd jvdVar, gfa gfaVar, ceb cebVar, hah hahVar, hai haiVar, fls flsVar, guk gukVar, jfs jfsVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29296a = activity;
        this.f29305j = mrmVar;
        this.f29297b = chkVar;
        this.f29314s = jfsVar;
        this.f29306k = hroVar;
        this.f29298c = jwwVar;
        this.f29307l = jwwVar2;
        this.f29308m = z;
        this.f29309n = dhvVar;
        this.f29310o = jvdVar;
        this.f29299d = gfaVar;
        this.f29300e = cebVar;
        this.f29301f = hahVar;
        this.f29311p = haiVar;
        this.f29302g = flsVar;
        this.f29312q = gukVar;
        this.f29313r = jfsVar2;
        jvdVar.m13541c(new hri(this, fbaVar, 0));
    }

    /* JADX INFO: renamed from: f */
    private final void m10652f() {
        if (!this.f29309n.mo6184l(dib.f11331bl) || this.f29309n.mo6184l(dib.f11326bg) || this.f29312q.f26433a || this.f29313r.m13112v()) {
            return;
        }
        Intent intent = this.f29296a.getIntent();
        int iIntValue = ((Integer) this.f29301f.mo10031c(gzy.f27050i)).intValue();
        int iIntValue2 = ((Integer) this.f29309n.mo6173a(dib.f11378t).get()).intValue();
        if (iIntValue >= iIntValue2 || cds.m3510i(intent)) {
            this.f29311p.mo10033e(gzy.f27050i, Integer.valueOf(iIntValue2));
            return;
        }
        if (iIntValue == iIntValue2 - 1) {
            jfs jfsVar = this.f29314s;
            jvd.m13538a();
            Object obj = jfsVar.f33914a;
            jvd.m13538a();
            hrl hrlVar = (hrl) obj;
            if (hrlVar.f29320f == null) {
                FrameLayout frameLayout = new FrameLayout((Context) hrlVar.f29316b);
                View.inflate((Context) hrlVar.f29316b, C0100R.layout.double_tap_bottom_sheet, frameLayout);
                ((Button) frameLayout.findViewById(C0100R.id.got_it_button)).setOnClickListener(new flr(hrlVar, 9));
                Object obj2 = bgp.m2422c((Context) hrlVar.f29316b, true != ((kpb) hrlVar.f29318d).m14670j() ? C0100R.raw.double_tap_phone_edu_animation : C0100R.raw.double_tap_tablet_edu_animation).f3263a;
                obj2.getClass();
                ((bgv) hrlVar.f29319e).m2450q((bgm) obj2);
                ((bgv) hrlVar.f29319e).m2448o(-1);
                FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(C0100R.id.bottom_sheet_video_container);
                EduImageView eduImageView = (EduImageView) frameLayout.findViewById(C0100R.id.bottom_sheet_video);
                ViewGroup.LayoutParams layoutParams = eduImageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int i = (((DisplayMetrics) hrlVar.f29317c).widthPixels - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                int i2 = (((DisplayMetrics) hrlVar.f29317c).heightPixels - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
                float f = i;
                if (layoutParams.width > f) {
                    float f2 = (layoutParams.height / layoutParams.width) * f;
                    layoutParams.width = (int) f;
                    layoutParams.height = (int) f2;
                    eduImageView.setLayoutParams(layoutParams);
                } else {
                    float f3 = i2;
                    if (layoutParams.height > f3) {
                        marginLayoutParams.width = (int) ((layoutParams.width / layoutParams.height) * f3);
                        marginLayoutParams.height = (int) f3;
                        eduImageView.setLayoutParams(layoutParams);
                    }
                }
                eduImageView.m4361b((Drawable) hrlVar.f29319e, ((Context) hrlVar.f29316b).getString(C0100R.string.double_tap_launch_content_description));
                hrlVar.f29320f = frameLayout;
            }
            ((bgv) hrlVar.f29319e).m2444k();
            Object obj3 = hrlVar.f29315a;
            Object obj4 = hrlVar.f29320f;
            obj4.getClass();
            ((hst) obj3).m10713l(8, C0100R.string.double_tap_launch_title, (View) obj4);
        }
        this.f29311p.mo10033e(gzy.f27050i, Integer.valueOf(iIntValue + 1));
    }

    @Override // p000.hrh
    /* JADX INFO: renamed from: a */
    public final void mo10651a() {
        if (this.f29309n.mo6184l(dib.f11326bg) || this.f29308m) {
            this.f29298c.mo3415bf(true);
            this.f29307l.mo3415bf(true);
            return;
        }
        ikw ikwVarL = this.f29297b.mo3698l();
        if (ikwVarL == null || ikwVarL.equals(ikw.IMAGE_INTENT) || ikwVarL.equals(ikw.VIDEO_INTENT)) {
            return;
        }
        if (!((Boolean) this.f29298c.mo3831be()).booleanValue()) {
            this.f29310o.m13541c(new hps(this, 13));
            return;
        }
        m10653b();
        ViewGroup viewGroup = (ViewGroup) this.f29296a.findViewById(C0100R.id.activity_root_view);
        this.f29296a.getResources();
        hro hroVar = this.f29306k;
        if (((Boolean) hroVar.f29324b.mo3831be()).booleanValue() && !((Boolean) hroVar.f29325c.mo3831be()).booleanValue()) {
            if (((Boolean) hroVar.f29326d.mo3831be()).booleanValue()) {
                hroVar.f29325c.mo3415bf(true);
                return;
            }
            elx elxVar = hroVar.f29327e;
            hrf hrfVar = new hrf();
            hrfVar.f29267b = viewGroup;
            hrfVar.f29266a = hro.f29323a;
            hrfVar.f29271f = elxVar;
            hrfVar.f29273h = 4;
            hrfVar.f29269d = true;
            hrfVar.f29270e = hroVar.f29328f;
            hrfVar.f29272g = hroVar.f29329g;
            elxVar.mo7482d(hrfVar.m10649a());
            hroVar.f29325c.mo3415bf(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10653b() {
        if (this.f29305j.mo16813g()) {
            dnq dnqVar = (dnq) this.f29305j.mo16809c();
            this.f29311p.mo10030b(gzy.f27039aw);
            this.f29297b.getClass();
            dnqVar.m6440a();
        }
    }

    @Override // p000.ezx
    /* JADX INFO: renamed from: bD */
    public final void mo6425bD(Intent intent) {
        m10652f();
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        if (this.f29303h != null) {
            mo10651a();
        }
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
        m10652f();
    }

    /* JADX INFO: renamed from: c */
    public final void m10654c() {
        DialogInterfaceC0155eg dialogInterfaceC0155eg;
        if (this.f29296a.isFinishing() || (dialogInterfaceC0155eg = this.f29303h) == null) {
            return;
        }
        dialogInterfaceC0155eg.show();
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        DialogInterfaceC0155eg dialogInterfaceC0155eg = this.f29303h;
        if (dialogInterfaceC0155eg != null) {
            dialogInterfaceC0155eg.dismiss();
            this.f29303h = null;
        }
        jfs jfsVar = this.f29314s;
        jvd.m13538a();
        ((hrl) jfsVar.f33914a).m10655a();
    }

    @Override // p000.ezt
    /* JADX INFO: renamed from: y */
    public final void mo7784y(Configuration configuration) {
        DialogInterfaceC0155eg dialogInterfaceC0155eg = this.f29303h;
        if (dialogInterfaceC0155eg != null) {
            dialogInterfaceC0155eg.dismiss();
            this.f29303h = null;
            mo10651a();
        }
    }
}
