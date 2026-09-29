package p000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineStart;
import p000.C0011a9;
import p000.C3002fi;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3811yw;
import p000.C3848zw;
import p000.ab9;
import p000.bb3;
import p000.bc3;
import p000.db3;
import p000.dl3;
import p000.f88;
import p000.fa4;
import p000.fh5;
import p000.j62;
import p000.l70;
import p000.n66;
import p000.s46;
import p000.tda;
import p000.te1;
import p000.uda;
import p000.vda;
import p000.vi3;
import p000.wfb;
import p000.x78;
import p000.xa3;
import p000.ya3;

/* JADX INFO: loaded from: classes.dex */
public final class ya3 implements wa3 {

    /* JADX INFO: renamed from: a */
    public final C3002fi f69543a;

    /* JADX INFO: renamed from: b */
    public final C3039gi f69544b;

    /* JADX INFO: renamed from: c */
    public final fs6 f69545c;

    /* JADX INFO: renamed from: d */
    public final db3 f69546d;

    /* JADX INFO: renamed from: e */
    public final cc4 f69547e;

    /* JADX INFO: renamed from: f */
    public final C0011a9 f69548f;

    public ya3(C3002fi c3002fi, C3039gi c3039gi) {
        fs6 fs6Var = za3.f71258a;
        db3 db3Var = new db3(za3.f71259b);
        cc4 cc4Var = new cc4(14);
        this.f69543a = c3002fi;
        this.f69544b = c3039gi;
        this.f69545c = fs6Var;
        this.f69546d = db3Var;
        this.f69547e = cc4Var;
        this.f69548f = new C0011a9(this, 18);
    }

