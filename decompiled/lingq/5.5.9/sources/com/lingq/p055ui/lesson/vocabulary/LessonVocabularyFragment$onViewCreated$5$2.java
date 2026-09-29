package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenViewState;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.linguist.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.C7777d;
import p369rj.C8818c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$2", m19206f = "LessonVocabularyFragment.kt", m19207l = {127}, m19208m = "invokeSuspend")
public final class LessonVocabularyFragment$onViewCreated$5$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29221e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonVocabularyFragment f29222f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "Lcom/lingq/shared/uimodel/token/TokenType;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$2$1", m19206f = "LessonVocabularyFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44681 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends TokenType>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29223e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonVocabularyFragment f29224f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44681(LessonVocabularyFragment lessonVocabularyFragment, InterfaceC9968c<? super C44681> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29224f = lessonVocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44681 c44681 = new C44681(this.f29224f, interfaceC9968c);
            c44681.f29223e = obj;
            return c44681;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends String, ? extends TokenType> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44681) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f29223e;
            String str = (String) pair.f38012a;
            TokenType tokenType = (TokenType) pair.f38013b;
            LessonVocabularyFragment lessonVocabularyFragment = this.f29224f;
            if (C7777d.m15481b(lessonVocabularyFragment)) {
                LessonVocabularyViewModel lessonVocabularyViewModel = (LessonVocabularyViewModel) lessonVocabularyFragment.f29209C0.getValue();
                lessonVocabularyViewModel.f29343f.mo10048f2(new TokenData(str, tokenType, 0, 0, null, TokenViewState.Expanded.f31717a, TokenControllerType.Lesson, null, 0, null, 924));
            } else {
                Bundle bundle = new Bundle();
                bundle.putParcelable("tokenData", new TokenData(str, tokenType, 0, 0, null, TokenViewState.Expanded.f31717a, TokenControllerType.Vocabulary, null, 0, null, 924));
                bundle.putInt("lessonId", ((C8818c) lessonVocabularyFragment.f29208B0.getValue()).f46713a);
                C7777d.m15485f(C4924a.m10446Y(lessonVocabularyFragment), R.id.fragment_container_token, bundle, true, false);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyFragment$onViewCreated$5$2(LessonVocabularyFragment lessonVocabularyFragment, InterfaceC9968c<? super LessonVocabularyFragment$onViewCreated$5$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29222f = lessonVocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonVocabularyFragment$onViewCreated$5$2(this.f29222f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonVocabularyFragment$onViewCreated$5$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29221e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonVocabularyFragment lessonVocabularyFragment = this.f29222f;
            LessonVocabularyViewModel lessonVocabularyViewModel = (LessonVocabularyViewModel) lessonVocabularyFragment.f29209C0.getValue();
            C44681 c44681 = new C44681(lessonVocabularyFragment, null);
            this.f29221e = 1;
            if (C0062b.m369m0(lessonVocabularyViewModel.f29347j, c44681, this) == coroutineSingletons) {
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
