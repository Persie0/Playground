package p000;

import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ii3 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44137a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f44138b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f44139c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f44140d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f44141e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f44142f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f44143g;

    public /* synthetic */ ii3(int i, List list, int i2, qc9 qc9Var, qc9 qc9Var2, qc9 qc9Var3) {
        this.f44138b = i;
        this.f44140d = list;
        this.f44139c = i2;
        this.f44141e = qc9Var;
        this.f44142f = qc9Var2;
        this.f44143g = qc9Var3;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f44137a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f44143g;
        Object obj3 = this.f44142f;
        Object obj4 = this.f44141e;
        int i2 = this.f44139c;
        int i3 = this.f44138b;
        Object obj5 = this.f44140d;
        switch (i) {
            case 0:
                List list = (List) obj5;
                qc9 qc9Var = (qc9) obj4;
                qc9 qc9Var2 = (qc9) obj3;
                qc9 qc9Var3 = (qc9) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                if (i3 == 0 && qc9Var.m19861h() != fFloatValue) {
                    qc9Var.m19862i(fFloatValue);
                }
                if (i3 == list.size() - 1 && qc9Var2.m19861h() != fFloatValue) {
                    qc9Var2.m19862i(fFloatValue);
                }
                if (i3 == i2 && qc9Var3.m19861h() != fFloatValue) {
                    qc9Var3.m19862i(fFloatValue);
                }
                break;
            default:
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                AbstractC0343j.m1521j(abstractC0343j, (l87) obj5, i3, i2);
                AbstractC0343j.m1521j(abstractC0343j, (l87) obj4, ((Ref$IntRef) obj3).f47716a, ((Ref$IntRef) obj2).f47716a);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ii3(l87 l87Var, int i, int i2, l87 l87Var2, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2) {
        this.f44140d = l87Var;
        this.f44138b = i;
        this.f44139c = i2;
        this.f44141e = l87Var2;
        this.f44142f = ref$IntRef;
        this.f44143g = ref$IntRef2;
    }
}
