package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.uimodel.WordStatus;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ni.C7793a;
import no.C7828f;
import no.InterfaceC7882z;
import p159hi.C6054e;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$showWordTooltips$1", m19206f = "LessonPageViewModel.kt", m19207l = {1112, 1117, 1122}, m19208m = "invokeSuspend")
final class LessonPageViewModel$showWordTooltips$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public C7570d f28657e;

    /* JADX INFO: renamed from: f */
    public int f28658f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonPageViewModel f28659g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$showWordTooltips$1(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super LessonPageViewModel$showWordTooltips$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28659g = lessonPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$showWordTooltips$1(this.f28659g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$showWordTooltips$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List list;
        C7570d c7570d;
        C7570d c7570d2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28658f;
        LessonPageViewModel lessonPageViewModel = this.f28659g;
        if (i10 != 0) {
            if (i10 == 1) {
                c7570d = this.f28657e;
                C7499b.m14977z0(obj);
            } else {
                if (i10 == 2) {
                    c7570d = this.f28657e;
                    C7499b.m14977z0(obj);
                    lessonPageViewModel.f28575v0.mo14371k(new Pair(c7570d, TooltipStep.TapSecondBlueWord));
                    if (lessonPageViewModel.mo9746v1(TooltipStep.TapThirdBlueWord)) {
                        this.f28657e = c7570d;
                        this.f28658f = 3;
                        if (C7828f.m15567a(160L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c7570d2 = c7570d;
                    }
                    return C9072e.f47360a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7570d2 = this.f28657e;
                C7499b.m14977z0(obj);
            }
            lessonPageViewModel.f28575v0.mo14371k(new Pair(c7570d2, TooltipStep.TapThirdBlueWord));
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        C7567a c7567a = (C7567a) lessonPageViewModel.f28531M.getValue();
        if (c7567a == null || (list = c7567a.f41703c) == null) {
            list = EmptyList.f38032a;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                c7570d = (C7570d) it.next();
                Map map = (Map) lessonPageViewModel.f28537S.getValue();
                String str = c7570d.f41725e;
                Locale locale = lessonPageViewModel.f28530L;
                C5207g.m11110e(locale, "locale");
                C6054e c6054e = (C6054e) map.get(C7793a.m15502f(str, locale));
                if (c6054e != null) {
                    if (C5207g.m11106a(c6054e.f35748f, WordStatus.New.getValue())) {
                        this.f28657e = c7570d;
                        this.f28658f = 1;
                        if (C7828f.m15567a(160L, this) != coroutineSingletons) {
                            break;
                        }
                        return coroutineSingletons;
                    }
                }
            }
            return C9072e.f47360a;
        }
        TooltipStep tooltipStep = TooltipStep.TapBlueWord;
        if (lessonPageViewModel.mo9746v1(tooltipStep)) {
            lessonPageViewModel.f28575v0.mo14371k(new Pair(c7570d, tooltipStep));
        }
        if (lessonPageViewModel.mo9746v1(TooltipStep.TapSecondBlueWord)) {
            this.f28657e = c7570d;
            this.f28658f = 2;
            if (C7828f.m15567a(160L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonPageViewModel.f28575v0.mo14371k(new Pair(c7570d, TooltipStep.TapSecondBlueWord));
            if (lessonPageViewModel.mo9746v1(TooltipStep.TapThirdBlueWord)) {
                this.f28657e = c7570d;
                this.f28658f = 3;
                if (C7828f.m15567a(160L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c7570d2 = c7570d;
                lessonPageViewModel.f28575v0.mo14371k(new Pair(c7570d2, TooltipStep.TapThirdBlueWord));
            }
        } else if (lessonPageViewModel.mo9746v1(TooltipStep.TapThirdBlueWord)) {
            this.f28657e = c7570d;
            this.f28658f = 3;
            if (C7828f.m15567a(160L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c7570d2 = c7570d;
            lessonPageViewModel.f28575v0.mo14371k(new Pair(c7570d2, TooltipStep.TapThirdBlueWord));
        }
        return C9072e.f47360a;
    }
}
