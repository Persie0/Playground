package p000;

import android.content.res.Resources;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.playlist.AbstractC2253c;
import com.lingq.feature.playlist.PlaylistActionMenuItem;
import com.lingq.feature.playlist.R$string;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ws0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67216a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f67217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67218c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67219d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f67220e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f67221f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f67222g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f67223h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f67224i;

    public /* synthetic */ ws0(et0 et0Var, ui3 ui3Var, mp7 mp7Var, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var2, ui3 ui3Var3, ui3 ui3Var4) {
        this.f67218c = et0Var;
        this.f67219d = ui3Var;
        this.f67223h = mp7Var;
        this.f67217b = vi3Var;
        this.f67224i = vi3Var2;
        this.f67220e = ui3Var2;
        this.f67221f = ui3Var3;
        this.f67222g = ui3Var4;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strM23620a0;
        int i = this.f67216a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        Object obj4 = this.f67224i;
        Object obj5 = this.f67223h;
        Object obj6 = this.f67222g;
        Object obj7 = this.f67221f;
        Object obj8 = this.f67220e;
        Object obj9 = this.f67219d;
        Object obj10 = this.f67218c;
        switch (i) {
            case 0:
                et0 et0Var = (et0) obj10;
                ui3 ui3Var = (ui3) obj9;
                mp7 mp7Var = (mp7) obj5;
                vi3 vi3Var = (vi3) obj4;
                ui3 ui3Var2 = (ui3) obj8;
                ui3 ui3Var3 = (ui3) obj7;
                ui3 ui3Var4 = (ui3) obj6;
                t17 t17Var = (t17) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp7.m16424b(et0Var.f37789c, ui3Var, AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var), mp7Var, null, null, false, 0.0f, ci8.m4703P(699247452, new ys0(et0Var, this.f67217b, vi3Var, ui3Var2, ui3Var3, ui3Var4), tj3Var), tj3Var, 100663296, 240);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                du7 du7Var = (du7) obj10;
                wz7 wz7Var = (wz7) obj9;
                tpa tpaVar = (tpa) obj8;
                un1 un1Var = (un1) obj7;
                t66 t66Var = (t66) obj6;
                t66 t66Var2 = (t66) obj5;
                t66 t66Var3 = (t66) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                tj3 tj3Var2 = (tj3) ye1Var2;
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(ye1Var2, e16VarM4412e);
                se1.f60731q.getClass();
                ui3 ui3Var5 = C0352b.f4299b;
                tj3 tj3Var3 = (tj3) ye1Var2;
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var5);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(ye1Var2, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(ye1Var2, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(ye1Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(ye1Var2, C0352b.f4305h);
                oha.m18001g(ye1Var2, C0352b.f4301d, e16VarM1322c);
                qh0.m19963a(d32.m10006C(c99.m4414g(c99.m4412e(b16Var, 1.0f), 120.0f), ui0.m22749e(vi0.Companion, vz1.m23605K(new aa1(aa1.m198b(0.6f, aa1.f403b)), new aa1(aa1.f411j)), 0.0f, 0.0f, 14)), ye1Var2, 6);
                ps5.m19472c(ra1.m20490c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), null, null, ci8.m4703P(-1616542830, new mo1(du7Var, wz7Var, tpaVar, this.f67217b, un1Var, t66Var, t66Var2, t66Var3), ye1Var2), ye1Var2, 3072);
                tj3Var3.m22139q(true);
                return xfaVar;
            default:
                t66 t66Var4 = (t66) obj10;
                t66 t66Var5 = (t66) obj9;
                Resources resources = (Resources) obj8;
                t66 t66Var6 = (t66) obj7;
                ze7 ze7Var = (ze7) obj6;
                sc9 sc9Var = (sc9) obj5;
                t66 t66Var7 = (t66) obj4;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var3;
                if (tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zBooleanValue = ((Boolean) t66Var4.getValue()).booleanValue();
                    vi3 vi3Var2 = this.f67217b;
                    p84 p84Var = we1.f66679a;
                    if (zBooleanValue) {
                        tj3Var4.m22111b0(-968620636);
                        boolean zM22120g = tj3Var4.m22120g(vi3Var2);
                        Object objM22097O = tj3Var4.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new et6(vi3Var2, 26);
                            tj3Var4.m22131l0(objM22097O);
                        }
                        AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O, cgc.f10037c, null, null, null, false);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(-968072835);
                        if (((Boolean) t66Var5.getValue()).booleanValue()) {
                            tj3Var4.m22111b0(-968172624);
                            boolean zM22120g2 = tj3Var4.m22120g(vi3Var2);
                            Object objM22097O2 = tj3Var4.m22097O();
                            if (zM22120g2 || objM22097O2 == p84Var) {
                                objM22097O2 = new et6(vi3Var2, 27);
                                tj3Var4.m22131l0(objM22097O2);
                            }
                            omd.m18141c((ui3) objM22097O2, null, false, null, null, cgc.f10038d, tj3Var4, 1572864, 62);
                            tj3Var4.m22139q(false);
                        } else {
                            tj3Var4.m22111b0(-967733447);
                            tj3Var4.m22139q(false);
                        }
                        ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                        int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m2 = tj3Var4.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, b16Var);
                        se1.f60731q.getClass();
                        ui3 ui3Var6 = C0352b.f4299b;
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var6);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, C0352b.f4303f, ht5VarM19966d2);
                        oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m2);
                        oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode2));
                        oha.m18000f(tj3Var4, C0352b.f4305h);
                        oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c2);
                        Object objM22097O3 = tj3Var4.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new do4(20, t66Var6);
                            tj3Var4.m22131l0(objM22097O3);
                        }
                        omd.m18141c((ui3) objM22097O3, null, false, null, null, cgc.f10039e, tj3Var4, 1572870, 62);
                        boolean zBooleanValue2 = ((Boolean) t66Var6.getValue()).booleanValue();
                        tj3Var4.m22111b0(-1088076667);
                        ys2 entries = PlaylistActionMenuItem.getEntries();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj11 : entries) {
                            if (((PlaylistActionMenuItem) obj11) != PlaylistActionMenuItem.Archive || ze7Var.mo23859c()) {
                                arrayList.add(obj11);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int i2 = re7.f59163b[((PlaylistActionMenuItem) it.next()).ordinal()];
                            if (i2 == 1) {
                                tj3Var4.m22111b0(320036505);
                                strM23620a0 = vz1.m23620a0(tj3Var4, R$string.texts_download_all);
                                tj3Var4.m22139q(false);
                            } else if (i2 == 2) {
                                tj3Var4.m22111b0(320040408);
                                strM23620a0 = vz1.m23620a0(tj3Var4, com.lingq.core.p012ui.R$string.content_archive);
                                tj3Var4.m22139q(false);
                            } else if (i2 == 3) {
                                tj3Var4.m22111b0(320044565);
                                strM23620a0 = vz1.m23618Z(R$string.playlists_remove_files, new Object[]{Integer.valueOf(sc9Var.m21222h())}, tj3Var4);
                                tj3Var4.m22139q(false);
                            } else {
                                if (i2 != 4) {
                                    throw ux5.m23001x(tj3Var4, 320034668, false);
                                }
                                tj3Var4.m22111b0(1331743285);
                                strM23620a0 = vz1.m23620a0(tj3Var4, ((Boolean) t66Var7.getValue()).booleanValue() ? R$string.playlists_enable_downloads : R$string.playlists_disable_downloads);
                                tj3Var4.m22139q(false);
                            }
                            arrayList2.add(strM23620a0);
                        }
                        tj3Var4.m22139q(false);
                        Object objM22097O4 = tj3Var4.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new do4(21, t66Var6);
                            tj3Var4.m22131l0(objM22097O4);
                        }
                        ui3 ui3Var7 = (ui3) objM22097O4;
                        boolean zM22124i = tj3Var4.m22124i(resources) | tj3Var4.m22120g(vi3Var2);
                        Object objM22097O5 = tj3Var4.m22097O();
                        if (zM22124i || objM22097O5 == p84Var) {
                            objM22097O5 = new h85(27, resources, vi3Var2);
                            tj3Var4.m22131l0(objM22097O5);
                        }
                        AbstractC2253c.m9227m(3072, tj3Var4, ui3Var7, (vi3) objM22097O5, null, arrayList2, zBooleanValue2);
                        tj3Var4.m22139q(true);
                        tj3Var4.m22139q(false);
                    }
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ ws0(vi3 vi3Var, t66 t66Var, t66 t66Var2, Resources resources, t66 t66Var3, ze7 ze7Var, sc9 sc9Var, t66 t66Var4) {
        this.f67217b = vi3Var;
        this.f67218c = t66Var;
        this.f67219d = t66Var2;
        this.f67220e = resources;
        this.f67221f = t66Var3;
        this.f67222g = ze7Var;
        this.f67223h = sc9Var;
        this.f67224i = t66Var4;
    }

    public /* synthetic */ ws0(du7 du7Var, wz7 wz7Var, tpa tpaVar, vi3 vi3Var, un1 un1Var, t66 t66Var, t66 t66Var2, t66 t66Var3) {
        this.f67218c = du7Var;
        this.f67219d = wz7Var;
        this.f67220e = tpaVar;
        this.f67217b = vi3Var;
        this.f67221f = un1Var;
        this.f67222g = t66Var;
        this.f67223h = t66Var2;
        this.f67224i = t66Var3;
    }
}
