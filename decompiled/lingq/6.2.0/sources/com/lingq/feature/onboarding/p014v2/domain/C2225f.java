package com.lingq.feature.onboarding.p014v2.domain;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$RegistrationMethod;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.domain.model.LearningLevel;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.joda.time.DateTime;
import p000.C3386nv;
import p000.C3509qs;
import p000.c48;
import p000.cl9;
import p000.cx6;
import p000.d48;
import p000.e48;
import p000.g9a;
import p000.hm5;
import p000.hy3;
import p000.km7;
import p000.ob1;
import p000.qw4;
import p000.si7;
import p000.u91;
import p000.xm5;
import p000.ym5;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.domain.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2225f {

    /* JADX INFO: renamed from: a */
    public final km7 f27479a;

    /* JADX INFO: renamed from: b */
    public final hm5 f27480b;

    /* JADX INFO: renamed from: c */
    public final ob1 f27481c;

    public C2225f(km7 km7Var, si7 si7Var, hm5 hm5Var, C3509qs c3509qs, ob1 ob1Var, int i) {
        km7Var.getClass();
        si7Var.getClass();
        hm5Var.getClass();
        c3509qs.getClass();
        ob1Var.getClass();
        switch (i) {
            case 1:
                this.f27479a = km7Var;
                this.f27480b = hm5Var;
                this.f27481c = ob1Var;
                break;
            default:
                this.f27479a = km7Var;
                this.f27480b = hm5Var;
                this.f27481c = ob1Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0117, code lost:
    
        if (r1 == r0) goto L39;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m9174a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ContinuationImpl continuationImpl) throws Throwable {
        RegisterUserUseCase$invoke$1 registerUserUseCase$invoke$1;
        km7 km7Var;
        CoroutineSingletons coroutineSingletons;
        RegisterUserUseCase$invoke$1 registerUserUseCase$invoke$2;
        String str9;
        String str10;
        Object obj;
        String str11;
        if (continuationImpl instanceof RegisterUserUseCase$invoke$1) {
            registerUserUseCase$invoke$1 = (RegisterUserUseCase$invoke$1) continuationImpl;
            int i = registerUserUseCase$invoke$1.f27452f;
            if ((i & Integer.MIN_VALUE) != 0) {
                registerUserUseCase$invoke$1.f27452f = i - Integer.MIN_VALUE;
            } else {
                registerUserUseCase$invoke$1 = new RegisterUserUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            registerUserUseCase$invoke$1 = new RegisterUserUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7076e = registerUserUseCase$invoke$1.f27450d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = registerUserUseCase$invoke$1.f27452f;
        km7 km7Var2 = this.f27479a;
        hm5 hm5Var = this.f27480b;
        if (i2 != 0) {
            if (i2 == 1) {
                String str12 = registerUserUseCase$invoke$1.f27449c;
                String str13 = registerUserUseCase$invoke$1.f27448b;
                str9 = registerUserUseCase$invoke$1.f27447a;
                AbstractC3193b.m15359b(objM7076e);
                km7Var = km7Var2;
                str10 = str12;
                coroutineSingletons = coroutineSingletons2;
                str11 = str13;
                registerUserUseCase$invoke$2 = registerUserUseCase$invoke$1;
                obj = objM7076e;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM7076e);
                hm5Var = hm5Var;
            }
            ym5 ym5Var = (ym5) objM7076e;
            ym5Var.getClass();
            if (!(ym5Var instanceof xm5)) {
                return c48.f9484a;
            }
            hm5Var.getClass();
            qw4 qw4Var = LearningLevel.Companion;
            String str14 = cx6.f34683b;
            qw4Var.getClass();
            qw4.m20188a(str14);
            u91.m22596N0(cx6.f34685d, null, null, null, null, 63);
            return e48.f36702a;
        }
        AbstractC3193b.m15359b(objM7076e);
        Bundle bundle = new Bundle();
        bundle.putString("Registration started client", "android");
        bundle.putString("Registration started date", hy3.f43148E.m14766a(new DateTime()));
        bundle.putString("Registration started language", cx6.f34682a);
        bundle.putString("Registration started method", LqAnalyticsValues$RegistrationMethod.Email.getValue());
        ((C1240a) hm5Var).m7025f("Registration started", bundle);
        ob1 ob1Var = this.f27481c;
        String strM17890c = ob1Var.m17890c();
        String str15 = ob1Var.m17890c().equals("Canada") ? "BC" : null;
        Integer numM4844a0 = cl9.m4844a0(str6);
        Integer num = new Integer(numM4844a0 != null ? numM4844a0.intValue() : 1);
        String strM17894h = ob1Var.m17894h();
        String strM17893g = str7 == null ? ob1Var.m17893g() : str7;
        registerUserUseCase$invoke$1.f27447a = str2;
        registerUserUseCase$invoke$1.f27448b = str3;
        registerUserUseCase$invoke$1.f27449c = str5;
        registerUserUseCase$invoke$1.f27452f = 1;
        km7Var = km7Var2;
        RegisterUserUseCase$invoke$1 registerUserUseCase$invoke$3 = registerUserUseCase$invoke$1;
        coroutineSingletons = coroutineSingletons2;
        Object objM7086o = ((C1267a) km7Var2).m7086o(str, str2, str3, str4, strM17890c, str15, num, strM17894h, strM17893g, str5, null, str8, registerUserUseCase$invoke$3);
        registerUserUseCase$invoke$2 = registerUserUseCase$invoke$3;
        if (objM7086o != coroutineSingletons) {
            str9 = str2;
            str10 = str5;
            obj = objM7086o;
            str11 = str3;
        }
        return coroutineSingletons;
        ym5 ym5Var2 = (ym5) obj;
        ym5Var2.getClass();
        if (!(ym5Var2 instanceof xm5)) {
            return new d48("Registration failed. Please try again.");
        }
        registerUserUseCase$invoke$2.f27447a = r9;
        registerUserUseCase$invoke$2.f27448b = 0;
        registerUserUseCase$invoke$2.f27449c = str10;
        registerUserUseCase$invoke$2.f27452f = 2;
        objM7076e = ((C1267a) km7Var).m7076e(str9, str11, registerUserUseCase$invoke$2);
    }

    /* JADX INFO: renamed from: b */
    public void m9175b() {
        this.f27480b.getClass();
        qw4 qw4Var = LearningLevel.Companion;
        String str = cx6.f34683b;
        qw4Var.getClass();
        qw4.m20188a(str);
        u91.m22596N0(cx6.f34685d, null, null, null, null, 63);
    }

    /* JADX INFO: renamed from: c */
    public void m9176c(String str) {
        Bundle bundleM12429f = g9a.m12429f("Registration started client", "android");
        bundleM12429f.putString("Registration started date", hy3.f43148E.m14766a(new DateTime()));
        String str2 = cx6.f34682a;
        bundleM12429f.putString("Registration started language", cx6.f34682a);
        bundleM12429f.putString("Registration started method", str);
        ((C1240a) this.f27480b).m7025f("Registration started", bundleM12429f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public Object m9177d(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        RegisterWithSocialUseCase$withFacebook$1 registerWithSocialUseCase$withFacebook$1;
        int iIntValue;
        int i;
        if (continuationImpl instanceof RegisterWithSocialUseCase$withFacebook$1) {
            registerWithSocialUseCase$withFacebook$1 = (RegisterWithSocialUseCase$withFacebook$1) continuationImpl;
            int i2 = registerWithSocialUseCase$withFacebook$1.f27455c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registerWithSocialUseCase$withFacebook$1.f27455c = i2 - Integer.MIN_VALUE;
            } else {
                registerWithSocialUseCase$withFacebook$1 = new RegisterWithSocialUseCase$withFacebook$1(this, continuationImpl);
            }
        } else {
            registerWithSocialUseCase$withFacebook$1 = new RegisterWithSocialUseCase$withFacebook$1(this, continuationImpl);
        }
        RegisterWithSocialUseCase$withFacebook$1 registerWithSocialUseCase$withFacebook$2 = registerWithSocialUseCase$withFacebook$1;
        Object objM7087p = registerWithSocialUseCase$withFacebook$2.f27453a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = registerWithSocialUseCase$withFacebook$2.f27455c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7087p);
            m9176c(LqAnalyticsValues$RegistrationMethod.Facebook.getValue());
            ob1 ob1Var = this.f27481c;
            String strM17893g = ob1Var.m17893g();
            if (str4 == null) {
                str4 = ob1Var.m17893g();
            }
            String str5 = str4;
            Integer numM4844a0 = cl9.m4844a0(str3);
            if (numM4844a0 != null) {
                iIntValue = numM4844a0.intValue();
                i = 1;
            } else {
                iIntValue = 1;
                i = 1;
            }
            Integer num = new Integer(iIntValue);
            registerWithSocialUseCase$withFacebook$2.f27455c = i;
            objM7087p = ((C1267a) this.f27479a).m7087p(num, str, strM17893g, str5, str2, registerWithSocialUseCase$withFacebook$2);
            if (objM7087p == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7087p);
        }
        ym5 ym5Var = (ym5) objM7087p;
        ym5Var.getClass();
        if (!(ym5Var instanceof xm5)) {
            return new d48("Facebook sign-in failed. Please try again.");
        }
        m9175b();
        return e48.f36702a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public Object m9178e(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        RegisterWithSocialUseCase$withGoogle$1 registerWithSocialUseCase$withGoogle$1;
        int iIntValue;
        int i;
        if (continuationImpl instanceof RegisterWithSocialUseCase$withGoogle$1) {
            registerWithSocialUseCase$withGoogle$1 = (RegisterWithSocialUseCase$withGoogle$1) continuationImpl;
            int i2 = registerWithSocialUseCase$withGoogle$1.f27458c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registerWithSocialUseCase$withGoogle$1.f27458c = i2 - Integer.MIN_VALUE;
            } else {
                registerWithSocialUseCase$withGoogle$1 = new RegisterWithSocialUseCase$withGoogle$1(this, continuationImpl);
            }
        } else {
            registerWithSocialUseCase$withGoogle$1 = new RegisterWithSocialUseCase$withGoogle$1(this, continuationImpl);
        }
        RegisterWithSocialUseCase$withGoogle$1 registerWithSocialUseCase$withGoogle$2 = registerWithSocialUseCase$withGoogle$1;
        Object objM7088q = registerWithSocialUseCase$withGoogle$2.f27456a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = registerWithSocialUseCase$withGoogle$2.f27458c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7088q);
            m9176c(LqAnalyticsValues$RegistrationMethod.Google.getValue());
            ob1 ob1Var = this.f27481c;
            String strM17893g = ob1Var.m17893g();
            if (str4 == null) {
                str4 = ob1Var.m17893g();
            }
            String str5 = str4;
            Integer numM4844a0 = cl9.m4844a0(str3);
            if (numM4844a0 != null) {
                iIntValue = numM4844a0.intValue();
                i = 1;
            } else {
                iIntValue = 1;
                i = 1;
            }
            Integer num = new Integer(iIntValue);
            registerWithSocialUseCase$withGoogle$2.f27458c = i;
            objM7088q = ((C1267a) this.f27479a).m7088q(num, str, strM17893g, str5, str2, registerWithSocialUseCase$withGoogle$2);
            if (objM7088q == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7088q);
        }
        ym5 ym5Var = (ym5) objM7088q;
        ym5Var.getClass();
        if (!(ym5Var instanceof xm5)) {
            return new d48("Google sign-in failed. Please try again.");
        }
        m9175b();
        return e48.f36702a;
    }
}
