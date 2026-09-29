package p000;

import com.lingq.core.domain.model.library.LibraryItemDownload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i85 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43684b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f43685c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f43686d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f43687e;

    public /* synthetic */ i85(String str, List list, int i, String str2, int i2) {
        this.f43683a = i2;
        this.f43684b = str;
        this.f43685c = list;
        this.f43686d = i;
        this.f43687e = str2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f43683a;
        String str = this.f43687e;
        int i2 = this.f43686d;
        List list = this.f43685c;
        String str2 = this.f43684b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str2);
                try {
                    Iterator it = list.iterator();
                    int i3 = 1;
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2878j(i3, ((Number) it.next()).intValue());
                        i3++;
                    }
                    ik8VarMo2873e0.mo2874C(i2 + 1, str);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(new LibraryItemDownload((int) ik8VarMo2873e0.getLong(0), (int) ik8VarMo2873e0.getLong(2), ((int) ik8VarMo2873e0.getLong(1)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0(str2);
                try {
                    Iterator it2 = list.iterator();
                    int i4 = 1;
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i4, ((Number) it2.next()).intValue());
                        i4++;
                    }
                    ik8VarMo2873e1.mo2874C(i2 + 1, str);
                    ik8VarMo2873e1.mo2874C(i2 + 2, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        arrayList2.add(new LibraryItemDownload((int) ik8VarMo2873e1.getLong(0), (int) ik8VarMo2873e1.getLong(1), ((int) ik8VarMo2873e1.getLong(2)) != 0));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
