package p000;

import com.lingq.core.domain.model.library.LibraryLessonAudioDownload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l05 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f48852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f48853c;

    public /* synthetic */ l05(int i, String str, List list) {
        this.f48851a = i;
        this.f48852b = str;
        this.f48853c = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f48851a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 1;
        List list = this.f48853c;
        String str = this.f48852b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                try {
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
            case 1:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0(str);
                try {
                    Iterator it2 = list.iterator();
                    int i3 = 1;
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i3, ((Number) it2.next()).intValue());
                        i3++;
                    }
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        boolean z = false;
                        int i4 = (int) ik8VarMo2873e1.getLong(0);
                        if (((int) ik8VarMo2873e1.getLong(1)) != 0) {
                            z = true;
                        }
                        arrayList.add(new LibraryLessonAudioDownload(i4, (int) ik8VarMo2873e1.getLong(2), z));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8Var.getClass();
                ik8 ik8VarMo2873e2 = bk8Var.mo2873e0(str);
                try {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ik8VarMo2873e2.mo2874C(i2, (String) it3.next());
                        i2++;
                    }
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e3 = bk8Var.mo2873e0(str);
                try {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ik8VarMo2873e3.mo2878j(i2, ((Number) it4.next()).intValue());
                        i2++;
                    }
                    ik8VarMo2873e3.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e3.close();
                }
        }
    }
}
