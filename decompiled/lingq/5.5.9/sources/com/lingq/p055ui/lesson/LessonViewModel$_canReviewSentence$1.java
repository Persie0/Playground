package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, m13365d2 = {"", "", "", "", "tokens", "page", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$_canReviewSentence$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$_canReviewSentence$1 extends SuspendLambda implements InterfaceC2057q<Map<Integer, ? extends List<? extends String>>, Integer, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Map f27607e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ int f27608f;

    public LessonViewModel$_canReviewSentence$1(InterfaceC9968c<? super LessonViewModel$_canReviewSentence$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Map<Integer, ? extends List<? extends String>> map, Integer num, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        int iIntValue = num.intValue();
        LessonViewModel$_canReviewSentence$1 lessonViewModel$_canReviewSentence$1 = new LessonViewModel$_canReviewSentence$1(interfaceC9968c);
        lessonViewModel$_canReviewSentence$1.f27607e = map;
        lessonViewModel$_canReviewSentence$1.f27608f = iIntValue;
        return lessonViewModel$_canReviewSentence$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = (List) this.f27607e.get(new Integer(this.f27608f));
        if (list != null) {
            z10 = list.isEmpty() ^ true;
        }
        return Boolean.valueOf(z10);
    }
}
