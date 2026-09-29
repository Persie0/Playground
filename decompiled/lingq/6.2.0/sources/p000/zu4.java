package p000;

import androidx.glance.appwidget.lazy.AbstractC0665a;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zu4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f72176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3532re f72177c;

    public /* synthetic */ zu4(ArrayList arrayList, C3532re c3532re, int i) {
        this.f72175a = i;
        this.f72176b = arrayList;
        this.f72177c = c3532re;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f72175a;
        xfa xfaVar = xfa.f68157a;
        ArrayList arrayList = this.f72176b;
        final int i2 = 0;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    tj3 tj3Var = (tj3) ye1Var;
                    if (tj3Var.m22086D()) {
                        tj3Var.m22102U();
                        return xfaVar;
                    }
                }
                int i3 = 0;
                for (Object obj3 : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    Pair pair = (Pair) obj3;
                    Long l = (Long) pair.f47623a;
                    final aj3 aj3Var = (aj3) pair.f47624b;
                    if (l != null && l.longValue() == Long.MIN_VALUE) {
                        l = null;
                    }
                    long jLongValue = l != null ? l.longValue() : (-4611686018427387904L) - ((long) i3);
                    if (jLongValue == Long.MIN_VALUE) {
                        C3386nv.m17633t("Implicit list item ids exhausted.");
                        return null;
                    }
                    AbstractC0665a.m2257b(jLongValue, this.f72177c, ci8.m4703P(1419565165, new zi3() { // from class: av4
                        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                        /* JADX WARN: Code duplicated, block: B:18:0x0044  */
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i5 = i2;
                            xfa xfaVar2 = xfa.f68157a;
                            aj3 aj3Var2 = aj3Var;
                            ye1 ye1Var2 = (ye1) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            switch (i5) {
                                case 0:
                                    if ((iIntValue & 3) != 2) {
                                        aj3Var2.invoke(new cv4(), ye1Var2, 0);
                                    } else {
                                        tj3 tj3Var2 = (tj3) ye1Var2;
                                        if (!tj3Var2.m22086D()) {
                                            aj3Var2.invoke(new cv4(), ye1Var2, 0);
                                        } else {
                                            tj3Var2.m22102U();
                                        }
                                    }
                                    break;
                                default:
                                    if ((iIntValue & 3) != 2) {
                                        aj3Var2.invoke(new cv4(), ye1Var2, 0);
                                    } else {
                                        tj3 tj3Var3 = (tj3) ye1Var2;
                                        if (!tj3Var3.m22086D()) {
                                            aj3Var2.invoke(new cv4(), ye1Var2, 0);
                                        } else {
                                            tj3Var3.m22102U();
                                        }
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, ye1Var), ye1Var, 384);
                    i3 = i4;
                }
                return xfaVar;
            default:
                ye1 ye1Var2 = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22086D()) {
                        tj3Var2.m22102U();
                        return xfaVar;
                    }
                }
                for (Object obj4 : arrayList) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    Pair pair2 = (Pair) obj4;
                    Long l2 = (Long) pair2.f47623a;
                    final aj3 aj3Var2 = (aj3) pair2.f47624b;
                    if (l2 != null && l2.longValue() == Long.MIN_VALUE) {
                        l2 = null;
                    }
                    long jLongValue2 = l2 != null ? l2.longValue() : (-4611686018427387904L) - ((long) i2);
                    if (jLongValue2 == Long.MIN_VALUE) {
                        C3386nv.m17633t("Implicit list item ids exhausted.");
                        return null;
                    }
                    final int i6 = 1;
                    AbstractC0665a.m2259d(jLongValue2, this.f72177c, ci8.m4703P(-563840653, new zi3() { // from class: av4
                        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                        /* JADX WARN: Code duplicated, block: B:18:0x0044  */
                        @Override // p000.zi3
                        public final Object invoke(Object obj5, Object obj6) {
                            int i7 = i6;
                            xfa xfaVar2 = xfa.f68157a;
                            aj3 aj3Var3 = aj3Var2;
                            ye1 ye1Var3 = (ye1) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            switch (i7) {
                                case 0:
                                    if ((iIntValue & 3) != 2) {
                                        aj3Var3.invoke(new cv4(), ye1Var3, 0);
                                    } else {
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (!tj3Var3.m22086D()) {
                                            aj3Var3.invoke(new cv4(), ye1Var3, 0);
                                        } else {
                                            tj3Var3.m22102U();
                                        }
                                    }
                                    break;
                                default:
                                    if ((iIntValue & 3) != 2) {
                                        aj3Var3.invoke(new cv4(), ye1Var3, 0);
                                    } else {
                                        tj3 tj3Var4 = (tj3) ye1Var3;
                                        if (!tj3Var4.m22086D()) {
                                            aj3Var3.invoke(new cv4(), ye1Var3, 0);
                                        } else {
                                            tj3Var4.m22102U();
                                        }
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, ye1Var2), ye1Var2, 384);
                    i2 = i5;
                }
                return xfaVar;
        }
    }
}
