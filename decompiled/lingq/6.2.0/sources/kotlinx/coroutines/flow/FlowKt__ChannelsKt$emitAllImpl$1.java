package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.cu0;
import p000.e83;
import p000.ej0;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m4291f = "Channels.kt", m4292l = {32, 33}, m4293m = "emitAllImpl$FlowKt__ChannelsKt", m4294v = 1)
final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public e83 f47818a;

    /* JADX INFO: renamed from: b */
    public cu0 f47819b;

    /* JADX INFO: renamed from: c */
    public ej0 f47820c;

    /* JADX INFO: renamed from: d */
    public boolean f47821d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f47822e;

    /* JADX INFO: renamed from: f */
    public int f47823f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47822e = obj;
        this.f47823f |= Integer.MIN_VALUE;
        return AbstractC3224d.m15538q(null, null, false, this);
    }
}
