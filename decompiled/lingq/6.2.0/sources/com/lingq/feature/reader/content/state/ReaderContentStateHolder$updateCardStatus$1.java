package com.lingq.feature.reader.content.state;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1533a;
import com.lingq.core.domain.token.C1536d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.pl3;
import p000.un1;
import p000.vz1;
import p000.xa2;
import p000.xfa;
import p000.xz7;
import p000.y7d;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$updateCardStatus$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {673, 674, 684, 690}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$updateCardStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28062a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2264a f28063b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28064c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TokenStatus f28065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$updateCardStatus$1(C2264a c2264a, String str, TokenStatus tokenStatus, Continuation continuation) {
        super(2, continuation);
        this.f28063b = c2264a;
        this.f28064c = str;
        this.f28065d = tokenStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentStateHolder$updateCardStatus$1(this.f28063b, this.f28064c, this.f28065d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentStateHolder$updateCardStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7116f;
        Object objM8220d;
        TokenMeaning tokenMeaning;
        String str;
        C1533a c1533a;
        int iIntValue;
        String str2;
        int iM24986e;
        String value;
        C2264a c2264a = this.f28063b;
        C3244l c3244l = c2264a.f28125n;
        C3244l c3244l2 = c2264a.f28124m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28062a;
        xfa xfaVar = xfa.f68157a;
        TokenStatus tokenStatus = this.f28065d;
        String str3 = this.f28064c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            pl3 pl3Var = c2264a.f28113b;
            String str4 = (String) c3244l2.getValue();
            this.f28062a = 1;
            objM7116f = ((C1287c) pl3Var.f56400a).m7116f(str4, str3, this);
            if (objM7116f != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM7116f = obj;
        } else {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i != 3) {
                if (i == 4) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM8220d = obj;
        }
        tokenMeaning = (TokenMeaning) objM8220d;
        if (tokenMeaning != null) {
            int i2 = ((yz4) ((C3244l) c2264a.f28122k.f27957w.f9311a).getValue()).f70680n;
            xz7 xz7VarM9264f = c2264a.m9264f(i2, str3);
            str = xz7VarM9264f != null ? c2264a.m9266h(i2, vz1.m23604J(xz7VarM9264f)).f23315a : null;
            if (str == null) {
                str = "";
            }
            c1533a = c2264a.f28119h;
            iIntValue = ((Number) c3244l.getValue()).intValue();
            str2 = (String) c3244l2.getValue();
            iM24986e = y7d.m24986e(tokenStatus);
            value = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
            this.f28062a = 4;
            if (c1533a.m8211b(iIntValue, str2, this.f28064c, tokenMeaning, iM24986e, str, false, false, value, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        if (objM7116f != null) {
            xa2 xa2Var = c2264a.f28118g;
            String str5 = (String) c3244l2.getValue();
            int iM24986e2 = y7d.m24986e(tokenStatus);
            int iIntValue2 = ((Number) c3244l.getValue()).intValue();
            this.f28062a = 2;
            if (xa2Var.m24431a(str5, this.f28064c, iM24986e2, iIntValue2, this) != coroutineSingletons) {
                return xfaVar;
            }
        } else {
            C1536d c1536d = c2264a.f28120i;
            String str6 = (String) c3244l2.getValue();
            String str7 = (String) c2264a.f28126o.getValue();
            this.f28062a = 3;
            objM8220d = c1536d.m8220d(str6, str7, str3, this);
            if (objM8220d != coroutineSingletons) {
                tokenMeaning = (TokenMeaning) objM8220d;
                if (tokenMeaning != null) {
                    int i3 = ((yz4) ((C3244l) c2264a.f28122k.f27957w.f9311a).getValue()).f70680n;
                    xz7 xz7VarM9264f2 = c2264a.m9264f(i3, str3);
                    if (xz7VarM9264f2 != null) {
                    }
                    if (str == null) {
                        str = "";
                    }
                    c1533a = c2264a.f28119h;
                    iIntValue = ((Number) c3244l.getValue()).intValue();
                    str2 = (String) c3244l2.getValue();
                    iM24986e = y7d.m24986e(tokenStatus);
                    value = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
                    this.f28062a = 4;
                    if (c1533a.m8211b(iIntValue, str2, this.f28064c, tokenMeaning, iM24986e, str, false, false, value, this) == coroutineSingletons) {
                    }
                }
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }
}
