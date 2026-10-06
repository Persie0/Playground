package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfl implements jgr {

    /* JADX INFO: renamed from: a */
    public final jdu f33884a;

    /* JADX INFO: renamed from: b */
    public final jev f33885b;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jfm f33888e;

    /* JADX INFO: renamed from: f */
    public jhp f33889f = null;

    /* JADX INFO: renamed from: c */
    public Set f33886c = null;

    /* JADX INFO: renamed from: d */
    public boolean f33887d = false;

    public jfl(jfm jfmVar, jdu jduVar, jev jevVar) {
        this.f33888e = jfmVar;
        this.f33884a = jduVar;
        this.f33885b = jevVar;
    }

    @Override // p000.jgr
    /* JADX INFO: renamed from: a */
    public final void mo13037a(jcu jcuVar) {
        this.f33888e.f33903n.post(new ipe(this, jcuVar, 13));
    }

    /* JADX INFO: renamed from: b */
    public final void m13038b(jcu jcuVar) {
        jfj jfjVar = (jfj) this.f33888e.f33900k.get(this.f33885b);
        if (jfjVar != null) {
            jib.m13199d(jfjVar.f33879k.f33903n);
            jdu jduVar = jfjVar.f33870b;
            jduVar.m12943k("onSignInFailed for " + jduVar.getClass().getName() + " with " + String.valueOf(jcuVar));
            jfjVar.mo13030i(jcuVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13039c() {
        jhp jhpVar;
        if (!this.f33887d || (jhpVar = this.f33889f) == null) {
            return;
        }
        this.f33884a.m12949q(jhpVar, this.f33886c);
    }
}
