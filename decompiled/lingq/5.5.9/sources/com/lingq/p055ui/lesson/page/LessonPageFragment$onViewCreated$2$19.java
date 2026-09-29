package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.view.View;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.lingq.p055ui.lesson.AbstractC4269c;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6704a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$19", m19206f = "LessonPageFragment.kt", m19207l = {745}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$19 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28425e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28426f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$19$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/lesson/page/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$19$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43531 extends SuspendLambda implements InterfaceC2056p<AbstractC4385a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28427e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28428f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$19$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonPageFragment f28429a;

            public a(LessonPageFragment lessonPageFragment) {
                this.f28429a = lessonPageFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                this.f28429a.m10192s0().m10138E2(ReviewType.Integrated);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$19$1$b */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonPageFragment f28430a;

            public b(LessonPageFragment lessonPageFragment) {
                this.f28430a = lessonPageFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                this.f28430a.m10192s0().mo10032P1(1);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$19$1$c */
        public static final class c implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonPageFragment f28431a;

            public c(LessonPageFragment lessonPageFragment) {
                this.f28431a = lessonPageFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                this.f28431a.m10192s0().m10134A2(AbstractC4269c.f.f27854a);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$19$1$d */
        public static final class d implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonPageFragment f28432a;

            public d(LessonPageFragment lessonPageFragment) {
                this.f28432a = lessonPageFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                this.f28432a.m10192s0().m10146s2();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43531(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43531> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28428f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43531 c43531 = new C43531(this.f28428f, interfaceC9968c);
            c43531.f28427e = obj;
            return c43531;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC4385a abstractC4385a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43531) mo1336a(abstractC4385a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0164  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC4385a abstractC4385a = (AbstractC4385a) this.f28427e;
            boolean zM11106a = C5207g.m11106a(abstractC4385a, AbstractC4385a.c.f28710a);
            LessonPageFragment lessonPageFragment = this.f28428f;
            if (zM11106a) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                MaterialButton materialButton = lessonPageFragment.m10191r0().f44777a;
                C5207g.m11110e(materialButton, "binding.btnCompleteLesson");
                C4924a.m10457e0(materialButton);
                lessonPageFragment.m10191r0().f44777a.setText(lessonPageFragment.m3600t(R.string.lesson_review_study_sentence));
                lessonPageFragment.m10191r0().f44777a.setOnClickListener(new a(lessonPageFragment));
            } else if (C5207g.m11106a(abstractC4385a, AbstractC4385a.d.f28711a)) {
                LessonPageFragment.C4337a c4337a2 = LessonPageFragment.f28335M0;
                MaterialButton materialButton2 = lessonPageFragment.m10191r0().f44777a;
                C5207g.m11110e(materialButton2, "binding.btnCompleteLesson");
                C4924a.m10457e0(materialButton2);
                lessonPageFragment.m10191r0().f44777a.setText(lessonPageFragment.m3600t(R.string.ui_continue));
                lessonPageFragment.m10191r0().f44777a.setOnClickListener(new b(lessonPageFragment));
            } else if (C5207g.m11106a(abstractC4385a, AbstractC4385a.b.f28709a)) {
                LessonPageFragment.C4337a c4337a3 = LessonPageFragment.f28335M0;
                MaterialButton materialButton3 = lessonPageFragment.m10191r0().f44777a;
                C5207g.m11110e(materialButton3, "binding.btnCompleteLesson");
                C4924a.m10457e0(materialButton3);
                int iIntValue = ((Number) lessonPageFragment.m10192s0().f27508s1.getValue()).intValue();
                LessonStudy lessonStudy = (LessonStudy) lessonPageFragment.m10192s0().f27515w0.getValue();
                if (lessonStudy != null && (lessonStudy.f21827m || lessonStudy.f21833s == 0)) {
                    lessonPageFragment.m10191r0().f44777a.setText(lessonPageFragment.m3600t(R.string.lesson_view_lesson_stats));
                    lessonPageFragment.m10191r0().f44777a.setOnClickListener(new c(lessonPageFragment));
                } else {
                    if (iIntValue <= 0) {
                        lessonPageFragment.m10191r0().f44777a.setText(lessonPageFragment.m3600t(R.string.lesson_finish_lesson));
                    } else {
                        C6704a c6704a = lessonPageFragment.f28346J0;
                        if (c6704a == null) {
                            C5207g.m11117l("appSettings");
                            throw null;
                        }
                        if (!c6704a.f37891b.getBoolean("pagingDealWithWords", true) || lessonPageFragment.m10192s0().m10150w2()) {
                            lessonPageFragment.m10191r0().f44777a.setText(lessonPageFragment.m3600t(R.string.lesson_finish_lesson));
                        } else {
                            MaterialButton materialButton4 = lessonPageFragment.m10191r0().f44777a;
                            Locale locale = Locale.getDefault();
                            String strM3600t = lessonPageFragment.m3600t(R.string.lesson_move_known_complete_remaining);
                            C5207g.m11110e(strM3600t, "getString(R.string.lesso…known_complete_remaining)");
                            String str = String.format(locale, strM3600t, Arrays.copyOf(new Object[]{new Integer(iIntValue)}, 1));
                            C5207g.m11110e(str, "format(locale, format, *args)");
                            materialButton4.setText(str);
                        }
                    }
                    lessonPageFragment.m10191r0().f44777a.setOnClickListener(new d(lessonPageFragment));
                }
            } else if (C5207g.m11106a(abstractC4385a, AbstractC4385a.a.f28708a)) {
                LessonPageFragment.C4337a c4337a4 = LessonPageFragment.f28335M0;
                MaterialButton materialButton5 = lessonPageFragment.m10191r0().f44777a;
                C5207g.m11110e(materialButton5, "binding.btnCompleteLesson");
                C4924a.m10442U(materialButton5);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$19(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$19> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28426f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$19(this.f28426f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$19) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28425e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28426f;
            LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
            C43531 c43531 = new C43531(lessonPageFragment, null);
            this.f28425e = 1;
            if (C0062b.m369m0(lessonPageViewModelM10193t0.f28553f0, c43531, this) == coroutineSingletons) {
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
