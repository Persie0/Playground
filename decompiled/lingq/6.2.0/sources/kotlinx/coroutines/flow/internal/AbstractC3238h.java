package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.aj3;
import p000.c83;
import p000.e83;
import p000.g83;
import p000.pfa;
import p000.ui3;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3238h {
    /* JADX INFO: renamed from: a */
    public static final Object m15568a(e83 e83Var, ui3 ui3Var, aj3 aj3Var, Continuation continuation, c83[] c83VarArr) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(e83Var, ui3Var, aj3Var, null, c83VarArr);
        g83 g83Var = new g83(continuation.getContext(), continuation);
        Object objM19112b = pfa.m19112b(g83Var, true, g83Var, combineKt$combineInternal$2);
        return objM19112b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM19112b : xfa.f68157a;
    }
}
