package com.lingq.p055ui.token;

import ci.InterfaceC2026s;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.ExoPlayer;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$1;
import com.lingq.shared.uimodel.WordStatus;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import li.InterfaceC7379f;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.C6704a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$updateWordStatus$1", m19206f = "TokenViewModel.kt", m19207l = {1092, 1105}, m19208m = "invokeSuspend")
public final class TokenViewModel$updateWordStatus$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31709e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31710f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f31711g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f31712h;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$updateWordStatus$1$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$updateWordStatus$1$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48591 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TokenViewModel f31713e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48591(TokenViewModel tokenViewModel, InterfaceC9968c<? super C48591> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31713e = tokenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48591(this.f31713e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48591) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f31713e.mo10045e0();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$updateWordStatus$1$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$updateWordStatus$1$2", m19206f = "TokenViewModel.kt", m19207l = {1114, 1115}, m19208m = "invokeSuspend")
    public static final class C48602 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31714e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenViewModel f31715f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48602(TokenViewModel tokenViewModel, InterfaceC9968c<? super C48602> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31715f = tokenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48602(this.f31715f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48602) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31714e;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            this.f31714e = 1;
            if (C7828f.m15567a(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f31714e = 2;
            if (this.f31715f.mo9326s(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$updateWordStatus$1(TokenViewModel tokenViewModel, String str, boolean z10, InterfaceC9968c<? super TokenViewModel$updateWordStatus$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31710f = tokenViewModel;
        this.f31711g = str;
        this.f31712h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$updateWordStatus$1(this.f31710f, this.f31711g, this.f31712h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$updateWordStatus$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String strMo14774c;
        Object objM14360a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31709e;
        TokenViewModel tokenViewModel = this.f31710f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
                objM14360a = obj;
            }
            if (!((Boolean) objM14360a).booleanValue()) {
                C7828f.m15570d(tokenViewModel.f31409J, null, null, new C48591(tokenViewModel, null), 3);
            }
            C7828f.m15570d(tokenViewModel.f31409J, null, null, new C48602(tokenViewModel, null), 3);
            if (this.f31712h) {
                InterfaceC4865b.a.m10388a(tokenViewModel, false, 3);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2026s interfaceC2026s = tokenViewModel.f31445e;
        String strMo498E1 = tokenViewModel.mo498E1();
        int i11 = tokenViewModel.f31429T.f34367b;
        InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModel.f31437X.getValue();
        if (interfaceC7379f == null || (strMo14774c = interfaceC7379f.mo14774c()) == null) {
            strMo14774c = "";
        }
        String str = this.f31711g;
        this.f31709e = 1;
        if (interfaceC2026s.mo6192b(strMo498E1, i11, strMo14774c, str, "", this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (C5207g.m11106a(this.f31711g, WordStatus.Known.getValue())) {
            C6704a c6704a = tokenViewModel.f31457k;
            c6704a.f37891b.edit().putInt("tutorial_known_words", c6704a.f37891b.getInt("tutorial_known_words", 0) + 1).apply();
            C6704a c6704a2 = tokenViewModel.f31457k;
            if (c6704a2.f37891b.getInt("tutorial_known_words", 0) == 5 || c6704a2.f37891b.getInt("tutorial_known_words", 0) == 10 || c6704a2.f37891b.getInt("tutorial_known_words", 0) == 15) {
                PreferenceStoreImpl$special$$inlined$map$1 preferenceStoreImpl$special$$inlined$map$1Mo9580a = tokenViewModel.f31459l.mo9580a();
                this.f31709e = 2;
                objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$1Mo9580a, this);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objM14360a).booleanValue()) {
                    C7828f.m15570d(tokenViewModel.f31409J, null, null, new C48591(tokenViewModel, null), 3);
                }
            }
        }
        C7828f.m15570d(tokenViewModel.f31409J, null, null, new C48602(tokenViewModel, null), 3);
        if (this.f31712h) {
            InterfaceC4865b.a.m10388a(tokenViewModel, false, 3);
        }
        return C9072e.f47360a;
    }
}
