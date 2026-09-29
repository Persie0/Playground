package p000;

import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tz5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63137a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MiniLessonTemplate f63138b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vz5 f63139c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f63140d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f63141e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f63142f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f63143g;

    public /* synthetic */ tz5(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, Set set, String str, ui3 ui3Var, int i, int i2) {
        this.f63137a = i2;
        this.f63138b = miniLessonTemplate;
        this.f63139c = vz5Var;
        this.f63140d = set;
        this.f63141e = str;
        this.f63142f = ui3Var;
        this.f63143g = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f63137a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f63143g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                rpb.m20742a(this.f63138b, this.f63139c, this.f63140d, this.f63141e, this.f63142f, b16.f7762a, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                spb.m21533a(this.f63138b, this.f63139c, this.f63140d, this.f63141e, this.f63142f, b16.f7762a, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }
}
