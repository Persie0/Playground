package p248ln;

import dm.C5207g;
import java.util.Arrays;
import kn.AbstractC6731a;

/* JADX INFO: renamed from: ln.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7404e extends AbstractC6731a {

    /* JADX INFO: renamed from: g */
    public static final C7404e f41222g = new C7404e(1, 7, 1);

    /* JADX INFO: renamed from: f */
    public final boolean f41223f;

    static {
        new C7404e(new int[0]);
    }

    public C7404e(int... iArr) {
        this(iArr, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7404e(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        C5207g.m11111f(iArr, "versionArray");
        this.f41223f = z10;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14806c() {
        boolean zM13344b;
        boolean z10 = false;
        int i10 = this.f37947c;
        int i11 = this.f37946b;
        if (i11 != 1 || i10 != 0) {
            boolean z11 = this.f41223f;
            C7404e c7404e = f41222g;
            if (z11) {
                zM13344b = m13344b(c7404e);
            } else {
                zM13344b = i11 == c7404e.f37946b && i10 <= c7404e.f37947c + 1;
            }
            if (zM13344b) {
                z10 = true;
            }
        }
        return z10;
    }
}
