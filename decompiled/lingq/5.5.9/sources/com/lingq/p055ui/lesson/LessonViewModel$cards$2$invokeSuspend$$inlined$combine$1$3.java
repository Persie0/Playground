package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6744b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import ni.C7793a;
import p159hi.C6052c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3", m19206f = "LessonViewModel.kt", m19207l = {292}, m19208m = "invokeSuspend")
public final class LessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Map<String, ? extends C6052c>>, List<? extends C6052c>[], InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27623e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f27624f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object[] f27625g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonViewModel f27626h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3(LessonViewModel lessonViewModel, InterfaceC9968c interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f27626h = lessonViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Map<String, ? extends C6052c>> interfaceC7117d, List<? extends C6052c>[] listArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3 lessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3 = new LessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3(this.f27626h, interfaceC9968c);
        lessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3.f27624f = interfaceC7117d;
        lessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3.f27625g = listArr;
        return lessonViewModel$cards$2$invokeSuspend$$inlined$combine$1$3.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27623e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f27624f;
            ArrayList arrayListM17680A = C9325m.m17680A(C6744b.m13391w0((List[]) this.f27625g));
            int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(arrayListM17680A, 10));
            if (iM14941g0 < 16) {
                iM14941g0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
            for (Object obj2 : arrayListM17680A) {
                String str = ((C6052c) obj2).f35735a;
                Locale locale = this.f27626h.f27495m0;
                C5207g.m11110e(locale, "locale");
                linkedHashMap.put(C7793a.m15502f(str, locale), obj2);
            }
            this.f27623e = 1;
            if (interfaceC7117d.mo1339r(linkedHashMap, this) == coroutineSingletons) {
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
