package androidx.compose.p002ui;

import androidx.compose.p002ui.platform.AbstractC0406r;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.aj3;
import p000.b16;
import p000.c16;
import p000.e16;
import p000.lda;
import p000.tj3;
import p000.ve1;
import p000.vi3;
import p000.vz1;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0287b {
    /* JADX INFO: renamed from: a */
    public static e16 m1320a(e16 e16Var, aj3 aj3Var) {
        return e16Var.mo3161g(new ve1(AbstractC0406r.m1816b(), aj3Var));
    }

    /* JADX INFO: renamed from: b */
    public static final e16 m1321b(ye1 ye1Var, e16 e16Var) {
        if (e16Var.mo1319c(ComposedModifierKt$materializeImpl$1.f3806b)) {
            return e16Var;
        }
        final tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22113c0(1219399079);
        e16 e16Var2 = (e16) e16Var.mo1318a(b16.f7762a, new zi3() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                e16 e16Var3 = (e16) obj;
                e16 e16VarM1321b = (c16) obj2;
                if (e16VarM1321b instanceof ve1) {
                    aj3 aj3Var = ((ve1) e16VarM1321b).f65268b;
                    lda.m16119e(3, aj3Var);
                    b16 b16Var = b16.f7762a;
                    ye1 ye1Var2 = tj3Var;
                    e16VarM1321b = AbstractC0287b.m1321b(ye1Var2, (e16) aj3Var.invoke(b16Var, ye1Var2, 0));
                }
                return e16Var3.mo3161g(e16VarM1321b);
            }
        });
        tj3Var.m22139q(false);
        return e16Var2;
    }

    /* JADX INFO: renamed from: c */
    public static final e16 m1322c(ye1 ye1Var, e16 e16Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(439770924);
        e16 e16VarM1321b = m1321b(tj3Var, e16Var);
        tj3Var.m22139q(false);
        return e16VarM1321b;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m1323d(AtomicReference atomicReference, vi3 vi3Var, zi3 zi3Var, ContinuationImpl continuationImpl) {
        return vz1.m23649s(new SessionMutex$withSessionCancellingPrevious$2(vi3Var, atomicReference, zi3Var, null), continuationImpl);
    }
}
