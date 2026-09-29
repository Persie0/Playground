package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p159hi.C6052c;
import p260m8.C7499b;
import p265mj.C7567a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u008a@"}, m13365d2 = {"Lmj/a;", "pageData", "", "", "Lhi/c;", "cards", "Lcom/lingq/ui/lesson/page/a;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$bottomButtonState$1", m19206f = "LessonPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonPageViewModel$bottomButtonState$1 extends SuspendLambda implements InterfaceC2057q<C7567a, Map<String, ? extends C6052c>, InterfaceC9968c<? super AbstractC4385a>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C7567a f28600e;

    public LessonPageViewModel$bottomButtonState$1(InterfaceC9968c<? super LessonPageViewModel$bottomButtonState$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(C7567a c7567a, Map<String, ? extends C6052c> map, InterfaceC9968c<? super AbstractC4385a> interfaceC9968c) {
        LessonPageViewModel$bottomButtonState$1 lessonPageViewModel$bottomButtonState$1 = new LessonPageViewModel$bottomButtonState$1(interfaceC9968c);
        lessonPageViewModel$bottomButtonState$1.f28600e = c7567a;
        return lessonPageViewModel$bottomButtonState$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return this.f28600e.f41704d ? AbstractC4385a.b.f28709a : AbstractC4385a.a.f28708a;
    }
}
