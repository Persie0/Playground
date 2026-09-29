package com.lingq.feature.review;

import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.c3a;
import p000.hg8;
import p000.ka8;
import p000.t66;
import p000.un1;
import p000.vd8;
import p000.vi3;
import p000.xd8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewRouteKt$ReviewRoute$1$1", m4291f = "ReviewRoute.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewRouteKt$ReviewRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1909e f31749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f31750b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2751b f31751c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f31752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewRouteKt$ReviewRoute$1$1(C1909e c1909e, vi3 vi3Var, C2751b c2751b, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f31749a = c1909e;
        this.f31750b = vi3Var;
        this.f31751c = c2751b;
        this.f31752d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewRouteKt$ReviewRoute$1$1(this.f31749a, this.f31750b, this.f31751c, this.f31752d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewRouteKt$ReviewRoute$1$1 reviewRouteKt$ReviewRoute$1$1 = (ReviewRouteKt$ReviewRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewRouteKt$ReviewRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        xd8 xd8Var = ((hg8) this.f31752d.getValue()).f42332g;
        xfa xfaVar = xfa.f68157a;
        if (xd8Var == null) {
            return xfaVar;
        }
        if (xd8Var instanceof vd8) {
            TokenPopupData tokenPopupData = ((vd8) xd8Var).f65242a;
            String str = tokenPopupData.f23445a;
            String str2 = tokenPopupData.f23446b;
            TokenType tokenType = tokenPopupData.f23447c;
            int i = tokenPopupData.f23448d;
            int i2 = tokenPopupData.f23449e;
            TokenFragmentData tokenFragmentData = tokenPopupData.f23450f;
            TokenControllerType tokenControllerType = tokenPopupData.f23452h;
            List list = tokenPopupData.f23453i;
            int i3 = tokenPopupData.f23454j;
            TokenTransliteration tokenTransliteration = tokenPopupData.f23455k;
            boolean z = tokenPopupData.f23456l;
            int i4 = tokenPopupData.f23434H;
            int i5 = tokenPopupData.f23435I;
            Map map = tokenPopupData.f23436J;
            int i6 = tokenPopupData.f23437K;
            int i7 = tokenPopupData.f23438L;
            int i8 = tokenPopupData.f23439M;
            int i9 = tokenPopupData.f23440N;
            boolean z2 = tokenPopupData.f23441O;
            String str3 = tokenPopupData.f23442P;
            String str4 = tokenPopupData.f23443Q;
            boolean z3 = tokenPopupData.f23444R;
            str.getClass();
            str2.getClass();
            tokenType.getClass();
            tokenFragmentData.getClass();
            tokenControllerType.getClass();
            list.getClass();
            map.getClass();
            this.f31749a.m8760d3(new c3a(new TokenPopupData(str, str2, tokenType, i, i2, tokenFragmentData, TokenViewState.Expanded.f23709a, tokenControllerType, list, i3, tokenTransliteration, z, i4, i5, map, i6, i7, i8, i9, z2, str3, str4, z3), false));
        } else {
            this.f31750b.invoke(xd8Var);
        }
        this.f31751c.m9566X2(ka8.f46947a);
        return xfaVar;
    }
}
