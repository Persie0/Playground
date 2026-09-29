package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.kx7;
import p000.ox7;
import p000.u91;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$navigateLessonEdit$1", m4291f = "ReaderViewModel.kt", m4292l = {2454}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$navigateLessonEdit$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C2412n f28996a;

    /* JADX INFO: renamed from: b */
    public int f28997b;

    /* JADX INFO: renamed from: c */
    public int f28998c;

    /* JADX INFO: renamed from: d */
    public int f28999d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2412n f29000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$navigateLessonEdit$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29000e = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$navigateLessonEdit$1(this.f29000e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$navigateLessonEdit$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iM9332l3;
        xz7 xz7Var;
        int iM9323d3;
        Object next;
        int i;
        C2412n c2412n = this.f29000e;
        C3244l c3244l = c2412n.f29269D0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f28999d;
        boolean z = false;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            iM9332l3 = c2412n.m9332l3();
            if (((Boolean) c2412n.f29313S.getValue()).booleanValue()) {
                iM9323d3 = c2412n.m9323d3() + 1;
            } else {
                LessonBookmark lessonBookmark = (LessonBookmark) c2412n.f29266C0.getValue();
                if (lessonBookmark != null) {
                    Integer num = lessonBookmark.f19169b;
                    Iterable iterable = (Iterable) c3244l.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        u91.m22630w0(((ox7) it.next()).f55132e, arrayList);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        int i3 = ((xz7) next).f69009f;
                        if (num != null && i3 == num.intValue()) {
                            break;
                        }
                    }
                    xz7 xz7Var2 = (xz7) next;
                    if (xz7Var2 != null) {
                        iM9323d3 = xz7Var2.f69010g;
                    } else {
                        iM9323d3 = 0;
                    }
                } else {
                    ox7 ox7Var = (ox7) u91.m22592J0(c2412n.m9323d3(), (List) c3244l.getValue());
                    if (ox7Var == null || (xz7Var = (xz7) u91.m22591I0(ox7Var.f55132e)) == null) {
                        iM9323d3 = 0;
                    } else {
                        iM9323d3 = xz7Var.f69010g;
                    }
                }
            }
            Lesson lesson = (Lesson) c2412n.f29381l0.getValue();
            String str = lesson != null ? lesson.f19147f : null;
            if (str == null || vk9.m23391n0(str)) {
                int iM9332l4 = c2412n.m9332l3();
                this.f28996a = c2412n;
                this.f28997b = iM9332l3;
                this.f28998c = iM9323d3;
                this.f28999d = 1;
                Object objM9315X2 = C2412n.m9315X2(c2412n, iM9332l4, this);
                if (objM9315X2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objM9315X2;
                i = iM9332l3;
            } else {
                i = iM9332l3;
                z = true;
            }
            kx7 kx7Var = new kx7(i, iM9323d3, z);
            c2412n.getClass();
            c2412n.f29405s1.mo4677k(kx7Var);
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = this.f28998c;
        int i5 = this.f28997b;
        C2412n c2412n2 = this.f28996a;
        AbstractC3193b.m15359b(obj);
        c2412n = c2412n2;
        i = i5;
        iM9323d3 = i4;
        if (((Boolean) obj).booleanValue()) {
            iM9332l3 = i;
            i = iM9332l3;
            z = true;
        }
        kx7 kx7Var2 = new kx7(i, iM9323d3, z);
        c2412n.getClass();
        c2412n.f29405s1.mo4677k(kx7Var2);
        return xfa.f68157a;
    }
}
