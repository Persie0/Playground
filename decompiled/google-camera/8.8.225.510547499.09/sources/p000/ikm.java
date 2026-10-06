package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.wirers.PreviewOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikm implements ikg {

    /* JADX INFO: renamed from: a */
    private final oju f31353a;

    /* JADX INFO: renamed from: b */
    private final Context f31354b;

    /* JADX INFO: renamed from: c */
    private final ipv f31355c;

    /* JADX INFO: renamed from: d */
    private final ipt f31356d;

    /* JADX INFO: renamed from: e */
    private final iuj f31357e;

    /* JADX INFO: renamed from: f */
    private final icf f31358f;

    /* JADX INFO: renamed from: g */
    private final BottomBarController f31359g;

    /* JADX INFO: renamed from: h */
    private final eoq f31360h;

    /* JADX INFO: renamed from: i */
    private final dhv f31361i;

    /* JADX INFO: renamed from: j */
    private final hah f31362j;

    /* JADX INFO: renamed from: k */
    private final hsk f31363k;

    /* JADX INFO: renamed from: l */
    private final oju f31364l;

    /* JADX INFO: renamed from: m */
    private final msi f31365m;

    public ikm(oju ojuVar, Context context, ipv ipvVar, ipt iptVar, iuj iujVar, eoq eoqVar, icf icfVar, BottomBarController bottomBarController, dhv dhvVar, hah hahVar, hsk hskVar, oju ojuVar2, msi msiVar) {
        this.f31353a = ojuVar;
        this.f31354b = context;
        this.f31355c = ipvVar;
        this.f31356d = iptVar;
        this.f31357e = iujVar;
        this.f31358f = icfVar;
        this.f31359g = bottomBarController;
        this.f31360h = eoqVar;
        this.f31361i = dhvVar;
        this.f31362j = hahVar;
        this.f31363k = hskVar;
        this.f31364l = ojuVar2;
        this.f31365m = msiVar;
    }

    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        PreviewOverlay previewOverlay = (PreviewOverlay) ((jfs) ((djm) this.f31353a.get()).f11789c).m13100f(C0100R.id.preview_overlay);
        Context context = this.f31354b;
        jfo jfoVar = new jfo(context, jvh.m13557e(context.getMainLooper()));
        hsk hskVar = this.f31363k;
        icf icfVar = this.f31358f;
        iki ikiVar = new iki(icfVar.mo11025x(), this.f31365m, hskVar);
        hsk hskVar2 = this.f31363k;
        icf icfVar2 = this.f31358f;
        iqh iqhVar = new iqh(jfoVar, ikiVar, new ikj(icfVar2.mo11025x(), this.f31365m, hskVar2), this.f31356d, new ikk(this.f31355c, ((dwz) this.f31364l).get()), new ikl(this.f31357e), new jfo(this.f31357e, this.f31359g), new AmbientModeSupport.AmbientController(this.f31358f.mo11025x()), this.f31362j.mo10029a(gzy.f27049h), previewOverlay.getRootView(), this.f31354b, this.f31361i, null, null, null);
        this.f31360h.m7597a(iqhVar.f31785p);
        previewOverlay.f7301e = new AmbientModeSupport.AmbientController(iqhVar);
    }
}
