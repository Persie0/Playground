package p000;

import com.airbnb.lottie.C0868b;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z39 implements cl1 {

    /* JADX INFO: renamed from: a */
    public final String f70836a;

    /* JADX INFO: renamed from: b */
    public final List f70837b;

    /* JADX INFO: renamed from: c */
    public final boolean f70838c;

    public z39(String str, List list, boolean z) {
        this.f70836a = str;
        this.f70837b = list;
        this.f70838c = z;
    }

    @Override // p000.cl1
    /* JADX INFO: renamed from: a */
    public final qk1 mo403a(C0868b c0868b, gl5 gl5Var, o90 o90Var) {
        return new uk1(c0868b, o90Var, this, gl5Var);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f70836a + "' Shapes: " + Arrays.toString(this.f70837b.toArray()) + '}';
    }
}
