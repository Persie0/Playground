package p000;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.input.internal.AbstractC0190d;
import androidx.compose.foundation.text.input.internal.C0189c;
import androidx.compose.foundation.text.selection.C0205f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes.dex */
public final class zw4 {

    /* JADX INFO: renamed from: a */
    public final View f72297a;

    /* JADX INFO: renamed from: b */
    public final b64 f72298b;

    /* JADX INFO: renamed from: e */
    public yw4 f72301e;

    /* JADX INFO: renamed from: f */
    public C0205f f72302f;

    /* JADX INFO: renamed from: g */
    public hta f72303g;

    /* JADX INFO: renamed from: l */
    public Rect f72308l;

    /* JADX INFO: renamed from: m */
    public final C0189c f72309m;

    /* JADX INFO: renamed from: c */
    public vi3 f72299c = new qy3(26);

    /* JADX INFO: renamed from: d */
    public vi3 f72300d = new qy3(27);

    /* JADX INFO: renamed from: h */
    public vv9 f72304h = new vv9("", 4, cx9.f34692b);

    /* JADX INFO: renamed from: i */
    public w04 f72305i = w04.f66163g;

    /* JADX INFO: renamed from: j */
    public final ArrayList f72306j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final cs4 f72307k = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new C3539rk(this, 28));

    public zw4(View view, vi3 vi3Var, b64 b64Var) {
        this.f72297a = view;
        this.f72298b = b64Var;
        this.f72309m = new C0189c(vi3Var, b64Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[PHI: r15
      0x00a5: PHI (r15v5 int) = (r15v0 int), (r15v4 int) binds: [B:36:0x00a3, B:48:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public final c28 m25811a(EditorInfo editorInfo) {
        int i;
        int i2;
        vv9 vv9Var = this.f72304h;
        String str = vv9Var.f65990a.f54604b;
        long j = vv9Var.f65991b;
        w04 w04Var = this.f72305i;
        int i3 = w04Var.f66168e;
        int i4 = w04Var.f66167d;
        boolean z = w04Var.f66164a;
        int i5 = 3;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                C3386nv.m17633t("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        xi5 xi5Var = w04Var.f66169f;
        if (fa4.m11650l(xi5Var, xi5.f68250c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(v91.m23189q0(xi5Var, 10));
            Iterator it = xi5Var.f68251a.iterator();
            while (it.hasNext()) {
                arrayList.add(((ti5) it.next()).f62341a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = i5;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else {
                    i5 = 18;
                    if (i4 == 8) {
                        i2 = i5;
                    } else if (i4 == 9) {
                        i2 = 8194;
                    } else if (i4 == 10) {
                        i2 = 145;
                    } else if (i4 == 11) {
                        i2 = 113;
                    } else if (i4 == 12) {
                        i2 = 97;
                    } else if (i4 == 13) {
                        i2 = 49;
                    } else if (i4 == 14) {
                        i2 = 65;
                    } else if (i4 == 15) {
                        i2 = 81;
                    } else if (i4 == 16) {
                        i2 = 177;
                    } else if (i4 == 17) {
                        i2 = 193;
                    } else if (i4 == 18) {
                        i2 = 4;
                    } else {
                        i2 = 20;
                        if (i4 != 19) {
                            if (i4 == 20) {
                                i2 = 36;
                            } else if (i4 == 21) {
                                i2 = 4098;
                            } else if (i4 == 22) {
                                i2 = 12290;
                            } else if (i4 == 23) {
                                i2 = 8210;
                            } else if (i4 == 24) {
                                i2 = 4114;
                            } else {
                                if (i4 != 25) {
                                    C3386nv.m17633t("Invalid Keyboard Type");
                                    return null;
                                }
                                i2 = 12306;
                            }
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (w04Var.f66168e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 15) == 1) {
            int i7 = w04Var.f66165b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | 4096;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | 8192;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (w04Var.f66166c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i8 = cx9.f34693c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        ybd.m25060c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!jm9.f45838a || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            ybd.m25061d(editorInfo, false);
        } else {
            ybd.m25061d(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(vz1.m23605K(AbstractC3461pi.m19164m(), AbstractC3461pi.m19148A(), AbstractC3461pi.m19175x(), AbstractC3461pi.m19177z(), AbstractC3461pi.m19149B(), AbstractC3461pi.m19150C(), AbstractC3461pi.m19151D()));
            editorInfo.setSupportedHandwritingGesturePreviews(AbstractC3550rv.m20855w0(new Class[]{AbstractC3461pi.m19164m(), AbstractC3461pi.m19148A(), AbstractC3461pi.m19175x(), AbstractC3461pi.m19177z()}));
        }
        vi3 vi3Var = AbstractC0190d.f2964a;
        if (pq2.m19449d()) {
            pq2.m19448a().m19456i(editorInfo);
        }
        c28 c28Var = new c28(this.f72304h, new or3(this), this.f72305i.f66166c, this.f72301e, this.f72302f, this.f72303g);
        this.f72306j.add(new WeakReference(c28Var));
        return c28Var;
    }
}
