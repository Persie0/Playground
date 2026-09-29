package com.lingq.p055ui.lesson.menu;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import km.InterfaceC6727j;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$1", m19206f = "LessonReviewMenuFragment.kt", m19207l = {107}, m19208m = "invokeSuspend")
public final class LessonReviewMenuFragment$onViewCreated$7$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28287e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonReviewMenuFragment f28288f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "lesson", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$1$1", m19206f = "LessonReviewMenuFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43281 extends SuspendLambda implements InterfaceC2056p<LessonStudy, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28289e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonReviewMenuFragment f28290f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43281(LessonReviewMenuFragment lessonReviewMenuFragment, InterfaceC9968c<? super C43281> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28290f = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43281 c43281 = new C43281(this.f28290f, interfaceC9968c);
            c43281.f28289e = obj;
            return c43281;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudy lessonStudy, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43281) mo1336a(lessonStudy, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonStudy lessonStudy = (LessonStudy) this.f28289e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
            this.f28290f.m10184n0().f45122a.setText(lessonStudy != null ? lessonStudy.f21816b : null);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$7$1(LessonReviewMenuFragment lessonReviewMenuFragment, InterfaceC9968c<? super LessonReviewMenuFragment$onViewCreated$7$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28288f = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonReviewMenuFragment$onViewCreated$7$1(this.f28288f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonReviewMenuFragment$onViewCreated$7$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28287e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f28288f;
            LessonViewModel lessonViewModelM10185o0 = lessonReviewMenuFragment.m10185o0();
            C43281 c43281 = new C43281(lessonReviewMenuFragment, null);
            this.f28287e = 1;
            if (C0062b.m369m0(lessonViewModelM10185o0.f27517x0, c43281, this) == coroutineSingletons) {
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
