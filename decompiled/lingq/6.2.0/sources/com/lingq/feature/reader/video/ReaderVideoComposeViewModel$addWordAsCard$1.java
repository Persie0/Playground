package com.lingq.feature.reader.video;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1533a;
import com.lingq.core.domain.token.C1536d;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.feature.reader.video.state.C2595a;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.u91;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$addWordAsCard$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {915, 917}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$addWordAsCard$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonWord f31182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2583a f31183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$addWordAsCard$1(LessonWord lessonWord, C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31182b = lessonWord;
        this.f31183c = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$addWordAsCard$1(this.f31182b, this.f31183c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$addWordAsCard$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050 A[PHI: r2
      0x0050: PHI (r2v6 com.lingq.core.domain.model.token.TokenMeaning) = (r2v3 com.lingq.core.domain.model.token.TokenMeaning), (r2v9 com.lingq.core.domain.model.token.TokenMeaning) binds: [B:12:0x0032, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r2 == r11) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TokenMeaning tokenMeaning;
        Object objM8220d;
        C1533a c1533a;
        int i;
        String strMo4589b2;
        String str;
        int value;
        C2595a c2595a;
        String strM23610P;
        Iterator it;
        Object next;
        xz7 xz7Var;
        TokenFragmentData tokenFragmentDataM9520b;
        String str2;
        String value2;
        C2583a c2583a = this.f31183c;
        cma cmaVar = c2583a.f31369b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f31181a;
        xfa xfaVar = xfa.f68157a;
        LessonWord lessonWord = this.f31182b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
            if (tokenMeaning == null) {
                C1536d c1536d = c2583a.f31345D;
                String strMo4589b3 = cmaVar.mo4589b2();
                String strMo4580K1 = cmaVar.mo4580K1();
                String str3 = lessonWord.f19314a;
                this.f31181a = 1;
                objM8220d = c1536d.m8220d(strMo4589b3, strMo4580K1, str3, this);
            } else {
                c1533a = c2583a.f31344C;
                i = c2583a.f31348G;
                strMo4589b2 = cmaVar.mo4589b2();
                str = lessonWord.f19314a;
                value = CardStatus.New.getValue();
                c2595a = c2583a.f31372e;
                String str4 = lessonWord.f19314a;
                c2595a.getClass();
                str4.getClass();
                strM23610P = vz1.m23610P(str4, c2595a.m9521c());
                it = ((Iterable) c2595a.f31534k.getValue()).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!vz1.m23610P(((xz7) next).f69008e, c2595a.m9521c()).equals(strM23610P));
                xz7Var = (xz7) next;
                if (xz7Var == null) {
                    tokenFragmentDataM9520b = new TokenFragmentData();
                } else {
                    tokenFragmentDataM9520b = c2595a.m9520b(vz1.m23604J(xz7Var));
                }
                str2 = tokenFragmentDataM9520b.f23315a;
                value2 = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
                this.f31181a = 2;
                if (c1533a.m8211b(i, strMo4589b2, str, tokenMeaning, value, str2, false, false, value2, this) != coroutineSingletons) {
                    return xfaVar;
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        objM8220d = obj;
        tokenMeaning = (TokenMeaning) objM8220d;
        if (tokenMeaning != null) {
            c1533a = c2583a.f31344C;
            i = c2583a.f31348G;
            strMo4589b2 = cmaVar.mo4589b2();
            str = lessonWord.f19314a;
            value = CardStatus.New.getValue();
            c2595a = c2583a.f31372e;
            String str5 = lessonWord.f19314a;
            c2595a.getClass();
            str5.getClass();
            strM23610P = vz1.m23610P(str5, c2595a.m9521c());
            it = ((Iterable) c2595a.f31534k.getValue()).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!vz1.m23610P(((xz7) next).f69008e, c2595a.m9521c()).equals(strM23610P));
            xz7Var = (xz7) next;
            if (xz7Var == null) {
                tokenFragmentDataM9520b = new TokenFragmentData();
            } else {
                tokenFragmentDataM9520b = c2595a.m9520b(vz1.m23604J(xz7Var));
            }
            str2 = tokenFragmentDataM9520b.f23315a;
            value2 = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
            this.f31181a = 2;
            if (c1533a.m8211b(i, strMo4589b2, str, tokenMeaning, value, str2, false, false, value2, this) != coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
