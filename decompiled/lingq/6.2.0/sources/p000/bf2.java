package p000;

import com.lingq.core.domain.model.language.DictionaryData;

/* JADX INFO: loaded from: classes2.dex */
public final class bf2 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f8451b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DictionaryData f8452c;

    public /* synthetic */ bf2(vi3 vi3Var, DictionaryData dictionaryData, int i) {
        this.f8450a = i;
        this.f8451b = vi3Var;
        this.f8452c = dictionaryData;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f8450a;
        xfa xfaVar = xfa.f68157a;
        DictionaryData dictionaryData = this.f8452c;
        vi3 vi3Var = this.f8451b;
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
