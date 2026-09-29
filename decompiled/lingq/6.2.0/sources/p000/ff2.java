package p000;

import com.lingq.core.domain.model.language.DictionaryData;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ff2 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f38992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DictionaryData f38993c;

    public /* synthetic */ ff2(vi3 vi3Var, DictionaryData dictionaryData, int i) {
        this.f38991a = i;
        this.f38992b = vi3Var;
        this.f38993c = dictionaryData;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f38991a;
        xfa xfaVar = xfa.f68157a;
        DictionaryData dictionaryData = this.f38993c;
        vi3 vi3Var = this.f38992b;
        switch (i) {
            case 0:
                vi3Var.invoke(dictionaryData);
                break;
            default:
                vi3Var.invoke(dictionaryData);
                break;
        }
        return xfaVar;
    }
}
