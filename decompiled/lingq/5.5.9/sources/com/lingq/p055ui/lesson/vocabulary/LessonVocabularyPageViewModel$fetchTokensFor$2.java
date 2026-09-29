package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.WordStatus;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.StateFlowImpl;
import li.C7378e;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchTokensFor$2", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {136}, m19208m = "invokeSuspend")
final class LessonVocabularyPageViewModel$fetchTokensFor$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29318e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonVocabularyPageViewModel f29319f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchTokensFor$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchTokensFor$2$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44911 extends SuspendLambda implements InterfaceC2056p<List<? extends C7378e>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29320e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonVocabularyPageViewModel f29321f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44911(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, InterfaceC9968c<? super C44911> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29321f = lessonVocabularyPageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44911 c44911 = new C44911(this.f29321f, interfaceC9968c);
            c44911.f29320e = obj;
            return c44911;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7378e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44911) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f29320e;
            StateFlowImpl stateFlowImpl = this.f29321f.f29273J;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (C5207g.m11106a(((C7378e) obj2).f41174h, WordStatus.New.getValue())) {
                    arrayList.add(obj2);
                }
            }
            stateFlowImpl.setValue(arrayList);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyPageViewModel$fetchTokensFor$2(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, InterfaceC9968c<? super LessonVocabularyPageViewModel$fetchTokensFor$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f29319f = lessonVocabularyPageViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonVocabularyPageViewModel$fetchTokensFor$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonVocabularyPageViewModel$fetchTokensFor$2(this.f29319f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29318e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonVocabularyPageViewModel lessonVocabularyPageViewModel = this.f29319f;
            InterfaceC7116c<List<C7378e>> interfaceC7116cMo6200j = lessonVocabularyPageViewModel.f29276e.mo6200j(lessonVocabularyPageViewModel.f29281j);
            C44911 c44911 = new C44911(lessonVocabularyPageViewModel, null);
            this.f29318e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6200j, c44911, this) == coroutineSingletons) {
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
