package p000;

import com.lingq.feature.onboarding.auth.registration.RegistrationField;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jw6 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46316a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f46317b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f46318c;

    public /* synthetic */ jw6(t66 t66Var, zi3 zi3Var, int i) {
        this.f46316a = i;
        this.f46317b = t66Var;
        this.f46318c = zi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f46316a;
        xfa xfaVar = xfa.f68157a;
        zi3 zi3Var = this.f46318c;
        t66 t66Var = this.f46317b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                t66Var.setValue(str);
                zi3Var.invoke(RegistrationField.Email, t66Var.getValue());
                break;
            default:
                str.getClass();
                t66Var.setValue(str);
                zi3Var.invoke(RegistrationField.Username, t66Var.getValue());
                break;
        }
        return xfaVar;
    }
}
