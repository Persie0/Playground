package androidx.compose.p002ui.node;

import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import p000.d16;
import p000.fa2;
import p000.fb2;
import p000.hta;
import p000.k40;
import p000.l77;
import p000.se1;
import p000.te1;
import p000.tf1;
import p000.tl6;
import p000.vf1;
import p000.vh9;
import p000.x66;
import p000.xfa;
import p000.xwc;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final class ComposeUiNode$Companion$SetResolvedCompositionLocals$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final ComposeUiNode$Companion$SetResolvedCompositionLocals$1 f4228b = new ComposeUiNode$Companion$SetResolvedCompositionLocals$1(2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [d16] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [d16] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [x66] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        vf1 vf1Var = (vf1) obj2;
        C0357g c0357g = (C0357g) ((se1) obj);
        c0357g.f4330W = vf1Var;
        k40 k40Var = c0357g.f4335a0;
        vh9 vh9Var = AbstractC0402n.f4816h;
        l77 l77Var = (l77) vf1Var;
        l77Var.getClass();
        c0357g.m1589f0((fb2) xwc.m24743P(l77Var, vh9Var));
        l77 l77Var2 = (l77) vf1Var;
        LayoutDirection layoutDirection = (LayoutDirection) xwc.m24743P(l77Var2, AbstractC0402n.f4822n);
        if (c0357g.f4328U != layoutDirection) {
            c0357g.f4328U = layoutDirection;
            c0357g.m1566I();
            C0357g c0357gM1610w = c0357g.m1610w();
            if (c0357gM1610w != null) {
                c0357gM1610w.m1563F();
            } else {
                Owner owner = c0357g.f4316I;
                if (owner != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).invalidate();
                }
            }
            c0357g.m1564G();
            for (d16 d16Var = (d16) k40Var.f46679g; d16Var != null; d16Var = d16Var.f34842f) {
                d16Var.mo1344V();
            }
        }
        c0357g.m1597k0((hta) xwc.m24743P(l77Var2, AbstractC0402n.f4829u));
        d16 d16Var2 = (d16) k40Var.f46679g;
        if ((d16Var2.f34840d & 32768) != 0) {
            while (d16Var2 != null) {
                if ((d16Var2.f34839c & 32768) != 0) {
                    ?? M21992f = d16Var2;
                    ?? x66Var = 0;
                    while (M21992f != 0) {
                        if (M21992f instanceof tf1) {
                            d16 d16Var3 = ((d16) ((tf1) M21992f)).f34837a;
                            if (d16Var3.f34836I) {
                                tl6.m22195c(d16Var3);
                            } else {
                                d16Var3.f34846j = true;
                            }
                        } else if ((M21992f.f34839c & 32768) != 0 && (M21992f instanceof fa2)) {
                            d16 d16Var4 = ((fa2) M21992f).f38701K;
                            int i = 0;
                            while (d16Var4 != null) {
                                if ((d16Var4.f34839c & 32768) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                        x66Var = x66Var;
                                        M21992f = d16Var4;
                                    } else {
                                        if (x66Var == 0) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (M21992f != 0) {
                                            x66Var.m24305c(M21992f);
                                            M21992f = 0;
                                        }
                                        x66Var.m24305c(d16Var4);
                                    }
                                } else {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                                d16Var4 = d16Var4.f34842f;
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                            if (i == 1) {
                                M21992f = M21992f;
                                x66Var = x66Var;
                            } else {
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                        }
                        M21992f = te1.m21992f(x66Var);
                    }
                }
                if ((d16Var2.f34840d & 32768) == 0) {
                    break;
                }
                d16Var2 = d16Var2.f34842f;
            }
        }
        return xfa.f68157a;
    }
}
