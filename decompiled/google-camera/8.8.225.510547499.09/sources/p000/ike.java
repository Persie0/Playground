package p000;

import android.view.ViewStub;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuView;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuViewContainer;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ike implements ikg {

    /* JADX INFO: renamed from: a */
    public final Object f31335a;

    /* JADX INFO: renamed from: b */
    private final oju f31336b;

    /* JADX INFO: renamed from: c */
    private final dhv f31337c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f31338d;

    /* JADX INFO: renamed from: e */
    private final Object f31339e;

    /* JADX INFO: renamed from: f */
    private final Object f31340f;

    public ike(iex iexVar, oju ojuVar, dhv dhvVar, fan fanVar, elx elxVar, int i) {
        this.f31338d = i;
        this.f31339e = iexVar;
        this.f31336b = ojuVar;
        this.f31337c = dhvVar;
        this.f31340f = fanVar;
        this.f31335a = elxVar;
    }

    public ike(mrm mrmVar, jvb jvbVar, oju ojuVar, dhv dhvVar, int i) {
        this.f31338d = i;
        this.f31339e = mrmVar;
        this.f31336b = ojuVar;
        this.f31340f = jvbVar;
        this.f31335a = new ikc(mrmVar);
        this.f31337c = dhvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [elx, java.lang.Object] */
    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        switch (this.f31338d) {
            case 0:
                if (((mrm) this.f31339e).mo16813g()) {
                    iid iidVar = ((iig) this.f31336b).get();
                    jfs jfsVar = iidVar.f31080q;
                    dbg dbgVarMo5846a = ((dax) ((mrm) this.f31339e).mo16809c()).mo5846a();
                    if (!this.f31337c.mo6184l(dib.f11361co)) {
                        ViewStub viewStub = (ViewStub) jfsVar.m13100f(C0100R.id.washington_menu_ui);
                        dbe dbeVar = (dbe) dbgVarMo5846a;
                        if (!dbeVar.f10367b.mo6184l(dib.f11361co)) {
                            if (dbeVar.f10369d == null) {
                                dbeVar.f10369d = (PopupMenuViewContainer) viewStub.inflate();
                                dbeVar.f10368c = (PopupMenuView) dbeVar.f10369d.findViewById(C0100R.id.washington_menu_view);
                            }
                            dbeVar.f10368c.m4408d(C0100R.string.stab_menu_header, dbeVar.f10372g);
                            dbeVar.f10372g.m11127c(dbh.STANDARD);
                            if (dbeVar.f10367b.mo6184l(dhh.f11062O)) {
                                dbeVar.f10368c.f7094b.setVisibility(0);
                            }
                        }
                        ((jvb) this.f31340f).m13537d(dbgVarMo5846a.mo5870a(new ikd(this, iidVar)));
                    }
                    ((dax) ((mrm) this.f31339e).mo16809c()).mo5851f((ViewStub) jfsVar.m13100f(C0100R.id.washington_ui));
                    MainActivityLayout mainActivityLayout = iidVar.f31066c;
                    mainActivityLayout.f7260j = (mrm) this.f31339e;
                    mainActivityLayout.m4474o(mainActivityLayout.m4461a().f30073i, mainActivityLayout.m4461a().f30071g);
                    break;
                }
                break;
            default:
                if (this.f31337c.mo6184l(dib.f11343bx)) {
                    ViewStub viewStub2 = (ViewStub) ((jfs) ((djm) this.f31336b.get()).f11789c).m13100f(C0100R.id.camera_remote_control_layout_stub);
                    ?? r1 = this.f31339e;
                    ?? r2 = this.f31335a;
                    iex iexVar = (iex) r1;
                    iexVar.f30575d = viewStub2;
                    iexVar.f30576e = r2;
                    ((fba) this.f31340f).m8097e(r1);
                }
                break;
        }
    }
}
