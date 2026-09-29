package p021b0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.AbstractC0454b;
import androidx.compose.material.ripple.C0453a;
import androidx.compose.material.ripple.CommonRippleIndicationInstance;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import dm.C5207g;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p423v.InterfaceC9611i;
import sl.C9072e;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1277b extends AbstractC0454b {
    public C1277b() {
        throw null;
    }

    public C1277b(boolean z10, float f3, InterfaceC5312g0 interfaceC5312g0) {
        super(z10, f3, interfaceC5312g0);
    }

    @Override // androidx.compose.material.ripple.AbstractC0454b
    /* JADX INFO: renamed from: b */
    public final AbstractC1283h mo1553b(InterfaceC9611i interfaceC9611i, boolean z10, float f3, InterfaceC5312g0 interfaceC5312g0, InterfaceC5312g0 interfaceC5312g1, InterfaceC0476a interfaceC0476a) {
        View c1280e;
        C5207g.m11111f(interfaceC9611i, "interactionSource");
        interfaceC0476a.mo1622c(331259447);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(-1737891121);
        Object objMo1648p = interfaceC0476a.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
        while (!(objMo1648p instanceof ViewGroup)) {
            Object parent = ((View) objMo1648p).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objMo1648p + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            C5207g.m11110e(parent, "parent");
            objMo1648p = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objMo1648p;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1622c(1643267286);
        boolean zIsInEditMode = viewGroup.isInEditMode();
        Object obj = InterfaceC0476a.a.f3122a;
        if (zIsInEditMode) {
            interfaceC0476a.mo1622c(511388516);
            boolean zMo1665y = interfaceC0476a.mo1665y(interfaceC9611i) | interfaceC0476a.mo1665y(this);
            Object objMo1624d = interfaceC0476a.mo1624d();
            if (zMo1665y || objMo1624d == obj) {
                objMo1624d = new CommonRippleIndicationInstance(z10, f3, interfaceC5312g0, interfaceC5312g1);
                interfaceC0476a.mo1655t(objMo1624d);
            }
            interfaceC0476a.mo1661w();
            CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) objMo1624d;
            interfaceC0476a.mo1661w();
            interfaceC0476a.mo1661w();
            return commonRippleIndicationInstance;
        }
        interfaceC0476a.mo1661w();
        int childCount = viewGroup.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                c1280e = null;
                break;
            }
            c1280e = viewGroup.getChildAt(i10);
            if (c1280e instanceof C1280e) {
                break;
            }
            i10++;
        }
        if (c1280e == null) {
            Context context = viewGroup.getContext();
            C5207g.m11110e(context, "view.context");
            c1280e = new C1280e(context);
            viewGroup.addView(c1280e);
        }
        interfaceC0476a.mo1622c(1618982084);
        boolean zMo1665y2 = interfaceC0476a.mo1665y(interfaceC9611i) | interfaceC0476a.mo1665y(this) | interfaceC0476a.mo1665y(c1280e);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (zMo1665y2 || objMo1624d2 == obj) {
            objMo1624d2 = new C0453a(z10, f3, interfaceC5312g0, interfaceC5312g1, (C1280e) c1280e);
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        C0453a c0453a = (C0453a) objMo1624d2;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
        interfaceC0476a.mo1661w();
        return c0453a;
    }
}
