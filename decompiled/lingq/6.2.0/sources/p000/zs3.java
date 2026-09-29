package p000;

import com.lingq.core.domain.model.status.CardStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zs3 {

    /* JADX INFO: renamed from: a */
    public static final long f72036a = d32.m10037f(2580850752L);

    /* JADX INFO: renamed from: b */
    public static final long f72037b = d32.m10037f(2574098143L);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f72038c = 0;

    /* JADX INFO: renamed from: a */
    public static final long m25759a(d87 d87Var, s78 s78Var) {
        int i = d87Var.f35177f;
        if (i == CardStatus.New.getValue()) {
            return s78Var.f60471a;
        }
        if (i == CardStatus.Recognized.getValue()) {
            return s78Var.f60472b;
        }
        return i == CardStatus.Familiar.getValue() ? s78Var.f60473c : aa1.f411j;
    }
}
