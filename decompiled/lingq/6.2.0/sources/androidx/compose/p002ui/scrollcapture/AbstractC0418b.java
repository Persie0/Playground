package androidx.compose.p002ui.scrollcapture;

import android.os.CancellationSignal;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import java.util.List;
import p000.AbstractC3393o1;
import p000.bq1;
import p000.j84;
import p000.kv8;
import p000.mn8;
import p000.nn8;
import p000.pe1;
import p000.pg9;
import p000.vi3;
import p000.vl1;
import p000.wfb;
import p000.x66;
import p000.xfa;
import p000.xwc;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0418b {
    /* JADX INFO: renamed from: a */
    public static final void m1829a(vl1 vl1Var, final CancellationSignal cancellationSignal, zi3 zi3Var) {
        pg9 pg9VarM23926u = wfb.m23926u(vl1Var, null, null, zi3Var, 3);
        pg9VarM23926u.mo4540r(new vi3() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return xfa.f68157a;
            }
        });
        cancellationSignal.setOnCancelListener(new pe1(pg9VarM23926u, 0));
    }

    /* JADX INFO: renamed from: b */
    public static final void m1830b(C0423c c0423c, int i, vi3 vi3Var) {
        x66 x66Var = new x66(new C0423c[16]);
        List listM1848i = c0423c.m1848i(false, false);
        while (true) {
            x66Var.m24307e(x66Var.f67832c, listM1848i);
            while (true) {
                int i2 = x66Var.f67832c;
                if (i2 == 0) {
                    return;
                }
                C0423c c0423c2 = (C0423c) x66Var.m24314l(i2 - 1);
                boolean zM24735H = xwc.m24735H(c0423c2);
                kv8 kv8Var = c0423c2.f4974d;
                if (!zM24735H) {
                    if (kv8Var.f48471a.m17251c(AbstractC0424d.f5003j)) {
                        continue;
                    } else {
                        AbstractC0362l abstractC0362lM1843d = c0423c2.m1843d();
                        if (abstractC0362lM1843d == null) {
                            throw AbstractC3393o1.m17745t("Expected semantics node to have a coordinator.");
                        }
                        j84 j84VarM24755a0 = xwc.m24755a0(bq1.m4050Z(abstractC0362lM1843d, true));
                        if (j84VarM24755a0.f45185a < j84VarM24755a0.f45187c && j84VarM24755a0.f45186b < j84VarM24755a0.f45188d) {
                            zi3 zi3Var = (zi3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4949e);
                            mn8 mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                            if (zi3Var == null || mn8Var == null || ((Number) mn8Var.f51589b.mo0a()).floatValue() <= 0.0f) {
                                listM1848i = c0423c2.m1848i(false, false);
                            } else {
                                int i3 = 1 + i;
                                ((ScrollCapture$onScrollCaptureSearch$1) vi3Var).invoke(new nn8(c0423c2, i3, j84VarM24755a0, abstractC0362lM1843d));
                                m1830b(c0423c2, i3, vi3Var);
                            }
                        }
                    }
                }
            }
        }
    }
}
