package p000;

import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import com.lingq.core.domain.model.language.DictionaryData;

/* JADX INFO: renamed from: qd */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3493qd implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f57600c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f57601d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f57602e;

    public /* synthetic */ C3493qd(e16 e16Var, ui3 ui3Var, boolean z, int i) {
        this.f57598a = 1;
        this.f57602e = e16Var;
        this.f57599b = ui3Var;
        this.f57600c = z;
        this.f57601d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57598a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f57601d;
        Object obj3 = this.f57602e;
        Object obj4 = this.f57599b;
        boolean z = this.f57600c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3607td.m21957a(z, (ui3) obj4, (C3143jd) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bq1.m4046V((e16) obj3, (ui3) obj4, z, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                q9d.m19832d((n56) obj4, z, (e16) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                v9d.m23202d((String) obj4, z, (vi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                bbd.m3599b((DictionaryData) obj4, z, (vi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC3584sr.m21635m(z, (ResolvedTextDirection) obj4, (C0205f) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3493qd(Object obj, boolean z, Object obj2, int i, int i2) {
        this.f57598a = i2;
        this.f57599b = obj;
        this.f57600c = z;
        this.f57602e = obj2;
        this.f57601d = i;
    }

    public /* synthetic */ C3493qd(boolean z, ui3 ui3Var, C3143jd c3143jd, int i) {
        this.f57598a = 0;
        this.f57600c = z;
        this.f57599b = ui3Var;
        this.f57602e = c3143jd;
        this.f57601d = i;
    }

    public /* synthetic */ C3493qd(boolean z, ResolvedTextDirection resolvedTextDirection, C0205f c0205f, int i) {
        this.f57598a = 5;
        this.f57600c = z;
        this.f57599b = resolvedTextDirection;
        this.f57602e = c0205f;
        this.f57601d = i;
    }
}
