package com.lingq.p055ui.lesson.vocabulary;

import ci.InterfaceC2023p;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$updatePopularMeanings$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {233}, m19208m = "invokeSuspend")
final class LessonVocabularyPageViewModel$updatePopularMeanings$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29330e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonVocabularyPageViewModel f29331f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f29332g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f29333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyPageViewModel$updatePopularMeanings$1(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, String str, String str2, InterfaceC9968c<? super LessonVocabularyPageViewModel$updatePopularMeanings$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29331f = lessonVocabularyPageViewModel;
        this.f29332g = str;
        this.f29333h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonVocabularyPageViewModel$updatePopularMeanings$1(this.f29331f, this.f29332g, this.f29333h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonVocabularyPageViewModel$updatePopularMeanings$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29330e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonVocabularyPageViewModel lessonVocabularyPageViewModel = this.f29331f;
                InterfaceC2023p interfaceC2023p = lessonVocabularyPageViewModel.f29278g;
                String str = this.f29332g;
                String str2 = this.f29333h;
                String strMo507p1 = lessonVocabularyPageViewModel.mo507p1();
                this.f29330e = 1;
                if (interfaceC2023p.mo6163a(str, str2, strMo507p1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
