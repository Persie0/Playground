package androidx.compose.runtime;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p081e0.C5324m0;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5322l0;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5", m19206f = "ProduceState.kt", m19207l = {220}, m19208m = "invokeSuspend")
final class SnapshotStateKt__ProduceStateKt$produceState$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f3108e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f3109f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2056p<InterfaceC5322l0<Object>, InterfaceC9968c<? super C9072e>, Object> f3110g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC5312g0<Object> f3111h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__ProduceStateKt$produceState$5(InterfaceC2056p<? super InterfaceC5322l0<Object>, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC5312g0<Object> interfaceC5312g0, InterfaceC9968c<? super SnapshotStateKt__ProduceStateKt$produceState$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f3110g = interfaceC2056p;
        this.f3111h = interfaceC5312g0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        SnapshotStateKt__ProduceStateKt$produceState$5 snapshotStateKt__ProduceStateKt$produceState$5 = new SnapshotStateKt__ProduceStateKt$produceState$5(this.f3110g, this.f3111h, interfaceC9968c);
        snapshotStateKt__ProduceStateKt$produceState$5.f3109f = obj;
        return snapshotStateKt__ProduceStateKt$produceState$5;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3108e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C5324m0 c5324m0 = new C5324m0(this.f3111h, ((InterfaceC7882z) this.f3109f).getF6528b());
            this.f3108e = 1;
            if (this.f3110g.mo1337m0(c5324m0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
