package p000;

import android.os.Trace;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class nb0 {

    /* JADX INFO: renamed from: a */
    public static final vh9 f52558a = new vh9(new C3288l7(5));

    /* JADX INFO: renamed from: b */
    public static Boolean f52559b;

    /* JADX INFO: renamed from: a */
    public static final void m17307a(final C3419on c3419on, final vx9 vx9Var, final wa3 wa3Var, final List list, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        Executor executor = (Executor) tj3Var.m22128k(f52558a);
        if (executor == null || !m17308b(c3419on.f54604b.length())) {
            tj3Var.m22111b0(-517090505);
            tj3Var.m22139q(false);
            return;
        }
        tj3Var.m22111b0(-518737659);
        final LayoutDirection layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
        final fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
        try {
            executor.execute(new Runnable() { // from class: mb0
                @Override // java.lang.Runnable
                public final void run() {
                    s66 s66VarMo3579C;
                    vx9 vx9Var2 = vx9Var;
                    LayoutDirection layoutDirection2 = layoutDirection;
                    C3419on c3419on2 = c3419on;
                    fb2 fb2Var2 = fb2Var;
                    wa3 wa3Var2 = wa3Var;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        jc9 jc9VarM17358j = nc9.m17358j();
                        s66 s66Var = jc9VarM17358j instanceof s66 ? (s66) jc9VarM17358j : null;
                        if (s66Var == null || (s66VarMo3579C = s66Var.mo3579C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            jc9 jc9VarM14393j = s66VarMo3579C.m14393j();
                            try {
                                vx9 vx9VarM23615W = vz1.m23615W(vx9Var2, layoutDirection2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = EmptyList.f47638a;
                                }
                                w41 w41Var = new w41(c3419on2, vx9VarM23615W, list2, fb2Var2, wa3Var2);
                                w41Var.mo13026c();
                                w41Var.mo13025b();
                                jc9.m14390q(jc9VarM14393j);
                                s66VarMo3579C.mo3587w().mo3989l();
                                s66VarMo3579C.mo3162c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                jc9.m14390q(jc9VarM14393j);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                s66VarMo3579C.mo3162c();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        tj3Var.m22139q(false);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m17308b(int i) {
        if (i >= 8 && i < 1000) {
            if (f52559b == null) {
                f52559b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f52559b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
