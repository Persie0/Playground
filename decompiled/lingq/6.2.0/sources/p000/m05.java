package p000;

import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m05 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f50382b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f50383c;

    public /* synthetic */ m05(int i, String str, ArrayList arrayList) {
        this.f50381a = i;
        this.f50382b = str;
        this.f50383c = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f50381a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 1;
        ArrayList arrayList = this.f50383c;
        String str = this.f50382b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                try {
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
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0(str);
                try {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i2, ((Number) it2.next()).intValue());
                        i2++;
                    }
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8Var.getClass();
                ik8 ik8VarMo2873e2 = bk8Var.mo2873e0(str);
                try {
                    Iterator it3 = arrayList.iterator();
                    int i3 = 1;
                    while (it3.hasNext()) {
                        ik8VarMo2873e2.mo2878j(i3, ((Number) it3.next()).intValue());
                        i3++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        arrayList2.add(new Playlist((int) ik8VarMo2873e2.getLong(3), ik8VarMo2873e2.mo2875L(0), ik8VarMo2873e2.mo2875L(1), ik8VarMo2873e2.mo2875L(2), ((int) ik8VarMo2873e2.getLong(4)) != 0, ((int) ik8VarMo2873e2.getLong(5)) != 0));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 3:
                bk8Var.getClass();
                ik8 ik8VarMo2873e3 = bk8Var.mo2873e0(str);
                try {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        ik8VarMo2873e3.mo2874C(i2, (String) it4.next());
                        i2++;
                    }
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e3, "idWithLanguageAndData");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e3, "utteranceId");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e3, "audio");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e3, "text");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e3.mo2876a0()) {
                        arrayList3.add(new TextToSpeechTokenUtterance(ik8VarMo2873e3.mo2875L(iM14108v), (int) ik8VarMo2873e3.getLong(iM14108v2), ik8VarMo2873e3.mo2875L(iM14108v3), ik8VarMo2873e3.mo2875L(iM14108v4)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    ik8VarMo2873e3.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e4 = bk8Var.mo2873e0(str);
                try {
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ik8VarMo2873e4.mo2874C(i2, (String) it5.next());
                        i2++;
                    }
                    ik8VarMo2873e4.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e4.close();
                }
        }
    }
}
