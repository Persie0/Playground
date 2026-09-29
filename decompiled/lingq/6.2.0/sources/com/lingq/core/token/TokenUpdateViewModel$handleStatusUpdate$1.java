package com.lingq.core.token;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.token.domain.C1904a;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3509qs;
import p000.az5;
import p000.bz5;
import p000.c32;
import p000.c5a;
import p000.e05;
import p000.f5a;
import p000.gm5;
import p000.k5a;
import p000.un1;
import p000.va2;
import p000.w65;
import p000.wfb;
import p000.xa2;
import p000.xfa;
import p000.y7d;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$handleStatusUpdate$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1245, 1249, 1253, 1276}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$handleStatusUpdate$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w65 f23607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TokenStatus f23608c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1909e f23609d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23610e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f23611f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23612g;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenUpdateViewModel$handleStatusUpdate$1$1 */
    @c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$handleStatusUpdate$1$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1292, 1293}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18971 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f23613a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1909e f23614b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18971(C1909e c1909e, Continuation continuation) {
            super(2, continuation);
            this.f23614b = c1909e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18971(this.f23614b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18971) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            if (r6.mo4239l2(0, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23613a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f23613a = 1;
                if (AbstractC3208a.m15437d(2000L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
            bz5 bz5Var = this.f23614b.f23871I;
            this.f23613a = 2;
            az5 az5Var = bz5.Companion;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$handleStatusUpdate$1(w65 w65Var, TokenStatus tokenStatus, C1909e c1909e, String str, String str2, int i, Continuation continuation) {
        super(2, continuation);
        this.f23607b = w65Var;
        this.f23608c = tokenStatus;
        this.f23609d = c1909e;
        this.f23610e = str;
        this.f23611f = str2;
        this.f23612g = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$handleStatusUpdate$1(this.f23607b, this.f23608c, this.f23609d, this.f23610e, this.f23611f, this.f23612g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$handleStatusUpdate$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r14 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r3.m24431a(r14.f23610e, r5, r6, r14.f23612g, r14) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        if (r14 == r0) goto L52;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String value;
        Object objM8713d;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23606a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f23611f;
        TokenStatus tokenStatus = this.f23608c;
        C1909e c1909e = this.f23609d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f23606a = 1;
            if (AbstractC3208a.m15437d(60L, this) != obj2) {
            }
            return obj2;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                c1909e.f23868F.mo8772q1(str);
                C1909e.m8731c3(c1909e, null, 2);
                return xfaVar;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                C1909e.m8731c3(c1909e, null, 2);
                return xfaVar;
            }
            if (i != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM8713d = ((Result) obj).f47625a;
            boolean z = objM8713d instanceof Result.Failure;
            if (!z) {
                Object obj3 = Boolean.FALSE;
                if (z) {
                    objM8713d = obj3;
                }
                if (((Boolean) objM8713d).booleanValue()) {
                    C3244l c3244l = c1909e.f23885W;
                    C3509qs c3509qs = c1909e.f23875M;
                    if (!((f5a) c3244l.getValue()).f38462T && tokenStatus == TokenStatus.Known && (c3509qs.f58118b.getInt("tutorial_known_words", 0) == 5 || c3509qs.f58118b.getInt("tutorial_known_words", 0) == 15)) {
                        c1909e.f23868F.mo8769n0();
                    }
                }
            }
            C1909e.m8731c3(c1909e, null, 2);
            wfb.m23926u(c1909e.f23877O, null, null, new C18971(c1909e, null), 3);
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        w65 w65Var = this.f23607b;
        if (!(w65Var instanceof LessonCard)) {
            if (w65Var instanceof LessonWord) {
                int i2 = k5a.f46738a[tokenStatus.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                    this.f23609d.m8754Z2(this.f23610e, this.f23612g, y7d.m24986e(tokenStatus), true, null);
                } else {
                    C1904a c1904a = c1909e.f23899m;
                    switch (c5a.f9591a[tokenStatus.ordinal()]) {
                        case 1:
                            value = WordStatus.Ignored.getValue();
                            break;
                        case 2:
                            value = WordStatus.New.getValue();
                            break;
                        case 3:
                            value = WordStatus.Card.getValue();
                            break;
                        case 4:
                            value = WordStatus.Card.getValue();
                            break;
                        case 5:
                            value = WordStatus.Card.getValue();
                            break;
                        case 6:
                            value = WordStatus.Known.getValue();
                            break;
                        default:
                            gm5.m12750e();
                            return null;
                    }
                    String str2 = value;
                    this.f23606a = 4;
                    objM8713d = c1904a.m8713d(this.f23612g, this.f23610e, str, str2, this);
                }
            } else if (w65Var instanceof e05) {
                this.f23609d.m8754Z2(this.f23610e, this.f23612g, y7d.m24986e(tokenStatus), true, null);
            }
            return xfaVar;
        }
        if (tokenStatus == TokenStatus.Ignored) {
            va2 va2Var = c1909e.f23898l;
            int iM24986e = y7d.m24986e(tokenStatus);
            this.f23606a = 2;
            Object objM7113b = ((C1287c) va2Var.f65121a).m7113b(iM24986e, this.f23610e, str, this);
            if (objM7113b != obj2) {
                objM7113b = xfaVar;
            }
        } else {
            xa2 xa2Var = c1909e.f23897k;
            int iM24986e2 = y7d.m24986e(tokenStatus);
            this.f23606a = 3;
        }
        return obj2;
    }
}
