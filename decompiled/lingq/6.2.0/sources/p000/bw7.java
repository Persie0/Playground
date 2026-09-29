package p000;

import android.os.Bundle;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.feature.reader.old.C2401c;
import com.lingq.feature.reader.old.ReaderFragment;
import p000.b34;
import p000.bh4;
import p000.id3;
import p000.lda;
import p000.mbd;
import p000.t66;
import p000.ux4;
import p000.vx4;
import p000.wfb;
import p000.xfa;
import p000.xx4;
import p000.yx4;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bw7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f9098b;

    public /* synthetic */ bw7(ReaderFragment readerFragment, int i) {
        this.f9097a = i;
        this.f9098b = readerFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9097a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        final ReaderFragment readerFragment = this.f9098b;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(328380053, new bw7(readerFragment, 6), tj3Var), tj3Var, 384);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(564549876, new bw7(readerFragment, 4), tj3Var2), tj3Var2, 384);
                }
                break;
            case 2:
                String str = (String) obj;
                Bundle bundle = (Bundle) obj2;
                bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                str.getClass();
                bundle.getClass();
                if (str.equals("lessonEdit") && bundle.getBoolean("lessonEdit")) {
                    readerFragment.m9290W0().m9336p3(false);
                }
                break;
            case 3:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(800719699, new bw7(readerFragment, 7), tj3Var3), tj3Var3, 384);
                }
                break;
            case 4:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(readerFragment.m9290W0().f29281H0, tj3Var4);
                    xx1.m24789a(((s08) t66VarM2513c.getValue()).f60141a, ((s08) t66VarM2513c.getValue()).f60142b / 100.0f, tj3Var4, 0);
                }
                break;
            case 5:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    boolean zBooleanValue = ((Boolean) AbstractC0711a.m2513c(readerFragment.m9290W0().f29395p0, tj3Var5).getValue()).booleanValue();
                    boolean zM22124i = tj3Var5.m22124i(readerFragment);
                    Object objM22097O = tj3Var5.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new vi3() { // from class: dw7
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                int i4 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                ReaderFragment readerFragment2 = readerFragment;
                                switch (i4) {
                                    case 0:
                                        String str2 = (String) obj3;
                                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                                        str2.getClass();
                                        mbd.m16755c(readerFragment2.m2089Q(), str2, null, 30);
                                        break;
                                    default:
                                        int iIntValue6 = ((Integer) obj3).intValue();
                                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                                        readerFragment2.m9290W0().m9343w3(iIntValue6);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var5.m22131l0(objM22097O);
                    }
                    vi3 vi3Var = (vi3) objM22097O;
                    boolean zM22124i2 = tj3Var5.m22124i(readerFragment);
                    Object objM22097O2 = tj3Var5.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new aw7(readerFragment, 2);
                        tj3Var5.m22131l0(objM22097O2);
                    }
                    u4d.m22468c(zBooleanValue, vi3Var, (ui3) objM22097O2, tj3Var5, 0);
                }
                break;
            case 6:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    tn7 tn7Var = (tn7) AbstractC0711a.m2513c(readerFragment.m9290W0().f29375j2, tj3Var6).getValue();
                    if (tn7Var != null) {
                        tj3Var6.m22111b0(-1165189494);
                        boolean zM22124i3 = tj3Var6.m22124i(readerFragment);
                        Object objM22097O3 = tj3Var6.m22097O();
                        if (zM22124i3 || objM22097O3 == p84Var) {
                            objM22097O3 = new vi3() { // from class: dw7
                                @Override // p000.vi3
                                public final Object invoke(Object obj3) {
                                    int i4 = i3;
                                    xfa xfaVar2 = xfa.f68157a;
                                    ReaderFragment readerFragment2 = readerFragment;
                                    switch (i4) {
                                        case 0:
                                            String str2 = (String) obj3;
                                            bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                                            str2.getClass();
                                            mbd.m16755c(readerFragment2.m2089Q(), str2, null, 30);
                                            break;
                                        default:
                                            int iIntValue7 = ((Integer) obj3).intValue();
                                            bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                                            readerFragment2.m9290W0().m9343w3(iIntValue7);
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            };
                            tj3Var6.m22131l0(objM22097O3);
                        }
                        thc.m22068a(tn7Var, (vi3) objM22097O3, tj3Var6, 0, 0);
                        tj3Var6.m22139q(false);
                    } else {
                        tj3Var6.m22111b0(-1165189495);
                        tj3Var6.m22139q(false);
                    }
                }
                break;
            case 7:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    t66 t66VarM2513c2 = AbstractC0711a.m2513c(readerFragment.m9290W0().f29297M1, tj3Var7);
                    t66 t66VarM2513c3 = AbstractC0711a.m2513c(readerFragment.m9290W0().f29383l2, tj3Var7);
                    boolean zBooleanValue2 = ((Boolean) t66VarM2513c2.getValue()).booleanValue();
                    nz9 nz9Var = (nz9) t66VarM2513c3.getValue();
                    boolean zM22124i4 = tj3Var7.m22124i(readerFragment);
                    Object objM22097O4 = tj3Var7.m22097O();
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        objM22097O4 = new C2401c(i3, readerFragment);
                        tj3Var7.m22131l0(objM22097O4);
                    }
                    AbstractC1881a.m8679r(zBooleanValue2, nz9Var, (vi3) objM22097O4, null, null, false, tj3Var7, 64, 56);
                }
                break;
            case 8:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    final t66 t66VarM2512b = AbstractC0711a.m2512b(readerFragment.m9290W0().f29360g.mo9319C2(), xx4.f68925a, tj3Var8, 0);
                    boolean z = !(((yx4) t66VarM2512b.getValue()) instanceof xx4);
                    yx4 yx4Var = (yx4) t66VarM2512b.getValue();
                    boolean zM22124i5 = tj3Var8.m22124i(readerFragment);
                    Object objM22097O5 = tj3Var8.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        objM22097O5 = new aw7(readerFragment, 1);
                        tj3Var8.m22131l0(objM22097O5);
                    }
                    ui3 ui3Var = (ui3) objM22097O5;
                    boolean zM22124i6 = tj3Var8.m22124i(readerFragment) | tj3Var8.m22120g(t66VarM2512b);
                    Object objM22097O6 = tj3Var8.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        objM22097O6 = new ui3() { // from class: com.lingq.feature.reader.old.b
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                                ReaderFragment readerFragment2 = readerFragment;
                                C2412n c2412nM9290W0 = readerFragment2.m9290W0();
                                c2412nM9290W0.getClass();
                                c2412nM9290W0.f29360g.mo9326g2(xx4.f68925a);
                                t66 t66Var = t66VarM2512b;
                                yx4 yx4Var2 = (yx4) t66Var.getValue();
                                if (yx4Var2 instanceof ux4) {
                                    readerFragment2.f28225I0 = true;
                                    id3 id3VarM2089Q = readerFragment2.m2089Q();
                                    yx4 yx4Var3 = (yx4) t66Var.getValue();
                                    yx4Var3.getClass();
                                    String str2 = ((ux4) yx4Var3).f64488c;
                                    b34.m3244j(readerFragment2);
                                    mbd.m16755c(id3VarM2089Q, str2, null, 26);
                                } else if (yx4Var2 instanceof vx4) {
                                    yx4 yx4Var4 = (yx4) t66Var.getValue();
                                    yx4Var4.getClass();
                                    vx4 vx4Var = (vx4) yx4Var4;
                                    C2412n c2412nM9290W1 = readerFragment2.m9290W0();
                                    int i4 = vx4Var.f66044a;
                                    int i5 = vx4Var.f66046c;
                                    c2412nM9290W1.getClass();
                                    wfb.m23926u(lda.m16103C(c2412nM9290W1), null, null, new ReaderViewModel$buyLesson$1(c2412nM9290W1, i5, i4, null), 3);
                                }
                                return xfa.f68157a;
                            }
                        };
                        tj3Var8.m22131l0(objM22097O6);
                    }
                    b5d.m3323a(z, yx4Var, ui3Var, (ui3) objM22097O6, tj3Var8, 0);
                }
                break;
            case 9:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(-1462460723, new bw7(readerFragment, 8), tj3Var9), tj3Var9, 384);
                }
                break;
            default:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(92210230, new bw7(readerFragment, 5), tj3Var10), tj3Var10, 384);
                }
                break;
        }
        return xfaVar;
    }
}
