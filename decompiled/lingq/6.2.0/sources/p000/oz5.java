package p000;

import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oz5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55323a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MiniLessonTemplate f55324b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vz5 f55325c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f55326d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f55327e;

    public /* synthetic */ oz5(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, List list, String str, int i) {
        this.f55323a = i;
        this.f55324b = miniLessonTemplate;
        this.f55325c = vz5Var;
        this.f55326d = list;
        this.f55327e = str;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f55323a;
        xfa xfaVar = xfa.f68157a;
        MiniLessonTemplate miniLessonTemplate = this.f55324b;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    sz5.m21793d(0, tj3Var, this.f55325c, miniLessonTemplate.f27418c, this.f55327e, this.f55326d);
                }
                break;
            default:
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    sz5.m21793d(0, tj3Var2, this.f55325c, miniLessonTemplate.f27418c, this.f55327e, this.f55326d);
                }
                break;
        }
        return xfaVar;
    }
}
