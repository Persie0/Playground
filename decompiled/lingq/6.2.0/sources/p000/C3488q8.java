package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$styleable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: loaded from: classes.dex */
public class C3488q8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57367a;

    /* JADX INFO: renamed from: b */
    public int f57368b;

    /* JADX INFO: renamed from: c */
    public Object f57369c;

    /* JADX INFO: renamed from: d */
    public Object f57370d;

    /* JADX INFO: renamed from: e */
    public Object f57371e;

    /* JADX INFO: renamed from: f */
    public Object f57372f;

    /* JADX INFO: renamed from: g */
    public Object f57373g;

    public C3488q8(ck6 ck6Var) {
        this.f57367a = 0;
        this.f57369c = new jh7(30);
        this.f57370d = new ArrayList();
        this.f57371e = new ArrayList();
        this.f57368b = 0;
        this.f57372f = ck6Var;
        this.f57373g = new cc4(this);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m19714s(C3488q8 c3488q8, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = c3488q8.f57368b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        c3488q8.m19750r(str, i, str2);
        throw null;
    }

    /* JADX INFO: renamed from: A */
    public void m19715A() {
        this.f57368b = -1;
        m19725K(null);
        m19734b();
    }

    /* JADX INFO: renamed from: B */
    public void m19716B(int i) {
        ColorStateList colorStateListM178g;
        this.f57368b = i;
        C2893cq c2893cq = (C2893cq) this.f57370d;
        if (c2893cq != null) {
            Context context = ((View) this.f57369c).getContext();
            synchronized (c2893cq) {
                colorStateListM178g = c2893cq.f34366a.m178g(context, i);
            }
        } else {
            colorStateListM178g = null;
        }
        m19725K(colorStateListM178g);
        m19734b();
    }

    /* JADX INFO: renamed from: C */
    public String m19717C(String str, boolean z) {
        str.getClass();
        int i = this.f57368b;
        try {
            if (m19739g() == 6 && fa4.m11650l(m19719E(z), str)) {
                this.f57371e = null;
                if (m19739g() == 5) {
                    return m19719E(z);
                }
            }
            return null;
        } finally {
            this.f57368b = i;
            this.f57371e = null;
        }
    }

    /* JADX INFO: renamed from: D */
    public byte m19718D() {
        String str = (String) this.f57373g;
        int i = this.f57368b;
        while (true) {
            int iM19722H = m19722H(i);
            if (iM19722H == -1) {
                this.f57368b = iM19722H;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM19722H);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f57368b = iM19722H;
                return d32.m10008F(cCharAt);
            }
            i = iM19722H + 1;
        }
    }

    /* JADX INFO: renamed from: E */
    public String m19719E(boolean z) {
        String strM19744l;
        byte bM19718D = m19718D();
        if (z) {
            if (bM19718D != 1 && bM19718D != 0) {
                return null;
            }
            strM19744l = m19745m();
        } else {
            if (bM19718D != 1) {
                return null;
            }
            strM19744l = m19744l();
        }
        this.f57371e = strM19744l;
        return strM19744l;
    }

    /* JADX INFO: renamed from: F */
    public void m19720F(C3451p8 c3451p8) {
        ck6 ck6Var = (ck6) this.f57372f;
        ((ArrayList) this.f57371e).add(c3451p8);
        int i = c3451p8.f55717a;
        if (i == 1) {
            ck6Var.m4811u(c3451p8.f55718b, c3451p8.f55719c);
            return;
        }
        if (i == 2) {
            ck6Var.m4814x(c3451p8.f55718b, c3451p8.f55719c);
            return;
        }
        if (i == 4) {
            ck6Var.m4810t(c3451p8.f55718b, c3451p8.f55719c);
        } else if (i == 8) {
            ck6Var.m4812v(c3451p8.f55718b, c3451p8.f55719c);
        } else {
            v63.m23142t(c3451p8, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0188  */
    /* JADX WARN: Code duplicated, block: B:103:0x018c  */
    /* JADX WARN: Code duplicated, block: B:185:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124  */
    /* JADX WARN: Code duplicated, block: B:77:0x012a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Code duplicated, block: B:88:0x0153  */
    /* JADX WARN: Code duplicated, block: B:90:0x0159  */
    /* JADX WARN: Code duplicated, block: B:93:0x0164  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f  */
    /* JADX WARN: Code duplicated, block: B:99:0x017a  */
    /* JADX INFO: renamed from: G */
    public void m19721G() {
        int i;
        boolean z;
        byte b;
        C3451p8 c3451p8M19757z;
        int i2;
        int i3;
        int i4;
        C3451p8 c3451p8M19757z2;
        boolean z2;
        boolean z3;
        C3451p8 c3451p8M19757z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        jh7 jh7Var = (jh7) this.f57369c;
        ck6 ck6Var = (ck6) this.f57372f;
        cc4 cc4Var = (cc4) this.f57373g;
        ArrayList arrayList = (ArrayList) this.f57370d;
        cc4Var.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C3451p8) arrayList.get(size)).f55717a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i13 = size + 1;
            C3488q8 c3488q8 = (C3488q8) cc4Var.f9881a;
            jh7 jh7Var2 = (jh7) c3488q8.f57369c;
            C3451p8 c3451p8 = (C3451p8) arrayList.get(size);
            C3451p8 c3451p9 = (C3451p8) arrayList.get(i13);
            int i14 = c3451p9.f55717a;
            if (i14 == 1) {
                int i15 = c3451p8.f55719c;
                int i16 = c3451p9.f55718b;
                int i17 = i15 < i16 ? -1 : 0;
                int i18 = c3451p8.f55718b;
                if (i18 < i16) {
                    i17++;
                }
                if (i16 <= i18) {
                    c3451p8.f55718b = i18 + c3451p9.f55719c;
                }
                int i19 = c3451p9.f55718b;
                if (i19 <= i15) {
                    c3451p8.f55719c = i15 + c3451p9.f55719c;
                }
                c3451p9.f55718b = i19 + i17;
                arrayList.set(size, c3451p9);
                arrayList.set(i13, c3451p8);
            } else if (i14 == 2) {
                int i20 = c3451p8.f55718b;
                int i21 = c3451p8.f55719c;
                int i22 = c3451p9.f55718b;
                if (i20 < i21) {
                    z2 = i22 == i20 && c3451p9.f55719c == i21 - i20;
                    z3 = false;
                } else {
                    z2 = i22 == i21 + 1 && c3451p9.f55719c == i20 - i21;
                    z3 = true;
                }
                if (i21 < i22) {
                    c3451p9.f55718b = i22 - 1;
                } else {
                    int i23 = c3451p9.f55719c;
                    if (i21 < i22 + i23) {
                        c3451p9.f55719c = i23 - 1;
                        c3451p8.f55717a = 2;
                        c3451p8.f55719c = 1;
                        if (c3451p9.f55719c == 0) {
                            arrayList.remove(i13);
                            jh7Var2.mo14460c(c3451p9);
                        }
                    }
                }
                int i24 = c3451p8.f55718b;
                int i25 = c3451p9.f55718b;
                if (i24 <= i25) {
                    c3451p9.f55718b = i25 + 1;
                } else {
                    int i26 = i25 + c3451p9.f55719c;
                    if (i24 < i26) {
                        c3451p8M19757z3 = c3488q8.m19757z(2, i24 + 1, i26 - i24);
                        c3451p9.f55719c = c3451p8.f55718b - c3451p9.f55718b;
                    }
                    if (z2) {
                        arrayList.set(size, c3451p9);
                        arrayList.remove(i13);
                        jh7Var2.mo14460c(c3451p8);
                    } else {
                        if (z3) {
                            if (c3451p8M19757z3 != null) {
                                i11 = c3451p8.f55718b;
                                if (i11 > c3451p8M19757z3.f55718b) {
                                    c3451p8.f55718b = i11 - c3451p8M19757z3.f55719c;
                                }
                                i12 = c3451p8.f55719c;
                                if (i12 > c3451p8M19757z3.f55718b) {
                                    c3451p8.f55719c = i12 - c3451p8M19757z3.f55719c;
                                }
                            }
                            i9 = c3451p8.f55718b;
                            if (i9 > c3451p9.f55718b) {
                                c3451p8.f55718b = i9 - c3451p9.f55719c;
                            }
                            i10 = c3451p8.f55719c;
                            if (i10 > c3451p9.f55718b) {
                                c3451p8.f55719c = i10 - c3451p9.f55719c;
                            }
                        } else {
                            if (c3451p8M19757z3 != null) {
                                i7 = c3451p8.f55718b;
                                if (i7 >= c3451p8M19757z3.f55718b) {
                                    c3451p8.f55718b = i7 - c3451p8M19757z3.f55719c;
                                }
                                i8 = c3451p8.f55719c;
                                if (i8 >= c3451p8M19757z3.f55718b) {
                                    c3451p8.f55719c = i8 - c3451p8M19757z3.f55719c;
                                }
                            }
                            i5 = c3451p8.f55718b;
                            if (i5 >= c3451p9.f55718b) {
                                c3451p8.f55718b = i5 - c3451p9.f55719c;
                            }
                            i6 = c3451p8.f55719c;
                            if (i6 >= c3451p9.f55718b) {
                                c3451p8.f55719c = i6 - c3451p9.f55719c;
                            }
                        }
                        arrayList.set(size, c3451p9);
                        if (c3451p8.f55718b != c3451p8.f55719c) {
                            arrayList.set(i13, c3451p8);
                        } else {
                            arrayList.remove(i13);
                        }
                        if (c3451p8M19757z3 != null) {
                            arrayList.add(size, c3451p8M19757z3);
                        }
                    }
                }
                c3451p8M19757z3 = null;
                if (z2) {
                    arrayList.set(size, c3451p9);
                    arrayList.remove(i13);
                    jh7Var2.mo14460c(c3451p8);
                } else {
                    if (z3) {
                        if (c3451p8M19757z3 != null) {
                            i11 = c3451p8.f55718b;
                            if (i11 > c3451p8M19757z3.f55718b) {
                                c3451p8.f55718b = i11 - c3451p8M19757z3.f55719c;
                            }
                            i12 = c3451p8.f55719c;
                            if (i12 > c3451p8M19757z3.f55718b) {
                                c3451p8.f55719c = i12 - c3451p8M19757z3.f55719c;
                            }
                        }
                        i9 = c3451p8.f55718b;
                        if (i9 > c3451p9.f55718b) {
                            c3451p8.f55718b = i9 - c3451p9.f55719c;
                        }
                        i10 = c3451p8.f55719c;
                        if (i10 > c3451p9.f55718b) {
                            c3451p8.f55719c = i10 - c3451p9.f55719c;
                        }
                    } else {
                        if (c3451p8M19757z3 != null) {
                            i7 = c3451p8.f55718b;
                            if (i7 >= c3451p8M19757z3.f55718b) {
                                c3451p8.f55718b = i7 - c3451p8M19757z3.f55719c;
                            }
                            i8 = c3451p8.f55719c;
                            if (i8 >= c3451p8M19757z3.f55718b) {
                                c3451p8.f55719c = i8 - c3451p8M19757z3.f55719c;
                            }
                        }
                        i5 = c3451p8.f55718b;
                        if (i5 >= c3451p9.f55718b) {
                            c3451p8.f55718b = i5 - c3451p9.f55719c;
                        }
                        i6 = c3451p8.f55719c;
                        if (i6 >= c3451p9.f55718b) {
                            c3451p8.f55719c = i6 - c3451p9.f55719c;
                        }
                    }
                    arrayList.set(size, c3451p9);
                    if (c3451p8.f55718b != c3451p8.f55719c) {
                        arrayList.set(i13, c3451p8);
                    } else {
                        arrayList.remove(i13);
                    }
                    if (c3451p8M19757z3 != null) {
                        arrayList.add(size, c3451p8M19757z3);
                    }
                }
            } else if (i14 == 4) {
                int i27 = c3451p8.f55719c;
                int i28 = c3451p9.f55718b;
                if (i27 < i28) {
                    c3451p9.f55718b = i28 - 1;
                } else {
                    int i29 = c3451p9.f55719c;
                    if (i27 < i28 + i29) {
                        c3451p9.f55719c = i29 - 1;
                        c3451p8M19757z = c3488q8.m19757z(4, c3451p8.f55718b, 1);
                    }
                    i2 = c3451p8.f55718b;
                    i3 = c3451p9.f55718b;
                    if (i2 <= i3) {
                        c3451p9.f55718b = i3 + 1;
                    } else {
                        i4 = i3 + c3451p9.f55719c;
                        if (i2 < i4) {
                            int i30 = i4 - i2;
                            c3451p8M19757z2 = c3488q8.m19757z(4, i2 + 1, i30);
                            c3451p9.f55719c -= i30;
                        }
                        arrayList.set(i13, c3451p8);
                        if (c3451p9.f55719c > 0) {
                            arrayList.set(size, c3451p9);
                        } else {
                            arrayList.remove(size);
                            jh7Var2.mo14460c(c3451p9);
                        }
                        if (c3451p8M19757z != null) {
                            arrayList.add(size, c3451p8M19757z);
                        }
                        if (c3451p8M19757z2 != null) {
                            arrayList.add(size, c3451p8M19757z2);
                        }
                    }
                    c3451p8M19757z2 = null;
                    arrayList.set(i13, c3451p8);
                    if (c3451p9.f55719c > 0) {
                        arrayList.set(size, c3451p9);
                    } else {
                        arrayList.remove(size);
                        jh7Var2.mo14460c(c3451p9);
                    }
                    if (c3451p8M19757z != null) {
                        arrayList.add(size, c3451p8M19757z);
                    }
                    if (c3451p8M19757z2 != null) {
                        arrayList.add(size, c3451p8M19757z2);
                    }
                }
                c3451p8M19757z = null;
                i2 = c3451p8.f55718b;
                i3 = c3451p9.f55718b;
                if (i2 <= i3) {
                    c3451p9.f55718b = i3 + 1;
                } else {
                    i4 = i3 + c3451p9.f55719c;
                    if (i2 < i4) {
                        int i31 = i4 - i2;
                        c3451p8M19757z2 = c3488q8.m19757z(4, i2 + 1, i31);
                        c3451p9.f55719c -= i31;
                    }
                    arrayList.set(i13, c3451p8);
                    if (c3451p9.f55719c > 0) {
                        arrayList.set(size, c3451p9);
                    } else {
                        arrayList.remove(size);
                        jh7Var2.mo14460c(c3451p9);
                    }
                    if (c3451p8M19757z != null) {
                        arrayList.add(size, c3451p8M19757z);
                    }
                    if (c3451p8M19757z2 != null) {
                        arrayList.add(size, c3451p8M19757z2);
                    }
                }
                c3451p8M19757z2 = null;
                arrayList.set(i13, c3451p8);
                if (c3451p9.f55719c > 0) {
                    arrayList.set(size, c3451p9);
                } else {
                    arrayList.remove(size);
                    jh7Var2.mo14460c(c3451p9);
                }
                if (c3451p8M19757z != null) {
                    arrayList.add(size, c3451p8M19757z);
                }
                if (c3451p8M19757z2 != null) {
                    arrayList.add(size, c3451p8M19757z2);
                }
            }
        }
        int size2 = arrayList.size();
        int i32 = 0;
        while (i32 < size2) {
            C3451p8 c3451p8M19757z4 = (C3451p8) arrayList.get(i32);
            int i33 = c3451p8M19757z4.f55717a;
            if (i33 == 1) {
                m19720F(c3451p8M19757z4);
            } else if (i33 == 2) {
                int i34 = c3451p8M19757z4.f55718b;
                int i35 = c3451p8M19757z4.f55719c + i34;
                int i36 = i34;
                byte b2 = -1;
                int i37 = 0;
                while (i36 < i35) {
                    if (ck6Var.m4806n(i36) != null || m19736d(i36)) {
                        if (b2 == 0) {
                            m19748p(m19757z(2, i34, i37));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            m19720F(m19757z(2, i34, i37));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i36 -= i37;
                        i35 -= i37;
                        i37 = 1;
                    } else {
                        i37++;
                    }
                    i36++;
                    b2 = b;
                }
                if (i37 != c3451p8M19757z4.f55719c) {
                    jh7Var.mo14460c(c3451p8M19757z4);
                    c3451p8M19757z4 = m19757z(2, i34, i37);
                }
                if (b2 == 0) {
                    m19748p(c3451p8M19757z4);
                } else {
                    m19720F(c3451p8M19757z4);
                }
            } else if (i33 == 4) {
                int i38 = c3451p8M19757z4.f55718b;
                int i39 = c3451p8M19757z4.f55719c + i38;
                int i40 = i38;
                byte b3 = -1;
                int i41 = 0;
                while (i38 < i39) {
                    if (ck6Var.m4806n(i38) != null || m19736d(i38)) {
                        if (b3 == 0) {
                            m19748p(m19757z(4, i40, i41));
                            i40 = i38;
                            i41 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            m19720F(m19757z(4, i40, i41));
                            i40 = i38;
                            i41 = 0;
                        }
                        b3 = 0;
                    }
                    i41++;
                    i38++;
                }
                if (i41 != c3451p8M19757z4.f55719c) {
                    jh7Var.mo14460c(c3451p8M19757z4);
                    c3451p8M19757z4 = m19757z(4, i40, i41);
                }
                if (b3 == 0) {
                    m19748p(c3451p8M19757z4);
                } else {
                    m19720F(c3451p8M19757z4);
                }
            } else if (i33 == i) {
                m19720F(c3451p8M19757z4);
            }
            i32++;
            i = 8;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: H */
    public int m19722H(int i) {
        if (i < ((String) this.f57373g).length()) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: I */
    public void m19723I(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3451p8 c3451p8 = (C3451p8) arrayList.get(i);
            c3451p8.getClass();
            ((jh7) this.f57369c).mo14460c(c3451p8);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: J */
    public void m19724J(Runnable runnable) {
        qp9 qp9Var = (qp9) this.f57369c;
        if (qp9Var.f58033a.getLooper().getThread().isAlive()) {
            qp9Var.m20098c(runnable);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m19725K(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((l1a) this.f57371e) == null) {
                this.f57371e = new l1a();
            }
            l1a l1aVar = (l1a) this.f57371e;
            l1aVar.f48901a = colorStateList;
            l1aVar.f48904d = true;
        } else {
            this.f57371e = null;
        }
        m19734b();
    }

    /* JADX INFO: renamed from: L */
    public void m19726L(ColorStateList colorStateList) {
        if (((l1a) this.f57372f) == null) {
            this.f57372f = new l1a();
        }
        l1a l1aVar = (l1a) this.f57372f;
        l1aVar.f48901a = colorStateList;
        l1aVar.f48904d = true;
        m19734b();
    }

    /* JADX INFO: renamed from: M */
    public void m19727M(PorterDuff.Mode mode) {
        if (((l1a) this.f57372f) == null) {
            this.f57372f = new l1a();
        }
        l1a l1aVar = (l1a) this.f57372f;
        l1aVar.f48902b = mode;
        l1aVar.f48903c = true;
        m19734b();
    }

    /* JADX INFO: renamed from: N */
    public int m19728N() {
        char cCharAt;
        int i = this.f57368b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f57373g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f57368b = i;
        return i;
    }

    /* JADX INFO: renamed from: O */
    public boolean m19729O() {
        int iM19728N = m19728N();
        String str = (String) this.f57373g;
        if (iM19728N >= str.length() || iM19728N == -1 || str.charAt(iM19728N) != ',') {
            return false;
        }
        this.f57368b++;
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m19730P(char c) {
        String str = (String) this.f57373g;
        int i = this.f57368b;
        if (i > 0 && c == '\"') {
            try {
                this.f57368b = i - 1;
                String strM19745m = m19745m();
                this.f57368b = i;
                if (fa4.m11650l(strM19745m, "null")) {
                    m19750r("Expected string literal but 'null' literal was found", this.f57368b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f57368b = i;
                throw th;
            }
        }
        String strM10046j0 = d32.m10046j0(d32.m10008F(c));
        int i2 = this.f57368b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m19714s(this, ux5.m22991n("Expected ", strM10046j0, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: Q */
    public int m19731Q(int i, int i2) {
        int i3;
        int i4;
        jh7 jh7Var = (jh7) this.f57369c;
        ArrayList arrayList = (ArrayList) this.f57371e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3451p8 c3451p8 = (C3451p8) arrayList.get(size);
            int i5 = c3451p8.f55717a;
            int i6 = c3451p8.f55718b;
            if (i5 == 8) {
                int i7 = c3451p8.f55719c;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c3451p8.f55718b = i6 + 1;
                            c3451p8.f55719c = i7 + 1;
                        } else if (i2 == 2) {
                            c3451p8.f55718b = i6 - 1;
                            c3451p8.f55719c = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c3451p8.f55719c = i7 + 1;
                    } else if (i2 == 2) {
                        c3451p8.f55719c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c3451p8.f55718b = i6 + 1;
                    } else if (i2 == 2) {
                        c3451p8.f55718b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c3451p8.f55719c;
                } else if (i5 == 2) {
                    i += c3451p8.f55719c;
                }
            } else if (i2 == 1) {
                c3451p8.f55718b = i6 + 1;
            } else if (i2 == 2) {
                c3451p8.f55718b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C3451p8 c3451p9 = (C3451p8) arrayList.get(size2);
            int i8 = c3451p9.f55717a;
            int i9 = c3451p9.f55719c;
            if (i8 == 8) {
                if (i9 == c3451p9.f55718b || i9 < 0) {
                    arrayList.remove(size2);
                    jh7Var.mo14460c(c3451p9);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                jh7Var.mo14460c(c3451p9);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: R */
    public void m19732R() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(sy2.m21766a()).edit();
        Long l = (Long) this.f57369c;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l2 = (Long) this.f57370d;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f57368b);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID) this.f57371e).toString());
        editorEdit.apply();
        mc0 mc0Var = (mc0) this.f57373g;
        if (mc0Var != null) {
            mc0Var.m16757a();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m19733a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f57372f).append((char) (m19752u(charSequence, i + 3) + (m19752u(charSequence, i) << 12) + (m19752u(charSequence, i + 1) << 8) + (m19752u(charSequence, i + 2) << 4)));
            return i2;
        }
        this.f57368b = i;
        if (i2 < charSequence.length()) {
            return m19733a(charSequence, this.f57368b);
        }
        m19714s(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void m19734b() {
        View view = (View) this.f57369c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((l1a) this.f57371e) != null) {
                if (((l1a) this.f57373g) == null) {
                    this.f57373g = new l1a();
                }
                l1a l1aVar = (l1a) this.f57373g;
                l1aVar.m15741a();
                WeakHashMap weakHashMap = dta.f36217a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    l1aVar.f48904d = true;
                    l1aVar.f48901a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    l1aVar.f48903c = true;
                    l1aVar.f48902b = backgroundTintMode;
                }
                if (l1aVar.f48904d || l1aVar.f48903c) {
                    C2893cq.m9846e(background, l1aVar, view.getDrawableState());
                    return;
                }
            }
            l1a l1aVar2 = (l1a) this.f57372f;
            if (l1aVar2 != null) {
                C2893cq.m9846e(background, l1aVar2, view.getDrawableState());
                return;
            }
            l1a l1aVar3 = (l1a) this.f57371e;
            if (l1aVar3 != null) {
                C2893cq.m9846e(background, l1aVar3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m19735c() {
        int i = this.f57368b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f57373g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f57368b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f57368b = i;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m19736d(int i) {
        ArrayList arrayList = (ArrayList) this.f57371e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3451p8 c3451p8 = (C3451p8) arrayList.get(i2);
            int i3 = c3451p8.f55717a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c3451p8.f55718b;
                    int i5 = c3451p8.f55719c + i4;
                    while (i4 < i5) {
                        if (m19751t(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m19751t(c3451p8.f55719c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m19737e(int i, String str) {
        String str2 = (String) this.f57373g;
        if (str2.length() - i < str.length()) {
            m19714s(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m19714s(this, "Expected valid boolean literal prefix, but had '" + m19745m() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f57368b = str.length() + i;
    }

    /* JADX INFO: renamed from: f */
    public String m19738f() {
        String string;
        StringBuilder sb = (StringBuilder) this.f57372f;
        String str = (String) this.f57373g;
        m19741i('\"');
        int i = this.f57368b;
        int iM23388k0 = vk9.m23388k0(str, '\"', i, 4);
        if (iM23388k0 == -1) {
            m19745m();
            int i2 = this.f57368b;
            m19714s(this, wq1.m24118n("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iM23388k0) {
            if (str.charAt(i3) == '\\') {
                int iM19722H = this.f57368b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM19722H, i3);
                        int iM19722H2 = m19722H(i3 + 1);
                        if (iM19722H2 == -1) {
                            m19714s(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iM19733a = iM19722H2 + 1;
                        char cCharAt2 = str.charAt(iM19722H2);
                        if (cCharAt2 == 'u') {
                            iM19733a = m19733a(str, iM19733a);
                        } else {
                            char c = cCharAt2 < 'u' ? qu0.f58208a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m19714s(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM19722H = m19722H(iM19733a);
                        if (iM19722H == -1) {
                            m19714s(this, "Unexpected EOF", iM19722H, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iM19722H, i3);
                            iM19722H = m19722H(i3);
                            if (iM19722H == -1) {
                                m19714s(this, "Unexpected EOF", iM19722H, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iM19722H;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iM19722H, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iM19722H, i3).toString();
                }
                this.f57368b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f57368b = iM23388k0 + 1;
        return str.substring(i, iM23388k0);
    }

    /* JADX INFO: renamed from: g */
    public byte m19739g() {
        String str = (String) this.f57373g;
        int i = this.f57368b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f57368b = i2;
                return d32.m10008F(cCharAt);
            }
            i = i2;
        }
        this.f57368b = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: h */
    public byte m19740h(byte b) {
        String str = (String) this.f57373g;
        byte bM19739g = m19739g();
        if (bM19739g == b) {
            return bM19739g;
        }
        String strM10046j0 = d32.m10046j0(b);
        int i = this.f57368b;
        int i2 = i > 0 ? i - 1 : i;
        m19714s(this, ux5.m22991n("Expected ", strM10046j0, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public void m19741i(char c) {
        int i = this.f57368b;
        if (i == -1) {
            m19730P(c);
            throw null;
        }
        String str = (String) this.f57373g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f57368b = i2;
                if (cCharAt == c) {
                    return;
                }
                m19730P(c);
                throw null;
            }
            i = i2;
        }
        this.f57368b = -1;
        m19730P(c);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public long m19742j() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        double dPow;
        int iM19722H = m19722H(m19728N());
        String str = (String) this.f57373g;
        if (iM19722H >= str.length() || iM19722H == -1) {
            m19714s(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM19722H) == '\"') {
            iM19722H++;
            if (iM19722H == str.length()) {
                m19714s(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iM19722H;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                z3 = z5;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z;
                if (cCharAt == '-' && z5) {
                    if (i == iM19722H) {
                        m19714s(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z5) {
                    z3 = z5;
                    if (cCharAt != '-') {
                        if (d32.m10008F(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m19714s(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + ((long) i3);
                        } else {
                            j3 = (j3 * 10) - ((long) i3);
                            if (j3 > 0) {
                                m19714s(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z5 = z3;
                    } else {
                        if (i != iM19722H) {
                            m19714s(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = z3;
                        z6 = true;
                    }
                } else {
                    if (i == iM19722H) {
                        m19714s(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = true;
                }
            } else {
                if (i == iM19722H) {
                    m19714s(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iM19722H;
        if (iM19722H == i || (z6 && iM19722H == i - 1)) {
            m19714s(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z2) {
            if (!z7) {
                m19714s(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                m19714s(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.f57368b = i;
        long j4 = j3;
        if (z3) {
            double d = j4;
            if (!z4) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z4) {
                    gm5.m12750e();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m19714s(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m19714s(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z6) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        m19714s(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public void m19743k() {
        ArrayList arrayList = (ArrayList) this.f57371e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ck6) this.f57372f).m4790A((C3451p8) arrayList.get(i));
        }
        m19723I(arrayList);
        this.f57368b = 0;
    }

    /* JADX INFO: renamed from: l */
    public String m19744l() {
        String str = (String) this.f57371e;
        if (str == null) {
            return m19738f();
        }
        str.getClass();
        this.f57371e = null;
        return str;
    }

    /* JADX INFO: renamed from: m */
    public String m19745m() {
        String string;
        StringBuilder sb = (StringBuilder) this.f57372f;
        String str = (String) this.f57373g;
        String str2 = (String) this.f57371e;
        if (str2 != null) {
            str2.getClass();
            this.f57371e = null;
            return str2;
        }
        int iM19728N = m19728N();
        if (iM19728N >= str.length() || iM19728N == -1) {
            m19714s(this, "EOF", iM19728N, null, 4);
            throw null;
        }
        byte bM10008F = d32.m10008F(str.charAt(iM19728N));
        if (bM10008F == 1) {
            return m19744l();
        }
        if (bM10008F != 0) {
            m19714s(this, "Expected beginning of the string, but got " + str.charAt(iM19728N), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (d32.m10008F(str.charAt(iM19728N)) == 0) {
            iM19728N++;
            if (iM19728N >= str.length()) {
                sb.append((CharSequence) str, this.f57368b, iM19728N);
                int iM19722H = m19722H(iM19728N);
                if (iM19722H == -1) {
                    this.f57368b = iM19728N;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM19728N = iM19722H;
                z = true;
            }
        }
        int i = this.f57368b;
        if (z) {
            sb.append((CharSequence) str, i, iM19728N);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iM19728N).toString();
        }
        this.f57368b = iM19728N;
        return string;
    }

    /* JADX INFO: renamed from: n */
    public String m19746n() {
        String strM19745m = m19745m();
        if (!fa4.m11650l(strM19745m, "null") || ((String) this.f57373g).charAt(this.f57368b - 1) == '\"') {
            return strM19745m;
        }
        m19714s(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public void m19747o() {
        ck6 ck6Var = (ck6) this.f57372f;
        m19743k();
        ArrayList arrayList = (ArrayList) this.f57370d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3451p8 c3451p8 = (C3451p8) arrayList.get(i);
            int i2 = c3451p8.f55717a;
            if (i2 == 1) {
                ck6Var.m4790A(c3451p8);
                ck6Var.m4811u(c3451p8.f55718b, c3451p8.f55719c);
            } else if (i2 == 2) {
                ck6Var.m4790A(c3451p8);
                ck6Var.m4813w(c3451p8.f55718b, c3451p8.f55719c);
            } else if (i2 == 4) {
                ck6Var.m4790A(c3451p8);
                ck6Var.m4810t(c3451p8.f55718b, c3451p8.f55719c);
            } else if (i2 == 8) {
                ck6Var.m4790A(c3451p8);
                ck6Var.m4812v(c3451p8.f55718b, c3451p8.f55719c);
            }
        }
        m19723I(arrayList);
        this.f57368b = 0;
    }

    /* JADX INFO: renamed from: p */
    public void m19748p(C3451p8 c3451p8) {
        int i;
        jh7 jh7Var = (jh7) this.f57369c;
        int i2 = c3451p8.f55717a;
        if (i2 == 1 || i2 == 8) {
            C3386nv.m17626m("should not dispatch add or move for pre layout");
            return;
        }
        int iM19731Q = m19731Q(c3451p8.f55718b, i2);
        int i3 = c3451p8.f55718b;
        int i4 = c3451p8.f55717a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                v63.m23142t(c3451p8, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c3451p8.f55719c; i6++) {
            int iM19731Q2 = m19731Q((i * i6) + c3451p8.f55718b, c3451p8.f55717a);
            int i7 = c3451p8.f55717a;
            if (i7 == 2 ? iM19731Q2 != iM19731Q : !(i7 == 4 && iM19731Q2 == iM19731Q + 1)) {
                C3451p8 c3451p8M19757z = m19757z(i7, iM19731Q, i5);
                m19749q(c3451p8M19757z, i3);
                jh7Var.mo14460c(c3451p8M19757z);
                if (c3451p8.f55717a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM19731Q = iM19731Q2;
            } else {
                i5++;
            }
        }
        jh7Var.mo14460c(c3451p8);
        if (i5 > 0) {
            C3451p8 c3451p8M19757z2 = m19757z(c3451p8.f55717a, iM19731Q, i5);
            m19749q(c3451p8M19757z2, i3);
            jh7Var.mo14460c(c3451p8M19757z2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m19749q(C3451p8 c3451p8, int i) {
        ck6 ck6Var = (ck6) this.f57372f;
        ck6Var.m4816z(c3451p8);
        int i2 = c3451p8.f55717a;
        if (i2 == 2) {
            ck6Var.m4813w(i, c3451p8.f55719c);
        } else if (i2 == 4) {
            ck6Var.m4810t(i, c3451p8.f55719c);
        } else {
            C3386nv.m17626m("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: renamed from: r */
    public void m19750r(String str, int i, String str2) {
        String strM21355g = ((sg3) this.f57370d).m21355g();
        String str3 = (String) this.f57373g;
        str3.getClass();
        throw new JsonDecodingException(fa4.m11656r(i, str, strM21355g, str2, ((kf4) this.f57369c).f47133i ? fa4.m11627A(str3, i).toString() : null), str);
    }

    /* JADX INFO: renamed from: t */
    public int m19751t(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f57371e;
        int size = arrayList.size();
        while (i2 < size) {
            C3451p8 c3451p8 = (C3451p8) arrayList.get(i2);
            int i3 = c3451p8.f55717a;
            int i4 = c3451p8.f55718b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c3451p8.f55719c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c3451p8.f55719c <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c3451p8.f55719c;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c3451p8.f55719c;
            }
            i2++;
        }
        return i;
    }

    public String toString() {
        switch (this.f57367a) {
            case 6:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f57373g);
                sb.append("', currentPosition=");
                return wq1.m24122r(sb, this.f57368b, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public int m19752u(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m19714s(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public ColorStateList m19753v() {
        l1a l1aVar = (l1a) this.f57372f;
        if (l1aVar != null) {
            return l1aVar.f48901a;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public PorterDuff.Mode m19754w() {
        l1a l1aVar = (l1a) this.f57372f;
        if (l1aVar != null) {
            return l1aVar.f48902b;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public boolean m19755x() {
        return ((ArrayList) this.f57370d).size() > 0;
    }

    /* JADX INFO: renamed from: y */
    public void m19756y(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM178g;
        View view = (View) this.f57369c;
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, view.getContext(), attributeSet, R$styleable.ViewBackgroundHelper);
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        View view2 = (View) this.f57369c;
        Context context = view2.getContext();
        int[] iArr = R$styleable.ViewBackgroundHelper;
        TypedArray typedArray2 = (TypedArray) sq5VarM21551w.f61249c;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(view2, context, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(R$styleable.ViewBackgroundHelper_android_background)) {
                this.f57368b = typedArray.getResourceId(R$styleable.ViewBackgroundHelper_android_background, -1);
                C2893cq c2893cq = (C2893cq) this.f57370d;
                Context context2 = view.getContext();
                int i2 = this.f57368b;
                synchronized (c2893cq) {
                    colorStateListM178g = c2893cq.f34366a.m178g(context2, i2);
                }
                if (colorStateListM178g != null) {
                    m19725K(colorStateListM178g);
                }
            }
            if (typedArray.hasValue(R$styleable.ViewBackgroundHelper_backgroundTint)) {
                view.setBackgroundTintList(sq5VarM21551w.m21567i(R$styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(R$styleable.ViewBackgroundHelper_backgroundTintMode)) {
                view.setBackgroundTintMode(wl2.m24048c(typedArray.getInt(R$styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            sq5VarM21551w.m21582y();
        } catch (Throwable th) {
            sq5VarM21551w.m21582y();
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public C3451p8 m19757z(int i, int i2, int i3) {
        C3451p8 c3451p8 = (C3451p8) ((jh7) this.f57369c).mo14458a();
        if (c3451p8 != null) {
            c3451p8.f55717a = i;
            c3451p8.f55718b = i2;
            c3451p8.f55719c = i3;
            return c3451p8;
        }
        C3451p8 c3451p9 = new C3451p8();
        c3451p9.f55717a = i;
        c3451p9.f55718b = i2;
        c3451p9.f55719c = i3;
        return c3451p9;
    }

    public C3488q8(r86 r86Var) {
        this.f57367a = 3;
        this.f57369c = r86Var;
        this.f57370d = new ArrayList();
        this.f57372f = new LinkedHashMap();
    }

    public C3488q8(View view) {
        this.f57367a = 1;
        this.f57368b = -1;
        this.f57369c = view;
        this.f57370d = C2893cq.m9843a();
    }

    public C3488q8(Long l, Long l2) {
        this.f57367a = 5;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f57369c = l;
        this.f57370d = l2;
        this.f57371e = uuidRandomUUID;
    }

    public C3488q8(Object obj, Looper looper, Looper looper2, mp9 mp9Var, yv2 yv2Var) {
        this.f57367a = 2;
        this.f57369c = mp9Var.m16990a(looper, null);
        this.f57370d = mp9Var.m16990a(looper2, null);
        this.f57372f = obj;
        this.f57373g = obj;
        this.f57371e = yv2Var;
    }

    public C3488q8(String str, kf4 kf4Var) {
        this.f57367a = 6;
        str.getClass();
        this.f57369c = kf4Var;
        this.f57370d = new sg3(kf4Var);
        this.f57372f = new StringBuilder();
        this.f57373g = str;
    }

    public C3488q8() {
        this.f57367a = 4;
        this.f57369c = new kv3[32];
        this.f57370d = new float[32];
        this.f57371e = new byte[32];
        o66 o66Var = pm8.f56484a;
        this.f57372f = new o66();
        this.f57373g = new o66();
    }
}
