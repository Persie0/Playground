package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: renamed from: ye */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1143ye implements Comparator {

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f48120d;

    /* JADX INFO: renamed from: a */
    public static final Comparator f48117a = new C1143ye(11);

    /* JADX INFO: renamed from: c */
    public static final C1143ye f48119c = new C1143ye(10);

    /* JADX INFO: renamed from: b */
    public static final C1143ye f48118b = new C1143ye(9);

    public C1143ye(int i) {
        this.f48120d = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int iM2811b;
        int iM2811b2;
        int length;
        int iSignum;
        int i = 0;
        switch (this.f48120d) {
            case 0:
                return ((C1146yh) obj).f48129c - ((C1146yh) obj2).f48129c;
            case 1:
                C0779ks c0779ks = (C0779ks) obj;
                C0779ks c0779ks2 = (C0779ks) obj2;
                RecyclerView recyclerView = c0779ks.f37106d;
                if ((recyclerView == null) != (c0779ks2.f37106d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z = c0779ks.f37103a;
                if (z != c0779ks2.f37103a) {
                    return z ? -1 : 1;
                }
                int i2 = c0779ks2.f37104b - c0779ks.f37104b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c0779ks.f37105c - c0779ks2.f37105c;
                if (i3 == 0) {
                    return 0;
                }
                return i3;
            case 2:
                float fM472c = afh.m472c((View) obj);
                float fM472c2 = afh.m472c((View) obj2);
                if (fM472c > fM472c2) {
                    return -1;
                }
                return fM472c < fM472c2 ? 1 : 0;
            case 3:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 4:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                int i4 = iArr[0];
                int i5 = iArr2[0];
                return i4 == i5 ? iArr[1] - iArr2[1] : i4 - i5;
            case 5:
                bon bonVar = (bon) obj;
                bon bonVar2 = (bon) obj2;
                if (bonVar.m2811b() == bonVar2.m2811b()) {
                    iM2811b = bonVar.m2810a();
                    iM2811b2 = bonVar2.m2810a();
                } else {
                    iM2811b = bonVar.m2811b();
                    iM2811b2 = bonVar2.m2811b();
                }
                return iM2811b - iM2811b2;
            case 6:
                kbc kbcVar = (kbc) obj;
                kbc kbcVar2 = (kbc) obj2;
                return (kbcVar2.f35517a * kbcVar2.f35518b) - (kbcVar.f35517a * kbcVar.f35518b);
            case 7:
                return ((Scope) obj).f7600b.compareTo(((Scope) obj2).f7600b);
            case 8:
                long jM13660a = ((jxp) obj).m13660a();
                long jM13660a2 = ((jxp) obj2).m13660a();
                if (jM13660a < jM13660a2) {
                    return 1;
                }
                return jM13660a > jM13660a2 ? -1 : 0;
            case 9:
                kbc kbcVar3 = (kbc) obj;
                kbc kbcVar4 = (kbc) obj2;
                long jM13905b = kbcVar3.m13905b();
                long jM13905b2 = kbcVar4.m13905b();
                int iM13917f = (jM13905b > jM13905b2 ? 1 : (jM13905b == jM13905b2 ? 0 : -1));
                if (jM13905b == jM13905b2) {
                    iM13917f = kbd.m13917f(Math.min(kbcVar3.f35517a, kbcVar3.f35518b), Math.min(kbcVar4.f35517a, kbcVar4.f35518b));
                }
                return iM13917f == 0 ? kbd.m13917f(kbcVar3.f35517a, kbcVar4.f35517a) : iM13917f;
            case 10:
                return (((kgs) obj).m14220r() > ((kgs) obj2).m14220r() ? 1 : (((kgs) obj).m14220r() == ((kgs) obj2).m14220r() ? 0 : -1));
            case 11:
                return kjv.f36311a.compare(((kjs) obj).f36306b, ((kjs) obj2).f36306b);
            default:
                pbn pbnVar = (pbn) obj;
                pbn pbnVar2 = (pbn) obj2;
                if ("Fallback-Cronet-Provider".equals(pbnVar.m19306a())) {
                    return 1;
                }
                if ("Fallback-Cronet-Provider".equals(pbnVar2.m19306a())) {
                    return -1;
                }
                String strM19307b = pbnVar.m19307b();
                String strM19307b2 = pbnVar2.m19307b();
                if (strM19307b == null || strM19307b2 == null) {
                    throw new IllegalArgumentException("The input values cannot be null");
                }
                String[] strArrSplit = strM19307b.split("\\.");
                String[] strArrSplit2 = strM19307b2.split("\\.");
                while (true) {
                    length = strArrSplit.length;
                    if (i < length && i < strArrSplit2.length) {
                        try {
                            int i6 = Integer.parseInt(strArrSplit[i]);
                            int i7 = Integer.parseInt(strArrSplit2[i]);
                            if (i6 != i7) {
                                iSignum = Integer.signum(i6 - i7);
                            } else {
                                i++;
                            }
                        } catch (NumberFormatException e) {
                            throw new IllegalArgumentException("Unable to convert version segments into integers: " + strArrSplit[i] + " & " + strArrSplit2[i], e);
                        }
                        break;
                    }
                    return -iSignum;
                }
                iSignum = Integer.signum(length - strArrSplit2.length);
                return -iSignum;
        }
    }
}
