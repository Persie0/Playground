package p000;

import com.lingq.core.domain.model.chat.ChatMessageTranslation;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pv0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f56846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f56847c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f56848d;

    public /* synthetic */ pv0(int i, int i2, String str, ArrayList arrayList) {
        this.f56845a = i2;
        this.f56846b = str;
        this.f56847c = i;
        this.f56848d = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f56845a;
        int i2 = 2;
        ArrayList arrayList = this.f56848d;
        int i3 = this.f56847c;
        String str = this.f56846b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                try {
                    ik8VarMo2873e0.mo2878j(1, i3);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2878j(i2, ((Number) it.next()).intValue());
                        i2++;
                    }
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "chatId");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "messageIndex");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "translation");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList2.add(new ChatMessageTranslation((int) ik8VarMo2873e0.getLong(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v3), (int) ik8VarMo2873e0.getLong(iM14108v2)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0(str);
                try {
                    ik8VarMo2873e1.mo2878j(1, i3);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i2, ((Number) it2.next()).intValue());
                        i2++;
                    }
                    ik8VarMo2873e1.mo2876a0();
                    return xfa.f68157a;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
