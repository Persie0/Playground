package com.lingq.core.token;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.token.domain.C1905b;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e05;
import p000.f5a;
import p000.w65;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$initializeAndLoadTokenData$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {673}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$initializeAndLoadTokenData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f23615a;

    /* JADX INFO: renamed from: b */
    public int f23616b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23617c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1909e f23618d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23619e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenPopupData f23620f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f23621g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$initializeAndLoadTokenData$1(C1909e c1909e, String str, TokenPopupData tokenPopupData, List list, String str2, Continuation continuation) {
        super(2, continuation);
        this.f23618d = c1909e;
        this.f23619e = str;
        this.f23620f = tokenPopupData;
        this.f23621g = list;
        this.f23622h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$initializeAndLoadTokenData$1 tokenUpdateViewModel$initializeAndLoadTokenData$1 = new TokenUpdateViewModel$initializeAndLoadTokenData$1(this.f23618d, this.f23619e, this.f23620f, this.f23621g, this.f23622h, continuation);
        tokenUpdateViewModel$initializeAndLoadTokenData$1.f23617c = obj;
        return tokenUpdateViewModel$initializeAndLoadTokenData$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$initializeAndLoadTokenData$1) create((w65) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8717c;
        String str;
        String str2;
        TokenControllerType tokenControllerType;
        Object value;
        TokenUpdateViewModel$initializeAndLoadTokenData$1 tokenUpdateViewModel$initializeAndLoadTokenData$1 = this;
        w65 w65Var = (w65) tokenUpdateViewModel$initializeAndLoadTokenData$1.f23617c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = tokenUpdateViewModel$initializeAndLoadTokenData$1.f23616b;
        TokenPopupData tokenPopupData = tokenUpdateViewModel$initializeAndLoadTokenData$1.f23620f;
        EmptyList emptyList = EmptyList.f47638a;
        xfa xfaVar = xfa.f68157a;
        LessonCard lessonCard = null;
        C1909e c1909e = tokenUpdateViewModel$initializeAndLoadTokenData$1.f23618d;
        boolean z = true;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (w65Var == null) {
                C1909e.m8731c3(c1909e, null, 3);
                return xfaVar;
            }
            String strMo8037d = w65Var.mo8037d();
            C1905b c1905b = c1909e.f23906t;
            String strMo8037d2 = w65Var.mo8037d();
            boolean z2 = (w65Var instanceof LessonWord) || (w65Var instanceof LessonCard);
            List list = w65Var instanceof e05 ? ((e05) w65Var).f36533f : emptyList;
            TokenTransliteration tokenTransliteration = tokenPopupData.f23455k;
            tokenUpdateViewModel$initializeAndLoadTokenData$1.f23617c = w65Var;
            tokenUpdateViewModel$initializeAndLoadTokenData$1.f23615a = strMo8037d;
            tokenUpdateViewModel$initializeAndLoadTokenData$1.f23616b = 1;
            objM8717c = c1905b.m8717c(tokenUpdateViewModel$initializeAndLoadTokenData$1.f23619e, strMo8037d2, z2, list, tokenTransliteration, tokenUpdateViewModel$initializeAndLoadTokenData$1);
            if (objM8717c == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = strMo8037d;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = tokenUpdateViewModel$initializeAndLoadTokenData$1.f23615a;
            AbstractC3193b.m15359b(obj);
            str = str3;
            objM8717c = obj;
        }
        String str4 = (String) objM8717c;
        boolean z3 = tokenUpdateViewModel$initializeAndLoadTokenData$1.f23621g.size() > 1;
        if (w65Var instanceof LessonWord) {
            C3244l c3244l = c1909e.f23883U;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, ((LessonWord) w65Var).f19319f));
        }
        C3244l c3244l2 = c1909e.f23885W;
        while (true) {
            Object value2 = c3244l2.getValue();
            f5a f5aVar = (f5a) value2;
            int iMo8038e = w65Var.mo8038e();
            List listMo8036c = w65Var.mo8036c();
            boolean z4 = w65Var instanceof LessonCard;
            LessonCard lessonCard2 = z4 ? (LessonCard) w65Var : lessonCard;
            if (lessonCard2 == null || (str2 = lessonCard2.f19192o) == null) {
                str2 = "";
            }
            String str5 = str2;
            List list2 = z4 ? ((LessonCard) w65Var).f19183f : emptyList;
            String lowerCase = tokenUpdateViewModel$initializeAndLoadTokenData$1.f23622h.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            boolean z5 = (lowerCase.equals("other") || !((tokenControllerType = tokenPopupData.f23452h) == TokenControllerType.Lesson || tokenControllerType == TokenControllerType.LessonExpanded || tokenControllerType == TokenControllerType.LessonVideo || tokenPopupData.f23439M != -1)) ? false : z;
            C3244l c3244l3 = c3244l2;
            w65 w65Var2 = w65Var;
            LessonCard lessonCard3 = lessonCard;
            boolean z6 = z;
            TokenPopupData tokenPopupData2 = tokenPopupData;
            String str6 = str4;
            if (c3244l3.m15570h(value2, f5a.m11558a(f5aVar, null, null, false, null, w65Var2, null, str, str6, false, false, null, null, iMo8038e, null, listMo8036c, null, list2, null, null, null, null, str5, z3, false, null, null, false, 0, false, false, false, false, false, false, false, false, z5, null, false, null, null, null, false, false, null, null, false, null, null, null, 2134728279, 2097087))) {
                return xfaVar;
            }
            tokenUpdateViewModel$initializeAndLoadTokenData$1 = this;
            c3244l2 = c3244l3;
            w65Var = w65Var2;
            str4 = str6;
            tokenPopupData = tokenPopupData2;
            lessonCard = lessonCard3;
            z = z6;
        }
    }
}
