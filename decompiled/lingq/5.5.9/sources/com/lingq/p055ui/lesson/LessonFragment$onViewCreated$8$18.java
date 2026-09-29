package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7133n;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.C7777d;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$18", m19206f = "LessonFragment.kt", m19207l = {774}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$18 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27117e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27118f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$18$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/lesson/a;", "state", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$18$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41791 extends SuspendLambda implements InterfaceC2056p<AbstractC4267a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27119e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27120f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41791(LessonFragment lessonFragment, InterfaceC9968c<? super C41791> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27120f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41791 c41791 = new C41791(this.f27120f, interfaceC9968c);
            c41791.f27119e = obj;
            return c41791;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC4267a abstractC4267a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41791) mo1336a(abstractC4267a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC4267a abstractC4267a = (AbstractC4267a) this.f27119e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27120f;
            lessonFragment.m10109q0().mo9724L();
            String str = null;
            if (C5207g.m11106a(abstractC4267a, AbstractC4267a.a.f27840a)) {
                LessonPlayerView lessonPlayerView = lessonFragment.m10107o0().f44712w;
                C5207g.m11110e(lessonPlayerView, "binding.viewPlayer");
                C4924a.m10442U(lessonPlayerView);
                if (!lessonFragment.m10109q0().m10151x2()) {
                    RelativeLayout relativeLayout = lessonFragment.m10107o0().f44711v;
                    C5207g.m11110e(relativeLayout, "binding.viewPlay");
                    C4924a.m10457e0(relativeLayout);
                    LessonStudy lessonStudy = (LessonStudy) lessonFragment.m10109q0().f27517x0.getValue();
                    if (lessonStudy != null) {
                        str = lessonStudy.f21835u;
                    }
                    if (str != null) {
                        ImageView imageView = lessonFragment.m10107o0().f44705p;
                        C5207g.m11110e(imageView, "binding.tbPlayVideo");
                        C4924a.m10457e0(imageView);
                    }
                    TextView textView = lessonFragment.m10107o0().f44709t;
                    C5207g.m11110e(textView, "binding.tbSentenceModeDesc");
                    C4924a.m10457e0(textView);
                }
                FrameLayout frameLayout = lessonFragment.m10107o0().f44708s;
                C5207g.m11110e(frameLayout, "binding.tbSentence");
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(17);
                layoutParams2.removeRule(16);
                layoutParams2.addRule(13);
                frameLayout.setLayoutParams(layoutParams2);
            } else if (C5207g.m11106a(abstractC4267a, AbstractC4267a.b.f27841a)) {
                if (!C4924a.m10460g(lessonFragment.m3576Y())) {
                    FrameLayout frameLayout2 = lessonFragment.m10107o0().f44708s;
                    C5207g.m11110e(frameLayout2, "binding.tbSentence");
                    ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.removeRule(13);
                    layoutParams4.addRule(16, R.id.viewReview);
                    layoutParams4.addRule(17, R.id.viewPlayer);
                    layoutParams4.addRule(15);
                    frameLayout2.setLayoutParams(layoutParams4);
                }
                RelativeLayout relativeLayout2 = lessonFragment.m10107o0().f44711v;
                C5207g.m11110e(relativeLayout2, "binding.viewPlay");
                C4924a.m10422A(relativeLayout2);
                LessonPlayerView lessonPlayerView2 = lessonFragment.m10107o0().f44712w;
                C5207g.m11110e(lessonPlayerView2, "binding.viewPlayer");
                C4924a.m10457e0(lessonPlayerView2);
                if (!lessonFragment.m10109q0().m10151x2() && !C7777d.m15480a(lessonFragment)) {
                    TextView textView2 = lessonFragment.m10107o0().f44709t;
                    C5207g.m11110e(textView2, "binding.tbSentenceModeDesc");
                    C4924a.m10442U(textView2);
                }
                lessonFragment.m10109q0().mo9723I(TooltipStep.PlayAudioHighlight);
                LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModelM10109q0, null), 3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$18(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$18> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27118f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$18(this.f27118f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$18) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27117e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27118f;
            InterfaceC7133n<AbstractC4267a> interfaceC7133nMo9398I1 = lessonFragment.m10109q0().mo9398I1();
            C41791 c41791 = new C41791(lessonFragment, null);
            this.f27117e = 1;
            if (C0062b.m369m0(interfaceC7133nMo9398I1, c41791, this) == coroutineSingletons) {
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
