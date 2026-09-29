package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class eo3 {

    /* JADX INFO: renamed from: a */
    public final int[] f37600a;

    /* JADX INFO: renamed from: b */
    public final boolean f37601b;

    /* JADX INFO: renamed from: c */
    public final boolean f37602c;

    /* JADX INFO: renamed from: d */
    public final boolean f37603d;

    /* JADX INFO: renamed from: e */
    public final boolean f37604e;

    /* JADX INFO: renamed from: f */
    public final boolean f37605f;

    static {
        new eo3(new do3());
    }

    public /* synthetic */ eo3(do3 do3Var) {
        this.f37600a = do3Var.f35943a;
        this.f37601b = do3Var.f35944b;
        this.f37602c = do3Var.f35945c;
        this.f37603d = do3Var.f35946d;
        this.f37604e = do3Var.f35947e;
        do3Var.f35948f.isPresent();
        this.f37605f = true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eo3)) {
            return false;
        }
        eo3 eo3Var = (eo3) obj;
        return x74.m24360q(null, null) && Arrays.equals(this.f37600a, eo3Var.f37600a) && x74.m24360q(null, null) && this.f37601b == eo3Var.f37601b && this.f37602c == eo3Var.f37602c && this.f37603d == eo3Var.f37603d && this.f37604e == eo3Var.f37604e && this.f37605f == eo3Var.f37605f;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Arrays.hashCode(new Object[]{null, 1, bool, bool, bool, -1, Integer.valueOf(Arrays.hashCode(this.f37600a)), null, "", Boolean.valueOf(this.f37601b), Boolean.valueOf(this.f37602c), Boolean.valueOf(this.f37603d), Boolean.valueOf(this.f37604e), Boolean.FALSE, Boolean.valueOf(this.f37605f)});
    }
}
