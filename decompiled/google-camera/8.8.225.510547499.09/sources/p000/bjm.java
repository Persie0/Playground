package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bjm implements bjl {

    /* JADX INFO: renamed from: a */
    public final List f3484a;

    public bjm(Object obj) {
        this(Collections.singletonList(new bmf(obj)));
    }

    public bjm(List list) {
        this.f3484a = list;
    }

    @Override // p000.bjl
    /* JADX INFO: renamed from: b */
    public final List mo2525b() {
        return this.f3484a;
    }

    @Override // p000.bjl
    /* JADX INFO: renamed from: c */
    public final boolean mo2526c() {
        if (this.f3484a.isEmpty()) {
            return true;
        }
        return this.f3484a.size() == 1 && ((bmf) this.f3484a.get(0)).m2710e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f3484a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f3484a.toArray()));
        }
        return sb.toString();
    }
}
