package com.lingq.p055ui.lesson.menu;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/tooltips/TooltipStep;", "step", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$8", m19206f = "LessonReviewMenuFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class LessonReviewMenuFragment$onViewCreated$7$8 extends SuspendLambda implements InterfaceC2056p<TooltipStep, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f28315e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonReviewMenuFragment f28316f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$8$a */
    public /* synthetic */ class C4336a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28318a;

        static {
            int[] iArr = new int[TooltipStep.values().length];
            try {
                iArr[TooltipStep.ReviewMenu.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28318a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$7$8(LessonReviewMenuFragment lessonReviewMenuFragment, InterfaceC9968c<? super LessonReviewMenuFragment$onViewCreated$7$8> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28316f = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        LessonReviewMenuFragment$onViewCreated$7$8 lessonReviewMenuFragment$onViewCreated$7$8 = new LessonReviewMenuFragment$onViewCreated$7$8(this.f28316f, interfaceC9968c);
        lessonReviewMenuFragment$onViewCreated$7$8.f28315e = obj;
        return lessonReviewMenuFragment$onViewCreated$7$8;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(TooltipStep tooltipStep, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonReviewMenuFragment$onViewCreated$7$8) mo1336a(tooltipStep, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        TooltipStep tooltipStep = (TooltipStep) this.f28315e;
        if (C4336a.f28318a[tooltipStep.ordinal()] == 1) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            final LessonReviewMenuFragment lessonReviewMenuFragment = this.f28316f;
            lessonReviewMenuFragment.m3576Y().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            Rect rect = new Rect();
            lessonReviewMenuFragment.m10184n0().f45133l.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            rect2.top = ((int) rect.exactCenterY()) - (rect.height() / 2);
            int iAbs = Math.abs(rect.left - i10);
            List<Integer> list = C6716m.f37937a;
            rect2.right = iAbs - ((int) C6716m.m13316a(5));
            lessonReviewMenuFragment.m10186p0().mo9734g2(tooltipStep, rect, (16 & 4) != 0 ? new Rect() : rect2, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : false, (16 & 32) != 0 ? false : true, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                    return C9072e.f47360a;
                }
            } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$8.1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
                    lessonReviewMenuFragment.m10186p0().mo9723I(TooltipStep.ReviewMenu);
                    return C9072e.f47360a;
                }
            });
        }
        return C9072e.f47360a;
    }
}
