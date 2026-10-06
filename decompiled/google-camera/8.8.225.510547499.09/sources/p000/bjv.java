package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjv {

    /* JADX INFO: renamed from: a */
    public final List f3533a;

    /* JADX INFO: renamed from: b */
    public PointF f3534b;

    /* JADX INFO: renamed from: c */
    public boolean f3535c;

    public bjv() {
        this.f3533a = new ArrayList();
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f3533a.size() + "closed=" + this.f3535c + "}";
    }

    public bjv(PointF pointF, boolean z, List list) {
        this.f3534b = pointF;
        this.f3535c = z;
        this.f3533a = new ArrayList(list);
    }
}
