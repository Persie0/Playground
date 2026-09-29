package com.lingq.core.p012ui.highlightedtext;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.C3386nv;
import p000.c32;
import p000.cd9;
import p000.fda;
import p000.jt3;
import p000.pk9;
import p000.t66;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xj2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1", m4291f = "HighlightedText.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jt3 f24012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f24013c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cd9 f24014d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fda f24015e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ cd9 f24016f;

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1$1 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1$1", m4291f = "HighlightedText.kt", m4292l = {394}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19201 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24017a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24018b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24019c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fda f24020d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19201(cd9 cd9Var, Integer num, fda fdaVar, Continuation continuation) {
            super(2, continuation);
            this.f24018b = cd9Var;
            this.f24019c = num;
            this.f24020d = fdaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19201(this.f24018b, this.f24019c, this.f24020d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19201) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24017a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0059a c0059a = (C0059a) this.f24018b.get(this.f24019c);
                if (c0059a != null) {
                    xj2 xj2Var = new xj2(0.0f);
                    this.f24017a = 1;
                    obj = C0059a.m744c(c0059a, xj2Var, this.f24020d, null, this, 12);
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

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1$2 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1$2", m4291f = "HighlightedText.kt", m4292l = {400}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19212 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24021a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24022b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24023c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f24024d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fda f24025e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19212(cd9 cd9Var, Integer num, float f, fda fdaVar, Continuation continuation) {
            super(2, continuation);
            this.f24022b = cd9Var;
            this.f24023c = num;
            this.f24024d = f;
            this.f24025e = fdaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19212(this.f24022b, this.f24023c, this.f24024d, this.f24025e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19212) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24021a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0059a c0059a = (C0059a) this.f24022b.get(this.f24023c);
                if (c0059a != null) {
                    xj2 xj2Var = new xj2(this.f24024d);
                    this.f24021a = 1;
                    obj = C0059a.m744c(c0059a, xj2Var, this.f24025e, null, this, 12);
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

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1$3 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1$3", m4291f = "HighlightedText.kt", m4292l = {411}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19223 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24026a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24027b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24028c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f24029d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fda f24030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19223(cd9 cd9Var, Integer num, float f, fda fdaVar, Continuation continuation) {
            super(2, continuation);
            this.f24027b = cd9Var;
            this.f24028c = num;
            this.f24029d = f;
            this.f24030e = fdaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19223(this.f24027b, this.f24028c, this.f24029d, this.f24030e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19223) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24026a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                cd9 cd9Var = this.f24027b;
                Integer num = this.f24028c;
                Object c0059a = cd9Var.get(num);
                if (c0059a == null) {
                    c0059a = new C0059a(new xj2(0.0f), pk9.f56365j, null, 12);
                    cd9Var.put(num, c0059a);
                }
                xj2 xj2Var = new xj2(this.f24029d);
                this.f24026a = 1;
                if (C0059a.m744c((C0059a) c0059a, xj2Var, this.f24030e, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1$4 */
    @c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$5$1$4", m4291f = "HighlightedText.kt", m4292l = {416}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19234 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24031a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd9 f24032b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f24033c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f24034d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fda f24035e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f24036f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19234(cd9 cd9Var, Integer num, float f, fda fdaVar, float f2, Continuation continuation) {
            super(2, continuation);
            this.f24032b = cd9Var;
            this.f24033c = num;
            this.f24034d = f;
            this.f24035e = fdaVar;
            this.f24036f = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19234(this.f24032b, this.f24033c, this.f24034d, this.f24035e, this.f24036f, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19234) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24031a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                cd9 cd9Var = this.f24032b;
                Integer num = this.f24033c;
                Object c0059a = cd9Var.get(num);
                if (c0059a == null) {
                    c0059a = new C0059a(new xj2(this.f24036f), pk9.f56365j, null, 12);
                    cd9Var.put(num, c0059a);
                }
                xj2 xj2Var = new xj2(this.f24034d);
                this.f24031a = 1;
                if (C0059a.m744c((C0059a) c0059a, xj2Var, this.f24035e, null, this, 12) == coroutineSingletons) {
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
    public HighlightedTextKt$HighlightedText$5$1(jt3 jt3Var, t66 t66Var, cd9 cd9Var, fda fdaVar, cd9 cd9Var2, Continuation continuation) {
        super(2, continuation);
        this.f24012b = jt3Var;
        this.f24013c = t66Var;
        this.f24014d = cd9Var;
        this.f24015e = fdaVar;
        this.f24016f = cd9Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HighlightedTextKt$HighlightedText$5$1 highlightedTextKt$HighlightedText$5$1 = new HighlightedTextKt$HighlightedText$5$1(this.f24012b, this.f24013c, this.f24014d, this.f24015e, this.f24016f, continuation);
        highlightedTextKt$HighlightedText$5$1.f24011a = obj;
        return highlightedTextKt$HighlightedText$5$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        HighlightedTextKt$HighlightedText$5$1 highlightedTextKt$HighlightedText$5$1 = (HighlightedTextKt$HighlightedText$5$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        highlightedTextKt$HighlightedText$5$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var = (un1) this.f24011a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        jt3 jt3Var = this.f24012b;
        Integer num = jt3Var.f46112j;
        Regex regex = AbstractC1932c.f24144a;
        t66 t66Var = this.f24013c;
        Integer num2 = (Integer) t66Var.getValue();
        float f = jt3Var.f46114l;
        float f2 = 0.1f * f * 1.5f;
        float f3 = f * 0.25f;
        float f4 = 1.8f * f3;
        fda fdaVar = this.f24015e;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (num == null || iIntValue != num.intValue()) {
                wfb.m23926u(un1Var, null, null, new C19201(this.f24014d, num2, fdaVar, null), 3);
                wfb.m23926u(un1Var, null, null, new C19212(this.f24016f, num2, f3, fdaVar, null), 3);
            }
        }
        if (num != null) {
            wfb.m23926u(un1Var, null, null, new C19223(this.f24014d, num, f2, fdaVar, null), 3);
            wfb.m23926u(un1Var, null, null, new C19234(this.f24016f, num, f4, fdaVar, f3, null), 3);
        }
        t66Var.setValue(num);
        return xfa.f68157a;
    }
}
