package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.AbstractC0309d;
import p000.e16;
import p000.mv3;
import p000.q98;
import p000.ss5;
import p000.vi3;
import p000.xfa;
import p000.xj2;
import p000.yd0;

/* JADX INFO: renamed from: androidx.compose.ui.draw.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0294a {
    /* JADX INFO: renamed from: a */
    public static e16 m1342a(e16 e16Var) {
        if (xj2.m24559a(12.0f, 0.0f) > 0) {
            xj2.m24559a(12.0f, 0.0f);
        }
        final int i = 0;
        final boolean z = true;
        return AbstractC0309d.m1406a(e16Var, new vi3() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                mv3 mv3Var = ss5.f61356d;
                q98 q98Var = (q98) obj;
                float fMo594a = q98Var.f57464O.mo594a() * 12.0f;
                float fMo594a2 = q98Var.f57464O.mo594a() * 12.0f;
                q98Var.m19819j((fMo594a <= 0.0f || fMo594a2 <= 0.0f) ? null : new yd0(fMo594a, fMo594a2, i));
                q98Var.m19826s(mv3Var);
                q98Var.m19816f(z);
                return xfa.f68157a;
            }
        });
    }
}
