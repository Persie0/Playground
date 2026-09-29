package p000;

import android.util.Log;
import androidx.compose.p002ui.draw.C0296c;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.glance.appwidget.R$drawable;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cz1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f34730b;

    public /* synthetic */ cz1(int i, boolean z) {
        this.f34729a = i;
        this.f34730b = z;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        zp2 zp2Var;
        zp2 zp2Var2;
        int i = this.f34729a;
        eq7 eq7VarM22748d = null;
        boolean z = this.f34730b;
        switch (i) {
            case 0:
                C0296c c0296c = (C0296c) obj;
                c0296c.getClass();
                xc5 xc5VarM22749e = z ? ui0.m22749e(vi0.Companion, vz1.m23605K(new aa1(xs1.f68616i), new aa1(xs1.f68617j)), 0.0f, 0.0f, 14) : ui0.m22750f(vi0.Companion, new Pair[]{new Pair(Float.valueOf(0.07f), new aa1(xs1.f68612e)), new Pair(Float.valueOf(0.51f), new aa1(xs1.f68613f)), new Pair(Float.valueOf(0.96f), new aa1(xs1.f68614g))});
                if (!z) {
                    ui0 ui0Var = vi0.Companion;
                    long j = xs1.f68615h;
                    eq7VarM22748d = ui0.m22748d(ui0Var, vz1.m23605K(new aa1(j), new aa1(aa1.m198b(0.0f, j))), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0296c.f3864a.mo1347h() & 4294967295L)) * 0.1f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0296c.f3864a.mo1347h() >> 32)) * 0.22f)) << 32), Float.intBitsToFloat((int) (c0296c.f3864a.mo1347h() >> 32)) * 0.55f);
                }
                return c0296c.m1348b(new s70(28, xc5VarM22749e, eq7VarM22748d));
            case 1:
                vp2 vp2Var = (vp2) obj;
                mn3 mn3Var = mn3.f51554a;
                if (z && !(vp2Var instanceof gq2) && vp2Var.mo2977a().mo11687c(new lz5(15))) {
                    vp2Var.mo2978b((on3) vp2Var.mo2977a().mo11685a(mn3Var, uz3.f64596N));
                }
                boolean z2 = vp2Var instanceof bq2;
                if (z2) {
                    bq2 bq2Var = (bq2) vp2Var;
                    ArrayList arrayList = bq2Var.f45997c;
                    wp2 wp2Var = new wp2();
                    u91.m22630w0(arrayList, wp2Var.f45997c);
                    wp2Var.f67150e = bq2Var.f8864d;
                    wp2Var.f67149d = bq2Var.mo2977a();
                    arrayList.clear();
                    arrayList.add(wp2Var);
                    bq2Var.f8864d = C3532re.f59145e;
                }
                if (!z2 && !(vp2Var instanceof gq2)) {
                    int i2 = 16;
                    if (vp2Var.mo2977a().mo11687c(new lz5(16))) {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        on3 on3VarMo2977a = vp2Var.mo2977a();
                        Pair pair = on3VarMo2977a.mo11687c(cm6.f10273c) ? (Pair) on3VarMo2977a.mo11685a(new Pair(null, mn3Var), uz3.f64597O) : new Pair(null, on3VarMo2977a);
                        o70 o70Var = (o70) pair.f47623a;
                        on3 on3Var = (on3) pair.f47624b;
                        if (o70Var == null) {
                            zp2Var = null;
                        } else if (o70Var instanceof n70) {
                            zp2Var = new zp2();
                            zp2Var.f71931a = ci8.m4734s(mn3Var);
                            n70 n70Var = (n70) o70Var;
                            zp2Var.f71932b = n70Var.f52425a;
                            zp2Var.f71935e = 2;
                            ea1 ea1Var = n70Var.f52426b;
                            zp2Var.f71933c = ea1Var != null ? ea1Var.f36898a : null;
                            zp2Var.f71934d = null;
                        } else {
                            if (!(o70Var instanceof m70)) {
                                gm5.m12750e();
                                return null;
                            }
                            arrayList3.add(o70Var);
                            zp2Var = null;
                        }
                        if (((Number) on3Var.mo11685a(0, new yu4(i2))).intValue() > 1) {
                            Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                        }
                        Pair pair2 = on3Var.mo11687c(cm6.f10274d) ? (Pair) on3Var.mo11685a(new Pair(null, mn3Var), uz3.f64598P) : new Pair(null, on3Var);
                        C0836c6 c0836c6 = (C0836c6) pair2.f47623a;
                        on3 on3Var2 = (on3) pair2.f47624b;
                        arrayList2.add(c0836c6);
                        if (c0836c6 != null) {
                            int i3 = c0836c6.f9604b;
                            C0850ck c0850ck = i3 != 0 ? new C0850ck(i3) : new C0850ck(R$drawable.glance_ripple);
                            zp2Var2 = new zp2();
                            zp2Var2.f71931a = ci8.m4734s(mn3Var);
                            zp2Var2.f71932b = c0850ck;
                        } else {
                            zp2Var2 = null;
                        }
                        gy2 gy2Var = on3Var2.mo11687c(new lz5(17)) ? (gy2) on3Var2.mo11685a(new gy2((on3) null, 3), new yu4(17)) : new gy2(on3Var2, 1);
                        on3 on3Var3 = gy2Var.f41519a;
                        on3 on3Var4 = gy2Var.f41520b;
                        arrayList2.add(on3Var3);
                        arrayList3.add(ci8.m4734s(on3Var4));
                        wp2 wp2Var2 = new wp2();
                        wp2Var2.f67149d = rsb.m20769a(arrayList2);
                        vp2Var.mo2978b(rsb.m20769a(arrayList3));
                        ArrayList arrayList4 = wp2Var2.f45997c;
                        if (zp2Var != null) {
                            arrayList4.add(zp2Var);
                        }
                        arrayList4.add(vp2Var);
                        if (zp2Var2 == null) {
                            return wp2Var2;
                        }
                        arrayList4.add(zp2Var2);
                        return wp2Var2;
                    }
                }
                return vp2Var;
            case 2:
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
                librarySearchQuery.getClass();
                return LibrarySearchQuery.m8091a(librarySearchQuery, null, null, null, null, null, null, null, this.f34730b, 4095);
            case 3:
                tv8 tv8Var = (tv8) obj;
                tv8Var.getClass();
                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                C0427g c0427g = AbstractC0424d.f4986J;
                bh4 bh4Var = AbstractC0426f.f5022a[23];
                tv8Var.mo3709d(c0427g, Boolean.valueOf(z));
                AbstractC0426f.m1864h(tv8Var, 3);
                return xfa.f68157a;
            default:
                n1b n1bVar = (n1b) obj;
                n1bVar.getClass();
                return n1b.m17171a(n1bVar, null, null, null, null, null, false, false, this.f34730b, false, null, null, 1919);
        }
    }
}
