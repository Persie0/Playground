package p000;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public interface cu0 extends yv8 {

    /* JADX INFO: renamed from: o */
    public static final bu0 f34534o = bu0.f9016a;

    /* JADX INFO: renamed from: a */
    void mo4537a(CancellationException cancellationException);

    /* JADX INFO: renamed from: f */
    ny8 mo9889f();

    /* JADX INFO: renamed from: g */
    Object mo9890g();

    /* JADX INFO: renamed from: h */
    Object mo9891h(Continuation continuation);

    ej0 iterator();

    /* JADX INFO: renamed from: o */
    Object mo9892o(SuspendLambda suspendLambda);
}
