package com.lingq.feature.reader.old;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.AbstractC1250j;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonMetadata;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.C3509qs;
import p000.c32;
import p000.cl9;
import p000.cma;
import p000.lda;
import p000.tw7;
import p000.u91;
import p000.un1;
import p000.wfb;
import p000.x65;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$7", m4291f = "ReaderViewModel.kt", m4292l = {2943}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28886a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28887b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$7$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$7$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23911 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28888a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28889b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23911(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28889b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23911 c23911 = new C23911(this.f28889b, continuation);
            c23911.f28888a = obj;
            return c23911;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23911 c23911 = (C23911) create((Lesson) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23911.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Lesson lesson = (Lesson) this.f28888a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (lesson != null) {
                String str = lesson.f19140J;
                LessonMetadata lessonMetadata = lesson.f19139I;
                boolean z = cl9.m4834Q(str, "private", true) || cl9.m4834Q(str, "D", true);
                C2412n c2412n = this.f28889b;
                boolean z2 = c2412n.f29321U1;
                tw7 tw7Var = c2412n.f29307Q;
                cma cmaVar = c2412n.f29340b;
                if (z2 && !c2412n.m9331k3()) {
                    C3509qs c3509qs = c2412n.f29280H;
                    int i = c3509qs.f58118b.getInt("lessonsOpened", 0) + 1;
                    SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
                    editorEdit.getClass();
                    editorEdit.putInt("lessonsOpened", i);
                    editorEdit.apply();
                    Bundle bundle = new Bundle();
                    bundle.putInt("Lesson ID", lesson.f19142a);
                    bundle.putString("Lesson language", AbstractC3184kh.m15223q(cmaVar.mo4589b2()));
                    bundle.putString("Lesson name", lesson.f19143b);
                    bundle.putString("Lesson level", lesson.f19159r);
                    List list = lesson.f19133C;
                    bundle.putString("Tags", list != null ? u91.m22596N0(list, null, null, null, null, 63) : null);
                    bundle.putString("Shared By", lesson.f19164w);
                    bundle.putString("Course name", lesson.f19150i);
                    bundle.putInt("Course ID", lesson.f19149h);
                    bundle.putString("Lesson Open Path 1", AbstractC1250j.m7032a(tw7Var.f63014b));
                    bundle.putString("Lesson Open Path 2", AbstractC1250j.m7033b(tw7Var.f63014b));
                    String str2 = lessonMetadata != null ? lessonMetadata.f19234a : null;
                    if (str2 != null) {
                        bundle.putString("original lesson name", str2);
                    }
                    String str3 = lessonMetadata != null ? lessonMetadata.f19235b : null;
                    if (str3 != null) {
                        bundle.putString("Import Method", str3);
                    }
                    bundle.putBoolean("imported by user", z);
                    ((C1240a) c2412n.f29292L).m7025f("Lesson opened", bundle);
                    c2412n.f29321U1 = false;
                }
                c2412n.mo48n1(cmaVar.mo4589b2(), new x65(AbstractC3184kh.m15223q(cmaVar.mo4589b2()), lesson.f19142a, lesson.f19143b, lesson.f19159r, lesson.f19133C, lesson.f19164w, lesson.f19150i, lesson.f19149h, lessonMetadata != null ? lessonMetadata.f19235b : null, lessonMetadata != null ? lessonMetadata.f19234a : null, z));
                c2412n.mo49u1(LessonEngagedDataType.AudioDuration, new Integer(lesson.f19148g));
                C3244l c3244l = c2412n.f29417w1;
                do {
                    value = c3244l.getValue();
                    ((Boolean) value).getClass();
                } while (!c3244l.m15570h(value, Boolean.TRUE));
                wfb.m23926u(lda.m16103C(c2412n), c2412n.f29301O, null, new ReaderViewModel$fetchLessonSentences$1(c2412n, null), 2);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$7(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28887b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$7(this.f28887b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28886a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28887b;
            C3244l c3244l = c2412n.f29381l0;
            C23911 c23911 = new C23911(c2412n, null);
            c3244l.getClass();
            this.f28886a = 1;
            if (AbstractC3224d.m15529h(c3244l, c23911, this) == coroutineSingletons) {
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
