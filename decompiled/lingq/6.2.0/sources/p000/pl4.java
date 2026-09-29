package p000;

import com.lingq.core.domain.model.library.LibraryItemCounter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pl4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f56402b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f56403c;

    public /* synthetic */ pl4(int i, String str, ArrayList arrayList) {
        this.f56401a = i;
        this.f56402b = str;
        this.f56403c = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f56401a;
        ArrayList arrayList = this.f56403c;
        String str = this.f56402b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                try {
                    Iterator it = arrayList.iterator();
                    int i2 = 1;
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2874C(i2, (String) it.next());
                        i2++;
                    }
                    ik8VarMo2873e0.mo2876a0();
                    return xfa.f68157a;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0(str);
                try {
                    Iterator it2 = arrayList.iterator();
                    int i3 = 1;
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2874C(i3, (String) it2.next());
                        i3++;
                    }
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "roseGiven");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "progress");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e1, "listenTimes");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e1, "readTimes");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isTaken");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e1, "difficulty");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "rosesCount");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "newWordsCount");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "knownWordsCount");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "cardsCount");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lessonsCount");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isCompletelyTaken");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "totalWordsCount");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "uniqueWordsCount");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audioStart");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audioEnd");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        int i4 = iM14108v13;
                        int i5 = iM14108v14;
                        int i6 = (int) ik8VarMo2873e1.getLong(iM14108v);
                        boolean z = ((int) ik8VarMo2873e1.getLong(iM14108v2)) != 0;
                        Float fValueOf = ik8VarMo2873e1.isNull(iM14108v3) ? null : Float.valueOf((float) ik8VarMo2873e1.getDouble(iM14108v3));
                        Double dValueOf = ik8VarMo2873e1.isNull(iM14108v4) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(iM14108v4));
                        Double dValueOf2 = ik8VarMo2873e1.isNull(iM14108v5) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(iM14108v5));
                        int i7 = iM14108v5;
                        int i8 = iM14108v4;
                        int i9 = iM14108v15;
                        int i10 = iM14108v16;
                        int i11 = iM14108v;
                        int i12 = iM14108v17;
                        arrayList2.add(new LibraryItemCounter(i6, z, fValueOf, dValueOf, dValueOf2, ((int) ik8VarMo2873e1.getLong(iM14108v6)) != 0, (float) ik8VarMo2873e1.getDouble(iM14108v7), (int) ik8VarMo2873e1.getLong(iM14108v8), (int) ik8VarMo2873e1.getLong(iM14108v12), (int) ik8VarMo2873e1.getLong(iM14108v9), (int) ik8VarMo2873e1.getLong(iM14108v10), (int) ik8VarMo2873e1.getLong(iM14108v11), ((int) ik8VarMo2873e1.getLong(i4)) != 0, (int) ik8VarMo2873e1.getLong(i5), (int) ik8VarMo2873e1.getLong(i9), ik8VarMo2873e1.isNull(i10) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(i10)), ik8VarMo2873e1.isNull(i12) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(i12))));
                        iM14108v13 = i4;
                        iM14108v17 = i12;
                        iM14108v15 = i9;
                        iM14108v2 = iM14108v2;
                        iM14108v4 = i8;
                        iM14108v14 = i5;
                        iM14108v3 = iM14108v3;
                        iM14108v = i11;
                        iM14108v16 = i10;
                        iM14108v5 = i7;
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
