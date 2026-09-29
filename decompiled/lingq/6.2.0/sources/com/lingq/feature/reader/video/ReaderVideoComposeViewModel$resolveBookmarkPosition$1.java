package com.lingq.feature.reader.video;

import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.feature.reader.video.state.C2597c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e37;
import p000.lw8;
import p000.mv7;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$resolveBookmarkPosition$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {518, 527}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$resolveBookmarkPosition$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Integer f31268a;

    /* JADX INFO: renamed from: b */
    public long f31269b;

    /* JADX INFO: renamed from: c */
    public int f31270c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2583a f31271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$resolveBookmarkPosition$1(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31271d = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$resolveBookmarkPosition$1(this.f31271d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$resolveBookmarkPosition$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7 A[LOOP:2: B:49:0x00d1->B:51:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011b  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5 A[EDGE_INSN: B:71:0x00b5->B:44:0x00b5 BREAK  A[LOOP:0: B:29:0x007a->B:42:0x00b1, LOOP_LABEL: LOOP:0: B:29:0x007a->B:42:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[LOOP:1: B:37:0x009c->B:75:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0107 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        long j;
        List list;
        Integer numM9522d;
        Iterator it;
        int i;
        ArrayList arrayList;
        Iterator it2;
        Iterator it3;
        Object next;
        lw8 lw8Var;
        double d;
        lw8 lw8Var2;
        C3244l c3244l;
        List list2;
        Iterator it4;
        C2583a c2583a = this.f31271d;
        C2597c c2597c = c2583a.f31376i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f31270c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM4513n = c2583a.f31386s.m4513n(c2583a.f31348G);
            this.f31270c = 1;
            obj = AbstractC3224d.m15541t(c83VarM4513n, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f31269b;
            num = this.f31268a;
            AbstractC3193b.m15359b(obj);
        }
        list = (List) obj;
        numM9522d = c2583a.f31372e.m9522d(num.intValue());
        if (numM9522d == null) {
            c2597c.m9527b(j);
            return xfaVar;
        }
        it = list.iterator();
        i = 0;
        loop0: while (true) {
            if (it.hasNext()) {
                i = -1;
                break;
            }
            list2 = ((e37) it.next()).f36654c;
            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (((lw8) it4.next()).f50212a == numM9522d.intValue()) {
                        break loop0;
                    }
                }
            }
            i++;
        }
        if (i >= 0) {
            c3244l = c2597c.f31557g;
            if (c3244l.getValue() == null) {
                c3244l.m15572j(null, Integer.valueOf(i));
            }
        }
        arrayList = new ArrayList();
        it2 = list.iterator();
        while (it2.hasNext()) {
            u91.m22630w0(((e37) it2.next()).f36654c, arrayList);
        }
        it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            lw8Var2 = (lw8) next;
            if (lw8Var2.f50212a != numM9522d.intValue() && lw8Var2.f50213b >= 0.0d) {
                break;
            }
        }
        lw8Var = (lw8) next;
        if ((lw8Var != null ? new Double(lw8Var.f50213b) : null) != null) {
            d = lw8Var.f50213b;
            if (d >= 0.0d) {
                c2597c.m9527b((long) (d * 1000.0d));
                return xfaVar;
            }
        }
        c2597c.m9527b(j);
        return xfaVar;
        LessonBookmark lessonBookmark = (LessonBookmark) obj;
        long j2 = c2597c.f31569s;
        Integer num2 = lessonBookmark != null ? lessonBookmark.f19169b : null;
        if (num2 == null) {
            c2597c.m9527b(j2);
            return xfaVar;
        }
        mv7 mv7Var = new mv7(c2583a.f31359R, 22);
        this.f31268a = num2;
        this.f31269b = j2;
        this.f31270c = 2;
        Object objM15541t = AbstractC3224d.m15541t(mv7Var, this);
        if (objM15541t != coroutineSingletons) {
            Integer num3 = num2;
            obj = objM15541t;
            num = num3;
            j = j2;
            list = (List) obj;
            numM9522d = c2583a.f31372e.m9522d(num.intValue());
            if (numM9522d == null) {
                c2597c.m9527b(j);
                return xfaVar;
            }
            it = list.iterator();
            i = 0;
            loop0: while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                list2 = ((e37) it.next()).f36654c;
                if (list2 instanceof Collection) {
                    it4 = list2.iterator();
                    while (it4.hasNext()) {
                        if (((lw8) it4.next()).f50212a == numM9522d.intValue()) {
                            break loop0;
                            break loop0;
                        }
                    }
                } else {
                    it4 = list2.iterator();
                    while (it4.hasNext()) {
                        if (((lw8) it4.next()).f50212a == numM9522d.intValue()) {
                            break loop0;
                            break loop0;
                        }
                    }
                }
                i++;
            }
            if (i >= 0) {
                c3244l = c2597c.f31557g;
                if (c3244l.getValue() == null) {
                    c3244l.m15572j(null, Integer.valueOf(i));
                }
            }
            arrayList = new ArrayList();
            it2 = list.iterator();
            while (it2.hasNext()) {
                u91.m22630w0(((e37) it2.next()).f36654c, arrayList);
            }
            it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                lw8Var2 = (lw8) next;
                if (lw8Var2.f50212a != numM9522d.intValue()) {
                }
            }
            lw8Var = (lw8) next;
            if ((lw8Var != null ? new Double(lw8Var.f50213b) : null) != null) {
                d = lw8Var.f50213b;
                if (d >= 0.0d) {
                    c2597c.m9527b((long) (d * 1000.0d));
                    return xfaVar;
                }
            }
            c2597c.m9527b(j);
            return xfaVar;
        }
        return coroutineSingletons;
    }
}
