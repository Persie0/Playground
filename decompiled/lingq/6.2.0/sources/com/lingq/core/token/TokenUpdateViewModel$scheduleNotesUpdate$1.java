package com.lingq.core.token;

import com.lingq.core.token.domain.C1906c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.f5a;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$scheduleNotesUpdate$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1172, 1173}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$scheduleNotesUpdate$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f23674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23676c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23677d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$scheduleNotesUpdate$1(C1909e c1909e, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f23675b = c1909e;
        this.f23676c = str;
        this.f23677d = str2;
        this.f23678e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TokenUpdateViewModel$scheduleNotesUpdate$1(this.f23675b, this.f23676c, this.f23677d, this.f23678e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((TokenUpdateViewModel$scheduleNotesUpdate$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r2.m8723c(r55.f23676c, r55.f23677d, r55.f23678e, r55) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23674a;
        C1909e c1909e = this.f23675b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f23674a = 1;
            if (AbstractC3208a.m15437d(750L, this) != coroutineSingletons) {
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
        C3244l c3244l = c1909e.f23885W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -17, 2097149)));
        return xfa.f68157a;
        C1906c c1906c = c1909e.f23903q;
        this.f23674a = 2;
    }
}
