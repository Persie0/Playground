package p000;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bik extends bmf {

    /* JADX INFO: renamed from: a */
    public Path f3414a;

    /* JADX INFO: renamed from: o */
    private final bmf f3415o;

    public bik(bgm bgmVar, bmf bmfVar) {
        super(bgmVar, (PointF) bmfVar.f3759b, (PointF) bmfVar.f3760c, bmfVar.f3761d, bmfVar.f3762e, bmfVar.f3763f, bmfVar.f3764g, bmfVar.f3765h);
        this.f3415o = bmfVar;
        m2503a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2503a() {
        Object obj;
        Object obj2;
        Object obj3 = this.f3760c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.f3759b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.f3760c).y)) {
            z = true;
        }
        Object obj4 = this.f3759b;
        if (obj4 == null || (obj = this.f3760c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj4;
        PointF pointF2 = (PointF) obj;
        bmf bmfVar = this.f3415o;
        PointF pointF3 = bmfVar.f3770m;
        PointF pointF4 = bmfVar.f3771n;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        this.f3414a = path;
    }
}
