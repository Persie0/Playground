package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenType;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyAddFragment$onViewCreated$4$1", m19206f = "VocabularyAddFragment.kt", m19207l = {61}, m19208m = "invokeSuspend")
public final class VocabularyAddFragment$onViewCreated$4$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26108e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyAddFragment f26109f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAddFragment$onViewCreated$4$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "wordExists", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyAddFragment$onViewCreated$4$1$1", m19206f = "VocabularyAddFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39951 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26110e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyAddFragment f26111f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39951(VocabularyAddFragment vocabularyAddFragment, InterfaceC9968c<? super C39951> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26111f = vocabularyAddFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39951 c39951 = new C39951(this.f26111f, interfaceC9968c);
            c39951.f26110e = obj;
            return c39951;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39951) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Boolean bool = (Boolean) this.f26110e;
            if (bool != null) {
                bool.booleanValue();
                TokenType tokenType = bool.booleanValue() ? TokenType.WordType : TokenType.NewWordOrPhraseType;
                VocabularyAddFragment vocabularyAddFragment = this.f26111f;
                VocabularyViewModel vocabularyViewModel = (VocabularyViewModel) vocabularyAddFragment.f26099S0.getValue();
                String strValueOf = String.valueOf(vocabularyAddFragment.m10018u0().f44893c.getText());
                C5207g.m11111f(tokenType, "tokenType");
                vocabularyViewModel.f26234U.mo14371k(new Pair(strValueOf, tokenType));
                C8573r0.m16725g0(vocabularyAddFragment).m3995p();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyAddFragment$onViewCreated$4$1(VocabularyAddFragment vocabularyAddFragment, InterfaceC9968c<? super VocabularyAddFragment$onViewCreated$4$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26109f = vocabularyAddFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyAddFragment$onViewCreated$4$1(this.f26109f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyAddFragment$onViewCreated$4$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26108e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyAddFragment.f26096T0;
            VocabularyAddFragment vocabularyAddFragment = this.f26109f;
            VocabularyAddViewModel vocabularyAddViewModel = (VocabularyAddViewModel) vocabularyAddFragment.f26098R0.getValue();
            C39951 c39951 = new C39951(vocabularyAddFragment, null);
            this.f26108e = 1;
            if (C0062b.m369m0(vocabularyAddViewModel.f26127h, c39951, this) == coroutineSingletons) {
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
