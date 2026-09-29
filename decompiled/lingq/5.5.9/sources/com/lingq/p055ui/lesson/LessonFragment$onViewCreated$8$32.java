package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.graphics.Rect;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.p055ui.tooltips.TooltipStep;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$32", m19206f = "LessonFragment.kt", m19207l = {1071}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$32 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27189e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27190f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$32$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/tooltips/TooltipStep;", "step", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$32$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41961 extends SuspendLambda implements InterfaceC2056p<TooltipStep, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27191e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27192f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$32$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f27199a;

            static {
                int[] iArr = new int[TooltipStep.values().length];
                try {
                    iArr[TooltipStep.ReviewMenuHighlight.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TooltipStep.PlayAudioHighlight.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TooltipStep.PlayAudio.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TooltipStep.SentenceModeHighlight.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TooltipStep.SentenceMode.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TooltipStep.SwipePageHighlight.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f27199a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41961(LessonFragment lessonFragment, InterfaceC9968c<? super C41961> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27192f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41961 c41961 = new C41961(this.f27192f, interfaceC9968c);
            c41961.f27191e = obj;
            return c41961;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(TooltipStep tooltipStep, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41961) mo1336a(tooltipStep, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            TooltipStep tooltipStep = (TooltipStep) this.f27191e;
            int i10 = a.f27199a[tooltipStep.ordinal()];
            boolean z10 = true;
            LessonFragment lessonFragment = this.f27192f;
            switch (i10) {
                case 1:
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                    if (lessonFragment.m10109q0().mo9735h().getValue().booleanValue()) {
                        Rect rect = new Rect();
                        lessonFragment.m10107o0().f44713x.getGlobalVisibleRect(rect);
                        lessonFragment.m10109q0().mo9734g2(tooltipStep, rect, (16 & 4) != 0 ? new Rect() : new Rect(), (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : true, (16 & 32) != 0 ? false : true, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.LessonFragment.onViewCreated.8.32.1.1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        });
                    }
                    break;
                case 2:
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                    if (lessonFragment.m10109q0().mo9735h().getValue().booleanValue() && !lessonFragment.m10109q0().m10151x2()) {
                        LessonPlayerView lessonPlayerView = lessonFragment.m10107o0().f44712w;
                        C5207g.m11110e(lessonPlayerView, "binding.viewPlayer");
                        if (!(lessonPlayerView.getVisibility() == 0) && !C5207g.m11106a(lessonFragment.m10109q0().mo9398I1().getValue(), AbstractC4267a.b.f27841a)) {
                            Rect rect2 = new Rect();
                            lessonFragment.m10107o0().f44703n.getGlobalVisibleRect(rect2);
                            lessonFragment.m10109q0().mo9734g2(tooltipStep, rect2, (16 & 4) != 0 ? new Rect() : null, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : false, (16 & 32) != 0 ? false : false, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.LessonFragment.onViewCreated.8.32.1.2
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            });
                        }
                    }
                    break;
                case 3:
                    InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                    if (lessonFragment.m10109q0().mo9735h().getValue().booleanValue()) {
                        LessonPlayerView lessonPlayerView2 = lessonFragment.m10107o0().f44712w;
                        C5207g.m11110e(lessonPlayerView2, "binding.viewPlayer");
                        if (lessonPlayerView2.getVisibility() != 0) {
                            z10 = false;
                        }
                        if (z10 && C5207g.m11106a(lessonFragment.m10109q0().mo9398I1().getValue(), AbstractC4267a.b.f27841a)) {
                            Rect rect3 = new Rect();
                            lessonFragment.m10107o0().f44712w.getGlobalVisibleRect(rect3);
                            Rect rect4 = new Rect();
                            rect4.top = rect3.top;
                            rect4.bottom = rect3.bottom;
                            Rect rect5 = new Rect();
                            int i11 = rect4.top;
                            List<Integer> list = C6716m.f37937a;
                            rect5.bottom = i11 - ((int) C6716m.m13316a(5));
                            rect5.right = (int) C6716m.m13316a(30);
                            rect5.left = (int) C6716m.m13316a(30);
                            lessonFragment.m10109q0().mo9734g2(tooltipStep, rect4, (16 & 4) != 0 ? new Rect() : rect5, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : true, (16 & 32) != 0 ? false : true, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.LessonFragment.onViewCreated.8.32.1.3
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            });
                        }
                    }
                    break;
                case 4:
                    InterfaceC6727j<Object>[] interfaceC6727jArr4 = LessonFragment.f27053M0;
                    if (lessonFragment.m10109q0().mo9735h().getValue().booleanValue() && !lessonFragment.m10109q0().m10151x2()) {
                        Rect rect6 = new Rect();
                        lessonFragment.m10107o0().f44710u.getGlobalVisibleRect(rect6);
                        int i12 = rect6.top;
                        List<Integer> list2 = C6716m.f37937a;
                        rect6.top = i12 - ((int) C6716m.m13316a(5));
                        rect6.bottom += (int) C6716m.m13316a(5);
                        Rect rect7 = new Rect();
                        rect7.bottom = rect6.top - ((int) C6716m.m13316a(5));
                        lessonFragment.m10109q0().mo9734g2(tooltipStep, rect6, (16 & 4) != 0 ? new Rect() : rect7, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : true, (16 & 32) != 0 ? false : true, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.LessonFragment.onViewCreated.8.32.1.4
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        });
                    }
                    break;
                case 5:
                    InterfaceC6727j<Object>[] interfaceC6727jArr5 = LessonFragment.f27053M0;
                    if (lessonFragment.m10109q0().m10151x2() && lessonFragment.m10109q0().mo9735h().getValue().booleanValue()) {
                        Rect rect8 = new Rect();
                        lessonFragment.m10107o0().f44701l.getGlobalVisibleRect(rect8);
                        int i13 = rect8.right;
                        List<Integer> list3 = C6716m.f37937a;
                        Rect rect9 = new Rect(i13 - ((int) C6716m.m13316a(40)), rect8.top, rect8.right - ((int) C6716m.m13316a(3)), rect8.bottom);
                        Rect rect10 = new Rect();
                        rect10.top = rect8.centerY() + ((int) C6716m.m13316a(5));
                        rect10.right = (int) C6716m.m13316a(30);
                        lessonFragment.m10109q0().mo9734g2(tooltipStep, rect9, (16 & 4) != 0 ? new Rect() : rect10, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : true, (16 & 32) != 0 ? false : true, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.LessonFragment.onViewCreated.8.32.1.5
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        });
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    InterfaceC6727j<Object>[] interfaceC6727jArr6 = LessonFragment.f27053M0;
                    if (lessonFragment.m10109q0().mo9735h().getValue().booleanValue() && !lessonFragment.m10109q0().m10151x2()) {
                        int measuredHeight = lessonFragment.m10107o0().f44701l.getMeasuredHeight();
                        int measuredWidth = lessonFragment.m10107o0().f44701l.getMeasuredWidth();
                        List<Integer> list4 = C6716m.f37937a;
                        float fM13316a = C6716m.m13316a(30);
                        float f3 = measuredWidth;
                        float fM13316a2 = f3 - C6716m.m13316a(35);
                        float fM13316a3 = f3 - C6716m.m13316a(3);
                        float fM13316a4 = C6716m.m13316a(40) + (measuredHeight / 2);
                        lessonFragment.m10109q0().mo9734g2(tooltipStep, new Rect((int) fM13316a2, (int) fM13316a4, (int) fM13316a3, (int) (fM13316a + fM13316a4)), (16 & 4) != 0 ? new Rect() : null, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : false, (16 & 32) != 0 ? false : false, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.LessonFragment.onViewCreated.8.32.1.6
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        });
                    }
                    break;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$32(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$32> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27190f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$32(this.f27190f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$32) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27189e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27190f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C41961 c41961 = new C41961(lessonFragment, null);
            this.f27189e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27407J1, c41961, this) == coroutineSingletons) {
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
