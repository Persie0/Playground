package com.lingq.feature.onboarding.p014v2;

import com.lingq.core.data.repository.C1297m;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.language.DictionaryLocale;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.ys2;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$loadDictionaryLocales$1", m4291f = "OnboardingV2ViewModel.kt", m4292l = {631, 632}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ViewModel$loadDictionaryLocales$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27316a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2216d f27317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ViewModel$loadDictionaryLocales$1(C2216d c2216d, Continuation continuation) {
        super(2, continuation);
        this.f27317b = c2216d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingV2ViewModel$loadDictionaryLocales$1(this.f27317b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingV2ViewModel$loadDictionaryLocales$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r8 == r2) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Collection collection;
        C2216d c2216d = this.f27317b;
        C1297m c1297m = c2216d.f27389n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27316a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f27316a = 1;
                if (c1297m.m7328b(this) == coroutineSingletons) {
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
            collection = (List) obj;
            C3244l c3244l = c2216d.f27394s;
            Collection collection2 = collection;
            if (collection2.isEmpty()) {
                ys2 entries = LanguageLearn.getEntries();
                ArrayList arrayList = new ArrayList(v91.m23189q0(entries, 10));
                Iterator<E> it = entries.iterator();
                while (it.hasNext()) {
                    arrayList.add(new DictionaryLocale(((LanguageLearn) it.next()).getCode(), ""));
                }
                collection2 = arrayList;
            }
            c3244l.getClass();
            c3244l.m15572j(null, collection2);
            return xfa.f68157a;
            this.f27316a = 2;
            obj = c1297m.m7327a(this);
        } catch (Exception unused) {
            collection = EmptyList.f47638a;
        }
    }
}
