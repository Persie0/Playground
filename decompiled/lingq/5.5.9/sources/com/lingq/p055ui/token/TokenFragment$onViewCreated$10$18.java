package com.lingq.p055ui.token;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.dictionaries.DictionariesLocaleFragment;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$18", m19206f = "TokenFragment.kt", m19207l = {847}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$18 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31279e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31280f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$18$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "Lcom/lingq/shared/uimodel/token/TokenMeaning;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$18$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48101 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends TokenMeaning>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31281e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31282f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48101(TokenFragment tokenFragment, InterfaceC9968c<? super C48101> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31282f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48101 c48101 = new C48101(this.f31282f, interfaceC9968c);
            c48101.f31281e = obj;
            return c48101;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends String, ? extends TokenMeaning> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48101) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f31281e;
            String str = (String) pair.f38012a;
            TokenMeaning tokenMeaning = (TokenMeaning) pair.f38013b;
            DictionariesLocaleFragment.f31726T0.getClass();
            C5207g.m11111f(str, "term");
            C5207g.m11111f(tokenMeaning, "tokenMeaning");
            DictionariesLocaleFragment dictionariesLocaleFragment = new DictionariesLocaleFragment();
            Bundle bundle = new Bundle();
            bundle.putString("term", str);
            bundle.putParcelable("tokenMeaning", tokenMeaning);
            dictionariesLocaleFragment.m3583e0(bundle);
            dictionariesLocaleFragment.mo3772s0(this.f31282f.m3594l(), "dictionaries_locale");
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$18(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$18> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31280f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$18(this.f31280f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$18) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31279e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31280f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48101 c48101 = new C48101(tokenFragment, null);
            this.f31279e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31402E0, c48101, this) == coroutineSingletons) {
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
