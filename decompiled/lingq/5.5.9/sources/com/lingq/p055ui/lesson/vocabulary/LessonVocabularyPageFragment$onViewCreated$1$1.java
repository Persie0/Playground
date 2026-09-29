package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.InterfaceC7379f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$onViewCreated$1$1", m19206f = "LessonVocabularyPageFragment.kt", m19207l = {92}, m19208m = "invokeSuspend")
public final class LessonVocabularyPageFragment$onViewCreated$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29250e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonVocabularyPageFragment f29251f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4495a f29252g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$onViewCreated$1$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/f;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$onViewCreated$1$1$1", m19206f = "LessonVocabularyPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44731 extends SuspendLambda implements InterfaceC2056p<List<? extends InterfaceC7379f>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29253e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C4495a f29254f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44731(C4495a c4495a, InterfaceC9968c<? super C44731> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29254f = c4495a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44731 c44731 = new C44731(this.f29254f, interfaceC9968c);
            c44731.f29253e = obj;
            return c44731;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends InterfaceC7379f> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44731) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f29254f.m4529q((List) this.f29253e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyPageFragment$onViewCreated$1$1(C4495a c4495a, LessonVocabularyPageFragment lessonVocabularyPageFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29251f = lessonVocabularyPageFragment;
        this.f29252g = c4495a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonVocabularyPageFragment$onViewCreated$1$1(this.f29252g, this.f29251f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonVocabularyPageFragment$onViewCreated$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29250e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonVocabularyPageViewModel lessonVocabularyPageViewModelM10231n0 = LessonVocabularyPageFragment.m10231n0(this.f29251f);
            C44731 c44731 = new C44731(this.f29252g, null);
            this.f29250e = 1;
            if (C0062b.m369m0(lessonVocabularyPageViewModelM10231n0.f29271H, c44731, this) == coroutineSingletons) {
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
