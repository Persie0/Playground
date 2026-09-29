package p000;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C3229i;

/* JADX INFO: loaded from: classes.dex */
public final class a18 implements z49, c83, jj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3229i f66a;
    private final cd4 job = null;

    public a18(C3229i c3229i) {
        this.f66a = c3229i;
    }

    @Override // p000.jj3
    /* JADX INFO: renamed from: b */
    public final c83 mo38b(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return pb1.m19051u(this, kn1Var, i, bufferOverflow);
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        return C3229i.m15548j(this.f66a, e83Var, continuation);
    }
}
