package com.lingq.feature.chat.domain;

import com.lingq.core.data.chat.C1265a;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.pk9;
import p000.rn5;
import p000.si7;
import p000.xfa;
import p000.ym5;
import p000.zw0;

/* JADX INFO: renamed from: com.lingq.feature.chat.domain.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1997b {

    /* JADX INFO: renamed from: a */
    public final zw0 f25210a;

    /* JADX INFO: renamed from: b */
    public final si7 f25211b;

    /* JADX INFO: renamed from: c */
    public final C1265a f25212c;

    public C1997b(zw0 zw0Var, si7 si7Var, C1265a c1265a) {
        zw0Var.getClass();
        si7Var.getClass();
        c1265a.getClass();
        this.f25210a = zw0Var;
        this.f25211b = si7Var;
        this.f25212c = c1265a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[PHI: r13 r15
      0x00c1: PHI (r13v14 java.lang.Boolean) = (r13v13 java.lang.Boolean), (r13v21 java.lang.Boolean) binds: [B:47:0x00be, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r15v13 java.lang.Object) = (r15v12 java.lang.Object), (r15v1 java.lang.Object) binds: [B:47:0x00be, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r3).m7899q(r13, r0) == r1) goto L56;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8860a(String str, ContinuationImpl continuationImpl) throws Throwable {
        FetchLynxPrivacySettingsUseCase$invoke$1 fetchLynxPrivacySettingsUseCase$invoke$1;
        rn5 rn5Var;
        rn5 rn5Var2;
        Boolean bool;
        Boolean bool2;
        boolean zBooleanValue;
        if (continuationImpl instanceof FetchLynxPrivacySettingsUseCase$invoke$1) {
            fetchLynxPrivacySettingsUseCase$invoke$1 = (FetchLynxPrivacySettingsUseCase$invoke$1) continuationImpl;
            int i = fetchLynxPrivacySettingsUseCase$invoke$1.f25167e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = i - Integer.MIN_VALUE;
            } else {
                fetchLynxPrivacySettingsUseCase$invoke$1 = new FetchLynxPrivacySettingsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchLynxPrivacySettingsUseCase$invoke$1 = new FetchLynxPrivacySettingsUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7161k = fetchLynxPrivacySettingsUseCase$invoke$1.f25165c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchLynxPrivacySettingsUseCase$invoke$1.f25167e;
        si7 si7Var = this.f25211b;
        C1265a c1265a = this.f25212c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7161k);
            fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 1;
            objM7161k = ((C1289e) this.f25210a).m7161k(str, fetchLynxPrivacySettingsUseCase$invoke$1);
            if (objM7161k != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM7161k);
        } else {
            if (i2 == 2) {
                bool = fetchLynxPrivacySettingsUseCase$invoke$1.f25164b;
                rn5Var2 = fetchLynxPrivacySettingsUseCase$invoke$1.f25163a;
                AbstractC3193b.m15359b(objM7161k);
                if (((Boolean) objM7161k).booleanValue()) {
                    bool = null;
                }
                if (bool != null) {
                    boolean zBooleanValue2 = bool.booleanValue();
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = rn5Var2;
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = null;
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 3;
                }
                rn5Var = rn5Var2;
                bool2 = rn5Var.f59589b;
                if (bool2 != null) {
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = null;
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = bool2;
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 4;
                    objM7161k = c1265a.m7052b("lynx-privacy-data-improvement", fetchLynxPrivacySettingsUseCase$invoke$1);
                    if (objM7161k != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            }
            if (i2 == 3) {
                rn5Var = fetchLynxPrivacySettingsUseCase$invoke$1.f25163a;
                AbstractC3193b.m15359b(objM7161k);
                bool2 = rn5Var.f59589b;
                if (bool2 != null) {
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = null;
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = bool2;
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 4;
                    objM7161k = c1265a.m7052b("lynx-privacy-data-improvement", fetchLynxPrivacySettingsUseCase$invoke$1);
                    if (objM7161k != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    AbstractC3193b.m15359b(objM7161k);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bool2 = fetchLynxPrivacySettingsUseCase$invoke$1.f25164b;
            AbstractC3193b.m15359b(objM7161k);
        }
        if (((Boolean) objM7161k).booleanValue()) {
            bool2 = null;
        }
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
            fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = null;
            fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = null;
            fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 5;
            if (((C1368a) si7Var).m7891m(zBooleanValue, fetchLynxPrivacySettingsUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        rn5Var = (rn5) pk9.m19381x((ym5) objM7161k);
        if (rn5Var != null) {
            Boolean bool3 = rn5Var.f59588a;
            if (bool3 != null) {
                fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = rn5Var;
                fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = bool3;
                fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 2;
                objM7161k = c1265a.m7052b("lynx-privacy-memory", fetchLynxPrivacySettingsUseCase$invoke$1);
                if (objM7161k != coroutineSingletons) {
                    rn5Var2 = rn5Var;
                    bool = bool3;
                    if (((Boolean) objM7161k).booleanValue()) {
                        bool = null;
                    }
                    if (bool != null) {
                        boolean zBooleanValue3 = bool.booleanValue();
                        fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = rn5Var2;
                        fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = null;
                        fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 3;
                    }
                    rn5Var = rn5Var2;
                    bool2 = rn5Var.f59589b;
                    if (bool2 != null) {
                        fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = null;
                        fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = bool2;
                        fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 4;
                        objM7161k = c1265a.m7052b("lynx-privacy-data-improvement", fetchLynxPrivacySettingsUseCase$invoke$1);
                        if (objM7161k != coroutineSingletons) {
                            if (((Boolean) objM7161k).booleanValue()) {
                                bool2 = null;
                            }
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                                fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = null;
                                fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = null;
                                fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 5;
                                if (((C1368a) si7Var).m7891m(zBooleanValue, fetchLynxPrivacySettingsUseCase$invoke$1) == coroutineSingletons) {
                                }
                            }
                        }
                    }
                }
            } else {
                bool2 = rn5Var.f59589b;
                if (bool2 != null) {
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = null;
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = bool2;
                    fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 4;
                    objM7161k = c1265a.m7052b("lynx-privacy-data-improvement", fetchLynxPrivacySettingsUseCase$invoke$1);
                    if (objM7161k != coroutineSingletons) {
                        if (((Boolean) objM7161k).booleanValue()) {
                            bool2 = null;
                        }
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                            fetchLynxPrivacySettingsUseCase$invoke$1.f25163a = null;
                            fetchLynxPrivacySettingsUseCase$invoke$1.f25164b = null;
                            fetchLynxPrivacySettingsUseCase$invoke$1.f25167e = 5;
                            if (((C1368a) si7Var).m7891m(zBooleanValue, fetchLynxPrivacySettingsUseCase$invoke$1) == coroutineSingletons) {
                            }
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
