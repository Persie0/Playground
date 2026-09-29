package androidx.compose.p002ui.relocation;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.d16;
import p000.e28;
import p000.ea2;
import p000.fa2;
import p000.hi0;
import p000.i54;
import p000.ir9;
import p000.k40;
import p000.omd;
import p000.te1;
import p000.ui3;
import p000.wfb;
import p000.x66;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.relocation.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0415a {
    /* JADX INFO: renamed from: a */
    public static final Object m1826a(ea2 ea2Var, final ui3 ui3Var, ContinuationImpl continuationImpl) {
        Object obj;
        final AbstractC0362l abstractC0362lM21978K;
        Object objMo1048m0;
        k40 k40Var;
        if (((d16) ea2Var).f34837a.f34836I) {
            d16 d16Var = (d16) ea2Var;
            if (!d16Var.f34837a.f34836I) {
                i54.m13663b("visitAncestors called on an unattached node");
            }
            d16 d16Var2 = d16Var.f34837a.f34841e;
            C0357g c0357gM21979L = te1.m21979L(ea2Var);
            loop0: while (true) {
                obj = null;
                if (c0357gM21979L == null) {
                    break;
                }
                if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 524288) != 0) {
                    while (d16Var2 != null) {
                        if ((d16Var2.f34839c & 524288) != 0) {
                            d16 d16VarM21992f = d16Var2;
                            x66 x66Var = null;
                            while (d16VarM21992f != null) {
                                if (d16VarM21992f instanceof hi0) {
                                    obj = d16VarM21992f;
                                    break loop0;
                                }
                                if ((d16VarM21992f.f34839c & 524288) != 0 && (d16VarM21992f instanceof fa2)) {
                                    int i = 0;
                                    for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                        if ((d16Var3.f34839c & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                d16VarM21992f = d16Var3;
                                            } else {
                                                if (x66Var == null) {
                                                    x66Var = new x66(new d16[16]);
                                                }
                                                if (d16VarM21992f != null) {
                                                    x66Var.m24305c(d16VarM21992f);
                                                    d16VarM21992f = null;
                                                }
                                                x66Var.m24305c(d16Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                d16VarM21992f = te1.m21992f(x66Var);
                            }
                        }
                        d16Var2 = d16Var2.f34841e;
                    }
                }
                c0357gM21979L = c0357gM21979L.m1610w();
                d16Var2 = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
            }
            hi0 hi0Var = (hi0) obj;
            if (hi0Var != null && (objMo1048m0 = hi0Var.mo1048m0((abstractC0362lM21978K = te1.m21978K(ea2Var)), new ui3() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    e28 e28Var;
                    ui3 ui3Var2 = ui3Var;
                    if (ui3Var2 != null && (e28Var = (e28) ui3Var2.mo0a()) != null) {
                        return e28Var;
                    }
                    AbstractC0362l abstractC0362l = abstractC0362lM21978K;
                    if (!abstractC0362l.mo1543f1().f34836I) {
                        abstractC0362l = null;
                    }
                    if (abstractC0362l != null) {
                        return wfb.m23907b(0L, omd.m18152h0(abstractC0362l.f49303c));
                    }
                    return null;
                }
            }, continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objMo1048m0;
            }
        }
        return xfa.f68157a;
    }
}
