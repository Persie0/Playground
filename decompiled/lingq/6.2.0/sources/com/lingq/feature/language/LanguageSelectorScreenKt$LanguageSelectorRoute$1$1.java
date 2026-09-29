package com.lingq.feature.language;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.gm5;
import p000.lda;
import p000.om4;
import p000.rm4;
import p000.sm4;
import p000.tm4;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class LanguageSelectorScreenKt$LanguageSelectorRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        tm4 tm4Var = (tm4) obj;
        tm4Var.getClass();
        C2120b c2120b = (C2120b) this.f47704b;
        c2120b.getClass();
        if (tm4Var instanceof sm4) {
            String str = ((sm4) tm4Var).f61023a.f19113a;
            str.getClass();
            wfb.m23926u(lda.m16103C(c2120b), null, null, new LanguageSelectorViewModel$updateLanguage$1(c2120b, str, null), 3);
        } else {
            if (!tm4Var.equals(rm4.f59535a)) {
                gm5.m12750e();
                return null;
            }
            C3244l c3244l = c2120b.f26334d;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, om4.f54572a));
        }
        return xfa.f68157a;
    }
}
