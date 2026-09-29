package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d16;
import p000.fa2;
import p000.fg7;
import p000.gq6;
import p000.i54;
import p000.im9;
import p000.kg7;
import p000.pk9;
import p000.te1;
import p000.x66;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", m4291f = "StylusHandwriting.kt", m4292l = {116, 144, 182}, m4293m = "invokeSuspend", m4294v = 1)
final class StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public kg7 f2910b;

    /* JADX INFO: renamed from: c */
    public PointerEventPass f2911c;

    /* JADX INFO: renamed from: d */
    public int f2912d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2913e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ im9 f2914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(im9 im9Var, Continuation continuation) {
        super(2, continuation);
        this.f2914f = im9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 stylusHandwritingNode$suspendingPointerInputModifierNode$1$1 = new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.f2914f, continuation);
        stylusHandwritingNode$suspendingPointerInputModifierNode$1$1.f2913e = obj;
        return stylusHandwritingNode$suspendingPointerInputModifierNode$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StylusHandwritingNode$suspendingPointerInputModifierNode$1$1) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x022d, code lost:
    
        if (r4 == r1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r9 == r1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        if (r11 == r1) goto L139;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x022d -> B:140:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c4 -> B:40:0x00c8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0332f c0332f;
        Object objM938a;
        kg7 kg7Var;
        boolean z;
        C0332f c0332f2;
        PointerEventPass pointerEventPass;
        Object objM1473b;
        Object obj2;
        kg7 kg7Var2;
        C0332f c0332f3;
        Object obj3;
        Object objM1473b2;
        Object obj4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2912d;
        im9 im9Var = this.f2914f;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                c0332f = (C0332f) this.f2913e;
                AbstractC3193b.m15359b(obj);
                objM938a = obj;
            } else {
                if (i == 2) {
                    pointerEventPass = this.f2911c;
                    kg7Var = this.f2910b;
                    c0332f2 = (C0332f) this.f2913e;
                    AbstractC3193b.m15359b(obj);
                    objM1473b = obj;
                    fg7 fg7Var = (fg7) objM1473b;
                    List list = fg7Var.f39071a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj2 = null;
                            break;
                        }
                        obj2 = list.get(i3);
                        kg7 kg7Var3 = (kg7) obj2;
                        if (!kg7Var3.m15191c() && pk9.m19371i(kg7Var3.f47235a, kg7Var.f47235a) && kg7Var3.f47238d) {
                            break;
                        }
                        i3++;
                    }
                    kg7 kg7Var4 = (kg7) obj2;
                    if (kg7Var4 != null && kg7Var4.f47236b - kg7Var.f47236b < c0332f2.m1475f().mo13456b()) {
                        i2 = 2;
                        if (fg7Var.f39073c != 2) {
                            if (gq6.m12822c(gq6.m12824e(kg7Var4.f47237c, kg7Var.f47237c)) <= c0332f2.m1475f().mo13457c()) {
                                this.f2913e = c0332f2;
                                this.f2910b = kg7Var;
                                this.f2911c = pointerEventPass;
                                this.f2912d = i2;
                                objM1473b = c0332f2.m1473b(pointerEventPass, this);
                            }
                            return xfa.f68157a;
                        }
                        kg7Var4 = null;
                    } else {
                        kg7Var4 = null;
                    }
                    if (kg7Var4 != null) {
                        if (!im9Var.f44295M) {
                            d16 d16VarM21992f = im9Var.f34837a;
                            x66 x66Var = null;
                            while (true) {
                                if (d16VarM21992f == null) {
                                    if (!im9Var.f34837a.f34836I) {
                                        i54.m13663b("visitChildren called on an unattached node");
                                    }
                                    x66 x66Var2 = new x66(new d16[16]);
                                    d16 d16Var = im9Var.f34837a;
                                    d16 d16Var2 = d16Var.f34842f;
                                    if (d16Var2 == null) {
                                        te1.m21990d(x66Var2, d16Var);
                                    } else {
                                        x66Var2.m24305c(d16Var2);
                                    }
                                    loop4: while (true) {
                                        int i4 = x66Var2.f67832c;
                                        if (i4 == 0) {
                                            break;
                                        }
                                        d16 d16VarM21992f2 = (d16) x66Var2.m24314l(i4 - 1);
                                        if ((d16VarM21992f2.f34840d & 1024) == 0) {
                                            te1.m21990d(x66Var2, d16VarM21992f2);
                                        } else {
                                            while (true) {
                                                if (d16VarM21992f2 == null) {
                                                    continue;
                                                } else if ((d16VarM21992f2.f34839c & 1024) != 0) {
                                                    x66 x66Var3 = null;
                                                    while (true) {
                                                        if (d16VarM21992f2 == null) {
                                                            continue;
                                                        } else {
                                                            if (d16VarM21992f2 instanceof C0302d) {
                                                                ((C0302d) d16VarM21992f2).m1375g1(7);
                                                                break;
                                                            }
                                                            if ((d16VarM21992f2.f34839c & 1024) == 0 || !(d16VarM21992f2 instanceof fa2)) {
                                                                d16VarM21992f2 = te1.m21992f(x66Var3);
                                                            } else {
                                                                int i5 = 0;
                                                                for (d16 d16Var3 = ((fa2) d16VarM21992f2).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                                                    if ((d16Var3.f34839c & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            d16VarM21992f2 = d16Var3;
                                                                        } else {
                                                                            if (x66Var3 == null) {
                                                                                x66Var3 = new x66(new d16[16]);
                                                                            }
                                                                            if (d16VarM21992f2 != null) {
                                                                                x66Var3.m24305c(d16VarM21992f2);
                                                                                d16VarM21992f2 = null;
                                                                            }
                                                                            x66Var3.m24305c(d16Var3);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 != 1) {
                                                                    d16VarM21992f2 = te1.m21992f(x66Var3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    d16VarM21992f2 = d16VarM21992f2.f34842f;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (d16VarM21992f instanceof C0302d) {
                                        ((C0302d) d16VarM21992f).m1375g1(7);
                                        break;
                                    }
                                    if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                        int i6 = 0;
                                        for (d16 d16Var4 = ((fa2) d16VarM21992f).f38701K; d16Var4 != null; d16Var4 = d16Var4.f34842f) {
                                            if ((d16Var4.f34839c & 1024) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    d16VarM21992f = d16Var4;
                                                } else {
                                                    if (x66Var == null) {
                                                        x66Var = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f != null) {
                                                        x66Var.m24305c(d16VarM21992f);
                                                        d16VarM21992f = null;
                                                    }
                                                    x66Var.m24305c(d16Var4);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    d16VarM21992f = te1.m21992f(x66Var);
                                }
                            }
                        }
                        im9Var.f44294L.mo0a();
                        kg7Var4.m15189a();
                        kg7Var2 = kg7Var;
                        c0332f3 = c0332f2;
                        PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                        this.f2913e = c0332f3;
                        this.f2910b = kg7Var2;
                        obj3 = null;
                        this.f2911c = null;
                        this.f2912d = 3;
                        objM1473b2 = c0332f3.m1473b(pointerEventPass2, this);
                    }
                    return xfa.f68157a;
                }
                if (i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kg7Var2 = this.f2910b;
                c0332f3 = (C0332f) this.f2913e;
                AbstractC3193b.m15359b(obj);
                obj3 = null;
                objM1473b2 = obj;
            }
            List list2 = ((fg7) objM1473b2).f39071a;
            int size2 = list2.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    obj4 = obj3;
                    break;
                }
                obj4 = list2.get(i7);
                kg7 kg7Var5 = (kg7) obj4;
                if (!kg7Var5.m15191c() && pk9.m19371i(kg7Var5.f47235a, kg7Var2.f47235a) && kg7Var5.f47238d) {
                    break;
                }
                i7++;
            }
            kg7 kg7Var6 = (kg7) obj4;
            if (kg7Var6 != null) {
                kg7Var6.m15189a();
                PointerEventPass pointerEventPass3 = PointerEventPass.Initial;
                this.f2913e = c0332f3;
                this.f2910b = kg7Var2;
                obj3 = null;
                this.f2911c = null;
                this.f2912d = 3;
                objM1473b2 = c0332f3.m1473b(pointerEventPass3, this);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        c0332f = (C0332f) this.f2913e;
        PointerEventPass pointerEventPass4 = PointerEventPass.Initial;
        this.f2913e = c0332f;
        this.f2912d = 1;
        objM938a = AbstractC0117w.m938a(c0332f, true, pointerEventPass4, this);
        kg7Var = (kg7) objM938a;
        int i8 = kg7Var.f47243i;
        long j = kg7Var.f47237c;
        if (i8 == 3 || i8 == 4) {
            int i9 = (int) (j >> 32);
            if (Float.intBitsToFloat(i9) < 0.0f || Float.intBitsToFloat(i9) >= ((int) (c0332f.f4136f.f4147T >> 32))) {
                z = false;
            } else {
                int i10 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i10) < 0.0f || Float.intBitsToFloat(i10) >= ((int) (4294967295L & c0332f.f4136f.f4147T))) {
                    z = false;
                } else {
                    z = true;
                }
            }
            PointerEventPass pointerEventPass5 = (im9Var.f44295M || z) ? PointerEventPass.Initial : PointerEventPass.Main;
            c0332f2 = c0332f;
            pointerEventPass = pointerEventPass5;
            this.f2913e = c0332f2;
            this.f2910b = kg7Var;
            this.f2911c = pointerEventPass;
            this.f2912d = i2;
            objM1473b = c0332f2.m1473b(pointerEventPass, this);
        }
        return xfa.f68157a;
    }
}
