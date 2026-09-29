package p000;

import com.lingq.feature.chat.AbstractC2005i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rx0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59990a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f59991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f59992c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f59993d;

    public /* synthetic */ rx0(int i, long j, String str, int i2) {
        this.f59991b = i;
        this.f59993d = j;
        this.f59992c = str;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59990a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                AbstractC2005i.m8907h(this.f59991b, iM19383z, this.f59993d, (ye1) obj, this.f59992c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                gsb.m12859b(this.f59991b, iM19383z2, this.f59993d, (ye1) obj, this.f59992c);
                break;
            default:
                ((Integer) obj2).intValue();
                kxb.m15715a(pk9.m19383z(1 | this.f59991b), this.f59993d, (ye1) obj, this.f59992c);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ rx0(int i, String str, long j, int i2) {
        this.f59991b = i;
        this.f59992c = str;
        this.f59993d = j;
    }

    public /* synthetic */ rx0(String str, int i, long j) {
        this.f59992c = str;
        this.f59993d = j;
        this.f59991b = i;
    }
}
