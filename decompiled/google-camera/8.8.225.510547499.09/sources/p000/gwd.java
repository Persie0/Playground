package p000;

import android.view.View;
import com.google.android.apps.camera.uiutils.ReplaceableView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gwd implements gwp {

    /* JADX INFO: renamed from: a */
    public final int f26574a;

    /* JADX INFO: renamed from: b */
    public boolean f26575b;

    /* JADX INFO: renamed from: c */
    private final jvd f26576c;

    /* JADX INFO: renamed from: d */
    private final jwn f26577d;

    /* JADX INFO: renamed from: e */
    private gwf f26578e;

    /* JADX INFO: renamed from: f */
    private jwn f26579f;

    /* JADX INFO: renamed from: g */
    private jwn f26580g;

    /* JADX INFO: renamed from: h */
    private jwn f26581h;

    /* JADX INFO: renamed from: i */
    private int f26582i;

    /* JADX INFO: renamed from: j */
    private gwg f26583j;

    /* JADX INFO: renamed from: k */
    private ilo f26584k;

    public gwd(jvd jvdVar, dhv dhvVar, jww jwwVar) {
        this.f26576c = jvdVar;
        this.f26577d = jwwVar;
        if (dhvVar.mo6184l(dib.f11245aE)) {
            this.f26574a = ((Integer) dhvVar.mo6173a(dib.f11368j).get()).intValue();
        } else {
            this.f26574a = ((Integer) dhvVar.mo6173a(dib.f11366h).get()).intValue() | (-16777216);
        }
    }

    @Override // p000.gwp
    /* JADX INFO: renamed from: a */
    public final nps mo9849a() {
        ilo iloVar = this.f26584k;
        lku.m15662p(iloVar);
        iloVar.m11438a();
        gwf gwfVar = this.f26578e;
        lku.m15662p(gwfVar);
        gwfVar.setVisibility(8);
        nps npsVarM9854a = gwf.m9854a();
        npsVarM9854a.mo2282d(new cik(20), not.INSTANCE);
        return npsVarM9854a;
    }

    @Override // p000.gwp
    /* JADX INFO: renamed from: b */
    public final nps mo9850b() {
        if (this.f26577d.mo3831be() == ikw.LONG_EXPOSURE) {
            ilo iloVar = this.f26584k;
            lku.m15662p(iloVar);
            iloVar.m11439b(this.f26582i);
        } else {
            ilo iloVar2 = this.f26584k;
            lku.m15662p(iloVar2);
            iloVar2.m11440c();
        }
        gwf gwfVar = this.f26578e;
        lku.m15662p(gwfVar);
        gwfVar.setVisibility(0);
        return gwf.m9854a();
    }

    /* JADX INFO: renamed from: c */
    public final void m9851c() {
        if (mo9852d()) {
            this.f26583j.mo9815b();
        } else {
            this.f26583j.mo9848d();
        }
    }

    @Override // p000.gwp
    /* JADX INFO: renamed from: d */
    public final boolean mo9852d() {
        if (!this.f26575b) {
            return false;
        }
        ikw ikwVar = (ikw) this.f26577d.mo3831be();
        boolean z = ikwVar == ikw.VIDEO || ikwVar == ikw.VIDEO_INTENT;
        boolean z2 = ikwVar == ikw.PHOTO || ikwVar == ikw.IMAGE_INTENT || ikwVar == ikw.PORTRAIT;
        return (z && ((String) ((jwf) this.f26579f).f34942d).equals("torch")) || (z2 && ((String) ((jwf) this.f26580g).f34942d).equals("on")) || (ikwVar == ikw.LONG_EXPOSURE && ((String) ((jwf) this.f26581h).f34942d).equals("torch"));
    }

    @Override // p000.gwp
    /* JADX INFO: renamed from: e */
    public final void mo9853e(gwg gwgVar, jvb jvbVar, ReplaceableView replaceableView, gwq gwqVar, ilo iloVar, jwn jwnVar, jwn jwnVar2, jwn jwnVar3, jwn jwnVar4) {
        this.f26579f = jwnVar;
        this.f26580g = jwnVar2;
        this.f26581h = jwnVar3;
        this.f26584k = iloVar;
        this.f26582i = gwqVar.mo9859a();
        gwf gwfVar = new gwf(replaceableView.getContext());
        this.f26578e = gwfVar;
        gwfVar.setId(View.generateViewId());
        this.f26578e.setBackgroundColor(this.f26574a);
        replaceableView.m4509a(this.f26578e);
        this.f26583j = gwgVar;
        gwgVar.mo5711f();
        jvbVar.m13537d(this.f26579f.mo3830a(new gmd(this, 5), this.f26576c));
        jvbVar.m13537d(jwnVar2.mo3830a(new gmd(this, 6), this.f26576c));
        jvbVar.m13537d(jwnVar3.mo3830a(new gmd(this, 7), this.f26576c));
        jvbVar.m13537d(this.f26577d.mo3830a(new gmd(this, 8), this.f26576c));
        jvbVar.m13537d(jwnVar4.mo3830a(new gmd(this, 9), this.f26576c));
    }
}
