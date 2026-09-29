package p000;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.foundation.text.C0180h;
import androidx.compose.foundation.text.contextmenu.internal.C0170a;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.platform.AbstractC0406r;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.C0273b;
import androidx.compose.runtime.C0284k;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;
import androidx.lifecycle.compose.AbstractC0711a;
import androidx.profileinstaller.AbstractC0723a;
import com.google.common.collect.ImmutableSet;
import com.iterable.iterableapi.IterableAPIMobileFrameworkType;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.playlist.C1523f;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.playlists.AbstractC1825a;
import com.lingq.core.playlists.C1830f;
import com.lingq.core.playlists.C1833i;
import dagger.hilt.android.lifecycle.AbstractC2921a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C3244l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.kd7;
import p000.lda;
import p000.nn1;
import p000.wfb;
import p000.xf7;
import p000.xfa;
import p000.yf7;

/* JADX INFO: loaded from: classes.dex */
public abstract class d32 {

    /* JADX INFO: renamed from: a */
    public static final ai2 f34892a = new ai2();

    /* JADX INFO: renamed from: b */
    public static final gr7 f34893b = new gr7(14);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f34894c = 0;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f34895d = 0;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f34896e = 0;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f34897f = 0;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f34898g = 0;

    /* JADX INFO: renamed from: B */
    public static final void m10005B(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static e16 m10006C(e16 e16Var, xc5 xc5Var) {
        return e16Var.mo3161g(new k70(0L, xc5Var, ss5.f61356d, AbstractC0406r.m1816b(), 1));
    }

    /* JADX INFO: renamed from: D */
    public static final e16 m10007D(e16 e16Var, long j, o39 o39Var) {
        return e16Var.mo3161g(new k70(j, null, o39Var, AbstractC0406r.m1816b(), 2));
    }

    /* JADX INFO: renamed from: F */
    public static final byte m10008F(char c) {
        if (c < '~') {
            return qu0.f58209b[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: G */
    public static final void m10009G(long j) {
        ay9[] ay9VarArr = zx9.f72358b;
        if ((j & 1095216660480L) == 0) {
            k54.m14852a("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m10010H(long j, long j2) {
        ay9[] ay9VarArr = zx9.f72358b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            k54.m14852a("Cannot perform operation for Unspecified type.");
        }
        if (ay9.m3127a(zx9.m25847b(j), zx9.m25847b(j2))) {
            return;
        }
        k54.m14852a("Cannot perform operation for " + ((Object) ay9.m3128b(zx9.m25847b(j))) + " and " + ((Object) ay9.m3128b(zx9.m25847b(j2))));
    }

    /* JADX INFO: renamed from: I */
    public static void m10011I(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C3386nv.m17635v(ux5.m22988k(i2, "at index "));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static final long m10012J(long j, long j2) {
        float f;
        float f2;
        long jM197a = aa1.m197a(j, aa1.m202f(j2));
        float fM200d = aa1.m200d(j2);
        float fM200d2 = aa1.m200d(jM197a);
        float f3 = 1.0f - fM200d2;
        float f4 = (fM200d * f3) + fM200d2;
        float fM204h = aa1.m204h(jM197a);
        float fM204h2 = aa1.m204h(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fM204h2 * fM200d) * f3) + (fM204h * fM200d2)) / f4;
        }
        float fM203g = aa1.m203g(jM197a);
        float fM203g2 = aa1.m203g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fM203g2 * fM200d) * f3) + (fM203g * fM200d2)) / f4;
        }
        float fM201e = aa1.m201e(jM197a);
        float fM201e2 = aa1.m201e(j2);
        if (f4 != 0.0f) {
            f5 = (((fM201e2 * fM200d) * f3) + (fM201e * fM200d2)) / f4;
        }
        return m10065y(f, f2, f5, f4, aa1.m202f(j2));
    }

    /* JADX INFO: renamed from: K */
    public static final un1 m10013K(ye1 ye1Var) {
        return new C0284k(((tj3) ye1Var).f62383R);
    }

    /* JADX INFO: renamed from: L */
    public static final float m10014L(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = tw9.f63022a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : n34.f52268a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: M */
    public static final float m10015M(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = tw9.f63022a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? n34.f52268a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: N */
    public static final String m10016N(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: O */
    public static final long m10017O(double d) {
        return m10032c0((float) d, 4294967296L);
    }

    /* JADX INFO: renamed from: P */
    public static final long m10018P(int i) {
        return m10032c0(i, 4294967296L);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m10019Q(InterfaceC0354d interfaceC0354d) {
        te1.m21976I(interfaceC0354d, 2).m1690m1();
    }

    /* JADX INFO: renamed from: R */
    public static final void m10020R(InterfaceC0354d interfaceC0354d) {
        te1.m21979L(interfaceC0354d).m1566I();
    }

    /* JADX INFO: renamed from: S */
    public static boolean m10021S(PackageManager packageManager) {
        return Build.MODEL.matches("AFTN") || packageManager.hasSystemFeature("amazon.hardware.fire_tv");
    }

    /* JADX INFO: renamed from: T */
    public static boolean m10022T(Context context) {
        ((ky1) ((qd3) do7.m10537m(context, qd3.class))).getClass();
        ImmutableSet immutableSetM6310s = ImmutableSet.m6310s();
        thb.m22048g(immutableSetM6310s.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (immutableSetM6310s.isEmpty()) {
            return true;
        }
        return ((Boolean) immutableSetM6310s.iterator().next()).booleanValue();
    }

    /* JADX INFO: renamed from: U */
    public static final boolean m10023U(float f, float f2, C3500qj c3500qj) {
        e28 e28Var = new e28(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
        C3500qj.m19985b(c3500qjM22757a, e28Var);
        C3500qj c3500qjM22757a2 = AbstractC3650uj.m22757a();
        c3500qjM22757a2.m19990g(c3500qj, c3500qjM22757a, 1);
        boolean zIsEmpty = c3500qjM22757a2.f57839a.isEmpty();
        c3500qjM22757a2.m19991h();
        c3500qjM22757a.m19991h();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m10024V(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX INFO: renamed from: W */
    public static final e16 m10025W(e16 e16Var, C0135d c0135d) {
        return e16Var.mo3161g(new vh2(c0135d));
    }

    /* JADX INFO: renamed from: X */
    public static final long m10026X(long j, long j2, float f) {
        fr6 fr6Var = va1.f65119x;
        long jM197a = aa1.m197a(j, fr6Var);
        long jM197a2 = aa1.m197a(j2, fr6Var);
        float fM200d = aa1.m200d(jM197a);
        float fM204h = aa1.m204h(jM197a);
        float fM203g = aa1.m203g(jM197a);
        float fM201e = aa1.m201e(jM197a);
        float fM200d2 = aa1.m200d(jM197a2);
        float fM204h2 = aa1.m204h(jM197a2);
        float fM203g2 = aa1.m203g(jM197a2);
        float fM201e2 = aa1.m201e(jM197a2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return aa1.m197a(m10065y(AbstractC3423or.m18232Q(fM204h, fM204h2, f), AbstractC3423or.m18232Q(fM203g, fM203g2, f), AbstractC3423or.m18232Q(fM201e, fM201e2, f), AbstractC3423or.m18232Q(fM200d, fM200d2, f), fr6Var), aa1.m202f(j2));
    }

    /* JADX INFO: renamed from: Y */
    public static final fs6 m10027Y(zi3 zi3Var, vi3 vi3Var) {
        eg5 eg5Var = new eg5(0, zi3Var);
        lda.m16119e(1, vi3Var);
        return new fs6(19, eg5Var, vi3Var);
    }

    /* JADX INFO: renamed from: Z */
    public static void m10028Z(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m10029a(int i, ye1 ye1Var, ui3 ui3Var) {
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1819343291);
        int i2 = i | (tj3Var.m22124i(ui3Var) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(b16Var, 1.0f), 15), ge9.m12515a(tj3Var).f38960i, ge9.m12515a(tj3Var).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ty3.m22351a(h2d.m13016b(), null, c99.m4422o(b16Var, 24.0f), p58.m18900f(tj3Var).f55842a, tj3Var, 432, 0);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.ui_add), null, p58.m18900f(tj3Var).f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new he7(i, 10, ui3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:127:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x020f  */
    /* JADX INFO: renamed from: b */
    public static final void m10030b(final C3419on c3419on, final e16 e16Var, final vx9 vx9Var, final vi3 vi3Var, final int i, final boolean z, final int i2, final int i3, final Map map, final m20 m20Var, ye1 ye1Var, final int i4, final int i5) {
        int i6;
        vi3 vi3Var2;
        int i7;
        tj3 tj3Var;
        boolean z2;
        int i8;
        boolean z3;
        wa3 wa3Var;
        boolean z4;
        Object objM22097O;
        t66 t66Var;
        boolean zM22120g;
        Object objM22097O2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1343466571);
        if ((i4 & 6) == 0) {
            i6 = (tj3Var2.m22120g(c3419on) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= tj3Var2.m22120g(vx9Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            vi3Var2 = vi3Var;
            i6 |= tj3Var2.m22124i(vi3Var2) ? 2048 : 1024;
        } else {
            vi3Var2 = vi3Var;
        }
        if ((i4 & 24576) == 0) {
            i6 |= tj3Var2.m22116e(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= tj3Var2.m22122h(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= tj3Var2.m22116e(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i6 |= tj3Var2.m22116e(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i6 |= tj3Var2.m22124i(map) ? 67108864 : 33554432;
        }
        int i9 = i6 | 805306368;
        if ((i5 & 6) == 0) {
            i7 = i5 | ((i5 & 8) == 0 ? tj3Var2.m22120g(m20Var) : tj3Var2.m22124i(m20Var) ? 4 : 2);
        } else {
            i7 = i5;
        }
        int i10 = 0;
        if (tj3Var2.m22099R(i9 & 1, ((i9 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            AbstractC3184kh.m15202J(i3, i2);
            if (tj3Var2.m22128k(hv8.f42994a) != null) {
                ho2.m13383c();
                return;
            }
            tj3Var2.m22111b0(1588759409);
            tj3Var2.m22139q(false);
            Pair pair = AbstractC3617tn.f62551a;
            int length = c3419on.f54604b.length();
            List list = c3419on.f54603a;
            if (list != null) {
                int size = list.size();
                while (true) {
                    if (i10 < size) {
                        i8 = i9;
                        C3378nn c3378nn = (C3378nn) list.get(i10);
                        List list2 = list;
                        if ((c3378nn.f52979a instanceof ok9) && "androidx.compose.foundation.text.inlineContent".equals(c3378nn.f52982d)) {
                            if (AbstractC3466pn.m19404b(0, length, c3378nn.f52980b, c3378nn.f52981c)) {
                                z3 = true;
                            }
                        }
                        i10++;
                        list = list2;
                        i9 = i8;
                    } else {
                        z2 = false;
                    }
                    boolean zM22060s = thb.m22060s(c3419on);
                    wa3Var = (wa3) tj3Var2.m22128k(AbstractC0402n.f4819k);
                    if (!z3 || zM22060s) {
                        tj3Var2.m22111b0(1590022070);
                        if ((i8 & 14) == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objM22097O = tj3Var2.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (z4 || objM22097O == p84Var) {
                            objM22097O = AbstractC0278f.m1260j(c3419on);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        t66Var = (t66) objM22097O;
                        C3419on c3419on2 = (C3419on) t66Var.getValue();
                        zM22120g = tj3Var2.m22120g(t66Var);
                        objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g || objM22097O2 == p84Var) {
                            objM22097O2 = new gb0(0, t66Var);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        int i11 = i8 << 6;
                        tj3Var = tj3Var2;
                        m10055o(e16Var, c3419on2, vi3Var, z3, map, vx9Var, i, z, i2, i3, wa3Var, (vi3) objM22097O2, m20Var, tj3Var, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), ((i8 >> 21) & 896) | (57344 & (i7 << 12)));
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(1589006262);
                        nb0.m17307a(c3419on, vx9Var, wa3Var, null, tj3Var2);
                        e16 e16VarM10040g0 = m10040g0(e16Var, c3419on, vx9Var, vi3Var2, i, z, i2, i3, wa3Var, null, null, null, m20Var);
                        C3580sn c3580sn = C3580sn.f61038e;
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM10040g0);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, C0352b.f4303f, c3580sn);
                        oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                        oha.m18000f(tj3Var2, C0352b.f4305h);
                        oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                        oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                        tj3Var2.m22139q(true);
                        tj3Var2.m22139q(false);
                        tj3Var = tj3Var2;
                    }
                }
            } else {
                z2 = false;
            }
            i8 = i9;
            z3 = z2;
            boolean zM22060s2 = thb.m22060s(c3419on);
            wa3Var = (wa3) tj3Var2.m22128k(AbstractC0402n.f4819k);
            if (z3) {
                tj3Var2.m22111b0(1590022070);
                if ((i8 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM22097O = tj3Var2.m22097O();
                p84 p84Var2 = we1.f66679a;
                if (z4) {
                    objM22097O = AbstractC0278f.m1260j(c3419on);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    objM22097O = AbstractC0278f.m1260j(c3419on);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                C3419on c3419on3 = (C3419on) t66Var.getValue();
                zM22120g = tj3Var2.m22120g(t66Var);
                objM22097O2 = tj3Var2.m22097O();
                if (zM22120g) {
                    objM22097O2 = new gb0(0, t66Var);
                    tj3Var2.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new gb0(0, t66Var);
                    tj3Var2.m22131l0(objM22097O2);
                }
                int i12 = i8 << 6;
                tj3Var = tj3Var2;
                m10055o(e16Var, c3419on3, vi3Var, z3, map, vx9Var, i, z, i2, i3, wa3Var, (vi3) objM22097O2, m20Var, tj3Var, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), ((i8 >> 21) & 896) | (57344 & (i7 << 12)));
                tj3Var.m22139q(false);
            } else {
                tj3Var2.m22111b0(1590022070);
                if ((i8 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM22097O = tj3Var2.m22097O();
                p84 p84Var3 = we1.f66679a;
                if (z4) {
                    objM22097O = AbstractC0278f.m1260j(c3419on);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    objM22097O = AbstractC0278f.m1260j(c3419on);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                C3419on c3419on4 = (C3419on) t66Var.getValue();
                zM22120g = tj3Var2.m22120g(t66Var);
                objM22097O2 = tj3Var2.m22097O();
                if (zM22120g) {
                    objM22097O2 = new gb0(0, t66Var);
                    tj3Var2.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new gb0(0, t66Var);
                    tj3Var2.m22131l0(objM22097O2);
                }
                int i13 = i8 << 6;
                tj3Var = tj3Var2;
                m10055o(e16Var, c3419on4, vi3Var, z3, map, vx9Var, i, z, i2, i3, wa3Var, (vi3) objM22097O2, m20Var, tj3Var, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), ((i8 >> 21) & 896) | (57344 & (i7 << 12)));
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: hb0
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d32.m10030b(c3419on, e16Var, vx9Var, vi3Var, i, z, i2, i3, map, m20Var, (ye1) obj, pk9.m19383z(i4 | 1), pk9.m19383z(i5));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0127  */
    /* JADX WARN: Code duplicated, block: B:108:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:118:0x0187  */
    /* JADX WARN: Code duplicated, block: B:120:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0194  */
    /* JADX WARN: Code duplicated, block: B:126:0x020a  */
    /* JADX WARN: Code duplicated, block: B:127:0x020e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0237  */
    /* JADX WARN: Code duplicated, block: B:131:0x023b  */
    /* JADX WARN: Code duplicated, block: B:134:0x024c  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    /* JADX INFO: renamed from: c */
    public static final void m10031c(final String str, final e16 e16Var, final vx9 vx9Var, vi3 vi3Var, int i, boolean z, final int i2, int i3, m20 m20Var, ye1 ye1Var, final int i4, final int i5) {
        int i6;
        vx9 vx9Var2;
        vi3 vi3Var2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zM22124i;
        int i15;
        boolean z3;
        final int i16;
        final m20 m20Var2;
        final vi3 vi3Var3;
        final boolean z4;
        final int i17;
        x18 x18VarM22143u;
        vi3 vi3Var4;
        int i18;
        int i19;
        m20 m20Var3;
        Executor executor;
        boolean z5;
        int i20;
        int i21;
        vi3 vi3Var5;
        m20 m20Var4;
        boolean z6;
        e16 e16VarM10040g0;
        ui3 ui3Var;
        int i22;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (tj3Var.m22120g(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            vx9Var2 = vx9Var;
            i6 |= tj3Var.m22120g(vx9Var2) ? 256 : 128;
        } else {
            vx9Var2 = vx9Var;
        }
        int i23 = i5 & 8;
        if (i23 == 0) {
            if ((i4 & 3072) == 0) {
                vi3Var2 = vi3Var;
                i6 |= tj3Var.m22124i(vi3Var2) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                if ((i4 & 24576) == 0) {
                    if (tj3Var.m22116e(i)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    if ((196608 & i4) == 0) {
                        z2 = z;
                        if (tj3Var.m22122h(z2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i6 |= i10;
                    }
                    if ((1572864 & i4) == 0) {
                        if (tj3Var.m22116e(i2)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i6 |= i22;
                    }
                    i11 = i5 & 128;
                    if (i11 != 0) {
                        i6 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        if (tj3Var.m22116e(i3)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i6 |= i12;
                    }
                    i13 = i6 | 100663296;
                    i14 = i5 & 512;
                    if (i14 != 0) {
                        i13 = i6 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zM22124i = tj3Var.m22120g(m20Var);
                        } else {
                            zM22124i = tj3Var.m22124i(m20Var);
                        }
                        if (zM22124i) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (tj3Var.m22099R(i13 & 1, z3)) {
                        if (i23 != 0) {
                            vi3Var4 = null;
                        } else {
                            vi3Var4 = vi3Var2;
                        }
                        if (i7 != 0) {
                            i18 = 1;
                        } else {
                            i18 = i;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i3;
                        }
                        if (i14 != 0) {
                            m20Var3 = null;
                        } else {
                            m20Var3 = m20Var;
                        }
                        AbstractC3184kh.m15202J(i19, i2);
                        if (tj3Var.m22128k(hv8.f42994a) == null) {
                            ho2.m13383c();
                            return;
                        }
                        tj3Var.m22111b0(356914239);
                        tj3Var.m22139q(false);
                        wa3 wa3Var = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
                        executor = (Executor) tj3Var.m22128k(nb0.f52558a);
                        if (executor == null && nb0.m17308b(str.length())) {
                            tj3Var.m22111b0(1254298614);
                            try {
                                executor.execute(new lb0(vx9Var2, (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n), str, (fb2) tj3Var.m22128k(AbstractC0402n.f4816h), wa3Var, 0));
                            } catch (RejectedExecutionException unused) {
                            }
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1255914055);
                            tj3Var.m22139q(false);
                        }
                        if (vi3Var4 == null || m20Var3 != null) {
                            z5 = z2;
                            i20 = i19;
                            i21 = i18;
                            tj3Var.m22111b0(357232113);
                            vi3Var5 = vi3Var4;
                            m20Var4 = m20Var3;
                            z6 = true;
                            e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(357875859);
                            tj3Var.m22139q(false);
                            z5 = z2;
                            i20 = i19;
                            i21 = i18;
                            e16VarM10040g0 = e16Var.mo3161g(new qx9(str, vx9Var, wa3Var, i21, z5, i2, i20));
                            vi3Var5 = vi3Var4;
                            m20Var4 = m20Var3;
                            z6 = true;
                        }
                        C3580sn c3580sn = C3580sn.f61038e;
                        int iHashCode = Long.hashCode(tj3Var.f62385T);
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10040g0);
                        l77 l77VarM22132m = tj3Var.m22132m();
                        se1.f60731q.getClass();
                        ui3Var = C0352b.f4299b;
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, C0352b.f4303f, c3580sn);
                        oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                        oha.m18000f(tj3Var, C0352b.f4305h);
                        oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                        oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                        tj3Var.m22139q(z6);
                        z4 = z5;
                        i16 = i20;
                        m20Var2 = m20Var4;
                        i17 = i21;
                        vi3Var3 = vi3Var5;
                    } else {
                        tj3Var.m22102U();
                        i16 = i3;
                        m20Var2 = m20Var;
                        vi3Var3 = vi3Var2;
                        z4 = z2;
                        i17 = i;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: eb0
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                d32.m10031c(str, e16Var, vx9Var, vi3Var3, i17, z4, i2, i16, m20Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i6 |= 196608;
                z2 = z;
                if ((1572864 & i4) == 0) {
                    if (tj3Var.m22116e(i2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i6 |= i22;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    if (tj3Var.m22116e(i3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
                i13 = i6 | 100663296;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM22124i = tj3Var.m22120g(m20Var);
                    } else {
                        zM22124i = tj3Var.m22124i(m20Var);
                    }
                    if (zM22124i) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                if ((i13 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var.m22099R(i13 & 1, z3)) {
                    if (i23 != 0) {
                        vi3Var4 = null;
                    } else {
                        vi3Var4 = vi3Var2;
                    }
                    if (i7 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    if (i14 != 0) {
                        m20Var3 = null;
                    } else {
                        m20Var3 = m20Var;
                    }
                    AbstractC3184kh.m15202J(i19, i2);
                    if (tj3Var.m22128k(hv8.f42994a) == null) {
                        ho2.m13383c();
                        return;
                    }
                    tj3Var.m22111b0(356914239);
                    tj3Var.m22139q(false);
                    wa3 wa3Var2 = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
                    executor = (Executor) tj3Var.m22128k(nb0.f52558a);
                    if (executor == null) {
                        tj3Var.m22111b0(1255914055);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1255914055);
                        tj3Var.m22139q(false);
                    }
                    if (vi3Var4 == null) {
                        z5 = z2;
                        i20 = i19;
                        i21 = i18;
                        tj3Var.m22111b0(357232113);
                        vi3Var5 = vi3Var4;
                        m20Var4 = m20Var3;
                        z6 = true;
                        e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                        tj3Var.m22139q(false);
                    } else {
                        z5 = z2;
                        i20 = i19;
                        i21 = i18;
                        tj3Var.m22111b0(357232113);
                        vi3Var5 = vi3Var4;
                        m20Var4 = m20Var3;
                        z6 = true;
                        e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                        tj3Var.m22139q(false);
                    }
                    C3580sn c3580sn2 = C3580sn.f61038e;
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM10040g0);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, c3580sn2);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    tj3Var.m22139q(z6);
                    z4 = z5;
                    i16 = i20;
                    m20Var2 = m20Var4;
                    i17 = i21;
                    vi3Var3 = vi3Var5;
                } else {
                    tj3Var.m22102U();
                    i16 = i3;
                    m20Var2 = m20Var;
                    vi3Var3 = vi3Var2;
                    z4 = z2;
                    i17 = i;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: eb0
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d32.m10031c(str, e16Var, vx9Var, vi3Var3, i17, z4, i2, i16, m20Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i6 |= 24576;
            i9 = i5 & 32;
            if (i9 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (tj3Var.m22122h(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i6 |= i10;
                }
                if ((1572864 & i4) == 0) {
                    if (tj3Var.m22116e(i2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i6 |= i22;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    if (tj3Var.m22116e(i3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
                i13 = i6 | 100663296;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM22124i = tj3Var.m22120g(m20Var);
                    } else {
                        zM22124i = tj3Var.m22124i(m20Var);
                    }
                    if (zM22124i) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                if ((i13 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var.m22099R(i13 & 1, z3)) {
                    if (i23 != 0) {
                        vi3Var4 = null;
                    } else {
                        vi3Var4 = vi3Var2;
                    }
                    if (i7 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    if (i14 != 0) {
                        m20Var3 = null;
                    } else {
                        m20Var3 = m20Var;
                    }
                    AbstractC3184kh.m15202J(i19, i2);
                    if (tj3Var.m22128k(hv8.f42994a) == null) {
                        ho2.m13383c();
                        return;
                    }
                    tj3Var.m22111b0(356914239);
                    tj3Var.m22139q(false);
                    wa3 wa3Var3 = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
                    executor = (Executor) tj3Var.m22128k(nb0.f52558a);
                    if (executor == null) {
                        tj3Var.m22111b0(1255914055);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1255914055);
                        tj3Var.m22139q(false);
                    }
                    if (vi3Var4 == null) {
                        z5 = z2;
                        i20 = i19;
                        i21 = i18;
                        tj3Var.m22111b0(357232113);
                        vi3Var5 = vi3Var4;
                        m20Var4 = m20Var3;
                        z6 = true;
                        e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                        tj3Var.m22139q(false);
                    } else {
                        z5 = z2;
                        i20 = i19;
                        i21 = i18;
                        tj3Var.m22111b0(357232113);
                        vi3Var5 = vi3Var4;
                        m20Var4 = m20Var3;
                        z6 = true;
                        e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                        tj3Var.m22139q(false);
                    }
                    C3580sn c3580sn3 = C3580sn.f61038e;
                    int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM10040g0);
                    l77 l77VarM22132m3 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, c3580sn3);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    tj3Var.m22139q(z6);
                    z4 = z5;
                    i16 = i20;
                    m20Var2 = m20Var4;
                    i17 = i21;
                    vi3Var3 = vi3Var5;
                } else {
                    tj3Var.m22102U();
                    i16 = i3;
                    m20Var2 = m20Var;
                    vi3Var3 = vi3Var2;
                    z4 = z2;
                    i17 = i;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: eb0
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d32.m10031c(str, e16Var, vx9Var, vi3Var3, i17, z4, i2, i16, m20Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (tj3Var.m22116e(i2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i6 |= i22;
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (tj3Var.m22116e(i3)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
            i13 = i6 | 100663296;
            i14 = i5 & 512;
            if (i14 != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM22124i = tj3Var.m22120g(m20Var);
                } else {
                    zM22124i = tj3Var.m22124i(m20Var);
                }
                if (zM22124i) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            if ((i13 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i13 & 1, z3)) {
                if (i23 != 0) {
                    vi3Var4 = null;
                } else {
                    vi3Var4 = vi3Var2;
                }
                if (i7 != 0) {
                    i18 = 1;
                } else {
                    i18 = i;
                }
                if (i9 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                if (i14 != 0) {
                    m20Var3 = null;
                } else {
                    m20Var3 = m20Var;
                }
                AbstractC3184kh.m15202J(i19, i2);
                if (tj3Var.m22128k(hv8.f42994a) == null) {
                    ho2.m13383c();
                    return;
                }
                tj3Var.m22111b0(356914239);
                tj3Var.m22139q(false);
                wa3 wa3Var4 = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
                executor = (Executor) tj3Var.m22128k(nb0.f52558a);
                if (executor == null) {
                    tj3Var.m22111b0(1255914055);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1255914055);
                    tj3Var.m22139q(false);
                }
                if (vi3Var4 == null) {
                    z5 = z2;
                    i20 = i19;
                    i21 = i18;
                    tj3Var.m22111b0(357232113);
                    vi3Var5 = vi3Var4;
                    m20Var4 = m20Var3;
                    z6 = true;
                    e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                    tj3Var.m22139q(false);
                } else {
                    z5 = z2;
                    i20 = i19;
                    i21 = i18;
                    tj3Var.m22111b0(357232113);
                    vi3Var5 = vi3Var4;
                    m20Var4 = m20Var3;
                    z6 = true;
                    e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                    tj3Var.m22139q(false);
                }
                C3580sn c3580sn4 = C3580sn.f61038e;
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM10040g0);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, c3580sn4);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m4);
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c4);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode4));
                tj3Var.m22139q(z6);
                z4 = z5;
                i16 = i20;
                m20Var2 = m20Var4;
                i17 = i21;
                vi3Var3 = vi3Var5;
            } else {
                tj3Var.m22102U();
                i16 = i3;
                m20Var2 = m20Var;
                vi3Var3 = vi3Var2;
                z4 = z2;
                i17 = i;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: eb0
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d32.m10031c(str, e16Var, vx9Var, vi3Var3, i17, z4, i2, i16, m20Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i6 |= 3072;
        vi3Var2 = vi3Var;
        i7 = i5 & 16;
        if (i7 != 0) {
            if ((i4 & 24576) == 0) {
                if (tj3Var.m22116e(i)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i6 |= i8;
            }
            i9 = i5 & 32;
            if (i9 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (tj3Var.m22122h(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i6 |= i10;
                }
                if ((1572864 & i4) == 0) {
                    if (tj3Var.m22116e(i2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i6 |= i22;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    if (tj3Var.m22116e(i3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
                i13 = i6 | 100663296;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM22124i = tj3Var.m22120g(m20Var);
                    } else {
                        zM22124i = tj3Var.m22124i(m20Var);
                    }
                    if (zM22124i) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                if ((i13 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var.m22099R(i13 & 1, z3)) {
                    if (i23 != 0) {
                        vi3Var4 = null;
                    } else {
                        vi3Var4 = vi3Var2;
                    }
                    if (i7 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    if (i14 != 0) {
                        m20Var3 = null;
                    } else {
                        m20Var3 = m20Var;
                    }
                    AbstractC3184kh.m15202J(i19, i2);
                    if (tj3Var.m22128k(hv8.f42994a) == null) {
                        ho2.m13383c();
                        return;
                    }
                    tj3Var.m22111b0(356914239);
                    tj3Var.m22139q(false);
                    wa3 wa3Var5 = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
                    executor = (Executor) tj3Var.m22128k(nb0.f52558a);
                    if (executor == null) {
                        tj3Var.m22111b0(1255914055);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1255914055);
                        tj3Var.m22139q(false);
                    }
                    if (vi3Var4 == null) {
                        z5 = z2;
                        i20 = i19;
                        i21 = i18;
                        tj3Var.m22111b0(357232113);
                        vi3Var5 = vi3Var4;
                        m20Var4 = m20Var3;
                        z6 = true;
                        e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                        tj3Var.m22139q(false);
                    } else {
                        z5 = z2;
                        i20 = i19;
                        i21 = i18;
                        tj3Var.m22111b0(357232113);
                        vi3Var5 = vi3Var4;
                        m20Var4 = m20Var3;
                        z6 = true;
                        e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                        tj3Var.m22139q(false);
                    }
                    C3580sn c3580sn5 = C3580sn.f61038e;
                    int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM10040g0);
                    l77 l77VarM22132m5 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, c3580sn5);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m5);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c5);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode5));
                    tj3Var.m22139q(z6);
                    z4 = z5;
                    i16 = i20;
                    m20Var2 = m20Var4;
                    i17 = i21;
                    vi3Var3 = vi3Var5;
                } else {
                    tj3Var.m22102U();
                    i16 = i3;
                    m20Var2 = m20Var;
                    vi3Var3 = vi3Var2;
                    z4 = z2;
                    i17 = i;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: eb0
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d32.m10031c(str, e16Var, vx9Var, vi3Var3, i17, z4, i2, i16, m20Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (tj3Var.m22116e(i2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i6 |= i22;
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (tj3Var.m22116e(i3)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
            i13 = i6 | 100663296;
            i14 = i5 & 512;
            if (i14 != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM22124i = tj3Var.m22120g(m20Var);
                } else {
                    zM22124i = tj3Var.m22124i(m20Var);
                }
                if (zM22124i) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            if ((i13 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i13 & 1, z3)) {
                if (i23 != 0) {
                    vi3Var4 = null;
                } else {
                    vi3Var4 = vi3Var2;
                }
                if (i7 != 0) {
                    i18 = 1;
                } else {
                    i18 = i;
                }
                if (i9 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                if (i14 != 0) {
                    m20Var3 = null;
                } else {
                    m20Var3 = m20Var;
                }
                AbstractC3184kh.m15202J(i19, i2);
                if (tj3Var.m22128k(hv8.f42994a) == null) {
                    ho2.m13383c();
                    return;
                }
                tj3Var.m22111b0(356914239);
                tj3Var.m22139q(false);
                wa3 wa3Var6 = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
                executor = (Executor) tj3Var.m22128k(nb0.f52558a);
                if (executor == null) {
                    tj3Var.m22111b0(1255914055);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1255914055);
                    tj3Var.m22139q(false);
                }
                if (vi3Var4 == null) {
                    z5 = z2;
                    i20 = i19;
                    i21 = i18;
                    tj3Var.m22111b0(357232113);
                    vi3Var5 = vi3Var4;
                    m20Var4 = m20Var3;
                    z6 = true;
                    e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                    tj3Var.m22139q(false);
                } else {
                    z5 = z2;
                    i20 = i19;
                    i21 = i18;
                    tj3Var.m22111b0(357232113);
                    vi3Var5 = vi3Var4;
                    m20Var4 = m20Var3;
                    z6 = true;
                    e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                    tj3Var.m22139q(false);
                }
                C3580sn c3580sn6 = C3580sn.f61038e;
                int iHashCode6 = Long.hashCode(tj3Var.f62385T);
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM10040g0);
                l77 l77VarM22132m6 = tj3Var.m22132m();
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, c3580sn6);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m6);
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c6);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode6));
                tj3Var.m22139q(z6);
                z4 = z5;
                i16 = i20;
                m20Var2 = m20Var4;
                i17 = i21;
                vi3Var3 = vi3Var5;
            } else {
                tj3Var.m22102U();
                i16 = i3;
                m20Var2 = m20Var;
                vi3Var3 = vi3Var2;
                z4 = z2;
                i17 = i;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: eb0
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d32.m10031c(str, e16Var, vx9Var, vi3Var3, i17, z4, i2, i16, m20Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i6 |= 24576;
        i9 = i5 & 32;
        if (i9 != 0) {
            if ((196608 & i4) == 0) {
                z2 = z;
                if (tj3Var.m22122h(z2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i6 |= i10;
            }
            if ((1572864 & i4) == 0) {
                if (tj3Var.m22116e(i2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i6 |= i22;
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (tj3Var.m22116e(i3)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
            i13 = i6 | 100663296;
            i14 = i5 & 512;
            if (i14 != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM22124i = tj3Var.m22120g(m20Var);
                } else {
                    zM22124i = tj3Var.m22124i(m20Var);
                }
                if (zM22124i) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            if ((i13 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i13 & 1, z3)) {
                if (i23 != 0) {
                    vi3Var4 = null;
                } else {
                    vi3Var4 = vi3Var2;
                }
                if (i7 != 0) {
                    i18 = 1;
                } else {
                    i18 = i;
                }
                if (i9 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                if (i14 != 0) {
                    m20Var3 = null;
                } else {
                    m20Var3 = m20Var;
                }
                AbstractC3184kh.m15202J(i19, i2);
                if (tj3Var.m22128k(hv8.f42994a) == null) {
                    ho2.m13383c();
                    return;
                }
                tj3Var.m22111b0(356914239);
                tj3Var.m22139q(false);
                wa3 wa3Var7 = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
                executor = (Executor) tj3Var.m22128k(nb0.f52558a);
                if (executor == null) {
                    tj3Var.m22111b0(1255914055);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1255914055);
                    tj3Var.m22139q(false);
                }
                if (vi3Var4 == null) {
                    z5 = z2;
                    i20 = i19;
                    i21 = i18;
                    tj3Var.m22111b0(357232113);
                    vi3Var5 = vi3Var4;
                    m20Var4 = m20Var3;
                    z6 = true;
                    e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                    tj3Var.m22139q(false);
                } else {
                    z5 = z2;
                    i20 = i19;
                    i21 = i18;
                    tj3Var.m22111b0(357232113);
                    vi3Var5 = vi3Var4;
                    m20Var4 = m20Var3;
                    z6 = true;
                    e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                    tj3Var.m22139q(false);
                }
                C3580sn c3580sn7 = C3580sn.f61038e;
                int iHashCode7 = Long.hashCode(tj3Var.f62385T);
                e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var, e16VarM10040g0);
                l77 l77VarM22132m7 = tj3Var.m22132m();
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, c3580sn7);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m7);
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c7);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode7));
                tj3Var.m22139q(z6);
                z4 = z5;
                i16 = i20;
                m20Var2 = m20Var4;
                i17 = i21;
                vi3Var3 = vi3Var5;
            } else {
                tj3Var.m22102U();
                i16 = i3;
                m20Var2 = m20Var;
                vi3Var3 = vi3Var2;
                z4 = z2;
                i17 = i;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: eb0
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d32.m10031c(str, e16Var, vx9Var, vi3Var3, i17, z4, i2, i16, m20Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i6 |= 196608;
        z2 = z;
        if ((1572864 & i4) == 0) {
            if (tj3Var.m22116e(i2)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i6 |= i22;
        }
        i11 = i5 & 128;
        if (i11 != 0) {
            i6 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            if (tj3Var.m22116e(i3)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i6 |= i12;
        }
        i13 = i6 | 100663296;
        i14 = i5 & 512;
        if (i14 != 0) {
            i13 = i6 | 905969664;
        } else if ((805306368 & i4) == 0) {
            if ((1073741824 & i4) == 0) {
                zM22124i = tj3Var.m22120g(m20Var);
            } else {
                zM22124i = tj3Var.m22124i(m20Var);
            }
            if (zM22124i) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i13 |= i15;
        }
        if ((i13 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i13 & 1, z3)) {
            if (i23 != 0) {
                vi3Var4 = null;
            } else {
                vi3Var4 = vi3Var2;
            }
            if (i7 != 0) {
                i18 = 1;
            } else {
                i18 = i;
            }
            if (i9 != 0) {
                z2 = true;
            }
            if (i11 != 0) {
                i19 = 1;
            } else {
                i19 = i3;
            }
            if (i14 != 0) {
                m20Var3 = null;
            } else {
                m20Var3 = m20Var;
            }
            AbstractC3184kh.m15202J(i19, i2);
            if (tj3Var.m22128k(hv8.f42994a) == null) {
                ho2.m13383c();
                return;
            }
            tj3Var.m22111b0(356914239);
            tj3Var.m22139q(false);
            wa3 wa3Var8 = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
            executor = (Executor) tj3Var.m22128k(nb0.f52558a);
            if (executor == null) {
                tj3Var.m22111b0(1255914055);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1255914055);
                tj3Var.m22139q(false);
            }
            if (vi3Var4 == null) {
                z5 = z2;
                i20 = i19;
                i21 = i18;
                tj3Var.m22111b0(357232113);
                vi3Var5 = vi3Var4;
                m20Var4 = m20Var3;
                z6 = true;
                e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                tj3Var.m22139q(false);
            } else {
                z5 = z2;
                i20 = i19;
                i21 = i18;
                tj3Var.m22111b0(357232113);
                vi3Var5 = vi3Var4;
                m20Var4 = m20Var3;
                z6 = true;
                e16VarM10040g0 = m10040g0(e16Var, new C3419on(str), vx9Var, vi3Var5, i21, z5, i2, i20, (wa3) tj3Var.m22128k(AbstractC0402n.f4819k), null, null, null, m20Var4);
                tj3Var.m22139q(false);
            }
            C3580sn c3580sn8 = C3580sn.f61038e;
            int iHashCode8 = Long.hashCode(tj3Var.f62385T);
            e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var, e16VarM10040g0);
            l77 l77VarM22132m8 = tj3Var.m22132m();
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, c3580sn8);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m8);
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c8);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode8));
            tj3Var.m22139q(z6);
            z4 = z5;
            i16 = i20;
            m20Var2 = m20Var4;
            i17 = i21;
            vi3Var3 = vi3Var5;
        } else {
            tj3Var.m22102U();
            i16 = i3;
            m20Var2 = m20Var;
            vi3Var3 = vi3Var2;
            z4 = z2;
            i17 = i;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: eb0
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d32.m10031c(str, e16Var, vx9Var, vi3Var3, i17, z4, i2, i16, m20Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final long m10032c0(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        ay9[] ay9VarArr = zx9.f72358b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    /* JADX INFO: renamed from: d */
    public static final long m10033d(float f, float f2, float f3, float f4, sa1 sa1Var) {
        int i;
        int i2;
        int i3;
        float fMo1401b;
        float fMo1400a;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float fMo1401b2;
        float fMo1400a2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f5;
        if (sa1Var.mo1402c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i20 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = i20 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i22 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i23 = aa1.f413l;
            return j;
        }
        if (((int) (sa1Var.f60575b >> 32)) != 3) {
            h54.m13056a("Color only works with ColorSpaces with 3 components");
        }
        int i24 = sa1Var.f60576c;
        if (i24 == -1) {
            h54.m13056a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i25 = 0;
        float fMo1401b3 = sa1Var.mo1401b(0);
        float fMo1400a3 = sa1Var.mo1400a(0);
        if (f >= fMo1401b3) {
            fMo1401b3 = f;
        }
        if (fMo1401b3 <= fMo1400a3) {
            fMo1400a3 = fMo1401b3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo1400a3);
        int i26 = iFloatToRawIntBits3 >>> 31;
        int i27 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i28 = iFloatToRawIntBits3 & 8388607;
        if (i27 == 255) {
            i2 = i28 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i27 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i29 = i28 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i29) + 1) | (i26 << 15);
                    } else {
                        i2 = i29;
                    }
                    short s = (short) i3;
                    fMo1401b = sa1Var.mo1401b(1);
                    fMo1400a = sa1Var.mo1400a(1);
                    if (f2 >= fMo1401b) {
                        fMo1401b = f2;
                    }
                    if (fMo1401b <= fMo1400a) {
                        fMo1400a = fMo1401b;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fMo1400a);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                fMo1401b2 = sa1Var.mo1401b(2);
                                fMo1400a2 = sa1Var.mo1400a(2);
                                if (f3 >= fMo1401b2) {
                                    fMo1401b2 = f3;
                                }
                                if (fMo1401b2 <= fMo1400a2) {
                                    fMo1400a2 = fMo1401b2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo1400a2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i25 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i25 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i25 = i15;
                                            }
                                            short s3 = (short) i18;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i30 = aa1.f413l;
                                            return j2;
                                        }
                                        if (i15 >= -10) {
                                            i19 = (i14 | 8388608) >> (1 - i15);
                                            if ((i19 & 4096) != 0) {
                                                i19 += 8192;
                                            }
                                            i17 = i19 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                i18 = i17 | (i12 << 15) | (i25 << 10);
                                short s4 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j3 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i31 = aa1.f413l;
                                return j3;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s5 = (short) i10;
                    fMo1401b2 = sa1Var.mo1401b(2);
                    fMo1400a2 = sa1Var.mo1400a(2);
                    if (f3 >= fMo1401b2) {
                        fMo1401b2 = f3;
                    }
                    if (fMo1401b2 <= fMo1400a2) {
                        fMo1400a2 = fMo1401b2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo1400a2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s6 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j4 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = aa1.f413l;
                                return j4;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s7 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j5 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i33 = aa1.f413l;
                    return j5;
                }
                if (i >= -10) {
                    int i34 = (i28 | 8388608) >> (1 - i);
                    if ((i34 & 4096) != 0) {
                        i34 += 8192;
                    }
                    i2 = i34 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i26 << 15) | (i << 10);
        short s8 = (short) i3;
        fMo1401b = sa1Var.mo1401b(1);
        fMo1400a = sa1Var.mo1400a(1);
        if (f2 >= fMo1401b) {
            fMo1401b = f2;
        }
        if (fMo1401b <= fMo1400a) {
            fMo1400a = fMo1401b;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fMo1400a);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) i10;
                    fMo1401b2 = sa1Var.mo1401b(2);
                    fMo1400a2 = sa1Var.mo1400a(2);
                    if (f3 >= fMo1401b2) {
                        fMo1401b2 = f3;
                    }
                    if (fMo1401b2 <= fMo1400a2) {
                        fMo1400a2 = fMo1401b2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo1400a2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s10 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j6 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i35 = aa1.f413l;
                                return j6;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s11 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j7 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i36 = aa1.f413l;
                    return j7;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s12 = (short) i10;
        fMo1401b2 = sa1Var.mo1401b(2);
        fMo1400a2 = sa1Var.mo1400a(2);
        if (f3 >= fMo1401b2) {
            fMo1401b2 = f3;
        }
        if (fMo1401b2 <= fMo1400a2) {
            fMo1400a2 = fMo1401b2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo1400a2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i25 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i25 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i25 = i15;
                    }
                    short s13 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j8 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = aa1.f413l;
                    return j8;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i25 << 10);
        short s14 = (short) i18;
        if (f4 >= 0.0f) {
        }
        long j9 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i38 = aa1.f413l;
        return j9;
    }

    /* JADX INFO: renamed from: d0 */
    public static final C0170a m10034d0(int i, ye1 ye1Var, ui3 ui3Var) {
        tj3 tj3Var = (tj3) ye1Var;
        View view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
        boolean zM22120g = tj3Var.m22120g(view);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (zM22120g || objM22097O == p84Var) {
            objM22097O = new C0170a(view, null, ui3Var);
            tj3Var.m22131l0(objM22097O);
        }
        C0170a c0170a = (C0170a) objM22097O;
        boolean zM22124i = tj3Var.m22124i(c0170a);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22124i || objM22097O2 == p84Var) {
            objM22097O2 = new C3412ok(c0170a, 3);
            tj3Var.m22131l0(objM22097O2);
        }
        m10041h(c0170a, (vi3) objM22097O2, tj3Var);
        return c0170a;
    }

    /* JADX INFO: renamed from: e */
    public static final long m10035e(int i) {
        long j = ((long) i) << 32;
        int i2 = aa1.f413l;
        return j;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m10036e0(JSONObject jSONObject, Context context, String str, bl2 bl2Var) throws JSONException {
        Object obj;
        IterableAPIMobileFrameworkType iterableAPIMobileFrameworkType;
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("manufacturer", Build.MANUFACTURER);
        jSONObject.put("systemName", Build.DEVICE);
        jSONObject.put("systemVersion", Build.VERSION.RELEASE);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("sdkVersion", Build.VERSION.SDK_INT);
        jSONObject.put("deviceId", str);
        jSONObject.put("appPackageName", context.getPackageName());
        Object string = null;
        try {
            obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            eh0.m11136q("IterableUtilImpl", "Error while retrieving app version", e);
            obj = null;
        }
        jSONObject.put("appVersion", obj);
        try {
            string = Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            eh0.m11136q("IterableUtilImpl", "Error while retrieving app version code", e2);
        }
        jSONObject.put("appBuild", string);
        jSONObject.put("iterableSdkVersion", "3.7.0");
        if (bl2Var == null || (iterableAPIMobileFrameworkType = (IterableAPIMobileFrameworkType) bl2Var.f8655a) == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("frameworkType", iterableAPIMobileFrameworkType.getValue());
        String str2 = (String) bl2Var.f8656b;
        if (str2 == null) {
            str2 = "unknown";
        }
        jSONObject2.put("iterableSdkVersion", str2);
        jSONObject.put("mobileFrameworkInfo", jSONObject2);
    }

    /* JADX INFO: renamed from: f */
    public static final long m10037f(long j) {
        long j2 = j << 32;
        int i = aa1.f413l;
        return j2;
    }

    /* JADX INFO: renamed from: f0 */
    public static final e16 m10038f0(zi3 zi3Var) {
        return new ft9(zi3Var);
    }

    /* JADX INFO: renamed from: g */
    public static long m10039g(int i, int i2, int i3) {
        return m10035e(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX INFO: renamed from: g0 */
    public static final e16 m10040g0(e16 e16Var, C3419on c3419on, vx9 vx9Var, vi3 vi3Var, int i, boolean z, int i2, int i3, wa3 wa3Var, List list, vi3 vi3Var2, vi3 vi3Var3, m20 m20Var) {
        return e16Var.mo3161g(b16.f7762a).mo3161g(new ns9(c3419on, vx9Var, wa3Var, vi3Var, i, z, i2, i3, list, vi3Var2, m20Var, vi3Var3));
    }

    /* JADX INFO: renamed from: h */
    public static final void m10041h(Object obj, vi3 vi3Var, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22120g = tj3Var.m22120g(obj);
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            objM22097O = new yh2(vi3Var);
            tj3Var.m22131l0(objM22097O);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m10042h0(long j) {
        float[] fArr = va1.f65096a;
        return (int) (aa1.m197a(j, va1.f65100e) >>> 32);
    }

    /* JADX INFO: renamed from: i */
    public static final void m10043i(Object obj, Object obj2, vi3 vi3Var, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22120g = tj3Var.m22120g(obj) | tj3Var.m22120g(obj2);
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            objM22097O = new yh2(vi3Var);
            tj3Var.m22131l0(objM22097O);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final String m10044i0(Continuation continuation) {
        Object failure;
        if (continuation instanceof kh2) {
            return ((kh2) continuation).toString();
        }
        try {
            failure = continuation + '@' + m10016N(continuation);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.m15355a(failure) != null) {
            failure = continuation.getClass().getName() + '@' + m10016N(continuation);
        }
        return (String) failure;
    }

    /* JADX INFO: renamed from: j */
    public static final void m10045j(Object[] objArr, vi3 vi3Var, ye1 ye1Var) {
        boolean zM22120g = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM22120g |= ((tj3) ye1Var).m22120g(obj);
        }
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            tj3Var.m22131l0(new yh2(vi3Var));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final String m10046j0(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: k */
    public static final void m10047k(ye1 ye1Var, zi3 zi3Var, Object obj) {
        kn1 kn1Var = ((tj3) ye1Var).f62383R;
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22120g = tj3Var.m22120g(obj);
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            objM22097O = new C0273b(kn1Var, zi3Var);
            tj3Var.m22131l0(objM22097O);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static JSONArray m10048k0(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj.getClass().equals(String.class)) {
                String strSubstring = (String) obj;
                if (strSubstring.length() > 1024) {
                    strSubstring = strSubstring.substring(0, 1024);
                }
                jSONArray.put(i, strSubstring);
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i, m10050l0((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                JSONArray jSONArray2 = (JSONArray) obj;
                m10048k0(jSONArray2);
                jSONArray.put(i, jSONArray2);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: l */
    public static final void m10049l(Object obj, Object obj2, zi3 zi3Var, ye1 ye1Var) {
        kn1 kn1Var = ((tj3) ye1Var).f62383R;
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22120g = tj3Var.m22120g(obj) | tj3Var.m22120g(obj2);
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            objM22097O = new C0273b(kn1Var, zi3Var);
            tj3Var.m22131l0(objM22097O);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static JSONObject m10050l0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            C3386nv.m17626m("Too many properties (more than 1024) in JSON");
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (obj.getClass().equals(String.class)) {
                    String strSubstring = (String) obj;
                    if (strSubstring.length() > 1024) {
                        strSubstring = strSubstring.substring(0, 1024);
                    }
                    jSONObject.put(str, strSubstring);
                } else if (obj.getClass().equals(JSONObject.class)) {
                    jSONObject.put(str, m10050l0((JSONObject) obj));
                } else if (obj.getClass().equals(JSONArray.class)) {
                    JSONArray jSONArray = (JSONArray) obj;
                    m10048k0(jSONArray);
                    jSONObject.put(str, jSONArray);
                }
            } catch (JSONException unused) {
                C3386nv.m17626m("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
                return null;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: m */
    public static final void m10051m(Object obj, Object obj2, Object obj3, zi3 zi3Var, ye1 ye1Var) {
        kn1 kn1Var = ((tj3) ye1Var).f62383R;
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22120g = tj3Var.m22120g(obj) | tj3Var.m22120g(obj2) | tj3Var.m22120g(obj3);
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            objM22097O = new C0273b(kn1Var, zi3Var);
            tj3Var.m22131l0(objM22097O);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static final void m10052m0(InterfaceC0354d interfaceC0354d, vi3 vi3Var) {
        AbstractC0362l abstractC0362l;
        if (((d16) interfaceC0354d).f34837a.f34836I && (abstractC0362l = te1.m21976I(interfaceC0354d, 2).f4433K) != null) {
            abstractC0362l.m1664E1(vi3Var, true);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m10053n(Object[] objArr, zi3 zi3Var, ye1 ye1Var) {
        kn1 kn1Var = ((tj3) ye1Var).f62383R;
        boolean zM22120g = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM22120g |= ((tj3) ye1Var).m22120g(obj);
        }
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            tj3Var.m22131l0(new C0273b(kn1Var, zi3Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0188 A[Catch: all -> 0x0185, TRY_ENTER, TryCatch #23 {all -> 0x0185, blocks: (B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d), top: B:271:0x0164, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0199 A[Catch: IllegalStateException -> 0x017f, IOException -> 0x0181, FileNotFoundException -> 0x0183, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x0183, IOException -> 0x0181, IllegalStateException -> 0x017f, blocks: (B:86:0x015c, B:91:0x017a, B:109:0x0199, B:107:0x0196, B:106:0x0193, B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d, B:103:0x018e), top: B:293:0x015c, inners: #23, #31 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01af  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d9 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #8 {all -> 0x01e7, blocks: (B:124:0x01cd, B:126:0x01d9, B:135:0x01ea), top: B:256:0x01cd, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01ea A[Catch: all -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x01e7, blocks: (B:124:0x01cd, B:126:0x01d9, B:135:0x01ea), top: B:256:0x01cd, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x0211  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237 A[Catch: all -> 0x0275, TryCatch #17 {all -> 0x0275, blocks: (B:158:0x0231, B:160:0x0237, B:161:0x023b, B:163:0x0241), top: B:266:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0241 A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #17 {all -> 0x0275, blocks: (B:158:0x0231, B:160:0x0237, B:161:0x023b, B:163:0x0241), top: B:266:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:240:0x02de  */
    /* JADX WARN: Code duplicated, block: B:265:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0246 A[EDGE_INSN: B:294:0x0246->B:165:0x0246 BREAK  A[LOOP:0: B:161:0x023b->B:295:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #15 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:265:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #15 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:265:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0170 A[Catch: all -> 0x0185, TRY_LEAVE, TryCatch #23 {all -> 0x0185, blocks: (B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d), top: B:271:0x0164, outer: #34 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX INFO: renamed from: n0 */
    public static void m10054n0(Context context, Executor executor, bm7 bm7Var, boolean z) {
        boolean z2;
        ?? M25551c;
        byte[] bArr;
        cd2[] cd2VarArrM2603g;
        cd2[] cd2VarArr;
        bm7 bm7Var2;
        cd2[] cd2VarArr2;
        byte[] bArr2;
        ?? r7;
        byte[] bArr3;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i;
        ?? r9;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r10;
        zc2 zc2Var;
        ?? r11;
        FileInputStream fileInputStreamM25551c;
        ?? r12;
        ?? r13;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                bm7Var.mo3878j(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    sm7.m21479c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            zc2 zc2Var2 = new zc2(assets, executor, bm7Var, name, file2);
            byte[] bArr5 = (byte[]) zc2Var2.f71351d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            zc2Var2.f71348a = true;
                            M25551c = zc2Var2.m25551c(assets, "dexopt/baseline.prof");
                            bArr = AbstractC0723a.f6560a;
                            if (M25551c != 0) {
                                if (Arrays.equals(bArr, fa4.m11629C(M25551c, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                cd2VarArrM2603g = AbstractC0723a.m2603g(M25551c, fa4.m11629C(M25551c, 4), (String) zc2Var2.f71354g);
                                M25551c.close();
                                zc2Var2.f71355h = cd2VarArrM2603g;
                            }
                            cd2VarArr = (cd2[]) zc2Var2.f71355h;
                            if (cd2VarArr != null) {
                                M25551c = "dexopt/baseline.profm";
                                fileInputStreamM25551c = zc2Var2.m25551c(assets, "dexopt/baseline.profm");
                                r11 = M25551c;
                                if (fileInputStreamM25551c == null) {
                                    if (fileInputStreamM25551c != null) {
                                        fileInputStreamM25551c.close();
                                        r11 = M25551c;
                                    }
                                    zc2Var = null;
                                    M25551c = r11;
                                } else {
                                    if (Arrays.equals(AbstractC0723a.f6561b, fa4.m11629C(fileInputStreamM25551c, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM11629C = fa4.m11629C(fileInputStreamM25551c, 4);
                                    zc2Var2.f71355h = AbstractC0723a.m2600d(fileInputStreamM25551c, bArrM11629C, bArr5, cd2VarArr);
                                    fileInputStreamM25551c.close();
                                    zc2Var = zc2Var2;
                                    M25551c = bArrM11629C;
                                }
                                if (zc2Var != null) {
                                    zc2Var2 = zc2Var;
                                }
                            }
                            bm7Var2 = (bm7) zc2Var2.f71350c;
                            cd2VarArr2 = (cd2[]) zc2Var2.f71355h;
                            bArr2 = (byte[]) zc2Var2.f71351d;
                            r7 = M25551c;
                            r7 = M25551c;
                            if (cd2VarArr2 != null) {
                                byteArrayOutputStream = zc2Var2.f71348a;
                                if (byteArrayOutputStream != 0) {
                                    C3386nv.m17633t("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (AbstractC0723a.m2605i(byteArrayOutputStream, bArr2, cd2VarArr2)) {
                                    zc2Var2.f71352e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    zc2Var2.f71355h = null;
                                    r7 = r10;
                                } else {
                                    bm7Var2.mo3878j(5, null);
                                    zc2Var2.f71355h = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr3 = (byte[]) zc2Var2.f71352e;
                            if (bArr3 != null) {
                                if (zc2Var2.f71348a) {
                                    C3386nv.m17633t("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream((File) zc2Var2.f71353f);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr4);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i);
                                        }
                                        r9 = 1;
                                        zc2Var2.m25552d(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        zc2Var2.f71352e = null;
                                        zc2Var2.f71355h = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                m10028Z(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            zc2Var2.m25552d(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        zc2Var2.m25552d(4, null);
                    }
                } else if (file2.canWrite()) {
                    zc2Var2.f71348a = true;
                    try {
                        M25551c = zc2Var2.m25551c(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        bm7Var.mo3878j(6, e);
                        M25551c = 0;
                    } catch (IOException e2) {
                        bm7Var.mo3878j(7, e2);
                        M25551c = 0;
                    }
                    bArr = AbstractC0723a.f6560a;
                    try {
                        if (M25551c != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr, fa4.m11629C(M25551c, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    cd2VarArrM2603g = AbstractC0723a.m2603g(M25551c, fa4.m11629C(M25551c, 4), (String) zc2Var2.f71354g);
                                    try {
                                        M25551c.close();
                                    } catch (IOException e3) {
                                        bm7Var.mo3878j(7, e3);
                                    }
                                    zc2Var2.f71355h = cd2VarArrM2603g;
                                } catch (IOException e4) {
                                    bm7Var.mo3878j(7, e4);
                                    try {
                                        M25551c.close();
                                    } catch (IOException e5) {
                                        bm7Var.mo3878j(7, e5);
                                    }
                                    cd2VarArrM2603g = null;
                                }
                            } catch (IllegalStateException e6) {
                                bm7Var.mo3878j(8, e6);
                                M25551c.close();
                                cd2VarArrM2603g = null;
                            }
                        }
                        cd2VarArr = (cd2[]) zc2Var2.f71355h;
                        if (cd2VarArr != null && (M25551c = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                M25551c = "dexopt/baseline.profm";
                                fileInputStreamM25551c = zc2Var2.m25551c(assets, "dexopt/baseline.profm");
                                r11 = M25551c;
                                if (fileInputStreamM25551c == null) {
                                    try {
                                        if (Arrays.equals(AbstractC0723a.f6561b, fa4.m11629C(fileInputStreamM25551c, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrM11629C2 = fa4.m11629C(fileInputStreamM25551c, 4);
                                        zc2Var2.f71355h = AbstractC0723a.m2600d(fileInputStreamM25551c, bArrM11629C2, bArr5, cd2VarArr);
                                        fileInputStreamM25551c.close();
                                        zc2Var = zc2Var2;
                                        M25551c = bArrM11629C2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamM25551c.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamM25551c != null) {
                                        fileInputStreamM25551c.close();
                                        r11 = M25551c;
                                    }
                                    zc2Var = null;
                                    M25551c = r11;
                                }
                            } catch (FileNotFoundException e7) {
                                bm7Var.mo3878j(9, e7);
                                r11 = M25551c;
                                zc2Var = null;
                                M25551c = r11;
                            } catch (IOException e8) {
                                bm7Var.mo3878j(7, e8);
                                r11 = M25551c;
                                zc2Var = null;
                                M25551c = r11;
                            } catch (IllegalStateException e9) {
                                zc2Var2.f71355h = null;
                                bm7Var.mo3878j(8, e9);
                                r11 = M25551c;
                                zc2Var = null;
                                M25551c = r11;
                            }
                            if (zc2Var != null) {
                                zc2Var2 = zc2Var;
                            }
                        }
                        bm7Var2 = (bm7) zc2Var2.f71350c;
                        cd2VarArr2 = (cd2[]) zc2Var2.f71355h;
                        bArr2 = (byte[]) zc2Var2.f71351d;
                        r7 = M25551c;
                        r7 = M25551c;
                        if (cd2VarArr2 != null && bArr2 != null) {
                            byteArrayOutputStream = zc2Var2.f71348a;
                            if (byteArrayOutputStream != 0) {
                                C3386nv.m17633t("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (AbstractC0723a.m2605i(byteArrayOutputStream, bArr2, cd2VarArr2)) {
                                        bm7Var2.mo3878j(5, null);
                                        zc2Var2.f71355h = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        zc2Var2.f71352e = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        zc2Var2.f71355h = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                bm7Var2.mo3878j(7, e10);
                                r10 = byteArrayOutputStream;
                            } catch (IllegalStateException e11) {
                                bm7Var2.mo3878j(8, e11);
                                r10 = byteArrayOutputStream;
                            }
                        }
                        bArr3 = (byte[]) zc2Var2.f71352e;
                        if (bArr3 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (zc2Var2.f71348a) {
                                    C3386nv.m17633t("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) zc2Var2.f71353f);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i = byteArrayInputStream.read(bArr4);
                                                                                    if (i > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                zc2Var2.m25552d(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                zc2Var2.f71352e = null;
                                                                                zc2Var2.f71355h = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        zc2Var2.m25552d(6, e);
                                        r8 = r7;
                                        zc2Var2.f71352e = null;
                                        zc2Var2.f71355h = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e13) {
                                        e = e13;
                                        zc2Var2.m25552d(7, e);
                                        r8 = r7;
                                        zc2Var2.f71352e = null;
                                        zc2Var2.f71355h = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    r7 = 1;
                                    zc2Var2.m25552d(6, e);
                                    r8 = r7;
                                    zc2Var2.f71352e = null;
                                    zc2Var2.f71355h = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e15) {
                                    e = e15;
                                    r7 = 1;
                                    zc2Var2.m25552d(7, e);
                                    r8 = r7;
                                    zc2Var2.f71352e = null;
                                    zc2Var2.f71355h = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                zc2Var2.f71352e = null;
                                zc2Var2.f71355h = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            m10028Z(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            M25551c.close();
                            throw th24;
                        } catch (IOException e16) {
                            bm7Var.mo3878j(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    zc2Var2.m25552d(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                sm7.m21479c(context, r13);
            }
            zc2Var2.m25552d(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            sm7.m21479c(context, r13);
        } catch (PackageManager.NameNotFoundException e17) {
            bm7Var.mo3878j(7, e17);
            sm7.m21479c(context, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x01fb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final void m10055o(final e16 e16Var, final C3419on c3419on, final vi3 vi3Var, final boolean z, final Map map, final vx9 vx9Var, final int i, final boolean z2, final int i2, final int i3, final wa3 wa3Var, final vi3 vi3Var2, final m20 m20Var, ye1 ye1Var, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        tj3 tj3Var;
        C0180h c0180h;
        ui3 ui3Var;
        Pair pair;
        t66 t66Var;
        t66 t66Var2;
        vi3 vi3Var3;
        int i9;
        Object obj;
        Object obj2;
        Object xw9Var;
        Object obj3;
        Object obj4;
        Object obj5;
        Map map2 = map;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2118572703);
        if ((i4 & 6) == 0) {
            i6 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= tj3Var2.m22120g(c3419on) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= tj3Var2.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= tj3Var2.m22122h(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= tj3Var2.m22124i(map2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= tj3Var2.m22120g(vx9Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i7 = i;
            i6 |= tj3Var2.m22116e(i7) ? 1048576 : 524288;
        } else {
            i7 = i;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= tj3Var2.m22122h(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= tj3Var2.m22116e(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= tj3Var2.m22116e(i3) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i8 = i5 | (tj3Var2.m22124i(wa3Var) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= tj3Var2.m22124i(null) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i8 |= tj3Var2.m22124i(null) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= tj3Var2.m22124i(vi3Var2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= (32768 & i5) == 0 ? tj3Var2.m22120g(m20Var) : tj3Var2.m22124i(m20Var) ? 16384 : 8192;
        }
        if (tj3Var2.m22099R(i6 & 1, ((i6 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean zM22060s = thb.m22060s(c3419on);
            Object obj6 = we1.f66679a;
            if (zM22060s) {
                tj3Var2.m22111b0(145641571);
                boolean z3 = (i6 & 112) == 32;
                Object objM22097O = tj3Var2.m22097O();
                Object obj7 = objM22097O;
                if (z3 || objM22097O == obj6) {
                    Object c0180h2 = new C0180h(c3419on);
                    tj3Var2.m22131l0(c0180h2);
                    obj7 = c0180h2;
                }
                tj3Var2.m22139q(false);
                c0180h = (C0180h) obj7;
            } else {
                tj3Var2.m22111b0(145707228);
                tj3Var2.m22139q(false);
                c0180h = null;
            }
            if (thb.m22060s(c3419on)) {
                tj3Var2.m22111b0(145905443);
                boolean zM22120g = ((i6 & 112) == 32) | tj3Var2.m22120g(c0180h);
                Object objM22097O2 = tj3Var2.m22097O();
                Object obj8 = objM22097O2;
                if (zM22120g || objM22097O2 == obj6) {
                    Object c3006fm = new C3006fm(4, c0180h, c3419on);
                    tj3Var2.m22131l0(c3006fm);
                    obj8 = c3006fm;
                }
                ui3Var = (ui3) obj8;
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(146002721);
                boolean z4 = (i6 & 112) == 32;
                Object objM22097O3 = tj3Var2.m22097O();
                Object obj9 = objM22097O3;
                if (z4 || objM22097O3 == obj6) {
                    Object c3757xf = new C3757xf(c3419on, 4);
                    tj3Var2.m22131l0(c3757xf);
                    obj9 = c3757xf;
                }
                ui3Var = (ui3) obj9;
                tj3Var2.m22139q(false);
            }
            if (z) {
                if (map2 != null) {
                    Pair pair2 = AbstractC3617tn.f62551a;
                    if (map2.isEmpty()) {
                        pair = AbstractC3617tn.f62551a;
                    } else {
                        List listM18172b = c3419on.m18172b(0, "androidx.compose.foundation.text.inlineContent", c3419on.f54604b.length());
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = listM18172b.size();
                        int i10 = 0;
                        while (i10 < size) {
                            List list = listM18172b;
                            C3378nn c3378nn = (C3378nn) listM18172b.get(i10);
                            int i11 = size;
                            Object obj10 = c3378nn.f52979a;
                            int i12 = i10;
                            int i13 = c3378nn.f52981c;
                            int i14 = c3378nn.f52980b;
                            u54 u54Var = (u54) map2.get(obj10);
                            if (u54Var != null) {
                                arrayList.add(new C3378nn(u54Var.f63434a, i14, i13));
                                arrayList2.add(new C3378nn(cgc.f10043i, i14, i13));
                            }
                            i10 = i12 + 1;
                            map2 = map;
                            size = i11;
                            listM18172b = list;
                        }
                        pair = new Pair(arrayList, arrayList2);
                    }
                } else {
                    pair = AbstractC3617tn.f62551a;
                }
                t66Var = null;
            } else {
                ui3Var = ui3Var;
                t66Var = null;
                pair = new Pair(null, null);
            }
            List list2 = (List) pair.f47623a;
            List list3 = (List) pair.f47624b;
            if (z) {
                tj3Var2.m22111b0(146318828);
                Object objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == obj6) {
                    obj5 = objM22097O4;
                    Object objM1260j = AbstractC0278f.m1260j(t66Var);
                    tj3Var2.m22131l0(objM1260j);
                    obj5 = objM1260j;
                }
                obj5 = objM22097O4;
                t66Var2 = (t66) obj5;
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(146406588);
                tj3Var2.m22139q(false);
                t66Var2 = t66Var;
            }
            if (z) {
                tj3Var2.m22111b0(146499837);
                boolean zM22120g2 = tj3Var2.m22120g(t66Var2);
                Object objM22097O5 = tj3Var2.m22097O();
                if (zM22120g2 || objM22097O5 == obj6) {
                    Object gb0Var = new gb0(1, t66Var2);
                    tj3Var2.m22131l0(gb0Var);
                    obj4 = gb0Var;
                } else {
                    obj4 = objM22097O5;
                }
                tj3Var2.m22139q(false);
                vi3Var3 = (vi3) obj4;
            } else {
                tj3Var2.m22111b0(146571260);
                tj3Var2.m22139q(false);
                vi3Var3 = null;
            }
            int i15 = (i6 >> 3) & 14;
            nb0.m17307a(c3419on, vx9Var, wa3Var, list2, tj3Var2);
            C3419on c3419on2 = (C3419on) ui3Var.mo0a();
            boolean zM22124i = tj3Var2.m22124i(c0180h) | ((i6 & 896) == 256);
            Object objM22097O6 = tj3Var2.m22097O();
            if (zM22124i || objM22097O6 == obj6) {
                i9 = 0;
                Object ib0Var = new ib0(c0180h, vi3Var, i9);
                tj3Var2.m22131l0(ib0Var);
                obj = ib0Var;
            } else {
                i9 = 0;
                obj = objM22097O6;
            }
            tj3 tj3Var3 = tj3Var2;
            t66 t66Var3 = t66Var2;
            boolean z5 = i9;
            e16 e16VarM10040g0 = m10040g0(e16Var, c3419on2, vx9Var, (vi3) obj, i7, z2, i2, i3, wa3Var, list2, vi3Var3, vi3Var2, m20Var);
            if (z) {
                tj3Var3.m22111b0(147927697);
                boolean zM22124i2 = tj3Var3.m22124i(c0180h);
                Object objM22097O7 = tj3Var3.m22097O();
                if (zM22124i2 || objM22097O7 == obj6) {
                    obj2 = objM22097O7;
                    Object jb0Var = new jb0(c0180h, 1);
                    tj3Var3.m22131l0(jb0Var);
                    obj2 = jb0Var;
                }
                ui3 ui3Var2 = (ui3) obj2;
                boolean zM22120g3 = tj3Var3.m22120g(t66Var3);
                Object objM22097O8 = tj3Var3.m22097O();
                Object obj11 = objM22097O8;
                if (zM22120g3 || objM22097O8 == obj6) {
                    Object kb0Var = new kb0(z5 ? 1 : 0, t66Var3);
                    tj3Var3.m22131l0(kb0Var);
                    obj11 = kb0Var;
                }
                xw9Var = new xw9(ui3Var2, (ui3) obj11);
                tj3Var3.m22139q(z5);
            } else {
                tj3Var3.m22111b0(147750935);
                boolean zM22124i3 = tj3Var3.m22124i(c0180h);
                Object objM22097O9 = tj3Var3.m22097O();
                if (zM22124i3 || objM22097O9 == obj6) {
                    obj3 = objM22097O9;
                    Object jb0Var2 = new jb0(c0180h, z5 ? 1 : 0);
                    tj3Var3.m22131l0(jb0Var2);
                    obj3 = jb0Var2;
                }
                xw9Var = new ne5((ui3) obj3);
                tj3Var3.m22139q(z5);
            }
            int iHashCode = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m = tj3Var3.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM10040g0);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var3);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, C0352b.f4303f, xw9Var);
            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var3, C0352b.f4305h);
            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
            if (c0180h == null) {
                tj3Var3.m22111b0(-433557001);
            } else {
                tj3Var3.m22111b0(-291080374);
                c0180h.m1077a(tj3Var3, z5 ? 1 : 0);
            }
            tj3Var3.m22139q(z5);
            if (list3 == null) {
                tj3Var3.m22111b0(-433506223);
                tj3Var3.m22139q(z5);
            } else {
                tj3Var3.m22111b0(-433506222);
                AbstractC3617tn.m22238a(c3419on, list3, tj3Var3, i15);
                tj3Var3.m22139q(z5);
            }
            tj3Var3.m22139q(true);
            tj3Var = tj3Var3;
        } else {
            tj3 tj3Var4 = tj3Var2;
            tj3Var4.m22102U();
            tj3Var = tj3Var4;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: fb0
                @Override // p000.zi3
                public final Object invoke(Object obj12, Object obj13) {
                    ((Integer) obj13).getClass();
                    int iM19383z = pk9.m19383z(i4 | 1);
                    int iM19383z2 = pk9.m19383z(i5);
                    d32.m10055o(e16Var, c3419on, vi3Var, z, map, vx9Var, i, z2, i2, i3, wa3Var, vi3Var2, m20Var, (ye1) obj12, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m10056p(Playlist playlist, boolean z, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ye1 ye1Var, int i) {
        ui3 ui3Var4;
        boolean z2;
        t66 t66Var;
        ui3 ui3Var5 = ui3Var3;
        playlist.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var5.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1553193158);
        int i2 = i | (tj3Var.m22124i(playlist) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var2) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var5) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            b16 b16Var = b16.f7762a;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(b16Var, 1.0f), 15);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM815b, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, ((fe9) tj3Var.m22128k(zf1Var)).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var6 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var6);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            lw9.m16554b(playlist.m8116a(), e65.m10871c(tj3Var, e16VarM1322c, zi3Var4, 1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 24960, 110588);
            tj3Var = tj3Var;
            if (z) {
                tj3Var.m22111b0(-430022922);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var6);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    t66Var = t66Var2;
                    objM22097O2 = new do4(24, t66Var);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    t66Var = t66Var2;
                }
                omd.m18141c((ui3) objM22097O2, null, false, null, null, igc.f44096b, tj3Var, 1572870, 62);
                boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new do4(25, t66Var);
                    tj3Var.m22131l0(objM22097O3);
                }
                ui3Var4 = ui3Var2;
                ui3Var5 = ui3Var3;
                AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O3, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(283489436, new a05((Object) ui3Var4, (Object) ui3Var5, (Object) t66Var, 8), tj3Var), tj3Var, 48, 2044);
                tj3Var = tj3Var;
                z2 = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                ui3Var4 = ui3Var2;
                ui3Var5 = ui3Var3;
                z2 = true;
                tj3Var.m22111b0(-428967744);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z2);
        } else {
            ui3Var4 = ui3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new uy0(playlist, z, ui3Var, ui3Var4, ui3Var5, i);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m10057q(final List list, boolean z, boolean z2, final vi3 vi3Var, final vi3 vi3Var2, final vi3 vi3Var3, final ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        tj3 tj3Var;
        boolean z5;
        list.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1854061628);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= tj3Var2.m22122h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= tj3Var2.m22122h(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 1048576 : 524288;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 599187) != 599186)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4429v = c99.m4429v(c99.m4412e(b16Var, 1.0f));
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4429v);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.playlist_playlists), AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, 1).mo3161g(new gv3(nj0.f52792K)), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var2, 0, 0, 131068);
            e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, c99.m4412e(b16Var, 1.0f), false);
            boolean zM22124i = tj3Var2.m22124i(list) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((i2 & 112) == 32) | ((i2 & 3670016) == 1048576);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                final boolean z6 = z3;
                final boolean z7 = z4;
                z5 = true;
                vi3 vi3Var4 = new vi3() { // from class: gf7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        vu4 vu4Var = (vu4) obj;
                        vu4Var.getClass();
                        lz5 lz5Var = new lz5(26);
                        List list2 = list;
                        vu4Var.m23547h(list2.size(), new ue0(17, lz5Var, list2), new C3520r2(26, list2), new C0282a(802480018, true, new lf7(list2, z7, vi3Var, vi3Var2, vi3Var3)));
                        if (z6) {
                            vu4.m23545g(vu4Var, null, new C0282a(-1111078562, true, new ze2(7, ui3Var)), 3);
                        }
                        vu4.m23545g(vu4Var, null, igc.f44095a, 3);
                        return xfa.f68157a;
                    }
                };
                tj3Var2.m22131l0(vi3Var4);
                objM22097O = vi3Var4;
            } else {
                z5 = true;
            }
            fa4.m11642c(e16VarM17728c, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var2, 0, 510);
            tj3Var = tj3Var2;
            tj3Var.m22139q(z5);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ny3(list, z, z2, vi3Var, vi3Var2, vi3Var3, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m10058r(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-678349963);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16.f7762a, 1.0f), 300.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4414g);
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
            do7.m10527c(null, 0L, 0.0f, 0.0f, tj3Var, 0, 15);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yu4(i, 29);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m10059s(yf7 yf7Var, boolean z, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(134915738);
        int i2 = i | (tj3Var.m22120g(yf7Var) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22124i(vi3Var2) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var3) ? 16384 : 8192) | (tj3Var.m22124i(ui3Var) ? 131072 : 65536);
        if (!tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            tj3Var.m22102U();
        } else if (yf7Var instanceof wf7) {
            tj3Var.m22111b0(-814330249);
            m10058r(tj3Var, 0);
            tj3Var.m22139q(false);
        } else {
            if (!(yf7Var instanceof xf7)) {
                throw ux5.m23001x(tj3Var, 805013823, false);
            }
            tj3Var.m22111b0(-814225531);
            boolean z2 = !z;
            m10057q(((xf7) yf7Var).m24486b(), z2, z2, vi3Var, vi3Var2, vi3Var3, ui3Var, tj3Var, (i2 << 3) & 4193280);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py3(yf7Var, z, vi3Var, vi3Var2, vi3Var3, ui3Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:103:0x020b  */
    /* JADX WARN: Code duplicated, block: B:105:0x021b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0229  */
    /* JADX WARN: Code duplicated, block: B:108:0x022e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x024a  */
    /* JADX WARN: Code duplicated, block: B:114:0x026b  */
    /* JADX WARN: Code duplicated, block: B:115:0x026e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x027d  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:135:0x0301  */
    /* JADX WARN: Code duplicated, block: B:137:0x0309  */
    /* JADX WARN: Code duplicated, block: B:139:0x031c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0322  */
    /* JADX WARN: Code duplicated, block: B:144:0x0330  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x0108  */
    /* JADX WARN: Code duplicated, block: B:74:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:78:0x011a  */
    /* JADX WARN: Code duplicated, block: B:79:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0177  */
    /* JADX WARN: Code duplicated, block: B:95:0x0190  */
    /* JADX WARN: Code duplicated, block: B:96:0x0192  */
    /* JADX WARN: Code duplicated, block: B:99:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x00df, please report this as an issue */
    /* JADX INFO: renamed from: t */
    public static final void m10060t(final boolean z, final int i, final String str, boolean z2, boolean z3, final uf7 uf7Var, C0269z c0269z, ye1 ye1Var, final int i2, final int i3) {
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        boolean z6;
        final C0269z c0269z2;
        tj3 tj3Var;
        final boolean z7;
        final boolean z8;
        x18 x18VarM22143u;
        int i8;
        final C0269z c0269zM1154g;
        final boolean z9;
        int i9;
        final boolean z10;
        final C0269z c0269z3;
        String str2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM22097O;
        p84 p84Var;
        vi3 vi3Var;
        dua duaVarM21396a;
        p56 p56VarM10257a;
        final C1833i c1833i;
        Object objM22097O2;
        final un1 un1Var;
        int i10;
        boolean z16;
        boolean z17;
        Object objM22097O3;
        yf7 yf7Var;
        C0269z c0269z4;
        tj3 tj3Var2;
        nd7 nd7VarM24485a;
        boolean z18;
        ld7 ld7Var;
        boolean zM22124i;
        Object objM22097O4;
        boolean zM22124i2;
        Object objM22097O5;
        boolean zM22124i3;
        Object objM22097O6;
        boolean z19;
        boolean z20;
        Object objM22097O7;
        x18 x18VarM22143u2;
        str.getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(657450793);
        int i11 = (tj3Var3.m22122h(z) ? 4 : 2) | i2 | (tj3Var3.m22116e(i) ? 32 : 16) | (tj3Var3.m22120g(str) ? 256 : 128);
        int i12 = i3 & 8;
        if (i12 == 0) {
            if ((i2 & 3072) == 0) {
                z4 = z2;
                i11 |= tj3Var3.m22122h(z4) ? 2048 : 1024;
            }
            i4 = i3 & 16;
            if (i4 != 0) {
                if ((i2 & 24576) == 0) {
                    z5 = z3;
                    if (tj3Var3.m22122h(z5)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i11 |= i5;
                }
                if (tj3Var3.m22120g(uf7Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i7 = i11 | i6 | 524288;
                if ((i7 & 599187) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (tj3Var3.m22099R(i7 & 1, z6)) {
                    tj3Var3.m22104W();
                    if ((i2 & 1) != 0 || tj3Var3.m22084B()) {
                        if (i12 != 0) {
                            z4 = false;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        }
                        i8 = i7 & (-3670017);
                        c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var3, 6, 2);
                    } else {
                        tj3Var3.m22102U();
                        i8 = i7 & (-3670017);
                        c0269zM1154g = c0269z;
                    }
                    z9 = z4;
                    i9 = i8;
                    z10 = z5;
                    tj3Var3.m22140r();
                    if (!z) {
                        x18VarM22143u2 = tj3Var3.m22143u();
                        if (x18VarM22143u2 != null) {
                            final int i13 = 1;
                            x18VarM22143u2.f67642d = new zi3() { // from class: ff7
                                @Override // p000.zi3
                                public final Object invoke(Object obj, Object obj2) {
                                    int i14 = i13;
                                    xfa xfaVar = xfa.f68157a;
                                    int i15 = i2;
                                    switch (i14) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iM19383z = pk9.m19383z(i15 | 1);
                                            d32.m10060t(z, i, str, z9, z10, uf7Var, c0269zM1154g, (ye1) obj, iM19383z, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iM19383z2 = pk9.m19383z(i15 | 1);
                                            d32.m10060t(z, i, str, z9, z10, uf7Var, c0269zM1154g, (ye1) obj, iM19383z2, i3);
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    c0269z3 = c0269zM1154g;
                    str2 = "playlists_sheet_" + i + "_" + z10;
                    if ((i9 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i9 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z21 = z11 | z12;
                    if ((i9 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z22 = z21 | z13;
                    if ((57344 & i9) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z22 | z14;
                    objM22097O = tj3Var3.m22097O();
                    p84Var = we1.f66679a;
                    if (z15 || objM22097O == p84Var) {
                        objM22097O = new vi3() { // from class: hf7
                            @Override // p000.vi3
                            public final Object invoke(Object obj) {
                                my1 my1Var = (my1) obj;
                                my1Var.getClass();
                                vf7 vf7Var = new vf7(str, i, z9, z10);
                                ny1 ny1Var = my1Var.f52029a;
                                oy1 oy1Var = ny1Var.f53386b;
                                C1523f c1523f = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 1);
                                C1523f c1523f2 = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 0);
                                ky1 ky1Var = oy1Var.f55228b;
                                C3713w8 c3713w8 = new C3713w8((xd7) ky1Var.f48629N.get(), 0);
                                C3676v8 c3676v8 = new C3676v8((xd7) ky1Var.f48629N.get(), 0);
                                C3713w8 c3713w9 = new C3713w8((xd7) ky1Var.f48629N.get(), 2);
                                C3676v8 c3676v9 = new C3676v8((xd7) ky1Var.f48629N.get(), 1);
                                web webVar = new web((xd7) ky1Var.f48629N.get());
                                C3713w8 c3713w10 = new C3713w8((xd7) ky1Var.f48629N.get(), 3);
                                C3676v8 c3676v10 = new C3676v8((xd7) ky1Var.f48629N.get(), 2);
                                ky1 ky1Var2 = ny1Var.f53385a;
                                return new C1833i(vf7Var, c1523f, c1523f2, c3713w8, c3676v8, c3713w9, c3676v9, webVar, c3713w10, c3676v10, (hm5) ky1Var2.f48736r.get(), (af7) ky1Var2.f48587A2.get(), (cma) ky1Var2.f48596D.get(), (bia) ky1Var2.f48652U1.get(), yn1.m25210a());
                            }
                        };
                        tj3Var3.m22131l0(objM22097O);
                    }
                    vi3Var = (vi3) objM22097O;
                    duaVarM21396a = si5.m21396a(tj3Var3);
                    if (duaVarM21396a != null) {
                        C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    nt3 nt3VarM21591B = AbstractC3584sr.m21591B(duaVarM21396a, tj3Var3);
                    if (duaVarM21396a instanceof gr3) {
                        p56VarM10257a = AbstractC2921a.m10257a(((gr3) duaVarM21396a).mo2103e(), vi3Var);
                    } else {
                        p56VarM10257a = AbstractC2921a.m10257a(or1.f54780b, vi3Var);
                    }
                    c1833i = (C1833i) pfa.m19114d(y38.m24933a(C1833i.class), duaVarM21396a, str2, nt3VarM21591B, p56VarM10257a, tj3Var3);
                    final t66 t66VarM2513c = AbstractC0711a.m2513c(c1833i.m8511X2(), tj3Var3);
                    objM22097O2 = tj3Var3.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = m10013K(tj3Var3);
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    un1Var = (un1) objM22097O2;
                    boolean zM22124i4 = tj3Var3.m22124i(un1Var) | tj3Var3.m22120g(c0269z3);
                    i10 = i9 & 458752;
                    if (i10 != 131072) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    z17 = zM22124i4 | z16;
                    objM22097O3 = tj3Var3.m22097O();
                    if (z17 || objM22097O3 == p84Var) {
                        objM22097O3 = new ui3() { // from class: com.lingq.core.playlists.e
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                wfb.m23926u(un1Var, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$2$1$1(c0269z3, uf7Var, null), 3);
                                return xfa.f68157a;
                            }
                        };
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    ng0 ng0Var = ng0.f52694a;
                    AbstractC0231g.m1150c((ui3) objM22097O3, null, c0269z3, 0.0f, false, null, 0L, 0L, ng0.m17408b(tj3Var3), null, null, null, ci8.m4703P(-1595674105, new aj3() { // from class: if7
                        @Override // p000.aj3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            ye1 ye1Var2 = (ye1) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((db1) obj).getClass();
                            tj3 tj3Var4 = (tj3) ye1Var2;
                            if (tj3Var4.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                final dh9 dh9Var = t66VarM2513c;
                                yf7 yf7Var2 = (yf7) dh9Var.getValue();
                                final boolean z23 = z10;
                                boolean zM22122h = tj3Var4.m22122h(z23);
                                final C1833i c1833i2 = c1833i;
                                boolean zM22124i5 = zM22122h | tj3Var4.m22124i(c1833i2);
                                final un1 un1Var2 = un1Var;
                                boolean zM22124i6 = zM22124i5 | tj3Var4.m22124i(un1Var2);
                                final C0269z c0269z5 = c0269z3;
                                boolean zM22120g = zM22124i6 | tj3Var4.m22120g(c0269z5);
                                final uf7 uf7Var2 = uf7Var;
                                boolean zM22124i7 = tj3Var4.m22124i(uf7Var2) | zM22120g;
                                Object objM22097O8 = tj3Var4.m22097O();
                                p84 p84Var2 = we1.f66679a;
                                if (zM22124i7 || objM22097O8 == p84Var2) {
                                    vi3 vi3Var2 = new vi3() { // from class: com.lingq.core.playlists.b
                                        @Override // p000.vi3
                                        public final Object invoke(Object obj4) {
                                            C1833i c1833i3 = c1833i2;
                                            nn1 nn1Var = c1833i3.f22316n;
                                            Playlist playlist = (Playlist) obj4;
                                            playlist.getClass();
                                            if (z23) {
                                                wfb.m23926u(lda.m16103C(c1833i3), nn1Var, null, new PlaylistsSheetViewModel$removeFromPlaylist$1(c1833i3, playlist, null), 2);
                                            } else {
                                                wfb.m23926u(lda.m16103C(c1833i3), nn1Var, null, new PlaylistsSheetViewModel$addToPlaylist$1(c1833i3, playlist, null), 2);
                                            }
                                            wfb.m23926u(un1Var2, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$1$1$1(c0269z5, uf7Var2, null), 3);
                                            return xfa.f68157a;
                                        }
                                    };
                                    tj3Var4.m22131l0(vi3Var2);
                                    objM22097O8 = vi3Var2;
                                }
                                vi3 vi3Var3 = (vi3) objM22097O8;
                                boolean zM22124i8 = tj3Var4.m22124i(c1833i2);
                                Object objM22097O9 = tj3Var4.m22097O();
                                if (zM22124i8 || objM22097O9 == p84Var2) {
                                    objM22097O9 = new fy4(c1833i2, 29);
                                    tj3Var4.m22131l0(objM22097O9);
                                }
                                vi3 vi3Var4 = (vi3) objM22097O9;
                                boolean zM22124i9 = tj3Var4.m22124i(c1833i2);
                                Object objM22097O10 = tj3Var4.m22097O();
                                if (zM22124i9 || objM22097O10 == p84Var2) {
                                    objM22097O10 = new C1830f(c1833i2, 4);
                                    tj3Var4.m22131l0(objM22097O10);
                                }
                                vi3 vi3Var5 = (vi3) objM22097O10;
                                boolean zM22120g2 = tj3Var4.m22120g(dh9Var) | tj3Var4.m22124i(c1833i2) | tj3Var4.m22124i(un1Var2) | tj3Var4.m22120g(c0269z5) | tj3Var4.m22124i(uf7Var2);
                                Object objM22097O11 = tj3Var4.m22097O();
                                if (zM22120g2 || objM22097O11 == p84Var2) {
                                    ui3 ui3Var = new ui3() { // from class: com.lingq.core.playlists.c
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            yf7 yf7Var3 = (yf7) dh9Var.getValue();
                                            if ((yf7Var3 instanceof xf7) && ((xf7) yf7Var3).f68153b) {
                                                C3244l c3244l = c1833i2.f22317o;
                                                kd7 kd7Var = new kd7(null);
                                                c3244l.getClass();
                                                c3244l.m15572j(null, kd7Var);
                                            } else {
                                                wfb.m23926u(un1Var2, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1(c0269z5, uf7Var2, null), 3);
                                            }
                                            return xfa.f68157a;
                                        }
                                    };
                                    tj3Var4.m22131l0(ui3Var);
                                    objM22097O11 = ui3Var;
                                }
                                d32.m10059s(yf7Var2, z23, vi3Var3, vi3Var4, vi3Var5, (ui3) objM22097O11, tj3Var4, 0);
                            } else {
                                tj3Var4.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var3), tj3Var3, 0, 3072, 7674);
                    yf7Var = (yf7) t66VarM2513c.getValue();
                    if (yf7Var instanceof xf7) {
                        tj3Var3.m22111b0(1068121637);
                        nd7VarM24485a = ((xf7) yf7Var).m24485a();
                        if (nd7VarM24485a instanceof md7) {
                            tj3Var3.m22111b0(1068179142);
                            z18 = false;
                            tj3Var3.m22139q(false);
                            c0269z4 = c0269z3;
                            tj3Var2 = tj3Var3;
                        } else {
                            z18 = false;
                            z18 = false;
                            if (nd7VarM24485a instanceof kd7) {
                                tj3Var3.m22111b0(1068260114);
                                String strM15137a = ((kd7) nd7VarM24485a).m15137a();
                                zM22124i3 = tj3Var3.m22124i(c1833i);
                                objM22097O6 = tj3Var3.m22097O();
                                if (zM22124i3 || objM22097O6 == p84Var) {
                                    final int i14 = z18 ? 1 : 0;
                                    objM22097O6 = new ui3() { // from class: jf7
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            int i15 = i14;
                                            xfa xfaVar = xfa.f68157a;
                                            C1833i c1833i2 = c1833i;
                                            switch (i15) {
                                                case 0:
                                                    c1833i2.m8510W2();
                                                    break;
                                                default:
                                                    c1833i2.m8510W2();
                                                    break;
                                            }
                                            return xfaVar;
                                        }
                                    };
                                    tj3Var3.m22131l0(objM22097O6);
                                }
                                ui3 ui3Var = (ui3) objM22097O6;
                                boolean zM22124i5 = tj3Var3.m22124i(c1833i) | tj3Var3.m22124i(un1Var) | tj3Var3.m22120g(c0269z3);
                                if (i10 != 131072) {
                                    z19 = false;
                                } else {
                                    z19 = true;
                                }
                                z20 = zM22124i5 | z19;
                                objM22097O7 = tj3Var3.m22097O();
                                if (!z20 || objM22097O7 == p84Var) {
                                    C3615tl c3615tl = new C3615tl(c1833i, un1Var, c0269z3, uf7Var, 8);
                                    c0269z4 = c0269z3;
                                    tj3Var3.m22131l0(c3615tl);
                                    objM22097O7 = c3615tl;
                                } else {
                                    c0269z4 = c0269z3;
                                }
                                AbstractC1825a.m8506a(strM15137a, ui3Var, (vi3) objM22097O7, null, tj3Var3, 6, 16);
                                tj3Var2 = tj3Var3;
                                tj3Var2.m22139q(false);
                            } else {
                                c0269z4 = c0269z3;
                                if (nd7VarM24485a instanceof ld7) {
                                    tj3Var2 = tj3Var3;
                                    throw ux5.m23001x(tj3Var2, 450097533, false);
                                }
                                tj3Var2.m22111b0(1068846882);
                                ld7Var = (ld7) nd7VarM24485a;
                                String strM16100b = ld7Var.m16100b();
                                String strM16099a = ld7Var.m16099a();
                                zM22124i = tj3Var2.m22124i(c1833i);
                                objM22097O4 = tj3Var2.m22097O();
                                if (zM22124i || objM22097O4 == p84Var) {
                                    tj3Var2 = tj3Var3;
                                    final int i15 = 1;
                                    objM22097O4 = new ui3() { // from class: jf7
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            int i16 = i15;
                                            xfa xfaVar = xfa.f68157a;
                                            C1833i c1833i2 = c1833i;
                                            switch (i16) {
                                                case 0:
                                                    c1833i2.m8510W2();
                                                    break;
                                                default:
                                                    c1833i2.m8510W2();
                                                    break;
                                            }
                                            return xfaVar;
                                        }
                                    };
                                    tj3Var2.m22131l0(objM22097O4);
                                }
                                ui3 ui3Var2 = (ui3) objM22097O4;
                                zM22124i2 = tj3Var2.m22124i(nd7VarM24485a) | tj3Var2.m22124i(c1833i);
                                objM22097O5 = tj3Var2.m22097O();
                                if (zM22124i2 || objM22097O5 == p84Var) {
                                    objM22097O5 = new ui5(9, c1833i, ld7Var);
                                    tj3Var2.m22131l0(objM22097O5);
                                }
                                AbstractC1825a.m8507b(strM16100b, strM16099a, ui3Var2, (vi3) objM22097O5, null, tj3Var2, 6, 32);
                                tj3Var2.m22139q(false);
                            }
                        }
                        tj3Var2.m22139q(z18);
                    } else {
                        c0269z4 = c0269z3;
                        tj3Var2 = tj3Var3;
                        tj3Var2.m22111b0(1069284633);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var = tj3Var2;
                    c0269z2 = c0269z4;
                    z8 = z10;
                    z7 = z9;
                } else {
                    tj3Var3.m22102U();
                    c0269z2 = c0269z;
                    tj3Var = tj3Var3;
                    z7 = z4;
                    z8 = z5;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    final int i16 = 0;
                    x18VarM22143u.f67642d = new zi3() { // from class: ff7
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = i16;
                            xfa xfaVar = xfa.f68157a;
                            int i18 = i2;
                            switch (i17) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iM19383z = pk9.m19383z(i18 | 1);
                                    d32.m10060t(z, i, str, z7, z8, uf7Var, c0269z2, (ye1) obj, iM19383z, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iM19383z2 = pk9.m19383z(i18 | 1);
                                    d32.m10060t(z, i, str, z7, z8, uf7Var, c0269z2, (ye1) obj, iM19383z2, i3);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                }
            }
            i11 |= 24576;
            z5 = z3;
            if (tj3Var3.m22120g(uf7Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i7 = i11 | i6 | 524288;
            if ((i7 & 599187) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (tj3Var3.m22099R(i7 & 1, z6)) {
                tj3Var3.m22104W();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        z4 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    }
                    i8 = i7 & (-3670017);
                    c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var3, 6, 2);
                } else {
                    if (i12 != 0) {
                        z4 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    }
                    i8 = i7 & (-3670017);
                    c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var3, 6, 2);
                }
                z9 = z4;
                i9 = i8;
                z10 = z5;
                tj3Var3.m22140r();
                if (!z) {
                    x18VarM22143u2 = tj3Var3.m22143u();
                    if (x18VarM22143u2 != null) {
                        final int i17 = 1;
                        x18VarM22143u2.f67642d = new zi3() { // from class: ff7
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                int i18 = i17;
                                xfa xfaVar = xfa.f68157a;
                                int i19 = i2;
                                switch (i18) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iM19383z = pk9.m19383z(i19 | 1);
                                        d32.m10060t(z, i, str, z9, z10, uf7Var, c0269zM1154g, (ye1) obj, iM19383z, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iM19383z2 = pk9.m19383z(i19 | 1);
                                        d32.m10060t(z, i, str, z9, z10, uf7Var, c0269zM1154g, (ye1) obj, iM19383z2, i3);
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                c0269z3 = c0269zM1154g;
                str2 = "playlists_sheet_" + i + "_" + z10;
                if ((i9 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i9 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z23 = z11 | z12;
                if ((i9 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z24 = z23 | z13;
                if ((57344 & i9) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z24 | z14;
                objM22097O = tj3Var3.m22097O();
                p84Var = we1.f66679a;
                if (z15) {
                    objM22097O = new vi3() { // from class: hf7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            my1 my1Var = (my1) obj;
                            my1Var.getClass();
                            vf7 vf7Var = new vf7(str, i, z9, z10);
                            ny1 ny1Var = my1Var.f52029a;
                            oy1 oy1Var = ny1Var.f53386b;
                            C1523f c1523f = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 1);
                            C1523f c1523f2 = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 0);
                            ky1 ky1Var = oy1Var.f55228b;
                            C3713w8 c3713w8 = new C3713w8((xd7) ky1Var.f48629N.get(), 0);
                            C3676v8 c3676v8 = new C3676v8((xd7) ky1Var.f48629N.get(), 0);
                            C3713w8 c3713w9 = new C3713w8((xd7) ky1Var.f48629N.get(), 2);
                            C3676v8 c3676v9 = new C3676v8((xd7) ky1Var.f48629N.get(), 1);
                            web webVar = new web((xd7) ky1Var.f48629N.get());
                            C3713w8 c3713w10 = new C3713w8((xd7) ky1Var.f48629N.get(), 3);
                            C3676v8 c3676v10 = new C3676v8((xd7) ky1Var.f48629N.get(), 2);
                            ky1 ky1Var2 = ny1Var.f53385a;
                            return new C1833i(vf7Var, c1523f, c1523f2, c3713w8, c3676v8, c3713w9, c3676v9, webVar, c3713w10, c3676v10, (hm5) ky1Var2.f48736r.get(), (af7) ky1Var2.f48587A2.get(), (cma) ky1Var2.f48596D.get(), (bia) ky1Var2.f48652U1.get(), yn1.m25210a());
                        }
                    };
                    tj3Var3.m22131l0(objM22097O);
                } else {
                    objM22097O = new vi3() { // from class: hf7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            my1 my1Var = (my1) obj;
                            my1Var.getClass();
                            vf7 vf7Var = new vf7(str, i, z9, z10);
                            ny1 ny1Var = my1Var.f52029a;
                            oy1 oy1Var = ny1Var.f53386b;
                            C1523f c1523f = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 1);
                            C1523f c1523f2 = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 0);
                            ky1 ky1Var = oy1Var.f55228b;
                            C3713w8 c3713w8 = new C3713w8((xd7) ky1Var.f48629N.get(), 0);
                            C3676v8 c3676v8 = new C3676v8((xd7) ky1Var.f48629N.get(), 0);
                            C3713w8 c3713w9 = new C3713w8((xd7) ky1Var.f48629N.get(), 2);
                            C3676v8 c3676v9 = new C3676v8((xd7) ky1Var.f48629N.get(), 1);
                            web webVar = new web((xd7) ky1Var.f48629N.get());
                            C3713w8 c3713w10 = new C3713w8((xd7) ky1Var.f48629N.get(), 3);
                            C3676v8 c3676v10 = new C3676v8((xd7) ky1Var.f48629N.get(), 2);
                            ky1 ky1Var2 = ny1Var.f53385a;
                            return new C1833i(vf7Var, c1523f, c1523f2, c3713w8, c3676v8, c3713w9, c3676v9, webVar, c3713w10, c3676v10, (hm5) ky1Var2.f48736r.get(), (af7) ky1Var2.f48587A2.get(), (cma) ky1Var2.f48596D.get(), (bia) ky1Var2.f48652U1.get(), yn1.m25210a());
                        }
                    };
                    tj3Var3.m22131l0(objM22097O);
                }
                vi3Var = (vi3) objM22097O;
                duaVarM21396a = si5.m21396a(tj3Var3);
                if (duaVarM21396a != null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                nt3 nt3VarM21591B2 = AbstractC3584sr.m21591B(duaVarM21396a, tj3Var3);
                if (duaVarM21396a instanceof gr3) {
                    p56VarM10257a = AbstractC2921a.m10257a(((gr3) duaVarM21396a).mo2103e(), vi3Var);
                } else {
                    p56VarM10257a = AbstractC2921a.m10257a(or1.f54780b, vi3Var);
                }
                c1833i = (C1833i) pfa.m19114d(y38.m24933a(C1833i.class), duaVarM21396a, str2, nt3VarM21591B2, p56VarM10257a, tj3Var3);
                final t66 t66VarM2513c2 = AbstractC0711a.m2513c(c1833i.m8511X2(), tj3Var3);
                objM22097O2 = tj3Var3.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = m10013K(tj3Var3);
                    tj3Var3.m22131l0(objM22097O2);
                }
                un1Var = (un1) objM22097O2;
                boolean zM22124i6 = tj3Var3.m22124i(un1Var) | tj3Var3.m22120g(c0269z3);
                i10 = i9 & 458752;
                if (i10 != 131072) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                z17 = zM22124i6 | z16;
                objM22097O3 = tj3Var3.m22097O();
                if (z17) {
                    objM22097O3 = new ui3() { // from class: com.lingq.core.playlists.e
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            wfb.m23926u(un1Var, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$2$1$1(c0269z3, uf7Var, null), 3);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var3.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new ui3() { // from class: com.lingq.core.playlists.e
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            wfb.m23926u(un1Var, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$2$1$1(c0269z3, uf7Var, null), 3);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var3.m22131l0(objM22097O3);
                }
                ng0 ng0Var2 = ng0.f52694a;
                AbstractC0231g.m1150c((ui3) objM22097O3, null, c0269z3, 0.0f, false, null, 0L, 0L, ng0.m17408b(tj3Var3), null, null, null, ci8.m4703P(-1595674105, new aj3() { // from class: if7
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ye1 ye1Var2 = (ye1) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((db1) obj).getClass();
                        tj3 tj3Var4 = (tj3) ye1Var2;
                        if (tj3Var4.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                            final dh9 dh9Var = t66VarM2513c2;
                            yf7 yf7Var2 = (yf7) dh9Var.getValue();
                            final boolean z25 = z10;
                            boolean zM22122h = tj3Var4.m22122h(z25);
                            final C1833i c1833i2 = c1833i;
                            boolean zM22124i7 = zM22122h | tj3Var4.m22124i(c1833i2);
                            final un1 un1Var2 = un1Var;
                            boolean zM22124i8 = zM22124i7 | tj3Var4.m22124i(un1Var2);
                            final C0269z c0269z5 = c0269z3;
                            boolean zM22120g = zM22124i8 | tj3Var4.m22120g(c0269z5);
                            final uf7 uf7Var2 = uf7Var;
                            boolean zM22124i9 = tj3Var4.m22124i(uf7Var2) | zM22120g;
                            Object objM22097O8 = tj3Var4.m22097O();
                            p84 p84Var2 = we1.f66679a;
                            if (zM22124i9 || objM22097O8 == p84Var2) {
                                vi3 vi3Var2 = new vi3() { // from class: com.lingq.core.playlists.b
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj4) {
                                        C1833i c1833i3 = c1833i2;
                                        nn1 nn1Var = c1833i3.f22316n;
                                        Playlist playlist = (Playlist) obj4;
                                        playlist.getClass();
                                        if (z25) {
                                            wfb.m23926u(lda.m16103C(c1833i3), nn1Var, null, new PlaylistsSheetViewModel$removeFromPlaylist$1(c1833i3, playlist, null), 2);
                                        } else {
                                            wfb.m23926u(lda.m16103C(c1833i3), nn1Var, null, new PlaylistsSheetViewModel$addToPlaylist$1(c1833i3, playlist, null), 2);
                                        }
                                        wfb.m23926u(un1Var2, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$1$1$1(c0269z5, uf7Var2, null), 3);
                                        return xfa.f68157a;
                                    }
                                };
                                tj3Var4.m22131l0(vi3Var2);
                                objM22097O8 = vi3Var2;
                            }
                            vi3 vi3Var3 = (vi3) objM22097O8;
                            boolean zM22124i10 = tj3Var4.m22124i(c1833i2);
                            Object objM22097O9 = tj3Var4.m22097O();
                            if (zM22124i10 || objM22097O9 == p84Var2) {
                                objM22097O9 = new fy4(c1833i2, 29);
                                tj3Var4.m22131l0(objM22097O9);
                            }
                            vi3 vi3Var4 = (vi3) objM22097O9;
                            boolean zM22124i11 = tj3Var4.m22124i(c1833i2);
                            Object objM22097O10 = tj3Var4.m22097O();
                            if (zM22124i11 || objM22097O10 == p84Var2) {
                                objM22097O10 = new C1830f(c1833i2, 4);
                                tj3Var4.m22131l0(objM22097O10);
                            }
                            vi3 vi3Var5 = (vi3) objM22097O10;
                            boolean zM22120g2 = tj3Var4.m22120g(dh9Var) | tj3Var4.m22124i(c1833i2) | tj3Var4.m22124i(un1Var2) | tj3Var4.m22120g(c0269z5) | tj3Var4.m22124i(uf7Var2);
                            Object objM22097O11 = tj3Var4.m22097O();
                            if (zM22120g2 || objM22097O11 == p84Var2) {
                                ui3 ui3Var3 = new ui3() { // from class: com.lingq.core.playlists.c
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        yf7 yf7Var3 = (yf7) dh9Var.getValue();
                                        if ((yf7Var3 instanceof xf7) && ((xf7) yf7Var3).f68153b) {
                                            C3244l c3244l = c1833i2.f22317o;
                                            kd7 kd7Var = new kd7(null);
                                            c3244l.getClass();
                                            c3244l.m15572j(null, kd7Var);
                                        } else {
                                            wfb.m23926u(un1Var2, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1(c0269z5, uf7Var2, null), 3);
                                        }
                                        return xfa.f68157a;
                                    }
                                };
                                tj3Var4.m22131l0(ui3Var3);
                                objM22097O11 = ui3Var3;
                            }
                            d32.m10059s(yf7Var2, z25, vi3Var3, vi3Var4, vi3Var5, (ui3) objM22097O11, tj3Var4, 0);
                        } else {
                            tj3Var4.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var3), tj3Var3, 0, 3072, 7674);
                yf7Var = (yf7) t66VarM2513c2.getValue();
                if (yf7Var instanceof xf7) {
                    tj3Var3.m22111b0(1068121637);
                    nd7VarM24485a = ((xf7) yf7Var).m24485a();
                    if (nd7VarM24485a instanceof md7) {
                        tj3Var3.m22111b0(1068179142);
                        z18 = false;
                        tj3Var3.m22139q(false);
                        c0269z4 = c0269z3;
                        tj3Var2 = tj3Var3;
                    } else {
                        z18 = false;
                        z18 = false;
                        if (nd7VarM24485a instanceof kd7) {
                            tj3Var3.m22111b0(1068260114);
                            String strM15137a2 = ((kd7) nd7VarM24485a).m15137a();
                            zM22124i3 = tj3Var3.m22124i(c1833i);
                            objM22097O6 = tj3Var3.m22097O();
                            if (zM22124i3) {
                                final int i18 = z18 ? 1 : 0;
                                objM22097O6 = new ui3() { // from class: jf7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i19 = i18;
                                        xfa xfaVar = xfa.f68157a;
                                        C1833i c1833i2 = c1833i;
                                        switch (i19) {
                                            case 0:
                                                c1833i2.m8510W2();
                                                break;
                                            default:
                                                c1833i2.m8510W2();
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O6);
                            } else {
                                final int i19 = z18 ? 1 : 0;
                                objM22097O6 = new ui3() { // from class: jf7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i110 = i19;
                                        xfa xfaVar = xfa.f68157a;
                                        C1833i c1833i2 = c1833i;
                                        switch (i110) {
                                            case 0:
                                                c1833i2.m8510W2();
                                                break;
                                            default:
                                                c1833i2.m8510W2();
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O6);
                            }
                            ui3 ui3Var3 = (ui3) objM22097O6;
                            boolean zM22124i7 = tj3Var3.m22124i(c1833i) | tj3Var3.m22124i(un1Var) | tj3Var3.m22120g(c0269z3);
                            if (i10 != 131072) {
                                z19 = false;
                            } else {
                                z19 = true;
                            }
                            z20 = zM22124i7 | z19;
                            objM22097O7 = tj3Var3.m22097O();
                            if (z20) {
                                C3615tl c3615tl2 = new C3615tl(c1833i, un1Var, c0269z3, uf7Var, 8);
                                c0269z4 = c0269z3;
                                tj3Var3.m22131l0(c3615tl2);
                                objM22097O7 = c3615tl2;
                            } else {
                                C3615tl c3615tl3 = new C3615tl(c1833i, un1Var, c0269z3, uf7Var, 8);
                                c0269z4 = c0269z3;
                                tj3Var3.m22131l0(c3615tl3);
                                objM22097O7 = c3615tl3;
                            }
                            AbstractC1825a.m8506a(strM15137a2, ui3Var3, (vi3) objM22097O7, null, tj3Var3, 6, 16);
                            tj3Var2 = tj3Var3;
                            tj3Var2.m22139q(false);
                        } else {
                            c0269z4 = c0269z3;
                            if (nd7VarM24485a instanceof ld7) {
                                tj3Var2 = tj3Var3;
                                throw ux5.m23001x(tj3Var2, 450097533, false);
                            }
                            tj3Var2.m22111b0(1068846882);
                            ld7Var = (ld7) nd7VarM24485a;
                            String strM16100b2 = ld7Var.m16100b();
                            String strM16099a2 = ld7Var.m16099a();
                            zM22124i = tj3Var2.m22124i(c1833i);
                            objM22097O4 = tj3Var2.m22097O();
                            if (zM22124i) {
                                tj3Var2 = tj3Var3;
                                final int i110 = 1;
                                objM22097O4 = new ui3() { // from class: jf7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i111 = i110;
                                        xfa xfaVar = xfa.f68157a;
                                        C1833i c1833i2 = c1833i;
                                        switch (i111) {
                                            case 0:
                                                c1833i2.m8510W2();
                                                break;
                                            default:
                                                c1833i2.m8510W2();
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var2.m22131l0(objM22097O4);
                            } else {
                                tj3Var2 = tj3Var3;
                                final int i111 = 1;
                                objM22097O4 = new ui3() { // from class: jf7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i112 = i111;
                                        xfa xfaVar = xfa.f68157a;
                                        C1833i c1833i2 = c1833i;
                                        switch (i112) {
                                            case 0:
                                                c1833i2.m8510W2();
                                                break;
                                            default:
                                                c1833i2.m8510W2();
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            ui3 ui3Var4 = (ui3) objM22097O4;
                            zM22124i2 = tj3Var2.m22124i(nd7VarM24485a) | tj3Var2.m22124i(c1833i);
                            objM22097O5 = tj3Var2.m22097O();
                            if (zM22124i2) {
                                objM22097O5 = new ui5(9, c1833i, ld7Var);
                                tj3Var2.m22131l0(objM22097O5);
                            } else {
                                objM22097O5 = new ui5(9, c1833i, ld7Var);
                                tj3Var2.m22131l0(objM22097O5);
                            }
                            AbstractC1825a.m8507b(strM16100b2, strM16099a2, ui3Var4, (vi3) objM22097O5, null, tj3Var2, 6, 32);
                            tj3Var2.m22139q(false);
                        }
                    }
                    tj3Var2.m22139q(z18);
                } else {
                    c0269z4 = c0269z3;
                    tj3Var2 = tj3Var3;
                    tj3Var2.m22111b0(1069284633);
                    tj3Var2.m22139q(false);
                }
                tj3Var = tj3Var2;
                c0269z2 = c0269z4;
                z8 = z10;
                z7 = z9;
            } else {
                tj3Var3.m22102U();
                c0269z2 = c0269z;
                tj3Var = tj3Var3;
                z7 = z4;
                z8 = z5;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                final int i112 = 0;
                x18VarM22143u.f67642d = new zi3() { // from class: ff7
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i113 = i112;
                        xfa xfaVar = xfa.f68157a;
                        int i114 = i2;
                        switch (i113) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i114 | 1);
                                d32.m10060t(z, i, str, z7, z8, uf7Var, c0269z2, (ye1) obj, iM19383z, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(i114 | 1);
                                d32.m10060t(z, i, str, z7, z8, uf7Var, c0269z2, (ye1) obj, iM19383z2, i3);
                                break;
                        }
                        return xfaVar;
                    }
                };
            }
        }
        i11 |= 3072;
        z4 = z2;
        i4 = i3 & 16;
        if (i4 != 0) {
            if ((i2 & 24576) == 0) {
                z5 = z3;
                if (tj3Var3.m22122h(z5)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i11 |= i5;
            }
            if (tj3Var3.m22120g(uf7Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i7 = i11 | i6 | 524288;
            if ((i7 & 599187) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (tj3Var3.m22099R(i7 & 1, z6)) {
                tj3Var3.m22104W();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        z4 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    }
                    i8 = i7 & (-3670017);
                    c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var3, 6, 2);
                } else {
                    if (i12 != 0) {
                        z4 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    }
                    i8 = i7 & (-3670017);
                    c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var3, 6, 2);
                }
                z9 = z4;
                i9 = i8;
                z10 = z5;
                tj3Var3.m22140r();
                if (!z) {
                    x18VarM22143u2 = tj3Var3.m22143u();
                    if (x18VarM22143u2 != null) {
                        final int i113 = 1;
                        x18VarM22143u2.f67642d = new zi3() { // from class: ff7
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                int i114 = i113;
                                xfa xfaVar = xfa.f68157a;
                                int i115 = i2;
                                switch (i114) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iM19383z = pk9.m19383z(i115 | 1);
                                        d32.m10060t(z, i, str, z9, z10, uf7Var, c0269zM1154g, (ye1) obj, iM19383z, i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iM19383z2 = pk9.m19383z(i115 | 1);
                                        d32.m10060t(z, i, str, z9, z10, uf7Var, c0269zM1154g, (ye1) obj, iM19383z2, i3);
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                c0269z3 = c0269zM1154g;
                str2 = "playlists_sheet_" + i + "_" + z10;
                if ((i9 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i9 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z25 = z11 | z12;
                if ((i9 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z26 = z25 | z13;
                if ((57344 & i9) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z26 | z14;
                objM22097O = tj3Var3.m22097O();
                p84Var = we1.f66679a;
                if (z15) {
                    objM22097O = new vi3() { // from class: hf7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            my1 my1Var = (my1) obj;
                            my1Var.getClass();
                            vf7 vf7Var = new vf7(str, i, z9, z10);
                            ny1 ny1Var = my1Var.f52029a;
                            oy1 oy1Var = ny1Var.f53386b;
                            C1523f c1523f = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 1);
                            C1523f c1523f2 = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 0);
                            ky1 ky1Var = oy1Var.f55228b;
                            C3713w8 c3713w8 = new C3713w8((xd7) ky1Var.f48629N.get(), 0);
                            C3676v8 c3676v8 = new C3676v8((xd7) ky1Var.f48629N.get(), 0);
                            C3713w8 c3713w9 = new C3713w8((xd7) ky1Var.f48629N.get(), 2);
                            C3676v8 c3676v9 = new C3676v8((xd7) ky1Var.f48629N.get(), 1);
                            web webVar = new web((xd7) ky1Var.f48629N.get());
                            C3713w8 c3713w10 = new C3713w8((xd7) ky1Var.f48629N.get(), 3);
                            C3676v8 c3676v10 = new C3676v8((xd7) ky1Var.f48629N.get(), 2);
                            ky1 ky1Var2 = ny1Var.f53385a;
                            return new C1833i(vf7Var, c1523f, c1523f2, c3713w8, c3676v8, c3713w9, c3676v9, webVar, c3713w10, c3676v10, (hm5) ky1Var2.f48736r.get(), (af7) ky1Var2.f48587A2.get(), (cma) ky1Var2.f48596D.get(), (bia) ky1Var2.f48652U1.get(), yn1.m25210a());
                        }
                    };
                    tj3Var3.m22131l0(objM22097O);
                } else {
                    objM22097O = new vi3() { // from class: hf7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            my1 my1Var = (my1) obj;
                            my1Var.getClass();
                            vf7 vf7Var = new vf7(str, i, z9, z10);
                            ny1 ny1Var = my1Var.f52029a;
                            oy1 oy1Var = ny1Var.f53386b;
                            C1523f c1523f = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 1);
                            C1523f c1523f2 = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 0);
                            ky1 ky1Var = oy1Var.f55228b;
                            C3713w8 c3713w8 = new C3713w8((xd7) ky1Var.f48629N.get(), 0);
                            C3676v8 c3676v8 = new C3676v8((xd7) ky1Var.f48629N.get(), 0);
                            C3713w8 c3713w9 = new C3713w8((xd7) ky1Var.f48629N.get(), 2);
                            C3676v8 c3676v9 = new C3676v8((xd7) ky1Var.f48629N.get(), 1);
                            web webVar = new web((xd7) ky1Var.f48629N.get());
                            C3713w8 c3713w10 = new C3713w8((xd7) ky1Var.f48629N.get(), 3);
                            C3676v8 c3676v10 = new C3676v8((xd7) ky1Var.f48629N.get(), 2);
                            ky1 ky1Var2 = ny1Var.f53385a;
                            return new C1833i(vf7Var, c1523f, c1523f2, c3713w8, c3676v8, c3713w9, c3676v9, webVar, c3713w10, c3676v10, (hm5) ky1Var2.f48736r.get(), (af7) ky1Var2.f48587A2.get(), (cma) ky1Var2.f48596D.get(), (bia) ky1Var2.f48652U1.get(), yn1.m25210a());
                        }
                    };
                    tj3Var3.m22131l0(objM22097O);
                }
                vi3Var = (vi3) objM22097O;
                duaVarM21396a = si5.m21396a(tj3Var3);
                if (duaVarM21396a != null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                nt3 nt3VarM21591B3 = AbstractC3584sr.m21591B(duaVarM21396a, tj3Var3);
                if (duaVarM21396a instanceof gr3) {
                    p56VarM10257a = AbstractC2921a.m10257a(((gr3) duaVarM21396a).mo2103e(), vi3Var);
                } else {
                    p56VarM10257a = AbstractC2921a.m10257a(or1.f54780b, vi3Var);
                }
                c1833i = (C1833i) pfa.m19114d(y38.m24933a(C1833i.class), duaVarM21396a, str2, nt3VarM21591B3, p56VarM10257a, tj3Var3);
                final t66 t66VarM2513c3 = AbstractC0711a.m2513c(c1833i.m8511X2(), tj3Var3);
                objM22097O2 = tj3Var3.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = m10013K(tj3Var3);
                    tj3Var3.m22131l0(objM22097O2);
                }
                un1Var = (un1) objM22097O2;
                boolean zM22124i8 = tj3Var3.m22124i(un1Var) | tj3Var3.m22120g(c0269z3);
                i10 = i9 & 458752;
                if (i10 != 131072) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                z17 = zM22124i8 | z16;
                objM22097O3 = tj3Var3.m22097O();
                if (z17) {
                    objM22097O3 = new ui3() { // from class: com.lingq.core.playlists.e
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            wfb.m23926u(un1Var, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$2$1$1(c0269z3, uf7Var, null), 3);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var3.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new ui3() { // from class: com.lingq.core.playlists.e
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            wfb.m23926u(un1Var, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$2$1$1(c0269z3, uf7Var, null), 3);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var3.m22131l0(objM22097O3);
                }
                ng0 ng0Var3 = ng0.f52694a;
                AbstractC0231g.m1150c((ui3) objM22097O3, null, c0269z3, 0.0f, false, null, 0L, 0L, ng0.m17408b(tj3Var3), null, null, null, ci8.m4703P(-1595674105, new aj3() { // from class: if7
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ye1 ye1Var2 = (ye1) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((db1) obj).getClass();
                        tj3 tj3Var4 = (tj3) ye1Var2;
                        if (tj3Var4.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                            final dh9 dh9Var = t66VarM2513c3;
                            yf7 yf7Var2 = (yf7) dh9Var.getValue();
                            final boolean z27 = z10;
                            boolean zM22122h = tj3Var4.m22122h(z27);
                            final C1833i c1833i2 = c1833i;
                            boolean zM22124i9 = zM22122h | tj3Var4.m22124i(c1833i2);
                            final un1 un1Var2 = un1Var;
                            boolean zM22124i10 = zM22124i9 | tj3Var4.m22124i(un1Var2);
                            final C0269z c0269z5 = c0269z3;
                            boolean zM22120g = zM22124i10 | tj3Var4.m22120g(c0269z5);
                            final uf7 uf7Var2 = uf7Var;
                            boolean zM22124i11 = tj3Var4.m22124i(uf7Var2) | zM22120g;
                            Object objM22097O8 = tj3Var4.m22097O();
                            p84 p84Var2 = we1.f66679a;
                            if (zM22124i11 || objM22097O8 == p84Var2) {
                                vi3 vi3Var2 = new vi3() { // from class: com.lingq.core.playlists.b
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj4) {
                                        C1833i c1833i3 = c1833i2;
                                        nn1 nn1Var = c1833i3.f22316n;
                                        Playlist playlist = (Playlist) obj4;
                                        playlist.getClass();
                                        if (z27) {
                                            wfb.m23926u(lda.m16103C(c1833i3), nn1Var, null, new PlaylistsSheetViewModel$removeFromPlaylist$1(c1833i3, playlist, null), 2);
                                        } else {
                                            wfb.m23926u(lda.m16103C(c1833i3), nn1Var, null, new PlaylistsSheetViewModel$addToPlaylist$1(c1833i3, playlist, null), 2);
                                        }
                                        wfb.m23926u(un1Var2, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$1$1$1(c0269z5, uf7Var2, null), 3);
                                        return xfa.f68157a;
                                    }
                                };
                                tj3Var4.m22131l0(vi3Var2);
                                objM22097O8 = vi3Var2;
                            }
                            vi3 vi3Var3 = (vi3) objM22097O8;
                            boolean zM22124i12 = tj3Var4.m22124i(c1833i2);
                            Object objM22097O9 = tj3Var4.m22097O();
                            if (zM22124i12 || objM22097O9 == p84Var2) {
                                objM22097O9 = new fy4(c1833i2, 29);
                                tj3Var4.m22131l0(objM22097O9);
                            }
                            vi3 vi3Var4 = (vi3) objM22097O9;
                            boolean zM22124i13 = tj3Var4.m22124i(c1833i2);
                            Object objM22097O10 = tj3Var4.m22097O();
                            if (zM22124i13 || objM22097O10 == p84Var2) {
                                objM22097O10 = new C1830f(c1833i2, 4);
                                tj3Var4.m22131l0(objM22097O10);
                            }
                            vi3 vi3Var5 = (vi3) objM22097O10;
                            boolean zM22120g2 = tj3Var4.m22120g(dh9Var) | tj3Var4.m22124i(c1833i2) | tj3Var4.m22124i(un1Var2) | tj3Var4.m22120g(c0269z5) | tj3Var4.m22124i(uf7Var2);
                            Object objM22097O11 = tj3Var4.m22097O();
                            if (zM22120g2 || objM22097O11 == p84Var2) {
                                ui3 ui3Var5 = new ui3() { // from class: com.lingq.core.playlists.c
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        yf7 yf7Var3 = (yf7) dh9Var.getValue();
                                        if ((yf7Var3 instanceof xf7) && ((xf7) yf7Var3).f68153b) {
                                            C3244l c3244l = c1833i2.f22317o;
                                            kd7 kd7Var = new kd7(null);
                                            c3244l.getClass();
                                            c3244l.m15572j(null, kd7Var);
                                        } else {
                                            wfb.m23926u(un1Var2, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1(c0269z5, uf7Var2, null), 3);
                                        }
                                        return xfa.f68157a;
                                    }
                                };
                                tj3Var4.m22131l0(ui3Var5);
                                objM22097O11 = ui3Var5;
                            }
                            d32.m10059s(yf7Var2, z27, vi3Var3, vi3Var4, vi3Var5, (ui3) objM22097O11, tj3Var4, 0);
                        } else {
                            tj3Var4.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var3), tj3Var3, 0, 3072, 7674);
                yf7Var = (yf7) t66VarM2513c3.getValue();
                if (yf7Var instanceof xf7) {
                    tj3Var3.m22111b0(1068121637);
                    nd7VarM24485a = ((xf7) yf7Var).m24485a();
                    if (nd7VarM24485a instanceof md7) {
                        tj3Var3.m22111b0(1068179142);
                        z18 = false;
                        tj3Var3.m22139q(false);
                        c0269z4 = c0269z3;
                        tj3Var2 = tj3Var3;
                    } else {
                        z18 = false;
                        z18 = false;
                        if (nd7VarM24485a instanceof kd7) {
                            tj3Var3.m22111b0(1068260114);
                            String strM15137a3 = ((kd7) nd7VarM24485a).m15137a();
                            zM22124i3 = tj3Var3.m22124i(c1833i);
                            objM22097O6 = tj3Var3.m22097O();
                            if (zM22124i3) {
                                final int i114 = z18 ? 1 : 0;
                                objM22097O6 = new ui3() { // from class: jf7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i115 = i114;
                                        xfa xfaVar = xfa.f68157a;
                                        C1833i c1833i2 = c1833i;
                                        switch (i115) {
                                            case 0:
                                                c1833i2.m8510W2();
                                                break;
                                            default:
                                                c1833i2.m8510W2();
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O6);
                            } else {
                                final int i115 = z18 ? 1 : 0;
                                objM22097O6 = new ui3() { // from class: jf7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i116 = i115;
                                        xfa xfaVar = xfa.f68157a;
                                        C1833i c1833i2 = c1833i;
                                        switch (i116) {
                                            case 0:
                                                c1833i2.m8510W2();
                                                break;
                                            default:
                                                c1833i2.m8510W2();
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O6);
                            }
                            ui3 ui3Var5 = (ui3) objM22097O6;
                            boolean zM22124i9 = tj3Var3.m22124i(c1833i) | tj3Var3.m22124i(un1Var) | tj3Var3.m22120g(c0269z3);
                            if (i10 != 131072) {
                                z19 = false;
                            } else {
                                z19 = true;
                            }
                            z20 = zM22124i9 | z19;
                            objM22097O7 = tj3Var3.m22097O();
                            if (z20) {
                                C3615tl c3615tl4 = new C3615tl(c1833i, un1Var, c0269z3, uf7Var, 8);
                                c0269z4 = c0269z3;
                                tj3Var3.m22131l0(c3615tl4);
                                objM22097O7 = c3615tl4;
                            } else {
                                C3615tl c3615tl5 = new C3615tl(c1833i, un1Var, c0269z3, uf7Var, 8);
                                c0269z4 = c0269z3;
                                tj3Var3.m22131l0(c3615tl5);
                                objM22097O7 = c3615tl5;
                            }
                            AbstractC1825a.m8506a(strM15137a3, ui3Var5, (vi3) objM22097O7, null, tj3Var3, 6, 16);
                            tj3Var2 = tj3Var3;
                            tj3Var2.m22139q(false);
                        } else {
                            c0269z4 = c0269z3;
                            if (nd7VarM24485a instanceof ld7) {
                                tj3Var2 = tj3Var3;
                                throw ux5.m23001x(tj3Var2, 450097533, false);
                            }
                            tj3Var2.m22111b0(1068846882);
                            ld7Var = (ld7) nd7VarM24485a;
                            String strM16100b3 = ld7Var.m16100b();
                            String strM16099a3 = ld7Var.m16099a();
                            zM22124i = tj3Var2.m22124i(c1833i);
                            objM22097O4 = tj3Var2.m22097O();
                            if (zM22124i) {
                                tj3Var2 = tj3Var3;
                                final int i116 = 1;
                                objM22097O4 = new ui3() { // from class: jf7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i117 = i116;
                                        xfa xfaVar = xfa.f68157a;
                                        C1833i c1833i2 = c1833i;
                                        switch (i117) {
                                            case 0:
                                                c1833i2.m8510W2();
                                                break;
                                            default:
                                                c1833i2.m8510W2();
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var2.m22131l0(objM22097O4);
                            } else {
                                tj3Var2 = tj3Var3;
                                final int i117 = 1;
                                objM22097O4 = new ui3() { // from class: jf7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i118 = i117;
                                        xfa xfaVar = xfa.f68157a;
                                        C1833i c1833i2 = c1833i;
                                        switch (i118) {
                                            case 0:
                                                c1833i2.m8510W2();
                                                break;
                                            default:
                                                c1833i2.m8510W2();
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            ui3 ui3Var6 = (ui3) objM22097O4;
                            zM22124i2 = tj3Var2.m22124i(nd7VarM24485a) | tj3Var2.m22124i(c1833i);
                            objM22097O5 = tj3Var2.m22097O();
                            if (zM22124i2) {
                                objM22097O5 = new ui5(9, c1833i, ld7Var);
                                tj3Var2.m22131l0(objM22097O5);
                            } else {
                                objM22097O5 = new ui5(9, c1833i, ld7Var);
                                tj3Var2.m22131l0(objM22097O5);
                            }
                            AbstractC1825a.m8507b(strM16100b3, strM16099a3, ui3Var6, (vi3) objM22097O5, null, tj3Var2, 6, 32);
                            tj3Var2.m22139q(false);
                        }
                    }
                    tj3Var2.m22139q(z18);
                } else {
                    c0269z4 = c0269z3;
                    tj3Var2 = tj3Var3;
                    tj3Var2.m22111b0(1069284633);
                    tj3Var2.m22139q(false);
                }
                tj3Var = tj3Var2;
                c0269z2 = c0269z4;
                z8 = z10;
                z7 = z9;
            } else {
                tj3Var3.m22102U();
                c0269z2 = c0269z;
                tj3Var = tj3Var3;
                z7 = z4;
                z8 = z5;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                final int i118 = 0;
                x18VarM22143u.f67642d = new zi3() { // from class: ff7
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i119 = i118;
                        xfa xfaVar = xfa.f68157a;
                        int i1110 = i2;
                        switch (i119) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i1110 | 1);
                                d32.m10060t(z, i, str, z7, z8, uf7Var, c0269z2, (ye1) obj, iM19383z, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(i1110 | 1);
                                d32.m10060t(z, i, str, z7, z8, uf7Var, c0269z2, (ye1) obj, iM19383z2, i3);
                                break;
                        }
                        return xfaVar;
                    }
                };
            }
        }
        i11 |= 24576;
        z5 = z3;
        if (tj3Var3.m22120g(uf7Var)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        i7 = i11 | i6 | 524288;
        if ((i7 & 599187) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (tj3Var3.m22099R(i7 & 1, z6)) {
            tj3Var3.m22104W();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    z4 = false;
                }
                if (i4 != 0) {
                    z5 = false;
                }
                i8 = i7 & (-3670017);
                c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var3, 6, 2);
            } else {
                if (i12 != 0) {
                    z4 = false;
                }
                if (i4 != 0) {
                    z5 = false;
                }
                i8 = i7 & (-3670017);
                c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var3, 6, 2);
            }
            z9 = z4;
            i9 = i8;
            z10 = z5;
            tj3Var3.m22140r();
            if (!z) {
                x18VarM22143u2 = tj3Var3.m22143u();
                if (x18VarM22143u2 != null) {
                    final int i119 = 1;
                    x18VarM22143u2.f67642d = new zi3() { // from class: ff7
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i1110 = i119;
                            xfa xfaVar = xfa.f68157a;
                            int i1111 = i2;
                            switch (i1110) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iM19383z = pk9.m19383z(i1111 | 1);
                                    d32.m10060t(z, i, str, z9, z10, uf7Var, c0269zM1154g, (ye1) obj, iM19383z, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iM19383z2 = pk9.m19383z(i1111 | 1);
                                    d32.m10060t(z, i, str, z9, z10, uf7Var, c0269zM1154g, (ye1) obj, iM19383z2, i3);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    return;
                }
                return;
            }
            c0269z3 = c0269zM1154g;
            str2 = "playlists_sheet_" + i + "_" + z10;
            if ((i9 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i9 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z27 = z11 | z12;
            if ((i9 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z28 = z27 | z13;
            if ((57344 & i9) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z28 | z14;
            objM22097O = tj3Var3.m22097O();
            p84Var = we1.f66679a;
            if (z15) {
                objM22097O = new vi3() { // from class: hf7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        my1 my1Var = (my1) obj;
                        my1Var.getClass();
                        vf7 vf7Var = new vf7(str, i, z9, z10);
                        ny1 ny1Var = my1Var.f52029a;
                        oy1 oy1Var = ny1Var.f53386b;
                        C1523f c1523f = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 1);
                        C1523f c1523f2 = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 0);
                        ky1 ky1Var = oy1Var.f55228b;
                        C3713w8 c3713w8 = new C3713w8((xd7) ky1Var.f48629N.get(), 0);
                        C3676v8 c3676v8 = new C3676v8((xd7) ky1Var.f48629N.get(), 0);
                        C3713w8 c3713w9 = new C3713w8((xd7) ky1Var.f48629N.get(), 2);
                        C3676v8 c3676v9 = new C3676v8((xd7) ky1Var.f48629N.get(), 1);
                        web webVar = new web((xd7) ky1Var.f48629N.get());
                        C3713w8 c3713w10 = new C3713w8((xd7) ky1Var.f48629N.get(), 3);
                        C3676v8 c3676v10 = new C3676v8((xd7) ky1Var.f48629N.get(), 2);
                        ky1 ky1Var2 = ny1Var.f53385a;
                        return new C1833i(vf7Var, c1523f, c1523f2, c3713w8, c3676v8, c3713w9, c3676v9, webVar, c3713w10, c3676v10, (hm5) ky1Var2.f48736r.get(), (af7) ky1Var2.f48587A2.get(), (cma) ky1Var2.f48596D.get(), (bia) ky1Var2.f48652U1.get(), yn1.m25210a());
                    }
                };
                tj3Var3.m22131l0(objM22097O);
            } else {
                objM22097O = new vi3() { // from class: hf7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        my1 my1Var = (my1) obj;
                        my1Var.getClass();
                        vf7 vf7Var = new vf7(str, i, z9, z10);
                        ny1 ny1Var = my1Var.f52029a;
                        oy1 oy1Var = ny1Var.f53386b;
                        C1523f c1523f = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 1);
                        C1523f c1523f2 = new C1523f((xd7) oy1Var.f55228b.f48629N.get(), 0);
                        ky1 ky1Var = oy1Var.f55228b;
                        C3713w8 c3713w8 = new C3713w8((xd7) ky1Var.f48629N.get(), 0);
                        C3676v8 c3676v8 = new C3676v8((xd7) ky1Var.f48629N.get(), 0);
                        C3713w8 c3713w9 = new C3713w8((xd7) ky1Var.f48629N.get(), 2);
                        C3676v8 c3676v9 = new C3676v8((xd7) ky1Var.f48629N.get(), 1);
                        web webVar = new web((xd7) ky1Var.f48629N.get());
                        C3713w8 c3713w10 = new C3713w8((xd7) ky1Var.f48629N.get(), 3);
                        C3676v8 c3676v10 = new C3676v8((xd7) ky1Var.f48629N.get(), 2);
                        ky1 ky1Var2 = ny1Var.f53385a;
                        return new C1833i(vf7Var, c1523f, c1523f2, c3713w8, c3676v8, c3713w9, c3676v9, webVar, c3713w10, c3676v10, (hm5) ky1Var2.f48736r.get(), (af7) ky1Var2.f48587A2.get(), (cma) ky1Var2.f48596D.get(), (bia) ky1Var2.f48652U1.get(), yn1.m25210a());
                    }
                };
                tj3Var3.m22131l0(objM22097O);
            }
            vi3Var = (vi3) objM22097O;
            duaVarM21396a = si5.m21396a(tj3Var3);
            if (duaVarM21396a != null) {
                C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            nt3 nt3VarM21591B4 = AbstractC3584sr.m21591B(duaVarM21396a, tj3Var3);
            if (duaVarM21396a instanceof gr3) {
                p56VarM10257a = AbstractC2921a.m10257a(((gr3) duaVarM21396a).mo2103e(), vi3Var);
            } else {
                p56VarM10257a = AbstractC2921a.m10257a(or1.f54780b, vi3Var);
            }
            c1833i = (C1833i) pfa.m19114d(y38.m24933a(C1833i.class), duaVarM21396a, str2, nt3VarM21591B4, p56VarM10257a, tj3Var3);
            final t66 t66VarM2513c4 = AbstractC0711a.m2513c(c1833i.m8511X2(), tj3Var3);
            objM22097O2 = tj3Var3.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = m10013K(tj3Var3);
                tj3Var3.m22131l0(objM22097O2);
            }
            un1Var = (un1) objM22097O2;
            boolean zM22124i10 = tj3Var3.m22124i(un1Var) | tj3Var3.m22120g(c0269z3);
            i10 = i9 & 458752;
            if (i10 != 131072) {
                z16 = false;
            } else {
                z16 = true;
            }
            z17 = zM22124i10 | z16;
            objM22097O3 = tj3Var3.m22097O();
            if (z17) {
                objM22097O3 = new ui3() { // from class: com.lingq.core.playlists.e
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        wfb.m23926u(un1Var, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$2$1$1(c0269z3, uf7Var, null), 3);
                        return xfa.f68157a;
                    }
                };
                tj3Var3.m22131l0(objM22097O3);
            } else {
                objM22097O3 = new ui3() { // from class: com.lingq.core.playlists.e
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        wfb.m23926u(un1Var, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$2$1$1(c0269z3, uf7Var, null), 3);
                        return xfa.f68157a;
                    }
                };
                tj3Var3.m22131l0(objM22097O3);
            }
            ng0 ng0Var4 = ng0.f52694a;
            AbstractC0231g.m1150c((ui3) objM22097O3, null, c0269z3, 0.0f, false, null, 0L, 0L, ng0.m17408b(tj3Var3), null, null, null, ci8.m4703P(-1595674105, new aj3() { // from class: if7
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var4 = (tj3) ye1Var2;
                    if (tj3Var4.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final dh9 dh9Var = t66VarM2513c4;
                        yf7 yf7Var2 = (yf7) dh9Var.getValue();
                        final boolean z29 = z10;
                        boolean zM22122h = tj3Var4.m22122h(z29);
                        final C1833i c1833i2 = c1833i;
                        boolean zM22124i11 = zM22122h | tj3Var4.m22124i(c1833i2);
                        final un1 un1Var2 = un1Var;
                        boolean zM22124i12 = zM22124i11 | tj3Var4.m22124i(un1Var2);
                        final C0269z c0269z5 = c0269z3;
                        boolean zM22120g = zM22124i12 | tj3Var4.m22120g(c0269z5);
                        final uf7 uf7Var2 = uf7Var;
                        boolean zM22124i13 = tj3Var4.m22124i(uf7Var2) | zM22120g;
                        Object objM22097O8 = tj3Var4.m22097O();
                        p84 p84Var2 = we1.f66679a;
                        if (zM22124i13 || objM22097O8 == p84Var2) {
                            vi3 vi3Var2 = new vi3() { // from class: com.lingq.core.playlists.b
                                @Override // p000.vi3
                                public final Object invoke(Object obj4) {
                                    C1833i c1833i3 = c1833i2;
                                    nn1 nn1Var = c1833i3.f22316n;
                                    Playlist playlist = (Playlist) obj4;
                                    playlist.getClass();
                                    if (z29) {
                                        wfb.m23926u(lda.m16103C(c1833i3), nn1Var, null, new PlaylistsSheetViewModel$removeFromPlaylist$1(c1833i3, playlist, null), 2);
                                    } else {
                                        wfb.m23926u(lda.m16103C(c1833i3), nn1Var, null, new PlaylistsSheetViewModel$addToPlaylist$1(c1833i3, playlist, null), 2);
                                    }
                                    wfb.m23926u(un1Var2, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$1$1$1(c0269z5, uf7Var2, null), 3);
                                    return xfa.f68157a;
                                }
                            };
                            tj3Var4.m22131l0(vi3Var2);
                            objM22097O8 = vi3Var2;
                        }
                        vi3 vi3Var3 = (vi3) objM22097O8;
                        boolean zM22124i14 = tj3Var4.m22124i(c1833i2);
                        Object objM22097O9 = tj3Var4.m22097O();
                        if (zM22124i14 || objM22097O9 == p84Var2) {
                            objM22097O9 = new fy4(c1833i2, 29);
                            tj3Var4.m22131l0(objM22097O9);
                        }
                        vi3 vi3Var4 = (vi3) objM22097O9;
                        boolean zM22124i15 = tj3Var4.m22124i(c1833i2);
                        Object objM22097O10 = tj3Var4.m22097O();
                        if (zM22124i15 || objM22097O10 == p84Var2) {
                            objM22097O10 = new C1830f(c1833i2, 4);
                            tj3Var4.m22131l0(objM22097O10);
                        }
                        vi3 vi3Var5 = (vi3) objM22097O10;
                        boolean zM22120g2 = tj3Var4.m22120g(dh9Var) | tj3Var4.m22124i(c1833i2) | tj3Var4.m22124i(un1Var2) | tj3Var4.m22120g(c0269z5) | tj3Var4.m22124i(uf7Var2);
                        Object objM22097O11 = tj3Var4.m22097O();
                        if (zM22120g2 || objM22097O11 == p84Var2) {
                            ui3 ui3Var7 = new ui3() { // from class: com.lingq.core.playlists.c
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    yf7 yf7Var3 = (yf7) dh9Var.getValue();
                                    if ((yf7Var3 instanceof xf7) && ((xf7) yf7Var3).f68153b) {
                                        C3244l c3244l = c1833i2.f22317o;
                                        kd7 kd7Var = new kd7(null);
                                        c3244l.getClass();
                                        c3244l.m15572j(null, kd7Var);
                                    } else {
                                        wfb.m23926u(un1Var2, null, null, new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1(c0269z5, uf7Var2, null), 3);
                                    }
                                    return xfa.f68157a;
                                }
                            };
                            tj3Var4.m22131l0(ui3Var7);
                            objM22097O11 = ui3Var7;
                        }
                        d32.m10059s(yf7Var2, z29, vi3Var3, vi3Var4, vi3Var5, (ui3) objM22097O11, tj3Var4, 0);
                    } else {
                        tj3Var4.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var3), tj3Var3, 0, 3072, 7674);
            yf7Var = (yf7) t66VarM2513c4.getValue();
            if (yf7Var instanceof xf7) {
                tj3Var3.m22111b0(1068121637);
                nd7VarM24485a = ((xf7) yf7Var).m24485a();
                if (nd7VarM24485a instanceof md7) {
                    tj3Var3.m22111b0(1068179142);
                    z18 = false;
                    tj3Var3.m22139q(false);
                    c0269z4 = c0269z3;
                    tj3Var2 = tj3Var3;
                } else {
                    z18 = false;
                    z18 = false;
                    if (nd7VarM24485a instanceof kd7) {
                        tj3Var3.m22111b0(1068260114);
                        String strM15137a4 = ((kd7) nd7VarM24485a).m15137a();
                        zM22124i3 = tj3Var3.m22124i(c1833i);
                        objM22097O6 = tj3Var3.m22097O();
                        if (zM22124i3) {
                            final int i1110 = z18 ? 1 : 0;
                            objM22097O6 = new ui3() { // from class: jf7
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i1111 = i1110;
                                    xfa xfaVar = xfa.f68157a;
                                    C1833i c1833i2 = c1833i;
                                    switch (i1111) {
                                        case 0:
                                            c1833i2.m8510W2();
                                            break;
                                        default:
                                            c1833i2.m8510W2();
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var3.m22131l0(objM22097O6);
                        } else {
                            final int i1111 = z18 ? 1 : 0;
                            objM22097O6 = new ui3() { // from class: jf7
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i1112 = i1111;
                                    xfa xfaVar = xfa.f68157a;
                                    C1833i c1833i2 = c1833i;
                                    switch (i1112) {
                                        case 0:
                                            c1833i2.m8510W2();
                                            break;
                                        default:
                                            c1833i2.m8510W2();
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var3.m22131l0(objM22097O6);
                        }
                        ui3 ui3Var7 = (ui3) objM22097O6;
                        boolean zM22124i11 = tj3Var3.m22124i(c1833i) | tj3Var3.m22124i(un1Var) | tj3Var3.m22120g(c0269z3);
                        if (i10 != 131072) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        z20 = zM22124i11 | z19;
                        objM22097O7 = tj3Var3.m22097O();
                        if (z20) {
                            C3615tl c3615tl6 = new C3615tl(c1833i, un1Var, c0269z3, uf7Var, 8);
                            c0269z4 = c0269z3;
                            tj3Var3.m22131l0(c3615tl6);
                            objM22097O7 = c3615tl6;
                        } else {
                            C3615tl c3615tl7 = new C3615tl(c1833i, un1Var, c0269z3, uf7Var, 8);
                            c0269z4 = c0269z3;
                            tj3Var3.m22131l0(c3615tl7);
                            objM22097O7 = c3615tl7;
                        }
                        AbstractC1825a.m8506a(strM15137a4, ui3Var7, (vi3) objM22097O7, null, tj3Var3, 6, 16);
                        tj3Var2 = tj3Var3;
                        tj3Var2.m22139q(false);
                    } else {
                        c0269z4 = c0269z3;
                        if (nd7VarM24485a instanceof ld7) {
                            tj3Var2 = tj3Var3;
                            throw ux5.m23001x(tj3Var2, 450097533, false);
                        }
                        tj3Var2.m22111b0(1068846882);
                        ld7Var = (ld7) nd7VarM24485a;
                        String strM16100b4 = ld7Var.m16100b();
                        String strM16099a4 = ld7Var.m16099a();
                        zM22124i = tj3Var2.m22124i(c1833i);
                        objM22097O4 = tj3Var2.m22097O();
                        if (zM22124i) {
                            tj3Var2 = tj3Var3;
                            final int i1112 = 1;
                            objM22097O4 = new ui3() { // from class: jf7
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i1113 = i1112;
                                    xfa xfaVar = xfa.f68157a;
                                    C1833i c1833i2 = c1833i;
                                    switch (i1113) {
                                        case 0:
                                            c1833i2.m8510W2();
                                            break;
                                        default:
                                            c1833i2.m8510W2();
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var2.m22131l0(objM22097O4);
                        } else {
                            tj3Var2 = tj3Var3;
                            final int i1113 = 1;
                            objM22097O4 = new ui3() { // from class: jf7
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i1114 = i1113;
                                    xfa xfaVar = xfa.f68157a;
                                    C1833i c1833i2 = c1833i;
                                    switch (i1114) {
                                        case 0:
                                            c1833i2.m8510W2();
                                            break;
                                        default:
                                            c1833i2.m8510W2();
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        ui3 ui3Var8 = (ui3) objM22097O4;
                        zM22124i2 = tj3Var2.m22124i(nd7VarM24485a) | tj3Var2.m22124i(c1833i);
                        objM22097O5 = tj3Var2.m22097O();
                        if (zM22124i2) {
                            objM22097O5 = new ui5(9, c1833i, ld7Var);
                            tj3Var2.m22131l0(objM22097O5);
                        } else {
                            objM22097O5 = new ui5(9, c1833i, ld7Var);
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        AbstractC1825a.m8507b(strM16100b4, strM16099a4, ui3Var8, (vi3) objM22097O5, null, tj3Var2, 6, 32);
                        tj3Var2.m22139q(false);
                    }
                }
                tj3Var2.m22139q(z18);
            } else {
                c0269z4 = c0269z3;
                tj3Var2 = tj3Var3;
                tj3Var2.m22111b0(1069284633);
                tj3Var2.m22139q(false);
            }
            tj3Var = tj3Var2;
            c0269z2 = c0269z4;
            z8 = z10;
            z7 = z9;
        } else {
            tj3Var3.m22102U();
            c0269z2 = c0269z;
            tj3Var = tj3Var3;
            z7 = z4;
            z8 = z5;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i1114 = 0;
            x18VarM22143u.f67642d = new zi3() { // from class: ff7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i1115 = i1114;
                    xfa xfaVar = xfa.f68157a;
                    int i1116 = i2;
                    switch (i1115) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i1116 | 1);
                            d32.m10060t(z, i, str, z7, z8, uf7Var, c0269z2, (ye1) obj, iM19383z, i3);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM19383z2 = pk9.m19383z(i1116 | 1);
                            d32.m10060t(z, i, str, z7, z8, uf7Var, c0269z2, (ye1) obj, iM19383z2, i3);
                            break;
                    }
                    return xfaVar;
                }
            };
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m10061u(e16 e16Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2064964257);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            m10062v(e16Var, c0282a, tj3Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3762xk(e16Var, c0282a, i, i3);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m10062v(e16 e16Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(771959668);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1259i(null, s46.f60289d);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new C3799yk(i3, t66Var);
                tj3Var.m22131l0(objM22097O2);
            }
            pvc.m19507c(lt9.f50119b.mo1265a(m10034d0(0, tj3Var, (ui3) objM22097O2)), ci8.m4703P(-291176396, new C3836zk(e16Var, t66Var, c0282a, i3), tj3Var), tj3Var, 56);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3762xk(e16Var, c0282a, i, i4);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m10063w(final on3 on3Var, final zi3 zi3Var, final v78 v78Var, final float f, C0282a c0282a, ye1 ye1Var, final int i) {
        final C0282a c0282a2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1526323303);
        if (((i | (tj3Var.m22120g(on3Var) ? 4 : 2) | (tj3Var.m22124i(zi3Var) ? 32 : 16) | (tj3Var.m22124i(v78Var) ? 256 : 128) | 3072) & 9363) == 9362 && tj3Var.m22086D()) {
            tj3Var.m22102U();
            c0282a2 = c0282a;
        } else {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                f = 12.0f;
            } else {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            c0282a2 = c0282a;
            AbstractC0686a.m2486b(ci8.m4734s(on3Var).mo16935d(new m70(v78Var)).mo16935d(C3807ys.f70356a).mo16935d(Build.VERSION.SDK_INT >= 31 ? new dn1(new mg2(R.dimen.system_app_widget_background_radius)) : mn3.f51554a), 0, 0, ci8.m4703P(-1375305123, new aj3() { // from class: em8
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    cb1 cb1Var = (cb1) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    ((Integer) obj3).getClass();
                    zi3 zi3Var2 = zi3Var;
                    if (zi3Var2 == null) {
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        tj3Var2.m22111b0(-2021862660);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        tj3Var3.m22111b0(1181704613);
                        zi3Var2.invoke(tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    }
                    on3 on3VarM23929x = wfb.m23929x(mn3.f51554a, f, 2);
                    cb1Var.getClass();
                    AbstractC0686a.m2485a(cb1.m4485a(on3VarM23929x), null, c0282a2, ye1Var2, 0, 2);
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 3072, 6);
        }
        final float f2 = f;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(zi3Var, v78Var, f2, c0282a2, i) { // from class: fm8

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zi3 f39295b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ v78 f39296c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ float f39297d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0282a f39298e;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(24577);
                    d32.m10063w(this.f39294a, this.f39295b, this.f39296c, this.f39297d, this.f39298e, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m10064x(ui3 ui3Var, ye1 ye1Var) {
        kz6 kz6Var = ((tj3) ye1Var).f62378M.f71431b.f62837p;
        kz6Var.m15737V(wy6.f67523c);
        ss5.m21695V(kz6Var, 0, ui3Var);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX INFO: renamed from: y */
    public static final long m10065y(float f, float f2, float f3, float f4, sa1 sa1Var) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (sa1Var.mo1402c()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i18 = aa1.f413l;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i24) + 1) | (i19 << 15);
                    } else {
                        i2 = i24;
                    }
                    short s = (short) i3;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i23 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) sa1Var.f60576c) & 63);
                                    int i25 = aa1.f413l;
                                    return jMax;
                                }
                                i23 = i14 == 0 ? 0 : 512;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i23;
                                long jMax2 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) sa1Var.f60576c) & 63);
                                int i26 = aa1.f413l;
                                return jMax2;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s3 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) sa1Var.f60576c) & 63);
                        int i27 = aa1.f413l;
                        return jMax3;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax4 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) sa1Var.f60576c) & 63);
                    int i28 = aa1.f413l;
                    return jMax4;
                }
                if (i >= -10) {
                    int i29 = (i21 | 8388608) >> (1 - i);
                    if ((i29 & 4096) != 0) {
                        i29 += 8192;
                    }
                    i2 = i29 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i19 << 15) | (i << 10);
        short s4 = (short) i3;
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) sa1Var.f60576c) & 63);
                        int i210 = aa1.f413l;
                        return jMax5;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax6 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) sa1Var.f60576c) & 63);
                    int i211 = aa1.f413l;
                    return jMax6;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s6 = (short) i10;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i23 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) sa1Var.f60576c) & 63);
            int i212 = aa1.f413l;
            return jMax7;
        }
        i23 = i14 == 0 ? 0 : 512;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i23;
        long jMax8 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) sa1Var.f60576c) & 63);
        int i213 = aa1.f413l;
        return jMax8;
    }

    /* JADX INFO: renamed from: z */
    public static final ArrayList m10066z(List list, ui3 ui3Var) {
        sq6 sq6Var;
        if (!((Boolean) ui3Var.mo0a()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ct5 ct5Var = (ct5) list.get(i);
            Object objMo1509A = ct5Var.mo1509A();
            objMo1509A.getClass();
            r41 r41Var = ((dx9) objMo1509A).f36400a;
            C0180h c0180h = (C0180h) r41Var.f58596c;
            C3378nn c3378nn = (C3378nn) r41Var.f58595b;
            rw9 rw9Var = (rw9) ((xc9) c0180h.f2907a).getValue();
            if (rw9Var == null) {
                sq6Var = new sq6(0, 0, new b98(23));
            } else {
                C3378nn c3378nnM1076c = C0180h.m1076c(c3378nn, rw9Var);
                if (c3378nnM1076c == null) {
                    sq6Var = new sq6(0, 0, new b98(24));
                } else {
                    j84 j84VarM24755a0 = xwc.m24755a0(rw9Var.m20962i(c3378nnM1076c.f52980b, c3378nnM1076c.f52981c).m19987d());
                    sq6Var = new sq6(j84VarM24755a0.m14324d(), j84VarM24755a0.m14322b(), new y47(j84VarM24755a0, 18));
                }
            }
            int i2 = sq6Var.f61253a;
            int i3 = sq6Var.f61254b;
            arrayList.add(new Pair(ct5Var.mo1514r(AbstractC3423or.m18278s(i2, i2, i3, i3)), (ui3) sq6Var.f61255c));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo10067A(int i, int i2, LayoutDirection layoutDirection, l87 l87Var, int i3);

    /* JADX INFO: renamed from: E */
    public Integer mo10068E(l87 l87Var) {
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo10069a0(Throwable th);

    /* JADX INFO: renamed from: b0 */
    public abstract void mo10070b0(C3329mb c3329mb);
}
