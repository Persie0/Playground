package com.lingq.p020ui;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.km7;
import p000.si7;
import p000.un1;
import p000.vi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$updateInterfaceLanguage$1", m4291f = "HomeViewModel.kt", m4292l = {376, 377, 378, 379}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$updateInterfaceLanguage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2888d f33990b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateInterfaceLanguage$1(C2888d c2888d, String str, Continuation continuation) {
        super(2, continuation);
        this.f33990b = c2888d;
        this.f33991c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$updateInterfaceLanguage$1(this.f33990b, this.f33991c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$updateInterfaceLanguage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r0.f34167b.mo4597w0(r9) == r2) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        km7 km7Var;
        C2888d c2888d = this.f33990b;
        si7 si7Var = c2888d.f34178m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33989a;
        String str = this.f33991c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vi7 vi7Var = ((C1368a) si7Var).f18356L0;
            this.f33989a = 1;
            obj = AbstractC3224d.m15541t(vi7Var, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                km7Var = c2888d.f34170e;
                this.f33989a = 3;
                if (((C1267a) km7Var).m7060A(str, this) != coroutineSingletons) {
                    this.f33989a = 4;
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                this.f33989a = 4;
            } else {
                if (i != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        }
        return xfa.f68157a;
        if (!fa4.m11650l(obj, str)) {
            this.f33989a = 2;
            if (((C1368a) si7Var).m7913z(str, this) != coroutineSingletons) {
                km7Var = c2888d.f34170e;
                this.f33989a = 3;
                if (((C1267a) km7Var).m7060A(str, this) != coroutineSingletons) {
                    this.f33989a = 4;
                }
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }
}
