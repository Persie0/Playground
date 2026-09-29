package com.lingq.core.p012ui.highlightedtext;

import android.text.StaticLayout;
import androidx.compose.foundation.gestures.AbstractC0102j;
import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.C0332f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.text.Regex;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3485q5;
import p000.aq4;
import p000.c32;
import p000.cfd;
import p000.cx9;
import p000.dr3;
import p000.e28;
import p000.eh0;
import p000.fb2;
import p000.i84;
import p000.ia4;
import p000.jt3;
import p000.kg7;
import p000.l70;
import p000.q7b;
import p000.t66;
import p000.u91;
import p000.v91;
import p000.vi3;
import p000.x87;
import p000.xfa;
import p000.xz7;
import p000.zi3;
import p000.zu8;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$gestureModifier$2$1$1", m4291f = "HighlightedText.kt", m4292l = {620, 622, 648}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$gestureModifier$2$1$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ t66 f24086H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ t66 f24087I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ t66 f24088J;

    /* JADX INFO: renamed from: b */
    public StaticLayout f24089b;

    /* JADX INFO: renamed from: c */
    public int f24090c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24091d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jt3 f24092e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ dr3 f24093f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ fb2 f24094g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vi3 f24095h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ vi3 f24096i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ t66 f24097j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ t66 f24098k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ t66 f24099l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$gestureModifier$2$1$1(jt3 jt3Var, dr3 dr3Var, fb2 fb2Var, vi3 vi3Var, vi3 vi3Var2, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, t66 t66Var5, t66 t66Var6, Continuation continuation) {
        super(2, continuation);
        this.f24092e = jt3Var;
        this.f24093f = dr3Var;
        this.f24094g = fb2Var;
        this.f24095h = vi3Var;
        this.f24096i = vi3Var2;
        this.f24097j = t66Var;
        this.f24098k = t66Var2;
        this.f24099l = t66Var3;
        this.f24086H = t66Var4;
        this.f24087I = t66Var5;
        this.f24088J = t66Var6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HighlightedTextKt$HighlightedText$gestureModifier$2$1$1 highlightedTextKt$HighlightedText$gestureModifier$2$1$1 = new HighlightedTextKt$HighlightedText$gestureModifier$2$1$1(this.f24092e, this.f24093f, this.f24094g, this.f24095h, this.f24096i, this.f24097j, this.f24098k, this.f24099l, this.f24086H, this.f24087I, this.f24088J, continuation);
        highlightedTextKt$HighlightedText$gestureModifier$2$1$1.f24091d = obj;
        return highlightedTextKt$HighlightedText$gestureModifier$2$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HighlightedTextKt$HighlightedText$gestureModifier$2$1$1) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM939b;
        Object objM867b;
        kg7 kg7Var;
        StaticLayout staticLayout;
        int i;
        StaticLayout staticLayout2;
        C0332f c0332f = (C0332f) this.f24091d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f24090c;
        t66 t66Var = this.f24087I;
        t66 t66Var2 = this.f24099l;
        t66 t66Var3 = this.f24086H;
        t66 t66Var4 = this.f24097j;
        xfa xfaVar = xfa.f68157a;
        jt3 jt3Var = this.f24092e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            this.f24091d = c0332f;
            this.f24090c = 1;
            objM939b = AbstractC0117w.m939b(c0332f, false, null, this, 2);
            if (objM939b != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
            objM939b = obj;
        } else {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                objM867b = obj;
                kg7Var = (kg7) objM867b;
                if (kg7Var == null) {
                    return xfaVar;
                }
                Regex regex = AbstractC1932c.f24144a;
                t66Var4.setValue(Boolean.TRUE);
                staticLayout = (StaticLayout) this.f24098k.getValue();
                List list = jt3Var.f46105c;
                if (staticLayout != null || list.isEmpty()) {
                    t66Var4.setValue(Boolean.FALSE);
                    return xfaVar;
                }
                ((x87) this.f24093f).m24403a(0);
                int iM4630e = cfd.m4630e(staticLayout, kg7Var.f47237c);
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    xz7 xz7Var = ((q7b) it.next()).f57357a;
                    if (xz7Var.f69004a <= iM4630e && xz7Var.f69005b > iM4630e) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                Integer num = new Integer(i);
                if (num.intValue() == -1) {
                    num = null;
                }
                if (num == null) {
                    t66Var4.setValue(Boolean.FALSE);
                    return xfaVar;
                }
                t66Var2.setValue(num);
                t66Var3.setValue(num);
                t66Var.setValue(null);
                long j = kg7Var.f47235a;
                C3485q5 c3485q5 = new C3485q5(staticLayout, list, t66Var3, 16);
                this.f24091d = null;
                this.f24089b = staticLayout;
                this.f24090c = 3;
                if (AbstractC0102j.m871f(c0332f, j, c3485q5, this) != coroutineSingletons) {
                    staticLayout2 = staticLayout;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            StaticLayout staticLayout3 = this.f24089b;
            AbstractC3193b.m15359b(obj);
            staticLayout2 = staticLayout3;
        }
        Regex regex2 = AbstractC1932c.f24144a;
        Integer num2 = (Integer) t66Var2.getValue();
        Integer num3 = (Integer) t66Var3.getValue();
        if (num2 != null && num3 != null) {
            i84 i84Var = new i84(Math.min(num2.intValue(), num3.intValue()), Math.max(num2.intValue(), num3.intValue()), 1);
            t66Var.setValue(i84Var);
            List list2 = jt3Var.f46105c;
            String str = jt3Var.f46104b;
            List listM22612d1 = u91.m22612d1(list2, i84Var);
            if (!listM22612d1.isEmpty()) {
                long jM11127g = eh0.m11127g(((q7b) u91.m22589G0(listM22612d1)).f57357a.f69004a, ((q7b) u91.m22597O0(listM22612d1)).f57357a.f69005b);
                int i4 = cx9.f34693c;
                int i5 = (int) (jM11127g >> 32);
                int i6 = (int) (jM11127g & 4294967295L);
                String strSubstring = str.substring(l70.m15945h(i5, 0, str.length()), l70.m15945h(i6, 0, str.length()));
                e28 e28VarM4632g = cfd.m4632g(cfd.m4631f(staticLayout2, i5, i6, this.f24094g, jt3Var.f46114l, jt3Var.f46118p), (aq4) this.f24088J.getValue());
                List list3 = listM22612d1;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    AbstractC3393o1.m17749x(((q7b) it2.next()).f57357a.f69010g, arrayList);
                }
                int size = listM22612d1.size();
                boolean z = u91.m22622n1(u91.m22626r1(arrayList)).size() <= 1;
                zu8 zu8Var = new zu8(listM22612d1, strSubstring, e28VarM4632g, size, z, (Integer) u91.m22591I0(arrayList));
                if (size > 8 || !z) {
                    this.f24096i.invoke(new ia4(strSubstring, e28VarM4632g));
                } else {
                    this.f24095h.invoke(zu8Var);
                }
            }
        }
        t66Var4.setValue(Boolean.FALSE);
        t66Var2.setValue(null);
        t66Var3.setValue(null);
        return xfaVar;
        long j2 = ((kg7) objM939b).f47235a;
        this.f24091d = c0332f;
        this.f24090c = 2;
        objM867b = AbstractC0102j.m867b(c0332f, j2, this);
        if (objM867b != coroutineSingletons) {
            kg7Var = (kg7) objM867b;
            if (kg7Var == null) {
                return xfaVar;
            }
            Regex regex3 = AbstractC1932c.f24144a;
            t66Var4.setValue(Boolean.TRUE);
            staticLayout = (StaticLayout) this.f24098k.getValue();
            List list4 = jt3Var.f46105c;
            if (staticLayout != null) {
            }
            t66Var4.setValue(Boolean.FALSE);
            return xfaVar;
        }
        return coroutineSingletons;
    }
}
