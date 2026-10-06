package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import com.google.android.apps.camera.p014ui.cuttlefish.CountdownSliderUi;
import com.google.android.apps.camera.p014ui.elapsedtimeui.ElapsedTimerView;
import com.google.android.apps.camera.p014ui.elapsedtimeui.LongPressElapsedTimeView;
import com.google.android.apps.camera.p014ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijo implements ikg {

    /* JADX INFO: renamed from: a */
    private final oju f31206a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31207b;

    /* JADX INFO: renamed from: c */
    private final Object f31208c;

    /* JADX INFO: renamed from: d */
    private final Object f31209d;

    /* JADX INFO: renamed from: e */
    private final Object f31210e;

    public ijo(dfn dfnVar, elx elxVar, oju ojuVar, dhv dhvVar, int i) {
        this.f31207b = i;
        this.f31208c = dfnVar;
        this.f31209d = elxVar;
        this.f31206a = ojuVar;
        this.f31210e = dhvVar;
    }

    public ijo(hxn hxnVar, oju ojuVar, Context context, cdu cduVar, int i) {
        this.f31207b = i;
        this.f31209d = hxnVar;
        this.f31206a = ojuVar;
        this.f31208c = context;
        this.f31210e = cduVar;
    }

    public ijo(hxw hxwVar, hxw hxwVar2, oju ojuVar, dhv dhvVar, int i) {
        this.f31207b = i;
        this.f31210e = hxwVar;
        this.f31209d = hxwVar2;
        this.f31206a = ojuVar;
        this.f31208c = dhvVar;
    }

    public ijo(oju ojuVar, cdu cduVar, hah hahVar, jvd jvdVar, int i) {
        this.f31207b = i;
        this.f31206a = ojuVar;
        this.f31208c = cduVar;
        this.f31209d = hahVar.mo10029a(gzy.f27045d);
        this.f31210e = jvdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [hxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [hxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hxn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r1v4, types: [hze, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [hxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kos] */
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
        switch (this.f31207b) {
            case 0:
                this.f31209d.mo10816e((CountdownSliderUi) ((jfs) ((djm) this.f31206a.get()).f11789c).m13100f(C0100R.id.cuttlefish_bone_slider), (Context) this.f31208c);
                ((cdu) this.f31210e).m3529i().m13537d(this.f31209d);
                ((MainActivityLayout) ((jfs) ((djm) this.f31206a.get()).f11789c).m13100f(C0100R.id.activity_root_view)).m4463d(this.f31209d, hzd.TO_LEFT);
                break;
            case 1:
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) ((jfs) ((djm) this.f31206a.get()).f11789c).m13100f(C0100R.id.coach_hud);
                if (this.f31210e.mo6184l(dhi.f11131r) && cameraCoachHudView.f6593d.mo16813g()) {
                    ((dgd) cameraCoachHudView.f6593d.mo16809c()).f10875j = true;
                }
                this.f31210e.mo6173a(dhi.f11114a).ifPresent(new idi(cameraCoachHudView, 5));
                if (this.f31210e.mo6184l(dhi.f11129p) && cameraCoachHudView.f6591b.mo16813g()) {
                    ((dgm) cameraCoachHudView.f6591b.mo16809c()).f10929i = true;
                }
                Object obj = this.f31208c;
                Object obj2 = this.f31209d;
                dfn dfnVar = (dfn) obj;
                ?? r3 = dfnVar.f10793f;
                dfo dfoVar = (dfo) r3;
                dfoVar.f10798e = mrm.m16829i(cameraCoachHudView);
                ggm ggmVar = dfoVar.f10794a;
                cdu cduVar = dfoVar.f10799f;
                ggmVar.mo9217g(r3);
                cduVar.m3529i().m13537d(new cic(dfoVar, ggmVar, 12));
                cduVar.m3529i().m13537d(new cic(dfoVar, ggmVar, 13));
                if (dfoVar.f10798e.mo16813g()) {
                    ((CameraCoachHudView) dfoVar.f10798e.mo16809c()).f6590a = ggmVar.mo9215c().f35503e;
                }
                dfoVar.f10799f.m3529i().m13537d(dfoVar.f10795b.mo3830a(new czq(dfoVar, 13), jvd.f34877a));
                Object obj3 = dfnVar.f10788a;
                Object obj4 = dfnVar.f10793f;
                dgi dgiVar = (dgi) obj3;
                dgiVar.f10895h = mrm.m16829i(obj2);
                dgiVar.f10894g = mrm.m16829i(obj4);
                Object obj5 = dfnVar.f10789b;
                Object obj6 = dfnVar.f10793f;
                dgu dguVar = (dgu) obj5;
                dguVar.f10979e = mrm.m16829i(obj2);
                dguVar.f10980f = mrm.m16829i(obj6);
                ((dgo) dfnVar.f10790c).f10944h = mrm.m16829i(dfnVar.f10791d);
                Object obj7 = dfnVar.f10792e;
                Object obj8 = dfnVar.f10793f;
                dgb dgbVar = (dgb) obj7;
                dgbVar.f10849j = mrm.m16829i(obj2);
                dgbVar.f10850k = mrm.m16829i(obj8);
                break;
            case 2:
                jfs jfsVar = (jfs) ((djm) this.f31206a.get()).f11789c;
                ElapsedTimerView elapsedTimerView = (ElapsedTimerView) jfsVar.m13100f(C0100R.id.elapsed_timer_view);
                LongPressElapsedTimeView longPressElapsedTimeView = (LongPressElapsedTimeView) jfsVar.m13100f(C0100R.id.long_press_elapsed_timer_view);
                if (this.f31208c.mo6184l(dii.f11539o)) {
                    this.f31209d.mo10856i(longPressElapsedTimeView);
                } else {
                    this.f31209d.mo10856i(elapsedTimerView);
                }
                this.f31210e.mo10856i(elapsedTimerView);
                break;
            default:
                ((cdu) this.f31208c).m3529i().m13537d(this.f31209d.mo3830a(new fnw((GridLinesUi) ((jfs) ((djm) this.f31206a.get()).f11789c).m13100f(C0100R.id.grid_lines), 3), this.f31210e));
                break;
        }
    }
}
