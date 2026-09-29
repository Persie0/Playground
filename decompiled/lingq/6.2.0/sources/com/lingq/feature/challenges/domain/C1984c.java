package com.lingq.feature.challenges.domain;

import com.lingq.core.data.repository.C1288d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ef0;
import p000.gha;
import p000.gm5;
import p000.hha;
import p000.iha;
import p000.or0;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.challenges.domain.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1984c {

    /* JADX INFO: renamed from: a */
    public final or0 f24759a;

    public C1984c(or0 or0Var) {
        or0Var.getClass();
        this.f24759a = or0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r12 == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r12 == r0) goto L61;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8848a(String str, String str2, iha ihaVar, ContinuationImpl continuationImpl) throws Throwable {
        UpdateBookChallengeBookUseCase$invoke$1 updateBookChallengeBookUseCase$invoke$1;
        String str3;
        String str4;
        if (continuationImpl instanceof UpdateBookChallengeBookUseCase$invoke$1) {
            updateBookChallengeBookUseCase$invoke$1 = (UpdateBookChallengeBookUseCase$invoke$1) continuationImpl;
            int i = updateBookChallengeBookUseCase$invoke$1.f24753e;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateBookChallengeBookUseCase$invoke$1.f24753e = i - Integer.MIN_VALUE;
            } else {
                updateBookChallengeBookUseCase$invoke$1 = new UpdateBookChallengeBookUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateBookChallengeBookUseCase$invoke$1 = new UpdateBookChallengeBookUseCase$invoke$1(this, continuationImpl);
        }
        UpdateBookChallengeBookUseCase$invoke$1 updateBookChallengeBookUseCase$invoke$2 = updateBookChallengeBookUseCase$invoke$1;
        Object objM7140g = updateBookChallengeBookUseCase$invoke$2.f24751c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateBookChallengeBookUseCase$invoke$2.f24753e;
        or0 or0Var = this.f24759a;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(objM7140g);
                if (ihaVar instanceof gha) {
                    gha ghaVar = (gha) ihaVar;
                    if (!ghaVar.f40833c) {
                        int i3 = ghaVar.f40831a;
                        updateBookChallengeBookUseCase$invoke$2.f24749a = str;
                        updateBookChallengeBookUseCase$invoke$2.f24750b = str2;
                        updateBookChallengeBookUseCase$invoke$2.f24753e = 1;
                        if (((C1288d) or0Var).m7142i(i3, str, str2, updateBookChallengeBookUseCase$invoke$2) != coroutineSingletons) {
                            updateBookChallengeBookUseCase$invoke$2.f24749a = null;
                            updateBookChallengeBookUseCase$invoke$2.f24750b = null;
                            updateBookChallengeBookUseCase$invoke$2.f24753e = 2;
                            objM7140g = ((C1288d) or0Var).m7140g(str, str2, updateBookChallengeBookUseCase$invoke$2);
                        }
                    } else {
                        boolean z = ghaVar.f40834d;
                        int i4 = ghaVar.f40831a;
                        if (!z) {
                            updateBookChallengeBookUseCase$invoke$2.f24749a = str;
                            updateBookChallengeBookUseCase$invoke$2.f24750b = str2;
                            updateBookChallengeBookUseCase$invoke$2.f24753e = 4;
                            C1288d c1288d = (C1288d) or0Var;
                            c1288d.getClass();
                            Object objM7149p = c1288d.m7149p(str, str2, i4, null, updateBookChallengeBookUseCase$invoke$2);
                            if (objM7149p != coroutineSingletons) {
                                objM7149p = xfa.f68157a;
                            }
                            if (objM7149p != coroutineSingletons) {
                                str3 = str;
                                str4 = str2;
                                updateBookChallengeBookUseCase$invoke$2.f24749a = null;
                                updateBookChallengeBookUseCase$invoke$2.f24750b = null;
                                updateBookChallengeBookUseCase$invoke$2.f24753e = 5;
                                objM7140g = ((C1288d) or0Var).m7140g(str3, str4, updateBookChallengeBookUseCase$invoke$2);
                            }
                        } else {
                            Integer num = ghaVar.f40832b;
                            updateBookChallengeBookUseCase$invoke$2.f24749a = null;
                            updateBookChallengeBookUseCase$invoke$2.f24750b = null;
                            updateBookChallengeBookUseCase$invoke$2.f24753e = 3;
                            Object objM7149p2 = ((C1288d) or0Var).m7149p(str, str2, i4, num, updateBookChallengeBookUseCase$invoke$2);
                            if (objM7149p2 != coroutineSingletons) {
                                return objM7149p2;
                            }
                        }
                    }
                    break;
                } else {
                    if (!(ihaVar instanceof hha)) {
                        gm5.m12750e();
                        return null;
                    }
                    int i5 = ((hha) ihaVar).f42385a;
                    updateBookChallengeBookUseCase$invoke$2.f24749a = null;
                    updateBookChallengeBookUseCase$invoke$2.f24750b = null;
                    updateBookChallengeBookUseCase$invoke$2.f24753e = 6;
                    Object objM7147n = ((C1288d) or0Var).m7147n(i5, str, str2, updateBookChallengeBookUseCase$invoke$2);
                    if (objM7147n != coroutineSingletons) {
                        return objM7147n;
                    }
                }
                return coroutineSingletons;
            case 1:
                str2 = updateBookChallengeBookUseCase$invoke$2.f24750b;
                str = updateBookChallengeBookUseCase$invoke$2.f24749a;
                AbstractC3193b.m15359b(objM7140g);
                updateBookChallengeBookUseCase$invoke$2.f24749a = null;
                updateBookChallengeBookUseCase$invoke$2.f24750b = null;
                updateBookChallengeBookUseCase$invoke$2.f24753e = 2;
                objM7140g = ((C1288d) or0Var).m7140g(str, str2, updateBookChallengeBookUseCase$invoke$2);
                break;
            case 2:
                AbstractC3193b.m15359b(objM7140g);
                ef0 ef0Var = (ef0) objM7140g;
                return ef0Var == null ? new ef0() : ef0Var;
            case 3:
                AbstractC3193b.m15359b(objM7140g);
                return objM7140g;
            case 4:
                str4 = updateBookChallengeBookUseCase$invoke$2.f24750b;
                str3 = updateBookChallengeBookUseCase$invoke$2.f24749a;
                AbstractC3193b.m15359b(objM7140g);
                updateBookChallengeBookUseCase$invoke$2.f24749a = null;
                updateBookChallengeBookUseCase$invoke$2.f24750b = null;
                updateBookChallengeBookUseCase$invoke$2.f24753e = 5;
                objM7140g = ((C1288d) or0Var).m7140g(str3, str4, updateBookChallengeBookUseCase$invoke$2);
                break;
            case 5:
                AbstractC3193b.m15359b(objM7140g);
                ef0 ef0Var2 = (ef0) objM7140g;
                return ef0Var2 == null ? new ef0() : ef0Var2;
            case 6:
                AbstractC3193b.m15359b(objM7140g);
                return objM7140g;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
