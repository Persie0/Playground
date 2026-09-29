package p000;

import android.util.Base64;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.media3.common.ParserException;
import com.lingq.core.p012ui.dragdrop.C1919b;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lbd {
    /* JADX INFO: renamed from: a */
    public static final void m16061a(e16 e16Var, final C1919b c1919b, int i, C0282a c0282a, ye1 ye1Var, int i2) {
        e16 e16Var2;
        e16 e16VarM1406a;
        c1919b.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1639810116);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22124i(c1919b) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22116e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var.m22124i(c0282a) ? 2048 : 1024;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            Integer numM8797a = c1919b.m8797a();
            int iIntValue = (numM8797a != null ? numM8797a.intValue() : 0) - 1;
            p84 p84Var = we1.f66679a;
            b16 b16Var = b16.f7762a;
            if (i == iIntValue) {
                tj3Var.m22111b0(-624864437);
                e16 e16VarM13200b = hcd.m13200b(b16Var, 1.0f);
                boolean zM22124i = tj3Var.m22124i(c1919b);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == p84Var) {
                    objM22097O = new vi3() { // from class: gl2
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            Object next;
                            float fM19861h;
                            int i6 = i4;
                            xfa xfaVar = xfa.f68157a;
                            C1919b c1919b2 = c1919b;
                            q98 q98Var = (q98) obj;
                            switch (i6) {
                                case 0:
                                    q98Var.getClass();
                                    Iterator it = c1919b2.f23968a.m980j().f42985k.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            int i7 = ((iv4) next).f44648a;
                                            Integer numM8797a2 = c1919b2.m8797a();
                                            if (numM8797a2 != null && i7 == numM8797a2.intValue()) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    iv4 iv4Var = (iv4) next;
                                    if (iv4Var != null) {
                                        fM19861h = (c1919b2.f23971d.m19861h() + c1919b2.f23972e.m21222h()) - iv4Var.f44662o;
                                    } else {
                                        fM19861h = 0.0f;
                                    }
                                    q98Var.m19811D(fM19861h);
                                    break;
                                default:
                                    q98Var.getClass();
                                    q98Var.m19811D(((Number) c1919b2.f23974g.m745d()).floatValue());
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                }
                e16VarM1406a = AbstractC0309d.m1406a(e16VarM13200b, (vi3) objM22097O);
                tj3Var.m22139q(false);
            } else {
                Integer num = (Integer) ((xc9) c1919b.f23973f).getValue();
                if (num != null && i == num.intValue()) {
                    tj3Var.m22111b0(-624649979);
                    e16 e16VarM13200b2 = hcd.m13200b(b16Var, 1.0f);
                    boolean zM22124i2 = tj3Var.m22124i(c1919b);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new vi3() { // from class: gl2
                            @Override // p000.vi3
                            public final Object invoke(Object obj) {
                                Object next;
                                float fM19861h;
                                int i6 = i5;
                                xfa xfaVar = xfa.f68157a;
                                C1919b c1919b2 = c1919b;
                                q98 q98Var = (q98) obj;
                                switch (i6) {
                                    case 0:
                                        q98Var.getClass();
                                        Iterator it = c1919b2.f23968a.m980j().f42985k.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                int i7 = ((iv4) next).f44648a;
                                                Integer numM8797a2 = c1919b2.m8797a();
                                                if (numM8797a2 != null && i7 == numM8797a2.intValue()) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        iv4 iv4Var = (iv4) next;
                                        if (iv4Var != null) {
                                            fM19861h = (c1919b2.f23971d.m19861h() + c1919b2.f23972e.m21222h()) - iv4Var.f44662o;
                                        } else {
                                            fM19861h = 0.0f;
                                        }
                                        q98Var.m19811D(fM19861h);
                                        break;
                                    default:
                                        q98Var.getClass();
                                        q98Var.m19811D(((Number) c1919b2.f23974g.m745d()).floatValue());
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e16VarM1406a = AbstractC0309d.m1406a(e16VarM13200b2, (vi3) objM22097O2);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-624488562);
                    tj3Var.m22139q(false);
                    e16VarM1406a = b16Var;
                }
            }
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM1406a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            c0282a.invoke(ci0.f10109a, tj3Var, Integer.valueOf(6 | ((i3 >> 6) & 112)));
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz1(e16Var2, c1919b, i, c0282a, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m16062b(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    /* JADX INFO: renamed from: c */
    public static ey5 m16063c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = uma.f64080a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                ss5.m21707d0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(h87.m13141d(new k47(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    ss5.m21709e0("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new x1b(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ey5(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static nha m16064d(k47 k47Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            m16065e(3, k47Var, false);
        }
        k47Var.m14840x((int) k47Var.m14833q(), StandardCharsets.UTF_8);
        long jM14833q = k47Var.m14833q();
        String[] strArr = new String[(int) jM14833q];
        for (int i = 0; i < jM14833q; i++) {
            strArr[i] = k47Var.m14840x((int) k47Var.m14833q(), StandardCharsets.UTF_8);
        }
        if (z2 && (k47Var.m14842z() & 1) == 0) {
            throw ParserException.m2516a(null, "framing bit expected to be set");
        }
        return new nha(strArr);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16065e(int i, k47 k47Var, boolean z) throws ParserException {
        if (k47Var.m14820a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.m2516a(null, "too short header: " + k47Var.m14820a());
        }
        if (k47Var.m14842z() != i) {
            if (z) {
                return false;
            }
            throw ParserException.m2516a(null, "expected header type " + Integer.toHexString(i));
        }
        if (k47Var.m14842z() == 118 && k47Var.m14842z() == 111 && k47Var.m14842z() == 114 && k47Var.m14842z() == 98 && k47Var.m14842z() == 105 && k47Var.m14842z() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.m2516a(null, "expected characters 'vorbis'");
    }
}
