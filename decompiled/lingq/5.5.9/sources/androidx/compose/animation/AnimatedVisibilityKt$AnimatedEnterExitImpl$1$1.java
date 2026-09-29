package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C0485g;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", m19206f = "AnimatedVisibility.kt", m19207l = {748}, m19208m = "invokeSuspend")
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f1428e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Transition<EnterExitState> f1429f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5312g0<Boolean> f1430g;

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1$a */
    public static final class C0358a implements InterfaceC7117d<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5312g0<Boolean> f1432a;

        public C0358a(InterfaceC5312g0<Boolean> interfaceC5312g0) {
            this.f1432a = interfaceC5312g0;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(Boolean bool, InterfaceC9968c interfaceC9968c) {
            this.f1432a.setValue(Boolean.valueOf(bool.booleanValue()));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, InterfaceC5312g0<Boolean> interfaceC5312g0, InterfaceC9968c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1429f = transition;
        this.f1430g = interfaceC5312g0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.f1429f, this.f1430g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1428e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            final Transition<EnterExitState> transition = this.f1429f;
            C7136q c7136qM1850a = C0485g.m1850a(new InterfaceC2041a<Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Boolean mo807E() {
                    Transition<EnterExitState> transition2 = transition;
                    EnterExitState enterExitStateM1362b = transition2.m1362b();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    return Boolean.valueOf(enterExitStateM1362b == enterExitState || transition2.m1364d() == enterExitState);
                }
            });
            C0358a c0358a = new C0358a(this.f1430g);
            this.f1428e = 1;
            if (c7136qM1850a.mo9539a(c0358a, this) == coroutineSingletons) {
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
