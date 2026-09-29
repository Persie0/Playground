package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class mwa implements cn9 {

    /* JADX INFO: renamed from: e */
    public static final gs1 f51977e = new gs1(-9223372036854775807L, -9223372036854775807L, ImmutableList.m6289v());

    /* JADX INFO: renamed from: a */
    public final k47 f51978a = new k47();

    /* JADX INFO: renamed from: b */
    public final k47 f51979b = new k47();

    /* JADX INFO: renamed from: c */
    public final lwa f51980c;

    /* JADX INFO: renamed from: d */
    public Inflater f51981d;

    public mwa(List list) {
        int i;
        lwa lwaVar = new lwa();
        this.f51980c = lwaVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = uma.f64080a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                lwaVar.f50226f = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = lwaVar.f50226f;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        ss5.m21709e0("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    ss5.m21707d0("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        lwaVar.f50227g = Integer.parseInt(strArrSplit2[0]);
                        lwaVar.f50228h = Integer.parseInt(strArrSplit2[1]);
                        lwaVar.f50224d = true;
                    } catch (RuntimeException e2) {
                        ss5.m21709e0("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x028f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0295  */
    /* JADX WARN: Code duplicated, block: B:106:0x029b  */
    /* JADX WARN: Code duplicated, block: B:92:0x027b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0282  */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00cb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public final void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        gs1 gs1Var;
        char c;
        long j;
        char c2;
        char c3;
        cs1 cs1Var;
        long j2;
        long j3;
        ImmutableList immutableListM6289v;
        long j4;
        Rect rect;
        k47 k47Var = this.f51978a;
        k47Var.m14816K(i + i2, bArr);
        k47Var.m14818M(i);
        if (this.f51981d == null) {
            this.f51981d = new Inflater();
        }
        Inflater inflater = this.f51981d;
        String str = uma.f64080a;
        if (k47Var.m14820a() > 0 && k47Var.m14826j() == 120) {
            k47 k47Var2 = this.f51979b;
            if (uma.m22827v(k47Var, k47Var2, inflater)) {
                k47Var.m14816K(k47Var2.f46702c, k47Var2.f46700a);
            }
        }
        lwa lwaVar = this.f51980c;
        long j5 = -9223372036854775807L;
        lwaVar.f50222b = -9223372036854775807L;
        lwaVar.f50223c = -9223372036854775807L;
        char c4 = 0;
        lwaVar.f50225e = false;
        lwaVar.f50229i = null;
        lwaVar.f50230j = -1;
        lwaVar.f50231k = -1;
        int iM14820a = k47Var.m14820a();
        if (iM14820a < 2 || k47Var.m14812G() != iM14820a) {
            gs1Var = f51977e;
        } else {
            if (lwaVar.f50226f == null) {
                ss5.m21707d0("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (lwaVar.f50224d) {
                    int i3 = k47Var.f46701b - 2;
                    k47Var.m14818M(k47Var.m14812G() + i3);
                    while (true) {
                        if (k47Var.m14820a() < 4) {
                            j = j5;
                            c2 = c4;
                            c = c2;
                        } else {
                            int i4 = k47Var.f46701b;
                            int iM14812G = k47Var.m14812G() * 10000;
                            int iM14812G2 = k47Var.m14812G() + i3;
                            c = (iM14812G2 == i4 || iM14812G2 >= k47Var.f46702c) ? c4 : (char) 1;
                            int i5 = c != 0 ? iM14812G2 : k47Var.f46702c;
                            j = j5;
                            char c5 = 1;
                            while (k47Var.f46701b < i5 && c5 != 0) {
                                long j6 = iM14812G;
                                int[] iArr = lwaVar.f50221a;
                                char c6 = c4;
                                int iM14842z = k47Var.m14842z();
                                if (iM14842z != 255) {
                                    switch (iM14842z) {
                                        case 0:
                                            c3 = 1;
                                            break;
                                        case 1:
                                            lwaVar.f50222b = j6;
                                            c3 = 1;
                                            break;
                                        case 2:
                                            lwaVar.f50223c = j6;
                                            c3 = 1;
                                            break;
                                        case 3:
                                            if (k47Var.m14820a() >= 2) {
                                                int iM14842z2 = k47Var.m14842z();
                                                int iM14842z3 = k47Var.m14842z();
                                                iArr[3] = lwa.m16556a(lwaVar.f50226f, iM14842z2 >> 4);
                                                iArr[2] = lwa.m16556a(lwaVar.f50226f, iM14842z2 & 15);
                                                iArr[1] = lwa.m16556a(lwaVar.f50226f, iM14842z3 >> 4);
                                                iArr[c6] = lwa.m16556a(lwaVar.f50226f, iM14842z3 & 15);
                                                lwaVar.f50225e = true;
                                                c3 = 1;
                                            } else {
                                                ss5.m21707d0("VobsubParser", "Incomplete color command");
                                                c3 = c6;
                                            }
                                            break;
                                        case 4:
                                            if (k47Var.m14820a() < 2) {
                                                ss5.m21707d0("VobsubParser", "Incomplete alpha command");
                                            } else if (lwaVar.f50225e) {
                                                int iM14842z4 = k47Var.m14842z();
                                                int iM14842z5 = k47Var.m14842z();
                                                iArr[3] = lwa.m16557c(iArr[3], iM14842z4 >> 4);
                                                iArr[2] = lwa.m16557c(iArr[2], iM14842z4 & 15);
                                                iArr[1] = lwa.m16557c(iArr[1], iM14842z5 >> 4);
                                                iArr[c6] = lwa.m16557c(iArr[c6], iM14842z5 & 15);
                                                c3 = 1;
                                            } else {
                                                ss5.m21707d0("VobsubParser", "Ignoring alpha command before color command");
                                            }
                                            c3 = c6;
                                            break;
                                        case 5:
                                            if (k47Var.m14820a() >= 6) {
                                                int iM14842z6 = k47Var.m14842z();
                                                int iM14842z7 = k47Var.m14842z();
                                                int i6 = (iM14842z6 << 4) | (iM14842z7 >> 4);
                                                int iM14842z8 = ((iM14842z7 & 15) << 8) | k47Var.m14842z();
                                                int iM14842z9 = k47Var.m14842z();
                                                int iM14842z10 = k47Var.m14842z();
                                                lwaVar.f50229i = new Rect(i6, (iM14842z9 << 4) | (iM14842z10 >> 4), iM14842z8 + 1, (((iM14842z10 & 15) << 8) | k47Var.m14842z()) + 1);
                                                c3 = 1;
                                            } else {
                                                ss5.m21707d0("VobsubParser", "Incomplete area command");
                                                c3 = c6;
                                            }
                                            break;
                                        case 6:
                                            if (k47Var.m14820a() >= 4) {
                                                lwaVar.f50230j = k47Var.m14812G();
                                                lwaVar.f50231k = k47Var.m14812G();
                                                c3 = 1;
                                            } else {
                                                ss5.m21707d0("VobsubParser", "Incomplete offsets command");
                                                c3 = c6;
                                            }
                                            break;
                                        default:
                                            hn1.m13364n("Unrecognized command: ", iM14842z, "VobsubParser");
                                            c3 = c6;
                                            break;
                                    }
                                } else {
                                    c3 = c6;
                                }
                                c4 = c6;
                                c5 = c3;
                            }
                            c2 = c4;
                            if (c != 0) {
                                k47Var.m14818M(iM14812G2);
                            }
                        }
                        if (c != 0) {
                            j5 = j;
                            c4 = c2;
                        }
                    }
                } else {
                    ss5.m21707d0("VobsubParser", "Skipping SPU (no plane)");
                }
                if (lwaVar.f50226f != null || !lwaVar.f50224d || !lwaVar.f50225e || (rect = lwaVar.f50229i) == null || lwaVar.f50230j == -1 || lwaVar.f50231k == -1 || rect.width() < 2 || lwaVar.f50229i.height() < 2) {
                    cs1Var = null;
                } else {
                    Rect rect2 = lwaVar.f50229i;
                    int[] iArr2 = new int[rect2.height() * rect2.width()];
                    so0 so0Var = new so0();
                    k47Var.m14818M(lwaVar.f50230j);
                    so0Var.m21508l(k47Var);
                    lwaVar.m16558b(so0Var, true, rect2, iArr2);
                    k47Var.m14818M(lwaVar.f50231k);
                    so0Var.m21508l(k47Var);
                    lwaVar.m16558b(so0Var, c2, rect2, iArr2);
                    cs1Var = new cs1(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / lwaVar.f50228h, 0, 0, rect2.left / lwaVar.f50227g, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / lwaVar.f50227g, rect2.height() / lwaVar.f50228h, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                }
                j2 = lwaVar.f50223c;
                if (j2 != j) {
                    j4 = lwaVar.f50222b;
                    if (j4 != j && j2 > j4) {
                        j2 -= j4;
                    }
                    j3 = j2;
                } else {
                    j3 = j;
                }
                if (cs1Var != null) {
                    immutableListM6289v = ImmutableList.m6291y(cs1Var);
                } else {
                    immutableListM6289v = ImmutableList.m6289v();
                }
                gs1Var = new gs1(lwaVar.f50222b, j3, immutableListM6289v);
            }
            j = -9223372036854775807L;
            c2 = 0;
            if (lwaVar.f50226f != null) {
                cs1Var = null;
            } else {
                cs1Var = null;
            }
            j2 = lwaVar.f50223c;
            if (j2 != j) {
                j4 = lwaVar.f50222b;
                if (j4 != j) {
                    j2 -= j4;
                }
                j3 = j2;
            } else {
                j3 = j;
            }
            if (cs1Var != null) {
                immutableListM6289v = ImmutableList.m6291y(cs1Var);
            } else {
                immutableListM6289v = ImmutableList.m6289v();
            }
            gs1Var = new gs1(lwaVar.f50222b, j3, immutableListM6289v);
        }
        kk1Var.accept(gs1Var);
    }
}
