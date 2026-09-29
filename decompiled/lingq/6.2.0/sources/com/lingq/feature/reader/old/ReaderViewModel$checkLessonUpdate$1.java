package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.fa4;
import p000.ox7;
import p000.r43;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.xz7;
import p000.y02;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$checkLessonUpdate$1", m4291f = "ReaderViewModel.kt", m4292l = {2585, 2587, 2588}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$checkLessonUpdate$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public LessonBookmark f28924a;

    /* JADX INFO: renamed from: b */
    public int f28925b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f28926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$checkLessonUpdate$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28926c = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$checkLessonUpdate$1(this.f28926c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$checkLessonUpdate$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[LOOP:0: B:25:0x0091->B:27:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a9 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonBookmark lessonBookmark;
        Object objMo7484A0;
        LessonBookmark lessonBookmark2;
        LessonBookmark lessonBookmark3;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        Object next;
        xz7 xz7Var;
        String str;
        String str2;
        int i;
        String str3;
        xz7 xz7Var2;
        Integer num;
        C2412n c2412n = this.f28926c;
        C3244l c3244l = c2412n.f29269D0;
        d65 d65Var = c2412n.f29394p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f28925b;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (!((Collection) c3244l.getValue()).isEmpty()) {
                int iM9332l3 = c2412n.m9332l3();
                this.f28925b = 1;
                obj = ((C1295k) d65Var).f16498b.mo7484A0(iM9332l3, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 == 2) {
                LessonBookmark lessonBookmark4 = this.f28924a;
                AbstractC3193b.m15359b(obj);
                lessonBookmark = lessonBookmark4;
                int iM9332l4 = c2412n.m9332l3();
                this.f28924a = lessonBookmark;
                this.f28925b = 3;
                objMo7484A0 = ((C1295k) d65Var).f16498b.mo7484A0(iM9332l4, this);
                if (objMo7484A0 != coroutineSingletons) {
                    LessonBookmark lessonBookmark5 = lessonBookmark;
                    obj = objMo7484A0;
                    lessonBookmark2 = lessonBookmark5;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lessonBookmark2 = this.f28924a;
            AbstractC3193b.m15359b(obj);
        }
        lessonBookmark3 = (LessonBookmark) obj;
        Iterable iterable = (Iterable) c3244l.getValue();
        arrayList = new ArrayList();
        it = iterable.iterator();
        while (it.hasNext()) {
            u91.m22630w0(((ox7) it.next()).f55132e, arrayList);
        }
        it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            xz7Var2 = (xz7) next;
            if (lessonBookmark3 != null) {
                num = lessonBookmark3.f19169b;
                int i3 = xz7Var2.f69009f;
                if (num != null && num.intValue() == i3) {
                    break;
                }
            }
        }
        xz7Var = (xz7) next;
        str = "";
        if (lessonBookmark2 != null || (str2 = lessonBookmark2.f19172e) == null) {
            str2 = "";
        }
        if (lessonBookmark3 != null && (str3 = lessonBookmark3.f19172e) != null) {
            str = str3;
        }
        if (lessonBookmark2 != null && lessonBookmark3 != null) {
            try {
                if (!fa4.m11650l(lessonBookmark2.f19169b, lessonBookmark3.f19169b) && str2.compareTo(str) < 0) {
                    if (xz7Var != null || (i = xz7Var.f69016m) == c2412n.m9323d3()) {
                        c2412n.f29404s0.mo4677k(xfaVar);
                        return xfaVar;
                    }
                    c2412n.f29410u0.mo4677k(new Triple(new Integer(c2412n.m9323d3()), new Integer(i), y02.m24807e(str, (3 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ss" : "yyyy-MM-dd", (3 & 2) != 0 ? "MMM dd, yyyy" : "dd MMM, yyyy")));
                    C3244l c3244l2 = c2412n.f29422y0;
                    Integer num2 = new Integer(i);
                    c3244l2.getClass();
                    c3244l2.m15572j(null, num2);
                    return xfaVar;
                }
            } catch (Exception e) {
                r43.m20289a().m20290b(e);
            }
        }
        return xfaVar;
        lessonBookmark = (LessonBookmark) obj;
        String strMo4589b2 = c2412n.f29340b.mo4589b2();
        int iM9332l5 = c2412n.m9332l3();
        this.f28924a = lessonBookmark;
        this.f28925b = 2;
        if (((C1295k) d65Var).m7292o(iM9332l5, strMo4589b2, this) != coroutineSingletons) {
            int iM9332l6 = c2412n.m9332l3();
            this.f28924a = lessonBookmark;
            this.f28925b = 3;
            objMo7484A0 = ((C1295k) d65Var).f16498b.mo7484A0(iM9332l6, this);
            if (objMo7484A0 != coroutineSingletons) {
                LessonBookmark lessonBookmark6 = lessonBookmark;
                obj = objMo7484A0;
                lessonBookmark2 = lessonBookmark6;
                lessonBookmark3 = (LessonBookmark) obj;
                Iterable iterable2 = (Iterable) c3244l.getValue();
                arrayList = new ArrayList();
                it = iterable2.iterator();
                while (it.hasNext()) {
                    u91.m22630w0(((ox7) it.next()).f55132e, arrayList);
                }
                it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    xz7Var2 = (xz7) next;
                    if (lessonBookmark3 != null) {
                        num = lessonBookmark3.f19169b;
                        int i4 = xz7Var2.f69009f;
                        if (num != null) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                xz7Var = (xz7) next;
                str = "";
                if (lessonBookmark2 != null) {
                    str2 = "";
                } else {
                    str2 = "";
                }
                if (lessonBookmark3 != null) {
                    str = str3;
                }
                if (lessonBookmark2 != null) {
                    if (!fa4.m11650l(lessonBookmark2.f19169b, lessonBookmark3.f19169b)) {
                        if (xz7Var != null) {
                        }
                        c2412n.f29404s0.mo4677k(xfaVar);
                        return xfaVar;
                    }
                }
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }
}
