package p000;

import android.animation.ValueAnimator;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.autotimer.p006ui.AutoTimerIndicatorView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.captureframe.CaptureFrameUi;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijl implements ikg {

    /* JADX INFO: renamed from: a */
    private final oju f31176a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31177b;

    /* JADX INFO: renamed from: c */
    private final Object f31178c;

    public ijl(cmg cmgVar, oju ojuVar, int i) {
        this.f31177b = i;
        this.f31178c = cmgVar;
        this.f31176a = ojuVar;
    }

    public ijl(dac dacVar, oju ojuVar, int i) {
        this.f31177b = i;
        this.f31178c = dacVar;
        this.f31176a = ojuVar;
    }

    public ijl(gsh gshVar, oju ojuVar, int i) {
        this.f31177b = i;
        this.f31178c = gshVar;
        this.f31176a = ojuVar;
    }

    public ijl(htb htbVar, oju ojuVar, int i) {
        this.f31177b = i;
        this.f31178c = htbVar;
        this.f31176a = ojuVar;
    }

    public ijl(hyo hyoVar, oju ojuVar, int i) {
        this.f31177b = i;
        this.f31178c = hyoVar;
        this.f31176a = ojuVar;
    }

    public ijl(icf icfVar, oju ojuVar, int i) {
        this.f31177b = i;
        this.f31178c = icfVar;
        this.f31176a = ojuVar;
    }

    public ijl(mrm mrmVar, oju ojuVar, int i) {
        this.f31177b = i;
        this.f31176a = ojuVar;
        this.f31178c = mrmVar;
    }

    public ijl(mrm mrmVar, oju ojuVar, int i, byte[] bArr) {
        this.f31177b = i;
        this.f31178c = mrmVar;
        this.f31176a = ojuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [icf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [hze, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [dac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [dac, java.lang.Object] */
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
        switch (this.f31177b) {
            case 0:
                CaptureFrameUi captureFrameUi = (CaptureFrameUi) ((jfs) ((djm) this.f31176a.get()).f11789c).m13100f(C0100R.id.capture_frame);
                htb htbVar = (htb) this.f31178c;
                htbVar.f29486b = ValueAnimator.ofFloat(0.0f, 1.0f);
                ((ValueAnimator) htbVar.f29486b).setDuration(200L);
                ((ValueAnimator) htbVar.f29486b).setInterpolator(new LinearInterpolator());
                ((ValueAnimator) htbVar.f29486b).addUpdateListener(new ifo(htbVar, captureFrameUi, 1));
                ((ValueAnimator) htbVar.f29486b).addListener(new hta(htbVar, captureFrameUi));
                break;
            case 1:
                AutoTimerIndicatorView autoTimerIndicatorView = (AutoTimerIndicatorView) ((jfs) ((djm) this.f31176a.get()).f11789c).m13100f(C0100R.id.autotimer_indicator_view);
                cmg cmgVar = (cmg) this.f31178c;
                cmgVar.f6219c = autoTimerIndicatorView;
                cmgVar.f6221e.m3529i().m13537d(cmgVar.f6217a.mo3830a(new ckv(cmgVar, 5), cmgVar.f6218b));
                break;
            case 2:
                iid iidVar = ((iig) this.f31176a).get();
                ((hyo) this.f31178c).m10876c((ViewStub) iidVar.f31080q.m13100f(C0100R.id.help_ui_cinematic));
                iidVar.f31066c.m4463d(this.f31178c, hzd.TO_LEFT);
                break;
            case 3:
                if (((mrm) this.f31178c).mo16813g()) {
                    iid iidVar2 = ((iig) this.f31176a).get();
                    ((isb) ((mrm) this.f31178c).mo16809c()).mo11663e(((ViewStub) iidVar2.f31080q.m13100f(C0100R.id.chameleon_ui_stub)).inflate());
                    MainActivityLayout mainActivityLayout = iidVar2.f31066c;
                    mainActivityLayout.f7261k = (mrm) this.f31178c;
                    mainActivityLayout.m4469j(mainActivityLayout.m4461a().f30073i, mainActivityLayout.m4461a().f30071g, (ikw) mainActivityLayout.f7265o.mo3831be());
                    break;
                }
                break;
            case 4:
                iid iidVar3 = ((iig) this.f31176a).get();
                this.f31178c.mo5793e((ViewStub) iidVar3.f31080q.m13100f(C0100R.id.mode_slider_ui_stub));
                MainActivityLayout mainActivityLayout2 = iidVar3.f31066c;
                mainActivityLayout2.f7257g = this.f31178c;
                mainActivityLayout2.m4471l(mainActivityLayout2.m4461a().f30073i, mainActivityLayout2.m4461a().f30071g);
                break;
            case 5:
                this.f31178c.mo11006e(((iig) this.f31176a).get());
                break;
            case 6:
                ((gsh) this.f31178c).m9706d((ProgressOverlay) ((jfs) ((djm) this.f31176a.get()).f11789c).m13100f(C0100R.id.progress_overlay));
                break;
        }
    }
}
