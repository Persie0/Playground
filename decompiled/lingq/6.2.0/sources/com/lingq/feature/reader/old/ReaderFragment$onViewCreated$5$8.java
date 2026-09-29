package com.lingq.feature.reader.old;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.Animation;
import androidx.viewpager2.widget.ViewPager2;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bh4;
import p000.c27;
import p000.c32;
import p000.fa4;
import p000.hf1;
import p000.hy7;
import p000.lda;
import p000.mv7;
import p000.qz2;
import p000.u91;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$8", m4291f = "ReaderFragment.kt", m4292l = {850}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28422a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28423b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$8$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$8$2", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23222 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28424a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23222(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28425b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23222 c23222 = new C23222(this.f28425b, continuation);
            c23222.f28424a = obj;
            return c23222;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23222 c23222 = (C23222) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23222.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            List list = (List) this.f28424a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28425b;
            ViewPager2 viewPager2 = readerFragment.m9288U0().f66709o;
            hf1 hf1Var = readerFragment.f28227K0;
            ((ArrayList) viewPager2.f7120c.f42294b).remove(hf1Var);
            hy7 hy7Var = readerFragment.f28219C0;
            if (hy7Var == null) {
                fa4.m11636J("readerPagerAdapter");
                throw null;
            }
            list.getClass();
            if (!list.equals(hy7Var.f43215m)) {
                hy7Var.f43215m = list;
                hy7Var.f55486a.m19618b();
            }
            ReaderProgressBar readerProgressBar = readerFragment.m9288U0().f66708n;
            readerProgressBar.setTotalPages(list.size());
            readerProgressBar.f30415U = readerFragment.m9290W0().m9330j3() || readerFragment.m9287T0().f58118b.getBoolean("pagingDealWithWords", false);
            readerProgressBar.m9428l();
            if (list.size() - 1 == 0) {
                Lesson lesson = (Lesson) readerFragment.m9290W0().f29381l0.getValue();
                readerProgressBar.setupOnePageLessonView(lesson != null ? lesson.f19154m : false);
            } else {
                readerProgressBar.setIsTouchingEnabled(true);
            }
            LessonBookmark lessonBookmark = (LessonBookmark) readerFragment.m9290W0().f29266C0.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u91.m22630w0(((c27) it.next()).f9354a.f55132e, arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                xz7 xz7Var = (xz7) next;
                if (lessonBookmark != null) {
                    Integer num = lessonBookmark.f19169b;
                    int i = xz7Var.f69009f;
                    if (num != null && num.intValue() == i) {
                        break;
                    }
                }
            }
            xz7 xz7Var2 = (xz7) next;
            if (xz7Var2 != null) {
                int i2 = xz7Var2.f69016m;
                readerFragment.m9290W0().m9341u3(i2, false);
                readerFragment.m9288U0().f66709o.m2892c(i2, false);
            }
            C2412n c2412nM9290W0 = readerFragment.m9290W0();
            c2412nM9290W0.getClass();
            wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$checkCompletedPagesAndForcePage$1(c2412nM9290W0, null), 3);
            boolean zM9331k3 = readerFragment.m9290W0().m9331k3();
            Animation animation = readerFragment.m9288U0().f66708n.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            Animation animation2 = readerFragment.m9288U0().f66709o.getAnimation();
            if (animation2 != null) {
                animation2.cancel();
            }
            readerFragment.m9288U0().f66709o.setVisibility(0);
            if (!zM9331k3) {
                readerFragment.m9288U0().f66709o.setAlpha(0.0f);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(readerFragment.m9288U0().f66709o, PropertyValuesHolder.ofFloat("alpha", 0.7f, 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(200L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new qz2(1));
                objectAnimatorOfPropertyValuesHolder.start();
            }
            ((ArrayList) readerFragment.m9288U0().f66709o.f7120c.f42294b).add(hf1Var);
            readerFragment.m9288U0().f66719y.setEnabled(true);
            C3244l c3244l = readerFragment.m9290W0().f29314S0;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            C2412n c2412nM9290W1 = readerFragment.m9290W0();
            c2412nM9290W1.getClass();
            wfb.m23926u(lda.m16103C(c2412nM9290W1), null, null, new ReaderViewModel$showTooltipsIndicators$1(c2412nM9290W1, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$8(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28423b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$8(this.f28423b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28422a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28423b;
            mv7 mv7Var = new mv7(readerFragment.m9290W0().f29284I0, 9);
            C23222 c23222 = new C23222(readerFragment, null);
            this.f28422a = 1;
            if (AbstractC3224d.m15529h(mv7Var, c23222, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
