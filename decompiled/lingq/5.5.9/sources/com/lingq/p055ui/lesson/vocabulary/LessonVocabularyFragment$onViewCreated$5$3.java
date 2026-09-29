package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.C7777d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$3", m19206f = "LessonVocabularyFragment.kt", m19207l = {158}, m19208m = "invokeSuspend")
public final class LessonVocabularyFragment$onViewCreated$5$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29225e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonVocabularyFragment f29226f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$3$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$onViewCreated$5$3$1", m19206f = "LessonVocabularyFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44691 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LessonVocabularyFragment f29227e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44691(LessonVocabularyFragment lessonVocabularyFragment, InterfaceC9968c<? super C44691> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29227e = lessonVocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C44691(this.f29227e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44691) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C7777d.m15483d(C4924a.m10446Y(this.f29227e), true);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyFragment$onViewCreated$5$3(LessonVocabularyFragment lessonVocabularyFragment, InterfaceC9968c<? super LessonVocabularyFragment$onViewCreated$5$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29226f = lessonVocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonVocabularyFragment$onViewCreated$5$3(this.f29226f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonVocabularyFragment$onViewCreated$5$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29225e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonVocabularyFragment lessonVocabularyFragment = this.f29226f;
            InterfaceC7137r<C9072e> interfaceC7137rMo10038W1 = ((LessonVocabularyViewModel) lessonVocabularyFragment.f29209C0.getValue()).mo10038W1();
            C44691 c44691 = new C44691(lessonVocabularyFragment, null);
            this.f29225e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10038W1, c44691, this) == coroutineSingletons) {
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
