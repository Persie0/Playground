package p000;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Binder;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.draw.C0296c;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.runtime.internal.C0282a;
import coil.size.Scale;
import com.facebook.AuthenticationToken;
import com.facebook.C0919x7a527f5c;
import com.lingq.core.database.entity.LibraryCounterEntity;
import com.lingq.core.network.api.result.ResultLibraryCounter;
import com.lingq.p020ui.C2889e;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONException;

/* JADX INFO: renamed from: is */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3122is {

    /* JADX INFO: renamed from: a */
    public static final i97 f44468a = new i97(null, new a97());

    /* JADX INFO: renamed from: b */
    public static final cc4 f44469b = new cc4(new s46(12));

    /* JADX INFO: renamed from: c */
    public static final StackTraceElement[] f44470c = new StackTraceElement[0];

    /* JADX INFO: renamed from: d */
    public static final Object f44471d = new Object();

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f44472e = 0;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f44473f = 0;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f44474g = 0;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f44475h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f44476i = 0;

    /* JADX INFO: renamed from: j */
    public static p04 f44477j;

    /* JADX INFO: renamed from: A */
    public static final void m14082A(C0797b4 c0797b4, C0423c c0423c) {
        e71 e71Var = (e71) AbstractC0422b.m1838a(c0423c.m1849k(), AbstractC0424d.f4999f);
        if (e71Var != null) {
            c0797b4.m3280k(C0006a4.m94b(e71Var.f36791a, e71Var.f36792b, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (AbstractC0422b.m1838a(c0423c.m1849k(), AbstractC0424d.f4998e) != null) {
            List listM1839j = C0423c.m1839j(4, c0423c);
            int size = listM1839j.size();
            for (int i = 0; i < size; i++) {
                C0423c c0423c2 = (C0423c) listM1839j.get(i);
                if (c0423c2.m1849k().f48471a.m17251c(AbstractC0424d.f4986J)) {
                    arrayList.add(c0423c2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zM14094h = m14094h(arrayList);
        c0797b4.m3280k(C0006a4.m94b(zM14094h ? 1 : arrayList.size(), zM14094h ? arrayList.size() : 1, 0));
    }

    /* JADX INFO: renamed from: B */
    public static void m14083B(AuthenticationToken authenticationToken) {
        nid nidVar = C3309ls.f50057g;
        C3309ls c3309ls = C3309ls.f50058h;
        boolean zEquals = true;
        char c = 1;
        if (c3309ls == null) {
            synchronized (nidVar) {
                c3309ls = C3309ls.f50058h;
                if (c3309ls == null) {
                    w41 w41VarM23706r = w41.m23706r(sy2.m21766a());
                    w41VarM23706r.getClass();
                    C3309ls c3309ls2 = new C3309ls(w41VarM23706r, new C3744x2(1), c == true ? 1 : 0);
                    C3309ls.f50058h = c3309ls2;
                    c3309ls = c3309ls2;
                }
            }
        }
        AuthenticationToken authenticationToken2 = (AuthenticationToken) c3309ls.f50066d;
        c3309ls.f50066d = authenticationToken;
        C3744x2 c3744x2 = (C3744x2) c3309ls.f50065c;
        if (authenticationToken != null) {
            try {
                c3744x2.f67655a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.m5179a().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            c3744x2.f67655a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            bna.m3911B(sy2.m21766a());
        }
        if (authenticationToken2 != null) {
            zEquals = authenticationToken2.equals(authenticationToken);
        } else if (authenticationToken != null) {
            zEquals = false;
        }
        if (zEquals) {
            return;
        }
        Intent intent = new Intent(sy2.m21766a(), (Class<?>) C0919x7a527f5c.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
        ((w41) c3309ls.f50064b).m23711E(intent);
    }

    /* JADX INFO: renamed from: C */
    public static final Bitmap.Config m14084C(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: D */
    public static final LibraryCounterEntity m14085D(ResultLibraryCounter resultLibraryCounter, int i, String str) {
        resultLibraryCounter.getClass();
        str.getClass();
        return new LibraryCounterEntity(i, str, resultLibraryCounter.f21213a, resultLibraryCounter.f21214b, resultLibraryCounter.f21215c, resultLibraryCounter.f21216d, resultLibraryCounter.f21217e, resultLibraryCounter.f21218f, resultLibraryCounter.f21219g, resultLibraryCounter.f21220h, resultLibraryCounter.f21221i, resultLibraryCounter.f21222j, resultLibraryCounter.f21223k, resultLibraryCounter.f21224l, resultLibraryCounter.f21225m, resultLibraryCounter.f21226n, resultLibraryCounter.f21227o, resultLibraryCounter.f21228p);
    }

    /* JADX INFO: renamed from: E */
    public static final void m14086E(List list, C3500qj c3500qj) {
        e67 e67Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        List list2 = list;
        C3500qj c3500qj2 = c3500qj;
        Path path = c3500qj2.f57839a;
        Path path2 = c3500qj2.f57839a;
        int i = path.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        c3500qj2.m19992i();
        c3500qj2.m19993j(i);
        e67 e67Var2 = list2.isEmpty() ? m57.f50613c : (e67) list2.get(0);
        int size = list2.size();
        float f9 = 0.0f;
        int i2 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (i2 < size) {
            e67 e67Var3 = (e67) list2.get(i2);
            if (e67Var3 instanceof m57) {
                path2.close();
                path2 = path2;
                size = size;
                f9 = f9;
                i2 = i2;
                e67Var = e67Var3;
                f10 = f14;
                f12 = f10;
                f11 = f15;
                f13 = f11;
            } else {
                if (e67Var3 instanceof y57) {
                    y57 y57Var = (y57) e67Var3;
                    float f16 = y57Var.f69322c;
                    f12 += f16;
                    float f17 = y57Var.f69323d;
                    f13 += f17;
                    path2.rMoveTo(f16, f17);
                    path2 = path2;
                    f14 = f12;
                    f15 = f13;
                } else if (e67Var3 instanceof q57) {
                    q57 q57Var = (q57) e67Var3;
                    float f18 = q57Var.f57294c;
                    float f19 = q57Var.f57295d;
                    c3500qj2.m19989f(f18, f19);
                    f13 = f19;
                    f15 = f13;
                    f12 = f18;
                    f14 = f12;
                } else if (e67Var3 instanceof x57) {
                    x57 x57Var = (x57) e67Var3;
                    float f20 = x57Var.f67783d;
                    float f21 = x57Var.f67782c;
                    path2.rLineTo(f21, f20);
                    f12 += f21;
                    f13 += f20;
                } else if (e67Var3 instanceof p57) {
                    p57 p57Var = (p57) e67Var3;
                    float f22 = p57Var.f55600d;
                    float f23 = p57Var.f55599c;
                    c3500qj2.m19988e(f23, f22);
                    f12 = f23;
                    f13 = f22;
                } else if (e67Var3 instanceof w57) {
                    float f24 = ((w57) e67Var3).f66427c;
                    path2.rLineTo(f24, f9);
                    f12 += f24;
                } else if (e67Var3 instanceof o57) {
                    float f25 = ((o57) e67Var3).f53866c;
                    c3500qj2.m19988e(f25, f13);
                    f12 = f25;
                } else {
                    if (e67Var3 instanceof c67) {
                        f8 = ((c67) e67Var3).f9637c;
                        path2.rLineTo(f9, f8);
                    } else if (e67Var3 instanceof d67) {
                        float f26 = ((d67) e67Var3).f35040c;
                        c3500qj2.m19988e(f12, f26);
                        f13 = f26;
                    } else if (e67Var3 instanceof v57) {
                        v57 v57Var = (v57) e67Var3;
                        path2.rCubicTo(v57Var.f64887c, v57Var.f64888d, v57Var.f64889e, v57Var.f64890f, v57Var.f64891g, v57Var.f64892h);
                        f10 = v57Var.f64889e + f12;
                        f11 = v57Var.f64890f + f13;
                        f12 += v57Var.f64891g;
                        f8 = v57Var.f64892h;
                    } else {
                        if (e67Var3 instanceof n57) {
                            n57 n57Var = (n57) e67Var3;
                            path2.cubicTo(n57Var.f52368c, n57Var.f52369d, n57Var.f52370e, n57Var.f52371f, n57Var.f52372g, n57Var.f52373h);
                            f10 = n57Var.f52370e;
                            f11 = n57Var.f52371f;
                            f4 = n57Var.f52372g;
                            f5 = n57Var.f52373h;
                        } else if (e67Var3 instanceof a67) {
                            if (e67Var2.f36761a) {
                                f7 = f13 - f11;
                                f6 = f12 - f10;
                            } else {
                                f6 = f9;
                                f7 = f6;
                            }
                            a67 a67Var = (a67) e67Var3;
                            path2.rCubicTo(f6, f7, a67Var.f293c, a67Var.f294d, a67Var.f295e, a67Var.f296f);
                            f10 = a67Var.f293c + f12;
                            f11 = a67Var.f294d + f13;
                            f12 += a67Var.f295e;
                            f8 = a67Var.f296f;
                        } else if (e67Var3 instanceof s57) {
                            if (e67Var2.f36761a) {
                                f12 = (f12 * 2.0f) - f10;
                                f13 = (2.0f * f13) - f11;
                            }
                            s57 s57Var = (s57) e67Var3;
                            path2.cubicTo(f12, f13, s57Var.f60383c, s57Var.f60384d, s57Var.f60385e, s57Var.f60386f);
                            f10 = s57Var.f60383c;
                            f11 = s57Var.f60384d;
                            f4 = s57Var.f60385e;
                            f5 = s57Var.f60386f;
                        } else if (e67Var3 instanceof z57) {
                            z57 z57Var = (z57) e67Var3;
                            float f27 = z57Var.f70956f;
                            float f28 = z57Var.f70955e;
                            float f29 = z57Var.f70954d;
                            float f30 = z57Var.f70953c;
                            path2.rQuadTo(f30, f29, f28, f27);
                            float f31 = f30 + f12;
                            float f32 = f29 + f13;
                            f12 += f28;
                            f13 += f27;
                            f10 = f31;
                            f11 = f32;
                        } else {
                            if (e67Var3 instanceof r57) {
                                r57 r57Var = (r57) e67Var3;
                                float f33 = r57Var.f58770f;
                                float f34 = r57Var.f58769e;
                                float f35 = r57Var.f58768d;
                                f3 = r57Var.f58767c;
                                path2.quadTo(f3, f35, f34, f33);
                                f13 = f33;
                                f12 = f34;
                                f11 = f35;
                            } else if (e67Var3 instanceof b67) {
                                if (e67Var2.f36762b) {
                                    f = f12 - f10;
                                    f2 = f13 - f11;
                                } else {
                                    f = f9;
                                    f2 = f;
                                }
                                b67 b67Var = (b67) e67Var3;
                                float f36 = b67Var.f8017d;
                                float f37 = b67Var.f8016c;
                                path2.rQuadTo(f, f2, f37, f36);
                                f3 = f + f12;
                                float f38 = f2 + f13;
                                f12 += f37;
                                f13 += f36;
                                f11 = f38;
                            } else if (e67Var3 instanceof t57) {
                                if (e67Var2.f36762b) {
                                    f12 = (f12 * 2.0f) - f10;
                                    f13 = (2.0f * f13) - f11;
                                }
                                t57 t57Var = (t57) e67Var3;
                                float f39 = t57Var.f61879d;
                                float f40 = t57Var.f61878c;
                                path2.quadTo(f12, f13, f40, f39);
                                path2 = path2;
                                size = size;
                                f9 = f9;
                                i2 = i2;
                                f11 = f13;
                                e67Var = e67Var3;
                                f13 = f39;
                                f10 = f12;
                                f12 = f40;
                            } else if (e67Var3 instanceof u57) {
                                u57 u57Var = (u57) e67Var3;
                                float f41 = u57Var.f63446h + f12;
                                float f42 = u57Var.f63447i + f13;
                                size = size;
                                f9 = 0.0f;
                                path2 = path2;
                                i2 = i2;
                                m14101o(c3500qj, f12, f13, f41, f42, u57Var.f63441c, u57Var.f63442d, u57Var.f63443e, u57Var.f63444f, u57Var.f63445g);
                                f10 = f41;
                                f12 = f10;
                                f11 = f42;
                                f13 = f11;
                                e67Var = e67Var3;
                            } else {
                                path2 = path2;
                                size = size;
                                f9 = f9;
                                i2 = i2;
                                if (!(e67Var3 instanceof l57)) {
                                    gm5.m12750e();
                                    return;
                                }
                                l57 l57Var = (l57) e67Var3;
                                float f43 = l57Var.f49091i;
                                float f44 = l57Var.f49090h;
                                e67Var = e67Var3;
                                m14101o(c3500qj, f12, f13, f44, f43, l57Var.f49085c, l57Var.f49086d, l57Var.f49087e, l57Var.f49088f, l57Var.f49089g);
                                f11 = f43;
                                f13 = f11;
                                f10 = f44;
                                f12 = f10;
                            }
                            size = size;
                            f9 = f9;
                            i2 = i2;
                            e67Var = e67Var3;
                            f10 = f3;
                        }
                        f13 = f5;
                        f12 = f4;
                    }
                    f13 += f8;
                }
                e67Var = e67Var3;
            }
            i2++;
            list2 = list;
            c3500qj2 = c3500qj;
            size = size;
            path2 = path2;
            e67Var2 = e67Var;
            f9 = f9;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m14087a(C0205f c0205f, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2080741862);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(c0205f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            fa4.m11640a(c0205f, c0282a, tj3Var, i2 & 126);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new kb1(c0205f, c0282a, i, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static x78 m14088b(int i, bc3 bc3Var, int i2) {
        return new x78(i, bc3Var, (i2 & 4) != 0 ? 0 : 1, new zb3(new yb3[0]));
    }

    /* JADX INFO: renamed from: c */
    public static final void m14089c(C2889e c2889e, hm5 hm5Var, h24 h24Var, ye1 ye1Var, int i) {
        c2889e.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-834019915);
        int i2 = (tj3Var.m22124i(c2889e) ? 4 : 2) | i | (tj3Var.m22124i(hm5Var) ? 32 : 16) | (tj3Var.m22124i(h24Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            AbstractC0054a.m729d(h24Var != null, null, AbstractC0070i.m778m(null, 3), AbstractC0070i.m780o(null, 3).m20180a(AbstractC0070i.m773h(null, 3)), null, ci8.m4703P(-2042275187, new zt4(h24Var, c2889e, context, hm5Var, 1), tj3Var), tj3Var, 200064, 18);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new di0(i, 7, c2889e, hm5Var, h24Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m14090d(final e16 e16Var, final float f, final float f2, final float f3, final boolean z, final long j, final long j2, final long j3, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1449127485);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22114d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22114d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22114d(f3) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= tj3Var2.m22122h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= tj3Var2.m22118f(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= tj3Var2.m22118f(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= tj3Var2.m22118f(j3) ? 67108864 : 33554432;
        }
        if (tj3Var2.m22099R(i3 & 1, (38347923 & i3) != 38347922)) {
            int i4 = i3;
            final float fFloatValue = (((Number) AbstractC0060b.m750b(f, null, "indicator progress", null, tj3Var2, ((i3 >> 3) & 14) | 3072, 22).getValue()).floatValue() / f2) * 360.0f;
            List listM23605K = z ? vz1.m23605K(new aa1(d32.m10037f(4290551918L)), new aa1(d32.m10037f(4294895290L)), new aa1(d32.m10037f(4290617712L)), new aa1(d32.m10037f(4294959531L)), new aa1(d32.m10037f(4290486125L)), new aa1(d32.m10037f(4294960566L)), new aa1(d32.m10037f(4290617712L)), new aa1(d32.m10037f(4294958497L)), new aa1(d32.m10037f(4290551918L))) : vz1.m23605K(new aa1(d32.m10037f(4293322470L)), new aa1(d32.m10037f(4290690750L)), new aa1(d32.m10037f(4292467161L)), new aa1(d32.m10037f(4294111986L)), new aa1(d32.m10037f(4291085508L)), new aa1(d32.m10037f(4289309097L)), new aa1(d32.m10037f(4294046193L)), new aa1(d32.m10037f(4294967295L)), new aa1(d32.m10037f(4291019715L)), new aa1(d32.m10037f(4294572537L)), new aa1(d32.m10037f(4293322470L)));
            e16 e16VarM21607T = AbstractC3584sr.m21607T(te1.m21995i(1.0f, e16Var, false), f3);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            boolean zM22124i = tj3Var2.m22124i(listM23605K) | ((3670016 & i4) == 1048576) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((29360128 & i4) == 8388608) | tj3Var2.m22114d(fFloatValue) | ((234881024 & i4) == 67108864);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                final List list = listM23605K;
                tj3Var = tj3Var2;
                vi3 vi3Var = new vi3() { // from class: jj9
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        C0296c c0296c = (C0296c) obj;
                        c0296c.getClass();
                        ui0 ui0Var = vi0.Companion;
                        long jFloatToRawIntBits = Float.floatToRawIntBits(0.5f);
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.5f);
                        ui0Var.getClass();
                        final oo9 oo9Var = new oo9((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), list, null);
                        final long j4 = j;
                        final float f4 = f3;
                        final long j5 = j2;
                        final float f5 = fFloatValue;
                        final long j6 = j3;
                        return c0296c.m1349c(new vi3(j4, f4, oo9Var, j5, f5, j6) { // from class: lj9

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ long f49744a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ float f49745b;

                            /* JADX INFO: renamed from: c */
                            public final /* synthetic */ long f49746c;

                            /* JADX INFO: renamed from: d */
                            public final /* synthetic */ float f49747d;

                            /* JADX INFO: renamed from: e */
                            public final /* synthetic */ long f49748e;

                            {
                                this.f49746c = j5;
                                this.f49747d = f5;
                                this.f49748e = j6;
                            }

                            @Override // p000.vi3
                            public final Object invoke(Object obj2) {
                                C0358h c0358h = (C0358h) obj2;
                                c0358h.getClass();
                                float f6 = this.f49745b;
                                InterfaceC0310a.m1419t0(c0358h, this.f49744a, 0.0f, 360.0f, 0L, 0L, 0.0f, new el9(c0358h.mo912g0(f6), 0.0f, 0, 0, 30), 880);
                                pd9 pd9Var = new pd9(this.f49746c);
                                el9 el9Var = new el9(c0358h.mo912g0(f6), 0.0f, 0, 0, 30);
                                an0 an0Var = c0358h.f4358a;
                                long jM1415X = InterfaceC0310a.m1415X(an0Var.mo1422h(), 0L);
                                an0Var.f852a.f71736c.mo17013e(Float.intBitsToFloat(0), Float.intBitsToFloat(0), Float.intBitsToFloat((int) (jM1415X >> 32)) + Float.intBitsToFloat(0), Float.intBitsToFloat((int) (jM1415X & 4294967295L)) + Float.intBitsToFloat(0), 270.0f, this.f49747d, an0Var.m595c(pd9Var, el9Var, 1.0f, null, 3, 1));
                                InterfaceC0310a.m1417c0(c0358h, this.f49748e, (x89.m24406c(an0Var.mo1422h()) / 2.0f) - (c0358h.mo912g0(f6) / 2.0f), 0L, 0.0f, null, 124);
                                return xfa.f68157a;
                            }
                        });
                    }
                };
                tj3Var.m22131l0(vi3Var);
                objM22097O = vi3Var;
            } else {
                tj3Var = tj3Var2;
            }
            thb.m22044c(tj3Var, vz1.m23655y(e16VarM4411d, (vi3) objM22097O));
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: kj9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC3122is.m14090d(e16Var, f, f2, f3, z, j, j2, j3, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m14091e(pe9 pe9Var) {
        int i = pe9Var.f56016d;
        int[] iArr = pe9Var.f56014b;
        Object[] objArr = pe9Var.f56015c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f44471d) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        pe9Var.f56013a = false;
        pe9Var.f56016d = i2;
    }

    /* JADX INFO: renamed from: f */
    public static e16 m14092f(e16 e16Var, bg9 bg9Var, int i) {
        if ((i & 1) != 0) {
            Map map = jwa.f46325a;
            bg9Var = ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1);
        }
        return pb1.m19046p(e16Var).mo3161g(new y89(bg9Var));
    }

    /* JADX INFO: renamed from: g */
    public static final Bitmap m14093g(C3185ki c3185ki) {
        if (c3185ki instanceof C3185ki) {
            return c3185ki.f47311a;
        }
        C3386nv.m17636w("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m14094h(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = EmptyList.f47638a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    C0423c c0423c = (C0423c) obj2;
                    C0423c c0423c2 = (C0423c) obj;
                    arrayList2.add(new gq6((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c0423c2.m1846g().m10803d() >> 32)) - Float.intBitsToFloat((int) (c0423c.m1846g().m10803d() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c0423c2.m1846g().m10803d() & 4294967295L)) - Float.intBitsToFloat((int) (c0423c.m1846g().m10803d() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((gq6) u91.m22589G0(list)).f41189a;
            } else {
                if (list.isEmpty()) {
                    hg5.m13231c("Empty collection can't be reduced.");
                }
                Object objM22589G0 = u91.m22589G0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objM22589G0 = new gq6(gq6.m12825f(((gq6) objM22589G0).f41189a, ((gq6) list.get(i2)).f41189a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((gq6) objM22589G0).f41189a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003e A[RETURN] */
    /* JADX INFO: renamed from: i */
    public static final int m14095i(ik8 ik8Var, String str) {
        ik8Var.getClass();
        int columnCount = ik8Var.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(ik8Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strM22986i = ux5.m22986i('`', "`", str);
        int columnCount2 = ik8Var.getColumnCount();
        while (i < columnCount2) {
            if (strM22986i.equals(ik8Var.getColumnName(i))) {
                if (i >= 0) {
                    return i;
                }
                return -1;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static qr3 m14096j(qr3 qr3Var, qr3 qr3Var2) {
        or3 or3Var = new or3(0);
        int size = qr3Var.size();
        for (int i = 0; i < size; i++) {
            String strM20122f = qr3Var.m20122f(i);
            String strM20124h = qr3Var.m20124h(i);
            if ((!"Warning".equalsIgnoreCase(strM20122f) || !cl9.m4842Y(strM20124h, "1", false)) && ("Content-Length".equalsIgnoreCase(strM20122f) || "Content-Encoding".equalsIgnoreCase(strM20122f) || "Content-Type".equalsIgnoreCase(strM20122f) || !m14112z(strM20122f) || qr3Var2.m20121d(strM20122f) == null)) {
                or3Var.m18308v(strM20122f, strM20124h);
            }
        }
        int size2 = qr3Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String strM20122f2 = qr3Var2.m20122f(i2);
            if (!"Content-Length".equalsIgnoreCase(strM20122f2) && !"Content-Encoding".equalsIgnoreCase(strM20122f2) && !"Content-Type".equalsIgnoreCase(strM20122f2) && m14112z(strM20122f2)) {
                or3Var.m18308v(strM20122f2, qr3Var2.m20124h(i2));
            }
        }
        return or3Var.m18309w();
    }

    /* JADX INFO: renamed from: k */
    public static Drawable m14097k(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: l */
    public static final double m14098l(int i, int i2, int i3, int i4, Scale scale) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int i5 = j32.f45001a[scale.ordinal()];
        if (i5 == 1) {
            return Math.max(d, d2);
        }
        if (i5 == 2) {
            return Math.min(d, d2);
        }
        gm5.m12750e();
        return 0.0d;
    }

    /* JADX INFO: renamed from: m */
    public static hc1 m14099m(String str, String str2) {
        u40 u40Var = new u40(str, str2);
        gc1 gc1VarM13189b = hc1.m13189b(u40.class);
        gc1VarM13189b.f40519e = 1;
        gc1VarM13189b.f40520f = new fc1(u40Var, 0);
        return gc1VarM13189b.m12472b();
    }

    /* JADX INFO: renamed from: n */
    public static Drawable m14100n(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: o */
    public static final void m14101o(C3500qj c3500qj, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m14101o(c3500qj, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            c3500qj.f57839a.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            dSin2 = dSin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    /* JADX INFO: renamed from: p */
    public static hc1 m14102p(String str, ho2 ho2Var) {
        gc1 gc1VarM13189b = hc1.m13189b(u40.class);
        gc1VarM13189b.f40519e = 1;
        gc1VarM13189b.m12471a(lb2.m16059c(Context.class));
        gc1VarM13189b.f40520f = new r41(str, 5, ho2Var);
        return gc1VarM13189b.m12472b();
    }

    /* JADX INFO: renamed from: q */
    public static xv5 m14103q(String str) {
        str.getClass();
        dr5 dr5VarM15425d = xv5.f68845e.m15425d(0, str);
        if (dr5VarM15425d == null) {
            C3386nv.m17626m(ux5.m22986i('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((br5) dr5VarM15425d.m10610a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((br5) dr5VarM15425d.m10610a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = dr5VarM15425d.m10611b().f40380b;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new xv5(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            dr5 dr5VarM15425d2 = xv5.f68846f.m15425d(i2, str);
            if (dr5VarM15425d2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            cr5 cr5Var = dr5VarM15425d2.f36079c;
            uq5 uq5VarM9865f = cr5Var.m9865f(1);
            String str3 = uq5VarM9865f != null ? uq5VarM9865f.f64214a : null;
            if (str3 == null) {
                i = dr5VarM15425d2.m10611b().f40380b;
            } else {
                uq5 uq5VarM9865f2 = cr5Var.m9865f(2);
                String strM24112h = uq5VarM9865f2 != null ? uq5VarM9865f2.f64214a : null;
                if (strM24112h == null) {
                    uq5 uq5VarM9865f3 = cr5Var.m9865f(3);
                    uq5VarM9865f3.getClass();
                    strM24112h = uq5VarM9865f3.f64214a;
                } else if (strM24112h.length() > 0 && ci8.m4732q(strM24112h.charAt(0), '\'', false) && vk9.m23382e0(strM24112h, '\'') && strM24112h.length() > 2) {
                    strM24112h = wq1.m24112h(1, strM24112h, 1);
                }
                arrayList.add(str3);
                arrayList.add(strM24112h);
                i = dr5VarM15425d2.m10611b().f40380b;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static final int m14104r(Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    i = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
                }
                return height * i;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: s */
    public static final float m14105s(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX INFO: renamed from: t */
    public static int[] m14106t(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: u */
    public static ColorStateList m14107u(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final int m14108v(ik8 ik8Var, String str) {
        ik8Var.getClass();
        int iM14095i = m14095i(ik8Var, str);
        if (iM14095i >= 0) {
            return iM14095i;
        }
        int columnCount = ik8Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(ik8Var.getColumnName(i));
        }
        C3386nv.m17622h(93, str, "' does not exist. Available columns: [", u91.m22596N0(arrayList, null, null, null, null, 63), "Column '");
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static final p04 m14109w() {
        p04 p04Var = f44477j;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(19.5f, 12.0f);
        f57VarM17730e.m11548c(0.0f, -0.23f, -0.01f, -0.45f, -0.03f, -0.68f);
        f57VarM17730e.m11552g(1.86f, -1.41f);
        f57VarM17730e.m11548c(0.4f, -0.3f, 0.51f, -0.86f, 0.26f, -1.3f);
        f57VarM17730e.m11552g(-1.87f, -3.23f);
        f57VarM17730e.m11548c(-0.25f, -0.44f, -0.79f, -0.62f, -1.25f, -0.42f);
        f57VarM17730e.m11552g(-2.15f, 0.91f);
        f57VarM17730e.m11548c(-0.37f, -0.26f, -0.76f, -0.49f, -1.17f, -0.68f);
        f57VarM17730e.m11552g(-0.29f, -2.31f);
        f57VarM17730e.m11547b(14.8f, 2.38f, 14.37f, 2.0f, 13.87f, 2.0f);
        f57VarM17730e.m11550e(-3.73f);
        f57VarM17730e.m11547b(9.63f, 2.0f, 9.2f, 2.38f, 9.14f, 2.88f);
        f57VarM17730e.m11551f(8.85f, 5.19f);
        f57VarM17730e.m11548c(-0.41f, 0.19f, -0.8f, 0.42f, -1.17f, 0.68f);
        f57VarM17730e.m11551f(5.53f, 4.96f);
        f57VarM17730e.m11548c(-0.46f, -0.2f, -1.0f, -0.02f, -1.25f, 0.42f);
        f57VarM17730e.m11551f(2.41f, 8.62f);
        f57VarM17730e.m11548c(-0.25f, 0.44f, -0.14f, 0.99f, 0.26f, 1.3f);
        f57VarM17730e.m11552g(1.86f, 1.41f);
        f57VarM17730e.m11547b(4.51f, 11.55f, 4.5f, 11.77f, 4.5f, 12.0f);
        f57VarM17730e.m11555j(0.01f, 0.45f, 0.03f, 0.68f);
        f57VarM17730e.m11552g(-1.86f, 1.41f);
        f57VarM17730e.m11548c(-0.4f, 0.3f, -0.51f, 0.86f, -0.26f, 1.3f);
        f57VarM17730e.m11552g(1.87f, 3.23f);
        f57VarM17730e.m11548c(0.25f, 0.44f, 0.79f, 0.62f, 1.25f, 0.42f);
        f57VarM17730e.m11552g(2.15f, -0.91f);
        f57VarM17730e.m11548c(0.37f, 0.26f, 0.76f, 0.49f, 1.17f, 0.68f);
        f57VarM17730e.m11552g(0.29f, 2.31f);
        f57VarM17730e.m11547b(9.2f, 21.62f, 9.63f, 22.0f, 10.13f, 22.0f);
        f57VarM17730e.m11550e(3.73f);
        f57VarM17730e.m11548c(0.5f, 0.0f, 0.93f, -0.38f, 0.99f, -0.88f);
        f57VarM17730e.m11552g(0.29f, -2.31f);
        f57VarM17730e.m11548c(0.41f, -0.19f, 0.8f, -0.42f, 1.17f, -0.68f);
        f57VarM17730e.m11552g(2.15f, 0.91f);
        f57VarM17730e.m11548c(0.46f, 0.2f, 1.0f, 0.02f, 1.25f, -0.42f);
        f57VarM17730e.m11552g(1.87f, -3.23f);
        f57VarM17730e.m11548c(0.25f, -0.44f, 0.14f, -0.99f, -0.26f, -1.3f);
        f57VarM17730e.m11552g(-1.86f, -1.41f);
        f57VarM17730e.m11547b(19.49f, 12.45f, 19.5f, 12.23f, 19.5f, 12.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(12.04f, 15.5f);
        f57VarM17730e.m11548c(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        f57VarM17730e.m11555j(1.57f, -3.5f, 3.5f, -3.5f);
        f57VarM17730e.m11555j(3.5f, 1.57f, 3.5f, 3.5f);
        f57VarM17730e.m11554i(13.97f, 15.5f, 12.04f, 15.5f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f44477j = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    /* JADX INFO: renamed from: x */
    public static final int m14110x(pw9 pw9Var, Layout layout, w41 w41Var, int i, RectF rectF, bu8 bu8Var, C3186kj c3186kj, boolean z) {
        dq4[] dq4VarArr;
        dq4[] dq4VarArr2;
        int i2;
        int iMo3853i;
        int i3;
        int i4;
        int iMo3850f;
        Bidi bidiCreateLineBidi;
        float fM14683a;
        float fM14683a2;
        float fM14683a3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = pw9Var.f56919f;
        int lineStart2 = layout2.getLineStart(i);
        int iM19549f = pw9Var.m19549f(i);
        if (i5 < (iM19549f - lineStart2) * 2) {
            j54.m14288a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        jv3 jv3Var = new jv3(pw9Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iM19549f) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fM14683a = jv3Var.m14683a(lineStart2, z2, z2, true);
                fM14683a3 = jv3Var.m14683a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fM14683a3 = jv3Var.m14683a(lineStart2, false, false, false);
                fM14683a = jv3Var.m14683a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fM14683a2 = jv3Var.m14683a(lineStart2, false, false, true);
                    fM14683a = jv3Var.m14683a(lineStart2 + 1, true, true, true);
                } else {
                    fM14683a = jv3Var.m14683a(lineStart2, false, false, false);
                    fM14683a2 = jv3Var.m14683a(lineStart2 + 1, true, true, false);
                }
                fM14683a3 = fM14683a2;
            }
            fArr[i6] = fM14683a;
            fArr[i6 + 1] = fM14683a3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) w41Var.f66365a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iM23730s = w41Var.m23730s(lineStart3, false);
        int iM23731t = w41Var.m23731t(iM23730s);
        int i7 = lineStart3 - iM23731t;
        int i8 = lineEnd2 - iM23731t;
        Bidi bidiM23724k = w41Var.m23724k(iM23730s);
        if (bidiM23724k == null || (bidiCreateLineBidi = bidiM23724k.createLineBidi(i7, i8)) == null) {
            dq4VarArr = new dq4[]{new dq4(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            dq4VarArr = new dq4[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                dq4VarArr[i9] = new dq4(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        g84 i84Var = z ? new i84(0, dq4VarArr.length - 1, 1) : new g84(dq4VarArr.length - 1, 0, -1);
        int i11 = i84Var.f40379a;
        int i12 = i84Var.f40380b;
        int i13 = i84Var.f40381c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            dq4 dq4Var = dq4VarArr[i11];
            boolean z4 = dq4Var.f36023c;
            int iMo3845a = dq4Var.f36021a;
            int iMo3846b = dq4Var.f36022b;
            float f = z4 ? fArr[((iMo3846b - 1) - lineStart) * 2] : fArr[(iMo3845a - lineStart) * 2];
            float fM14105s = z4 ? m14105s(iMo3845a, lineStart, fArr) : m14105s(iMo3846b - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                dq4VarArr2 = dq4VarArr;
                if (fM14105s < f2) {
                    iMo3846b = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fM14105s) && (!z4 || f2 > f)) {
                        int i15 = iMo3846b;
                        int i16 = iMo3845a;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iMo3846b - 1;
                    }
                    int iMo3850f2 = bu8Var.mo3850f(i2 + 1);
                    if (iMo3850f2 == -1 || (iMo3853i = bu8Var.mo3853i(iMo3850f2)) <= iMo3845a) {
                        iMo3846b = -1;
                        break;
                    }
                    if (iMo3850f2 < iMo3845a) {
                        iMo3850f2 = iMo3845a;
                    }
                    if (iMo3853i <= iMo3846b) {
                        iMo3846b = iMo3853i;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iMo3850f3 = iMo3850f2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iMo3846b - 1) - lineStart) * 2] : fArr[(iMo3850f3 - lineStart) * 2];
                        rectF2.right = z4 ? m14105s(iMo3850f3, lineStart, fArr) : m14105s(iMo3846b - 1, lineStart, fArr);
                        if (((Boolean) c3186kj.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iMo3846b = bu8Var.mo3846b(iMo3846b);
                        if (iMo3846b == -1 || iMo3846b <= iMo3845a) {
                            iMo3846b = -1;
                            break;
                        }
                        iMo3850f3 = bu8Var.mo3850f(iMo3846b);
                        if (iMo3850f3 < iMo3845a) {
                            iMo3850f3 = iMo3845a;
                        }
                    }
                } else {
                    iMo3846b = -1;
                    break;
                }
                iMo3845a = iMo3846b;
            } else {
                if (fM14105s < f2) {
                    dq4VarArr2 = dq4VarArr;
                    iMo3845a = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fM14105s)) {
                        int i19 = iMo3846b;
                        int i20 = iMo3845a;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iMo3845a;
                    }
                    int iMo3853i2 = bu8Var.mo3853i(i4);
                    if (iMo3853i2 != -1 && (iMo3850f = bu8Var.mo3850f(iMo3853i2)) < iMo3846b) {
                        if (iMo3850f >= iMo3845a) {
                            iMo3845a = iMo3850f;
                        }
                        if (iMo3853i2 > iMo3846b) {
                            iMo3853i2 = iMo3846b;
                        }
                        dq4VarArr2 = dq4VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iMo3853i3 = iMo3853i2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iMo3853i3 - 1) - lineStart) * 2] : fArr[(iMo3845a - lineStart) * 2];
                            rectF3.right = z4 ? m14105s(iMo3845a, lineStart, fArr) : m14105s(iMo3853i3 - 1, lineStart, fArr);
                            if (((Boolean) c3186kj.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iMo3845a = bu8Var.mo3845a(iMo3845a);
                            if (iMo3845a != -1 && iMo3845a < iMo3846b) {
                                iMo3853i3 = bu8Var.mo3853i(iMo3845a);
                                if (iMo3853i3 > iMo3846b) {
                                    iMo3853i3 = iMo3846b;
                                }
                            }
                        }
                    } else {
                        dq4VarArr2 = dq4VarArr;
                    }
                    iMo3845a = -1;
                    break;
                } else {
                    dq4VarArr2 = dq4VarArr;
                    iMo3845a = -1;
                    break;
                }
            }
            if (iMo3845a >= 0) {
                return iMo3845a;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            dq4VarArr = dq4VarArr2;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m14111y(final Context context) {
        final boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (AbstractC3352my.m17087F(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        final wr9 wr9Var = new wr9();
        new Runnable() { // from class: vo7
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                wr9 wr9Var2 = wr9Var;
                try {
                    if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        return;
                    }
                    SharedPreferences.Editor editorEdit = AbstractC3352my.m17087F(context2).edit();
                    editorEdit.putBoolean("proxy_notification_initialized", true);
                    editorEdit.apply();
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                    if (z) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } finally {
                    wr9Var2.m24140d(null);
                }
            }
        }.run();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m14112z(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
