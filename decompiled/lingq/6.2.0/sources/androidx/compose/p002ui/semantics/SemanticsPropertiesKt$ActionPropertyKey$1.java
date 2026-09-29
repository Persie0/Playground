package androidx.compose.p002ui.semantics;

import kotlin.jvm.internal.Lambda;
import p000.C3024g3;
import p000.xi3;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f4938b = new SemanticsPropertiesKt$ActionPropertyKey$1(2);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        String str;
        xi3 xi3Var;
        C3024g3 c3024g3 = (C3024g3) obj;
        C3024g3 c3024g4 = (C3024g3) obj2;
        if (c3024g3 == null || (str = c3024g3.f40090a) == null) {
            str = c3024g4.f40090a;
        }
        if (c3024g3 == null || (xi3Var = c3024g3.f40091b) == null) {
            xi3Var = c3024g4.f40091b;
        }
        return new C3024g3(str, xi3Var);
    }
}
