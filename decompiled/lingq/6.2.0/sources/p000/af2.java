package p000;

import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.feature.dictionary.AbstractC2059d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class af2 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DictionaryData f572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f573c;

    public /* synthetic */ af2(DictionaryData dictionaryData, ui3 ui3Var, int i, int i2) {
        this.f571a = i2;
        this.f572b = dictionaryData;
        this.f573c = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f571a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f573c;
        DictionaryData dictionaryData = this.f572b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC2059d.m8966b(dictionaryData, ui3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                AbstractC2059d.m8965a(dictionaryData, ui3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
