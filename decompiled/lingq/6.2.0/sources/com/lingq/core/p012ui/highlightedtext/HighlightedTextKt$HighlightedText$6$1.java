package com.lingq.core.p012ui.highlightedtext;

import androidx.compose.animation.AbstractC0072k;
import androidx.compose.animation.core.C0059a;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.C3386nv;
import p000.aa1;
import p000.c32;
import p000.cd9;
import p000.fda;
import p000.jt3;
import p000.pk9;
import p000.q7b;
import p000.s78;
import p000.t66;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xj2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1", m4291f = "HighlightedText.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$6$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jt3 f24038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f24039c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cd9 f24040d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fda f24041e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ cd9 f24042f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ cd9 f24043g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ fda f24044h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ s78 f24045i;

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$1 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$1", m4291f = "HighlightedText.kt", m4292l = {446}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19241 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24046a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24047b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24048c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fda f24049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19241(cd9 cd9Var, Integer num, fda fdaVar, Continuation continuation) {
            super(2, continuation);
            this.f24047b = cd9Var;
            this.f24048c = num;
            this.f24049d = fdaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19241(this.f24047b, this.f24048c, this.f24049d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19241) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24046a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                cd9 cd9Var = this.f24047b;
                Integer num = this.f24048c;
                Object c0059a = cd9Var.get(num);
                if (c0059a == null) {
                    c0059a = new C0059a(new xj2(0.0f), pk9.f56365j, null, 12);
                    cd9Var.put(num, c0059a);
                }
                xj2 xj2Var = new xj2(0.0f);
                this.f24046a = 1;
                if (C0059a.m744c((C0059a) c0059a, xj2Var, this.f24049d, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$2 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$2", m4291f = "HighlightedText.kt", m4292l = {451}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19252 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24050a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24051b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24052c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f24053d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fda f24054e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19252(cd9 cd9Var, Integer num, float f, fda fdaVar, Continuation continuation) {
            super(2, continuation);
            this.f24051b = cd9Var;
            this.f24052c = num;
            this.f24053d = f;
            this.f24054e = fdaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19252(this.f24051b, this.f24052c, this.f24053d, this.f24054e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19252) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24050a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                cd9 cd9Var = this.f24051b;
                Integer num = this.f24052c;
                Object c0059a = cd9Var.get(num);
                float f = this.f24053d;
                if (c0059a == null) {
                    c0059a = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                    cd9Var.put(num, c0059a);
                }
                xj2 xj2Var = new xj2(f);
                this.f24050a = 1;
                if (C0059a.m744c((C0059a) c0059a, xj2Var, this.f24054e, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$3 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$3", m4291f = "HighlightedText.kt", m4292l = {454}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19263 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24055a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24056b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24057c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f24058d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fda f24059e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19263(cd9 cd9Var, Integer num, long j, fda fdaVar, Continuation continuation) {
            super(2, continuation);
            this.f24056b = cd9Var;
            this.f24057c = num;
            this.f24058d = j;
            this.f24059e = fdaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19263(this.f24056b, this.f24057c, this.f24058d, this.f24059e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19263) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24055a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0059a c0059a = (C0059a) this.f24056b.get(this.f24057c);
                if (c0059a != null) {
                    aa1 aa1Var = new aa1(this.f24058d);
                    this.f24055a = 1;
                    obj = C0059a.m744c(c0059a, aa1Var, this.f24059e, null, this, 12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$4 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$4", m4291f = "HighlightedText.kt", m4292l = {470}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19274 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24060a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24061b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24062c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f24063d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fda f24064e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19274(cd9 cd9Var, Integer num, float f, fda fdaVar, Continuation continuation) {
            super(2, continuation);
            this.f24061b = cd9Var;
            this.f24062c = num;
            this.f24063d = f;
            this.f24064e = fdaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19274(this.f24061b, this.f24062c, this.f24063d, this.f24064e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19274) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24060a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                cd9 cd9Var = this.f24061b;
                Integer num = this.f24062c;
                Object c0059a = cd9Var.get(num);
                if (c0059a == null) {
                    c0059a = new C0059a(new xj2(0.0f), pk9.f56365j, null, 12);
                    cd9Var.put(num, c0059a);
                }
                xj2 xj2Var = new xj2(this.f24063d);
                this.f24060a = 1;
                if (C0059a.m744c((C0059a) c0059a, xj2Var, this.f24064e, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$5 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$5", m4291f = "HighlightedText.kt", m4292l = {475}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19285 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24065a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24066b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24067c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f24068d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fda f24069e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f24070f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19285(cd9 cd9Var, Integer num, float f, fda fdaVar, float f2, Continuation continuation) {
            super(2, continuation);
            this.f24066b = cd9Var;
            this.f24067c = num;
            this.f24068d = f;
            this.f24069e = fdaVar;
            this.f24070f = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19285(this.f24066b, this.f24067c, this.f24068d, this.f24069e, this.f24070f, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19285) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24065a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                cd9 cd9Var = this.f24066b;
                Integer num = this.f24067c;
                Object c0059a = cd9Var.get(num);
                if (c0059a == null) {
                    c0059a = new C0059a(new xj2(this.f24070f), pk9.f56365j, null, 12);
                    cd9Var.put(num, c0059a);
                }
                xj2 xj2Var = new xj2(this.f24068d);
                this.f24065a = 1;
                if (C0059a.m744c((C0059a) c0059a, xj2Var, this.f24069e, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$6 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$6$1$6", m4291f = "HighlightedText.kt", m4292l = {480}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19296 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24071a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24072b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24073c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f24074d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fda f24075e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f24076f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19296(cd9 cd9Var, Integer num, long j, fda fdaVar, long j2, Continuation continuation) {
            super(2, continuation);
            this.f24072b = cd9Var;
            this.f24073c = num;
            this.f24074d = j;
            this.f24075e = fdaVar;
            this.f24076f = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19296(this.f24072b, this.f24073c, this.f24074d, this.f24075e, this.f24076f, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19296) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24071a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                cd9 cd9Var = this.f24072b;
                Integer num = this.f24073c;
                Object objM784a = cd9Var.get(num);
                if (objM784a == null) {
                    objM784a = AbstractC0072k.m784a(this.f24076f);
                    cd9Var.put(num, objM784a);
                }
                aa1 aa1Var = new aa1(this.f24074d);
                this.f24071a = 1;
                if (C0059a.m744c((C0059a) objM784a, aa1Var, this.f24075e, null, this, 12) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$6$1(jt3 jt3Var, t66 t66Var, cd9 cd9Var, fda fdaVar, cd9 cd9Var2, cd9 cd9Var3, fda fdaVar2, s78 s78Var, Continuation continuation) {
        super(2, continuation);
        this.f24038b = jt3Var;
        this.f24039c = t66Var;
        this.f24040d = cd9Var;
        this.f24041e = fdaVar;
        this.f24042f = cd9Var2;
        this.f24043g = cd9Var3;
        this.f24044h = fdaVar2;
        this.f24045i = s78Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HighlightedTextKt$HighlightedText$6$1 highlightedTextKt$HighlightedText$6$1 = new HighlightedTextKt$HighlightedText$6$1(this.f24038b, this.f24039c, this.f24040d, this.f24041e, this.f24042f, this.f24043g, this.f24044h, this.f24045i, continuation);
        highlightedTextKt$HighlightedText$6$1.f24037a = obj;
        return highlightedTextKt$HighlightedText$6$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        HighlightedTextKt$HighlightedText$6$1 highlightedTextKt$HighlightedText$6$1 = (HighlightedTextKt$HighlightedText$6$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        highlightedTextKt$HighlightedText$6$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [kn1, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kn1, kotlinx.coroutines.CoroutineStart] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fda fdaVar;
        float f;
        int i;
        ?? r10;
        Object next;
        long j;
        un1 un1Var = (un1) this.f24037a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        jt3 jt3Var = this.f24038b;
        Integer num = jt3Var.f46111i;
        Regex regex = AbstractC1932c.f24144a;
        t66 t66Var = this.f24039c;
        Integer num2 = (Integer) t66Var.getValue();
        float f2 = jt3Var.f46114l;
        float f3 = 0.1f * f2;
        float f4 = f2 * 0.25f;
        float f5 = f4 * 1.5f;
        long j2 = aa1.f411j;
        fda fdaVar2 = this.f24044h;
        fda fdaVar3 = this.f24041e;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (num != null && iIntValue == num.intValue()) {
                fdaVar = fdaVar2;
                f = f4;
                i = 3;
                r10 = 0;
            } else {
                wfb.m23926u(un1Var, null, null, new C19241(this.f24040d, num2, fdaVar3, null), 3);
                f = f4;
                C19252 c19252 = new C19252(this.f24042f, num2, f, fdaVar3, null);
                fdaVar3 = fdaVar3;
                wfb.m23926u(un1Var, null, null, c19252, 3);
                fdaVar = fdaVar2;
                i = 3;
                r10 = 0;
                wfb.m23926u(un1Var, null, null, new C19263(this.f24043g, num2, j2, fdaVar, null), 3);
            }
        } else {
            fdaVar = fdaVar2;
            f = f4;
            i = 3;
            r10 = 0;
        }
        if (num != null) {
            Iterator it = jt3Var.f46105c.iterator();
            do {
                if (!it.hasNext()) {
                    next = r10;
                    break;
                }
                next = it.next();
            } while (((q7b) next).f57357a.f69009f != num.intValue());
            q7b q7bVar = (q7b) next;
            if (q7bVar != null) {
                boolean z = q7bVar.f57359c;
                s78 s78Var = this.f24045i;
                j = z ? s78Var.f60478h : s78Var.f60479i;
            } else {
                j = j2;
            }
            wfb.m23926u(un1Var, r10, r10, new C19274(this.f24040d, num, f3, fdaVar3, null), i);
            wfb.m23926u(un1Var, r10, r10, new C19285(this.f24042f, num, f5, fdaVar3, f, null), i);
            ?? r2 = r10;
            wfb.m23926u(un1Var, r2, r2, new C19296(this.f24043g, num, j, fdaVar, j2, null), i);
        }
        t66Var.setValue(num);
        return xfa.f68157a;
    }
}
