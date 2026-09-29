package p000;

import androidx.compose.material3.C0252k0;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import com.lingq.feature.reader.shared.p018ui.components.AbstractC2508a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a65 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f283b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f284c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f285d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f286e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f287f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f288g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f289h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f290i;

    public /* synthetic */ a65(e16 e16Var, du7 du7Var, boolean z, int i, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var, int i2) {
        this.f287f = e16Var;
        this.f288g = du7Var;
        this.f283b = z;
        this.f285d = i;
        this.f289h = vi3Var;
        this.f290i = vi3Var2;
        this.f284c = ui3Var;
        this.f286e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f282a;
        int i2 = this.f285d;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f284c;
        Object obj4 = this.f287f;
        Object obj5 = this.f290i;
        Object obj6 = this.f289h;
        Object obj7 = this.f288g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f286e | 1);
                AbstractC2508a.m9431a((e16) obj4, (du7) obj7, this.f283b, this.f285d, (vi3) obj6, (vi3) obj5, (ui3) obj3, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                gxb.m12968d((String) obj4, this.f283b, (String) obj7, (ui3) obj3, (String) obj6, (C0282a) obj5, (ye1) obj, iM19383z2, this.f286e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                u1d.m22390a(this.f283b, (e28) obj4, (String) obj7, (vi3) obj6, (vi3) obj5, (ui3) obj3, (ye1) obj, iM19383z3, this.f286e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                AbstractC1881a.m8663b((nz9) obj4, (vi3) obj6, (ThemeSettingsTab) obj7, (vi3) obj5, this.f283b, (n4b) obj3, (ye1) obj, iM19383z4, this.f286e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z5 = pk9.m19383z(i2 | 1);
                s6a.m21131b((ph7) obj7, (C0282a) obj6, (C0252k0) obj5, (e16) obj4, this.f283b, (zi3) obj3, (ye1) obj, iM19383z5, this.f286e);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ a65(ph7 ph7Var, C0282a c0282a, C0252k0 c0252k0, e16 e16Var, boolean z, zi3 zi3Var, int i, int i2) {
        this.f288g = ph7Var;
        this.f289h = c0282a;
        this.f290i = c0252k0;
        this.f287f = e16Var;
        this.f283b = z;
        this.f284c = zi3Var;
        this.f285d = i;
        this.f286e = i2;
    }

    public /* synthetic */ a65(nz9 nz9Var, vi3 vi3Var, ThemeSettingsTab themeSettingsTab, vi3 vi3Var2, boolean z, n4b n4bVar, int i, int i2) {
        this.f287f = nz9Var;
        this.f289h = vi3Var;
        this.f288g = themeSettingsTab;
        this.f290i = vi3Var2;
        this.f283b = z;
        this.f284c = n4bVar;
        this.f285d = i;
        this.f286e = i2;
    }

    public /* synthetic */ a65(String str, boolean z, String str2, ui3 ui3Var, String str3, C0282a c0282a, int i, int i2) {
        this.f287f = str;
        this.f283b = z;
        this.f288g = str2;
        this.f284c = ui3Var;
        this.f289h = str3;
        this.f290i = c0282a;
        this.f285d = i;
        this.f286e = i2;
    }

    public /* synthetic */ a65(boolean z, e28 e28Var, String str, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var, int i, int i2) {
        this.f283b = z;
        this.f287f = e28Var;
        this.f288g = str;
        this.f289h = vi3Var;
        this.f290i = vi3Var2;
        this.f284c = ui3Var;
        this.f285d = i;
        this.f286e = i2;
    }
}
