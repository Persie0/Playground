package p000;

import androidx.compose.material3.C0252k0;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.notification.Notice;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.feature.edit.components.AbstractC2079b;
import com.lingq.feature.library.components.dialogs.AbstractC2142b;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rb0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59009a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f59011c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f59012d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f59013e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f59014f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f59015g;

    public /* synthetic */ rb0(ph7 ph7Var, C0282a c0282a, C0252k0 c0252k0, e16 e16Var, C0282a c0282a2, int i) {
        this.f59009a = 0;
        this.f59012d = ph7Var;
        this.f59013e = c0282a;
        this.f59015g = c0252k0;
        this.f59010b = e16Var;
        this.f59014f = c0282a2;
        this.f59011c = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59009a;
        int i2 = this.f59011c;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f59010b;
        Object obj4 = this.f59015g;
        Object obj5 = this.f59014f;
        Object obj6 = this.f59013e;
        Object obj7 = this.f59012d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m4d.m16628a((ph7) obj7, (C0282a) obj6, (C0252k0) obj4, (e16) obj3, (C0282a) obj5, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                q5d.m19673g((e16) obj3, (t17) obj7, (fr0) obj6, (vi3) obj5, (vi3) obj4, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                fid.m11884a((String) obj7, (lp4) obj6, (vi3) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                sz5.m21792c((MiniLessonTemplate) obj7, (vz5) obj6, (String) obj5, (ui3) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC2142b.m9056a((Notice) obj7, (List) obj6, (vi3) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC2079b.m8993a((String) obj7, (vi3) obj6, (e16) obj3, (String) obj5, (ui3) obj4, (ye1) obj, pk9.m19383z(1), this.f59011c);
                break;
            case 6:
                ((Integer) obj2).getClass();
                h4d.m13054c((hi9) obj7, (LocalDate) obj6, (ui3) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1), this.f59011c);
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8534l((wia) obj7, (ArrayList) obj6, (String) obj5, (t17) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                x9d.m24420c((e16) obj3, (String) obj7, (String) obj6, (String) obj5, (vi3) obj4, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                nad.m17305a((tpa) obj7, (hqa) obj6, (qbb) obj5, (vi3) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ rb0(e16 e16Var, Object obj, Object obj2, Object obj3, vi3 vi3Var, int i, int i2) {
        this.f59009a = i2;
        this.f59010b = e16Var;
        this.f59012d = obj;
        this.f59013e = obj2;
        this.f59014f = obj3;
        this.f59015g = vi3Var;
        this.f59011c = i;
    }

    public /* synthetic */ rb0(hi9 hi9Var, LocalDate localDate, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, int i, int i2) {
        this.f59009a = 6;
        this.f59012d = hi9Var;
        this.f59013e = localDate;
        this.f59014f = ui3Var;
        this.f59015g = ui3Var2;
        this.f59010b = ui3Var3;
        this.f59011c = i2;
    }

    public /* synthetic */ rb0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f59009a = i2;
        this.f59012d = obj;
        this.f59013e = obj2;
        this.f59014f = obj3;
        this.f59015g = obj4;
        this.f59010b = obj5;
        this.f59011c = i;
    }

    public /* synthetic */ rb0(String str, vi3 vi3Var, e16 e16Var, String str2, ui3 ui3Var, int i, int i2) {
        this.f59009a = 5;
        this.f59012d = str;
        this.f59013e = vi3Var;
        this.f59010b = e16Var;
        this.f59014f = str2;
        this.f59015g = ui3Var;
        this.f59011c = i2;
    }
}
