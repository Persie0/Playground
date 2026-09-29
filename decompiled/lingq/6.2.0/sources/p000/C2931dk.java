package p000;

import androidx.compose.material3.internal.ripple.AbstractC0248b;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: dk */
/* JADX INFO: loaded from: classes.dex */
public final class C2931dk extends AbstractC0248b {

    /* JADX INFO: renamed from: Y */
    public dh8 f35738Y;

    /* JADX INFO: renamed from: Z */
    public eh8 f35739Z;

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() throws IllegalAccessException {
        dh8 dh8Var = this.f35738Y;
        if (dh8Var != null) {
            this.f35739Z = null;
            AbstractC3489q9.m19789s(this);
            fs6 fs6Var = dh8Var.f35662d;
            eh8 eh8Var = (eh8) ((LinkedHashMap) fs6Var.f39590b).get(this);
            if (eh8Var != null) {
                eh8Var.m11153c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) fs6Var.f39590b;
                eh8 eh8Var2 = (eh8) linkedHashMap.get(this);
                if (eh8Var2 != null) {
                }
                linkedHashMap.remove(this);
                dh8Var.f35661c.add(eh8Var);
            }
        }
    }
}
