package androidx.compose.p002ui.window;

import kotlin.jvm.internal.Lambda;
import p000.tj3;
import p000.xfa;
import p000.ye1;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
final class ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1 f5275b = new ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1(2);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Number) obj2).intValue();
        tj3 tj3Var = (tj3) ye1Var;
        if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }
}
