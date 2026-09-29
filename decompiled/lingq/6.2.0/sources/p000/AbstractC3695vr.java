package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.database.SQLException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0407s;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.glance.appwidget.components.AbstractC0655b;
import androidx.glance.layout.AbstractC0686a;
import coil.C0855a;
import coil.compose.C0858a;
import com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType;
import com.lingq.core.database.entity.DictionaryDataEntity;
import com.lingq.core.network.api.result.ResultDictionaryData;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: renamed from: vr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3695vr {

    /* JADX INFO: renamed from: a */
    public static final int[] f65806a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f65807b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f65808c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f65809d = {R.attr.name, R.attr.pathData};

    /* JADX INFO: renamed from: e */
    public static final byte[] f65810e = new byte[0];

    /* JADX INFO: renamed from: f */
    public static final ho5 f65811f = new ho5(10);

    /* JADX INFO: renamed from: g */
    public static final Object f65812g = new Object();

    /* JADX INFO: renamed from: h */
    public static final Object f65813h = new Object();

    /* JADX INFO: renamed from: i */
    public static Thread f65814i;

    /* JADX INFO: renamed from: j */
    public static volatile Handler f65815j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f65816k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f65817l = 0;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f65818m = 0;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f65819n = 0;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f65820o = 0;

    /* JADX INFO: renamed from: A */
    public static final void m23483A(df4 df4Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        df4Var.getClass();
        fa4.m11650l(serialDescriptor.getKind(), hl9.f42585y);
    }

    /* JADX INFO: renamed from: B */
    public static e16 m23484B(e16 e16Var, y27 y27Var, InterfaceC3571se interfaceC3571se, jl1 jl1Var, float f, fa1 fa1Var, int i) {
        if ((i & 4) != 0) {
            interfaceC3571se = nj0.f52812g;
        }
        InterfaceC3571se interfaceC3571se2 = interfaceC3571se;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return e16Var.mo3161g(new z27(y27Var, interfaceC3571se2, jl1Var, f, fa1Var));
    }

    /* JADX INFO: renamed from: C */
    public static final void m23485C(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    /* JADX INFO: renamed from: D */
    public static final DictionaryDataEntity m23486D(ResultDictionaryData resultDictionaryData) {
        String str;
        resultDictionaryData.getClass();
        int i = resultDictionaryData.f20825a;
        String str2 = resultDictionaryData.f20826b;
        if (str2 == null) {
            str2 = "";
            str = str2;
        } else {
            str = "";
        }
        int i2 = resultDictionaryData.f20827c;
        String str3 = resultDictionaryData.f20828d;
        if (str3 == null) {
            str3 = str;
        }
        String str4 = resultDictionaryData.f20829e;
        if (str4 == null) {
            str4 = str;
        }
        String str5 = resultDictionaryData.f20831g;
        if (str5 == null) {
            str5 = str;
        }
        String str6 = resultDictionaryData.f20832h;
        if (str6 == null) {
            str6 = str;
        }
        String str7 = resultDictionaryData.f20833i;
        if (str7 == null) {
            str7 = str;
        }
        String str8 = resultDictionaryData.f20834j;
        if (str8 == null) {
            str8 = str;
        }
        String str9 = resultDictionaryData.f20835k;
        if (str9 == null) {
            str9 = str;
        }
        String str10 = resultDictionaryData.f20836l;
        if (str10 == null) {
            str10 = str;
        }
        String str11 = resultDictionaryData.f20837m;
        return new DictionaryDataEntity(i, str2, i2, str3, str4, false, str5, str6, str7, str8, str9, str10, str11 == null ? str : str11);
    }

    /* JADX INFO: renamed from: E */
    public static final void m23487E() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m23488F(String str) {
        str.getClass();
        return (str.length() == 0 || C3409oh.f54332d.contains(str)) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m23489G(Thread thread) {
        if (f65814i == null) {
            f65814i = Looper.getMainLooper().getThread();
        }
        return thread == f65814i;
    }

    /* JADX INFO: renamed from: H */
    public static Handler m23490H() {
        if (f65815j == null) {
            synchronized (f65813h) {
                try {
                    if (f65815j == null) {
                        f65815j = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f65815j;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0141  */
    /* JADX WARN: Code duplicated, block: B:105:0x0154  */
    /* JADX WARN: Code duplicated, block: B:108:0x0173  */
    /* JADX WARN: Code duplicated, block: B:111:0x018b  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    /* JADX INFO: renamed from: a */
    public static final void m23491a(final C3589sw c3589sw, final String str, final e16 e16Var, final vi3 vi3Var, final vi3 vi3Var2, final InterfaceC3571se interfaceC3571se, final jl1 jl1Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        String str2;
        InterfaceC3571se interfaceC3571se2;
        int i4;
        Object objM22097O;
        i99 i99Var;
        boolean z;
        Context context;
        boolean zM22120g;
        Object objM22097O2;
        e04 e04Var;
        e04 e04Var2;
        boolean zM22120g2;
        Object objM22097O3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-421592773);
        if ((i & 14) == 0) {
            i3 = (tj3Var.m22120g(c3589sw) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            str2 = str;
            i3 |= tj3Var.m22120g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 896) == 0) {
            i3 |= tj3Var.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i3 |= tj3Var.m22124i(vi3Var2) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            interfaceC3571se2 = interfaceC3571se;
            i3 |= tj3Var.m22120g(interfaceC3571se2) ? 131072 : 65536;
        } else {
            interfaceC3571se2 = interfaceC3571se;
        }
        if ((i & 3670016) == 0) {
            i3 |= tj3Var.m22120g(jl1Var) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= tj3Var.m22114d(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= tj3Var.m22120g(null) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i3 |= tj3Var.m22116e(1) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (tj3Var.m22122h(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            Object obj = c3589sw.f61503a;
            q18 q18Var = kna.f47564b;
            tj3Var.m22113c0(1677680258);
            boolean z2 = obj instanceof e04;
            p84 p84Var = we1.f66679a;
            if (z2) {
                e04Var = (e04) obj;
                if (e04Var.f36527z.f8213a != null) {
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22113c0(408306591);
                    if (fa4.m11650l(jl1Var, hl1.f42569f)) {
                        i99Var = kna.f47564b;
                        z = false;
                    } else {
                        tj3Var.m22113c0(408309406);
                        objM22097O = tj3Var.m22097O();
                        if (objM22097O == p84Var) {
                            objM22097O = new ek1();
                            tj3Var.m22131l0(objM22097O);
                        }
                        i99Var = (ek1) objM22097O;
                        z = false;
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z);
                    if (z2) {
                        tj3Var.m22113c0(-227230258);
                        e04Var2 = (e04) obj;
                        tj3Var.m22113c0(408312509);
                        zM22120g2 = tj3Var.m22120g(e04Var2) | tj3Var.m22120g(i99Var);
                        objM22097O3 = tj3Var.m22097O();
                        if (zM22120g2 || objM22097O3 == p84Var) {
                            d04 d04VarM10778a = e04.m10778a(e04Var2);
                            d04VarM10778a.f34791p = i99Var;
                            d04VarM10778a.m9961b();
                            objM22097O3 = d04VarM10778a.m9960a();
                            tj3Var.m22131l0(objM22097O3);
                        }
                        e04Var = (e04) objM22097O3;
                    } else {
                        tj3Var.m22113c0(-227066702);
                        context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
                        tj3Var.m22113c0(408319118);
                        zM22120g = tj3Var.m22120g(context) | tj3Var.m22120g(obj) | tj3Var.m22120g(i99Var);
                        objM22097O2 = tj3Var.m22097O();
                        if (zM22120g || objM22097O2 == p84Var) {
                            d04 d04Var = new d04(context);
                            d04Var.f34778c = obj;
                            d04Var.f34791p = i99Var;
                            d04Var.m9961b();
                            objM22097O2 = d04Var.m9960a();
                            tj3Var.m22131l0(objM22097O2);
                        }
                        e04Var = (e04) objM22097O2;
                    }
                    AbstractC3393o1.m17723A(tj3Var, false, false, false);
                }
            } else {
                tj3Var.m22113c0(408306591);
                if (fa4.m11650l(jl1Var, hl1.f42569f)) {
                    i99Var = kna.f47564b;
                    z = false;
                } else {
                    tj3Var.m22113c0(408309406);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new ek1();
                        tj3Var.m22131l0(objM22097O);
                    }
                    i99Var = (ek1) objM22097O;
                    z = false;
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z);
                if (z2) {
                    tj3Var.m22113c0(-227230258);
                    e04Var2 = (e04) obj;
                    tj3Var.m22113c0(408312509);
                    zM22120g2 = tj3Var.m22120g(e04Var2) | tj3Var.m22120g(i99Var);
                    objM22097O3 = tj3Var.m22097O();
                    if (zM22120g2) {
                        d04 d04VarM10778a2 = e04.m10778a(e04Var2);
                        d04VarM10778a2.f34791p = i99Var;
                        d04VarM10778a2.m9961b();
                        objM22097O3 = d04VarM10778a2.m9960a();
                        tj3Var.m22131l0(objM22097O3);
                    } else {
                        d04 d04VarM10778a3 = e04.m10778a(e04Var2);
                        d04VarM10778a3.f34791p = i99Var;
                        d04VarM10778a3.m9961b();
                        objM22097O3 = d04VarM10778a3.m9960a();
                        tj3Var.m22131l0(objM22097O3);
                    }
                    e04Var = (e04) objM22097O3;
                } else {
                    tj3Var.m22113c0(-227066702);
                    context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
                    tj3Var.m22113c0(408319118);
                    zM22120g = tj3Var.m22120g(context) | tj3Var.m22120g(obj) | tj3Var.m22120g(i99Var);
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g) {
                        d04 d04Var2 = new d04(context);
                        d04Var2.f34778c = obj;
                        d04Var2.f34791p = i99Var;
                        d04Var2.m9961b();
                        objM22097O2 = d04Var2.m9960a();
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        d04 d04Var3 = new d04(context);
                        d04Var3.f34778c = obj;
                        d04Var3.f34791p = i99Var;
                        d04Var3.m9961b();
                        objM22097O2 = d04Var3.m9960a();
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e04Var = (e04) objM22097O2;
                }
                AbstractC3393o1.m17723A(tj3Var, false, false, false);
            }
            C0855a c0855a = c3589sw.f61505c;
            int i5 = i3 >> 6;
            int i6 = i5 & 57344;
            tj3Var.m22113c0(1645646697);
            tj3Var.m22113c0(952940650);
            Trace.beginSection("rememberAsyncImagePainter");
            try {
                e04 e04VarM15339a = kna.m15339a(e04Var, tj3Var);
                vz1.m23647p0(e04VarM15339a);
                tj3Var.m22113c0(1094691773);
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new C0858a(e04VarM15339a, c0855a);
                    tj3Var.m22131l0(objM22097O4);
                }
                C0858a c0858a = (C0858a) objM22097O4;
                tj3Var.m22139q(false);
                c0858a.f10439l = vi3Var;
                c0858a.f10425H = vi3Var2;
                c0858a.f10426I = jl1Var;
                c0858a.f10427J = 1;
                c0858a.f10428K = ((Boolean) tj3Var.m22128k(AbstractC0407s.f4861a)).booleanValue();
                ((xc9) c0858a.f10431N).setValue(c0855a);
                ((xc9) c0858a.f10430M).setValue(e04VarM15339a);
                c0858a.mo1247g();
                tj3Var.m22139q(false);
                Trace.endSection();
                tj3Var.m22139q(false);
                i99 i99Var2 = e04Var.f36523v;
                m23492b(i99Var2 instanceof ek1 ? e16Var.mo3161g((e16) i99Var2) : e16Var, c0858a, str2, interfaceC3571se2, jl1Var, tj3Var, ((i3 << 3) & 896) | (i5 & 7168) | i6 | (i5 & 458752) | (i5 & 3670016) | ((i4 << 21) & 29360128));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: hw
                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC3695vr.m23491a(c3589sw, str, e16Var, vi3Var, vi3Var2, interfaceC3571se, jl1Var, (ye1) obj2, pk9.m19383z(i | 1), pk9.m19383z(i2));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23492b(e16 e16Var, C0858a c0858a, String str, InterfaceC3571se interfaceC3571se, jl1 jl1Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(777774312);
        if ((i & 14) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 112) == 0) {
            i2 |= tj3Var.m22120g(c0858a) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= tj3Var.m22120g(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= tj3Var.m22120g(interfaceC3571se) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= tj3Var.m22120g(jl1Var) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= tj3Var.m22114d(1.0f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= tj3Var.m22120g(null) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= tj3Var.m22122h(true) ? 8388608 : 4194304;
        }
        if ((i2 & 23967451) == 4793490 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            q18 q18Var = kna.f47564b;
            e16 e16VarMo3161g = pb1.m19046p(str != null ? nv8.m17643c(e16Var, false, new jd0(str, i3)) : e16Var).mo3161g(new el1(c0858a, interfaceC3571se, jl1Var));
            C3580sn c3580sn = C3580sn.f61036c;
            tj3Var.m22113c0(544976794);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
            l77 l77VarM22132m = tj3Var.m22132m();
            se1.f60731q.getClass();
            final ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22113c0(1405779621);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(new ui3() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        return ui3Var.mo0a();
                    }
                });
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, c3580sn);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            zi3 zi3Var = C0352b.f4304g;
            if (tj3Var.f62384S || !fa4.m11650l(tj3Var.m22097O(), Integer.valueOf(iHashCode))) {
                tj3Var.m22131l0(Integer.valueOf(iHashCode));
                tj3Var.m22110b(Integer.valueOf(iHashCode), zi3Var);
            }
            AbstractC3393o1.m17723A(tj3Var, true, false, false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3125iw(e16Var, c0858a, str, interfaceC3571se, jl1Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C3372nh m23493c(String str) {
        return new C3372nh(AbstractC3489q9.m19766C(str));
    }

    /* JADX INFO: renamed from: d */
    public static final long m23494d(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX INFO: renamed from: e */
    public static final void m23495e(final Integer num, final String str, final String str2, final int i, final tg9 tg9Var, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1993021317);
        int i3 = i2 | (tj3Var.m22120g(num) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22120g(str2) ? 256 : 128) | (tj3Var.m22116e(i) ? 2048 : 1024) | (tj3Var.m22124i(tg9Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            AbstractC0686a.m2486b(wfb.m23928w(ci8.m4734s(mn3.f51554a), 12.0f), 1, 1, ci8.m4703P(-1352907195, new aj3() { // from class: nl6
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    ((Integer) obj3).getClass();
                    ((cb1) obj).getClass();
                    AbstractC0686a.m2487c(null, 0, 0, ci8.m4703P(390938465, new ia5(2, num, str), ye1Var2), ye1Var2, 3072, 7);
                    AbstractC0686a.m2488d(ci8.m4694G(mn3.f51554a, 8.0f), ye1Var2, 0);
                    AbstractC0655b.m2220b(str2, tg9Var, null, false, new C0850ck(i), null, 0, ye1Var2, 0);
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 3072, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new hd1(num, str, str2, i, tg9Var, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m23496g(bk8 bk8Var, String str) {
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
        try {
            ik8VarMo2873e0.mo2876a0();
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C0302d m23497h(C0302d c0302d) {
        C0302d c0302dM1362h = ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0302d)).getFocusOwner()).m1362h();
        if (c0302dM1362h == null || !c0302dM1362h.f34836I) {
            return null;
        }
        return c0302dM1362h;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x0129  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0199  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01be, code lost:
    
        if (p000.fa4.m11650l(r9, r1) == false) goto L82;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0129, please report this as an issue */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m23498i(View view, List list, int i, int i2, String str) {
        String strM12372g;
        String string;
        String strM12368c;
        String strM17040h;
        String strM12367b;
        String string2;
        String strM12373h;
        String strM17042j;
        list.getClass();
        str.getClass();
        String str2 = str + '.' + i2;
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            int i3 = 0;
            if (i >= list.size()) {
                arrayList.add(new u41(view, str2));
            } else {
                g57 g57Var = (g57) list.get(i);
                if (fa4.m11650l(g57Var.m12366a(), "..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ArrayList arrayListM23499j = m23499j((ViewGroup) parent);
                        int size = arrayListM23499j.size();
                        while (i3 < size) {
                            arrayList.addAll(m23498i((View) arrayListM23499j.get(i3), list, i + 1, i3, str2));
                            i3++;
                        }
                    }
                } else {
                    if (fa4.m11650l(g57Var.m12366a(), ".")) {
                        arrayList.add(new u41(view, str2));
                        return arrayList;
                    }
                    if (g57Var.m12370e() == -1 || i2 == g57Var.m12370e()) {
                        if (!fa4.m11650l(view.getClass().getCanonicalName(), g57Var.m12366a())) {
                            if (new Regex(".*android\\..*").m15427f(g57Var.m12366a())) {
                                List listM23365A0 = vk9.m23365A0(g57Var.m12366a(), new String[]{"."}, 0, 6);
                                if (!listM23365A0.isEmpty()) {
                                    if (view.getClass().getSimpleName().equals((String) listM23365A0.get(listM23365A0.size() - 1))) {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.ID.getValue()) > 0 || g57Var.m12369d() == view.getId()) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TEXT.getValue()) > 0) {
                                                strM12373h = g57Var.m12373h();
                                                strM17042j = mta.m17042j(view);
                                                String strM3913C = bna.m3913C(bna.m3978u0(strM17042j));
                                                if (fa4.m11650l(strM12373h, strM17042j) || fa4.m11650l(strM12373h, strM3913C)) {
                                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                                        strM12367b = g57Var.m12367b();
                                                        if (view.getContentDescription() == null) {
                                                            string2 = "";
                                                        } else {
                                                            string2 = view.getContentDescription().toString();
                                                        }
                                                        String strM3913C2 = bna.m3913C(bna.m3978u0(string2));
                                                        if (fa4.m11650l(strM12367b, string2) || fa4.m11650l(strM12367b, strM3913C2)) {
                                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                                                strM12368c = g57Var.m12368c();
                                                                strM17040h = mta.m17040h(view);
                                                                String strM3913C3 = bna.m3913C(bna.m3978u0(strM17040h));
                                                                if (fa4.m11650l(strM12368c, strM17040h) || fa4.m11650l(strM12368c, strM3913C3)) {
                                                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                        strM12372g = g57Var.m12372g();
                                                                        string = view.getTag() != null ? view.getTag().toString() : "";
                                                                        String strM3913C4 = bna.m3913C(bna.m3978u0(string));
                                                                        if (!fa4.m11650l(strM12372g, string)) {
                                                                        }
                                                                    }
                                                                    if (i == list.size() - 1) {
                                                                        arrayList.add(new u41(view, str2));
                                                                    }
                                                                }
                                                            } else {
                                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                    strM12372g = g57Var.m12372g();
                                                                    if (view.getTag() != null) {
                                                                    }
                                                                    String strM3913C5 = bna.m3913C(bna.m3978u0(string));
                                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                                    }
                                                                }
                                                                if (i == list.size() - 1) {
                                                                    arrayList.add(new u41(view, str2));
                                                                }
                                                            }
                                                        }
                                                    } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                                        strM12368c = g57Var.m12368c();
                                                        strM17040h = mta.m17040h(view);
                                                        String strM3913C6 = bna.m3913C(bna.m3978u0(strM17040h));
                                                        if (fa4.m11650l(strM12368c, strM17040h)) {
                                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                strM12372g = g57Var.m12372g();
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM3913C7 = bna.m3913C(bna.m3978u0(string));
                                                                if (!fa4.m11650l(strM12372g, string)) {
                                                                }
                                                            }
                                                            if (i == list.size() - 1) {
                                                                arrayList.add(new u41(view, str2));
                                                            }
                                                        } else {
                                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                strM12372g = g57Var.m12372g();
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM3913C8 = bna.m3913C(bna.m3978u0(string));
                                                                if (!fa4.m11650l(strM12372g, string)) {
                                                                }
                                                            }
                                                            if (i == list.size() - 1) {
                                                                arrayList.add(new u41(view, str2));
                                                            }
                                                        }
                                                    } else {
                                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                            strM12372g = g57Var.m12372g();
                                                            if (view.getTag() != null) {
                                                            }
                                                            String strM3913C9 = bna.m3913C(bna.m3978u0(string));
                                                            if (!fa4.m11650l(strM12372g, string)) {
                                                            }
                                                        }
                                                        if (i == list.size() - 1) {
                                                            arrayList.add(new u41(view, str2));
                                                        }
                                                    }
                                                }
                                            } else {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                                    strM12367b = g57Var.m12367b();
                                                    if (view.getContentDescription() == null) {
                                                        string2 = "";
                                                    } else {
                                                        string2 = view.getContentDescription().toString();
                                                    }
                                                    String strM3913C10 = bna.m3913C(bna.m3978u0(string2));
                                                    if (fa4.m11650l(strM12367b, string2)) {
                                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                                            strM12368c = g57Var.m12368c();
                                                            strM17040h = mta.m17040h(view);
                                                            String strM3913C11 = bna.m3913C(bna.m3978u0(strM17040h));
                                                            if (fa4.m11650l(strM12368c, strM17040h)) {
                                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                    strM12372g = g57Var.m12372g();
                                                                    if (view.getTag() != null) {
                                                                    }
                                                                    String strM3913C12 = bna.m3913C(bna.m3978u0(string));
                                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                                    }
                                                                }
                                                                if (i == list.size() - 1) {
                                                                    arrayList.add(new u41(view, str2));
                                                                }
                                                            } else {
                                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                    strM12372g = g57Var.m12372g();
                                                                    if (view.getTag() != null) {
                                                                    }
                                                                    String strM3913C13 = bna.m3913C(bna.m3978u0(string));
                                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                                    }
                                                                }
                                                                if (i == list.size() - 1) {
                                                                    arrayList.add(new u41(view, str2));
                                                                }
                                                            }
                                                        } else {
                                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                strM12372g = g57Var.m12372g();
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM3913C14 = bna.m3913C(bna.m3978u0(string));
                                                                if (!fa4.m11650l(strM12372g, string)) {
                                                                }
                                                            }
                                                            if (i == list.size() - 1) {
                                                                arrayList.add(new u41(view, str2));
                                                            }
                                                        }
                                                    } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                                        strM12368c = g57Var.m12368c();
                                                        strM17040h = mta.m17040h(view);
                                                        String strM3913C15 = bna.m3913C(bna.m3978u0(strM17040h));
                                                        if (fa4.m11650l(strM12368c, strM17040h)) {
                                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                strM12372g = g57Var.m12372g();
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM3913C16 = bna.m3913C(bna.m3978u0(string));
                                                                if (!fa4.m11650l(strM12372g, string)) {
                                                                }
                                                            }
                                                            if (i == list.size() - 1) {
                                                                arrayList.add(new u41(view, str2));
                                                            }
                                                        } else {
                                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                                strM12372g = g57Var.m12372g();
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM3913C17 = bna.m3913C(bna.m3978u0(string));
                                                                if (!fa4.m11650l(strM12372g, string)) {
                                                                }
                                                            }
                                                            if (i == list.size() - 1) {
                                                                arrayList.add(new u41(view, str2));
                                                            }
                                                        }
                                                    } else {
                                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                            strM12372g = g57Var.m12372g();
                                                            if (view.getTag() != null) {
                                                            }
                                                            String strM3913C18 = bna.m3913C(bna.m3978u0(string));
                                                            if (!fa4.m11650l(strM12372g, string)) {
                                                            }
                                                        }
                                                        if (i == list.size() - 1) {
                                                            arrayList.add(new u41(view, str2));
                                                        }
                                                    }
                                                } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                                    strM12368c = g57Var.m12368c();
                                                    strM17040h = mta.m17040h(view);
                                                    String strM3913C19 = bna.m3913C(bna.m3978u0(strM17040h));
                                                    if (fa4.m11650l(strM12368c, strM17040h)) {
                                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                            strM12372g = g57Var.m12372g();
                                                            if (view.getTag() != null) {
                                                            }
                                                            String strM3913C110 = bna.m3913C(bna.m3978u0(string));
                                                            if (!fa4.m11650l(strM12372g, string)) {
                                                            }
                                                        }
                                                        if (i == list.size() - 1) {
                                                            arrayList.add(new u41(view, str2));
                                                        }
                                                    } else {
                                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                            strM12372g = g57Var.m12372g();
                                                            if (view.getTag() != null) {
                                                            }
                                                            String strM3913C111 = bna.m3913C(bna.m3978u0(string));
                                                            if (!fa4.m11650l(strM12372g, string)) {
                                                            }
                                                        }
                                                        if (i == list.size() - 1) {
                                                            arrayList.add(new u41(view, str2));
                                                        }
                                                    }
                                                } else {
                                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                        strM12372g = g57Var.m12372g();
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM3913C112 = bna.m3913C(bna.m3978u0(string));
                                                        if (!fa4.m11650l(strM12372g, string)) {
                                                        }
                                                    }
                                                    if (i == list.size() - 1) {
                                                        arrayList.add(new u41(view, str2));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.ID.getValue()) > 0) {
                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TEXT.getValue()) > 0) {
                                strM12373h = g57Var.m12373h();
                                strM17042j = mta.m17042j(view);
                                String strM3913C20 = bna.m3913C(bna.m3978u0(strM17042j));
                                if (fa4.m11650l(strM12373h, strM17042j)) {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                        strM12367b = g57Var.m12367b();
                                        if (view.getContentDescription() == null) {
                                            string2 = "";
                                        } else {
                                            string2 = view.getContentDescription().toString();
                                        }
                                        String strM3913C113 = bna.m3913C(bna.m3978u0(string2));
                                        if (fa4.m11650l(strM12367b, string2)) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                                strM12368c = g57Var.m12368c();
                                                strM17040h = mta.m17040h(view);
                                                String strM3913C114 = bna.m3913C(bna.m3978u0(strM17040h));
                                                if (fa4.m11650l(strM12368c, strM17040h)) {
                                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                        strM12372g = g57Var.m12372g();
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM3913C115 = bna.m3913C(bna.m3978u0(string));
                                                        if (!fa4.m11650l(strM12372g, string)) {
                                                        }
                                                    }
                                                    if (i == list.size() - 1) {
                                                        arrayList.add(new u41(view, str2));
                                                    }
                                                } else {
                                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                        strM12372g = g57Var.m12372g();
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM3913C116 = bna.m3913C(bna.m3978u0(string));
                                                        if (!fa4.m11650l(strM12372g, string)) {
                                                        }
                                                    }
                                                    if (i == list.size() - 1) {
                                                        arrayList.add(new u41(view, str2));
                                                    }
                                                }
                                            } else {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C117 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            }
                                        } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                            strM12368c = g57Var.m12368c();
                                            strM17040h = mta.m17040h(view);
                                            String strM3913C118 = bna.m3913C(bna.m3978u0(strM17040h));
                                            if (fa4.m11650l(strM12368c, strM17040h)) {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C119 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            } else {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C1110 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C1111 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                        strM12368c = g57Var.m12368c();
                                        strM17040h = mta.m17040h(view);
                                        String strM3913C1112 = bna.m3913C(bna.m3978u0(strM17040h));
                                        if (fa4.m11650l(strM12368c, strM17040h)) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C1113 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C1114 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C1115 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                        strM12367b = g57Var.m12367b();
                                        if (view.getContentDescription() == null) {
                                            string2 = "";
                                        } else {
                                            string2 = view.getContentDescription().toString();
                                        }
                                        String strM3913C1116 = bna.m3913C(bna.m3978u0(string2));
                                        if (fa4.m11650l(strM12367b, string2)) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                                strM12368c = g57Var.m12368c();
                                                strM17040h = mta.m17040h(view);
                                                String strM3913C1117 = bna.m3913C(bna.m3978u0(strM17040h));
                                                if (fa4.m11650l(strM12368c, strM17040h)) {
                                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                        strM12372g = g57Var.m12372g();
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM3913C1118 = bna.m3913C(bna.m3978u0(string));
                                                        if (!fa4.m11650l(strM12372g, string)) {
                                                        }
                                                    }
                                                    if (i == list.size() - 1) {
                                                        arrayList.add(new u41(view, str2));
                                                    }
                                                } else {
                                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                        strM12372g = g57Var.m12372g();
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM3913C1119 = bna.m3913C(bna.m3978u0(string));
                                                        if (!fa4.m11650l(strM12372g, string)) {
                                                        }
                                                    }
                                                    if (i == list.size() - 1) {
                                                        arrayList.add(new u41(view, str2));
                                                    }
                                                }
                                            } else {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C11110 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            }
                                        } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                            strM12368c = g57Var.m12368c();
                                            strM17040h = mta.m17040h(view);
                                            String strM3913C11111 = bna.m3913C(bna.m3978u0(strM17040h));
                                            if (fa4.m11650l(strM12368c, strM17040h)) {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C11112 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            } else {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C11113 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C11114 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                        strM12368c = g57Var.m12368c();
                                        strM17040h = mta.m17040h(view);
                                        String strM3913C11115 = bna.m3913C(bna.m3978u0(strM17040h));
                                        if (fa4.m11650l(strM12368c, strM17040h)) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C11116 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C11117 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C11118 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                }
                            } else {
                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                    strM12367b = g57Var.m12367b();
                                    if (view.getContentDescription() == null) {
                                        string2 = "";
                                    } else {
                                        string2 = view.getContentDescription().toString();
                                    }
                                    String strM3913C11119 = bna.m3913C(bna.m3978u0(string2));
                                    if (fa4.m11650l(strM12367b, string2)) {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                            strM12368c = g57Var.m12368c();
                                            strM17040h = mta.m17040h(view);
                                            String strM3913C111110 = bna.m3913C(bna.m3978u0(strM17040h));
                                            if (fa4.m11650l(strM12368c, strM17040h)) {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C111111 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            } else {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C111112 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C111113 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                        strM12368c = g57Var.m12368c();
                                        strM17040h = mta.m17040h(view);
                                        String strM3913C111114 = bna.m3913C(bna.m3978u0(strM17040h));
                                        if (fa4.m11650l(strM12368c, strM17040h)) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C111115 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C111116 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C111117 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                    strM12368c = g57Var.m12368c();
                                    strM17040h = mta.m17040h(view);
                                    String strM3913C111118 = bna.m3913C(bna.m3978u0(strM17040h));
                                    if (fa4.m11650l(strM12368c, strM17040h)) {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C111119 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C1111110 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                        strM12372g = g57Var.m12372g();
                                        if (view.getTag() != null) {
                                        }
                                        String strM3913C1111111 = bna.m3913C(bna.m3978u0(string));
                                        if (!fa4.m11650l(strM12372g, string)) {
                                        }
                                    }
                                    if (i == list.size() - 1) {
                                        arrayList.add(new u41(view, str2));
                                    }
                                }
                            }
                        } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TEXT.getValue()) > 0) {
                            strM12373h = g57Var.m12373h();
                            strM17042j = mta.m17042j(view);
                            String strM3913C21 = bna.m3913C(bna.m3978u0(strM17042j));
                            if (fa4.m11650l(strM12373h, strM17042j)) {
                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                    strM12367b = g57Var.m12367b();
                                    if (view.getContentDescription() == null) {
                                        string2 = "";
                                    } else {
                                        string2 = view.getContentDescription().toString();
                                    }
                                    String strM3913C111120 = bna.m3913C(bna.m3978u0(string2));
                                    if (fa4.m11650l(strM12367b, string2)) {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                            strM12368c = g57Var.m12368c();
                                            strM17040h = mta.m17040h(view);
                                            String strM3913C1111112 = bna.m3913C(bna.m3978u0(strM17040h));
                                            if (fa4.m11650l(strM12368c, strM17040h)) {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C1111113 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            } else {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C1111114 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C1111115 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                        strM12368c = g57Var.m12368c();
                                        strM17040h = mta.m17040h(view);
                                        String strM3913C1111116 = bna.m3913C(bna.m3978u0(strM17040h));
                                        if (fa4.m11650l(strM12368c, strM17040h)) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C1111117 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C1111118 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C1111119 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                    strM12368c = g57Var.m12368c();
                                    strM17040h = mta.m17040h(view);
                                    String strM3913C11111110 = bna.m3913C(bna.m3978u0(strM17040h));
                                    if (fa4.m11650l(strM12368c, strM17040h)) {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C11111111 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C11111112 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                        strM12372g = g57Var.m12372g();
                                        if (view.getTag() != null) {
                                        }
                                        String strM3913C11111113 = bna.m3913C(bna.m3978u0(string));
                                        if (!fa4.m11650l(strM12372g, string)) {
                                        }
                                    }
                                    if (i == list.size() - 1) {
                                        arrayList.add(new u41(view, str2));
                                    }
                                }
                            } else {
                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                    strM12367b = g57Var.m12367b();
                                    if (view.getContentDescription() == null) {
                                        string2 = "";
                                    } else {
                                        string2 = view.getContentDescription().toString();
                                    }
                                    String strM3913C111121 = bna.m3913C(bna.m3978u0(string2));
                                    if (fa4.m11650l(strM12367b, string2)) {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                            strM12368c = g57Var.m12368c();
                                            strM17040h = mta.m17040h(view);
                                            String strM3913C11111114 = bna.m3913C(bna.m3978u0(strM17040h));
                                            if (fa4.m11650l(strM12368c, strM17040h)) {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C11111115 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            } else {
                                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                    strM12372g = g57Var.m12372g();
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM3913C11111116 = bna.m3913C(bna.m3978u0(string));
                                                    if (!fa4.m11650l(strM12372g, string)) {
                                                    }
                                                }
                                                if (i == list.size() - 1) {
                                                    arrayList.add(new u41(view, str2));
                                                }
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C11111117 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                        strM12368c = g57Var.m12368c();
                                        strM17040h = mta.m17040h(view);
                                        String strM3913C11111118 = bna.m3913C(bna.m3978u0(strM17040h));
                                        if (fa4.m11650l(strM12368c, strM17040h)) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C11111119 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C111111110 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C111111111 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                    strM12368c = g57Var.m12368c();
                                    strM17040h = mta.m17040h(view);
                                    String strM3913C111111112 = bna.m3913C(bna.m3978u0(strM17040h));
                                    if (fa4.m11650l(strM12368c, strM17040h)) {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C111111113 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C111111114 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                        strM12372g = g57Var.m12372g();
                                        if (view.getTag() != null) {
                                        }
                                        String strM3913C111111115 = bna.m3913C(bna.m3978u0(string));
                                        if (!fa4.m11650l(strM12372g, string)) {
                                        }
                                    }
                                    if (i == list.size() - 1) {
                                        arrayList.add(new u41(view, str2));
                                    }
                                }
                            }
                        } else {
                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                strM12367b = g57Var.m12367b();
                                if (view.getContentDescription() == null) {
                                    string2 = "";
                                } else {
                                    string2 = view.getContentDescription().toString();
                                }
                                String strM3913C111122 = bna.m3913C(bna.m3978u0(string2));
                                if (fa4.m11650l(strM12367b, string2)) {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                        strM12368c = g57Var.m12368c();
                                        strM17040h = mta.m17040h(view);
                                        String strM3913C111111116 = bna.m3913C(bna.m3978u0(strM17040h));
                                        if (fa4.m11650l(strM12368c, strM17040h)) {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C111111117 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        } else {
                                            if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                                strM12372g = g57Var.m12372g();
                                                if (view.getTag() != null) {
                                                }
                                                String strM3913C111111118 = bna.m3913C(bna.m3978u0(string));
                                                if (!fa4.m11650l(strM12372g, string)) {
                                                }
                                            }
                                            if (i == list.size() - 1) {
                                                arrayList.add(new u41(view, str2));
                                            }
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C111111119 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                    strM12368c = g57Var.m12368c();
                                    strM17040h = mta.m17040h(view);
                                    String strM3913C1111111110 = bna.m3913C(bna.m3978u0(strM17040h));
                                    if (fa4.m11650l(strM12368c, strM17040h)) {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C1111111111 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    } else {
                                        if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                            strM12372g = g57Var.m12372g();
                                            if (view.getTag() != null) {
                                            }
                                            String strM3913C1111111112 = bna.m3913C(bna.m3978u0(string));
                                            if (!fa4.m11650l(strM12372g, string)) {
                                            }
                                        }
                                        if (i == list.size() - 1) {
                                            arrayList.add(new u41(view, str2));
                                        }
                                    }
                                } else {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                        strM12372g = g57Var.m12372g();
                                        if (view.getTag() != null) {
                                        }
                                        String strM3913C1111111113 = bna.m3913C(bna.m3978u0(string));
                                        if (!fa4.m11650l(strM12372g, string)) {
                                        }
                                    }
                                    if (i == list.size() - 1) {
                                        arrayList.add(new u41(view, str2));
                                    }
                                }
                            } else if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.HINT.getValue()) > 0) {
                                strM12368c = g57Var.m12368c();
                                strM17040h = mta.m17040h(view);
                                String strM3913C1111111114 = bna.m3913C(bna.m3978u0(strM17040h));
                                if (fa4.m11650l(strM12368c, strM17040h)) {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                        strM12372g = g57Var.m12372g();
                                        if (view.getTag() != null) {
                                        }
                                        String strM3913C1111111115 = bna.m3913C(bna.m3978u0(string));
                                        if (!fa4.m11650l(strM12372g, string)) {
                                        }
                                    }
                                    if (i == list.size() - 1) {
                                        arrayList.add(new u41(view, str2));
                                    }
                                } else {
                                    if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                        strM12372g = g57Var.m12372g();
                                        if (view.getTag() != null) {
                                        }
                                        String strM3913C1111111116 = bna.m3913C(bna.m3978u0(string));
                                        if (!fa4.m11650l(strM12372g, string)) {
                                        }
                                    }
                                    if (i == list.size() - 1) {
                                        arrayList.add(new u41(view, str2));
                                    }
                                }
                            } else {
                                if ((g57Var.m12371f() & PathComponent$MatchBitmaskType.TAG.getValue()) > 0) {
                                    strM12372g = g57Var.m12372g();
                                    if (view.getTag() != null) {
                                    }
                                    String strM3913C1111111117 = bna.m3913C(bna.m3978u0(string));
                                    if (!fa4.m11650l(strM12372g, string)) {
                                    }
                                }
                                if (i == list.size() - 1) {
                                    arrayList.add(new u41(view, str2));
                                }
                            }
                        }
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList arrayListM23499j2 = m23499j((ViewGroup) view);
                int size2 = arrayListM23499j2.size();
                while (i3 < size2) {
                    arrayList.addAll(m23498i((View) arrayListM23499j2.get(i3), list, i + 1, i3, str2));
                    i3++;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList m23499j(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static final e28 m23500k(C0302d c0302d) {
        AbstractC0362l abstractC0362l;
        if (c0302d.f34836I && (abstractC0362l = c0302d.f34844h) != null) {
            aq4 aq4VarM4054e0 = bq1.m4054e0(abstractC0362l);
            if (!aq4VarM4054e0.mo1691n()) {
                aq4VarM4054e0 = null;
            }
            if (aq4VarM4054e0 != null) {
                return c0302d.m1371c1(aq4VarM4054e0);
            }
        }
        return e28.f36619e;
    }

    /* JADX INFO: renamed from: l */
    public static final C0302d m23501l(C0302d c0302d) {
        boolean z = c0302d.f34837a.f34836I;
        if (z) {
            if (!z) {
                i54.m13663b("visitChildren called on an unattached node");
            }
            x66 x66Var = new x66(new d16[16]);
            d16 d16Var = c0302d.f34837a;
            d16 d16Var2 = d16Var.f34842f;
            if (d16Var2 == null) {
                te1.m21990d(x66Var, d16Var);
            } else {
                x66Var.m24305c(d16Var2);
            }
            while (true) {
                int i = x66Var.f67832c;
                if (i == 0) {
                    break;
                }
                d16 d16VarM21992f = (d16) x66Var.m24314l(i - 1);
                if ((d16VarM21992f.f34840d & 1024) == 0) {
                    te1.m21990d(x66Var, d16VarM21992f);
                } else {
                    while (d16VarM21992f != null) {
                        if ((d16VarM21992f.f34839c & 1024) != 0) {
                            x66 x66Var2 = null;
                            while (d16VarM21992f != null) {
                                if (d16VarM21992f instanceof C0302d) {
                                    C0302d c0302d2 = (C0302d) d16VarM21992f;
                                    if (c0302d2.f34837a.f34836I) {
                                        int i2 = la3.f49364b[c0302d2.m1373e1().ordinal()];
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            return c0302d2;
                                        }
                                        if (i2 != 4) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                    }
                                } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                    int i3 = 0;
                                    for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                        if ((d16Var3.f34839c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                d16VarM21992f = d16Var3;
                                            } else {
                                                if (x66Var2 == null) {
                                                    x66Var2 = new x66(new d16[16]);
                                                }
                                                if (d16VarM21992f != null) {
                                                    x66Var2.m24305c(d16VarM21992f);
                                                    d16VarM21992f = null;
                                                }
                                                x66Var2.m24305c(d16Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                d16VarM21992f = te1.m21992f(x66Var2);
                            }
                            break;
                        }
                        d16VarM21992f = d16VarM21992f.f34842f;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final String[] m23502m(ol1 ol1Var) {
        ol1Var.getClass();
        return (String[]) ((C3372nh) ol1Var).f52722b.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: n */
    public static final String m23503n() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{sy2.f61603s}, 1));
    }

    /* JADX INFO: renamed from: o */
    public static final String m23504o() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{sy2.f61602r}, 1));
    }

    /* JADX INFO: renamed from: p */
    public static final int m23505p(SerialDescriptor serialDescriptor, df4 df4Var, String str) {
        serialDescriptor.getClass();
        df4Var.getClass();
        str.getClass();
        m23483A(df4Var, serialDescriptor);
        int iMo3696d = serialDescriptor.mo3696d(str);
        if (iMo3696d != -3 || !df4Var.f35560a.f47131g) {
            return iMo3696d;
        }
        ic2 ic2Var = df4Var.f35562c;
        C3006fm c3006fm = new C3006fm(13, serialDescriptor, df4Var);
        ic2Var.getClass();
        ConcurrentHashMap concurrentHashMap = ic2Var.f43919a;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        ho5 ho5Var = f65811f;
        Object obj = map != null ? map.get(ho5Var) : null;
        Object objMo0a = obj != null ? obj : null;
        if (objMo0a == null) {
            objMo0a = c3006fm.mo0a();
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(ho5Var, objMo0a);
        }
        Integer num = (Integer) ((Map) objMo0a).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: q */
    public static final int m23506q(SerialDescriptor serialDescriptor, df4 df4Var, String str, String str2) {
        serialDescriptor.getClass();
        df4Var.getClass();
        str.getClass();
        int iM23505p = m23505p(serialDescriptor, df4Var, str);
        if (iM23505p != -3) {
            return iM23505p;
        }
        throw new SerializationException(serialDescriptor.mo3694a() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX INFO: renamed from: r */
    public static final int m23507r(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                C3386nv.m17626m("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public static final View m23508s(Activity activity) {
        if (lp1.f49971a.contains(AbstractC3695vr.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3695vr.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m23509t(df4 df4Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        df4Var.getClass();
        if (df4Var.f35560a.f47126b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof xf4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m23510u(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m23511v(C0302d c0302d) {
        C0357g c0357g;
        AbstractC0362l abstractC0362l;
        C0357g c0357g2;
        AbstractC0362l abstractC0362l2 = c0302d.f34844h;
        return (abstractC0362l2 == null || (c0357g = abstractC0362l2.f4432J) == null || !c0357g.m1570M() || (abstractC0362l = c0302d.f34844h) == null || (c0357g2 = abstractC0362l.f4432J) == null || !c0357g2.m1569L()) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m23512w() {
        String str = Build.FINGERPRINT;
        str.getClass();
        if (cl9.m4842Y(str, "generic", false) || cl9.m4842Y(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (vk9.m23380c0(str2, "google_sdk", false) || vk9.m23380c0(str2, "Emulator", false) || vk9.m23380c0(str2, "Android SDK built for x86", false)) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        if (vk9.m23380c0(str3, "Genymotion", false)) {
            return true;
        }
        String str4 = Build.BRAND;
        str4.getClass();
        if (cl9.m4842Y(str4, "generic", false)) {
            String str5 = Build.DEVICE;
            str5.getClass();
            if (cl9.m4842Y(str5, "generic", false)) {
                return true;
            }
        }
        return "google_sdk".equals(Build.PRODUCT);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m23513x(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m23514y(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m23515z(C0205f c0205f, boolean z) {
        aq4 aq4VarM25362c;
        yw4 yw4Var = c0205f.f3079d;
        if (yw4Var == null || (aq4VarM25362c = yw4Var.m25362c()) == null) {
            return false;
        }
        e28 e28VarM4050Z = bq1.m4050Z(aq4VarM25362c, true);
        e28 e28VarM23906a = wfb.m23906a(aq4VarM25362c.mo1699t(e28VarM4050Z.m10805f()), aq4VarM25362c.mo1699t(e28VarM4050Z.m10802c()));
        long jM1112m = c0205f.m1112m(z);
        float f = e28VarM23906a.f36620a;
        float f2 = e28VarM23906a.f36622c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM1112m >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = e28VarM23906a.f36621b;
        float f4 = e28VarM23906a.f36623d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM1112m & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo16613f(b78 b78Var, Object obj);
}
