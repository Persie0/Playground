package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjx implements bjo {

    /* JADX INFO: renamed from: a */
    public final String f3542a;

    /* JADX INFO: renamed from: b */
    public final List f3543b;

    /* JADX INFO: renamed from: c */
    public final boolean f3544c;

    public bjx(String str, List list, boolean z) {
        this.f3542a = str;
        this.f3543b = list;
        this.f3544c = z;
    }

    @Override // p000.bjo
    /* JADX INFO: renamed from: a */
    public final bhi mo2528a(bgv bgvVar, bkc bkcVar) {
        return new bhj(bgvVar, bkcVar, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f3542a + "' Shapes: " + Arrays.toString(this.f3543b.toArray()) + "}";
    }
}
