package kotlinx.coroutines.channels;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.hu0;
import p000.ju0;
import p000.un1;
import p000.xfa;
import p000.yv8;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m4291f = "Channels.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 1)
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f47775a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47776b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yv8 f47777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(yv8 yv8Var, Continuation continuation) {
        super(2, continuation);
        this.f47777c = yv8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.f47777c, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.f47776b = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47775a;
        Object hu0Var = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                yv8 yv8Var = this.f47777c;
                this.f47776b = null;
                this.f47775a = 1;
                if (yv8Var.mo4678m(hu0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            failure = hu0Var;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            hu0Var = new hu0(Result.m15355a(failure));
        }
        return new ju0(hu0Var);
    }
}
