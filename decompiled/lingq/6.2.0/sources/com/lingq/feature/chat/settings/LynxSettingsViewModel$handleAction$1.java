package com.lingq.feature.chat.settings;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.settings.domain.C1869h;
import com.lingq.feature.chat.domain.C2000e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.ao5;
import p000.bo5;
import p000.c32;
import p000.cma;
import p000.gm5;
import p000.oz8;
import p000.rm3;
import p000.un1;
import p000.wn5;
import p000.xfa;
import p000.xn5;
import p000.yn5;
import p000.zi3;
import p000.zn5;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.settings.LynxSettingsViewModel$handleAction$1", m4291f = "LynxSettingsViewModel.kt", m4292l = {DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER, 42, 46, 49, 52}, m4293m = "invokeSuspend", m4294v = 2)
final class LynxSettingsViewModel$handleAction$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25314a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bo5 f25315b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2010a f25316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxSettingsViewModel$handleAction$1(bo5 bo5Var, C2010a c2010a, Continuation continuation) {
        super(2, continuation);
        this.f25315b = bo5Var;
        this.f25316c = c2010a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LynxSettingsViewModel$handleAction$1(this.f25315b, this.f25316c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LynxSettingsViewModel$handleAction$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2010a c2010a = this.f25316c;
        cma cmaVar = c2010a.f25325g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25314a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 4) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 5) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        bo5 bo5Var = this.f25315b;
        if (bo5Var instanceof xn5) {
            oz8 oz8Var = c2010a.f25320b;
            boolean z = ((xn5) bo5Var).f68396a;
            this.f25314a = 1;
            Object objM7889l = ((C1368a) oz8Var.f55331a).m7889l(z, this);
            if (objM7889l != coroutineSingletons) {
                objM7889l = xfaVar;
            }
            if (objM7889l == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (bo5Var instanceof wn5) {
            rm3 rm3Var = c2010a.f25321c;
            boolean z2 = ((wn5) bo5Var).f67093a;
            this.f25314a = 2;
            Object objM7887k = ((C1368a) rm3Var.f59534a).m7887k(z2, this);
            if (objM7887k != coroutineSingletons) {
                objM7887k = xfaVar;
            }
            if (objM7887k == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (bo5Var instanceof yn5) {
            C1869h c1869h = c2010a.f25322d;
            LqTheme lqTheme = ((yn5) bo5Var).f70104a ? LqTheme.Dark : LqTheme.Light;
            this.f25314a = 3;
            if (c1869h.m8632a(lqTheme, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (bo5Var instanceof ao5) {
            C2000e c2000e = c2010a.f25323e;
            String strMo4589b2 = cmaVar.mo4589b2();
            boolean z3 = ((ao5) bo5Var).f7290a;
            this.f25314a = 4;
            if (c2000e.m8866a(strMo4589b2, z3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (!(bo5Var instanceof zn5)) {
            gm5.m12750e();
            return null;
        }
        C2000e c2000e2 = c2010a.f25324f;
        String strMo4589b3 = cmaVar.mo4589b2();
        boolean z4 = ((zn5) bo5Var).f71797a;
        this.f25314a = 5;
        if (c2000e2.m8866a(strMo4589b3, z4, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
