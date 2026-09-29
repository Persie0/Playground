package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.collect.ImmutableList;
import com.lingq.core.p012ui.R$id;
import com.lingq.core.p012ui.R$layout;
import com.lingq.core.p012ui.R$string;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qn2 implements cn9 {

    /* JADX INFO: renamed from: h */
    public static final byte[] f57959h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    public static final byte[] f57960i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    public static final byte[] f57961j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public Object f57962a;

    /* JADX INFO: renamed from: b */
    public Object f57963b;

    /* JADX INFO: renamed from: c */
    public Object f57964c;

    /* JADX INFO: renamed from: d */
    public Object f57965d;

    /* JADX INFO: renamed from: e */
    public Object f57966e;

    /* JADX INFO: renamed from: f */
    public Object f57967f;

    /* JADX INFO: renamed from: g */
    public Object f57968g;

    public qn2(Context context, String str, zi3 zi3Var) {
        context.getClass();
        this.f57962a = context;
        this.f57963b = str;
        this.f57964c = zi3Var;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_report_menu, (ViewGroup) null, false);
        int i = R$id.etReason;
        TextInputEditText textInputEditText = (TextInputEditText) lfa.m16159c(viewInflate, i);
        if (textInputEditText != null) {
            i = R$id.rbAudioProblems;
            if (((RadioButton) lfa.m16159c(viewInflate, i)) != null) {
                i = R$id.rbOffensiveContent;
                if (((RadioButton) lfa.m16159c(viewInflate, i)) != null) {
                    i = R$id.rbOther;
                    if (((RadioButton) lfa.m16159c(viewInflate, i)) != null) {
                        i = R$id.rgIssues;
                        RadioGroup radioGroup = (RadioGroup) lfa.m16159c(viewInflate, i);
                        if (radioGroup != null) {
                            i = R$id.rvPoorTranscript;
                            if (((RadioButton) lfa.m16159c(viewInflate, i)) != null) {
                                i = R$id.tlReason;
                                TextInputLayout textInputLayout = (TextInputLayout) lfa.m16159c(viewInflate, i);
                                if (textInputLayout != null) {
                                    this.f57966e = new ff5((ConstraintLayout) viewInflate, textInputEditText, radioGroup, textInputLayout);
                                    this.f57967f = "";
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m20036a(int i, int i2, so0 so0Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) so0Var.m21503g(i2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m20037b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m20039d(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m20039d(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m20038c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m20039d(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m20039d(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m20039d(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m20039d(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m20039d(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static int m20039d(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m20040e(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int iM21503g;
        int iM21503g2;
        boolean z;
        int iM21503g3;
        int iM21503g4;
        int iM21503g5;
        int i4;
        int i5;
        boolean z2;
        int iM21503g6;
        so0 so0Var = new so0(bArr.length, bArr);
        int i6 = i2;
        int i7 = i3;
        byte[] bArrM20036a = null;
        byte[] bArrM20036a2 = null;
        byte[] bArrM20036a3 = null;
        while (so0Var.m21498b() != 0) {
            int i8 = 8;
            int iM21503g7 = so0Var.m21503g(8);
            if (iM21503g7 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iM21503g7) {
                    case 16:
                        if (i == 3) {
                            bArr2 = bArrM20036a == null ? f57960i : bArrM20036a;
                        } else if (i == 2) {
                            bArr2 = bArrM20036a3 == null ? f57959h : bArrM20036a3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int iM21503g8 = so0Var.m21503g(2);
                            if (iM21503g8 != 0) {
                                iM21503g = iM21503g8;
                                iM21503g2 = 1;
                            } else {
                                if (so0Var.m21502f()) {
                                    int iM21503g9 = so0Var.m21503g(3) + 3;
                                    iM21503g = so0Var.m21503g(2);
                                    iM21503g2 = iM21503g9;
                                } else {
                                    if (so0Var.m21502f()) {
                                        iM21503g2 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int iM21503g10 = so0Var.m21503g(2);
                                        if (iM21503g10 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z3 = true;
                                        } else if (iM21503g10 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            iM21503g2 = 2;
                                        } else if (iM21503g10 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            iM21503g2 = so0Var.m21503g(4) + 12;
                                            iM21503g = so0Var.m21503g(2);
                                            z3 = z3;
                                        } else if (iM21503g10 != 3) {
                                            z3 = z3;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int iM21503g11 = so0Var.m21503g(8) + 29;
                                            iM21503g = so0Var.m21503g(2);
                                            z3 = z3;
                                            iM21503g2 = iM21503g11;
                                            c2 = 4;
                                        }
                                        iM21503g = 0;
                                        iM21503g2 = 0;
                                    }
                                    iM21503g = 0;
                                }
                                if (iM21503g2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iM21503g = bArr2[iM21503g];
                                    }
                                    paint.setColor(iArr[iM21503g]);
                                    canvas.drawRect(i6, i7, i6 + iM21503g2, i7 + 1, paint);
                                }
                                i6 += iM21503g2;
                                if (z3) {
                                    so0Var.m21499c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (iM21503g2 == 0) {
                            }
                            i6 += iM21503g2;
                            if (z3) {
                                so0Var.m21499c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i == 3 ? bArrM20036a2 == null ? f57961j : bArrM20036a2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iM21503g12 = so0Var.m21503g(i11);
                            if (iM21503g12 != 0) {
                                z = z4;
                                iM21503g5 = iM21503g12;
                                iM21503g3 = 1;
                            } else if (so0Var.m21502f()) {
                                if (so0Var.m21502f()) {
                                    int iM21503g13 = so0Var.m21503g(i10);
                                    if (iM21503g13 == 0) {
                                        z = z4;
                                        iM21503g3 = 1;
                                    } else if (iM21503g13 != 1) {
                                        if (iM21503g13 == i10) {
                                            iM21503g3 = so0Var.m21503g(i11) + 9;
                                            iM21503g4 = so0Var.m21503g(i11);
                                        } else if (iM21503g13 != i9) {
                                            z = z4;
                                            iM21503g3 = 0;
                                        } else {
                                            iM21503g3 = so0Var.m21503g(i8) + 25;
                                            iM21503g4 = so0Var.m21503g(i11);
                                        }
                                        iM21503g5 = iM21503g4;
                                    } else {
                                        z = z4;
                                        iM21503g3 = i10;
                                    }
                                    iM21503g5 = 0;
                                } else {
                                    iM21503g3 = so0Var.m21503g(i10) + 4;
                                    iM21503g5 = so0Var.m21503g(i11);
                                }
                                z = z4;
                            } else {
                                int iM21503g14 = so0Var.m21503g(i9);
                                if (iM21503g14 != 0) {
                                    iM21503g3 = iM21503g14 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    iM21503g3 = 0;
                                }
                                iM21503g5 = 0;
                            }
                            if (iM21503g3 == 0 || paint == 0) {
                                i4 = i9;
                                i5 = i10;
                            } else {
                                if (bArr3 != 0) {
                                    iM21503g5 = bArr3[iM21503g5];
                                }
                                paint.setColor(iArr[iM21503g5]);
                                i4 = i9;
                                i5 = 2;
                                canvas.drawRect(i6, i7, i6 + iM21503g3, i7 + 1, paint);
                            }
                            i6 += iM21503g3;
                            if (z) {
                                so0Var.m21499c();
                            } else {
                                z4 = z;
                                i9 = i4;
                                i10 = i5;
                                i11 = 4;
                                i8 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int iM21503g15 = so0Var.m21503g(8);
                            if (iM21503g15 != 0) {
                                z2 = z5;
                                iM21503g6 = 1;
                            } else if (so0Var.m21502f()) {
                                z2 = z5;
                                iM21503g6 = so0Var.m21503g(7);
                                iM21503g15 = so0Var.m21503g(8);
                            } else {
                                int iM21503g16 = so0Var.m21503g(7);
                                if (iM21503g16 != 0) {
                                    z2 = z5;
                                    iM21503g6 = iM21503g16;
                                    iM21503g15 = 0;
                                } else {
                                    z2 = true;
                                    iM21503g15 = 0;
                                    iM21503g6 = 0;
                                }
                            }
                            if (iM21503g6 != 0 && paint != 0) {
                                paint.setColor(iArr[iM21503g15]);
                                canvas.drawRect(i6, i7, i6 + iM21503g6, i7 + 1, paint);
                            }
                            i6 += iM21503g6;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM21503g7) {
                            case 32:
                                bArrM20036a3 = m20036a(4, 4, so0Var);
                                break;
                            case 33:
                                bArrM20036a = m20036a(4, 8, so0Var);
                                break;
                            case 34:
                                bArrM20036a2 = m20036a(16, 8, so0Var);
                                break;
                        }
                        break;
                }
            } else {
                i7 += 2;
                i6 = i2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static jn2 m20041f(so0 so0Var, int i) {
        int[] iArr;
        int iM21503g;
        int i2;
        int iM21503g2;
        int iM21503g3;
        int iM21503g4;
        int i3 = 8;
        int iM21503g5 = so0Var.m21503g(8);
        so0Var.m21511o(8);
        int i4 = 2;
        int i5 = i - 2;
        int i6 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM20037b = m20037b();
        int[] iArrM20038c = m20038c();
        while (i5 > 0) {
            int iM21503g6 = so0Var.m21503g(i3);
            int iM21503g7 = so0Var.m21503g(i3);
            if ((iM21503g7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM21503g7 & 64) != 0 ? iArrM20037b : iArrM20038c;
            }
            if ((iM21503g7 & 1) != 0) {
                iM21503g3 = so0Var.m21503g(i3);
                iM21503g4 = so0Var.m21503g(i3);
                iM21503g = so0Var.m21503g(i3);
                iM21503g2 = so0Var.m21503g(i3);
                i2 = i5 - 6;
            } else {
                int iM21503g8 = so0Var.m21503g(6) << i4;
                int iM21503g9 = so0Var.m21503g(4) << 4;
                iM21503g = so0Var.m21503g(4) << 4;
                i2 = i5 - 4;
                iM21503g2 = so0Var.m21503g(i4) << 6;
                iM21503g3 = iM21503g8;
                iM21503g4 = iM21503g9;
            }
            if (iM21503g3 == 0) {
                iM21503g4 = i6;
                iM21503g = iM21503g4;
                iM21503g2 = 255;
            }
            double d = iM21503g3;
            double d2 = iM21503g4 - 128;
            double d3 = iM21503g - 128;
            iArr[iM21503g6] = m20039d((byte) (255 - (iM21503g2 & 255)), uma.m22812g((int) ((1.402d * d2) + d), 0, 255), uma.m22812g((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), uma.m22812g((int) ((d3 * 1.772d) + d), 0, 255));
            i5 = i2;
            i6 = 0;
            iM21503g5 = iM21503g5;
            iArrM20038c = iArrM20038c;
            i3 = 8;
            i4 = 2;
        }
        return new jn2(iM21503g5, iArr2, iArrM20037b, iArrM20038c);
    }

    /* JADX INFO: renamed from: g */
    public static ln2 m20042g(so0 so0Var) {
        byte[] bArr;
        int iM21503g = so0Var.m21503g(16);
        so0Var.m21511o(4);
        int iM21503g2 = so0Var.m21503g(2);
        boolean zM21502f = so0Var.m21502f();
        so0Var.m21511o(1);
        byte[] bArr2 = uma.f64081b;
        if (iM21503g2 != 1) {
            if (iM21503g2 == 0) {
                int iM21503g3 = so0Var.m21503g(16);
                int iM21503g4 = so0Var.m21503g(16);
                if (iM21503g3 > 0) {
                    bArr2 = new byte[iM21503g3];
                    so0Var.m21506j(iM21503g3, bArr2);
                }
                if (iM21503g4 > 0) {
                    bArr = new byte[iM21503g4];
                    so0Var.m21506j(iM21503g4, bArr);
                }
            }
            return new ln2(iM21503g, zM21502f, bArr2, bArr);
        }
        so0Var.m21511o(so0Var.m21503g(8) * 16);
        bArr = bArr2;
        return new ln2(iM21503g, zM21502f, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x0310  */
    /* JADX WARN: Code duplicated, block: B:108:0x0316  */
    /* JADX WARN: Code duplicated, block: B:110:0x0319  */
    /* JADX WARN: Code duplicated, block: B:111:0x031c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0340  */
    /* JADX WARN: Code duplicated, block: B:117:0x036c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0371  */
    /* JADX WARN: Code duplicated, block: B:120:0x0379  */
    /* JADX WARN: Code duplicated, block: B:122:0x037c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0383  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0270  */
    /* JADX WARN: Code duplicated, block: B:94:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f3  */
    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        int i3;
        ArrayList arrayList;
        SparseArray sparseArray;
        int i4;
        gs1 gs1Var;
        nn2 nn2Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        jn2 jn2Var;
        SparseArray sparseArray2;
        int i11;
        nn2 nn2Var2;
        int i12;
        int i13;
        char c;
        int i14;
        char c2;
        int i15;
        int i16;
        int iKeyAt;
        on2 on2Var;
        ln2 ln2Var;
        ln2 ln2Var2;
        nn2 nn2Var3;
        int i17;
        int i18;
        int i19;
        Paint paint;
        int i20;
        int[] iArr;
        nn2 nn2Var4;
        int iM21503g;
        int iM21503g2;
        int i21;
        int iM21503g3;
        so0 so0Var = new so0(i + i2, bArr);
        so0Var.m21509m(i);
        Paint paint2 = (Paint) this.f57963b;
        Canvas canvas = (Canvas) this.f57964c;
        pn2 pn2Var = (pn2) this.f57967f;
        while (so0Var.m21498b() >= 48 && so0Var.m21503g(8) == 15) {
            int iM21503g4 = so0Var.m21503g(8);
            int i22 = 16;
            int iM21503g5 = so0Var.m21503g(16);
            int iM21503g6 = so0Var.m21503g(16);
            int iM21500d = so0Var.m21500d() + iM21503g6;
            if (iM21503g6 * 8 > so0Var.m21498b()) {
                ss5.m21707d0("DvbParser", "Data field length exceeds limit");
                so0Var.m21511o(so0Var.m21498b());
            } else {
                int i23 = 4;
                switch (iM21503g4) {
                    case 16:
                        if (iM21503g5 == pn2Var.f56493a) {
                            doa doaVar = pn2Var.f56501i;
                            int i24 = 8;
                            so0Var.m21503g(8);
                            int iM21503g7 = so0Var.m21503g(4);
                            int iM21503g8 = so0Var.m21503g(2);
                            so0Var.m21511o(2);
                            int i25 = iM21503g6 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i25 > 0) {
                                int iM21503g9 = so0Var.m21503g(i24);
                                so0Var.m21511o(i24);
                                i25 -= 6;
                                sparseArray3.put(iM21503g9, new mn2(so0Var.m21503g(16), so0Var.m21503g(16)));
                                i24 = 8;
                            }
                            doa doaVar2 = new doa(iM21503g7, iM21503g8, sparseArray3);
                            if (iM21503g8 != 0) {
                                pn2Var.f56501i = doaVar2;
                                pn2Var.f56495c.clear();
                                pn2Var.f56496d.clear();
                                pn2Var.f56497e.clear();
                            } else if (doaVar != null && doaVar.f35972b != iM21503g7) {
                                pn2Var.f56501i = doaVar2;
                            }
                        }
                        break;
                    case 17:
                        doa doaVar3 = pn2Var.f56501i;
                        SparseArray sparseArray4 = pn2Var.f56495c;
                        if (iM21503g5 == pn2Var.f56493a && doaVar3 != null) {
                            int iM21503g10 = so0Var.m21503g(8);
                            so0Var.m21511o(4);
                            boolean zM21502f = so0Var.m21502f();
                            so0Var.m21511o(3);
                            int iM21503g11 = so0Var.m21503g(16);
                            int iM21503g12 = so0Var.m21503g(16);
                            so0Var.m21503g(3);
                            int iM21503g13 = so0Var.m21503g(3);
                            so0Var.m21511o(2);
                            int iM21503g14 = so0Var.m21503g(8);
                            int iM21503g15 = so0Var.m21503g(8);
                            int iM21503g16 = so0Var.m21503g(4);
                            int iM21503g17 = so0Var.m21503g(2);
                            so0Var.m21511o(2);
                            int i26 = iM21503g6 - 10;
                            SparseArray sparseArray5 = new SparseArray();
                            while (i26 > 0) {
                                int iM21503g18 = so0Var.m21503g(i22);
                                int iM21503g19 = so0Var.m21503g(2);
                                so0Var.m21503g(2);
                                int iM21503g20 = so0Var.m21503g(12);
                                so0Var.m21511o(i23);
                                int iM21503g21 = so0Var.m21503g(12);
                                int i27 = i26 - 6;
                                if (iM21503g19 == 1 || iM21503g19 == 2) {
                                    so0Var.m21503g(8);
                                    so0Var.m21503g(8);
                                    i26 -= 8;
                                } else {
                                    i26 = i27;
                                }
                                sparseArray5.put(iM21503g18, new on2(iM21503g20, iM21503g21));
                                i23 = 4;
                                i22 = 16;
                            }
                            nn2 nn2Var5 = new nn2(iM21503g10, zM21502f, iM21503g11, iM21503g12, iM21503g13, iM21503g14, iM21503g15, iM21503g16, iM21503g17, sparseArray5);
                            if (doaVar3.f35973c == 0 && (nn2Var4 = (nn2) sparseArray4.get(iM21503g10)) != null) {
                                SparseArray sparseArray6 = nn2Var4.f52996j;
                                for (int i28 = 0; i28 < sparseArray6.size(); i28++) {
                                    nn2Var5.f52996j.put(sparseArray6.keyAt(i28), (on2) sparseArray6.valueAt(i28));
                                }
                            }
                            sparseArray4.put(nn2Var5.f52987a, nn2Var5);
                        }
                        break;
                    case 18:
                        if (iM21503g5 == pn2Var.f56493a) {
                            jn2 jn2VarM20041f = m20041f(so0Var, iM21503g6);
                            pn2Var.f56496d.put(jn2VarM20041f.f45855a, jn2VarM20041f);
                        } else if (iM21503g5 == pn2Var.f56494b) {
                            jn2 jn2VarM20041f2 = m20041f(so0Var, iM21503g6);
                            pn2Var.f56498f.put(jn2VarM20041f2.f45855a, jn2VarM20041f2);
                        }
                        break;
                    case 19:
                        if (iM21503g5 == pn2Var.f56493a) {
                            ln2 ln2VarM20042g = m20042g(so0Var);
                            pn2Var.f56497e.put(ln2VarM20042g.f49858a, ln2VarM20042g);
                        } else if (iM21503g5 == pn2Var.f56494b) {
                            ln2 ln2VarM20042g2 = m20042g(so0Var);
                            pn2Var.f56499g.put(ln2VarM20042g2.f49858a, ln2VarM20042g2);
                        }
                        break;
                    case 20:
                        if (iM21503g5 == pn2Var.f56493a) {
                            so0Var.m21511o(4);
                            boolean zM21502f2 = so0Var.m21502f();
                            so0Var.m21511o(3);
                            int iM21503g22 = so0Var.m21503g(16);
                            int iM21503g23 = so0Var.m21503g(16);
                            if (zM21502f2) {
                                int iM21503g24 = so0Var.m21503g(16);
                                iM21503g = so0Var.m21503g(16);
                                iM21503g3 = so0Var.m21503g(16);
                                iM21503g2 = so0Var.m21503g(16);
                                i21 = iM21503g24;
                            } else {
                                iM21503g = iM21503g22;
                                iM21503g2 = iM21503g23;
                                i21 = 0;
                                iM21503g3 = 0;
                            }
                            pn2Var.f56500h = new kn2(iM21503g22, iM21503g23, i21, iM21503g, iM21503g3, iM21503g2);
                        }
                        break;
                }
                so0Var.m21512p(iM21500d - so0Var.m21500d());
            }
        }
        doa doaVar4 = pn2Var.f56501i;
        if (doaVar4 == null) {
            gs1Var = new gs1(-9223372036854775807L, -9223372036854775807L, ImmutableList.m6289v());
        } else {
            kn2 kn2Var = pn2Var.f56500h;
            if (kn2Var == null) {
                kn2Var = (kn2) this.f57965d;
            }
            Bitmap bitmap = (Bitmap) this.f57968g;
            if (bitmap != null) {
                i3 = 1;
                if (kn2Var.f47535a + 1 != bitmap.getWidth() || kn2Var.f47536b + 1 != ((Bitmap) this.f57968g).getHeight()) {
                }
                arrayList = new ArrayList();
                sparseArray = (SparseArray) doaVar4.f35974d;
                i4 = 0;
                while (i4 < sparseArray.size()) {
                    canvas.save();
                    mn2 mn2Var = (mn2) sparseArray.valueAt(i4);
                    nn2Var = (nn2) pn2Var.f56495c.get(sparseArray.keyAt(i4));
                    i5 = mn2Var.f51552a + kn2Var.f47537c;
                    i6 = mn2Var.f51553b + kn2Var.f47539e;
                    i7 = nn2Var.f52989c;
                    int i29 = nn2Var.f52992f;
                    i8 = nn2Var.f52990d;
                    i9 = i5 + i7;
                    i10 = i6 + i8;
                    SparseArray sparseArray7 = sparseArray;
                    canvas.clipRect(i5, i6, Math.min(i9, kn2Var.f47538d), Math.min(i10, kn2Var.f47540f));
                    jn2Var = (jn2) pn2Var.f56496d.get(i29);
                    if (jn2Var == null && (jn2Var = (jn2) pn2Var.f56498f.get(i29)) == null) {
                        jn2Var = (jn2) this.f57966e;
                    }
                    sparseArray2 = nn2Var.f52996j;
                    kn2 kn2Var2 = kn2Var;
                    i11 = 0;
                    while (i11 < sparseArray2.size()) {
                        iKeyAt = sparseArray2.keyAt(i11);
                        int i30 = i4;
                        on2Var = (on2) sparseArray2.valueAt(i11);
                        SparseArray sparseArray8 = sparseArray2;
                        ln2Var = (ln2) pn2Var.f56497e.get(iKeyAt);
                        if (ln2Var == null) {
                            ln2Var = (ln2) pn2Var.f56499g.get(iKeyAt);
                        }
                        ln2Var2 = ln2Var;
                        if (ln2Var2 != null) {
                            if (ln2Var2.f49859b) {
                                paint = null;
                            } else {
                                paint = (Paint) this.f57962a;
                            }
                            int i31 = i5;
                            i20 = nn2Var.f52991e;
                            int i32 = i31 + on2Var.f54611a;
                            int i33 = on2Var.f54612b + i6;
                            if (i20 == 3) {
                                iArr = jn2Var.f45858d;
                            } else if (i20 == 2) {
                                iArr = jn2Var.f45857c;
                            } else {
                                iArr = jn2Var.f45856b;
                            }
                            int i34 = i8;
                            Paint paint3 = paint;
                            nn2 nn2Var6 = nn2Var;
                            int[] iArr2 = iArr;
                            nn2Var3 = nn2Var6;
                            i17 = i31;
                            i18 = i11;
                            i19 = i34;
                            m20040e(ln2Var2.f49860c, iArr2, i20, i32, i33, paint3, canvas);
                            m20040e(ln2Var2.f49861d, iArr2, i20, i32, i33 + 1, paint3, canvas);
                        } else {
                            nn2Var3 = nn2Var;
                            i17 = i5;
                            i18 = i11;
                            i19 = i8;
                        }
                        i11 = i18 + 1;
                        nn2Var = nn2Var3;
                        i5 = i17;
                        sparseArray2 = sparseArray8;
                        i4 = i30;
                        pn2Var = pn2Var;
                        i7 = i7;
                        i8 = i19;
                    }
                    pn2 pn2Var2 = pn2Var;
                    int i35 = i4;
                    nn2Var2 = nn2Var;
                    i12 = i5;
                    int i36 = i7;
                    int i37 = i8;
                    if (nn2Var2.f52988b) {
                        i15 = nn2Var2.f52991e;
                        if (i15 == 3) {
                            i16 = jn2Var.f45858d[nn2Var2.f52993g];
                            c = 2;
                        } else {
                            c = 2;
                            if (i15 == 2) {
                                i16 = jn2Var.f45857c[nn2Var2.f52994h];
                            } else {
                                i16 = jn2Var.f45856b[nn2Var2.f52995i];
                            }
                        }
                        paint2.setColor(i16);
                        i13 = i12;
                        c2 = 3;
                        i14 = 0;
                        canvas.drawRect(i13, i6, i9, i10, paint2);
                    } else {
                        i13 = i12;
                        c = 2;
                        i14 = 0;
                        c2 = 3;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((Bitmap) this.f57968g, i13, i6, i36, i37);
                    float f = kn2Var2.f47535a;
                    float f2 = i6;
                    float f3 = kn2Var2.f47536b;
                    arrayList.add(new cs1(null, null, null, bitmapCreateBitmap, f2 / f3, 0, 0, i13 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i36 / f, i37 / f3, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                    canvas.drawColor(i14, PorterDuff.Mode.CLEAR);
                    canvas.restore();
                    i4 = i35 + 1;
                    kn2Var = kn2Var2;
                    arrayList = arrayList;
                    sparseArray = sparseArray7;
                    pn2Var = pn2Var2;
                }
                gs1Var = new gs1(-9223372036854775807L, -9223372036854775807L, arrayList);
            } else {
                i3 = 1;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(kn2Var.f47535a + i3, kn2Var.f47536b + i3, Bitmap.Config.ARGB_8888);
            this.f57968g = bitmapCreateBitmap2;
            canvas.setBitmap(bitmapCreateBitmap2);
            arrayList = new ArrayList();
            sparseArray = (SparseArray) doaVar4.f35974d;
            i4 = 0;
            while (i4 < sparseArray.size()) {
                canvas.save();
                mn2 mn2Var2 = (mn2) sparseArray.valueAt(i4);
                nn2Var = (nn2) pn2Var.f56495c.get(sparseArray.keyAt(i4));
                i5 = mn2Var2.f51552a + kn2Var.f47537c;
                i6 = mn2Var2.f51553b + kn2Var.f47539e;
                i7 = nn2Var.f52989c;
                int i210 = nn2Var.f52992f;
                i8 = nn2Var.f52990d;
                i9 = i5 + i7;
                i10 = i6 + i8;
                SparseArray sparseArray9 = sparseArray;
                canvas.clipRect(i5, i6, Math.min(i9, kn2Var.f47538d), Math.min(i10, kn2Var.f47540f));
                jn2Var = (jn2) pn2Var.f56496d.get(i210);
                if (jn2Var == null) {
                    jn2Var = (jn2) this.f57966e;
                }
                sparseArray2 = nn2Var.f52996j;
                kn2 kn2Var3 = kn2Var;
                i11 = 0;
                while (i11 < sparseArray2.size()) {
                    iKeyAt = sparseArray2.keyAt(i11);
                    int i38 = i4;
                    on2Var = (on2) sparseArray2.valueAt(i11);
                    SparseArray sparseArray10 = sparseArray2;
                    ln2Var = (ln2) pn2Var.f56497e.get(iKeyAt);
                    if (ln2Var == null) {
                        ln2Var = (ln2) pn2Var.f56499g.get(iKeyAt);
                    }
                    ln2Var2 = ln2Var;
                    if (ln2Var2 != null) {
                        if (ln2Var2.f49859b) {
                            paint = null;
                        } else {
                            paint = (Paint) this.f57962a;
                        }
                        int i39 = i5;
                        i20 = nn2Var.f52991e;
                        int i310 = i39 + on2Var.f54611a;
                        int i311 = on2Var.f54612b + i6;
                        if (i20 == 3) {
                            iArr = jn2Var.f45858d;
                        } else if (i20 == 2) {
                            iArr = jn2Var.f45857c;
                        } else {
                            iArr = jn2Var.f45856b;
                        }
                        int i312 = i8;
                        Paint paint4 = paint;
                        nn2 nn2Var7 = nn2Var;
                        int[] iArr3 = iArr;
                        nn2Var3 = nn2Var7;
                        i17 = i39;
                        i18 = i11;
                        i19 = i312;
                        m20040e(ln2Var2.f49860c, iArr3, i20, i310, i311, paint4, canvas);
                        m20040e(ln2Var2.f49861d, iArr3, i20, i310, i311 + 1, paint4, canvas);
                    } else {
                        nn2Var3 = nn2Var;
                        i17 = i5;
                        i18 = i11;
                        i19 = i8;
                    }
                    i11 = i18 + 1;
                    nn2Var = nn2Var3;
                    i5 = i17;
                    sparseArray2 = sparseArray10;
                    i4 = i38;
                    pn2Var = pn2Var;
                    i7 = i7;
                    i8 = i19;
                }
                pn2 pn2Var3 = pn2Var;
                int i313 = i4;
                nn2Var2 = nn2Var;
                i12 = i5;
                int i314 = i7;
                int i315 = i8;
                if (nn2Var2.f52988b) {
                    i15 = nn2Var2.f52991e;
                    if (i15 == 3) {
                        i16 = jn2Var.f45858d[nn2Var2.f52993g];
                        c = 2;
                    } else {
                        c = 2;
                        if (i15 == 2) {
                            i16 = jn2Var.f45857c[nn2Var2.f52994h];
                        } else {
                            i16 = jn2Var.f45856b[nn2Var2.f52995i];
                        }
                    }
                    paint2.setColor(i16);
                    i13 = i12;
                    c2 = 3;
                    i14 = 0;
                    canvas.drawRect(i13, i6, i9, i10, paint2);
                } else {
                    i13 = i12;
                    c = 2;
                    i14 = 0;
                    c2 = 3;
                }
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap((Bitmap) this.f57968g, i13, i6, i314, i315);
                float f4 = kn2Var3.f47535a;
                float f5 = i6;
                float f6 = kn2Var3.f47536b;
                arrayList.add(new cs1(null, null, null, bitmapCreateBitmap3, f5 / f6, 0, 0, i13 / f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i314 / f4, i315 / f6, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(i14, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i4 = i313 + 1;
                kn2Var = kn2Var3;
                arrayList = arrayList;
                sparseArray = sparseArray9;
                pn2Var = pn2Var3;
            }
            gs1Var = new gs1(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        kk1Var.accept(gs1Var);
    }

    /* JADX INFO: renamed from: h */
    public void m20043h() {
        fr5 fr5Var = new fr5((Context) this.f57962a, 0);
        final ff5 ff5Var = (ff5) this.f57966e;
        fr5 fr5VarM12029l = fr5Var.m12029l((ConstraintLayout) ff5Var.f38997c);
        fr5VarM12029l.m12028k(R$string.card_report);
        fr5VarM12029l.f71376a.f65209g = (String) this.f57963b;
        int i = 1;
        DialogInterfaceC0016ae dialogInterfaceC0016aeM25557a = fr5VarM12029l.m12025h(R$string.card_report, new uc2(this, i)).m12022e(R$string.ui_cancel, new uu3(i)).m25557a();
        this.f57965d = dialogInterfaceC0016aeM25557a;
        dialogInterfaceC0016aeM25557a.f530g.f69654i.setEnabled(false);
        ((RadioGroup) ff5Var.f38998d).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: t68
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                qn2 qn2Var = this;
                Context context = (Context) qn2Var.f57962a;
                radioGroup.getClass();
                TextInputLayout textInputLayout = (TextInputLayout) ff5Var.f38996b;
                jfa.m14429l(textInputLayout);
                if (i2 == R$id.rbOffensiveContent) {
                    textInputLayout.setHint(context.getString(R$string.report_provide_details));
                    qn2Var.f57967f = "offensive";
                    return;
                }
                if (i2 == R$id.rbAudioProblems) {
                    textInputLayout.setHint(context.getString(R$string.report_provide_details));
                    qn2Var.f57967f = "audioProblems";
                } else if (i2 == R$id.rvPoorTranscript) {
                    textInputLayout.setHint(context.getString(R$string.report_provide_details));
                    qn2Var.f57967f = "poorTranscript";
                } else if (i2 == R$id.rbOther) {
                    qn2Var.f57967f = "other";
                    textInputLayout.setHint(context.getString(R$string.report_reason));
                }
            }
        });
        ((TextInputEditText) ff5Var.f38995a).addTextChangedListener(new u68(this));
    }

    @Override // p000.cn9
    public void reset() {
        pn2 pn2Var = (pn2) this.f57967f;
        pn2Var.f56495c.clear();
        pn2Var.f56496d.clear();
        pn2Var.f56497e.clear();
        pn2Var.f56498f.clear();
        pn2Var.f56499g.clear();
        pn2Var.f56500h = null;
        pn2Var.f56501i = null;
    }
}
