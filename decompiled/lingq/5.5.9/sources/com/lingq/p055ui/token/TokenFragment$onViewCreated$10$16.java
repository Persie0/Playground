package com.lingq.p055ui.token;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$11;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.C7828f;
import no.InterfaceC7882z;
import p076di.InterfaceC5179a;
import p260m8.C7499b;
import p278nh.C7777d;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$16", m19206f = "TokenFragment.kt", m19207l = {826}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$16 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31271e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31272f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$16$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$16$1", m19206f = "TokenFragment.kt", m19207l = {828}, m19208m = "invokeSuspend")
    public static final class C48081 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31273e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ boolean f31274f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ TokenFragment f31275g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48081(TokenFragment tokenFragment, InterfaceC9968c<? super C48081> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31275g = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48081 c48081 = new C48081(this.f31275g, interfaceC9968c);
            c48081.f31274f = ((Boolean) obj).booleanValue();
            return c48081;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48081) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007d  */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31273e;
            TokenFragment tokenFragment = this.f31275g;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                if (this.f31274f && !C7777d.m15481b(tokenFragment)) {
                    InterfaceC5179a interfaceC5179a = tokenFragment.f31217O0;
                    if (interfaceC5179a == null) {
                        C5207g.m11117l("preferenceStore");
                        throw null;
                    }
                    PreferenceStoreImpl$special$$inlined$map$11 preferenceStoreImpl$special$$inlined$map$11Mo9603r = interfaceC5179a.mo9603r();
                    this.f31273e = 1;
                    obj = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$11Mo9603r, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            if (((Boolean) obj).booleanValue()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                if (tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Lesson || tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.LessonExpanded) {
                    TokenViewModel.m10373q2(tokenFragment.m10363o0(), true);
                } else {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                    TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                    C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), null, null, new TokenViewModel$dismissWithAutoCreate$1(tokenViewModelM10363o0, false, null), 3);
                }
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = TokenFragment.f31202R0;
                TokenViewModel tokenViewModelM10363o1 = tokenFragment.m10363o0();
                C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o1), null, null, new TokenViewModel$dismissWithAutoCreate$1(tokenViewModelM10363o1, false, null), 3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$16(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$16> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31272f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$16(this.f31272f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$16) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31271e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31272f;
            InterfaceC7137r<Boolean> interfaceC7137rMo10043c1 = tokenFragment.m10363o0().mo10043c1();
            C48081 c48081 = new C48081(tokenFragment, null);
            this.f31271e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10043c1, c48081, this) == coroutineSingletons) {
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
