package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Date;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdp implements hes {

    /* JADX INFO: renamed from: a */
    public hev f21459a;

    /* JADX INFO: renamed from: b */
    public final fly f21460b;

    /* JADX INFO: renamed from: c */
    public final hah f21461c;

    /* JADX INFO: renamed from: d */
    public boolean f21462d;

    /* JADX INFO: renamed from: e */
    public hew f21463e;

    /* JADX INFO: renamed from: f */
    public Date f21464f = null;

    /* JADX INFO: renamed from: g */
    public final jfs f21465g;

    /* JADX INFO: renamed from: h */
    private final Resources f21466h;

    /* JADX INFO: renamed from: i */
    private final idf f21467i;

    /* JADX INFO: renamed from: j */
    private kba f21468j;

    public fdp(Resources resources, fly flyVar, hah hahVar, jfs jfsVar, idf idfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21466h = resources;
        this.f21460b = flyVar;
        this.f21461c = hahVar;
        this.f21465g = jfsVar;
        this.f21467i = idfVar;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
        this.f21467i.m11111b(null, null);
        kba kbaVar = this.f21468j;
        kbaVar.getClass();
        kbaVar.close();
        this.f21468j = null;
        m8276c();
        this.f21463e = null;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
        this.f21463e = hewVar;
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f21466h.getString(C0100R.string.longexposure_suggestion_text);
        heuVarM10165a.f27493b = this.f21466h.getDrawable(C0100R.drawable.ic_night_suggestion, null);
        heuVarM10165a.f27494c = new fdo(this, 1);
        heuVarM10165a.f27497f = new fdo(this, 0);
        this.f21459a = heuVarM10165a.m10160a();
        this.f21467i.m11111b(new euz(this, 14), not.INSTANCE);
        this.f21468j = this.f21461c.mo10029a(gzy.f27061t).mo3830a(new euz(this, 15), not.INSTANCE);
    }

    /* JADX INFO: renamed from: c */
    public final void m8276c() {
        hew hewVar = this.f21463e;
        if (hewVar != null) {
            hewVar.mo10130a();
        }
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        this.f21464f = null;
        m8276c();
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        this.f21464f = new Date();
    }
}
