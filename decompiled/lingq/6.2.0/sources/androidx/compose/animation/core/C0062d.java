package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.sync.C3248a;
import p000.vi3;
import p000.vz1;

/* JADX INFO: renamed from: androidx.compose.animation.core.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0062d {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f1554a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final C3248a f1555b = new C3248a();

    /* JADX INFO: renamed from: a */
    public static Object m753a(C0062d c0062d, vi3 vi3Var, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.Default;
        c0062d.getClass();
        return vz1.m23649s(new MutatorMutex$mutate$2(mutatePriority, c0062d, vi3Var, null), continuation);
    }
}