    /* JADX INFO: renamed from: a */
    public final wda m25017a(final tda tdaVar) {
        fs6 fs6Var = this.f69545c;
        vi3 vi3Var = new vi3() { // from class: androidx.compose.ui.text.font.b
            /* JADX WARN: Code duplicated, block: B:199:0x036e  */
            /* JADX WARN: Code duplicated, block: B:200:0x0370  */
            @Override // p000.vi3
            public final Object invoke(Object obj) throws Exception {
                Pair pair;
                Object udaVar;
                Object objInvoke;
                Object objInvoke2;
                List list;
                Object obj2;
                Typeface typefaceM21062j;
                vda vdaVar;
                ya3 ya3Var = this.f5057a;
                tda tdaVar2 = tdaVar;
                vi3 vi3Var2 = (vi3) obj;
                db3 db3Var = ya3Var.f69546d;
                C3002fi c3002fi = ya3Var.f69543a;
                C0011a9 c0011a9 = ya3Var.f69548f;
                db3Var.getClass();
                xa3 xa3Var = tdaVar2.f62168a;
                if (xa3Var instanceof bb3) {
                    List list2 = ((bb3) xa3Var).f8267c;
                    bc3 bc3Var = tdaVar2.f62169b;
                    int i = tdaVar2.f62170c;
                    ArrayList arrayList = new ArrayList(list2.size());
                    List list3 = list2;
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj3 = list2.get(i2);
                        x78 x78Var = (x78) obj3;
                        if (fa4.m11650l(x78Var.f67901b, bc3Var) && x78Var.f67902c == i) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            Object obj4 = list2.get(i3);
                            if (((x78) obj4).f67902c == i) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list2 = arrayList2;
                        }
                        List list4 = list2;
                        int iCompareTo = bc3Var.compareTo(bc3.f8316b);
                        int i4 = bc3Var.f8327a;
                        if (iCompareTo < 0) {
                            List list5 = list4;
                            int size3 = list5.size();
                            bc3 bc3Var2 = null;
                            bc3 bc3Var3 = null;
                            for (int i5 = 0; i5 < size3; i5++) {
                                bc3 bc3Var4 = ((x78) list4.get(i5)).f67901b;
                                int i6 = bc3Var4.f8327a;
                                if (fa4.m11651m(i6, i4) >= 0) {
                                    if (fa4.m11651m(i6, i4) <= 0) {
                                        bc3Var2 = bc3Var4;
                                        bc3Var3 = bc3Var2;
                                        break;
                                    }
                                    if (bc3Var3 == null || fa4.m11651m(i6, bc3Var3.f8327a) < 0) {
                                        bc3Var3 = bc3Var4;
                                    }
                                } else if (bc3Var2 == null || fa4.m11651m(i6, bc3Var2.f8327a) > 0) {
                                    bc3Var2 = bc3Var4;
                                }
                            }
                            if (bc3Var2 == null) {
                                bc3Var2 = bc3Var3;
                            }
                            arrayList = new ArrayList(list4.size());
                            int size4 = list5.size();
                            for (int i7 = 0; i7 < size4; i7++) {
                                Object obj5 = list4.get(i7);
                                if (fa4.m11650l(((x78) obj5).f67901b, bc3Var2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            bc3 bc3Var5 = bc3.f8317c;
                            if (bc3Var.compareTo(bc3Var5) > 0) {
                                List list6 = list4;
                                int size5 = list6.size();
                                bc3 bc3Var6 = null;
                                bc3 bc3Var7 = null;
                                for (int i8 = 0; i8 < size5; i8++) {
                                    bc3 bc3Var8 = ((x78) list4.get(i8)).f67901b;
                                    int i9 = bc3Var8.f8327a;
                                    if (fa4.m11651m(i9, i4) >= 0) {
                                        if (fa4.m11651m(i9, i4) <= 0) {
                                            bc3Var6 = bc3Var8;
                                            bc3Var7 = bc3Var6;
                                            break;
                                        }
                                        if (bc3Var7 == null || fa4.m11651m(i9, bc3Var7.f8327a) < 0) {
                                            bc3Var7 = bc3Var8;
                                        }
                                    } else if (bc3Var6 == null || fa4.m11651m(i9, bc3Var6.f8327a) > 0) {
                                        bc3Var6 = bc3Var8;
                                    }
                                }
                                if (bc3Var7 != null) {
                                    bc3Var6 = bc3Var7;
                                }
                                arrayList = new ArrayList(list4.size());
                                int size6 = list6.size();
                                for (int i10 = 0; i10 < size6; i10++) {
                                    Object obj6 = list4.get(i10);
                                    if (fa4.m11650l(((x78) obj6).f67901b, bc3Var6)) {
                                        arrayList.add(obj6);
                                    }
                                }
                            } else {
                                List list7 = list4;
                                int size7 = list7.size();
                                bc3 bc3Var9 = null;
                                bc3 bc3Var10 = null;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size7) {
                                        list = list7;
                                        break;
                                    }
                                    bc3 bc3Var11 = ((x78) list4.get(i11)).f67901b;
                                    list = list7;
                                    if (fa4.m11651m(bc3Var11.f8327a, bc3Var5.f8327a) <= 0) {
                                        int i12 = bc3Var11.f8327a;
                                        if (fa4.m11651m(i12, i4) >= 0) {
                                            if (fa4.m11651m(i12, i4) <= 0) {
                                                bc3Var9 = bc3Var11;
                                                bc3Var10 = bc3Var9;
                                                break;
                                            }
                                            if (bc3Var10 == null || fa4.m11651m(i12, bc3Var10.f8327a) < 0) {
                                                bc3Var10 = bc3Var11;
                                            }
                                        } else if (bc3Var9 == null || fa4.m11651m(i12, bc3Var9.f8327a) > 0) {
                                            bc3Var9 = bc3Var11;
                                        }
                                    }
                                    i11++;
                                    list7 = list;
                                }
                                if (bc3Var10 != null) {
                                    bc3Var9 = bc3Var10;
                                }
                                ArrayList arrayList3 = new ArrayList(list4.size());
                                int size8 = list.size();
                                for (int i13 = 0; i13 < size8; i13++) {
                                    Object obj7 = list4.get(i13);
                                    if (fa4.m11650l(((x78) obj7).f67901b, bc3Var9)) {
                                        arrayList3.add(obj7);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    bc3 bc3Var12 = bc3.f8317c;
                                    int size9 = list.size();
                                    bc3 bc3Var13 = null;
                                    bc3 bc3Var14 = null;
                                    for (int i14 = 0; i14 < size9; i14++) {
                                        bc3 bc3Var15 = ((x78) list4.get(i14)).f67901b;
                                        if (bc3Var12 == null || fa4.m11651m(bc3Var15.f8327a, bc3Var12.f8327a) >= 0) {
                                            int i15 = bc3Var15.f8327a;
                                            if (fa4.m11651m(i15, i4) >= 0) {
                                                if (fa4.m11651m(i15, i4) <= 0) {
                                                    bc3Var13 = bc3Var15;
                                                    bc3Var14 = bc3Var13;
                                                    break;
                                                }
                                                if (bc3Var14 == null || fa4.m11651m(i15, bc3Var14.f8327a) < 0) {
                                                    bc3Var14 = bc3Var15;
                                                }
                                            } else if (bc3Var13 == null || fa4.m11651m(i15, bc3Var13.f8327a) > 0) {
                                                bc3Var13 = bc3Var15;
                                            }
                                        }
                                    }
                                    if (bc3Var14 != null) {
                                        bc3Var13 = bc3Var14;
                                    }
                                    arrayList = new ArrayList(list4.size());
                                    int size10 = list.size();
                                    for (int i16 = 0; i16 < size10; i16++) {
                                        Object obj8 = list4.get(i16);
                                        if (fa4.m11650l(((x78) obj8).f67901b, bc3Var13)) {
                                            arrayList.add(obj8);
                                        }
                                    }
                                } else {
                                    arrayList = arrayList3;
                                }
                            }
                        }
                    }
                    C3309ls c3309ls = db3Var.f35352a;
                    if (arrayList.size() > 0) {
                        x78 x78Var2 = (x78) arrayList.get(0);
                        x78Var2.getClass();
                        synchronized (((s46) c3309ls.f50066d)) {
                            try {
                                c3002fi.getClass();
                                C3848zw c3848zw = new C3848zw(x78Var2);
                                C3811yw c3811yw = (C3811yw) ((ab9) c3309ls.f50064b).m238d(c3848zw);
                                if (c3811yw == null) {
                                    c3811yw = (C3811yw) ((n66) c3309ls.f50065c).m17255g(c3848zw);
                                }
                                if (c3811yw != null) {
                                    objInvoke2 = c3811yw.f70564a;
                                } else {
                                    try {
                                        Context context = c3002fi.f39115a;
                                        if (x78Var2 instanceof x78) {
                                            Typeface typefaceM11597a = f88.m11597a(context, x78Var2.f67900a);
                                            typefaceM11597a.getClass();
                                            objInvoke = te1.m21981N(typefaceM11597a, x78Var2.f67903d, context);
                                        } else {
                                            objInvoke = null;
                                        }
                                    } catch (Exception unused) {
                                        objInvoke = c0011a9.invoke(tdaVar2);
                                    }
                                    c3309ls.getClass();
                                    c3002fi.getClass();
                                    C3848zw c3848zw2 = new C3848zw(x78Var2);
                                    synchronized (((s46) c3309ls.f50066d)) {
                                        try {
                                            if (objInvoke == null) {
                                                ((n66) c3309ls.f50065c).m17261m(c3848zw2, new C3811yw(null));
                                            } else {
                                                ((ab9) c3309ls.f50064b).m240f(c3848zw2, new C3811yw(objInvoke));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    objInvoke2 = objInvoke;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (objInvoke2 == null) {
                            objInvoke2 = c0011a9.invoke(tdaVar2);
                        }
                        pair = new Pair(null, l70.m15916G(tdaVar2.f62171d, objInvoke2, x78Var2, tdaVar2.f62169b, tdaVar2.f62170c));
                    } else {
                        pair = new Pair(null, c0011a9.invoke(tdaVar2));
                    }
                    List list8 = (List) pair.f47623a;
                    Object obj9 = pair.f47624b;
                    if (list8 == null) {
                        udaVar = new vda(obj9, true);
                    } else {
                        C0433a c0433a = new C0433a(list8, obj9, tdaVar2, db3Var.f35352a, vi3Var2, c3002fi);
                        wfb.m23926u(db3Var.f35353b, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(c0433a, null), 1);
                        udaVar = new uda(c0433a);
                    }
                } else {
                    udaVar = null;
                }
                if (udaVar != null) {
                    return udaVar;
                }
                Object obj10 = ya3Var.f69547e.f9881a;
                xa3 xa3Var2 = tdaVar2.f62168a;
                int i17 = tdaVar2.f62170c;
                bc3 bc3Var16 = tdaVar2.f62169b;
                if (xa3Var2 == null || (xa3Var2 instanceof j62)) {
                    obj2 = null;
                    typefaceM21062j = s46.m21062j(null, bc3Var16, i17);
                } else {
                    if (!(xa3Var2 instanceof dl3)) {
                        if (xa3Var2 instanceof fh5) {
                            typefaceM21062j = (Typeface) ((fh5) xa3Var2).f39107c.f50618b;
                        } else {
                            vdaVar = null;
                            obj2 = null;
                        }
                        if (vdaVar != null) {
                            return vdaVar;
                        }
                        C3386nv.m17633t("Could not load font");
                        return obj2;
                    }
                    typefaceM21062j = s46.m21062j("sans-serif", bc3Var16, i17);
                    obj2 = null;
                }
                vdaVar = new vda(typefaceM21062j, true);
                if (vdaVar != null) {
                    return vdaVar;
                }
                C3386nv.m17633t("Could not load font");
                return obj2;
            }
        };
        synchronized (((s46) fs6Var.f39590b)) {
            wda wdaVar = (wda) ((ab9) fs6Var.f39591c).m238d(tdaVar);
            if (wdaVar != null) {
                if (wdaVar.mo22699a()) {
                    return wdaVar;
                }
            }
            try {
                wda wdaVar2 = (wda) vi3Var.invoke(new ui5(23, fs6Var, tdaVar));
                synchronized (((s46) fs6Var.f39590b)) {
                    if (((ab9) fs6Var.f39591c).m238d(tdaVar) == null && wdaVar2.mo22699a()) {
                        ((ab9) fs6Var.f39591c).m240f(tdaVar, wdaVar2);
                    }
                }
                return wdaVar2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final wda m25018b(xa3 xa3Var, bc3 bc3Var, int i, int i2) {
        C3039gi c3039gi = this.f69544b;
        c3039gi.getClass();
        int i3 = c3039gi.f40841a;
        bc3 bc3Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? bc3Var : new bc3(l70.m15945h(bc3Var.f8327a + i3, 1, DescriptorProtos.Edition.EDITION_2023_VALUE));
        this.f69543a.getClass();
        return m25017a(new tda(xa3Var, bc3Var2, i, i2, null));
    }
}
