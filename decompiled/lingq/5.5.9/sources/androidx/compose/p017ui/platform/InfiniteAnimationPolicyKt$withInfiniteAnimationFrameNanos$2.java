package androidx.compose.p017ui.platform;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p081e0.C5300c0;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u008a@"}, m13365d2 = {"R", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m19206f = "InfiniteAnimationPolicy.kt", m19207l = {65}, m19208m = "invokeSuspend")
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2<R> extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super R>, Object> {

    /* JADX INFO: renamed from: e */
    public int f4182e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2052l<Long, R> f4183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f4183f = interfaceC2052l;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(Object obj) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) mo1353s((InterfaceC9968c) obj)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.f4183f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4182e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f4182e = 1;
            obj = C5300c0.m11449b(this.f4183f, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return obj;
    }
}
