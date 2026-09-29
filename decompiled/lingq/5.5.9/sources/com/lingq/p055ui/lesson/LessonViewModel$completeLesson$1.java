package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$completeLesson$1", m19206f = "LessonViewModel.kt", m19207l = {1178, 1179}, m19208m = "invokeSuspend")
public final class LessonViewModel$completeLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27649e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$completeLesson$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$completeLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27650f = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$completeLesson$1(this.f27650f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$completeLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27649e;
        LessonViewModel lessonViewModel = this.f27650f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            lessonViewModel.m10134A2(AbstractC4269c.a.f27844a);
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        if (((Number) lessonViewModel.f27508s1.getValue()).intValue() <= 0 || !lessonViewModel.f27405J.f37891b.getBoolean("pagingDealWithWords", true) || lessonViewModel.m10150w2()) {
            String strMo498E1 = lessonViewModel.mo498E1();
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), lessonViewModel.f27423P, null, new LessonViewModel$moveAllPagesToKnown$1(lessonViewModel, strMo498E1, null), 2);
            String strMo498E2 = lessonViewModel.mo498E1();
            int iM10152y2 = lessonViewModel.m10152y2();
            this.f27649e = 1;
            if (lessonViewModel.f27469e.mo6119n(iM10152y2, strMo498E2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            lessonViewModel.f27414M.m15505b(null, "Blue words remaining button click");
            lessonViewModel.f27394E1.mo14371k(C9072e.f47360a);
        }
        return C9072e.f47360a;
        InterfaceC3324a interfaceC3324a = lessonViewModel.f27465d;
        String strMo498E3 = lessonViewModel.mo498E1();
        int iM10152y3 = lessonViewModel.m10152y2();
        this.f27649e = 2;
        if (interfaceC3324a.mo9526n(iM10152y3, strMo498E3, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonViewModel.m10134A2(AbstractC4269c.a.f27844a);
        return C9072e.f47360a;
    }
}
