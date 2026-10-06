package p000;

import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hwo extends hwl {

    /* JADX INFO: renamed from: a */
    private final jww f29716a;

    /* JADX INFO: renamed from: b */
    private final Window f29717b;

    /* JADX INFO: renamed from: c */
    private final icf f29718c;

    /* JADX INFO: renamed from: d */
    public final BottomBarController f29719d;

    /* JADX INFO: renamed from: e */
    public final igb f29720e;

    /* JADX INFO: renamed from: f */
    public final iuj f29721f;

    /* JADX INFO: renamed from: g */
    public final hxp f29722g;

    /* JADX INFO: renamed from: h */
    public final gfa f29723h;

    /* JADX INFO: renamed from: i */
    private final cwd f29724i;

    public hwo(jww jwwVar, BottomBarController bottomBarController, igb igbVar, iuj iujVar, Window window, hxp hxpVar, cwd cwdVar, gfa gfaVar, icf icfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29716a = jwwVar;
        this.f29719d = bottomBarController;
        this.f29720e = igbVar;
        this.f29717b = window;
        this.f29722g = hxpVar;
        this.f29724i = cwdVar;
        bottomBarController.switchToMode(ikw.IMAGE_INTENT);
        igbVar.mo11224af(ikw.IMAGE_INTENT);
        this.f29721f = iujVar;
        this.f29723h = gfaVar;
        this.f29718c = icfVar;
    }

    @Override // p000.hwl, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public void mo5711f() {
        WindowManager.LayoutParams attributes = this.f29717b.getAttributes();
        attributes.rotationAnimation = 3;
        this.f29717b.setAttributes(attributes);
        this.f29724i.m5661h();
        this.f29716a.mo3415bf(ikw.IMAGE_INTENT);
        this.f29721f.mo11728I(true);
        iuj iujVar = this.f29721f;
        if (((ite) iujVar).f32068S) {
            iujVar.mo11765p();
        }
        this.f29721f.mo11721B(false);
        this.f29718c.mo11004c();
    }

    @Override // p000.hwl, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public void mo5712g() {
        this.f29721f.mo11728I(false);
        this.f29721f.mo11721B(false);
        this.f29718c.mo11014m();
    }
}
