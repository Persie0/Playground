package com.lingq.core.token;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.e05;
import p000.f5a;
import p000.i5a;
import p000.w65;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$25", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$25 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1909e f23521a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$25(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23521a = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$25(this.f23521a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$25 tokenUpdateViewModel$25 = (TokenUpdateViewModel$25) create((i5a) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$25.invokeSuspend(xfaVar);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r8
      0x002b: PHI (r8v8 int) = (r8v1 int), (r8v3 int), (r8v5 int), (r8v9 int), (r8v0 int) binds: [B:58:0x00a3, B:52:0x0098, B:40:0x0081, B:14:0x0036, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        f5a f5aVarM11558a;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f23521a.f23885W;
        do {
            value = c3244l.getValue();
            f5aVarM11558a = (f5a) value;
            w65 w65Var = f5aVarM11558a.f38474f;
            List list2 = f5aVarM11558a.f38487s;
            List list3 = f5aVarM11558a.f38486r;
            int i = 2;
            int i2 = 1;
            if (!(w65Var instanceof LessonCard)) {
                int size = 0;
                if (w65Var instanceof LessonWord) {
                    List list4 = list2;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        size = !C1909e.m8732e3(f5aVarM11558a) ? 1 : 1;
                    } else {
                        Iterator it = list4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i3 = ((TokenMeaning) it.next()).f19594a;
                                if (i3 == -33 || i3 == -1) {
                                }
                            } else if (!C1909e.m8732e3(f5aVarM11558a) || f5aVarM11558a.f38452J) {
                            }
                        }
                    }
                    int size2 = ((LessonWord) w65Var).f19319f.size() + size;
                    i2 = size2 >= 1 ? size2 : 1;
                    if (i2 <= 2) {
                        i = i2;
                    }
                } else if (w65Var instanceof e05) {
                    TokenPopupData tokenPopupData = f5aVarM11558a.f38475g;
                    if (tokenPopupData != null && (list = tokenPopupData.f23453i) != null) {
                        size = list.size();
                    }
                    i2 = size >= 1 ? size : 1;
                    if (i2 <= 2) {
                        i = i2;
                    }
                } else {
                    int size3 = list2.size();
                    i2 = size3 >= 1 ? size3 : 1;
                    if (i2 <= 2) {
                        i = i2;
                    }
                }
            } else if (!f5aVarM11558a.f38493y || list3.isEmpty()) {
                int size4 = list3.size();
                i2 = size4 >= 1 ? size4 : 1;
                if (i2 <= 2) {
                    i = i2;
                }
            } else {
                i = i2;
            }
            if (f5aVarM11558a.f38446D != i) {
                f5aVarM11558a = f5a.m11558a(f5aVarM11558a, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, i, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -536870913, 2097151);
            }
        } while (!c3244l.m15570h(value, f5aVarM11558a));
        return xfa.f68157a;
    }
}
