package p000;

import android.hardware.camera2.CameraManager;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvk implements fve {

    /* JADX INFO: renamed from: a */
    public final CameraManager f23635a;

    /* JADX INFO: renamed from: b */
    private final kmg f23636b;

    /* JADX INFO: renamed from: c */
    private final Executor f23637c;

    /* JADX INFO: renamed from: d */
    private final hyf f23638d;

    /* JADX INFO: renamed from: e */
    private mxk f23639e;

    /* JADX INFO: renamed from: f */
    private mwx f23640f;

    /* JADX INFO: renamed from: g */
    private fvj f23641g;

    /* JADX INFO: renamed from: h */
    private fvh f23642h;

    /* JADX INFO: renamed from: i */
    private final AmbientModeSupport.AmbientController f23643i = new AmbientModeSupport.AmbientController(this);

    public fvk(cdu cduVar, fvf fvfVar, CameraManager cameraManager, kme kmeVar, hyf hyfVar, Executor executor) {
        kmg kmgVar;
        this.f23639e = mzx.f41874a;
        this.f23640f = mzw.f41870a;
        this.f23635a = cameraManager;
        this.f23638d = hyfVar;
        this.f23637c = kxk.m14956B(executor);
        Iterator it = kmeVar.mo13861h(kmq.f36557a).iterator();
        do {
            if (!it.hasNext()) {
                kmgVar = null;
                break;
            }
            kmgVar = (kmg) it.next();
        } while (!kmeVar.mo13854a(kmgVar).mo14544M());
        this.f23636b = kmgVar;
        if (kmgVar != null) {
            this.f23639e = (mxk) Collection$EL.stream(((kmc) kmeVar.mo13854a(kmgVar)).f36526b).map(egh.f13943i).collect(muc.f41627b);
            this.f23640f = fvfVar.f23625a;
            this.f23642h = new fvh(this.f23639e);
            this.f23641g = new fvj(this.f23642h, kmgVar, this.f23639e);
            jvb jvbVarM3529i = cduVar.m3529i();
            fvj fvjVar = this.f23641g;
            fvjVar.getClass();
            this.f23635a.registerAvailabilityCallback(this.f23637c, fvjVar);
            jvbVarM3529i.m13537d(new eip(this, fvjVar, 14));
        }
        cduVar.m3529i().m13537d(this.f23638d.mo10867a(this.f23643i));
    }

    @Override // p000.fve
    /* JADX INFO: renamed from: a */
    public final kmg mo8823a() {
        kmg kmgVar = this.f23636b;
        if (kmgVar == null) {
            return null;
        }
        nps npsVarM14965K = kxk.m14965K(kmgVar);
        synchronized (this) {
            fvh fvhVar = this.f23642h;
            if (fvhVar != null) {
                fvhVar.f23628b.isDone();
                fvhVar.f23629c.isDone();
                npsVarM14965K = kxk.m14959E(fvhVar.f23628b, fvhVar.f23629c).m17605a(new bdv(fvhVar, 7), not.INSTANCE);
            }
        }
        return (kmg) kxk.m14974T(npsVarM14965K);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8830b(hyd hydVar) {
        fvh fvhVar;
        String str = (String) this.f23640f.get(hydVar.f29901a);
        if (str != null && (fvhVar = this.f23642h) != null) {
            fvhVar.m8828a(str);
            Stream streamFilter = Collection$EL.stream(this.f23639e).filter(new dam(str, 9));
            fvh fvhVar2 = this.f23642h;
            fvhVar2.getClass();
            streamFilter.forEach(new dco(fvhVar2, 19));
        }
    }
}
