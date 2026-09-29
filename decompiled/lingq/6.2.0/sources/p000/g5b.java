package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g5b implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final m80 f40254a;

    /* JADX INFO: renamed from: b */
    public f6b f40255b;

    public g5b(View view, m80 m80Var) {
        f6b f6bVarMo17237b;
        this.f40254a = m80Var;
        WeakHashMap weakHashMap = dta.f36217a;
        f6b f6bVarM24661a = xsa.m24661a(view);
        if (f6bVarM24661a != null) {
            int i = Build.VERSION.SDK_INT;
            f6bVarMo17237b = (i >= 36 ? new s5b(f6bVarM24661a) : i >= 35 ? new r5b(f6bVarM24661a) : i >= 34 ? new q5b(f6bVarM24661a) : i >= 31 ? new p5b(f6bVarM24661a) : i >= 30 ? new o5b(f6bVarM24661a) : new n5b(f6bVarM24661a)).mo17237b();
        } else {
            f6bVarMo17237b = null;
        }
        this.f40255b = f6bVarMo17237b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f40255b = f6b.m11570g(view, windowInsets);
            return h5b.m13065j(view, windowInsets);
        }
        f6b f6bVarM11570g = f6b.m11570g(view, windowInsets);
        c6b c6bVar = f6bVarM11570g.f38536a;
        if (this.f40255b == null) {
            WeakHashMap weakHashMap = dta.f36217a;
            this.f40255b = xsa.m24661a(view);
        }
        if (this.f40255b == null) {
            this.f40255b = f6bVarM11570g;
            return h5b.m13065j(view, windowInsets);
        }
        m80 m80VarM13066k = h5b.m13066k(view);
        if (m80VarM13066k != null && Objects.equals((f6b) m80VarM13066k.f50744b, f6bVarM11570g)) {
            return h5b.m13065j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        f6b f6bVar = this.f40255b;
        int i = 1;
        while (i <= 512) {
            l64 l64VarMo136i = c6bVar.mo136i(i);
            l64 l64VarMo136i2 = f6bVar.f38536a.mo136i(i);
            int i2 = l64VarMo136i.f49116a;
            int i3 = l64VarMo136i.f49119d;
            int i4 = l64VarMo136i.f49118c;
            int i5 = l64VarMo136i.f49117b;
            int i6 = l64VarMo136i2.f49116a;
            int i7 = l64VarMo136i2.f49119d;
            int i8 = l64VarMo136i2.f49118c;
            int i9 = l64VarMo136i2.f49117b;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.f40255b = f6bVarM11570g;
            return h5b.m13065j(view, windowInsets);
        }
        f6b f6bVar2 = this.f40255b;
        if ((i10 & 8) != 0) {
            interpolator = h5b.f41821e;
        } else if ((i11 & 8) != 0) {
            interpolator = h5b.f41822f;
        } else if ((i10 & 519) != 0) {
            interpolator = h5b.f41823g;
        } else {
            interpolator = (i11 & 519) != 0 ? h5b.f41824h : null;
        }
        m5b m5bVar = new m5b(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        m5bVar.f50624a.mo14860e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(m5bVar.f50624a.mo14857b());
        l64 l64VarMo136i3 = c6bVar.mo136i(i12);
        l64 l64VarMo136i4 = f6bVar2.f38536a.mo136i(i12);
        int iMin = Math.min(l64VarMo136i3.f49116a, l64VarMo136i4.f49116a);
        int i13 = l64VarMo136i3.f49117b;
        int i14 = l64VarMo136i4.f49117b;
        int iMin2 = Math.min(i13, i14);
        int i15 = l64VarMo136i3.f49118c;
        int i16 = l64VarMo136i4.f49118c;
        int iMin3 = Math.min(i15, i16);
        int i17 = l64VarMo136i3.f49119d;
        int i18 = l64VarMo136i4.f49119d;
        p33 p33Var = new p33(29, l64.m15830c(iMin, iMin2, iMin3, Math.min(i17, i18)), l64.m15830c(Math.max(l64VarMo136i3.f49116a, l64VarMo136i4.f49116a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        h5b.m13062g(view, m5bVar, f6bVarM11570g, false);
        duration.addUpdateListener(new f5b(m5bVar, f6bVarM11570g, f6bVar2, i12, view));
        duration.addListener(new ss3(3, view, m5bVar));
        sx6.m21765a(view, new jo0(view, m5bVar, p33Var, duration, 1, false));
        this.f40255b = f6bVarM11570g;
        return h5b.m13065j(view, windowInsets);
    }
}
