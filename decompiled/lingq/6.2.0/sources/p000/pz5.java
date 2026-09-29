package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import com.lingq.feature.playlist.AbstractC2253c;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pz5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57031a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f57032b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f57033c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f57034d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f57035e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f57036f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f57037g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f57038h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f57039i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f57040j;

    public /* synthetic */ pz5(ze7 ze7Var, tb7 tb7Var, String str, vi3 vi3Var, vi3 vi3Var2, e16 e16Var, boolean z, int i, int i2) {
        this.f57037g = ze7Var;
        this.f57038h = tb7Var;
        this.f57032b = str;
        this.f57040j = vi3Var;
        this.f57034d = vi3Var2;
        this.f57039i = e16Var;
        this.f57033c = z;
        this.f57035e = i;
        this.f57036f = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57031a;
        int i2 = this.f57035e;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f57039i;
        Object obj4 = this.f57034d;
        Object obj5 = this.f57040j;
        Object obj6 = this.f57038h;
        Object obj7 = this.f57037g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f57036f | 1);
                sz5.m21791b((MiniLessonTemplate) obj7, (vz5) obj6, this.f57032b, (String) obj4, (List) obj3, this.f57035e, (vi3) obj5, b16.f7762a, this.f57033c, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                gxb.m12966b(this.f57032b, this.f57033c, (String) obj4, (ui3) obj7, (e16) obj6, (String) obj3, (C0282a) obj5, (ye1) obj, iM19383z2, this.f57036f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                txb.m22336b(this.f57032b, this.f57033c, (ui3) obj7, (y27) obj6, (o39) obj4, (jl1) obj3, (e16) obj5, (ye1) obj, iM19383z3, this.f57036f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                AbstractC2253c.m9231q((ze7) obj7, (tb7) obj6, this.f57032b, (vi3) obj5, (vi3) obj4, (e16) obj3, this.f57033c, (ye1) obj, iM19383z4, this.f57036f);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ pz5(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, String str, String str2, List list, int i, vi3 vi3Var, boolean z, int i2) {
        this.f57037g = miniLessonTemplate;
        this.f57038h = vz5Var;
        this.f57032b = str;
        this.f57034d = str2;
        this.f57039i = list;
        this.f57035e = i;
        this.f57040j = vi3Var;
        this.f57033c = z;
        this.f57036f = i2;
    }

    public /* synthetic */ pz5(String str, boolean z, ui3 ui3Var, y27 y27Var, o39 o39Var, jl1 jl1Var, e16 e16Var, int i, int i2) {
        this.f57032b = str;
        this.f57033c = z;
        this.f57037g = ui3Var;
        this.f57038h = y27Var;
        this.f57034d = o39Var;
        this.f57039i = jl1Var;
        this.f57040j = e16Var;
        this.f57035e = i;
        this.f57036f = i2;
    }

    public /* synthetic */ pz5(String str, boolean z, String str2, ui3 ui3Var, e16 e16Var, String str3, C0282a c0282a, int i, int i2) {
        this.f57032b = str;
        this.f57033c = z;
        this.f57034d = str2;
        this.f57037g = ui3Var;
        this.f57038h = e16Var;
        this.f57039i = str3;
        this.f57040j = c0282a;
        this.f57035e = i;
        this.f57036f = i2;
    }
}
