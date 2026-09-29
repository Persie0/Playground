package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.UserLanguageProgressChartEntry;
import com.lingq.util.C4924a;
import com.linguist.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$getActivityData$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {436}, m19208m = "invokeSuspend")
public final class LessonCompleteViewModel$getActivityData$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29034e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteViewModel f29035f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteViewModel$getActivityData$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserLanguageProgressChartEntry;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$getActivityData$1$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44291 extends SuspendLambda implements InterfaceC2056p<List<? extends UserLanguageProgressChartEntry>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29036e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonCompleteViewModel f29037f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44291(LessonCompleteViewModel lessonCompleteViewModel, InterfaceC9968c<? super C44291> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29037f = lessonCompleteViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44291 c44291 = new C44291(this.f29037f, interfaceC9968c);
            c44291.f29036e = obj;
            return c44291;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserLanguageProgressChartEntry> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44291) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f29036e;
            this.f29037f.f29008j0.setValue(new Pair(C4924a.m10473m0(R.attr.redTint, list, true), C4924a.m10473m0(R.attr.blueWordBorderColor, list, false)));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$getActivityData$1(LessonCompleteViewModel lessonCompleteViewModel, InterfaceC9968c<? super LessonCompleteViewModel$getActivityData$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f29035f = lessonCompleteViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteViewModel$getActivityData$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteViewModel$getActivityData$1(this.f29035f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29034e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonCompleteViewModel lessonCompleteViewModel = this.f29035f;
            InterfaceC7116c<List<UserLanguageProgressChartEntry>> interfaceC7116cMo6046g = lessonCompleteViewModel.f28999f.mo6046g(lessonCompleteViewModel.mo498E1(), ((LanguageProgressPeriod) lessonCompleteViewModel.f29006i0.getValue()).getKey(), ((LanguageProgressMetric) lessonCompleteViewModel.f29004h0.getValue()).getKey());
            C44291 c44291 = new C44291(lessonCompleteViewModel, null);
            this.f29034e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6046g, c44291, this) == coroutineSingletons) {
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
