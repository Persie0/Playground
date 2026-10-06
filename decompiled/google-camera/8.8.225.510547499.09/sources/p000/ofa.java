package p000;

import com.google.p020vr.cardboard.ExternalSurfaceManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ofa implements ofg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ExternalSurfaceManager f45825a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f45826b;

    public /* synthetic */ ofa(ExternalSurfaceManager externalSurfaceManager, int i) {
        this.f45826b = i;
        this.f45825a = externalSurfaceManager;
    }

    @Override // p000.ofg
    /* JADX INFO: renamed from: a */
    public final void mo18456a(ofe ofeVar) {
        switch (this.f45826b) {
            case 0:
                ofb ofbVar = this.f45825a.f8443a;
                if (ofeVar.f45841i && ofeVar.f45836d.get() > 0) {
                    ofeVar.f45836d.decrementAndGet();
                    ofeVar.f45839g.updateTexImage();
                    ofeVar.f45839g.getTransformMatrix(ofeVar.f45835c);
                    ofbVar.m18457a(ofeVar.f45833a, ofeVar.f45838f[0], ofeVar.f45839g.getTimestamp(), ofeVar.f45835c);
                }
                break;
            default:
                ofb ofbVar2 = this.f45825a.f8443a;
                if (ofeVar.f45841i && ofeVar.f45836d.getAndSet(0) > 0) {
                    ofeVar.f45839g.updateTexImage();
                    ofeVar.f45839g.getTransformMatrix(ofeVar.f45835c);
                    ofbVar2.m18457a(ofeVar.f45833a, ofeVar.f45838f[0], ofeVar.f45839g.getTimestamp(), ofeVar.f45835c);
                }
                break;
        }
    }
}
