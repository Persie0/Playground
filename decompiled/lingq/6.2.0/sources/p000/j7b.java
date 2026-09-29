package p000;

import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j7b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f45172b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f45173c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o7b f45174d;

    public /* synthetic */ j7b(String str, ArrayList arrayList, o7b o7bVar, int i) {
        this.f45171a = i;
        this.f45172b = str;
        this.f45173c = arrayList;
        this.f45174d = o7bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f45171a;
        int i2 = 4;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        int i6 = 0;
        o7b o7bVar = this.f45174d;
        ArrayList arrayList = this.f45173c;
        String str = this.f45172b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                try {
                    Iterator it = arrayList.iterator();
                    int i7 = 1;
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2874C(i7, (String) it.next());
                        i7++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(i6);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(1);
                        int i8 = (int) ik8VarMo2873e0.getLong(2);
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(3);
                        int i9 = (int) ik8VarMo2873e0.getLong(4);
                        boolean z = ((int) ik8VarMo2873e0.getLong(5)) != 0 ? 1 : i6;
                        String strMo2875L4 = ik8VarMo2873e0.mo2875L(6);
                        qn3 qn3Var = o7bVar.f53959M;
                        List listM20059N = qn3Var.m20059N(strMo2875L4);
                        List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(7) ? null : ik8VarMo2873e0.mo2875L(7));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(8) ? null : ik8VarMo2873e0.mo2875L(8));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        arrayList2.add(new LessonWord(strMo2875L2, z, listM20058M, listM20058M2, strMo2875L, listM20059N, i9, i8, strMo2875L3, qn3Var.m20058M(ik8VarMo2873e0.isNull(9) ? null : ik8VarMo2873e0.mo2875L(9)), qn3Var.m20058M(ik8VarMo2873e0.isNull(10) ? null : ik8VarMo2873e0.mo2875L(10)), qn3Var.m20058M(ik8VarMo2873e0.isNull(11) ? null : ik8VarMo2873e0.mo2875L(11)), qn3Var.m20058M(ik8VarMo2873e0.isNull(12) ? null : ik8VarMo2873e0.mo2875L(12)), qn3Var.m20058M(ik8VarMo2873e0.isNull(13) ? null : ik8VarMo2873e0.mo2875L(13)), qn3Var.m20058M(ik8VarMo2873e0.isNull(14) ? null : ik8VarMo2873e0.mo2875L(14))));
                        i6 = 0;
                    }
                    ik8VarMo2873e0.close();
                    return arrayList2;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0(str);
                try {
                    Iterator it2 = arrayList.iterator();
                    int i10 = 1;
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2874C(i10, (String) it2.next());
                        i10++;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L5 = ik8VarMo2873e1.mo2875L(0);
                        String strMo2875L6 = ik8VarMo2873e1.mo2875L(1);
                        int i11 = (int) ik8VarMo2873e1.getLong(2);
                        String strMo2875L7 = ik8VarMo2873e1.mo2875L(3);
                        int i12 = (int) ik8VarMo2873e1.getLong(4);
                        List listM20059N2 = o7bVar.f53959M.m20059N(ik8VarMo2873e1.mo2875L(5));
                        List listM20058M3 = o7bVar.f53959M.m20058M(ik8VarMo2873e1.isNull(6) ? null : ik8VarMo2873e1.mo2875L(6));
                        if (listM20058M3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        arrayList3.add(new p7b(strMo2875L6, strMo2875L5, i11, i12, strMo2875L7, listM20058M3, listM20059N2));
                    }
                    ik8VarMo2873e1.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    ik8VarMo2873e1.close();
                    throw th2;
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0(str);
                try {
                    Iterator it3 = arrayList.iterator();
                    int i13 = 1;
                    while (it3.hasNext()) {
                        ik8VarMo2873e2.mo2874C(i13, (String) it3.next());
                        i13++;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        String strMo2875L8 = ik8VarMo2873e2.mo2875L(0);
                        String strMo2875L9 = ik8VarMo2873e2.mo2875L(i5);
                        int i14 = (int) ik8VarMo2873e2.getLong(2);
                        String strMo2875L10 = ik8VarMo2873e2.mo2875L(3);
                        int i15 = (int) ik8VarMo2873e2.getLong(4);
                        boolean z2 = ((int) ik8VarMo2873e2.getLong(5)) != 0;
                        String strMo2875L11 = ik8VarMo2873e2.mo2875L(6);
                        qn3 qn3Var2 = o7bVar.f53959M;
                        List listM20059N3 = qn3Var2.m20059N(strMo2875L11);
                        List listM20058M4 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(7) ? null : ik8VarMo2873e2.mo2875L(7));
                        if (listM20058M4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M5 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(8) ? null : ik8VarMo2873e2.mo2875L(8));
                        if (listM20058M5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        arrayList4.add(new LessonWord(strMo2875L9, z2, listM20058M4, listM20058M5, strMo2875L8, listM20059N3, i15, i14, strMo2875L10, qn3Var2.m20058M(ik8VarMo2873e2.isNull(9) ? null : ik8VarMo2873e2.mo2875L(9)), qn3Var2.m20058M(ik8VarMo2873e2.isNull(10) ? null : ik8VarMo2873e2.mo2875L(10)), qn3Var2.m20058M(ik8VarMo2873e2.isNull(11) ? null : ik8VarMo2873e2.mo2875L(11)), qn3Var2.m20058M(ik8VarMo2873e2.isNull(12) ? null : ik8VarMo2873e2.mo2875L(12)), qn3Var2.m20058M(ik8VarMo2873e2.isNull(13) ? null : ik8VarMo2873e2.mo2875L(13)), qn3Var2.m20058M(ik8VarMo2873e2.isNull(14) ? null : ik8VarMo2873e2.mo2875L(14))));
                        i5 = 1;
                    }
                    ik8VarMo2873e2.close();
                    return arrayList4;
                } catch (Throwable th3) {
                    ik8VarMo2873e2.close();
                    throw th3;
                }
            default:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0(str);
                try {
                    Iterator it4 = arrayList.iterator();
                    int i16 = 1;
                    while (it4.hasNext()) {
                        ik8VarMo2873e3.mo2874C(i16, (String) it4.next());
                        i16++;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    while (ik8VarMo2873e3.mo2876a0()) {
                        String strMo2875L12 = ik8VarMo2873e3.mo2875L(0);
                        String strMo2875L13 = ik8VarMo2873e3.mo2875L(1);
                        int i17 = (int) ik8VarMo2873e3.getLong(i4);
                        String strMo2875L14 = ik8VarMo2873e3.mo2875L(i3);
                        int i18 = (int) ik8VarMo2873e3.getLong(i2);
                        boolean z3 = ((int) ik8VarMo2873e3.getLong(5)) != 0;
                        String strMo2875L15 = ik8VarMo2873e3.mo2875L(6);
                        qn3 qn3Var3 = o7bVar.f53959M;
                        List listM20059N4 = qn3Var3.m20059N(strMo2875L15);
                        List listM20058M6 = qn3Var3.m20058M(ik8VarMo2873e3.isNull(7) ? null : ik8VarMo2873e3.mo2875L(7));
                        if (listM20058M6 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M7 = qn3Var3.m20058M(ik8VarMo2873e3.isNull(8) ? null : ik8VarMo2873e3.mo2875L(8));
                        if (listM20058M7 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        arrayList5.add(new LessonWord(strMo2875L13, z3, listM20058M6, listM20058M7, strMo2875L12, listM20059N4, i18, i17, strMo2875L14, qn3Var3.m20058M(ik8VarMo2873e3.isNull(9) ? null : ik8VarMo2873e3.mo2875L(9)), qn3Var3.m20058M(ik8VarMo2873e3.isNull(10) ? null : ik8VarMo2873e3.mo2875L(10)), qn3Var3.m20058M(ik8VarMo2873e3.isNull(11) ? null : ik8VarMo2873e3.mo2875L(11)), qn3Var3.m20058M(ik8VarMo2873e3.isNull(12) ? null : ik8VarMo2873e3.mo2875L(12)), qn3Var3.m20058M(ik8VarMo2873e3.isNull(13) ? null : ik8VarMo2873e3.mo2875L(13)), qn3Var3.m20058M(ik8VarMo2873e3.isNull(14) ? null : ik8VarMo2873e3.mo2875L(14))));
                        i2 = 4;
                        i3 = 3;
                        i4 = 2;
                    }
                    ik8VarMo2873e3.close();
                    return arrayList5;
                } catch (Throwable th4) {
                    ik8VarMo2873e3.close();
                    throw th4;
                }
        }
    }
}
