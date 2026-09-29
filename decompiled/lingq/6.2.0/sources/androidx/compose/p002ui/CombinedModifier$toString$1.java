package androidx.compose.p002ui;

import kotlin.jvm.internal.Lambda;
import p000.c16;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final class CombinedModifier$toString$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final CombinedModifier$toString$1 f3805b = new CombinedModifier$toString$1(2);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        c16 c16Var = (c16) obj2;
        if (str.length() == 0) {
            return c16Var.toString();
        }
        return str + ", " + c16Var;
    }
}
