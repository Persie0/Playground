package p000;

import android.content.Context;
import android.view.ViewStub;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijs implements ikg {

    /* JADX INFO: renamed from: a */
    private final mrm f31245a;

    /* JADX INFO: renamed from: b */
    private final oju f31246b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f31247c;

    /* JADX INFO: renamed from: d */
    private final Object f31248d;

    public ijs(mrm mrmVar, hyo hyoVar, oju ojuVar, int i) {
        this.f31247c = i;
        this.f31245a = mrmVar;
        this.f31248d = hyoVar;
        this.f31246b = ojuVar;
    }

    public ijs(mrm mrmVar, oju ojuVar, Context context, int i) {
        this.f31247c = i;
        this.f31245a = mrmVar;
        this.f31246b = ojuVar;
        this.f31248d = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [hze, java.lang.Object] */
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
    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        ViewStub viewStub;
        hzd hzdVar;
        switch (this.f31247c) {
            case 0:
                if (this.f31245a.mo16813g()) {
                    ((hnn) this.f31245a.mo16809c()).mo10502k((FocusIndicatorView) ((MainActivityLayout) ((jfs) ((djm) this.f31246b.get()).f11789c).m13100f(C0100R.id.activity_root_view)).findViewById(C0100R.id.focus_indicator_view), (Context) this.f31248d);
                    break;
                }
                break;
            case 1:
                if (this.f31245a.mo16813g()) {
                    ((clc) this.f31245a.mo16809c()).mo3881l((ViewStub) ((jfs) ((djm) this.f31246b.get()).f11789c).m13100f(C0100R.id.autonightsight_toggle_ui_stub), (Context) this.f31248d);
                    ((MainActivityLayout) ((jfs) ((djm) this.f31246b.get()).f11789c).m13100f(C0100R.id.activity_root_view)).m4463d((hze) this.f31245a.mo16809c(), hzd.TO_LEFT);
                }
                break;
            case 2:
                if (this.f31245a.mo16813g()) {
                    ((hnn) this.f31245a.mo16809c()).mo10502k((FocusIndicatorView) ((iig) this.f31246b).get().f31066c.findViewById(C0100R.id.focus_indicator_view), (Context) this.f31248d);
                    break;
                }
                break;
            default:
                iid iidVar = ((iig) this.f31246b).get();
                jfs jfsVar = iidVar.f31080q;
                MainActivityLayout mainActivityLayout = iidVar.f31066c;
                if (this.f31245a.mo16813g()) {
                    ((era) this.f31245a.mo16809c()).mo7656c((ViewStub) jfsVar.m13100f(C0100R.id.lasagna_mode_slider_ui_stub));
                    mainActivityLayout.f7263m = this.f31245a;
                    mainActivityLayout.m4472m(mainActivityLayout.m4461a().f30073i, mainActivityLayout.m4461a().f30071g);
                    viewStub = (ViewStub) jfsVar.m13100f(C0100R.id.help_ui_mode_slider);
                    hzdVar = hzd.NONE;
                } else {
                    viewStub = (ViewStub) jfsVar.m13100f(C0100R.id.help_ui_zoom_slider);
                    hzdVar = hzd.TO_LEFT;
                }
                ((hyo) this.f31248d).m10876c(viewStub);
                mainActivityLayout.m4463d(this.f31248d, hzdVar);
                break;
        }
    }
}
