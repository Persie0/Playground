package com.lingq.feature.reader.content.state;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.CardStatus;
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
import p000.u91;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$addWordAsCard$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {722, 727}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$addWordAsCard$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonWord f27988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2264a f27989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$addWordAsCard$1(LessonWord lessonWord, C2264a c2264a, Continuation continuation) {
        super(2, continuation);
        this.f27988b = lessonWord;
        this.f27989c = c2264a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentStateHolder$addWordAsCard$1(this.f27988b, this.f27989c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentStateHolder$addWordAsCard$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[PHI: r2
      0x0051: PHI (r2v6 com.lingq.core.domain.model.token.TokenMeaning) = (r2v3 com.lingq.core.domain.model.token.TokenMeaning), (r2v18 com.lingq.core.domain.model.token.TokenMeaning) binds: [B:12:0x002f, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r2 == r11) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TokenMeaning tokenMeaning;
        Object objM8220d;
        TokenMeaning tokenMeaning2;
        String str;
        C1533a c1533a;
        int iIntValue;
        String str2;
        String str3;
        int value;
        String value2;
        C2264a c2264a = this.f27989c;
        C3244l c3244l = c2264a.f28124m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27987a;
        xfa xfaVar = xfa.f68157a;
        LessonWord lessonWord = this.f27988b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
            if (tokenMeaning == null) {
                C1536d c1536d = c2264a.f28120i;
                String str4 = (String) c3244l.getValue();
                String str5 = (String) c2264a.f28126o.getValue();
                String str6 = lessonWord.f19314a;
                this.f27987a = 1;
                objM8220d = c1536d.m8220d(str4, str5, str6, this);
            } else {
                tokenMeaning2 = tokenMeaning;
                int i2 = ((yz4) ((C3244l) c2264a.f28122k.f27957w.f9311a).getValue()).f70680n;
                xz7 xz7VarM9264f = c2264a.m9264f(i2, lessonWord.f19314a);
                str = xz7VarM9264f != null ? c2264a.m9266h(i2, vz1.m23604J(xz7VarM9264f)).f23315a : null;
                if (str == null) {
                    str = "";
                }
                c1533a = c2264a.f28119h;
                iIntValue = ((Number) c2264a.f28125n.getValue()).intValue();
                str2 = (String) c3244l.getValue();
                str3 = lessonWord.f19314a;
                value = CardStatus.New.getValue();
                value2 = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
                this.f27987a = 2;
                if (c1533a.m8211b(iIntValue, str2, str3, tokenMeaning2, value, str, false, false, value2, this) != coroutineSingletons) {
                    return xfaVar;
                }
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
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
            tokenMeaning2 = tokenMeaning;
            int i3 = ((yz4) ((C3244l) c2264a.f28122k.f27957w.f9311a).getValue()).f70680n;
            xz7 xz7VarM9264f2 = c2264a.m9264f(i3, lessonWord.f19314a);
            if (xz7VarM9264f2 != null) {
            }
            if (str == null) {
                str = "";
            }
            c1533a = c2264a.f28119h;
            iIntValue = ((Number) c2264a.f28125n.getValue()).intValue();
            str2 = (String) c3244l.getValue();
            str3 = lessonWord.f19314a;
            value = CardStatus.New.getValue();
            value2 = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
            this.f27987a = 2;
            if (c1533a.m8211b(iIntValue, str2, str3, tokenMeaning2, value, str, false, false, value2, this) != coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
