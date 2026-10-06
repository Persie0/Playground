package p000;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cms extends iqc {

    /* JADX INFO: renamed from: a */
    public kmq f6312a;

    /* JADX INFO: renamed from: b */
    cmr f6313b;

    /* JADX INFO: renamed from: c */
    public fvu f6314c;

    /* JADX INFO: renamed from: d */
    public oyo f6315d;

    /* JADX INFO: renamed from: e */
    private final ild f6316e;

    /* JADX INFO: renamed from: f */
    private final dbr f6317f;

    /* JADX INFO: renamed from: g */
    private final jwn f6318g;

    /* JADX INFO: renamed from: h */
    private final hzu f6319h;

    public cms(ild ildVar, hzu hzuVar, kms kmsVar, dbr dbrVar, cdu cduVar, dhv dhvVar, dnn dnnVar, jwn jwnVar) {
        this.f6316e = ildVar;
        this.f6319h = hzuVar;
        this.f6317f = dbrVar;
        this.f6318g = jwnVar;
        cduVar.m3529i().m13537d(dbrVar.mo3830a(new ckv(this, 6), not.INSTANCE));
        kmq kmqVarMo5895d = dbrVar.mo5895d();
        this.f6312a = kmqVarMo5895d;
        kmg kmgVarM6439b = dnnVar.m6439b(kmsVar, dhvVar, kmqVarMo5895d);
        kmgVarM6439b.getClass();
        this.f6315d = new oyo(kmsVar.m14581f(kmgVarM6439b).mo14553f());
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo3470a(PointF pointF) {
        boolean z = false;
        if (this.f6315d == null) {
            return false;
        }
        ild ildVar = this.f6316e;
        RectF rectFM10960a = this.f6319h.m10960a();
        if (this.f6317f.mo5895d().equals(kmq.f36557a) || ((Boolean) this.f6318g.mo3831be()).booleanValue()) {
            z = true;
        }
        this.f6315d.m19203g(ildVar.m11423a(pointF, rectFM10960a, z));
        cmr cmrVar = this.f6313b;
        if (cmrVar != null) {
            ((cmp) cmrVar).f6269j++;
        }
        return true;
    }
}
