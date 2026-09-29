package androidx.compose.material3;

import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C3248a;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c76;
import p000.sm0;
import p000.t66;
import p000.vb9;
import p000.wb9;
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.material3.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0232g0 {

    /* JADX INFO: renamed from: a */
    public final C3248a f3424a = new C3248a();

    /* JADX INFO: renamed from: b */
    public final t66 f3425b = AbstractC0278f.m1260j(null);

    /* JADX INFO: renamed from: b */
    public static Object m1155b(C0232g0 c0232g0, String str, String str2, SnackbarDuration snackbarDuration, SuspendLambda suspendLambda, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            snackbarDuration = str2 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        c0232g0.getClass();
        return c0232g0.m1156a(new wb9(str, str2, snackbarDuration), suspendLambda);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.material3.g0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [c76] */
    /* JADX WARN: Type inference failed for: r7v4, types: [c76] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1156a(wb9 wb9Var, ContinuationImpl continuationImpl) throws Throwable {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        C3248a c3248a;
        c76 c76Var;
        if (continuationImpl instanceof SnackbarHostState$showSnackbar$2) {
            snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) continuationImpl;
            int i = snackbarHostState$showSnackbar$2.f3336f;
            if ((i & Integer.MIN_VALUE) != 0) {
                snackbarHostState$showSnackbar$2.f3336f = i - Integer.MIN_VALUE;
            } else {
                snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, continuationImpl);
            }
        } else {
            snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, continuationImpl);
        }
        Object objM21466r = snackbarHostState$showSnackbar$2.f3334d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = snackbarHostState$showSnackbar$2.f3336f;
        t66 t66Var = this.f3425b;
        try {
            try {
                if (i2 == 0) {
                    AbstractC3193b.m15359b(objM21466r);
                    snackbarHostState$showSnackbar$2.f3331a = wb9Var;
                    c3248a = this.f3424a;
                    snackbarHostState$showSnackbar$2.f3332b = c3248a;
                    snackbarHostState$showSnackbar$2.f3336f = 1;
                    if (c3248a.mo4388c(snackbarHostState$showSnackbar$2) != coroutineSingletons) {
                    }
                    c76Var = c3248a;
                    return coroutineSingletons;
                }
                if (i2 == 1) {
                    c76 c76Var2 = snackbarHostState$showSnackbar$2.f3332b;
                    wb9Var = snackbarHostState$showSnackbar$2.f3331a;
                    AbstractC3193b.m15359b(objM21466r);
                    c76Var = c76Var2;
                } else {
                    if (i2 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c76 c76Var3 = snackbarHostState$showSnackbar$2.f3332b;
                    AbstractC3193b.m15359b(objM21466r);
                    this = c76Var3;
                }
                t66Var = (xc9) t66Var;
                t66Var.setValue(null);
                this.mo4387b(null);
                return objM21466r;
                c76Var = c3248a;
                snackbarHostState$showSnackbar$2.f3331a = wb9Var;
                snackbarHostState$showSnackbar$2.f3332b = c76Var;
                snackbarHostState$showSnackbar$2.f3336f = 2;
                sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(snackbarHostState$showSnackbar$2));
                sm0Var.m21468u();
                ((xc9) t66Var).setValue(new vb9(wb9Var, sm0Var));
                objM21466r = sm0Var.m21466r();
                this = c76Var;
            } catch (Throwable th) {
                ((xc9) t66Var).setValue(null);
                throw th;
            }
        } catch (Throwable th2) {
            this.mo4387b(null);
            throw th2;
        }
    }
}
