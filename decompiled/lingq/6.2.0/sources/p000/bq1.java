package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.material3.C0233h;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.draw.C0296c;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.window.AbstractC0456d;
import androidx.compose.p002ui.window.SecureFlagPolicy;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.theme.ReaderFont;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DispatchException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class bq1 implements Decoder, df1 {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f8849H = 0;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ int f8850I = 0;

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ int f8851J = 0;

    /* JADX INFO: renamed from: b */
    public static ExecutorService f8853b;

    /* JADX INFO: renamed from: e */
    public static final C3724wj f8856e;

    /* JADX INFO: renamed from: f */
    public static final C3724wj f8857f;

    /* JADX INFO: renamed from: g */
    public static final Object f8858g;

    /* JADX INFO: renamed from: h */
    public static ny8 f8859h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f8860i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f8861j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f8862k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f8863l = 0;

    /* JADX INFO: renamed from: a */
    public static final Object f8852a = new Object();

    /* JADX INFO: renamed from: c */
    public static final ib2 f8854c = new ib2(1.0f, 1.0f);

    /* JADX INFO: renamed from: d */
    public static final C3724wj f8855d = new C3724wj(DescriptorProtos.Edition.EDITION_2023_VALUE);

    static {
        new C3724wj(1007);
        f8856e = new C3724wj(1008);
        f8857f = new C3724wj(1002);
        f8858g = new Object();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0131  */
    /* JADX WARN: Code duplicated, block: B:115:0x0137  */
    /* JADX WARN: Code duplicated, block: B:116:0x0140  */
    /* JADX WARN: Code duplicated, block: B:119:0x0145  */
    /* JADX WARN: Code duplicated, block: B:122:0x0150  */
    /* JADX WARN: Code duplicated, block: B:124:0x015b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0172  */
    /* JADX WARN: Code duplicated, block: B:131:0x017f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0183  */
    /* JADX WARN: Code duplicated, block: B:135:0x0188  */
    /* JADX WARN: Code duplicated, block: B:137:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00db  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    /* JADX INFO: renamed from: N */
    public static final void m4038N(ui3 ui3Var, e16 e16Var, boolean z, o39 o39Var, mn0 mn0Var, C0233h c0233h, vf0 vf0Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        boolean z2;
        o39 o39Var2;
        mn0 mn0VarM21998l;
        C0233h c0233h2;
        int i4;
        vf0 vf0Var2;
        int i5;
        int i6;
        boolean z3;
        vf0 vf0Var3;
        tj3 tj3Var;
        C0233h c0233h3;
        x18 x18VarM22143u;
        o39 o39VarM24271b;
        C0233h c0233hM22000n;
        o39 o39Var3;
        vf0 vf0Var4;
        boolean z4;
        C0233h c0233h4;
        Object objM22097O;
        long j;
        long j2;
        int i7;
        C0233h c0233h5;
        int i8;
        C0233h c0233h6;
        C0233h c0233h7;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(2136075085);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= tj3Var2.m22122h(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    o39Var2 = o39Var;
                    int i10 = tj3Var2.m22120g(o39Var2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    o39Var2 = o39Var;
                }
                i3 |= i10;
            } else {
                o39Var2 = o39Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    mn0VarM21998l = mn0Var;
                    int i11 = tj3Var2.m22120g(mn0VarM21998l) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    mn0VarM21998l = mn0Var;
                }
                i3 |= i11;
            } else {
                mn0VarM21998l = mn0Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    c0233h7 = c0233h;
                    if (tj3Var2.m22120g(c0233h7)) {
                        c0233h5 = c0233h7;
                        i8 = 131072;
                        c0233h6 = c0233h7;
                    }
                    i3 |= i8;
                    c0233h2 = c0233h6;
                } else {
                    c0233h5 = c0233h;
                }
                c0233h5 = c0233h7;
                i8 = 65536;
                c0233h6 = c0233h5;
                i3 |= i8;
                c0233h2 = c0233h6;
            } else {
                c0233h2 = c0233h;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    vf0Var2 = vf0Var;
                    if (tj3Var2.m22120g(vf0Var2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (tj3Var2.m22120g(null)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i3 |= i6;
                }
                if ((100663296 & i) == 0) {
                    if (tj3Var2.m22124i(c0282a)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                if ((38347923 & i3) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i3 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0 || tj3Var2.m22084B()) {
                        boolean z5 = i9 == 0 ? z2 : true;
                        if ((i2 & 8) != 0) {
                            o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                            i3 &= -7169;
                        } else {
                            o39VarM24271b = o39Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            mn0VarM21998l = te1.m21998l(tj3Var2);
                        }
                        c0233hM22000n = c0233h2;
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            c0233hM22000n = te1.m22000n(63, 0.0f);
                        }
                        if (i4 != 0) {
                            vf0Var2 = null;
                        }
                        o39Var3 = o39VarM24271b;
                        vf0Var4 = vf0Var2;
                        z4 = z5;
                        c0233h4 = c0233hM22000n;
                    } else {
                        tj3Var2.m22102U();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        o39Var3 = o39Var2;
                        vf0Var4 = vf0Var2;
                        z4 = z2;
                        c0233h4 = c0233h2;
                    }
                    tj3Var2.m22140r();
                    tj3Var2.m22111b0(1577873102);
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56 v56Var = (v56) objM22097O;
                    tj3Var2.m22139q(false);
                    if (z4) {
                        j = mn0VarM21998l.f51546a;
                    } else {
                        j = mn0VarM21998l.f51548c;
                    }
                    long j3 = j;
                    if (z4) {
                        j2 = mn0VarM21998l.f51547b;
                    } else {
                        j2 = mn0VarM21998l.f51549d;
                    }
                    tj3 tj3Var3 = tj3Var2;
                    ho9.m13415b(ui3Var, e16Var, z4, o39Var3, j3, j2, 0.0f, ((xj2) c0233h4.m1157a(z4, v56Var, tj3Var2, ((i3 >> 6) & 14) | ((i3 >> 9) & 896)).getValue()).f68285a, vf0Var4, v56Var, ci8.m4703P(-1347531112, new zn0(c0282a, 0), tj3Var2), tj3Var3, (i3 & 8190) | ((i3 << 6) & 234881024), 64);
                    z2 = z4;
                    o39Var2 = o39Var3;
                    vf0Var3 = vf0Var4;
                    c0233h3 = c0233h4;
                    tj3Var = tj3Var3;
                } else {
                    tj3 tj3Var4 = tj3Var2;
                    tj3Var4.m22102U();
                    vf0Var3 = vf0Var2;
                    c0233h3 = c0233h2;
                    tj3Var = tj3Var4;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var2, mn0VarM21998l, c0233h3, vf0Var3, c0282a, i, i2, 1);
                }
            }
            i3 |= 1572864;
            vf0Var2 = vf0Var;
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (tj3Var2.m22120g(null)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
            if ((100663296 & i) == 0) {
                if (tj3Var2.m22124i(c0282a)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((38347923 & i3) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i3 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                        i3 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        mn0VarM21998l = te1.m21998l(tj3Var2);
                    }
                    c0233hM22000n = c0233h2;
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c0233hM22000n = te1.m22000n(63, 0.0f);
                    }
                    if (i4 != 0) {
                        vf0Var2 = null;
                    }
                    o39Var3 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                    z4 = z5;
                    c0233h4 = c0233hM22000n;
                } else {
                    if (i9 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                        i3 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        mn0VarM21998l = te1.m21998l(tj3Var2);
                    }
                    c0233hM22000n = c0233h2;
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c0233hM22000n = te1.m22000n(63, 0.0f);
                    }
                    if (i4 != 0) {
                        vf0Var2 = null;
                    }
                    o39Var3 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                    z4 = z5;
                    c0233h4 = c0233hM22000n;
                }
                tj3Var2.m22140r();
                tj3Var2.m22111b0(1577873102);
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56 v56Var2 = (v56) objM22097O;
                tj3Var2.m22139q(false);
                if (z4) {
                    j = mn0VarM21998l.f51546a;
                } else {
                    j = mn0VarM21998l.f51548c;
                }
                long j4 = j;
                if (z4) {
                    j2 = mn0VarM21998l.f51547b;
                } else {
                    j2 = mn0VarM21998l.f51549d;
                }
                tj3 tj3Var5 = tj3Var2;
                ho9.m13415b(ui3Var, e16Var, z4, o39Var3, j4, j2, 0.0f, ((xj2) c0233h4.m1157a(z4, v56Var2, tj3Var2, ((i3 >> 6) & 14) | ((i3 >> 9) & 896)).getValue()).f68285a, vf0Var4, v56Var2, ci8.m4703P(-1347531112, new zn0(c0282a, 0), tj3Var2), tj3Var5, (i3 & 8190) | ((i3 << 6) & 234881024), 64);
                z2 = z4;
                o39Var2 = o39Var3;
                vf0Var3 = vf0Var4;
                c0233h3 = c0233h4;
                tj3Var = tj3Var5;
            } else {
                tj3 tj3Var6 = tj3Var2;
                tj3Var6.m22102U();
                vf0Var3 = vf0Var2;
                c0233h3 = c0233h2;
                tj3Var = tj3Var6;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var2, mn0VarM21998l, c0233h3, vf0Var3, c0282a, i, i2, 1);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                o39Var2 = o39Var;
                if (tj3Var2.m22120g(o39Var2)) {
                }
                i3 |= i10;
            } else {
                o39Var2 = o39Var;
            }
            i3 |= i10;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                mn0VarM21998l = mn0Var;
                if (tj3Var2.m22120g(mn0VarM21998l)) {
                }
                i3 |= i11;
            } else {
                mn0VarM21998l = mn0Var;
            }
            i3 |= i11;
        } else {
            mn0VarM21998l = mn0Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                c0233h7 = c0233h;
                if (tj3Var2.m22120g(c0233h7)) {
                    c0233h5 = c0233h7;
                    i8 = 131072;
                    c0233h6 = c0233h7;
                }
                i3 |= i8;
                c0233h2 = c0233h6;
            } else {
                c0233h5 = c0233h;
            }
            c0233h5 = c0233h7;
            i8 = 65536;
            c0233h6 = c0233h5;
            i3 |= i8;
            c0233h2 = c0233h6;
        } else {
            c0233h2 = c0233h;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                vf0Var2 = vf0Var;
                if (tj3Var2.m22120g(vf0Var2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (tj3Var2.m22120g(null)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
            if ((100663296 & i) == 0) {
                if (tj3Var2.m22124i(c0282a)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((38347923 & i3) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i3 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                        i3 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        mn0VarM21998l = te1.m21998l(tj3Var2);
                    }
                    c0233hM22000n = c0233h2;
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c0233hM22000n = te1.m22000n(63, 0.0f);
                    }
                    if (i4 != 0) {
                        vf0Var2 = null;
                    }
                    o39Var3 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                    z4 = z5;
                    c0233h4 = c0233hM22000n;
                } else {
                    if (i9 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                        i3 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        mn0VarM21998l = te1.m21998l(tj3Var2);
                    }
                    c0233hM22000n = c0233h2;
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c0233hM22000n = te1.m22000n(63, 0.0f);
                    }
                    if (i4 != 0) {
                        vf0Var2 = null;
                    }
                    o39Var3 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                    z4 = z5;
                    c0233h4 = c0233hM22000n;
                }
                tj3Var2.m22140r();
                tj3Var2.m22111b0(1577873102);
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56 v56Var3 = (v56) objM22097O;
                tj3Var2.m22139q(false);
                if (z4) {
                    j = mn0VarM21998l.f51546a;
                } else {
                    j = mn0VarM21998l.f51548c;
                }
                long j5 = j;
                if (z4) {
                    j2 = mn0VarM21998l.f51547b;
                } else {
                    j2 = mn0VarM21998l.f51549d;
                }
                tj3 tj3Var7 = tj3Var2;
                ho9.m13415b(ui3Var, e16Var, z4, o39Var3, j5, j2, 0.0f, ((xj2) c0233h4.m1157a(z4, v56Var3, tj3Var2, ((i3 >> 6) & 14) | ((i3 >> 9) & 896)).getValue()).f68285a, vf0Var4, v56Var3, ci8.m4703P(-1347531112, new zn0(c0282a, 0), tj3Var2), tj3Var7, (i3 & 8190) | ((i3 << 6) & 234881024), 64);
                z2 = z4;
                o39Var2 = o39Var3;
                vf0Var3 = vf0Var4;
                c0233h3 = c0233h4;
                tj3Var = tj3Var7;
            } else {
                tj3 tj3Var8 = tj3Var2;
                tj3Var8.m22102U();
                vf0Var3 = vf0Var2;
                c0233h3 = c0233h2;
                tj3Var = tj3Var8;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var2, mn0VarM21998l, c0233h3, vf0Var3, c0282a, i, i2, 1);
            }
        }
        i3 |= 1572864;
        vf0Var2 = vf0Var;
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (tj3Var2.m22120g(null)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        }
        if ((100663296 & i) == 0) {
            if (tj3Var2.m22124i(c0282a)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((38347923 & i3) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var2.m22099R(i3 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i2 & 8) != 0) {
                    o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                    i3 &= -7169;
                } else {
                    o39VarM24271b = o39Var2;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    mn0VarM21998l = te1.m21998l(tj3Var2);
                }
                c0233hM22000n = c0233h2;
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    c0233hM22000n = te1.m22000n(63, 0.0f);
                }
                if (i4 != 0) {
                    vf0Var2 = null;
                }
                o39Var3 = o39VarM24271b;
                vf0Var4 = vf0Var2;
                z4 = z5;
                c0233h4 = c0233hM22000n;
            } else {
                if (i9 == 0) {
                }
                if ((i2 & 8) != 0) {
                    o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                    i3 &= -7169;
                } else {
                    o39VarM24271b = o39Var2;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    mn0VarM21998l = te1.m21998l(tj3Var2);
                }
                c0233hM22000n = c0233h2;
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    c0233hM22000n = te1.m22000n(63, 0.0f);
                }
                if (i4 != 0) {
                    vf0Var2 = null;
                }
                o39Var3 = o39VarM24271b;
                vf0Var4 = vf0Var2;
                z4 = z5;
                c0233h4 = c0233hM22000n;
            }
            tj3Var2.m22140r();
            tj3Var2.m22111b0(1577873102);
            objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var2);
            }
            v56 v56Var4 = (v56) objM22097O;
            tj3Var2.m22139q(false);
            if (z4) {
                j = mn0VarM21998l.f51546a;
            } else {
                j = mn0VarM21998l.f51548c;
            }
            long j6 = j;
            if (z4) {
                j2 = mn0VarM21998l.f51547b;
            } else {
                j2 = mn0VarM21998l.f51549d;
            }
            tj3 tj3Var9 = tj3Var2;
            ho9.m13415b(ui3Var, e16Var, z4, o39Var3, j6, j2, 0.0f, ((xj2) c0233h4.m1157a(z4, v56Var4, tj3Var2, ((i3 >> 6) & 14) | ((i3 >> 9) & 896)).getValue()).f68285a, vf0Var4, v56Var4, ci8.m4703P(-1347531112, new zn0(c0282a, 0), tj3Var2), tj3Var9, (i3 & 8190) | ((i3 << 6) & 234881024), 64);
            z2 = z4;
            o39Var2 = o39Var3;
            vf0Var3 = vf0Var4;
            c0233h3 = c0233h4;
            tj3Var = tj3Var9;
        } else {
            tj3 tj3Var10 = tj3Var2;
            tj3Var10.m22102U();
            vf0Var3 = vf0Var2;
            c0233h3 = c0233h2;
            tj3Var = tj3Var10;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var2, mn0VarM21998l, c0233h3, vf0Var3, c0282a, i, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x016b  */
    /* JADX WARN: Code duplicated, block: B:106:0x017b  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010d  */
    /* JADX INFO: renamed from: O */
    public static final void m4039O(e16 e16Var, o39 o39Var, mn0 mn0Var, C0233h c0233h, vf0 vf0Var, aj3 aj3Var, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        o39 o39Var2;
        mn0 mn0Var2;
        C0233h c0233hM22000n;
        vf0 vf0Var2;
        int i4;
        boolean z;
        tj3 tj3Var;
        e16 e16Var3;
        o39 o39Var3;
        mn0 mn0Var3;
        C0233h c0233h2;
        vf0 vf0Var3;
        x18 x18VarM22143u;
        e16 e16Var4;
        o39 o39VarM24271b;
        mn0 mn0VarM21998l;
        e16 e16Var5;
        C0233h c0233h3;
        o39 o39Var4;
        vf0 vf0Var4;
        int i5;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1359693790);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else if ((i & 6) == 0) {
            e16Var2 = e16Var;
            i3 = (tj3Var2.m22120g(e16Var2) ? 4 : 2) | i;
        } else {
            e16Var2 = e16Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                o39Var2 = o39Var;
                int i7 = tj3Var2.m22120g(o39Var2) ? 32 : 16;
                i3 |= i7;
            } else {
                o39Var2 = o39Var;
            }
            i3 |= i7;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                mn0Var2 = mn0Var;
                int i8 = tj3Var2.m22120g(mn0Var2) ? 256 : 128;
                i3 |= i8;
            } else {
                mn0Var2 = mn0Var;
            }
            i3 |= i8;
        } else {
            mn0Var2 = mn0Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                c0233hM22000n = c0233h;
                int i9 = tj3Var2.m22120g(c0233hM22000n) ? 2048 : 1024;
                i3 |= i9;
            } else {
                c0233hM22000n = c0233h;
            }
            i3 |= i9;
        } else {
            c0233hM22000n = c0233h;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                vf0Var2 = vf0Var;
                i3 |= tj3Var2.m22120g(vf0Var2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (tj3Var2.m22124i(aj3Var)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i4 = 1;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var2.m22099R(i3 & 1, z)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0 || tj3Var2.m22084B()) {
                    if (i6 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 2) != 0) {
                        o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                        i3 &= -113;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 4) != 0) {
                        mn0VarM21998l = te1.m21998l(tj3Var2);
                        i3 &= -897;
                    } else {
                        mn0VarM21998l = mn0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        c0233hM22000n = te1.m22000n(63, 0.0f);
                    }
                    if (i10 != 0) {
                        C0233h c0233h4 = c0233hM22000n;
                        e16Var5 = e16Var4;
                        c0233h3 = c0233h4;
                        o39Var4 = o39VarM24271b;
                        vf0Var4 = null;
                    } else {
                        C0233h c0233h5 = c0233hM22000n;
                        e16Var5 = e16Var4;
                        c0233h3 = c0233h5;
                        o39Var4 = o39VarM24271b;
                        vf0Var4 = vf0Var2;
                    }
                } else {
                    tj3Var2.m22102U();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    o39Var4 = o39Var2;
                    mn0VarM21998l = mn0Var2;
                    c0233h3 = c0233hM22000n;
                    vf0Var4 = vf0Var2;
                    e16Var5 = e16Var2;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                ho9.m13414a(e16Var5, o39Var4, mn0VarM21998l.f51546a, mn0VarM21998l.f51547b, 0.0f, ((xj2) c0233h3.m1157a(true, null, tj3Var2, ((i3 >> 3) & 896) | 54).getValue()).f68285a, vf0Var4, ci8.m4703P(-97109725, new C3186kj(aj3Var, i4), tj3Var2), tj3Var, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                mn0Var3 = mn0VarM21998l;
                o39Var3 = o39Var4;
                vf0Var3 = vf0Var4;
                c0233h2 = c0233h3;
                e16Var3 = e16Var5;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                o39Var3 = o39Var2;
                mn0Var3 = mn0Var2;
                c0233h2 = c0233hM22000n;
                vf0Var3 = vf0Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new xn0(e16Var3, o39Var3, mn0Var3, c0233h2, vf0Var3, aj3Var, i, i2, 1);
            }
        }
        i3 |= 24576;
        vf0Var2 = vf0Var;
        if ((196608 & i) == 0) {
            if (tj3Var2.m22124i(aj3Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        i4 = 1;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var2.m22099R(i3 & 1, z)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i2 & 2) != 0) {
                    o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                    i3 &= -113;
                } else {
                    o39VarM24271b = o39Var2;
                }
                if ((i2 & 4) != 0) {
                    mn0VarM21998l = te1.m21998l(tj3Var2);
                    i3 &= -897;
                } else {
                    mn0VarM21998l = mn0Var2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    c0233hM22000n = te1.m22000n(63, 0.0f);
                }
                if (i10 != 0) {
                    C0233h c0233h6 = c0233hM22000n;
                    e16Var5 = e16Var4;
                    c0233h3 = c0233h6;
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = null;
                } else {
                    C0233h c0233h7 = c0233hM22000n;
                    e16Var5 = e16Var4;
                    c0233h3 = c0233h7;
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                }
            } else {
                if (i6 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i2 & 2) != 0) {
                    o39VarM24271b = x49.m24271b(b43.f7910b, tj3Var2);
                    i3 &= -113;
                } else {
                    o39VarM24271b = o39Var2;
                }
                if ((i2 & 4) != 0) {
                    mn0VarM21998l = te1.m21998l(tj3Var2);
                    i3 &= -897;
                } else {
                    mn0VarM21998l = mn0Var2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    c0233hM22000n = te1.m22000n(63, 0.0f);
                }
                if (i10 != 0) {
                    C0233h c0233h8 = c0233hM22000n;
                    e16Var5 = e16Var4;
                    c0233h3 = c0233h8;
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = null;
                } else {
                    C0233h c0233h9 = c0233hM22000n;
                    e16Var5 = e16Var4;
                    c0233h3 = c0233h9;
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                }
            }
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            ho9.m13414a(e16Var5, o39Var4, mn0VarM21998l.f51546a, mn0VarM21998l.f51547b, 0.0f, ((xj2) c0233h3.m1157a(true, null, tj3Var2, ((i3 >> 3) & 896) | 54).getValue()).f68285a, vf0Var4, ci8.m4703P(-97109725, new C3186kj(aj3Var, i4), tj3Var2), tj3Var, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
            mn0Var3 = mn0VarM21998l;
            o39Var3 = o39Var4;
            vf0Var3 = vf0Var4;
            c0233h2 = c0233h3;
            e16Var3 = e16Var5;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            o39Var3 = o39Var2;
            mn0Var3 = mn0Var2;
            c0233h2 = c0233hM22000n;
            vf0Var3 = vf0Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xn0(e16Var3, o39Var3, mn0Var3, c0233h2, vf0Var3, aj3Var, i, i2, 1);
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m4040P(oq6 oq6Var, InterfaceC3571se interfaceC3571se, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var.m22120g(oq6Var) : tj3Var.m22124i(oq6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(interfaceC3571se) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 256 : 128;
        }
        boolean z = true;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !tj3Var.m22120g(oq6Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM22097O = tj3Var.m22097O();
            if (z3 || objM22097O == we1.f66679a) {
                objM22097O = new vq3(interfaceC3571se, oq6Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0456d.m1897a((vq3) objM22097O, null, new qh7(false, SecureFlagPolicy.Inherit, false), c0282a, tj3Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 1, oq6Var, interfaceC3571se, c0282a);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m4041Q(p04 p04Var, String str, e16 e16Var, qd0 qd0Var, ye1 ye1Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            e16Var = b16.f7762a;
        }
        gc0 gc0Var = nj0.f52812g;
        m4042R(yda.m25096c(p04Var, ye1Var), str, e16Var, gc0Var, hl1.f42565b, 1.0f, qd0Var, ye1Var, (i & 112) | 8 | (i & 896), 0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0162  */
    /* JADX WARN: Code duplicated, block: B:106:0x018b  */
    /* JADX WARN: Code duplicated, block: B:109:0x019b  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    /* JADX INFO: renamed from: R */
    public static final void m4042R(final y27 y27Var, final String str, e16 e16Var, InterfaceC3571se interfaceC3571se, jl1 jl1Var, float f, fa1 fa1Var, ye1 ye1Var, final int i, final int i2) {
        e16 e16Var2;
        int i3;
        InterfaceC3571se interfaceC3571se2;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        final e16 e16Var3;
        final InterfaceC3571se interfaceC3571se3;
        final jl1 jl1Var2;
        final fa1 fa1Var2;
        final float f3;
        x18 x18VarM22143u;
        e16 e16VarM17643c;
        InterfaceC3571se interfaceC3571se4;
        int i13;
        jl1 jl1Var3;
        fa1 fa1Var3;
        p84 p84Var;
        Object objM22097O;
        ui3 ui3Var;
        boolean z2;
        Object objM22097O2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1142754848);
        int i14 = (tj3Var.m22124i(y27Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i14 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        int i15 = i2 & 4;
        if (i15 == 0) {
            if ((i & 384) == 0) {
                e16Var2 = e16Var;
                i14 |= tj3Var.m22120g(e16Var2) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                if ((i & 3072) == 0) {
                    interfaceC3571se2 = interfaceC3571se;
                    if (tj3Var.m22120g(interfaceC3571se2)) {
                        i4 = 2048;
                    } else {
                        i4 = 1024;
                    }
                    i14 |= i4;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    if ((i & 24576) == 0) {
                        if (tj3Var.m22120g(jl1Var)) {
                            i6 = 16384;
                        } else {
                            i6 = 8192;
                        }
                        i14 |= i6;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        i9 = i14 | 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if (tj3Var.m22114d(f2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i9 = i14 | i8;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (tj3Var.m22120g(fa1Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i9 |= i11;
                        }
                        i12 = i9;
                        if ((i9 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (tj3Var.m22099R(i12 & 1, z)) {
                            e16VarM17643c = b16.f7762a;
                            if (i15 != 0) {
                                e16Var2 = e16VarM17643c;
                            }
                            if (i3 != 0) {
                                interfaceC3571se4 = nj0.f52812g;
                            } else {
                                interfaceC3571se4 = interfaceC3571se2;
                            }
                            if (i5 != 0) {
                                jl1Var3 = hl1.f42565b;
                                i13 = i7;
                            } else {
                                i13 = i7;
                                jl1Var3 = jl1Var;
                            }
                            if (i13 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                fa1Var3 = null;
                            } else {
                                fa1Var3 = fa1Var;
                            }
                            p84Var = we1.f66679a;
                            if (str != null) {
                                tj3Var.m22111b0(1899222916);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objM22097O2 = tj3Var.m22097O();
                                if (z2 || objM22097O2 == p84Var) {
                                    objM22097O2 = new jd0(str, 10);
                                    tj3Var.m22131l0(objM22097O2);
                                }
                                e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                                tj3Var.m22139q(false);
                            } else {
                                tj3Var.m22111b0(1899381698);
                                tj3Var.m22139q(false);
                            }
                            e16 e16VarM23484B = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                            objM22097O = tj3Var.m22097O();
                            if (objM22097O == p84Var) {
                                objM22097O = C3580sn.f61040g;
                                tj3Var.m22131l0(objM22097O);
                            }
                            ht5 ht5Var = (ht5) objM22097O;
                            int iHashCode = Long.hashCode(tj3Var.f62385T);
                            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM23484B);
                            l77 l77VarM22132m = tj3Var.m22132m();
                            se1.f60731q.getClass();
                            ui3Var = C0352b.f4299b;
                            tj3Var.m22119f0();
                            if (tj3Var.f62384S) {
                                tj3Var.m22130l(ui3Var);
                            } else {
                                tj3Var.m22137o0();
                            }
                            oha.m18001g(tj3Var, C0352b.f4303f, ht5Var);
                            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                            oha.m18000f(tj3Var, C0352b.f4305h);
                            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                            tj3Var.m22139q(true);
                            e16Var3 = e16Var2;
                            interfaceC3571se3 = interfaceC3571se4;
                            jl1Var2 = jl1Var3;
                            fa1Var2 = fa1Var3;
                        } else {
                            tj3Var.m22102U();
                            e16Var3 = e16Var2;
                            interfaceC3571se3 = interfaceC3571se2;
                            jl1Var2 = jl1Var;
                            fa1Var2 = fa1Var;
                        }
                        f3 = f2;
                        x18VarM22143u = tj3Var.m22143u();
                        if (x18VarM22143u != null) {
                            x18VarM22143u.f67642d = new zi3() { // from class: sz3
                                @Override // p000.zi3
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                                    return xfa.f68157a;
                                }
                            };
                        }
                    }
                    i9 |= 1572864;
                    i12 = i9;
                    if ((i9 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i12 & 1, z)) {
                        e16VarM17643c = b16.f7762a;
                        if (i15 != 0) {
                            e16Var2 = e16VarM17643c;
                        }
                        if (i3 != 0) {
                            interfaceC3571se4 = nj0.f52812g;
                        } else {
                            interfaceC3571se4 = interfaceC3571se2;
                        }
                        if (i5 != 0) {
                            jl1Var3 = hl1.f42565b;
                            i13 = i7;
                        } else {
                            i13 = i7;
                            jl1Var3 = jl1Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            fa1Var3 = null;
                        } else {
                            fa1Var3 = fa1Var;
                        }
                        p84Var = we1.f66679a;
                        if (str != null) {
                            tj3Var.m22111b0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objM22097O2 = tj3Var.m22097O();
                            if (z2) {
                                objM22097O2 = new jd0(str, 10);
                                tj3Var.m22131l0(objM22097O2);
                            } else {
                                objM22097O2 = new jd0(str, 10);
                                tj3Var.m22131l0(objM22097O2);
                            }
                            e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1899381698);
                            tj3Var.m22139q(false);
                        }
                        e16 e16VarM23484B2 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                        objM22097O = tj3Var.m22097O();
                        if (objM22097O == p84Var) {
                            objM22097O = C3580sn.f61040g;
                            tj3Var.m22131l0(objM22097O);
                        }
                        ht5 ht5Var2 = (ht5) objM22097O;
                        int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B2);
                        l77 l77VarM22132m2 = tj3Var.m22132m();
                        se1.f60731q.getClass();
                        ui3Var = C0352b.f4299b;
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, C0352b.f4303f, ht5Var2);
                        oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                        oha.m18000f(tj3Var, C0352b.f4305h);
                        oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                        oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                        tj3Var.m22139q(true);
                        e16Var3 = e16Var2;
                        interfaceC3571se3 = interfaceC3571se4;
                        jl1Var2 = jl1Var3;
                        fa1Var2 = fa1Var3;
                    } else {
                        tj3Var.m22102U();
                        e16Var3 = e16Var2;
                        interfaceC3571se3 = interfaceC3571se2;
                        jl1Var2 = jl1Var;
                        fa1Var2 = fa1Var;
                    }
                    f3 = f2;
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: sz3
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i7 = i2 & 32;
                if (i7 != 0) {
                    i9 = i14 | 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if (tj3Var.m22114d(f2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i9 = i14 | i8;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (tj3Var.m22120g(fa1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i9 |= i11;
                    }
                    i12 = i9;
                    if ((i9 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i12 & 1, z)) {
                        e16VarM17643c = b16.f7762a;
                        if (i15 != 0) {
                            e16Var2 = e16VarM17643c;
                        }
                        if (i3 != 0) {
                            interfaceC3571se4 = nj0.f52812g;
                        } else {
                            interfaceC3571se4 = interfaceC3571se2;
                        }
                        if (i5 != 0) {
                            jl1Var3 = hl1.f42565b;
                            i13 = i7;
                        } else {
                            i13 = i7;
                            jl1Var3 = jl1Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            fa1Var3 = null;
                        } else {
                            fa1Var3 = fa1Var;
                        }
                        p84Var = we1.f66679a;
                        if (str != null) {
                            tj3Var.m22111b0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objM22097O2 = tj3Var.m22097O();
                            if (z2) {
                                objM22097O2 = new jd0(str, 10);
                                tj3Var.m22131l0(objM22097O2);
                            } else {
                                objM22097O2 = new jd0(str, 10);
                                tj3Var.m22131l0(objM22097O2);
                            }
                            e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1899381698);
                            tj3Var.m22139q(false);
                        }
                        e16 e16VarM23484B3 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                        objM22097O = tj3Var.m22097O();
                        if (objM22097O == p84Var) {
                            objM22097O = C3580sn.f61040g;
                            tj3Var.m22131l0(objM22097O);
                        }
                        ht5 ht5Var3 = (ht5) objM22097O;
                        int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B3);
                        l77 l77VarM22132m3 = tj3Var.m22132m();
                        se1.f60731q.getClass();
                        ui3Var = C0352b.f4299b;
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, C0352b.f4303f, ht5Var3);
                        oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
                        oha.m18000f(tj3Var, C0352b.f4305h);
                        oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
                        oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
                        tj3Var.m22139q(true);
                        e16Var3 = e16Var2;
                        interfaceC3571se3 = interfaceC3571se4;
                        jl1Var2 = jl1Var3;
                        fa1Var2 = fa1Var3;
                    } else {
                        tj3Var.m22102U();
                        e16Var3 = e16Var2;
                        interfaceC3571se3 = interfaceC3571se2;
                        jl1Var2 = jl1Var;
                        fa1Var2 = fa1Var;
                    }
                    f3 = f2;
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: sz3
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i9 |= 1572864;
                i12 = i9;
                if ((i9 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i12 & 1, z)) {
                    e16VarM17643c = b16.f7762a;
                    if (i15 != 0) {
                        e16Var2 = e16VarM17643c;
                    }
                    if (i3 != 0) {
                        interfaceC3571se4 = nj0.f52812g;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    if (i5 != 0) {
                        jl1Var3 = hl1.f42565b;
                        i13 = i7;
                    } else {
                        i13 = i7;
                        jl1Var3 = jl1Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        fa1Var3 = null;
                    } else {
                        fa1Var3 = fa1Var;
                    }
                    p84Var = we1.f66679a;
                    if (str != null) {
                        tj3Var.m22111b0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objM22097O2 = tj3Var.m22097O();
                        if (z2) {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1899381698);
                        tj3Var.m22139q(false);
                    }
                    e16 e16VarM23484B4 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = C3580sn.f61040g;
                        tj3Var.m22131l0(objM22097O);
                    }
                    ht5 ht5Var4 = (ht5) objM22097O;
                    int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B4);
                    l77 l77VarM22132m4 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5Var4);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m4);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c4);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode4));
                    tj3Var.m22139q(true);
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se4;
                    jl1Var2 = jl1Var3;
                    fa1Var2 = fa1Var3;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se2;
                    jl1Var2 = jl1Var;
                    fa1Var2 = fa1Var;
                }
                f3 = f2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: sz3
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i14 |= 3072;
            interfaceC3571se2 = interfaceC3571se;
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    if (tj3Var.m22120g(jl1Var)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i14 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    i9 = i14 | 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if (tj3Var.m22114d(f2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i9 = i14 | i8;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (tj3Var.m22120g(fa1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i9 |= i11;
                    }
                    i12 = i9;
                    if ((i9 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i12 & 1, z)) {
                        e16VarM17643c = b16.f7762a;
                        if (i15 != 0) {
                            e16Var2 = e16VarM17643c;
                        }
                        if (i3 != 0) {
                            interfaceC3571se4 = nj0.f52812g;
                        } else {
                            interfaceC3571se4 = interfaceC3571se2;
                        }
                        if (i5 != 0) {
                            jl1Var3 = hl1.f42565b;
                            i13 = i7;
                        } else {
                            i13 = i7;
                            jl1Var3 = jl1Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            fa1Var3 = null;
                        } else {
                            fa1Var3 = fa1Var;
                        }
                        p84Var = we1.f66679a;
                        if (str != null) {
                            tj3Var.m22111b0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objM22097O2 = tj3Var.m22097O();
                            if (z2) {
                                objM22097O2 = new jd0(str, 10);
                                tj3Var.m22131l0(objM22097O2);
                            } else {
                                objM22097O2 = new jd0(str, 10);
                                tj3Var.m22131l0(objM22097O2);
                            }
                            e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1899381698);
                            tj3Var.m22139q(false);
                        }
                        e16 e16VarM23484B5 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                        objM22097O = tj3Var.m22097O();
                        if (objM22097O == p84Var) {
                            objM22097O = C3580sn.f61040g;
                            tj3Var.m22131l0(objM22097O);
                        }
                        ht5 ht5Var5 = (ht5) objM22097O;
                        int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                        e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B5);
                        l77 l77VarM22132m5 = tj3Var.m22132m();
                        se1.f60731q.getClass();
                        ui3Var = C0352b.f4299b;
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, C0352b.f4303f, ht5Var5);
                        oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m5);
                        oha.m18000f(tj3Var, C0352b.f4305h);
                        oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c5);
                        oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode5));
                        tj3Var.m22139q(true);
                        e16Var3 = e16Var2;
                        interfaceC3571se3 = interfaceC3571se4;
                        jl1Var2 = jl1Var3;
                        fa1Var2 = fa1Var3;
                    } else {
                        tj3Var.m22102U();
                        e16Var3 = e16Var2;
                        interfaceC3571se3 = interfaceC3571se2;
                        jl1Var2 = jl1Var;
                        fa1Var2 = fa1Var;
                    }
                    f3 = f2;
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: sz3
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i9 |= 1572864;
                i12 = i9;
                if ((i9 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i12 & 1, z)) {
                    e16VarM17643c = b16.f7762a;
                    if (i15 != 0) {
                        e16Var2 = e16VarM17643c;
                    }
                    if (i3 != 0) {
                        interfaceC3571se4 = nj0.f52812g;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    if (i5 != 0) {
                        jl1Var3 = hl1.f42565b;
                        i13 = i7;
                    } else {
                        i13 = i7;
                        jl1Var3 = jl1Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        fa1Var3 = null;
                    } else {
                        fa1Var3 = fa1Var;
                    }
                    p84Var = we1.f66679a;
                    if (str != null) {
                        tj3Var.m22111b0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objM22097O2 = tj3Var.m22097O();
                        if (z2) {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1899381698);
                        tj3Var.m22139q(false);
                    }
                    e16 e16VarM23484B6 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = C3580sn.f61040g;
                        tj3Var.m22131l0(objM22097O);
                    }
                    ht5 ht5Var6 = (ht5) objM22097O;
                    int iHashCode6 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B6);
                    l77 l77VarM22132m6 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5Var6);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m6);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c6);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode6));
                    tj3Var.m22139q(true);
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se4;
                    jl1Var2 = jl1Var3;
                    fa1Var2 = fa1Var3;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se2;
                    jl1Var2 = jl1Var;
                    fa1Var2 = fa1Var;
                }
                f3 = f2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: sz3
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                i9 = i14 | 196608;
                f2 = f;
            } else {
                f2 = f;
                if (tj3Var.m22114d(f2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i14 | i8;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (tj3Var.m22120g(fa1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i9 |= i11;
                }
                i12 = i9;
                if ((i9 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i12 & 1, z)) {
                    e16VarM17643c = b16.f7762a;
                    if (i15 != 0) {
                        e16Var2 = e16VarM17643c;
                    }
                    if (i3 != 0) {
                        interfaceC3571se4 = nj0.f52812g;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    if (i5 != 0) {
                        jl1Var3 = hl1.f42565b;
                        i13 = i7;
                    } else {
                        i13 = i7;
                        jl1Var3 = jl1Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        fa1Var3 = null;
                    } else {
                        fa1Var3 = fa1Var;
                    }
                    p84Var = we1.f66679a;
                    if (str != null) {
                        tj3Var.m22111b0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objM22097O2 = tj3Var.m22097O();
                        if (z2) {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1899381698);
                        tj3Var.m22139q(false);
                    }
                    e16 e16VarM23484B7 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = C3580sn.f61040g;
                        tj3Var.m22131l0(objM22097O);
                    }
                    ht5 ht5Var7 = (ht5) objM22097O;
                    int iHashCode7 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B7);
                    l77 l77VarM22132m7 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5Var7);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m7);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c7);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode7));
                    tj3Var.m22139q(true);
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se4;
                    jl1Var2 = jl1Var3;
                    fa1Var2 = fa1Var3;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se2;
                    jl1Var2 = jl1Var;
                    fa1Var2 = fa1Var;
                }
                f3 = f2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: sz3
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i9 |= 1572864;
            i12 = i9;
            if ((i9 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i12 & 1, z)) {
                e16VarM17643c = b16.f7762a;
                if (i15 != 0) {
                    e16Var2 = e16VarM17643c;
                }
                if (i3 != 0) {
                    interfaceC3571se4 = nj0.f52812g;
                } else {
                    interfaceC3571se4 = interfaceC3571se2;
                }
                if (i5 != 0) {
                    jl1Var3 = hl1.f42565b;
                    i13 = i7;
                } else {
                    i13 = i7;
                    jl1Var3 = jl1Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    fa1Var3 = null;
                } else {
                    fa1Var3 = fa1Var;
                }
                p84Var = we1.f66679a;
                if (str != null) {
                    tj3Var.m22111b0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z2) {
                        objM22097O2 = new jd0(str, 10);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new jd0(str, 10);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1899381698);
                    tj3Var.m22139q(false);
                }
                e16 e16VarM23484B8 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = C3580sn.f61040g;
                    tj3Var.m22131l0(objM22097O);
                }
                ht5 ht5Var8 = (ht5) objM22097O;
                int iHashCode8 = Long.hashCode(tj3Var.f62385T);
                e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B8);
                l77 l77VarM22132m8 = tj3Var.m22132m();
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5Var8);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m8);
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c8);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode8));
                tj3Var.m22139q(true);
                e16Var3 = e16Var2;
                interfaceC3571se3 = interfaceC3571se4;
                jl1Var2 = jl1Var3;
                fa1Var2 = fa1Var3;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                interfaceC3571se3 = interfaceC3571se2;
                jl1Var2 = jl1Var;
                fa1Var2 = fa1Var;
            }
            f3 = f2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: sz3
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i14 |= 384;
        e16Var2 = e16Var;
        i3 = i2 & 8;
        if (i3 != 0) {
            if ((i & 3072) == 0) {
                interfaceC3571se2 = interfaceC3571se;
                if (tj3Var.m22120g(interfaceC3571se2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i14 |= i4;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    if (tj3Var.m22120g(jl1Var)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i14 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    i9 = i14 | 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if (tj3Var.m22114d(f2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i9 = i14 | i8;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (tj3Var.m22120g(fa1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i9 |= i11;
                    }
                    i12 = i9;
                    if ((i9 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i12 & 1, z)) {
                        e16VarM17643c = b16.f7762a;
                        if (i15 != 0) {
                            e16Var2 = e16VarM17643c;
                        }
                        if (i3 != 0) {
                            interfaceC3571se4 = nj0.f52812g;
                        } else {
                            interfaceC3571se4 = interfaceC3571se2;
                        }
                        if (i5 != 0) {
                            jl1Var3 = hl1.f42565b;
                            i13 = i7;
                        } else {
                            i13 = i7;
                            jl1Var3 = jl1Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            fa1Var3 = null;
                        } else {
                            fa1Var3 = fa1Var;
                        }
                        p84Var = we1.f66679a;
                        if (str != null) {
                            tj3Var.m22111b0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objM22097O2 = tj3Var.m22097O();
                            if (z2) {
                                objM22097O2 = new jd0(str, 10);
                                tj3Var.m22131l0(objM22097O2);
                            } else {
                                objM22097O2 = new jd0(str, 10);
                                tj3Var.m22131l0(objM22097O2);
                            }
                            e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1899381698);
                            tj3Var.m22139q(false);
                        }
                        e16 e16VarM23484B9 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                        objM22097O = tj3Var.m22097O();
                        if (objM22097O == p84Var) {
                            objM22097O = C3580sn.f61040g;
                            tj3Var.m22131l0(objM22097O);
                        }
                        ht5 ht5Var9 = (ht5) objM22097O;
                        int iHashCode9 = Long.hashCode(tj3Var.f62385T);
                        e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B9);
                        l77 l77VarM22132m9 = tj3Var.m22132m();
                        se1.f60731q.getClass();
                        ui3Var = C0352b.f4299b;
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, C0352b.f4303f, ht5Var9);
                        oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m9);
                        oha.m18000f(tj3Var, C0352b.f4305h);
                        oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c9);
                        oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode9));
                        tj3Var.m22139q(true);
                        e16Var3 = e16Var2;
                        interfaceC3571se3 = interfaceC3571se4;
                        jl1Var2 = jl1Var3;
                        fa1Var2 = fa1Var3;
                    } else {
                        tj3Var.m22102U();
                        e16Var3 = e16Var2;
                        interfaceC3571se3 = interfaceC3571se2;
                        jl1Var2 = jl1Var;
                        fa1Var2 = fa1Var;
                    }
                    f3 = f2;
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: sz3
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i9 |= 1572864;
                i12 = i9;
                if ((i9 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i12 & 1, z)) {
                    e16VarM17643c = b16.f7762a;
                    if (i15 != 0) {
                        e16Var2 = e16VarM17643c;
                    }
                    if (i3 != 0) {
                        interfaceC3571se4 = nj0.f52812g;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    if (i5 != 0) {
                        jl1Var3 = hl1.f42565b;
                        i13 = i7;
                    } else {
                        i13 = i7;
                        jl1Var3 = jl1Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        fa1Var3 = null;
                    } else {
                        fa1Var3 = fa1Var;
                    }
                    p84Var = we1.f66679a;
                    if (str != null) {
                        tj3Var.m22111b0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objM22097O2 = tj3Var.m22097O();
                        if (z2) {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1899381698);
                        tj3Var.m22139q(false);
                    }
                    e16 e16VarM23484B10 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = C3580sn.f61040g;
                        tj3Var.m22131l0(objM22097O);
                    }
                    ht5 ht5Var10 = (ht5) objM22097O;
                    int iHashCode10 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B10);
                    l77 l77VarM22132m10 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5Var10);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m10);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c10);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode10));
                    tj3Var.m22139q(true);
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se4;
                    jl1Var2 = jl1Var3;
                    fa1Var2 = fa1Var3;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se2;
                    jl1Var2 = jl1Var;
                    fa1Var2 = fa1Var;
                }
                f3 = f2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: sz3
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                i9 = i14 | 196608;
                f2 = f;
            } else {
                f2 = f;
                if (tj3Var.m22114d(f2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i14 | i8;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (tj3Var.m22120g(fa1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i9 |= i11;
                }
                i12 = i9;
                if ((i9 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i12 & 1, z)) {
                    e16VarM17643c = b16.f7762a;
                    if (i15 != 0) {
                        e16Var2 = e16VarM17643c;
                    }
                    if (i3 != 0) {
                        interfaceC3571se4 = nj0.f52812g;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    if (i5 != 0) {
                        jl1Var3 = hl1.f42565b;
                        i13 = i7;
                    } else {
                        i13 = i7;
                        jl1Var3 = jl1Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        fa1Var3 = null;
                    } else {
                        fa1Var3 = fa1Var;
                    }
                    p84Var = we1.f66679a;
                    if (str != null) {
                        tj3Var.m22111b0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objM22097O2 = tj3Var.m22097O();
                        if (z2) {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1899381698);
                        tj3Var.m22139q(false);
                    }
                    e16 e16VarM23484B11 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = C3580sn.f61040g;
                        tj3Var.m22131l0(objM22097O);
                    }
                    ht5 ht5Var11 = (ht5) objM22097O;
                    int iHashCode11 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c11 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B11);
                    l77 l77VarM22132m11 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5Var11);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m11);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c11);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode11));
                    tj3Var.m22139q(true);
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se4;
                    jl1Var2 = jl1Var3;
                    fa1Var2 = fa1Var3;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se2;
                    jl1Var2 = jl1Var;
                    fa1Var2 = fa1Var;
                }
                f3 = f2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: sz3
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i9 |= 1572864;
            i12 = i9;
            if ((i9 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i12 & 1, z)) {
                e16VarM17643c = b16.f7762a;
                if (i15 != 0) {
                    e16Var2 = e16VarM17643c;
                }
                if (i3 != 0) {
                    interfaceC3571se4 = nj0.f52812g;
                } else {
                    interfaceC3571se4 = interfaceC3571se2;
                }
                if (i5 != 0) {
                    jl1Var3 = hl1.f42565b;
                    i13 = i7;
                } else {
                    i13 = i7;
                    jl1Var3 = jl1Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    fa1Var3 = null;
                } else {
                    fa1Var3 = fa1Var;
                }
                p84Var = we1.f66679a;
                if (str != null) {
                    tj3Var.m22111b0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z2) {
                        objM22097O2 = new jd0(str, 10);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new jd0(str, 10);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1899381698);
                    tj3Var.m22139q(false);
                }
                e16 e16VarM23484B12 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = C3580sn.f61040g;
                    tj3Var.m22131l0(objM22097O);
                }
                ht5 ht5Var12 = (ht5) objM22097O;
                int iHashCode12 = Long.hashCode(tj3Var.f62385T);
                e16 e16VarM1322c12 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B12);
                l77 l77VarM22132m12 = tj3Var.m22132m();
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5Var12);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m12);
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c12);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode12));
                tj3Var.m22139q(true);
                e16Var3 = e16Var2;
                interfaceC3571se3 = interfaceC3571se4;
                jl1Var2 = jl1Var3;
                fa1Var2 = fa1Var3;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                interfaceC3571se3 = interfaceC3571se2;
                jl1Var2 = jl1Var;
                fa1Var2 = fa1Var;
            }
            f3 = f2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: sz3
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i14 |= 3072;
        interfaceC3571se2 = interfaceC3571se;
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                if (tj3Var.m22120g(jl1Var)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i14 |= i6;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                i9 = i14 | 196608;
                f2 = f;
            } else {
                f2 = f;
                if (tj3Var.m22114d(f2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i14 | i8;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (tj3Var.m22120g(fa1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i9 |= i11;
                }
                i12 = i9;
                if ((i9 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i12 & 1, z)) {
                    e16VarM17643c = b16.f7762a;
                    if (i15 != 0) {
                        e16Var2 = e16VarM17643c;
                    }
                    if (i3 != 0) {
                        interfaceC3571se4 = nj0.f52812g;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    if (i5 != 0) {
                        jl1Var3 = hl1.f42565b;
                        i13 = i7;
                    } else {
                        i13 = i7;
                        jl1Var3 = jl1Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        fa1Var3 = null;
                    } else {
                        fa1Var3 = fa1Var;
                    }
                    p84Var = we1.f66679a;
                    if (str != null) {
                        tj3Var.m22111b0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objM22097O2 = tj3Var.m22097O();
                        if (z2) {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new jd0(str, 10);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1899381698);
                        tj3Var.m22139q(false);
                    }
                    e16 e16VarM23484B13 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = C3580sn.f61040g;
                        tj3Var.m22131l0(objM22097O);
                    }
                    ht5 ht5Var13 = (ht5) objM22097O;
                    int iHashCode13 = Long.hashCode(tj3Var.f62385T);
                    e16 e16VarM1322c13 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B13);
                    l77 l77VarM22132m13 = tj3Var.m22132m();
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5Var13);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m13);
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c13);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode13));
                    tj3Var.m22139q(true);
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se4;
                    jl1Var2 = jl1Var3;
                    fa1Var2 = fa1Var3;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    interfaceC3571se3 = interfaceC3571se2;
                    jl1Var2 = jl1Var;
                    fa1Var2 = fa1Var;
                }
                f3 = f2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: sz3
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i9 |= 1572864;
            i12 = i9;
            if ((i9 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i12 & 1, z)) {
                e16VarM17643c = b16.f7762a;
                if (i15 != 0) {
                    e16Var2 = e16VarM17643c;
                }
                if (i3 != 0) {
                    interfaceC3571se4 = nj0.f52812g;
                } else {
                    interfaceC3571se4 = interfaceC3571se2;
                }
                if (i5 != 0) {
                    jl1Var3 = hl1.f42565b;
                    i13 = i7;
                } else {
                    i13 = i7;
                    jl1Var3 = jl1Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    fa1Var3 = null;
                } else {
                    fa1Var3 = fa1Var;
                }
                p84Var = we1.f66679a;
                if (str != null) {
                    tj3Var.m22111b0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z2) {
                        objM22097O2 = new jd0(str, 10);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new jd0(str, 10);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1899381698);
                    tj3Var.m22139q(false);
                }
                e16 e16VarM23484B14 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = C3580sn.f61040g;
                    tj3Var.m22131l0(objM22097O);
                }
                ht5 ht5Var14 = (ht5) objM22097O;
                int iHashCode14 = Long.hashCode(tj3Var.f62385T);
                e16 e16VarM1322c14 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B14);
                l77 l77VarM22132m14 = tj3Var.m22132m();
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5Var14);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m14);
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c14);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode14));
                tj3Var.m22139q(true);
                e16Var3 = e16Var2;
                interfaceC3571se3 = interfaceC3571se4;
                jl1Var2 = jl1Var3;
                fa1Var2 = fa1Var3;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                interfaceC3571se3 = interfaceC3571se2;
                jl1Var2 = jl1Var;
                fa1Var2 = fa1Var;
            }
            f3 = f2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: sz3
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i14 |= 24576;
        i7 = i2 & 32;
        if (i7 != 0) {
            i9 = i14 | 196608;
            f2 = f;
        } else {
            f2 = f;
            if (tj3Var.m22114d(f2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i9 = i14 | i8;
        }
        i10 = i2 & 64;
        if (i10 != 0) {
            if ((1572864 & i) == 0) {
                if (tj3Var.m22120g(fa1Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i9 |= i11;
            }
            i12 = i9;
            if ((i9 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i12 & 1, z)) {
                e16VarM17643c = b16.f7762a;
                if (i15 != 0) {
                    e16Var2 = e16VarM17643c;
                }
                if (i3 != 0) {
                    interfaceC3571se4 = nj0.f52812g;
                } else {
                    interfaceC3571se4 = interfaceC3571se2;
                }
                if (i5 != 0) {
                    jl1Var3 = hl1.f42565b;
                    i13 = i7;
                } else {
                    i13 = i7;
                    jl1Var3 = jl1Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    fa1Var3 = null;
                } else {
                    fa1Var3 = fa1Var;
                }
                p84Var = we1.f66679a;
                if (str != null) {
                    tj3Var.m22111b0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z2) {
                        objM22097O2 = new jd0(str, 10);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new jd0(str, 10);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1899381698);
                    tj3Var.m22139q(false);
                }
                e16 e16VarM23484B15 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = C3580sn.f61040g;
                    tj3Var.m22131l0(objM22097O);
                }
                ht5 ht5Var15 = (ht5) objM22097O;
                int iHashCode15 = Long.hashCode(tj3Var.f62385T);
                e16 e16VarM1322c15 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B15);
                l77 l77VarM22132m15 = tj3Var.m22132m();
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5Var15);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m15);
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c15);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode15));
                tj3Var.m22139q(true);
                e16Var3 = e16Var2;
                interfaceC3571se3 = interfaceC3571se4;
                jl1Var2 = jl1Var3;
                fa1Var2 = fa1Var3;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                interfaceC3571se3 = interfaceC3571se2;
                jl1Var2 = jl1Var;
                fa1Var2 = fa1Var;
            }
            f3 = f2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: sz3
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i9 |= 1572864;
        i12 = i9;
        if ((i9 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i12 & 1, z)) {
            e16VarM17643c = b16.f7762a;
            if (i15 != 0) {
                e16Var2 = e16VarM17643c;
            }
            if (i3 != 0) {
                interfaceC3571se4 = nj0.f52812g;
            } else {
                interfaceC3571se4 = interfaceC3571se2;
            }
            if (i5 != 0) {
                jl1Var3 = hl1.f42565b;
                i13 = i7;
            } else {
                i13 = i7;
                jl1Var3 = jl1Var;
            }
            if (i13 != 0) {
                f2 = 1.0f;
            }
            if (i10 != 0) {
                fa1Var3 = null;
            } else {
                fa1Var3 = fa1Var;
            }
            p84Var = we1.f66679a;
            if (str != null) {
                tj3Var.m22111b0(1899222916);
                if ((i12 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objM22097O2 = tj3Var.m22097O();
                if (z2) {
                    objM22097O2 = new jd0(str, 10);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new jd0(str, 10);
                    tj3Var.m22131l0(objM22097O2);
                }
                e16VarM17643c = nv8.m17643c(e16VarM17643c, false, (vi3) objM22097O2);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1899381698);
                tj3Var.m22139q(false);
            }
            e16 e16VarM23484B16 = AbstractC3695vr.m23484B(pb1.m19046p(e16Var2.mo3161g(e16VarM17643c)), y27Var, interfaceC3571se4, jl1Var3, f2, fa1Var3, 2);
            objM22097O = tj3Var.m22097O();
            if (objM22097O == p84Var) {
                objM22097O = C3580sn.f61040g;
                tj3Var.m22131l0(objM22097O);
            }
            ht5 ht5Var16 = (ht5) objM22097O;
            int iHashCode16 = Long.hashCode(tj3Var.f62385T);
            e16 e16VarM1322c16 = AbstractC0287b.m1322c(tj3Var, e16VarM23484B16);
            l77 l77VarM22132m16 = tj3Var.m22132m();
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5Var16);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m16);
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c16);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode16));
            tj3Var.m22139q(true);
            e16Var3 = e16Var2;
            interfaceC3571se3 = interfaceC3571se4;
            jl1Var2 = jl1Var3;
            fa1Var2 = fa1Var3;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            interfaceC3571se3 = interfaceC3571se2;
            jl1Var2 = jl1Var;
            fa1Var2 = fa1Var;
        }
        f3 = f2;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: sz3
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bq1.m4042R(y27Var, str, e16Var3, interfaceC3571se3, jl1Var2, f3, fa1Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: S */
    public static final void m4043S(ui3 ui3Var, e16 e16Var, boolean z, o39 o39Var, mn0 mn0Var, C0233h c0233h, vf0 vf0Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        vf0 vf0VarM21971D;
        tj3 tj3Var;
        boolean z2;
        vf0 vf0Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1401605899);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 |= tj3Var2.m22120g(o39Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= tj3Var2.m22120g(mn0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= tj3Var2.m22120g(c0233h) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                vf0VarM21971D = vf0Var;
                int i5 = tj3Var2.m22120g(vf0VarM21971D) ? 1048576 : 524288;
                i4 |= i5;
            } else {
                vf0VarM21971D = vf0Var;
            }
            i4 |= i5;
        } else {
            vf0VarM21971D = vf0Var;
        }
        int i6 = i4 | 12582912;
        if ((100663296 & i) == 0) {
            i6 |= tj3Var2.m22124i(c0282a) ? 67108864 : 33554432;
        }
        boolean z3 = true;
        if (tj3Var2.m22099R(i6 & 1, (38347923 & i6) != 38347922)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
                if ((i2 & 64) != 0) {
                    i6 &= -3670017;
                }
                z3 = z;
            } else if ((i2 & 64) != 0) {
                vf0VarM21971D = te1.m21971D(true, tj3Var2, 0);
                i6 &= -3670017;
            }
            vf0 vf0Var3 = vf0VarM21971D;
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            m4038N(ui3Var, e16Var, z3, o39Var, mn0Var, c0233h, vf0Var3, c0282a, tj3Var, i6 & 268435454, 0);
            z2 = z3;
            vf0Var2 = vf0Var3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            z2 = z;
            vf0Var2 = vf0VarM21971D;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var, mn0Var, c0233h, vf0Var2, c0282a, i, i2, 0);
        }
    }

    /* JADX INFO: renamed from: T */
    public static final void m4044T(e16 e16Var, o39 o39Var, mn0 mn0Var, C0233h c0233h, vf0 vf0Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        C0233h c0233h2;
        C0233h c0233h3;
        C0233h c0233h4;
        C0233h c0233h5;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1945643296);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(o39Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22120g(mn0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                c0233h2 = c0233h;
                int i4 = tj3Var.m22120g(c0233h2) ? 2048 : 1024;
                i3 |= i4;
            } else {
                c0233h2 = c0233h;
            }
            i3 |= i4;
        } else {
            c0233h2 = c0233h;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22120g(vf0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= tj3Var.m22124i(c0282a) ? 131072 : 65536;
        }
        if (tj3Var.m22099R(i3 & 1, (74899 & i3) != 74898)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                if ((i2 & 8) != 0) {
                    c0233h4 = new C0233h(0.0f, 0.0f, 0.0f, 0.0f, e07.m10781c(), 0.0f);
                    i3 &= -7169;
                } else {
                    c0233h4 = c0233h2;
                }
                c0233h5 = c0233h4;
            } else {
                tj3Var.m22102U();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                c0233h5 = c0233h2;
            }
            tj3Var.m22140r();
            m4039O(e16Var, o39Var, mn0Var, c0233h5, vf0Var, c0282a, tj3Var, i3 & 524286, 0);
            c0233h3 = c0233h5;
        } else {
            tj3Var.m22102U();
            c0233h3 = c0233h2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xn0(e16Var, o39Var, mn0Var, c0233h3, vf0Var, c0282a, i, i2, 0);
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m4045U(final oq6 oq6Var, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final e16 e16Var, ye1 ye1Var, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var.m22120g(oq6Var) : tj3Var.m22124i(oq6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22116e(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22122h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 1048576 : 524288;
        }
        if (tj3Var.m22099R(i2 & 1, (533651 & i2) != 533650)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                tj3Var.m22102U();
                i3 = i2 & (-57345);
                j3 = j;
            }
            tj3Var.m22140r();
            if (z) {
                C0427g c0427g = dv8.f36273a;
                z3 = (resolvedTextDirection == ResolvedTextDirection.Ltr && !z2) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            } else {
                C0427g c0427g2 = dv8.f36273a;
                z3 = (resolvedTextDirection != ResolvedTextDirection.Ltr || z2) && !(resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            }
            dc0 dc0Var = z3 ? AbstractC3184kh.f47261c : AbstractC3184kh.f47260b;
            int i4 = i3 & 14;
            boolean zM22122h = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && tj3Var.m22124i(oq6Var))) | tj3Var.m22122h(z3);
            Object objM22097O = tj3Var.m22097O();
            if (zM22122h || objM22097O == we1.f66679a) {
                objM22097O = new vi3() { // from class: fk
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        tv8 tv8Var = (tv8) obj;
                        long jMo18206a = oq6Var.mo18206a();
                        tv8Var.mo3709d(dv8.f36273a, new cv8(z ? Handle.SelectionStart : Handle.SelectionEnd, jMo18206a, z3 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & jMo18206a) != 9205357640488583168L));
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            final e16 e16VarM17643c = nv8.m17643c(e16Var, false, (vi3) objM22097O);
            final hta htaVar = (hta) tj3Var.m22128k(AbstractC0402n.f4829u);
            long j4 = j3;
            dc0 dc0Var2 = dc0Var;
            j2 = j4;
            m4040P(oq6Var, dc0Var2, ci8.m4703P(1365123137, new zi3() { // from class: gk
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        pvc.m19507c(AbstractC0402n.f4829u.mo1265a(htaVar), ci8.m4703P(1260045569, new C3114ik(j2, z3, e16VarM17643c, oq6Var), tj3Var2), tj3Var2, 56);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, i4 | 384);
        } else {
            tj3Var.m22102U();
            j2 = j;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final long j5 = j2;
            x18VarM22143u.f67642d = new zi3() { // from class: hk
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bq1.m4045U(oq6Var, z, resolvedTextDirection, z2, j5, f, e16Var, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: V */
    public static final void m4046V(e16 e16Var, ui3 ui3Var, boolean z, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2111672474);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            C0427g c0427g = dv8.f36273a;
            thb.m22044c(tj3Var, AbstractC0287b.m1320a(c99.m4423p(e16Var, 25.0f, 25.0f), new C3187kk(ui3Var, z)));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3493qd(e16Var, ui3Var, z, i);
        }
    }

    /* JADX INFO: renamed from: W */
    public static final String m4047W(Object[] objArr, int i, int i2, AbstractC2985f1 abstractC2985f1) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC2985f1) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: X */
    public static final String m4048X(String str, String str2) {
        str.getClass();
        return ((Object) str2) + "_" + str;
    }

    /* JADX INFO: renamed from: Y */
    public static final e28 m4049Y(aq4 aq4Var) {
        aq4 aq4VarMo1662D = aq4Var.mo1662D();
        return aq4VarMo1662D != null ? aq4VarMo1662D.mo1670Q(aq4Var, true) : new e28(0.0f, 0.0f, (int) (aq4Var.mo1687j() >> 32), (int) (aq4Var.mo1687j() & 4294967295L));
    }

    /* JADX INFO: renamed from: Z */
    public static final e28 m4050Z(aq4 aq4Var, boolean z) {
        aq4 aq4VarM4054e0 = m4054e0(aq4Var);
        float fMo1687j = (int) (aq4VarM4054e0.mo1687j() >> 32);
        float fMo1687j2 = (int) (aq4VarM4054e0.mo1687j() & 4294967295L);
        e28 e28VarMo1670Q = aq4VarM4054e0.mo1670Q(aq4Var, z);
        float f = e28VarMo1670Q.f36620a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fMo1687j) {
                f = fMo1687j;
            }
        }
        float f2 = e28VarMo1670Q.f36621b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fMo1687j2) {
                f2 = fMo1687j2;
            }
        }
        float f3 = e28VarMo1670Q.f36622c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fMo1687j) {
                fMo1687j = f3;
            }
            f3 = fMo1687j;
        }
        float f4 = e28VarMo1670Q.f36623d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fMo1687j2) {
                fMo1687j2 = f5;
            }
            f4 = fMo1687j2;
        }
        if (f == f3 || f2 == f4) {
            return e28.f36619e;
        }
        long jMo1680d = aq4VarM4054e0.mo1680d((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo1680d2 = aq4VarM4054e0.mo1680d((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo1680d3 = aq4VarM4054e0.mo1680d((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jMo1680d4 = aq4VarM4054e0.mo1680d((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo1680d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo1680d2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo1680d4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo1680d3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo1680d & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo1680d2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo1680d4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo1680d3 & 4294967295L));
        return new e28(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: a0 */
    public static final boolean m4051a0(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !fa4.m11650l(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!m4051a0((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!AbstractC3550rv.m20824R((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public static final int m4052b0(Bundle bundle) {
        int iHashCode;
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                iHashCode = m4052b0((Bundle) obj);
            } else if (obj instanceof Object[]) {
                iHashCode = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) obj);
            } else {
                iHashCode = obj != null ? obj.hashCode() : 0;
            }
            i = (i * 31) + iHashCode;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: c0 */
    public static final C3185ki m4053c0(C0296c c0296c, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        C3185ki c3185kiM21987a = wfb.f66775k;
        C3459pg c3459pgM15936a = wfb.f66776l;
        an0 an0Var = wfb.f66777m;
        if (c3185kiM21987a == null || c3459pgM15936a == null) {
            c3185kiM21987a = te1.m21987a(iCeil, iCeil, 1);
            wfb.f66775k = c3185kiM21987a;
            c3459pgM15936a = l70.m15936a(c3185kiM21987a);
            wfb.f66776l = c3459pgM15936a;
        } else {
            Bitmap bitmap = c3185kiM21987a.f47311a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                c3185kiM21987a = te1.m21987a(iCeil, iCeil, 1);
                wfb.f66775k = c3185kiM21987a;
                c3459pgM15936a = l70.m15936a(c3185kiM21987a);
                wfb.f66776l = c3459pgM15936a;
            }
        }
        C3185ki c3185ki = c3185kiM21987a;
        C3459pg c3459pg = c3459pgM15936a;
        if (an0Var == null) {
            an0Var = new an0();
            wfb.f66777m = an0Var;
        }
        an0 an0Var2 = an0Var;
        zm0 zm0Var = an0Var2.f852a;
        LayoutDirection layoutDirection = c0296c.f3864a.getLayoutDirection();
        Bitmap bitmap2 = c3185ki.f47311a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        fb2 fb2Var = zm0Var.f71734a;
        LayoutDirection layoutDirection2 = zm0Var.f71735b;
        ym0 ym0Var = zm0Var.f71736c;
        long j = zm0Var.f71737d;
        zm0Var.f71734a = c0296c;
        zm0Var.f71735b = layoutDirection;
        zm0Var.f71736c = c3459pg;
        zm0Var.f71737d = jFloatToRawIntBits;
        c3459pg.mo17016h();
        InterfaceC0310a.m1414L0(an0Var2, aa1.f403b, 0L, an0Var2.mo1422h(), 0.0f, null, 0, 58);
        InterfaceC0310a.m1414L0(an0Var2, d32.m10037f(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, 0, 120);
        InterfaceC0310a.m1417c0(an0Var2, d32.m10037f(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, 120);
        c3459pg.mo17024p();
        zm0Var.f71734a = fb2Var;
        zm0Var.f71735b = layoutDirection2;
        zm0Var.f71736c = ym0Var;
        zm0Var.f71737d = j;
        return c3185ki;
    }

    /* JADX INFO: renamed from: e0 */
    public static final aq4 m4054e0(aq4 aq4Var) {
        aq4 aq4Var2;
        aq4 aq4VarMo1662D = aq4Var.mo1662D();
        while (true) {
            aq4 aq4Var3 = aq4VarMo1662D;
            aq4Var2 = aq4Var;
            aq4Var = aq4Var3;
            if (aq4Var == null) {
                break;
            }
            aq4VarMo1662D = aq4Var.mo1662D();
        }
        AbstractC0362l abstractC0362l = aq4Var2 instanceof AbstractC0362l ? (AbstractC0362l) aq4Var2 : null;
        if (abstractC0362l == null) {
            return aq4Var2;
        }
        AbstractC0362l abstractC0362l2 = abstractC0362l.f4434L;
        while (true) {
            AbstractC0362l abstractC0362l3 = abstractC0362l2;
            AbstractC0362l abstractC0362l4 = abstractC0362l;
            abstractC0362l = abstractC0362l3;
            if (abstractC0362l == null) {
                return abstractC0362l4;
            }
            abstractC0362l2 = abstractC0362l.f4434L;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static ny8 m4055f0() {
        if (f8859h == null) {
            synchronized (f8858g) {
                try {
                    if (f8859h == null) {
                        f8859h = new ny8(13);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8859h;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m4056g0(kn1 kn1Var, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).f47748a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) kn1Var.get(s46.f60287b);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.mo1248p(kn1Var, th);
            } else {
                k9d.m15028b(kn1Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                lda.m16117c(runtimeException, th);
                th = runtimeException;
            }
            k9d.m15028b(kn1Var, th);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final String m4057h0(ReaderFont readerFont) {
        readerFont.getClass();
        switch (zv7.f72283a[readerFont.ordinal()]) {
            case 1:
                return "DmSans";
            case 2:
                return "DmSansBold";
            case 3:
                return "Rubik";
            case 4:
                return "RubikBold";
            case 5:
                return "System";
            case 6:
                return "SystemBold";
            case 7:
                return "Adys";
            case 8:
                return "NewYork";
            case 9:
                return "Spectral";
            case 10:
                return "Lora";
            case 11:
                return "Poppins";
            case 12:
                return "Inter";
            case 13:
                return "Bodoni";
            case 14:
                return "OpenSans";
            case 15:
                return "NotoSansJapanese";
            case 16:
                return "NotoSansJapaneseBold";
            case 17:
                return "NotoSerifJapanese";
            case 18:
                return "NotoSerifJapaneseBold";
            case 19:
                return "NotoSansArabic";
            case 20:
                return "NotoNaskhArabic";
            case 21:
                return "NotoKufiArabic";
            case 22:
                return "NotoSansSimplifiedChinese";
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "NotoSansSimplifiedChineseBold";
            case 24:
                return "NotoSerifSimplifiedChinese";
            case 25:
                return "NotoSerifSimplifiedChineseBold";
            case 26:
                return "NotoSansCantonese";
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return "NotoSansCantoneseBold";
            case 28:
                return "NotoSerifCantonese";
            case 29:
                return "NotoSerifCantoneseBold";
            case 30:
                return "Sunflower";
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return "SunflowerBold";
            case 32:
                return "NotoSansChineseTraditional";
            case 33:
                return "NotoSansChineseTraditionalBold";
            case 34:
                return "NotoSerifChineseTraditional";
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                return "NotoSerifChineseTraditionalBold";
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return "NotoSansKorea";
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                return "NotoSansKoreaBold";
            case 38:
                return "NotoSerifKorea";
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return "NotoSerifKoreaBold";
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                return "NanumGothicCoding";
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return "NanumGothicCodingBold";
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final boolean m4058i0(ReaderFont readerFont) {
        readerFont.getClass();
        return AbstractC3550rv.m20855w0(new ReaderFont[]{ReaderFont.DmSans, ReaderFont.DmSansBold, ReaderFont.Rubik, ReaderFont.RubikBold, ReaderFont.System, ReaderFont.SystemBold, ReaderFont.Adys, ReaderFont.NewYork, ReaderFont.Spectral, ReaderFont.Lora, ReaderFont.Poppins, ReaderFont.Inter, ReaderFont.Bodoni, ReaderFont.OpenSans, ReaderFont.NotoSansJapanese, ReaderFont.NotoSansArabic, ReaderFont.NotoSansSimplifiedChinese, ReaderFont.NotoSansCantonese, ReaderFont.NotoSansChineseTraditional, ReaderFont.NotoSansKorea}).contains(readerFont);
    }

    /* JADX INFO: renamed from: j0 */
    public static final e16 m4059j0(pt4 pt4Var, ii0 ii0Var, boolean z, Orientation orientation) {
        return new kt4(pt4Var, ii0Var, z, orientation);
    }

    /* JADX INFO: renamed from: k0 */
    public static final k39 m4060k0(k39 k39Var, k39 k39Var2, float f) {
        k39Var.getClass();
        k39Var2.getClass();
        float fM18232Q = AbstractC3423or.m18232Q(ak2.m524a(0L), ak2.m524a(0L), f);
        float fM18232Q2 = AbstractC3423or.m18232Q(ak2.m525b(0L), ak2.m525b(0L), f);
        Float.floatToRawIntBits(fM18232Q);
        Float.floatToRawIntBits(fM18232Q2);
        d32.m10026X(0L, 0L, f);
        throw null;
    }

    /* JADX INFO: renamed from: l0 */
    public static String m4061l0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            C3386nv.m17626m("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m0 */
    public static final String m4062m0(String str, String str2) {
        str.getClass();
        str2.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(str2);
        localeForLanguageTag.getClass();
        String lowerCase = str.toLowerCase(localeForLanguageTag);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX INFO: renamed from: n0 */
    public static final String m4063n0(String str, Locale locale) {
        str.getClass();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX INFO: renamed from: q0 */
    public static String m4064q0(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        ?? r3;
        FileInputStream fileInputStream;
        ?? bufferedReader;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    String string = sb.toString();
                                    ifd.m13884a(fileInputStream);
                                    ifd.m13884a(inputStreamReader);
                                    ifd.m13884a(bufferedReader);
                                    return string;
                                }
                                sb.append(line);
                                th = th;
                                fileInputStream2 = fileInputStream;
                                r3 = bufferedReader;
                                ifd.m13884a(fileInputStream2);
                                ifd.m13884a(inputStreamReader);
                                ifd.m13884a(r3);
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader;
                            eh0.m11136q("IterableUtilImpl", "Error while reading file: " + file.toString(), e);
                            ifd.m13884a(fileInputStream);
                            ifd.m13884a(inputStreamReader);
                            ifd.m13884a(bufferedReader);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader = 0;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = 0;
                }
            } catch (Exception e3) {
                e = e3;
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                eh0.m11136q("IterableUtilImpl", "Error while reading file: " + file.toString(), e);
                ifd.m13884a(fileInputStream);
                ifd.m13884a(inputStreamReader);
                ifd.m13884a(bufferedReader);
                return null;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                bufferedReader = 0;
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            r3 = 0;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static final ArrayList m4065r0(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        cg7 cg7Var = new cg7(arrayList, 27);
        try {
            Iterator it = new aj1(new jd5(bufferedReader, 0)).iterator();
            while (it.hasNext()) {
                cg7Var.invoke(it.next());
            }
            bufferedReader.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3584sr.m21646y(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static final String m4066s0(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: t0 */
    public static final View m4067t0(ea2 ea2Var) {
        if (!((d16) ea2Var).f34837a.f34836I) {
            i54.m13663b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) pq4.m19457a(te1.m21979L(ea2Var));
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m4068u0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m4069x0(File file, String str) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return true;
        } catch (Exception e) {
            eh0.m11136q("IterableUtilImpl", "Error while writing to file: " + file.toString(), e);
            return false;
        }
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: D */
    public Object mo4070D(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (kSerializer.getDescriptor().mo11826c() || mo4098y()) {
            return mo15604w(kSerializer);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: E */
    public Decoder mo4071E(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: F */
    public double mo4072F(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return mo4078M();
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: G */
    public Object mo4073G(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        return mo15604w(kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: H */
    public abstract byte mo4074H();

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: I */
    public abstract short mo4075I();

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: J */
    public float mo4076J() {
        m4081d0();
        throw null;
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: L */
    public float mo4077L(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return mo4076J();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: M */
    public double mo4078M() {
        m4081d0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: b */
    public df1 mo4079b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: d */
    public Decoder mo4080d(vj7 vj7Var, int i) {
        vj7Var.getClass();
        return mo4071E(vj7Var.mo3700i(i));
    }

    /* JADX INFO: renamed from: d0 */
    public void m4081d0() {
        throw new SerializationException(y38.m24933a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: e */
    public boolean mo4082e() {
        m4081d0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: f */
    public char mo4083f() {
        m4081d0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: h */
    public int mo4084h(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        m4081d0();
        throw null;
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: i */
    public long mo4085i(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return mo4093u();
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: j */
    public void mo4086j(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: k */
    public char mo4087k(vj7 vj7Var, int i) {
        vj7Var.getClass();
        return mo4083f();
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: m */
    public byte mo4088m(vj7 vj7Var, int i) {
        vj7Var.getClass();
        return mo4074H();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: n */
    public abstract int mo4089n();

    @Override // p000.df1
    /* JADX INFO: renamed from: o */
    public short mo4090o(vj7 vj7Var, int i) {
        vj7Var.getClass();
        return mo4075I();
    }

    /* JADX INFO: renamed from: o0 */
    public abstract View mo293o0(int i);

    /* JADX INFO: renamed from: p0 */
    public abstract boolean mo294p0();

    @Override // p000.df1
    /* JADX INFO: renamed from: q */
    public int mo4091q(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return mo4089n();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: s */
    public String mo4092s() {
        m4081d0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: u */
    public abstract long mo4093u();

    @Override // p000.df1
    /* JADX INFO: renamed from: v */
    public boolean mo4094v(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return mo4082e();
    }

    /* JADX INFO: renamed from: v0 */
    public abstract Object mo4095v0(Object obj, Continuation continuation);

    /* JADX INFO: renamed from: w0 */
    public abstract Object mo4096w0(List list, Continuation continuation);

    @Override // p000.df1
    /* JADX INFO: renamed from: x */
    public String mo4097x(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return mo4092s();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: y */
    public boolean mo4098y() {
        return true;
    }
}
