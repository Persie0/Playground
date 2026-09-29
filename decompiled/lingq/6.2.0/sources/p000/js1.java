package p000;

import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;
import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class js1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f46056b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f46057c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f46058d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f46059e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f46060f;

    public /* synthetic */ js1(f5a f5aVar, boolean z, vi3 vi3Var, int i, int i2) {
        this.f46055a = 1;
        this.f46059e = f5aVar;
        this.f46056b = z;
        this.f46060f = vi3Var;
        this.f46057c = i;
        this.f46058d = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f46055a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f46057c;
        Object obj3 = this.f46060f;
        Object obj4 = this.f46059e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                q9d.m19829a((List) obj4, (e16) obj3, this.f46056b, (ye1) obj, iM19383z, this.f46058d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                bbd.m3598a((f5a) obj4, this.f46056b, (vi3) obj3, (ye1) obj, iM19383z2, this.f46058d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                AbstractC2228a.m9183c(this.f46056b, (ui3) obj4, (e16) obj3, (ye1) obj, iM19383z3, this.f46058d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                AbstractC2558b.m9476i((mn5) obj4, (C3419on) obj3, this.f46056b, (ye1) obj, iM19383z4, this.f46058d);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ js1(Object obj, Object obj2, boolean z, int i, int i2, int i3) {
        this.f46055a = i3;
        this.f46059e = obj;
        this.f46060f = obj2;
        this.f46056b = z;
        this.f46057c = i;
        this.f46058d = i2;
    }

    public /* synthetic */ js1(boolean z, ui3 ui3Var, e16 e16Var, int i, int i2) {
        this.f46055a = 2;
        this.f46056b = z;
        this.f46059e = ui3Var;
        this.f46060f = e16Var;
        this.f46057c = i;
        this.f46058d = i2;
    }
}
