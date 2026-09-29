package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p096ei.C5408a;
import p225kk.C6716m;
import p260m8.C7499b;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$18", m19206f = "LessonPageFragment.kt", m19207l = {664}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$18 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28414e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28415f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28416g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$18$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lmj/d;", "Lcom/lingq/ui/tooltips/TooltipStep;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$18$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43521 extends SuspendLambda implements InterfaceC2056p<Pair<? extends C7570d, ? extends TooltipStep>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28417e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28418f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f28419g;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$18$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f28424a;

            static {
                int[] iArr = new int[TooltipStep.values().length];
                try {
                    iArr[TooltipStep.SentenceModeAudio.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TooltipStep.FirstLingQ.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f28424a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43521(int i10, LessonPageFragment lessonPageFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28418f = lessonPageFragment;
            this.f28419g = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43521 c43521 = new C43521(this.f28419g, this.f28418f, interfaceC9968c);
            c43521.f28417e = obj;
            return c43521;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends C7570d, ? extends TooltipStep> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43521) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f28417e;
            final C7570d c7570d = (C7570d) pair.f38012a;
            final TooltipStep tooltipStep = (TooltipStep) pair.f38013b;
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            final LessonPageFragment lessonPageFragment = this.f28418f;
            if (lessonPageFragment.m10192s0().m10147t2() == this.f28419g && lessonPageFragment.m10193t0().mo9735h().getValue().booleanValue()) {
                int i10 = a.f28424a[tooltipStep.ordinal()];
                boolean z10 = false;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (c7570d != null) {
                            Rect rectM10189p0 = lessonPageFragment.m10189p0(c7570d, C5408a.m11572e(lessonPageFragment.m10192s0().mo498E1()));
                            int i11 = rectM10189p0.top;
                            List<Integer> list = C6716m.f37937a;
                            rectM10189p0.top = i11 - ((int) C6716m.m13316a(5));
                            rectM10189p0.bottom += (int) C6716m.m13316a(20);
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            lessonPageFragment.m3576Y().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                            int i12 = displayMetrics.heightPixels;
                            Rect rect = new Rect();
                            int i13 = rectM10189p0.bottom;
                            if (i13 > i12 / 2) {
                                rect.bottom = rectM10189p0.top - ((int) C6716m.m13316a(10));
                            } else {
                                rect.top = i13 + ((int) C6716m.m13316a(20));
                            }
                            lessonPageFragment.m10193t0().mo9734g2(tooltipStep, rectM10189p0, rect, tooltipStep == TooltipStep.TapBlueWord, true, false, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment.onViewCreated.2.18.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C9072e mo807E() {
                                    if (tooltipStep == TooltipStep.TapBlueWord) {
                                        LessonPageFragment.C4337a c4337a2 = LessonPageFragment.f28335M0;
                                        lessonPageFragment.m10193t0().m10207v2(c7570d);
                                    }
                                    return C9072e.f47360a;
                                }
                            });
                        }
                    } else if (!lessonPageFragment.m10192s0().mo9741p0(TooltipStep.FirstLingQ)) {
                        lessonPageFragment.m10192s0().f27434S1.mo14371k(C9072e.f47360a);
                    }
                } else if (lessonPageFragment.m10192s0().m10151x2()) {
                    ConstraintLayout constraintLayout = lessonPageFragment.m10191r0().f44796t;
                    C5207g.m11110e(constraintLayout, "binding.viewTtsSentence");
                    if (constraintLayout.getVisibility() == 0) {
                        z10 = true;
                    }
                    if (z10) {
                        Rect rect2 = new Rect();
                        lessonPageFragment.m10191r0().f44796t.getGlobalVisibleRect(rect2);
                        int i14 = rect2.top;
                        List<Integer> list2 = C6716m.f37937a;
                        rect2.top = i14 - ((int) C6716m.m13316a(5));
                        rect2.bottom += (int) C6716m.m13316a(5);
                        Rect rect3 = new Rect();
                        rect3.top = rect2.top - ((int) C6716m.m13316a(5));
                        rect3.right = (int) C6716m.m13316a(10);
                        rect3.left = rect2.right + ((int) C6716m.m13316a(10));
                        lessonPageFragment.m10192s0().mo9734g2(tooltipStep, rect2, (16 & 4) != 0 ? new Rect() : rect3, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : false, (16 & 32) != 0 ? false : true, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment.onViewCreated.2.18.1.1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        });
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$18(int i10, LessonPageFragment lessonPageFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28415f = lessonPageFragment;
        this.f28416g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$18(this.f28416g, this.f28415f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$18) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28414e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28415f;
            LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
            C43521 c43521 = new C43521(this.f28416g, lessonPageFragment, null);
            this.f28414e = 1;
            if (C0062b.m369m0(lessonPageViewModelM10193t0.f28576w0, c43521, this) == coroutineSingletons) {
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
