package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u39 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f63361a;

    /* JADX INFO: renamed from: b */
    public PointF f63362b;

    /* JADX INFO: renamed from: c */
    public boolean f63363c;

    public u39(PointF pointF, boolean z, List list) {
        this.f63362b = pointF;
        this.f63363c = z;
        this.f63361a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public final void m22436a(float f, float f2) {
        if (this.f63362b == null) {
            this.f63362b = new PointF();
        }
        this.f63362b.set(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f63361a.size());
        sb.append("closed=");
        return ux5.m22993p(sb, this.f63363c, '}');
    }

    public u39() {
        this.f63361a = new ArrayList();
    }
}
