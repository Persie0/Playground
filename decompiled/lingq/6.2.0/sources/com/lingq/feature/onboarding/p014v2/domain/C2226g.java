package com.lingq.feature.onboarding.p014v2.domain;

import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.i48;
import p000.j48;
import p000.k48;
import p000.km7;
import p000.pk9;
import p000.rna;
import p000.sna;
import p000.tna;
import p000.xm5;
import p000.ym5;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.domain.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2226g {

    /* JADX INFO: renamed from: a */
    public final km7 f27482a;

    public C2226g(km7 km7Var) {
        km7Var.getClass();
        this.f27482a = km7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9179a(String str, ContinuationImpl continuationImpl) throws Throwable {
        ValidateRegistrationFieldsUseCase$validateEmail$1 validateRegistrationFieldsUseCase$validateEmail$1;
        if (continuationImpl instanceof ValidateRegistrationFieldsUseCase$validateEmail$1) {
            validateRegistrationFieldsUseCase$validateEmail$1 = (ValidateRegistrationFieldsUseCase$validateEmail$1) continuationImpl;
            int i = validateRegistrationFieldsUseCase$validateEmail$1.f27461c;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateRegistrationFieldsUseCase$validateEmail$1.f27461c = i - Integer.MIN_VALUE;
            } else {
                validateRegistrationFieldsUseCase$validateEmail$1 = new ValidateRegistrationFieldsUseCase$validateEmail$1(this, continuationImpl);
            }
        } else {
            validateRegistrationFieldsUseCase$validateEmail$1 = new ValidateRegistrationFieldsUseCase$validateEmail$1(this, continuationImpl);
        }
        Object objM7089r = validateRegistrationFieldsUseCase$validateEmail$1.f27459a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateRegistrationFieldsUseCase$validateEmail$1.f27461c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7089r);
            validateRegistrationFieldsUseCase$validateEmail$1.f27461c = 1;
            objM7089r = ((C1267a) this.f27482a).m7089r(null, str, validateRegistrationFieldsUseCase$validateEmail$1);
            if (objM7089r == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7089r);
        }
        ym5 ym5Var = (ym5) objM7089r;
        ym5Var.getClass();
        if (!(ym5Var instanceof xm5)) {
            k48 k48Var = (k48) pk9.m19373k(ym5Var);
            if (k48Var instanceof i48) {
                i48 i48Var = (i48) k48Var;
                if (i48Var.m13654a() != 0) {
                    return new rna(i48Var.m13654a());
                }
            }
            if (k48Var instanceof j48) {
                return sna.f61071a;
            }
        }
        return tna.f62607a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m9180b(String str, ContinuationImpl continuationImpl) throws Throwable {
        ValidateRegistrationFieldsUseCase$validateUsername$1 validateRegistrationFieldsUseCase$validateUsername$1;
        if (continuationImpl instanceof ValidateRegistrationFieldsUseCase$validateUsername$1) {
            validateRegistrationFieldsUseCase$validateUsername$1 = (ValidateRegistrationFieldsUseCase$validateUsername$1) continuationImpl;
            int i = validateRegistrationFieldsUseCase$validateUsername$1.f27464c;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateRegistrationFieldsUseCase$validateUsername$1.f27464c = i - Integer.MIN_VALUE;
            } else {
                validateRegistrationFieldsUseCase$validateUsername$1 = new ValidateRegistrationFieldsUseCase$validateUsername$1(this, continuationImpl);
            }
        } else {
            validateRegistrationFieldsUseCase$validateUsername$1 = new ValidateRegistrationFieldsUseCase$validateUsername$1(this, continuationImpl);
        }
        Object objM7089r = validateRegistrationFieldsUseCase$validateUsername$1.f27462a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateRegistrationFieldsUseCase$validateUsername$1.f27464c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7089r);
            validateRegistrationFieldsUseCase$validateUsername$1.f27464c = 1;
            objM7089r = ((C1267a) this.f27482a).m7089r(str, null, validateRegistrationFieldsUseCase$validateUsername$1);
            if (objM7089r == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7089r);
        }
        ym5 ym5Var = (ym5) objM7089r;
        ym5Var.getClass();
        if (!(ym5Var instanceof xm5)) {
            k48 k48Var = (k48) pk9.m19373k(ym5Var);
            if (k48Var instanceof i48) {
                i48 i48Var = (i48) k48Var;
                if (i48Var.m13655b() != 0) {
                    return new rna(i48Var.m13655b());
                }
            }
            if (k48Var instanceof j48) {
                return sna.f61071a;
            }
        }
        return tna.f62607a;
    }
}
