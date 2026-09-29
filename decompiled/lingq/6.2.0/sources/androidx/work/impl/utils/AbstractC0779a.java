package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.bna;
import p000.e8b;
import p000.oj5;
import p000.p8b;
import p000.pg5;
import p000.rk8;
import p000.wfb;
import p000.xfa;
import p000.z7b;

/* JADX INFO: renamed from: androidx.work.impl.utils.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0779a {

    /* JADX INFO: renamed from: a */
    public static final String f7268a = oj5.m18041h("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a */
    public static final Object m2934a(Context context, p8b p8bVar, pg5 pg5Var, z7b z7bVar, e8b e8bVar, Continuation continuation) throws Throwable {
        if (p8bVar.f55788q && Build.VERSION.SDK_INT < 31) {
            rk8 rk8Var = e8bVar.f36850d;
            rk8Var.getClass();
            Object objM23905G = wfb.m23905G(new WorkForegroundKt$workForeground$2(pg5Var, p8bVar, z7bVar, context, null), bna.m3926O(rk8Var), continuation);
            if (objM23905G == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM23905G;
            }
        }
        return xfa.f68157a;
    }
}
