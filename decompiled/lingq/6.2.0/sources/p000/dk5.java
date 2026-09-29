package p000;

import com.lingq.core.data.profile.C1267a;
import com.lingq.feature.onboarding.domain.LoginAuthType;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class dk5 {

    /* JADX INFO: renamed from: a */
    public final km7 f35743a;

    public dk5(km7 km7Var, int i) {
        km7Var.getClass();
        switch (i) {
            case 1:
                this.f35743a = km7Var;
                break;
            default:
                this.f35743a = km7Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m10441a(String str, String str2, String str3, LoginAuthType loginAuthType, SuspendLambda suspendLambda) {
        int length = str.length();
        uj5 uj5Var = uj5.f63990a;
        if ((length == 0 || str2.length() == 0) && loginAuthType == LoginAuthType.EMAIL) {
            return new um5(uj5Var);
        }
        if (str3.length() == 0 && loginAuthType != LoginAuthType.EMAIL) {
            return new um5(uj5Var);
        }
        int i = ck5.f10191a[loginAuthType.ordinal()];
        km7 km7Var = this.f35743a;
        if (i == 1) {
            return ((C1267a) km7Var).m7077f(str3, suspendLambda);
        }
        if (i == 2) {
            return ((C1267a) km7Var).m7078g(str3, suspendLambda);
        }
        if (i == 3) {
            return ((C1267a) km7Var).m7076e(str, str2, suspendLambda);
        }
        if (i == 4) {
            return ((C1267a) km7Var).m7079h(str3, suspendLambda);
        }
        gm5.m12750e();
        return null;
    }
}
