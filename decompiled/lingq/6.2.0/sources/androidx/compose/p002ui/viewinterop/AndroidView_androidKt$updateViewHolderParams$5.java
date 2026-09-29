package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC3417ol;
import p000.gm5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
final class AndroidView_androidKt$updateViewHolderParams$5 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final AndroidView_androidKt$updateViewHolderParams$5 f5155b = new AndroidView_androidKt$updateViewHolderParams$5(2);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        ViewFactoryHolder viewFactoryHolderM1892c = AbstractC0443c.m1892c((C0357g) obj);
        int i = AbstractC3417ol.f54519a[((LayoutDirection) obj2).ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            gm5.m12750e();
            return null;
        }
        viewFactoryHolderM1892c.setLayoutDirection(i2);
        return xfa.f68157a;
    }
}
