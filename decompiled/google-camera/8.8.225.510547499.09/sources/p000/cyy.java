package p000;

import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cyy extends czf {

    /* JADX INFO: renamed from: a */
    private final iuj f10065a;

    /* JADX INFO: renamed from: b */
    private final Window f10066b;

    /* JADX INFO: renamed from: c */
    private final icf f10067c;

    /* JADX INFO: renamed from: d */
    private final cwd f10068d;

    /* JADX INFO: renamed from: e */
    public final BottomBarController f10069e;

    /* JADX INFO: renamed from: f */
    public final igb f10070f;

    /* JADX INFO: renamed from: g */
    public final hxp f10071g;

    /* JADX INFO: renamed from: h */
    public czf f10072h;

    /* JADX INFO: renamed from: i */
    public final dfn f10073i;

    public cyy(BottomBarController bottomBarController, igb igbVar, iuj iujVar, Window window, hxp hxpVar, cwd cwdVar, icf icfVar, dfn dfnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f10069e = bottomBarController;
        this.f10070f = igbVar;
        this.f10065a = iujVar;
        this.f10066b = window;
        this.f10071g = hxpVar;
        this.f10068d = cwdVar;
        this.f10067c = icfVar;
        this.f10073i = dfnVar;
    }

    @Override // p000.czd
    /* JADX INFO: renamed from: bp */
    public final int mo5731bp() {
        this.f10072h.mo5731bp();
        return this.f10072h.mo5731bp();
    }

    @Override // p000.czf, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public void mo5711f() {
        this.f10068d.m5661h();
        this.f10069e.switchToMode(ikw.VIDEO_INTENT);
        this.f10070f.mo11224af(ikw.VIDEO_INTENT);
        WindowManager.LayoutParams attributes = this.f10066b.getAttributes();
        attributes.rotationAnimation = 3;
        this.f10066b.setAttributes(attributes);
        this.f10065a.mo11721B(false);
        this.f10065a.mo11728I(true);
        iuj iujVar = this.f10065a;
        if (((ite) iujVar).f32068S) {
            iujVar.mo11765p();
        }
        this.f10067c.mo11004c();
        this.f10071g.m10837d(true);
    }

    @Override // p000.czf, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public void mo5712g() {
        this.f10065a.mo11728I(false);
        this.f10065a.mo11721B(false);
        this.f10067c.mo11014m();
    }
}
