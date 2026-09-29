package com.lingq.p055ui.token;

import ae.C0062b;
import android.widget.LinearLayout;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$13", m19206f = "TokenFragment.kt", m19207l = {790}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$13 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31259e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31260f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$13$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "should", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$13$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48051 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f31261e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31262f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48051(TokenFragment tokenFragment, InterfaceC9968c<? super C48051> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31262f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48051 c48051 = new C48051(this.f31262f, interfaceC9968c);
            c48051.f31261e = ((Boolean) obj).booleanValue();
            return c48051;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48051) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f31261e;
            TokenFragment tokenFragment = this.f31262f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                LinearLayout linearLayout = tokenFragment.m10362n0().f45367O;
                C5207g.m11110e(linearLayout, "binding.viewDictionariesAndMeanings");
                C4924a.m10457e0(linearLayout);
                TextView textView = tokenFragment.m10362n0().f45356D;
                C5207g.m11110e(textView, "binding.tvDictionariesAndMeanings");
                C4924a.m10442U(textView);
                TextInputLayout textInputLayout = tokenFragment.m10362n0().f45404z;
                C5207g.m11110e(textInputLayout, "binding.tlMeaning");
                C4924a.m10457e0(textInputLayout);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                LinearLayout linearLayout2 = tokenFragment.m10362n0().f45367O;
                C5207g.m11110e(linearLayout2, "binding.viewDictionariesAndMeanings");
                C4924a.m10442U(linearLayout2);
                TextView textView2 = tokenFragment.m10362n0().f45356D;
                C5207g.m11110e(textView2, "binding.tvDictionariesAndMeanings");
                C4924a.m10457e0(textView2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$13(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$13> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31260f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$13(this.f31260f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$13) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31259e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31260f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48051 c48051 = new C48051(tokenFragment, null);
            this.f31259e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31398A0, c48051, this) == coroutineSingletons) {
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
