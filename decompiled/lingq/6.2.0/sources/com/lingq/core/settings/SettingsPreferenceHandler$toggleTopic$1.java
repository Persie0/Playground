package com.lingq.core.settings;

import com.lingq.core.data.repository.C1293i;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.lm4;
import p000.p29;
import p000.un1;
import p000.vqb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsPreferenceHandler$toggleTopic$1", m4291f = "SettingsPreferenceHandler.kt", m4292l = {84}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsPreferenceHandler$toggleTopic$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p29 f22670b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f22671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPreferenceHandler$toggleTopic$1(p29 p29Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.f22670b = p29Var;
        this.f22671c = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsPreferenceHandler$toggleTopic$1(this.f22670b, this.f22671c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsPreferenceHandler$toggleTopic$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22669a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        p29 p29Var = this.f22670b;
        vqb vqbVar = (vqb) p29Var.f55495g;
        String strMo4589b2 = ((cma) p29Var.f55499k).mo4589b2();
        this.f22669a = 1;
        Object objM7224u = ((C1293i) ((lm4) vqbVar.f65802b)).m7224u(strMo4589b2, this.f22671c, this);
        if (objM7224u != coroutineSingletons) {
            objM7224u = xfaVar;
        }
        return objM7224u == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
