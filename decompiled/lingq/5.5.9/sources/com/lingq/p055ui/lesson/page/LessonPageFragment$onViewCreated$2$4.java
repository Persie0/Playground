package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.p055ui.lesson.page.views.LessonTextView;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p265mj.C7567a;
import p279nj.C7798a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$4", m19206f = "LessonPageFragment.kt", m19207l = {379}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28470e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28471f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28472g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$4$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lmj/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$4$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43631 extends SuspendLambda implements InterfaceC2056p<List<? extends C7567a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28473e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f28474f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LessonPageFragment f28475g;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$4$1$a */
        public static final class a implements C7798a.a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonPageFragment f28476a;

            public a(LessonPageFragment lessonPageFragment) {
                this.f28476a = lessonPageFragment;
            }

            @Override // p279nj.C7798a.a
            /* JADX INFO: renamed from: a */
            public final void mo10195a(MotionEvent motionEvent) {
                C5207g.m11111f(motionEvent, "event");
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                this.f28476a.m10194u0(motionEvent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43631(int i10, LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43631> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28474f = i10;
            this.f28475g = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43631 c43631 = new C43631(this.f28474f, this.f28475g, interfaceC9968c);
            c43631.f28473e = obj;
            return c43631;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7567a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43631) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 6, instructions: 6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C7567a c7567a = (C7567a) C6752c.m13426T(this.f28474f, (List) this.f28473e);
            if (c7567a != null) {
                LessonPageFragment lessonPageFragment = this.f28475g;
                LessonTextView lessonTextView = lessonPageFragment.f28340D0;
                if (lessonTextView == null) {
                    C5207g.m11117l("tvContent");
                    throw null;
                }
                lessonTextView.setTransformationMethod(null);
                LessonTextView lessonTextView2 = lessonPageFragment.f28340D0;
                if (lessonTextView2 == null) {
                    C5207g.m11117l("tvContent");
                    throw null;
                }
                lessonTextView2.setMovementMethod(new C7798a(c7567a.f41708h, new a(lessonPageFragment)));
                Typeface typefaceM10475n0 = C4924a.m10475n0(c7567a.f41705e, lessonPageFragment.m3578a0());
                LessonTextView lessonTextView3 = lessonPageFragment.f28340D0;
                if (lessonTextView3 == null) {
                    C5207g.m11117l("tvContent");
                    throw null;
                }
                lessonTextView3.setTypeface(typefaceM10475n0);
                LessonTextView lessonTextView4 = lessonPageFragment.f28340D0;
                if (lessonTextView4 == null) {
                    C5207g.m11117l("tvContent");
                    throw null;
                }
                List<Integer> list = C6716m.f37937a;
                int i10 = c7567a.f41707g;
                float fM13331p = C6716m.m13331p(i10);
                float f3 = (float) c7567a.f41706f;
                lessonTextView4.setLineSpacing(fM13331p, f3);
                LessonTextView lessonTextView5 = lessonPageFragment.f28340D0;
                if (lessonTextView5 == null) {
                    C5207g.m11117l("tvContent");
                    throw null;
                }
                float f10 = i10;
                lessonTextView5.setTextSize(2, f10);
                LessonTextView lessonTextView6 = lessonPageFragment.f28341E0;
                if (lessonTextView6 == null) {
                    C5207g.m11117l("tvContentPhrases");
                    throw null;
                }
                lessonTextView6.setTypeface(typefaceM10475n0);
                LessonTextView lessonTextView7 = lessonPageFragment.f28341E0;
                if (lessonTextView7 == null) {
                    C5207g.m11117l("tvContentPhrases");
                    throw null;
                }
                lessonTextView7.setLineSpacing(C6716m.m13331p(i10), f3);
                LessonTextView lessonTextView8 = lessonPageFragment.f28341E0;
                if (lessonTextView8 == null) {
                    C5207g.m11117l("tvContentPhrases");
                    throw null;
                }
                lessonTextView8.setTextSize(2, f10);
                LessonTextView lessonTextView9 = lessonPageFragment.f28342F0;
                if (lessonTextView9 == null) {
                    C5207g.m11117l("tvContentRelatedPhrases");
                    throw null;
                }
                lessonTextView9.setTypeface(typefaceM10475n0);
                LessonTextView lessonTextView10 = lessonPageFragment.f28342F0;
                if (lessonTextView10 == null) {
                    C5207g.m11117l("tvContentRelatedPhrases");
                    throw null;
                }
                lessonTextView10.setLineSpacing(C6716m.m13331p(i10), f3);
                LessonTextView lessonTextView11 = lessonPageFragment.f28342F0;
                if (lessonTextView11 == null) {
                    C5207g.m11117l("tvContentRelatedPhrases");
                    throw null;
                }
                lessonTextView11.setTextSize(2, f10);
                if (c7567a.f41701a) {
                    RelativeLayout relativeLayout = (RelativeLayout) lessonPageFragment.m10191r0().f44793q.f45172d;
                    C5207g.m11110e(relativeLayout, "binding.viewHeader.root");
                    C4924a.m10457e0(relativeLayout);
                } else {
                    RelativeLayout relativeLayout2 = (RelativeLayout) lessonPageFragment.m10191r0().f44793q.f45172d;
                    C5207g.m11110e(relativeLayout2, "binding.viewHeader.root");
                    C4924a.m10442U(relativeLayout2);
                }
                lessonPageFragment.m10193t0().f28531M.setValue(c7567a);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$4(int i10, LessonPageFragment lessonPageFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28471f = lessonPageFragment;
        this.f28472g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$4(this.f28472g, this.f28471f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28470e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28471f;
            LessonViewModel lessonViewModelM10192s0 = lessonPageFragment.m10192s0();
            C43631 c43631 = new C43631(this.f28472g, lessonPageFragment, null);
            this.f28470e = 1;
            if (C0062b.m369m0(lessonViewModelM10192s0.f27427Q0, c43631, this) == coroutineSingletons) {
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
