package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p159hi.C6052c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lhi/c;", "cards", "phrases", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$cardsCount$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$cardsCount$1 extends SuspendLambda implements InterfaceC2057q<Map<String, ? extends C6052c>, Map<String, ? extends C6052c>, InterfaceC9968c<? super Integer>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Map f27627e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Map f27628f;

    public LessonViewModel$cardsCount$1(InterfaceC9968c<? super LessonViewModel$cardsCount$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Map<String, ? extends C6052c> map, Map<String, ? extends C6052c> map2, InterfaceC9968c<? super Integer> interfaceC9968c) {
        LessonViewModel$cardsCount$1 lessonViewModel$cardsCount$1 = new LessonViewModel$cardsCount$1(interfaceC9968c);
        lessonViewModel$cardsCount$1.f27627e = map;
        lessonViewModel$cardsCount$1.f27628f = map2;
        return lessonViewModel$cardsCount$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        Map map = this.f27627e;
        Map map2 = this.f27628f;
        return new Integer(map2.size() + map.size());
    }
}
