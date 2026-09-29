package p000;

import android.graphics.Path;
import com.airbnb.lottie.C0868b;

/* JADX INFO: loaded from: classes2.dex */
public final class x39 implements cl1 {

    /* JADX INFO: renamed from: a */
    public final boolean f67727a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f67728b;

    /* JADX INFO: renamed from: c */
    public final String f67729c;

    /* JADX INFO: renamed from: d */
    public final C3726wl f67730d;

    /* JADX INFO: renamed from: e */
    public final C3726wl f67731e;

    /* JADX INFO: renamed from: f */
    public final boolean f67732f;

    public x39(String str, boolean z, Path.FillType fillType, C3726wl c3726wl, C3726wl c3726wl2, boolean z2) {
        this.f67729c = str;
        this.f67727a = z;
        this.f67728b = fillType;
        this.f67730d = c3726wl;
        this.f67731e = c3726wl2;
        this.f67732f = z2;
    }

    @Override // p000.cl1
    /* JADX INFO: renamed from: a */
    public final qk1 mo403a(C0868b c0868b, gl5 gl5Var, o90 o90Var) {
        return new x33(c0868b, o90Var, this);
    }

    public final String toString() {
        return ux5.m22993p(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f67727a, '}');
    }
}
