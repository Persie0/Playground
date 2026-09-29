package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m13365d2 = {"", "generateLessonAudio", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "sentencesTranslations", "Lkotlin/Pair;", "", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$generateLessonAudio$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$generateLessonAudio$1 extends SuspendLambda implements InterfaceC2057q<Boolean, List<? extends LessonStudyTranslationSentence>, InterfaceC9968c<? super List<? extends Pair<? extends String, ? extends Integer>>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f27674e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f27675f;

    public LessonViewModel$generateLessonAudio$1(InterfaceC9968c<? super LessonViewModel$generateLessonAudio$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Boolean bool, List<? extends LessonStudyTranslationSentence> list, InterfaceC9968c<? super List<? extends Pair<? extends String, ? extends Integer>>> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        LessonViewModel$generateLessonAudio$1 lessonViewModel$generateLessonAudio$1 = new LessonViewModel$generateLessonAudio$1(interfaceC9968c);
        lessonViewModel$generateLessonAudio$1.f27674e = zBooleanValue;
        lessonViewModel$generateLessonAudio$1.f27675f = list;
        return lessonViewModel$generateLessonAudio$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        boolean z10 = this.f27674e;
        List<LessonStudyTranslationSentence> list = this.f27675f;
        if (z10) {
            arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (LessonStudyTranslationSentence lessonStudyTranslationSentence : list) {
                arrayList.add(new Pair(lessonStudyTranslationSentence.f21899e, new Integer(lessonStudyTranslationSentence.f21895a)));
            }
        } else {
            arrayList = EmptyList.f38032a;
        }
        return arrayList;
    }
}
