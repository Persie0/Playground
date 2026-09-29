package com.lingq.core.token;

import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.token.domain.C1908e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.f5a;
import p000.fa4;
import p000.un1;
import p000.w65;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$autoCreateLingQAndDismiss$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1551}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$autoCreateLingQAndDismiss$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f23555a;

    /* JADX INFO: renamed from: b */
    public int f23556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1909e f23557c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TokenPopupData f23558d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f23559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$autoCreateLingQAndDismiss$1(C1909e c1909e, TokenPopupData tokenPopupData, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f23557c = c1909e;
        this.f23558d = tokenPopupData;
        this.f23559e = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$autoCreateLingQAndDismiss$1(this.f23557c, this.f23558d, this.f23559e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$autoCreateLingQAndDismiss$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C1909e c1909e = this.f23557c;
        c18 c18Var = c1909e.f23886X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23556b;
        TokenPopupData tokenPopupData = this.f23558d;
        boolean z = this.f23559e;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            w65 w65Var = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38474f;
            LessonWord lessonWord = w65Var instanceof LessonWord ? (LessonWord) w65Var : null;
            if (lessonWord != null) {
                String str2 = lessonWord.f19322i;
                C1908e c1908e = c1909e.f23863A;
                TokenPopupData tokenPopupData2 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
                TokenControllerType tokenControllerType = tokenPopupData2 != null ? tokenPopupData2.f23452h : null;
                this.f23555a = str2;
                this.f23556b = 1;
                Object objM8729b = c1908e.m8729b(tokenControllerType, this);
                if (objM8729b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str2;
                obj = objM8729b;
            } else {
                c1909e.m8757b3(tokenPopupData, z);
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.f23555a;
        AbstractC3193b.m15359b(obj);
        if (((Boolean) obj).booleanValue() && fa4.m11650l(str, WordStatus.New.getValue())) {
            c1909e.m8754Z2(c1909e.f23872J.mo4589b2(), c1909e.f23880R, CardStatus.New.getValue(), true, this.f23558d);
        } else {
            c1909e.m8757b3(tokenPopupData, z);
        }
        return xfa.f68157a;
    }
}
