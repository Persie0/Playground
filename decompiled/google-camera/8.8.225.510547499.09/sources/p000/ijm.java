package p000;

import android.view.View;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.uiutils.ReplaceableView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ijm implements ikg {

    /* JADX INFO: renamed from: a */
    public final oju f31179a;

    /* JADX INFO: renamed from: b */
    private final mrm f31180b;

    /* JADX INFO: renamed from: c */
    private final oju f31181c;

    /* JADX INFO: renamed from: d */
    private final oju f31182d;

    /* JADX INFO: renamed from: e */
    private final oju f31183e;

    /* JADX INFO: renamed from: f */
    private final oju f31184f;

    /* JADX INFO: renamed from: g */
    private final oju f31185g;

    /* JADX INFO: renamed from: h */
    private final oju f31186h;

    /* JADX INFO: renamed from: i */
    private final jwn f31187i;

    /* JADX INFO: renamed from: j */
    private final fba f31188j;

    /* JADX INFO: renamed from: k */
    private final kbz f31189k;

    /* JADX INFO: renamed from: l */
    private final hah f31190l;

    /* JADX INFO: renamed from: m */
    private final cdu f31191m;

    public ijm(mrm mrmVar, oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, cdu cduVar, jwn jwnVar, fba fbaVar, kbz kbzVar, hah hahVar) {
        this.f31180b = mrmVar;
        this.f31182d = ojuVar3;
        this.f31185g = ojuVar6;
        this.f31186h = ojuVar7;
        this.f31183e = ojuVar4;
        this.f31181c = ojuVar;
        this.f31179a = ojuVar2;
        this.f31184f = ojuVar5;
        this.f31187i = jwnVar;
        this.f31188j = fbaVar;
        this.f31191m = cduVar;
        this.f31189k = kbzVar;
        this.f31190l = hahVar;
    }

    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        jfs jfsVar = (jfs) ((djm) this.f31181c.get()).f11789c;
        ((gwp) this.f31182d.get()).mo9853e((gwg) this.f31186h.get(), this.f31191m.m3529i(), (ReplaceableView) jfsVar.m13100f(C0100R.id.fullscreen_selfie_flash), (gwq) this.f31185g.get(), (ilo) this.f31184f.get(), this.f31190l.mo10029a(gzy.f27064w), this.f31190l.mo10029a(gzy.f27061t), this.f31190l.mo10029a(gzy.f27065x), this.f31187i);
        this.f31189k.mo13963g("WireMicro");
        mrm mrmVar = this.f31180b;
        if (mrmVar.mo16813g()) {
            this.f31188j.m8097e((fgk) mrmVar.mo16809c());
        }
        View view = (View) jfsVar.m13100f(C0100R.id.camera_app_root);
        view.post(new gxn(this, view, jfsVar, 16, (byte[]) null, (byte[]) null));
        this.f31189k.mo13963g("WireBottomBar");
        ((BottomBarController) this.f31183e.get()).wireListeners();
        this.f31189k.mo13962f();
    }
}
