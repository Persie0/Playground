package p000;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class c18 implements eh9, c83, jj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u66 f9311a;
    private final cd4 job;

    public c18(u66 u66Var, pg9 pg9Var) {
        this.f9311a = u66Var;
        this.job = pg9Var;
    }

    @Override // p000.jj3
    /* JADX INFO: renamed from: b */
    public final c83 mo38b(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? pb1.m19051u(this, kn1Var, i, bufferOverflow) : this;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        return ((C3244l) this.f9311a).collect(e83Var, continuation);
    }

    @Override // p000.eh9
    public final Object getValue() {
        return ((C3244l) this.f9311a).getValue();
    }
}
