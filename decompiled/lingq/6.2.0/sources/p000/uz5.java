package p000;

import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uz5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MiniLessonTemplate f64616b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vz5 f64617c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f64618d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f64619e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f64620f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ e16 f64621g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f64622h;

    public /* synthetic */ uz5(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, Set set, String str, ui3 ui3Var, e16 e16Var, int i, int i2) {
        this.f64615a = i2;
        this.f64616b = miniLessonTemplate;
        this.f64617c = vz5Var;
        this.f64618d = set;
        this.f64619e = str;
        this.f64620f = ui3Var;
        this.f64621g = e16Var;
        this.f64622h = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f64615a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f64622h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                rpb.m20742a(this.f64616b, this.f64617c, this.f64618d, this.f64619e, this.f64620f, this.f64621g, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                spb.m21533a(this.f64616b, this.f64617c, this.f64618d, this.f64619e, this.f64620f, this.f64621g, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }
}
