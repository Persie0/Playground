package androidx.compose.animation;

import androidx.compose.p002ui.platform.AbstractC0406r;
import p000.aj3;
import p000.e16;
import p000.faa;
import p000.qv2;
import p000.tj3;
import p000.ve1;
import p000.vs2;
import p000.ye1;

/* JADX INFO: renamed from: androidx.compose.animation.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0067f {
    /* JADX INFO: renamed from: a */
    default e16 mo764a(e16 e16Var, final vs2 vs2Var, final qv2 qv2Var) {
        return e16Var.mo3161g(new ve1(AbstractC0406r.m1816b(), new aj3() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p000.aj3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj3).intValue();
                tj3 tj3Var = (tj3) ((ye1) obj2);
                tj3Var.m22111b0(1840112047);
                e16 e16VarMo3161g = ((e16) obj).mo3161g(AbstractC0070i.m766a(this.f1406b.mo765b(), vs2Var, qv2Var, "animateEnterExit", tj3Var, 0, 12));
                tj3Var.m22139q(false);
                return e16VarMo3161g;
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    faa mo765b();
}
