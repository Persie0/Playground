package com.lingq.p055ui.lesson.player;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "sentences", "", "progress", "Lcom/lingq/ui/lesson/player/a$a;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$adapterItems$1", m19206f = "ListeningModeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class ListeningModeViewModel$adapterItems$1 extends SuspendLambda implements InterfaceC2057q<List<? extends LessonStudyTranslationSentence>, Long, InterfaceC9968c<? super List<? extends C4411a.a>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f28839e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ long f28840f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ListeningModeViewModel f28841g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeViewModel$adapterItems$1(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super ListeningModeViewModel$adapterItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f28841g = listeningModeViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends LessonStudyTranslationSentence> list, Long l10, InterfaceC9968c<? super List<? extends C4411a.a>> interfaceC9968c) {
        long jLongValue = l10.longValue();
        ListeningModeViewModel$adapterItems$1 listeningModeViewModel$adapterItems$1 = new ListeningModeViewModel$adapterItems$1(this.f28841g, interfaceC9968c);
        listeningModeViewModel$adapterItems$1.f28839e = list;
        listeningModeViewModel$adapterItems$1.f28840f = jLongValue;
        return listeningModeViewModel$adapterItems$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean z10;
        C4411a.a aVar;
        Double d10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f28839e;
        long j10 = this.f28840f;
        boolean z11 = true;
        if (!list.isEmpty()) {
            this.f28841g.f28802R.setValue(Boolean.FALSE);
        }
        ListeningModeViewModel listeningModeViewModel = this.f28841g;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        boolean z12 = false;
        int i10 = 0;
        for (Object obj2 : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) obj2;
            Double d11 = lessonStudyTranslationSentence.f21897c;
            if (d11 != null) {
                double dDoubleValue = d11.doubleValue();
                LessonStudyTranslationSentence lessonStudyTranslationSentence2 = (LessonStudyTranslationSentence) C6752c.m13426T(i11, list);
                double dDoubleValue2 = (lessonStudyTranslationSentence2 == null || (d10 = lessonStudyTranslationSentence2.f21897c) == null) ? dDoubleValue : d10.doubleValue();
                Double d12 = lessonStudyTranslationSentence.f21898d;
                z10 = z12;
                aVar = new C4411a.a(lessonStudyTranslationSentence, ListeningModeViewModel.m10212l2(listeningModeViewModel, j10, dDoubleValue, (d12 == null || dDoubleValue != d12.doubleValue()) ? z12 : z11, dDoubleValue2));
            } else {
                z10 = z12;
                aVar = new C4411a.a(lessonStudyTranslationSentence, z10);
            }
            arrayList.add(aVar);
            z12 = z10;
            i10 = i11;
            z11 = true;
        }
        return arrayList;
    }
}
