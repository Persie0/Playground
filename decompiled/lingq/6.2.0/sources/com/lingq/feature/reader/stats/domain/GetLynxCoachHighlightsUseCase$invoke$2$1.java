package com.lingq.feature.reader.stats.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cy9;
import p000.dj3;
import p000.e65;
import p000.in5;
import p000.kn5;
import p000.nz9;
import p000.wbd;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.domain.GetLynxCoachHighlightsUseCase$invoke$2$1", m4291f = "GetLynxCoachHighlightsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLynxCoachHighlightsUseCase$invoke$2$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f30762a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f30763b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Pair f30764c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f30765d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ nz9 f30766e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ cy9 f30767f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ArrayList f30768g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f30769h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f30770i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLynxCoachHighlightsUseCase$invoke$2$1(cy9 cy9Var, ArrayList arrayList, String str, int i, Continuation continuation) {
        super(6, continuation);
        this.f30767f = cy9Var;
        this.f30768g = arrayList;
        this.f30769h = str;
        this.f30770i = i;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        String str = this.f30769h;
        int i = this.f30770i;
        GetLynxCoachHighlightsUseCase$invoke$2$1 getLynxCoachHighlightsUseCase$invoke$2$1 = new GetLynxCoachHighlightsUseCase$invoke$2$1(this.f30767f, this.f30768g, str, i, (Continuation) obj6);
        getLynxCoachHighlightsUseCase$invoke$2$1.f30762a = (Map) obj;
        getLynxCoachHighlightsUseCase$invoke$2$1.f30763b = (Map) obj2;
        getLynxCoachHighlightsUseCase$invoke$2$1.f30764c = (Pair) obj3;
        getLynxCoachHighlightsUseCase$invoke$2$1.f30765d = zBooleanValue;
        getLynxCoachHighlightsUseCase$invoke$2$1.f30766e = (nz9) obj5;
        return getLynxCoachHighlightsUseCase$invoke$2$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f30762a;
        Map map2 = this.f30763b;
        Pair pair = this.f30764c;
        boolean z = this.f30765d;
        nz9 nz9Var = this.f30766e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = this.f30767f.f34712a;
        Locale localeForLanguageTag = Locale.forLanguageTag(this.f30769h);
        localeForLanguageTag.getClass();
        List listM23841b = wbd.m23841b(wbd.m23840a(this.f30768g, map, map2, localeForLanguageTag, z));
        List list = (List) e65.m10872d(this.f30770i, (Map) pair.f47623a);
        if (list == null) {
            list = EmptyList.f47638a;
        }
        return new in5(str, listM23841b, list, new kn5(nz9Var.f53455a, nz9Var.f53456b, nz9Var.f53458d, nz9Var.f53461g, nz9Var.f53462h));
    }
}
