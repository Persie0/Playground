package com.lingq.p055ui.token;

import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
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

/* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "TokenFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C4800x8abdca4c extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31235e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f31236f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f31237g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TokenFragment f31238h;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31239e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31240f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TokenFragment tokenFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31240f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31240f, interfaceC9968c);
            anonymousClass1.f31239e = obj;
            return anonymousClass1;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f31239e;
            TokenFragment tokenFragment = this.f31240f;
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$1(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$2(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$3(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$4(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$5(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$6(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$7(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$8(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$9(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$10(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$11(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$12(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$13(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$14(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$15(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$16(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$17(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$18(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$19(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$20(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$21(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$22(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$23(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$24(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$25(tokenFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new TokenFragment$onViewCreated$10$26(tokenFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4800x8abdca4c(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, TokenFragment tokenFragment) {
        super(2, interfaceC9968c);
        this.f31236f = fragment;
        this.f31237g = state;
        this.f31238h = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C4800x8abdca4c(this.f31236f, this.f31237g, interfaceC9968c, this.f31238h);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C4800x8abdca4c) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31235e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f31236f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31238h, null);
            this.f31235e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f31237g, anonymousClass1, this) == coroutineSingletons) {
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
