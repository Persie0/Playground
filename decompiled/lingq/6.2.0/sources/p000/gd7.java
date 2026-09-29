package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gd7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p33 f40589c;

    public /* synthetic */ gd7(String str, p33 p33Var, int i) {
        this.f40587a = i;
        this.f40588b = str;
        this.f40589c = p33Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8 = this.f40587a;
        p33 p33Var = this.f40589c;
        String str = this.f40588b;
        switch (i8) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                try {
                    ((cg7) p33Var.f55514c).invoke(ik8VarMo2873e0);
                    ik8VarMo2873e0.getClass();
                    int iM14095i = AbstractC3122is.m14095i(ik8VarMo2873e0, "id");
                    int iM14095i2 = AbstractC3122is.m14095i(ik8VarMo2873e0, "url");
                    int iM14095i3 = AbstractC3122is.m14095i(ik8VarMo2873e0, "description");
                    int iM14095i4 = AbstractC3122is.m14095i(ik8VarMo2873e0, "pos");
                    int iM14095i5 = AbstractC3122is.m14095i(ik8VarMo2873e0, "originalImageUrl");
                    int iM14095i6 = AbstractC3122is.m14095i(ik8VarMo2873e0, "imageUrl");
                    int iM14095i7 = AbstractC3122is.m14095i(ik8VarMo2873e0, "language");
                    int iM14095i8 = AbstractC3122is.m14095i(ik8VarMo2873e0, "title");
                    int iM14095i9 = AbstractC3122is.m14095i(ik8VarMo2873e0, "collectionTitle");
                    int iM14095i10 = AbstractC3122is.m14095i(ik8VarMo2873e0, "collectionId");
                    int iM14095i11 = AbstractC3122is.m14095i(ik8VarMo2873e0, "listenTimes");
                    int iM14095i12 = AbstractC3122is.m14095i(ik8VarMo2873e0, "duration");
                    int iM14095i13 = AbstractC3122is.m14095i(ik8VarMo2873e0, "audioUrl");
                    int iM14095i14 = AbstractC3122is.m14095i(ik8VarMo2873e0, "videoUrl");
                    int iM14095i15 = AbstractC3122is.m14095i(ik8VarMo2873e0, "playlistLessonOrder");
                    int iM14095i16 = AbstractC3122is.m14095i(ik8VarMo2873e0, "isCourse");
                    int iM14095i17 = AbstractC3122is.m14095i(ik8VarMo2873e0, "isCourseLesson");
                    int iM14095i18 = AbstractC3122is.m14095i(ik8VarMo2873e0, "price");
                    int iM14095i19 = AbstractC3122is.m14095i(ik8VarMo2873e0, "level");
                    int iM14095i20 = AbstractC3122is.m14095i(ik8VarMo2873e0, "counterListenTimes");
                    int iM14095i21 = AbstractC3122is.m14095i(ik8VarMo2873e0, "isTaken");
                    int iM14095i22 = AbstractC3122is.m14095i(ik8VarMo2873e0, "originalUrl");
                    int iM14095i23 = AbstractC3122is.m14095i(ik8VarMo2873e0, "audioStart");
                    int iM14095i24 = AbstractC3122is.m14095i(ik8VarMo2873e0, "audioEnd");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        ArrayList arrayList2 = arrayList;
                        int i9 = iM14095i == -1 ? 0 : (int) ik8VarMo2873e0.getLong(iM14095i);
                        int i10 = iM14095i2;
                        int i11 = -1;
                        String strMo2875L = (i10 == -1 || ik8VarMo2873e0.isNull(i10)) ? null : ik8VarMo2873e0.mo2875L(i10);
                        String strMo2875L2 = (iM14095i3 == -1 || ik8VarMo2873e0.isNull(iM14095i3)) ? null : ik8VarMo2873e0.mo2875L(iM14095i3);
                        if (iM14095i4 == -1) {
                            i = 0;
                        } else {
                            i = (int) ik8VarMo2873e0.getLong(iM14095i4);
                            i11 = -1;
                        }
                        String strMo2875L3 = (iM14095i5 == i11 || ik8VarMo2873e0.isNull(iM14095i5)) ? null : ik8VarMo2873e0.mo2875L(iM14095i5);
                        String strMo2875L4 = (iM14095i6 == i11 || ik8VarMo2873e0.isNull(iM14095i6)) ? null : ik8VarMo2873e0.mo2875L(iM14095i6);
                        String strMo2875L5 = (iM14095i7 == i11 || ik8VarMo2873e0.isNull(iM14095i7)) ? null : ik8VarMo2873e0.mo2875L(iM14095i7);
                        if (iM14095i8 == i11) {
                            throw new IllegalStateException("Missing column 'title' for a NON-NULL value, column not found in result.");
                        }
                        String strMo2875L6 = ik8VarMo2873e0.mo2875L(iM14095i8);
                        String strMo2875L7 = (iM14095i9 == i11 || ik8VarMo2873e0.isNull(iM14095i9)) ? null : ik8VarMo2873e0.mo2875L(iM14095i9);
                        if (iM14095i10 == i11) {
                            i2 = 0;
                        } else {
                            i2 = (int) ik8VarMo2873e0.getLong(iM14095i10);
                            i11 = -1;
                        }
                        Double dValueOf = (iM14095i11 == i11 || ik8VarMo2873e0.isNull(iM14095i11)) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14095i11));
                        if (iM14095i12 == i11) {
                            i3 = 0;
                        } else {
                            i3 = (int) ik8VarMo2873e0.getLong(iM14095i12);
                            i11 = -1;
                        }
                        String strMo2875L8 = (iM14095i13 == i11 || ik8VarMo2873e0.isNull(iM14095i13)) ? null : ik8VarMo2873e0.mo2875L(iM14095i13);
                        String strMo2875L9 = (iM14095i14 == i11 || ik8VarMo2873e0.isNull(iM14095i14)) ? null : ik8VarMo2873e0.mo2875L(iM14095i14);
                        int i12 = iM14095i15;
                        Integer numValueOf = (i12 == i11 || ik8VarMo2873e0.isNull(i12)) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i12));
                        int i13 = iM14095i16;
                        if (i13 == -1) {
                            z = false;
                        } else {
                            z = ((int) ik8VarMo2873e0.getLong(i13)) != 0;
                        }
                        int i14 = iM14095i17;
                        if (i14 == -1) {
                            z2 = false;
                            i4 = -1;
                        } else {
                            z2 = ((int) ik8VarMo2873e0.getLong(i14)) != 0;
                            i4 = -1;
                        }
                        int i15 = iM14095i18;
                        if (i15 == i4) {
                            i5 = 0;
                            i6 = i4;
                        } else {
                            i5 = (int) ik8VarMo2873e0.getLong(i15);
                            i6 = -1;
                        }
                        int i16 = iM14095i19;
                        String strMo2875L10 = (i16 == i6 || ik8VarMo2873e0.isNull(i16)) ? null : ik8VarMo2873e0.mo2875L(i16);
                        Double dValueOf2 = (iM14095i20 == i6 || ik8VarMo2873e0.isNull(iM14095i20)) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14095i20));
                        if (iM14095i21 == i6) {
                            z3 = false;
                            i7 = i6;
                        } else {
                            z3 = ((int) ik8VarMo2873e0.getLong(iM14095i21)) != 0;
                            i7 = -1;
                        }
                        int i17 = iM14095i22;
                        String strMo2875L11 = (i17 == i7 || ik8VarMo2873e0.isNull(i17)) ? null : ik8VarMo2873e0.mo2875L(i17);
                        Double dValueOf3 = (iM14095i23 == i7 || ik8VarMo2873e0.isNull(iM14095i23)) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14095i23));
                        Double dValueOf4 = (iM14095i24 == i7 || ik8VarMo2873e0.isNull(iM14095i24)) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14095i24));
                        iM14095i24 = iM14095i24;
                        arrayList2.add(new ud7(i9, strMo2875L, strMo2875L2, i, strMo2875L3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, i2, dValueOf, i3, strMo2875L8, strMo2875L9, numValueOf, z, z2, i5, strMo2875L10, dValueOf2, z3, strMo2875L11, dValueOf3, dValueOf4));
                        iM14095i16 = i13;
                        iM14095i22 = i17;
                        iM14095i5 = iM14095i5;
                        iM14095i6 = iM14095i6;
                        iM14095i2 = i10;
                        iM14095i17 = i14;
                        iM14095i19 = i16;
                        iM14095i4 = iM14095i4;
                        arrayList = arrayList2;
                        iM14095i = iM14095i;
                        iM14095i18 = i15;
                        iM14095i3 = iM14095i3;
                        iM14095i15 = i12;
                    }
                    ArrayList arrayList3 = arrayList;
                    ik8VarMo2873e0.close();
                    return arrayList3;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0(str);
                try {
                    ((cg7) p33Var.f55514c).invoke(ik8VarMo2873e1);
                    return Integer.valueOf(ik8VarMo2873e1.mo2876a0() ? (int) ik8VarMo2873e1.getLong(0) : 0);
                } finally {
                    ik8VarMo2873e1.close();
                }
            default:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0(str);
                try {
                    ((cg7) p33Var.f55514c).invoke(ik8VarMo2873e2);
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        arrayList4.add(Integer.valueOf((int) ik8VarMo2873e2.getLong(0)));
                    }
                    ik8VarMo2873e2.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    ik8VarMo2873e2.close();
                    throw th2;
                }
        }
    }
}
