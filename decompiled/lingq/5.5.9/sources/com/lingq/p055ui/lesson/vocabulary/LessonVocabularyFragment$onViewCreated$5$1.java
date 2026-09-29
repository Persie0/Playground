package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$1", m19206f = "LessonVocabularyFragment.kt", m19207l = {117}, m19208m = "invokeSuspend")
public final class LessonVocabularyFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29217e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonVocabularyFragment f29218f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$1$1", m19206f = "LessonVocabularyFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44671 extends SuspendLambda implements InterfaceC2056p<List<? extends C7374a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29219e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonVocabularyFragment f29220f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44671(LessonVocabularyFragment lessonVocabularyFragment, InterfaceC9968c<? super C44671> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29220f = lessonVocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44671 c44671 = new C44671(this.f29220f, interfaceC9968c);
            c44671.f29219e = obj;
            return c44671;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7374a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44671) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f29219e;
            if (list != null && list.isEmpty()) {
                this.f29220f.m10230n0().f45165d.m4683b(1, false);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyFragment$onViewCreated$5$1(LessonVocabularyFragment lessonVocabularyFragment, InterfaceC9968c<? super LessonVocabularyFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29218f = lessonVocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonVocabularyFragment$onViewCreated$5$1(this.f29218f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonVocabularyFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29217e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonVocabularyFragment lessonVocabularyFragment = this.f29218f;
            LessonVocabularyViewModel lessonVocabularyViewModel = (LessonVocabularyViewModel) lessonVocabularyFragment.f29209C0.getValue();
            C44671 c44671 = new C44671(lessonVocabularyFragment, null);
            this.f29217e = 1;
            if (C0062b.m369m0(lessonVocabularyViewModel.f29349l, c44671, this) == coroutineSingletons) {
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
