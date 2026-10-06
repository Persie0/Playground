package p000;

import androidx.wear.ambient.AmbientMode;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f38219a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f38220b;

    public lgm(oju ojuVar, int i) {
        this.f38220b = i;
        this.f38219a = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f38220b) {
            case 0:
                return new Random(((ksi) this.f38219a.get()).mo14816b());
            case 1:
                return new lhz(((dws) this.f38219a).m6830a());
            case 2:
                lgr lgrVar = ((lgo) this.f38219a).get();
                lgr.m15324a(new AmbientMode.AmbientController(lgrVar));
                return lgrVar;
            case 3:
                return (ksi) ((etl) this.f38219a).m7866a().mo16811e(new ksl());
            case 4:
                return new lgv((ksi) this.f38219a.get());
            case 5:
                return Boolean.valueOf(oii.f46112a.mo6051a().mo18552b(((dws) this.f38219a).m6830a()));
            case 6:
                oyy oyyVarMo18551a = oii.f46112a.mo6051a().mo18551a(((dws) this.f38219a).m6830a());
                oyyVarMo18551a.getClass();
                return oyyVarMo18551a;
            case 7:
                pas pasVarMo18554a = oil.f46116a.mo6051a().mo18554a(((dws) this.f38219a).m6830a());
                pasVarMo18554a.getClass();
                return pasVarMo18554a;
            case 8:
                oho ohoVarMo18546b = oif.f46105a.mo6051a().mo18546b(((dws) this.f38219a).m6830a());
                ohoVarMo18546b.getClass();
                return ohoVarMo18546b;
            case 9:
                oho ohoVarMo18547c = oif.f46105a.mo6051a().mo18547c(((dws) this.f38219a).m6830a());
                ohoVarMo18547c.getClass();
                return ohoVarMo18547c;
            case 10:
                oho ohoVarMo18548d = oif.f46105a.mo6051a().mo18548d(((dws) this.f38219a).m6830a());
                ohoVarMo18548d.getClass();
                return ohoVarMo18548d;
            case 11:
                return Boolean.valueOf(oiu.f46128a.mo6051a().mo18565c(((dws) this.f38219a).m6830a()));
            case 12:
                pas pasVarMo18556a = oio.f46119a.mo6051a().mo18556a(((dws) this.f38219a).m6830a());
                pasVarMo18556a.getClass();
                return pasVarMo18556a;
            case 13:
                lju ljuVarMo18558a = oir.f46122a.mo6051a().mo18558a(((dws) this.f38219a).m6830a());
                ljuVarMo18558a.getClass();
                return ljuVarMo18558a;
            case 14:
                lkd lkdVarMo18560c = oir.f46122a.mo6051a().mo18560c(((dws) this.f38219a).m6830a());
                lkdVarMo18560c.getClass();
                return lkdVarMo18560c;
            case 15:
                return Boolean.valueOf(oiu.f46128a.mo6051a().mo18566d(((dws) this.f38219a).m6830a()));
            case 16:
                return Boolean.valueOf(ojg.f46167a.mo6051a().mo18579c(((dws) this.f38219a).m6830a()));
            case 17:
                return Boolean.valueOf(oif.f46105a.mo6051a().mo18549e(((dws) this.f38219a).m6830a()));
            case 18:
                return Long.valueOf(ojg.f46167a.mo6051a().mo18577a(((dws) this.f38219a).m6830a()));
            case 19:
                llg llgVarMo18563a = oiu.f46128a.mo6051a().mo18563a(((dws) this.f38219a).m6830a());
                llgVarMo18563a.getClass();
                return llgVarMo18563a;
            default:
                pas pasVarMo18564b = oiu.f46128a.mo6051a().mo18564b(((dws) this.f38219a).m6830a());
                pasVarMo18564b.getClass();
                return pasVarMo18564b;
        }
    }
}
