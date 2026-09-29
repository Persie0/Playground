package com.lingq.feature.chat.domain;

import com.lingq.core.data.chat.C1265a;
import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.si7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.chat.domain.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2000e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25216a;

    /* JADX INFO: renamed from: b */
    public final si7 f25217b;

    /* JADX INFO: renamed from: c */
    public final C1265a f25218c;

    public C2000e(si7 si7Var, C1265a c1265a, int i) {
        this.f25216a = i;
        si7Var.getClass();
        c1265a.getClass();
        switch (i) {
            case 1:
                this.f25217b = si7Var;
                this.f25218c = c1265a;
                break;
            default:
                this.f25217b = si7Var;
                this.f25218c = c1265a;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX INFO: renamed from: a */
    public final Object m8866a(String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        SetLynxDataImprovementOptInUseCase$invoke$1 setLynxDataImprovementOptInUseCase$invoke$1;
        SetLynxMemoryEnabledUseCase$invoke$1 setLynxMemoryEnabledUseCase$invoke$1;
        int i = this.f25216a;
        xfa xfaVar = xfa.f68157a;
        C1265a c1265a = this.f25218c;
        si7 si7Var = this.f25217b;
        switch (i) {
            case 0:
                if (continuationImpl instanceof SetLynxDataImprovementOptInUseCase$invoke$1) {
                    setLynxDataImprovementOptInUseCase$invoke$1 = (SetLynxDataImprovementOptInUseCase$invoke$1) continuationImpl;
                    int i2 = setLynxDataImprovementOptInUseCase$invoke$1.f25199e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        setLynxDataImprovementOptInUseCase$invoke$1.f25199e = i2 - Integer.MIN_VALUE;
                    } else {
                        setLynxDataImprovementOptInUseCase$invoke$1 = new SetLynxDataImprovementOptInUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    setLynxDataImprovementOptInUseCase$invoke$1 = new SetLynxDataImprovementOptInUseCase$invoke$1(this, continuationImpl);
                }
                Object obj = setLynxDataImprovementOptInUseCase$invoke$1.f25197c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = setLynxDataImprovementOptInUseCase$invoke$1.f25199e;
                if (i3 == 0) {
                    AbstractC3193b.m15359b(obj);
                    setLynxDataImprovementOptInUseCase$invoke$1.f25195a = str;
                    setLynxDataImprovementOptInUseCase$invoke$1.f25196b = z;
                    setLynxDataImprovementOptInUseCase$invoke$1.f25199e = 1;
                    if (((C1368a) si7Var).m7891m(z, setLynxDataImprovementOptInUseCase$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = setLynxDataImprovementOptInUseCase$invoke$1.f25196b;
                    str = setLynxDataImprovementOptInUseCase$invoke$1.f25195a;
                    AbstractC3193b.m15359b(obj);
                }
                c1265a.getClass();
                str.getClass();
                c1265a.m7051a("lynx-privacy-data-improvement", "data_improvement", str, z);
                return xfaVar;
            default:
                if (continuationImpl instanceof SetLynxMemoryEnabledUseCase$invoke$1) {
                    setLynxMemoryEnabledUseCase$invoke$1 = (SetLynxMemoryEnabledUseCase$invoke$1) continuationImpl;
                    int i4 = setLynxMemoryEnabledUseCase$invoke$1.f25204e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        setLynxMemoryEnabledUseCase$invoke$1.f25204e = i4 - Integer.MIN_VALUE;
                    } else {
                        setLynxMemoryEnabledUseCase$invoke$1 = new SetLynxMemoryEnabledUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    setLynxMemoryEnabledUseCase$invoke$1 = new SetLynxMemoryEnabledUseCase$invoke$1(this, continuationImpl);
                }
                Object obj2 = setLynxMemoryEnabledUseCase$invoke$1.f25202c;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = setLynxMemoryEnabledUseCase$invoke$1.f25204e;
                if (i5 == 0) {
                    AbstractC3193b.m15359b(obj2);
                    setLynxMemoryEnabledUseCase$invoke$1.f25200a = str;
                    setLynxMemoryEnabledUseCase$invoke$1.f25201b = z;
                    setLynxMemoryEnabledUseCase$invoke$1.f25204e = 1;
                    if (((C1368a) si7Var).m7899q(z, setLynxMemoryEnabledUseCase$invoke$1) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i5 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = setLynxMemoryEnabledUseCase$invoke$1.f25201b;
                    str = setLynxMemoryEnabledUseCase$invoke$1.f25200a;
                    AbstractC3193b.m15359b(obj2);
                }
                c1265a.getClass();
                str.getClass();
                c1265a.m7051a("lynx-privacy-memory", "memory", str, z);
                return xfaVar;
        }
    }
}
