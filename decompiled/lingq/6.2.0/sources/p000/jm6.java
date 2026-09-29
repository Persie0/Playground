package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jm6 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f45829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f45830c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f45831d;

    public /* synthetic */ jm6(String str, int i, List list, String str2) {
        this.f45828a = i;
        this.f45829b = str;
        this.f45830c = str2;
        this.f45831d = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f45828a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 2;
        List list = this.f45831d;
        String str = this.f45830c;
        String str2 = this.f45829b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str2);
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2878j(i2, ((Number) it.next()).intValue());
                        i2++;
                    }
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0(str2);
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i2, ((Number) it2.next()).intValue());
                        i2++;
                    }
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
