package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.kn1;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.ChannelFlowKt", m4291f = "ChannelFlow.kt", m4292l = {221}, m4293m = "withContextUndispatched", m4294v = 1)
final class ChannelFlowKt$withContextUndispatched$1<T, V> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f48076a;

    /* JADX INFO: renamed from: b */
    public kn1 f48077b;

    /* JADX INFO: renamed from: c */
    public Object f48078c;

    /* JADX INFO: renamed from: d */
    public Object f48079d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f48080e;

    /* JADX INFO: renamed from: f */
    public int f48081f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48080e = obj;
        this.f48081f |= Integer.MIN_VALUE;
        return AbstractC3232b.m15566b(null, null, null, null, this);
    }
}
