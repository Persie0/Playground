package p000;

import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.core.settings.theme.ThemeSettingsTab;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dz9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36466a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f36467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f36468c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f36469d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f36470e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f36471f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f36472g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f36473h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f36474i;

    public /* synthetic */ dz9(String str, boolean z, String str2, int i, int i2, String str3, String str4, boolean z2) {
        this.f36471f = str;
        this.f36467b = z;
        this.f36468c = z2;
        this.f36472g = str2;
        this.f36473h = str3;
        this.f36474i = str4;
        this.f36469d = i;
        this.f36470e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f36466a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f36469d;
        Object obj3 = this.f36474i;
        Object obj4 = this.f36473h;
        Object obj5 = this.f36472g;
        Object obj6 = this.f36471f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC1881a.m8679r(this.f36467b, (nz9) obj6, (vi3) obj5, (ThemeSettingsTab) obj3, (vi3) obj4, this.f36468c, (ye1) obj, iM19383z, this.f36470e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                AbstractC1839a.m8543u((String) obj6, this.f36467b, this.f36468c, (String) obj5, (String) obj4, (String) obj3, (ye1) obj, iM19383z2, this.f36470e);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ dz9(boolean z, nz9 nz9Var, vi3 vi3Var, ThemeSettingsTab themeSettingsTab, vi3 vi3Var2, boolean z2, int i, int i2) {
        this.f36467b = z;
        this.f36471f = nz9Var;
        this.f36472g = vi3Var;
        this.f36474i = themeSettingsTab;
        this.f36473h = vi3Var2;
        this.f36468c = z2;
        this.f36469d = i;
        this.f36470e = i2;
    }
}
