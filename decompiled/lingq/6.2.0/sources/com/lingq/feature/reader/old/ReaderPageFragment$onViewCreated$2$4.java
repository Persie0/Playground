package com.lingq.feature.reader.old;

import android.graphics.Typeface;
import android.widget.RelativeLayout;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.b55;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.hi8;
import p000.jfa;
import p000.m25;
import p000.mjc;
import p000.ox7;
import p000.u91;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$4", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28560b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28561c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$4$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$4$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23501 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28562a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28563b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReaderPageFragment f28564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23501(int i, ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28563b = i;
            this.f28564c = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23501 c23501 = new C23501(this.f28563b, this.f28564c, continuation);
            c23501.f28562a = obj;
            return c23501;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23501 c23501 = (C23501) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23501.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f28562a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ox7 ox7Var = (ox7) u91.m22592J0(this.f28563b, list);
            ReaderPageFragment readerPageFragment = this.f28564c;
            if (ox7Var != null) {
                LessonTextView lessonTextView = readerPageFragment.f28444F0;
                if (lessonTextView == null) {
                    fa4.m11636J("tvContent");
                    throw null;
                }
                lessonTextView.setTransformationMethod(null);
                LessonTextView lessonTextView2 = readerPageFragment.f28444F0;
                if (lessonTextView2 == null) {
                    fa4.m11636J("tvContent");
                    throw null;
                }
                lessonTextView2.setMovementMethod(new b55(ox7Var.f55137j, new hi8(readerPageFragment, 26)));
                Typeface typefaceM16862d = mjc.m16862d(ox7Var.f55133f, readerPageFragment.m2090R());
                LessonTextView lessonTextView3 = readerPageFragment.f28444F0;
                if (lessonTextView3 == null) {
                    fa4.m11636J("tvContent");
                    throw null;
                }
                lessonTextView3.setTypeface(typefaceM16862d);
                LessonTextView lessonTextView4 = readerPageFragment.f28444F0;
                if (lessonTextView4 == null) {
                    fa4.m11636J("tvContent");
                    throw null;
                }
                lessonTextView4.setLineSpacing(0.0f, (float) ox7Var.f55134g);
                LessonTextView lessonTextView5 = readerPageFragment.f28444F0;
                if (lessonTextView5 == null) {
                    fa4.m11636J("tvContent");
                    throw null;
                }
                lessonTextView5.setTextSize(2, ox7Var.f55135h);
                if (ox7Var.f55129b) {
                    jfa.m14429l((RelativeLayout) readerPageFragment.m9297V0().f69724o.f34379c);
                } else {
                    jfa.m14425h((RelativeLayout) readerPageFragment.m9297V0().f69724o.f34379c);
                }
                C2411m c2411mM9299X0 = readerPageFragment.m9299X0();
                c2411mM9299X0.getClass();
                C3244l c3244l = c2411mM9299X0.f29254v;
                c3244l.getClass();
                c3244l.m15572j(null, ox7Var);
            }
            LessonTextView lessonTextView6 = readerPageFragment.f28444F0;
            if (lessonTextView6 != null) {
                lessonTextView6.getViewTreeObserver().addOnGlobalLayoutListener(new m25(1, lessonTextView6, readerPageFragment));
                return xfa.f68157a;
            }
            fa4.m11636J("tvContent");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$4(int i, ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28560b = readerPageFragment;
        this.f28561c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$4(this.f28561c, this.f28560b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28559a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28560b;
            c18 c18Var = readerPageFragment.m9298W0().f29272E0;
            C23501 c23501 = new C23501(this.f28561c, readerPageFragment, null);
            c18Var.getClass();
            this.f28559a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23501, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
