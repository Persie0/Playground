package p000;

import android.content.res.Resources;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.p014ui.wirers.PreviewOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class huu extends hug {

    /* JADX INFO: renamed from: a */
    public final BottomBarController f29598a;

    /* JADX INFO: renamed from: b */
    public final iuj f29599b;

    /* JADX INFO: renamed from: c */
    public final icf f29600c;

    /* JADX INFO: renamed from: d */
    public final ebw f29601d;

    /* JADX INFO: renamed from: e */
    public final gfa f29602e;

    /* JADX INFO: renamed from: f */
    public final gwn f29603f;

    /* JADX INFO: renamed from: g */
    public final cgb f29604g;

    /* JADX INFO: renamed from: h */
    public final oju f29605h;

    /* JADX INFO: renamed from: i */
    public final dbr f29606i;

    /* JADX INFO: renamed from: j */
    public final idg f29607j;

    /* JADX INFO: renamed from: k */
    public final dhv f29608k;

    /* JADX INFO: renamed from: l */
    public final int f29609l;

    /* JADX INFO: renamed from: m */
    public boolean f29610m = true;

    /* JADX INFO: renamed from: n */
    public kmq f29611n;

    /* JADX INFO: renamed from: o */
    public kmq f29612o;

    /* JADX INFO: renamed from: p */
    public final jfs f29613p;

    /* JADX INFO: renamed from: q */
    private final jww f29614q;

    /* JADX INFO: renamed from: r */
    private final Window f29615r;

    /* JADX INFO: renamed from: s */
    private final igb f29616s;

    /* JADX INFO: renamed from: t */
    private final hxp f29617t;

    /* JADX INFO: renamed from: u */
    private final Handler f29618u;

    /* JADX INFO: renamed from: v */
    private final oju f29619v;

    public huu(jww jwwVar, oju ojuVar, Window window, BottomBarController bottomBarController, igb igbVar, iuj iujVar, icf icfVar, hxp hxpVar, ebw ebwVar, gfa gfaVar, jfs jfsVar, gwn gwnVar, Handler handler, cgb cgbVar, oju ojuVar2, dbr dbrVar, idg idgVar, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        this.f29614q = jwwVar;
        this.f29615r = window;
        this.f29598a = bottomBarController;
        this.f29616s = igbVar;
        this.f29609l = window.getAttributes().rotationAnimation;
        this.f29599b = iujVar;
        this.f29600c = icfVar;
        this.f29617t = hxpVar;
        this.f29601d = ebwVar;
        this.f29602e = gfaVar;
        this.f29603f = gwnVar;
        this.f29618u = handler;
        this.f29604g = cgbVar;
        this.f29605h = ojuVar2;
        this.f29606i = dbrVar;
        this.f29613p = jfsVar;
        this.f29607j = idgVar;
        this.f29619v = ojuVar;
        this.f29608k = dhvVar;
    }

    /* JADX INFO: renamed from: A */
    public final void m10767A(int i) {
        WindowManager.LayoutParams attributes = this.f29615r.getAttributes();
        attributes.rotationAnimation = i;
        this.f29615r.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: B */
    public final void m10768B() {
        this.f29599b.mo11728I(true);
        iuj iujVar = this.f29599b;
        if (((ite) iujVar).f32068S) {
            iujVar.mo11765p();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m10769C(ikw ikwVar) {
        this.f29614q.mo3415bf(ikwVar);
        this.f29616s.mo11224af(ikwVar);
        this.f29598a.switchToMode(ikwVar);
    }

    /* JADX INFO: renamed from: r */
    public final Resources m10770r() {
        return m10772t().getResources();
    }

    /* JADX INFO: renamed from: s */
    public final GridLinesUi m10771s() {
        return (GridLinesUi) ((jfs) ((djm) this.f29619v.get()).f11789c).m13100f(C0100R.id.grid_lines);
    }

    /* JADX INFO: renamed from: t */
    public final PreviewOverlay m10772t() {
        return (PreviewOverlay) ((jfs) ((djm) this.f29619v.get()).f11789c).m13100f(C0100R.id.preview_overlay);
    }

    /* JADX INFO: renamed from: u */
    public final void m10773u() {
        this.f29617t.m10837d(false);
        iqh.m11599c();
    }

    /* JADX INFO: renamed from: v */
    public final void m10774v() {
        m10771s().setVisibility(4);
    }

    /* JADX INFO: renamed from: w */
    public final void m10775w() {
        this.f29617t.m10837d(true);
        iqh.m11600d();
    }

    /* JADX INFO: renamed from: x */
    public final void m10776x() {
        this.f29618u.postDelayed(new huh(this, 0), 250L);
    }

    /* JADX INFO: renamed from: y */
    public final void m10777y() {
        m10775w();
        this.f29600c.mo11014m();
        m10772t().f7300d = true;
        m10776x();
        m10768B();
    }

    /* JADX INFO: renamed from: z */
    public final void m10778z() {
        this.f29603f.mo9847c();
        m10772t().f7300d = false;
        this.f29599b.mo11728I(false);
        this.f29599b.mo11763n();
    }
}
