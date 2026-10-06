package p000;

import android.content.SharedPreferences;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clo {

    /* JADX INFO: renamed from: a */
    public final jwf f6147a;

    /* JADX INFO: renamed from: b */
    public final cmg f6148b;

    /* JADX INFO: renamed from: c */
    public final hht f6149c;

    /* JADX INFO: renamed from: d */
    public boolean f6150d;

    /* JADX INFO: renamed from: e */
    public final mpx f6151e;

    /* JADX INFO: renamed from: f */
    public final dsx f6152f;

    /* JADX INFO: renamed from: g */
    private final SharedPreferences f6153g;

    /* JADX INFO: renamed from: h */
    private final cme f6154h;

    public clo(SharedPreferences sharedPreferences, jwn jwnVar, jwf jwfVar, mpx mpxVar, cmg cmgVar, dsx dsxVar, cme cmeVar, jww jwwVar, cdu cduVar, hht hhtVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f6153g = sharedPreferences;
        this.f6147a = jwfVar;
        this.f6151e = mpxVar;
        this.f6148b = cmgVar;
        this.f6152f = dsxVar;
        this.f6154h = cmeVar;
        this.f6149c = hhtVar;
        jvb jvbVarM3529i = cduVar.m3529i();
        jvbVarM3529i.m13537d(jwj.m13624c(jwnVar).mo3830a(new cdb(this, jwwVar, 6), not.INSTANCE));
        jvbVarM3529i.m13537d(jwwVar.mo3830a(new ckv(this, 4), not.INSTANCE));
    }

    /* JADX INFO: renamed from: a */
    public final void m3922a() {
        cme cmeVar = this.f6154h;
        if (cmeVar.f6215f) {
            cmeVar.f6213d.post(new cmd(cmeVar, 1));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3923b() {
        this.f6153g.edit().putBoolean("autotimer_tutorial_shown", true).apply();
    }

    /* JADX INFO: renamed from: c */
    public final void m3924c() {
        if (m3927f() && m3928g()) {
            cme cmeVar = this.f6154h;
            if (!cmeVar.f6215f) {
                cmeVar.f6213d = (ConstraintLayout) cmeVar.f6216g.m13100f(C0100R.id.camera_app_root);
                cmeVar.f6211b = new cmf(cmeVar.f6210a);
                cmeVar.f6212c = new cmc(cmeVar.f6210a);
                cmeVar.f6211b.setId(View.generateViewId());
                cmeVar.f6212c.setId(View.generateViewId());
                cmeVar.f6213d.addView(cmeVar.f6211b);
                cmeVar.f6213d.addView(cmeVar.f6212c);
                hzb hzbVar = (hzb) cmeVar.f6211b.getLayoutParams();
                hzbVar.f30004ax = 2;
                cmeVar.f6211b.setLayoutParams(hzbVar);
                hzb hzbVar2 = (hzb) cmeVar.f6212c.getLayoutParams();
                hzbVar2.f30004ax = 3;
                cmeVar.f6212c.setLayoutParams(hzbVar2);
                cmeVar.f6211b.setOnTouchListener(cmeVar.f6214e);
                cmeVar.f6215f = true;
            }
            int i = 0;
            cmeVar.f6213d.post(new cmd(cmeVar, i));
            cme cmeVar2 = this.f6154h;
            cmeVar2.f6214e = new cln(this, i);
            if (cmeVar2.f6215f) {
                cmeVar2.f6211b.setOnTouchListener(cmeVar2.f6214e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3925d(clv clvVar) {
        Object obj = this.f6147a.f34942d;
        this.f6147a.mo3415bf(clvVar);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3926e() {
        return this.f6147a.f34942d == clv.CAPTURING;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3927f() {
        return this.f6147a.f34942d != clv.DISABLED;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3928g() {
        return !this.f6153g.getBoolean("autotimer_tutorial_shown", false);
    }
}
