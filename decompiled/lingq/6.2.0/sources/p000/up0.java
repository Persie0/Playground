package p000;

import com.lingq.core.domain.model.playlist.Playlist;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class up0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f64158b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f64159c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f64160d;

    public /* synthetic */ up0(String str, String str2, ArrayList arrayList, int i) {
        this.f64157a = i;
        this.f64158b = str;
        this.f64159c = str2;
        this.f64160d = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f64157a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 2;
        ArrayList arrayList = this.f64160d;
        String str = this.f64159c;
        String str2 = this.f64158b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str2);
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2878j(i2, ((Number) it.next()).intValue());
                        i2++;
                    }
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0(str2);
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    Iterator it2 = arrayList.iterator();
                    int i3 = 2;
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i3, ((Number) it2.next()).intValue());
                        i3++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        arrayList2.add(new Playlist((int) ik8VarMo2873e1.getLong(3), ik8VarMo2873e1.mo2875L(0), ik8VarMo2873e1.mo2875L(1), ik8VarMo2873e1.mo2875L(2), ((int) ik8VarMo2873e1.getLong(4)) != 0, ((int) ik8VarMo2873e1.getLong(5)) != 0));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e1.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e2 = bk8Var.mo2873e0(str2);
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ik8VarMo2873e2.mo2878j(i2, ((Number) it3.next()).intValue());
                        i2++;
                    }
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
        }
    }
}
