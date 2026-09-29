package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.fj0;
import p000.ku0;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements zi3 {

    /* JADX INFO: renamed from: i */
    public static final BufferedChannelKt$createSegmentFunction$1 f47774i = new BufferedChannelKt$createSegmentFunction$1(2, fj0.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        ku0 ku0Var = (ku0) obj2;
        ku0 ku0Var2 = fj0.f39170a;
        C3211a c3211a = ku0Var.f48423g;
        c3211a.getClass();
        return new ku0(jLongValue, ku0Var, c3211a, 0);
    }
}
