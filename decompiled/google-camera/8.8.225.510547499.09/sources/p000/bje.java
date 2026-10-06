package p000;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bje implements bjl {

    /* JADX INFO: renamed from: a */
    public final List f3472a;

    public bje() {
        this.f3472a = Collections.singletonList(new bmf(new PointF(0.0f, 0.0f)));
    }

    public bje(List list) {
        this.f3472a = list;
    }

    @Override // p000.bjl
    /* JADX INFO: renamed from: a */
    public final bie mo2524a() {
        return ((bmf) this.f3472a.get(0)).m2710e() ? new bim(this.f3472a) : new bil(this.f3472a);
    }

    @Override // p000.bjl
    /* JADX INFO: renamed from: b */
    public final List mo2525b() {
        return this.f3472a;
    }

    @Override // p000.bjl
    /* JADX INFO: renamed from: c */
    public final boolean mo2526c() {
        return this.f3472a.size() == 1 && ((bmf) this.f3472a.get(0)).m2710e();
    }
}
