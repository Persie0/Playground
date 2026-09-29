package com.lingq.p020ui;

import android.R;
import android.widget.ArrayAdapter;
import com.lingq.core.domain.model.language.DictionaryLocale;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.es6;
import p000.fa4;
import p000.un1;
import p000.x91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$4", m4291f = "HomeFragment.kt", m4292l = {304}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$5$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f33918b;

    /* JADX INFO: renamed from: com.lingq.ui.HomeFragment$onViewCreated$5$4$1 */
    @c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$4$1", m4291f = "HomeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28751 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33919a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeFragment f33920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28751(HomeFragment homeFragment, Continuation continuation) {
            super(2, continuation);
            this.f33920b = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28751 c28751 = new C28751(this.f33920b, continuation);
            c28751.f33919a = obj;
            return c28751;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28751 c28751 = (C28751) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28751.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f33919a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (list != null) {
                HomeFragment homeFragment = this.f33920b;
                homeFragment.f33891G0 = new ArrayAdapter(homeFragment.m2090R(), R.layout.simple_list_item_single_choice);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC3352my.m17093L(homeFragment.m2090R(), ((DictionaryLocale) it.next()).f19021a));
                }
                x91.m24414t0(arrayList, new es6(5));
                ArrayAdapter arrayAdapter = homeFragment.f33891G0;
                if (arrayAdapter == null) {
                    fa4.m11636J("localesAdapter");
                    throw null;
                }
                arrayAdapter.addAll(arrayList);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$5$4(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f33918b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$5$4(this.f33918b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeFragment$onViewCreated$5$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33917a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = HomeFragment.f33886N0;
            HomeFragment homeFragment = this.f33918b;
            c18 c18Var = homeFragment.m9798k0().f34186u;
            C28751 c28751 = new C28751(homeFragment, null);
            this.f33917a = 1;
            if (AbstractC3224d.m15529h(c18Var, c28751, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
