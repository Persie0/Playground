package p000;

import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import com.lingq.feature.playlist.AbstractC2253c;
import java.util.List;

/* JADX INFO: renamed from: ej */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2966ej implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37304a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f37305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e16 f37306c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f37307d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f37308e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f37309f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f37310g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f37311h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f37312i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f37313j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f37314k;

    public /* synthetic */ C2966ej(zi3 zi3Var, ui3 ui3Var, e16 e16Var, zi3 zi3Var2, zi3 zi3Var3, boolean z, kw5 kw5Var, t17 t17Var, int i, int i2) {
        this.f37309f = zi3Var;
        this.f37312i = ui3Var;
        this.f37306c = e16Var;
        this.f37310g = zi3Var2;
        this.f37311h = zi3Var3;
        this.f37307d = z;
        this.f37313j = kw5Var;
        this.f37314k = t17Var;
        this.f37305b = i;
        this.f37308e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f37304a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f37314k;
        Object obj4 = this.f37312i;
        Object obj5 = this.f37313j;
        Object obj6 = this.f37311h;
        Object obj7 = this.f37310g;
        Object obj8 = this.f37309f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f37305b | 1);
                AbstractC3003fj.m11886b((zi3) obj8, (ui3) obj4, this.f37306c, (zi3) obj7, (zi3) obj6, this.f37307d, (kw5) obj5, (t17) obj3, (ye1) obj, iM19383z, this.f37308e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(this.f37308e | 1);
                sz5.m21791b((MiniLessonTemplate) obj8, (vz5) obj7, (String) obj6, (String) obj4, (List) obj5, this.f37305b, (vi3) obj3, this.f37306c, this.f37307d, (ye1) obj, iM19383z2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(1);
                AbstractC2253c.m9223i(this.f37306c, (String) obj8, this.f37307d, (ac7) obj7, this.f37305b, (String) obj6, (pbb) obj5, (ui3) obj4, (vi3) obj3, (ye1) obj, iM19383z3, this.f37308e);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C2966ej(e16 e16Var, String str, boolean z, ac7 ac7Var, int i, String str2, pbb pbbVar, ui3 ui3Var, vi3 vi3Var, int i2, int i3) {
        this.f37306c = e16Var;
        this.f37309f = str;
        this.f37307d = z;
        this.f37310g = ac7Var;
        this.f37305b = i;
        this.f37311h = str2;
        this.f37313j = pbbVar;
        this.f37312i = ui3Var;
        this.f37314k = vi3Var;
        this.f37308e = i3;
    }

    public /* synthetic */ C2966ej(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, String str, String str2, List list, int i, vi3 vi3Var, e16 e16Var, boolean z, int i2) {
        this.f37309f = miniLessonTemplate;
        this.f37310g = vz5Var;
        this.f37311h = str;
        this.f37312i = str2;
        this.f37313j = list;
        this.f37305b = i;
        this.f37314k = vi3Var;
        this.f37306c = e16Var;
        this.f37307d = z;
        this.f37308e = i2;
    }
}
