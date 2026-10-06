package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.smarts.SmartsChipView;
import java.util.Date;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdl implements heo {

    /* JADX INFO: renamed from: a */
    public final het f27351a;

    /* JADX INFO: renamed from: b */
    public hev f27352b;

    /* JADX INFO: renamed from: c */
    public final SmartsChipView f27353c;

    /* JADX INFO: renamed from: d */
    public final fcp f27354d;

    /* JADX INFO: renamed from: e */
    public final ggm f27355e;

    /* JADX INFO: renamed from: f */
    public boolean f27356f = false;

    /* JADX INFO: renamed from: g */
    public final djm f27357g;

    /* JADX INFO: renamed from: h */
    public final jfs f27358h;

    /* JADX INFO: renamed from: i */
    public final ihk f27359i;

    /* JADX INFO: renamed from: j */
    private final hes f27360j;

    /* JADX INFO: renamed from: k */
    private final boolean f27361k;

    /* JADX INFO: renamed from: l */
    private Date f27362l;

    public hdl(het hetVar, hes hesVar, hev hevVar, SmartsChipView smartsChipView, fcp fcpVar, jfs jfsVar, ggm ggmVar, djm djmVar, ihk ihkVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f27351a = hetVar;
        this.f27352b = hevVar;
        this.f27353c = smartsChipView;
        this.f27354d = fcpVar;
        this.f27358h = jfsVar;
        this.f27360j = hesVar;
        this.f27355e = ggmVar;
        this.f27357g = djmVar;
        this.f27359i = ihkVar;
        this.f27361k = z;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: a */
    public final int mo7492a() {
        return (int) this.f27352b.f27505a;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: b */
    public final ely mo7493b() {
        return ely.SMARTS;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: c */
    public final Object mo7494c() {
        return this.f27360j;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: d */
    public final Runnable mo7495d() {
        return this.f27352b.f27515k;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: e */
    public final Date mo7496e() {
        return this.f27362l;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: f */
    public final void mo7497f(Runnable runnable) {
        SmartsChipView smartsChipView = this.f27353c;
        smartsChipView.f6932f = runnable;
        if (smartsChipView.f6930d) {
            smartsChipView.f6931e = true;
        } else {
            smartsChipView.m4290b();
        }
        this.f27356f = false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: g */
    public final void mo7498g() {
        this.f27353c.m4290b();
        this.f27356f = false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo7499h() {
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: i */
    public final void mo7500i(Date date) {
        this.f27362l = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.elw
    /* JADX INFO: renamed from: j */
    public final void mo7501j() {
        final SmartsChipView smartsChipView = this.f27353c;
        if (!smartsChipView.f6930d) {
            smartsChipView.f6928b.scrollTo(0, 0);
            if (afc.m442c(smartsChipView.f6928b.getRootView()) == 1) {
                smartsChipView.f6928b.setGravity(8388661);
            } else {
                smartsChipView.f6928b.setGravity(8388659);
            }
            if (smartsChipView.f6938l.mo8995b()) {
                smartsChipView.f6938l = new jvb();
            }
            smartsChipView.m4291c(this.f27357g.f11787a, this);
            smartsChipView.m4291c(this.f27357g.f11788b, this);
            smartsChipView.m4291c(this.f27359i.f30966a, this);
            smartsChipView.m4291c(this.f27359i.f30967b, this);
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: hcx
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SmartsChipView smartsChipView2 = smartsChipView;
                    hci hciVarM10111a = hcj.m10111a(this);
                    hciVarM10111a.m10110f(smartsChipView2.f6939m);
                    hciVarM10111a.m10106b(true);
                    hciVarM10111a.m10108d(smartsChipView2.f6935i);
                    hciVarM10111a.m10107c(smartsChipView2.f6936j);
                    hciVarM10111a.m10109e(smartsChipView2.f6937k);
                    smartsChipView2.m4293e(hciVarM10111a.m10105a());
                }
            };
            ((ViewGroup) smartsChipView.getParent()).addOnLayoutChangeListener(onLayoutChangeListener);
            smartsChipView.f6938l.m13537d(new gto(smartsChipView, onLayoutChangeListener, 5));
            smartsChipView.m4292d(this);
            if (mo10126s()) {
                if (this.f27358h.m13076K()) {
                    npk.m17604h(this.f27353c);
                }
                smartsChipView.m4289a(0);
                Runnable runnable = this.f27352b.f27513i;
                if (runnable != null) {
                    runnable.run();
                }
                this.f27354d.mo8160ae(2, this.f27351a.f27483a);
            } else {
                smartsChipView.setVisibility(8);
            }
            smartsChipView.f6933g = this.f27352b.f27514j;
        }
        this.f27356f = true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: k */
    public final boolean mo7502k() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean mo7503l() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: m */
    public final boolean mo7504m() {
        return this.f27352b.f27516l;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: n */
    public final boolean mo7505n() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean mo7506o() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: p */
    public final int mo7507p() {
        return this.f27351a.f27491i;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: q */
    public final void mo7508q(int i, boolean z, boolean z2, ilk ilkVar, hzj hzjVar) {
        SmartsChipView smartsChipView = this.f27353c;
        hci hciVarM10111a = hcj.m10111a(this);
        hciVarM10111a.m10110f(i);
        hciVarM10111a.m10108d(z2);
        hciVarM10111a.m10107c(z);
        hciVarM10111a.m10109e(this.f27361k);
        smartsChipView.m4293e(hciVarM10111a.m10105a());
    }

    @Override // p000.heo
    /* JADX INFO: renamed from: r */
    public final void mo10125r(hev hevVar) {
        this.f27352b = hevVar;
        if (this.f27356f) {
            SmartsChipView smartsChipView = this.f27353c;
            smartsChipView.m4292d(this);
            if (mo10126s()) {
                Runnable runnable = this.f27352b.f27513i;
                if (runnable != null) {
                    runnable.run();
                }
                smartsChipView.setVisibility(0);
            } else {
                smartsChipView.setVisibility(8);
            }
            smartsChipView.f6933g = this.f27352b.f27514j;
        }
    }

    @Override // p000.heo
    /* JADX INFO: renamed from: s */
    public final boolean mo10126s() {
        hev hevVar = this.f27352b;
        return (hevVar.f27508d == null && hevVar.f27507c == null) ? false : true;
    }
}
