package p000;

import android.widget.VideoView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class iop extends ioo {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ior f31648b;

    public iop(ior iorVar) {
        this.f31648b = iorVar;
    }

    @Override // p000.ioo
    /* JADX INFO: renamed from: a */
    public void mo11562a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.ioo, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        jwl jwlVar = this.f31648b.f31650e;
        if (jwlVar.f34954a) {
            return;
        }
        jwlVar.f34954a = true;
        ((VideoView) jwlVar.f34955b).postDelayed(jwlVar.f34957d, 10L);
    }

    @Override // p000.ioo, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f31648b.f31650e.f34954a = false;
    }
}
