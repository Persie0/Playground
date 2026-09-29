package p000;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes.dex */
public interface jj3 extends c83 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ c83 m14495a(jj3 jj3Var, kn1 kn1Var, int i, BufferOverflow bufferOverflow, int i2) {
        if ((i2 & 1) != 0) {
            kn1Var = EmptyCoroutineContext.f47685a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return jj3Var.mo38b(kn1Var, i, bufferOverflow);
    }

    /* JADX INFO: renamed from: b */
    c83 mo38b(kn1 kn1Var, int i, BufferOverflow bufferOverflow);
}
