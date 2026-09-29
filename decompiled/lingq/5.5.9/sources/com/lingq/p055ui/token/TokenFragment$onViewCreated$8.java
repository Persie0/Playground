package com.lingq.p055ui.token;

import androidx.fragment.app.C0980t0;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$8", m19206f = "TokenFragment.kt", m19207l = {466}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$8 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31359e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31360f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$8$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$8$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48271 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TokenFragment f31361e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48271(TokenFragment tokenFragment, InterfaceC9968c<? super C48271> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31361e = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48271(this.f31361e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48271) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            TokenFragment tokenFragment = this.f31361e;
            if (!C4924a.m10462h(tokenFragment.m3578a0())) {
                tokenFragment.m10363o0().mo9745u0(false);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$8(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$8> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31360f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$8(this.f31360f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$8) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31359e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            TokenFragment tokenFragment = this.f31360f;
            C0980t0 c0980t0M3601v = tokenFragment.m3601v();
            Lifecycle.State state = Lifecycle.State.CREATED;
            C48271 c48271 = new C48271(tokenFragment, null);
            this.f31359e = 1;
            if (RepeatOnLifecycleKt.m3905a(c0980t0M3601v, state, c48271, this) == coroutineSingletons) {
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
