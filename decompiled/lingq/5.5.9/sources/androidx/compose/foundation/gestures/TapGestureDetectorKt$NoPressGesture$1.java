package androidx.compose.foundation.gestures;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p375s0.C8941c;
import p401u.InterfaceC9354g;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m13365d2 = {"Lu/g;", "Ls0/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m19206f = "TapGestureDetector.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC9354g, C8941c, InterfaceC9968c<? super C9072e>, Object> {
    public TapGestureDetectorKt$NoPressGesture$1(InterfaceC9968c<? super TapGestureDetectorKt$NoPressGesture$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC9354g interfaceC9354g, C8941c c8941c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        long j10 = c8941c.f46892a;
        return new TapGestureDetectorKt$NoPressGesture$1(interfaceC9968c).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return C9072e.f47360a;
    }
}
