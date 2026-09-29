package androidx.compose.runtime;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"R", "Lno/z;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", m19206f = "ActualAndroid.android.kt", m19207l = {52}, m19208m = "invokeSuspend")
public final class SdkStubsFallbackFrameClock$withFrameNanos$2<R> extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super R>, Object> {

    /* JADX INFO: renamed from: e */
    public int f3106e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2052l<Long, R> f3107f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super SdkStubsFallbackFrameClock$withFrameNanos$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f3107f = interfaceC2052l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.f3107f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, Object obj) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) mo1336a(interfaceC7882z, (InterfaceC9968c) obj)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3106e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f3106e = 1;
            if (C7828f.m15567a(16L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return this.f3107f.mo528n(new Long(System.nanoTime()));
    }
}
