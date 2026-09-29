package p000;

import com.lingq.core.domain.model.LanguageLearn;

/* JADX INFO: loaded from: classes3.dex */
public final class fm4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39281a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f39282b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageLearn f39283c;

    public /* synthetic */ fm4(vi3 vi3Var, LanguageLearn languageLearn, int i) {
        this.f39281a = i;
        this.f39282b = vi3Var;
        this.f39283c = languageLearn;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f39281a;
        xfa xfaVar = xfa.f68157a;
        LanguageLearn languageLearn = this.f39283c;
        vi3 vi3Var = this.f39282b;
        switch (i) {
            case 0:
                vi3Var.invoke(languageLearn.getCode());
                break;
            default:
                vi3Var.invoke(languageLearn.getCode());
                break;
        }
        return xfaVar;
    }
}
