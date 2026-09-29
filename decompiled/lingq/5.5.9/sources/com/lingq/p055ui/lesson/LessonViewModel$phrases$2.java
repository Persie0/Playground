package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p159hi.C6052c;
import p260m8.C7499b;
import p265mj.C7567a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "Lhi/c;", "", "Lmj/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$phrases$2", m19206f = "LessonViewModel.kt", m19207l = {305}, m19208m = "invokeSuspend")
final class LessonViewModel$phrases$2 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Map<String, ? extends C6052c>>, List<? extends C7567a>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27723e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f27724f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonViewModel f27725g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$phrases$2(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$phrases$2> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f27725g = lessonViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Map<String, ? extends C6052c>> interfaceC7117d, List<? extends C7567a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonViewModel$phrases$2 lessonViewModel$phrases$2 = new LessonViewModel$phrases$2(this.f27725g, interfaceC9968c);
        lessonViewModel$phrases$2.f27724f = interfaceC7117d;
        return lessonViewModel$phrases$2.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27723e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f27724f;
            LessonViewModel lessonViewModel = this.f27725g;
            InterfaceC7116c<List<C6052c>> interfaceC7116cMo5954f = lessonViewModel.f27473f.mo5954f(lessonViewModel.m10152y2());
            this.f27723e = 1;
            C0062b.m289M0(interfaceC7117d);
            Object objMo9539a = interfaceC7116cMo5954f.mo9539a(new LessonViewModel$phrases$2$invokeSuspend$$inlined$map$1$2(interfaceC7117d, lessonViewModel), this);
            if (objMo9539a != obj2) {
                objMo9539a = C9072e.f47360a;
            }
            if (objMo9539a != obj2) {
                objMo9539a = C9072e.f47360a;
            }
            if (objMo9539a == obj2) {
                return obj2;
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
