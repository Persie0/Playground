package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenViewState;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import dj.C5192j;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$7", m19206f = "VocabularyFragment.kt", m19207l = {305}, m19208m = "invokeSuspend")
public final class VocabularyFragment$onViewCreated$3$7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26199e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFragment f26200f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$7$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "Lcom/lingq/shared/uimodel/token/TokenType;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$7$1", m19206f = "VocabularyFragment.kt", m19207l = {307}, m19208m = "invokeSuspend")
    public static final class C40161 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends TokenType>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public TokenType f26201e;

        /* JADX INFO: renamed from: f */
        public int f26202f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f26203g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ VocabularyFragment f26204h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40161(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super C40161> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26204h = vocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40161 c40161 = new C40161(this.f26204h, interfaceC9968c);
            c40161.f26203g = obj;
            return c40161;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends String, ? extends TokenType> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40161) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            TokenType tokenType;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26202f;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                Pair pair = (Pair) this.f26203g;
                String str2 = (String) pair.f38012a;
                TokenType tokenType2 = (TokenType) pair.f38013b;
                this.f26203g = str2;
                this.f26201e = tokenType2;
                this.f26202f = 1;
                if (C7828f.m15567a(150L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                tokenType = tokenType2;
                str = str2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TokenType tokenType3 = this.f26201e;
                String str3 = (String) this.f26203g;
                C7499b.m14977z0(obj);
                tokenType = tokenType3;
                str = str3;
            }
            C4924a.m10447Z(C8573r0.m16725g0(this.f26204h), new C5192j(new TokenData(str, tokenType, 0, 0, null, TokenViewState.Expanded.f31717a, TokenControllerType.Vocabulary, null, 0, null, 924)));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFragment$onViewCreated$3$7(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super VocabularyFragment$onViewCreated$3$7> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26200f = vocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFragment$onViewCreated$3$7(this.f26200f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFragment$onViewCreated$3$7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26199e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyFragment vocabularyFragment = this.f26200f;
            VocabularyViewModel vocabularyViewModelM10022q0 = vocabularyFragment.m10022q0();
            C40161 c40161 = new C40161(vocabularyFragment, null);
            this.f26199e = 1;
            if (C0062b.m369m0(vocabularyViewModelM10022q0.f26235V, c40161, this) == coroutineSingletons) {
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
