package com.lingq.core.player.video;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.viewinterop.AbstractC0443c;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.player.video.AbstractC1824e;
import com.lingq.core.player.video.C1823d;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.io.IOException;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3288l7;
import p000.C3445p2;
import p000.ac7;
import p000.d32;
import p000.e16;
import p000.gi5;
import p000.p84;
import p000.pbb;
import p000.qx3;
import p000.t66;
import p000.tj3;
import p000.ub5;
import p000.ui3;
import p000.vbb;
import p000.vi3;
import p000.vj6;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.player.video.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1824e {
    /* JADX WARN: Code duplicated, block: B:112:0x015c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:117:0x016b  */
    /* JADX WARN: Code duplicated, block: B:119:0x016f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x018c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:139:0x01db  */
    /* JADX WARN: Code duplicated, block: B:142:0x0209  */
    /* JADX WARN: Code duplicated, block: B:143:0x020c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0216  */
    /* JADX WARN: Code duplicated, block: B:150:0x022a  */
    /* JADX WARN: Code duplicated, block: B:151:0x022d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0240  */
    /* JADX WARN: Code duplicated, block: B:155:0x0243  */
    /* JADX WARN: Code duplicated, block: B:159:0x024e  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:173:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:177:0x0306  */
    /* JADX WARN: Code duplicated, block: B:178:0x0309  */
    /* JADX WARN: Code duplicated, block: B:181:0x0312  */
    /* JADX WARN: Code duplicated, block: B:187:0x0337  */
    /* JADX WARN: Code duplicated, block: B:191:0x0388  */
    /* JADX WARN: Code duplicated, block: B:193:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:196:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8502a(final e16 e16Var, final String str, pbb pbbVar, final ac7 ac7Var, final float f, boolean z, boolean z2, final String str2, final ui3 ui3Var, final vi3 vi3Var, final vi3 vi3Var2, final vi3 vi3Var3, ui3 ui3Var2, ye1 ye1Var, final int i, final int i2, final int i3) {
        int i4;
        float f2;
        boolean z3;
        boolean z4;
        int i5;
        boolean z5;
        pbb pbbVar2;
        final ui3 ui3Var3;
        boolean z6;
        final boolean z7;
        tj3 tj3Var;
        x18 x18VarM22143u;
        boolean z8;
        p84 p84Var;
        final ui3 ui3Var4;
        final Context context;
        final ub5 ub5Var;
        Object objM22097O;
        final vbb vbbVar;
        Object objM22097O2;
        t66 t66Var;
        Object objM22097O3;
        t66 t66Var2;
        Object objM22097O4;
        Object obj;
        final C1821b c1821b;
        t66 t66VarM1263m;
        final t66 t66VarM1263m2;
        t66 t66VarM1263m3;
        t66 t66VarM1263m4;
        boolean z9;
        Object objM22097O5;
        boolean z10;
        boolean z11;
        boolean z12;
        Object youtubePlayerKt$YoutubePlayer$3$1;
        p84 p84Var2;
        t66 t66Var3;
        t66 t66Var4;
        t66 t66Var5;
        char c;
        t66 t66Var6;
        t66 t66Var7;
        qx3 qx3Var;
        final vj6 vj6Var;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zM22124i;
        Object objM22097O6;
        vbb vbbVar2;
        ub5 ub5Var2;
        tj3 tj3Var2;
        boolean zM22124i2;
        Object objM22097O7;
        Object objM22097O8;
        str.getClass();
        ac7Var.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(-1548141439);
        if ((i & 6) == 0) {
            i4 = (tj3Var3.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= tj3Var3.m22120g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= tj3Var3.m22120g(pbbVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= tj3Var3.m22120g(ac7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f2 = f;
            i4 |= tj3Var3.m22114d(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 196608) == 0) {
                i4 |= tj3Var3.m22122h(z3) ? 131072 : 65536;
            }
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 1572864) == 0) {
                i4 |= tj3Var3.m22122h(z4) ? 1048576 : 524288;
            }
        }
        if ((i & 12582912) == 0) {
            i4 |= tj3Var3.m22120g(str2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= tj3Var3.m22124i(ui3Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= tj3Var3.m22124i(vi3Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (tj3Var3.m22124i(vi3Var2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= tj3Var3.m22124i(vi3Var3) ? 32 : 16;
        }
        int i8 = i5;
        int i9 = i3 & 4096;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                i8 |= tj3Var3.m22124i(ui3Var2) ? 256 : 128;
            }
            if ((i4 & 306783379) == 306783378 || (i8 & 147) != 146) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (tj3Var3.m22099R(i4 & 1, z5)) {
                if (i6 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i7 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                p84Var = we1.f66679a;
                if (i9 != 0) {
                    objM22097O8 = tj3Var3.m22097O();
                    if (objM22097O8 == p84Var) {
                        objM22097O8 = new C3288l7(7);
                        tj3Var3.m22131l0(objM22097O8);
                    }
                    ui3Var4 = (ui3) objM22097O8;
                } else {
                    ui3Var4 = ui3Var2;
                }
                context = (Context) tj3Var3.m22128k(AbstractC0394f.f4761b);
                ub5Var = (ub5) tj3Var3.m22128k(gi5.f40854a);
                objM22097O = tj3Var3.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new vbb();
                    tj3Var3.m22131l0(objM22097O);
                }
                vbbVar = (vbb) objM22097O;
                objM22097O2 = tj3Var3.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j(null);
                    tj3Var3.m22131l0(objM22097O2);
                }
                t66Var = (t66) objM22097O2;
                objM22097O3 = tj3Var3.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = AbstractC0278f.m1260j(null);
                    tj3Var3.m22131l0(objM22097O3);
                }
                t66Var2 = (t66) objM22097O3;
                objM22097O4 = tj3Var3.m22097O();
                obj = objM22097O4;
                if (objM22097O4 == p84Var) {
                    C1821b c1821b2 = new C1821b();
                    c1821b2.f22193a = YoutubePlaybackRateRestoration$State.IDLE;
                    tj3Var3.m22131l0(c1821b2);
                    obj = c1821b2;
                }
                c1821b = (C1821b) obj;
                t66VarM1263m = AbstractC0278f.m1263m(Boolean.valueOf(z6), tj3Var3);
                t66VarM1263m2 = AbstractC0278f.m1263m(str, tj3Var3);
                t66VarM1263m3 = AbstractC0278f.m1263m(Float.valueOf(f2), tj3Var3);
                t66VarM1263m4 = AbstractC0278f.m1263m(ac7Var, tj3Var3);
                if ((i4 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objM22097O5 = tj3Var3.m22097O();
                if (z9 || objM22097O5 == p84Var) {
                    objM22097O5 = new YoutubePlayerKt$YoutubePlayer$2$1(ac7Var, t66Var, null);
                    tj3Var3.m22131l0(objM22097O5);
                }
                d32.m10047k(tj3Var3, (zi3) objM22097O5, ac7Var);
                if ((i4 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean zM22120g = z10 | tj3Var3.m22120g(t66VarM1263m) | tj3Var3.m22120g(t66VarM1263m3);
                if ((234881024 & i4) == 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zM22120g;
                Object objM22097O9 = tj3Var3.m22097O();
                if (!z12 || objM22097O9 == p84Var) {
                    p84Var2 = p84Var;
                    t66Var3 = t66VarM1263m;
                    t66Var4 = t66Var2;
                    t66Var5 = t66VarM1263m4;
                    c = 0;
                    t66Var6 = t66VarM1263m3;
                    youtubePlayerKt$YoutubePlayer$3$1 = new YoutubePlayerKt$YoutubePlayer$3$1(pbbVar, ui3Var, t66Var, t66Var3, t66Var6, t66Var4, null);
                    pbbVar2 = pbbVar;
                    t66Var7 = t66Var;
                    tj3Var3.m22131l0(youtubePlayerKt$YoutubePlayer$3$1);
                } else {
                    p84Var2 = p84Var;
                    t66Var3 = t66VarM1263m;
                    t66Var5 = t66VarM1263m4;
                    t66Var4 = t66Var2;
                    c = 0;
                    pbbVar2 = pbbVar;
                    youtubePlayerKt$YoutubePlayer$3$1 = objM22097O9;
                    t66Var7 = t66Var;
                    t66Var6 = t66VarM1263m3;
                }
                d32.m10047k(tj3Var3, (zi3) youtubePlayerKt$YoutubePlayer$3$1, pbbVar2);
                qx3Var = new qx3(context);
                qx3Var.m20193b("https://" + context.getPackageName());
                if (str2 != null) {
                    m8504c(qx3Var, "hl", str2);
                }
                if (z8) {
                    m8504c(qx3Var, "controls", 1);
                }
                vj6Var = new vj6(qx3Var.f58334a, 20);
                boolean zM22124i3 = tj3Var3.m22124i(context) | tj3Var3.m22120g(t66Var3) | tj3Var3.m22120g(t66VarM1263m2) | tj3Var3.m22120g(t66Var6) | tj3Var3.m22120g(t66Var5);
                if ((i8 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM22124i4 = zM22124i3 | z13 | tj3Var3.m22124i(c1821b);
                if ((i4 & 1879048192) == c) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z16 = zM22124i4 | z14;
                if ((i8 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM22124i = z16 | z15 | ((i8 & 112) == 32) | tj3Var3.m22124i(vj6Var) | tj3Var3.m22124i(vbbVar) | tj3Var3.m22124i(ub5Var);
                objM22097O6 = tj3Var3.m22097O();
                p84 p84Var3 = p84Var2;
                if (!zM22124i || objM22097O6 == p84Var3) {
                    final t66 t66Var8 = t66Var5;
                    final t66 t66Var9 = t66Var3;
                    final t66 t66Var10 = t66Var6;
                    final t66 t66Var11 = t66Var7;
                    final t66 t66Var12 = t66Var4;
                    objM22097O6 = new vi3() { // from class: rbb
                        @Override // p000.vi3
                        public final Object invoke(Object obj2) throws JSONException, IOException {
                            ((Context) obj2).getClass();
                            YouTubePlayerView youTubePlayerView = new YouTubePlayerView(context);
                            youTubePlayerView.setEnableAutomaticInitialization(false);
                            C1823d c1823d = new C1823d(ui3Var4, t66Var11, t66Var9, t66VarM1263m2, t66Var10, t66Var12, t66Var8, c1821b, vi3Var, vi3Var2, vi3Var3);
                            if (youTubePlayerView.f34327c) {
                                C3386nv.m17633t("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
                                return null;
                            }
                            youTubePlayerView.f34326b.m11385a(c1823d, false, vj6Var, null);
                            WebView webViewM8503b = AbstractC1824e.m8503b(youTubePlayerView);
                            if (webViewM8503b != null) {
                                String userAgentString = webViewM8503b.getSettings().getUserAgentString();
                                userAgentString.getClass();
                                if (vk9.m23380c0(userAgentString, "Mobile", false)) {
                                    webViewM8503b.getSettings().setUserAgentString(cl9.m4839V(userAgentString, " Mobile ", " "));
                                }
                            }
                            vbbVar.f65172a = youTubePlayerView;
                            ub5Var.mo256K().mo21323g(youTubePlayerView);
                            return youTubePlayerView;
                        }
                    };
                    vbbVar2 = vbbVar;
                    ub5Var2 = ub5Var;
                    t66Var7 = t66Var11;
                    tj3Var3.m22131l0(objM22097O6);
                } else {
                    vbbVar2 = vbbVar;
                    ub5Var2 = ub5Var;
                }
                int i10 = (i4 << 3) & 112;
                tj3Var2 = tj3Var3;
                AbstractC0443c.m1891b((vi3) objM22097O6, e16Var, null, tj3Var2, i10, 4);
                zM22124i2 = tj3Var2.m22124i(c1821b) | tj3Var2.m22124i(vbbVar2) | tj3Var2.m22124i(ub5Var2);
                objM22097O7 = tj3Var2.m22097O();
                if (zM22124i2 || objM22097O7 == p84Var3) {
                    objM22097O7 = new C3445p2(ub5Var2, vbbVar2, c1821b, t66Var7, 23);
                    tj3Var2.m22131l0(objM22097O7);
                }
                d32.m10041h(ub5Var2, (vi3) objM22097O7, tj3Var2);
                z7 = z8;
                ui3Var3 = ui3Var4;
                tj3Var = tj3Var2;
            } else {
                pbbVar2 = pbbVar;
                tj3 tj3Var4 = tj3Var3;
                tj3Var4.m22102U();
                ui3Var3 = ui3Var2;
                z6 = z3;
                z7 = z4;
                tj3Var = tj3Var4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                final pbb pbbVar3 = pbbVar2;
                final boolean z17 = z6;
                x18VarM22143u.f67642d = new zi3() { // from class: sbb
                    @Override // p000.zi3
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iM19383z = pk9.m19383z(i | 1);
                        int iM19383z2 = pk9.m19383z(i2);
                        AbstractC1824e.m8502a(e16Var, str, pbbVar3, ac7Var, f, z17, z7, str2, ui3Var, vi3Var, vi3Var2, vi3Var3, ui3Var3, (ye1) obj2, iM19383z, iM19383z2, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i8 |= 384;
        if ((i4 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (tj3Var3.m22099R(i4 & 1, z5)) {
            if (i6 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i7 != 0) {
                z8 = false;
            } else {
                z8 = z4;
            }
            p84Var = we1.f66679a;
            if (i9 != 0) {
                objM22097O8 = tj3Var3.m22097O();
                if (objM22097O8 == p84Var) {
                    objM22097O8 = new C3288l7(7);
                    tj3Var3.m22131l0(objM22097O8);
                }
                ui3Var4 = (ui3) objM22097O8;
            } else {
                ui3Var4 = ui3Var2;
            }
            context = (Context) tj3Var3.m22128k(AbstractC0394f.f4761b);
            ub5Var = (ub5) tj3Var3.m22128k(gi5.f40854a);
            objM22097O = tj3Var3.m22097O();
            if (objM22097O == p84Var) {
                objM22097O = new vbb();
                tj3Var3.m22131l0(objM22097O);
            }
            vbbVar = (vbb) objM22097O;
            objM22097O2 = tj3Var3.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(null);
                tj3Var3.m22131l0(objM22097O2);
            }
            t66Var = (t66) objM22097O2;
            objM22097O3 = tj3Var3.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(null);
                tj3Var3.m22131l0(objM22097O3);
            }
            t66Var2 = (t66) objM22097O3;
            objM22097O4 = tj3Var3.m22097O();
            obj = objM22097O4;
            if (objM22097O4 == p84Var) {
                C1821b c1821b3 = new C1821b();
                c1821b3.f22193a = YoutubePlaybackRateRestoration$State.IDLE;
                tj3Var3.m22131l0(c1821b3);
                obj = c1821b3;
            }
            c1821b = (C1821b) obj;
            t66VarM1263m = AbstractC0278f.m1263m(Boolean.valueOf(z6), tj3Var3);
            t66VarM1263m2 = AbstractC0278f.m1263m(str, tj3Var3);
            t66VarM1263m3 = AbstractC0278f.m1263m(Float.valueOf(f2), tj3Var3);
            t66VarM1263m4 = AbstractC0278f.m1263m(ac7Var, tj3Var3);
            if ((i4 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            objM22097O5 = tj3Var3.m22097O();
            if (z9) {
                objM22097O5 = new YoutubePlayerKt$YoutubePlayer$2$1(ac7Var, t66Var, null);
                tj3Var3.m22131l0(objM22097O5);
            } else {
                objM22097O5 = new YoutubePlayerKt$YoutubePlayer$2$1(ac7Var, t66Var, null);
                tj3Var3.m22131l0(objM22097O5);
            }
            d32.m10047k(tj3Var3, (zi3) objM22097O5, ac7Var);
            if ((i4 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean zM22120g2 = z10 | tj3Var3.m22120g(t66VarM1263m) | tj3Var3.m22120g(t66VarM1263m3);
            if ((234881024 & i4) == 67108864) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | zM22120g2;
            Object objM22097O10 = tj3Var3.m22097O();
            if (z12) {
                p84Var2 = p84Var;
                t66Var3 = t66VarM1263m;
                t66Var4 = t66Var2;
                t66Var5 = t66VarM1263m4;
                c = 0;
                t66Var6 = t66VarM1263m3;
                youtubePlayerKt$YoutubePlayer$3$1 = new YoutubePlayerKt$YoutubePlayer$3$1(pbbVar, ui3Var, t66Var, t66Var3, t66Var6, t66Var4, null);
                pbbVar2 = pbbVar;
                t66Var7 = t66Var;
                tj3Var3.m22131l0(youtubePlayerKt$YoutubePlayer$3$1);
            } else {
                p84Var2 = p84Var;
                t66Var3 = t66VarM1263m;
                t66Var4 = t66Var2;
                t66Var5 = t66VarM1263m4;
                c = 0;
                t66Var6 = t66VarM1263m3;
                youtubePlayerKt$YoutubePlayer$3$1 = new YoutubePlayerKt$YoutubePlayer$3$1(pbbVar, ui3Var, t66Var, t66Var3, t66Var6, t66Var4, null);
                pbbVar2 = pbbVar;
                t66Var7 = t66Var;
                tj3Var3.m22131l0(youtubePlayerKt$YoutubePlayer$3$1);
            }
            d32.m10047k(tj3Var3, (zi3) youtubePlayerKt$YoutubePlayer$3$1, pbbVar2);
            qx3Var = new qx3(context);
            qx3Var.m20193b("https://" + context.getPackageName());
            if (str2 != null) {
                m8504c(qx3Var, "hl", str2);
            }
            if (z8) {
                m8504c(qx3Var, "controls", 1);
            }
            vj6Var = new vj6(qx3Var.f58334a, 20);
            boolean zM22124i5 = tj3Var3.m22124i(context) | tj3Var3.m22120g(t66Var3) | tj3Var3.m22120g(t66VarM1263m2) | tj3Var3.m22120g(t66Var6) | tj3Var3.m22120g(t66Var5);
            if ((i8 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zM22124i6 = zM22124i5 | z13 | tj3Var3.m22124i(c1821b);
            if ((i4 & 1879048192) == c) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z18 = zM22124i6 | z14;
            if ((i8 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM22124i = z18 | z15 | ((i8 & 112) == 32) | tj3Var3.m22124i(vj6Var) | tj3Var3.m22124i(vbbVar) | tj3Var3.m22124i(ub5Var);
            objM22097O6 = tj3Var3.m22097O();
            p84 p84Var4 = p84Var2;
            if (zM22124i) {
                final t66 t66Var13 = t66Var5;
                final t66 t66Var14 = t66Var3;
                final t66 t66Var15 = t66Var6;
                final t66 t66Var16 = t66Var7;
                final t66 t66Var17 = t66Var4;
                objM22097O6 = new vi3() { // from class: rbb
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) throws JSONException, IOException {
                        ((Context) obj2).getClass();
                        YouTubePlayerView youTubePlayerView = new YouTubePlayerView(context);
                        youTubePlayerView.setEnableAutomaticInitialization(false);
                        C1823d c1823d = new C1823d(ui3Var4, t66Var16, t66Var14, t66VarM1263m2, t66Var15, t66Var17, t66Var13, c1821b, vi3Var, vi3Var2, vi3Var3);
                        if (youTubePlayerView.f34327c) {
                            C3386nv.m17633t("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
                            return null;
                        }
                        youTubePlayerView.f34326b.m11385a(c1823d, false, vj6Var, null);
                        WebView webViewM8503b = AbstractC1824e.m8503b(youTubePlayerView);
                        if (webViewM8503b != null) {
                            String userAgentString = webViewM8503b.getSettings().getUserAgentString();
                            userAgentString.getClass();
                            if (vk9.m23380c0(userAgentString, "Mobile", false)) {
                                webViewM8503b.getSettings().setUserAgentString(cl9.m4839V(userAgentString, " Mobile ", " "));
                            }
                        }
                        vbbVar.f65172a = youTubePlayerView;
                        ub5Var.mo256K().mo21323g(youTubePlayerView);
                        return youTubePlayerView;
                    }
                };
                vbbVar2 = vbbVar;
                ub5Var2 = ub5Var;
                t66Var7 = t66Var16;
                tj3Var3.m22131l0(objM22097O6);
            } else {
                final t66 t66Var18 = t66Var5;
                final t66 t66Var19 = t66Var3;
                final t66 t66Var110 = t66Var6;
                final t66 t66Var111 = t66Var7;
                final t66 t66Var112 = t66Var4;
                objM22097O6 = new vi3() { // from class: rbb
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) throws JSONException, IOException {
                        ((Context) obj2).getClass();
                        YouTubePlayerView youTubePlayerView = new YouTubePlayerView(context);
                        youTubePlayerView.setEnableAutomaticInitialization(false);
                        C1823d c1823d = new C1823d(ui3Var4, t66Var111, t66Var19, t66VarM1263m2, t66Var110, t66Var112, t66Var18, c1821b, vi3Var, vi3Var2, vi3Var3);
                        if (youTubePlayerView.f34327c) {
                            C3386nv.m17633t("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
                            return null;
                        }
                        youTubePlayerView.f34326b.m11385a(c1823d, false, vj6Var, null);
                        WebView webViewM8503b = AbstractC1824e.m8503b(youTubePlayerView);
                        if (webViewM8503b != null) {
                            String userAgentString = webViewM8503b.getSettings().getUserAgentString();
                            userAgentString.getClass();
                            if (vk9.m23380c0(userAgentString, "Mobile", false)) {
                                webViewM8503b.getSettings().setUserAgentString(cl9.m4839V(userAgentString, " Mobile ", " "));
                            }
                        }
                        vbbVar.f65172a = youTubePlayerView;
                        ub5Var.mo256K().mo21323g(youTubePlayerView);
                        return youTubePlayerView;
                    }
                };
                vbbVar2 = vbbVar;
                ub5Var2 = ub5Var;
                t66Var7 = t66Var111;
                tj3Var3.m22131l0(objM22097O6);
            }
            int i11 = (i4 << 3) & 112;
            tj3Var2 = tj3Var3;
            AbstractC0443c.m1891b((vi3) objM22097O6, e16Var, null, tj3Var2, i11, 4);
            zM22124i2 = tj3Var2.m22124i(c1821b) | tj3Var2.m22124i(vbbVar2) | tj3Var2.m22124i(ub5Var2);
            objM22097O7 = tj3Var2.m22097O();
            if (zM22124i2) {
                objM22097O7 = new C3445p2(ub5Var2, vbbVar2, c1821b, t66Var7, 23);
                tj3Var2.m22131l0(objM22097O7);
            } else {
                objM22097O7 = new C3445p2(ub5Var2, vbbVar2, c1821b, t66Var7, 23);
                tj3Var2.m22131l0(objM22097O7);
            }
            d32.m10041h(ub5Var2, (vi3) objM22097O7, tj3Var2);
            z7 = z8;
            ui3Var3 = ui3Var4;
            tj3Var = tj3Var2;
        } else {
            pbbVar2 = pbbVar;
            tj3 tj3Var5 = tj3Var3;
            tj3Var5.m22102U();
            ui3Var3 = ui3Var2;
            z6 = z3;
            z7 = z4;
            tj3Var = tj3Var5;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final pbb pbbVar4 = pbbVar2;
            final boolean z19 = z6;
            x18VarM22143u.f67642d = new zi3() { // from class: sbb
                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC1824e.m8502a(e16Var, str, pbbVar4, ac7Var, f, z19, z7, str2, ui3Var, vi3Var, vi3Var2, vi3Var3, ui3Var3, (ye1) obj2, iM19383z, iM19383z2, i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final WebView m8503b(View view) {
        if (view instanceof WebView) {
            return (WebView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.getClass();
            WebView webViewM8503b = m8503b(childAt);
            if (webViewM8503b != null) {
                return webViewM8503b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8504c(qx3 qx3Var, String str, Object obj) {
        try {
            Field declaredField = qx3.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(qx3Var);
            obj2.getClass();
            ((JSONObject) obj2).put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final PlayerConstants$PlaybackRate m8505d(ac7 ac7Var) {
        float f = ac7Var.f486a;
        if (f == 0.25f) {
            return PlayerConstants$PlaybackRate.RATE_0_25;
        }
        if (f == 0.5f) {
            return PlayerConstants$PlaybackRate.RATE_0_5;
        }
        if (f == 0.75f) {
            return PlayerConstants$PlaybackRate.RATE_0_75;
        }
        if (f == 1.0f) {
            return PlayerConstants$PlaybackRate.RATE_1;
        }
        if (f == 1.25f) {
            return PlayerConstants$PlaybackRate.RATE_1_25;
        }
        if (f == 1.5f) {
            return PlayerConstants$PlaybackRate.RATE_1_5;
        }
        if (f == 1.75f) {
            return PlayerConstants$PlaybackRate.RATE_1_75;
        }
        return f == 2.0f ? PlayerConstants$PlaybackRate.RATE_2 : PlayerConstants$PlaybackRate.RATE_1;
    }
}
