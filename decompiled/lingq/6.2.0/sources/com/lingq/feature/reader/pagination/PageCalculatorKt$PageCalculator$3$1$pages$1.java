package com.lingq.feature.reader.pagination;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3489q9;
import p000.c32;
import p000.i43;
import p000.j55;
import p000.jn8;
import p000.ox9;
import p000.ry4;
import p000.t45;
import p000.u65;
import p000.un1;
import p000.xfa;
import p000.z91;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.pagination.PageCalculatorKt$PageCalculator$3$1$pages$1", m4291f = "PageCalculator.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PageCalculatorKt$PageCalculator$3$1$pages$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f29716a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f29717b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t45 f29718c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ox9 f29719d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jn8 f29720e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Map f29721f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ u65 f29722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageCalculatorKt$PageCalculator$3$1$pages$1(Context context, String str, t45 t45Var, ox9 ox9Var, jn8 jn8Var, Map map, u65 u65Var, Continuation continuation) {
        super(2, continuation);
        this.f29716a = context;
        this.f29717b = str;
        this.f29718c = t45Var;
        this.f29719d = ox9Var;
        this.f29720e = jn8Var;
        this.f29721f = map;
        this.f29722g = u65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PageCalculatorKt$PageCalculator$3$1$pages$1(this.f29716a, this.f29717b, this.f29718c, this.f29719d, this.f29720e, this.f29721f, this.f29722g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PageCalculatorKt$PageCalculator$3$1$pages$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        j55 j55Var = new j55(this.f29716a);
        String str = this.f29717b;
        str.getClass();
        j55Var.f45083j = str;
        j55Var.f45080g = this.f29718c;
        ox9 ox9Var = this.f29719d;
        ox9Var.getClass();
        j55Var.f45081h = ox9Var;
        jn8 jn8Var = this.f29720e;
        jn8Var.getClass();
        j55Var.f45082i = jn8Var;
        Map map = this.f29721f;
        map.getClass();
        j55Var.f45087n = map;
        Set setEntrySet = map.entrySet();
        setEntrySet.getClass();
        Iterator it = new i43(new z91(setEntrySet, 0), true, new ry4(7)).iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getClass();
            Integer numValueOf = Integer.valueOf(((Number) entry.getKey()).intValue());
            if (it.hasNext()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(numValueOf);
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    entry2.getClass();
                    linkedHashSet.add(Integer.valueOf(((Number) entry2.getKey()).intValue()));
                }
            } else {
                AbstractC3489q9.m19766C(numValueOf);
            }
        }
        u65 u65Var = this.f29722g;
        j55Var.f45089p = u65Var.f63493e;
        j55Var.m14299h(u65Var.f63489a);
        return j55Var.m14293a(u65Var.f63490b);
    }
}
