package p000;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cce implements ccd {

    /* JADX INFO: renamed from: a */
    public final jwn f5109a;

    /* JADX INFO: renamed from: b */
    public final fcp f5110b;

    /* JADX INFO: renamed from: c */
    private final ild f5111c;

    /* JADX INFO: renamed from: d */
    private final jwn f5112d;

    /* JADX INFO: renamed from: e */
    private final cbu f5113e;

    /* JADX INFO: renamed from: f */
    private final boolean f5114f;

    /* JADX INFO: renamed from: g */
    private final hzu f5115g;

    public cce(ild ildVar, hzu hzuVar, jwn jwnVar, jwn jwnVar2, fcp fcpVar, boolean z, cbu cbuVar) {
        this.f5111c = ildVar;
        this.f5115g = hzuVar;
        this.f5109a = jwnVar;
        this.f5112d = jwnVar2;
        this.f5110b = fcpVar;
        this.f5113e = cbuVar;
        this.f5114f = z;
    }

    @Override // p000.ccd
    /* JADX INFO: renamed from: a */
    public final cdj mo3426a(jvb jvbVar, kmq kmqVar, PointF pointF, cdh cdhVar) {
        boolean z;
        RectF rectFM10960a = this.f5115g.m10960a();
        ild ildVar = this.f5111c;
        if (kmqVar.equals(kmq.f36557a)) {
            z = true;
        } else {
            z = false;
            if (this.f5114f && ((Boolean) this.f5112d.mo3831be()).booleanValue()) {
                z = true;
            }
        }
        cdj cdjVarMo3409bh = this.f5113e.mo3409bh(new bko(ildVar.m11423a(pointF, rectFM10960a, z)));
        jvbVar.m13537d(cdhVar.f5299a.mo3830a(new ctz(this, pointF, rectFM10960a, 1), not.INSTANCE));
        return cdjVarMo3409bh;
    }
}
