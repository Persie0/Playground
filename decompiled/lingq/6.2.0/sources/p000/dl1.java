package p000;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths$MergePathsMode;
import com.airbnb.lottie.model.content.PolystarShape$Type;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import com.airbnb.lottie.parser.moshi.C0877c;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dl1 {

    /* JADX INFO: renamed from: a */
    public static final p33 f35776a = p33.m18864S("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX INFO: renamed from: a */
    public static cl1 m10449a(C0877c c0877c, gl5 gl5Var) {
        String strMo5046x;
        cl1 f21Var;
        cl1 x39Var;
        cl1 dp3Var;
        cl1 z39Var;
        c0877c.mo5038b();
        int iMo5045u = 2;
        while (true) {
            if (!c0877c.mo5042p()) {
                strMo5046x = null;
                break;
            }
            int iMo5033J = c0877c.mo5033J(f35776a);
            if (iMo5033J == 0) {
                strMo5046x = c0877c.mo5046x();
                break;
            }
            if (iMo5033J != 1) {
                c0877c.mo5034N();
                c0877c.mo5035R();
            } else {
                iMo5045u = c0877c.mo5045u();
            }
        }
        if (strMo5046x == null) {
            return null;
        }
        boolean zMo5043q = false;
        switch (strMo5046x) {
            case "el":
                p33 p33Var = g21.f40072a;
                boolean z = iMo5045u == 3;
                boolean zMo5043q2 = false;
                String strMo5046x2 = null;
                InterfaceC2969em interfaceC2969emM25689b = null;
                C3726wl c3726wlM23074f = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J2 = c0877c.mo5033J(g21.f40072a);
                    if (iMo5033J2 == 0) {
                        strMo5046x2 = c0877c.mo5046x();
                    } else if (iMo5033J2 == 1) {
                        interfaceC2969emM25689b = AbstractC3837zl.m25689b(c0877c, gl5Var);
                    } else if (iMo5033J2 == 2) {
                        c3726wlM23074f = v2d.m23074f(c0877c, gl5Var);
                    } else if (iMo5033J2 == 3) {
                        zMo5043q2 = c0877c.mo5043q();
                    } else if (iMo5033J2 != 4) {
                        c0877c.mo5034N();
                        c0877c.mo5035R();
                    } else {
                        z = c0877c.mo5045u() == 3;
                    }
                }
                f21Var = new f21(strMo5046x2, interfaceC2969emM25689b, c3726wlM23074f, z, zMo5043q2);
                x39Var = f21Var;
                break;
            case "fl":
                p33 p33Var2 = y39.f69247a;
                int iMo5045u2 = 1;
                boolean zMo5043q3 = false;
                boolean zMo5043q4 = false;
                C3726wl c3726wl = null;
                String strMo5046x3 = null;
                C3726wl c3726wlM23070b = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J3 = c0877c.mo5033J(y39.f69247a);
                    if (iMo5033J3 == 0) {
                        strMo5046x3 = c0877c.mo5046x();
                    } else if (iMo5033J3 == 1) {
                        c3726wlM23070b = v2d.m23070b(c0877c, gl5Var);
                    } else if (iMo5033J3 == 2) {
                        c3726wl = v2d.m23073e(c0877c, gl5Var);
                    } else if (iMo5033J3 == 3) {
                        zMo5043q3 = c0877c.mo5043q();
                    } else if (iMo5033J3 == 4) {
                        iMo5045u2 = c0877c.mo5045u();
                    } else if (iMo5033J3 != 5) {
                        c0877c.mo5034N();
                        c0877c.mo5035R();
                    } else {
                        zMo5043q4 = c0877c.mo5043q();
                    }
                }
                if (c3726wl == null) {
                    c3726wl = new C3726wl(2, Collections.singletonList(new kj4(100)));
                }
                x39Var = new x39(strMo5046x3, zMo5043q3, iMo5045u2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c3726wlM23070b, c3726wl, zMo5043q4);
                break;
            case "gf":
                p33 p33Var3 = fp3.f39412a;
                Path.FillType fillType = Path.FillType.WINDING;
                boolean zMo5043q5 = false;
                C3726wl c3726wl2 = null;
                String strMo5046x4 = null;
                GradientType gradientType = null;
                C3726wl c3726wlM23072d = null;
                C3726wl c3726wlM23074f2 = null;
                C3726wl c3726wlM23074f3 = null;
                while (c0877c.mo5042p()) {
                    switch (c0877c.mo5033J(fp3.f39412a)) {
                        case 0:
                            strMo5046x4 = c0877c.mo5046x();
                            break;
                        case 1:
                            c0877c.mo5038b();
                            int iMo5045u3 = -1;
                            while (c0877c.mo5042p()) {
                                int iMo5033J4 = c0877c.mo5033J(fp3.f39413b);
                                if (iMo5033J4 == 0) {
                                    iMo5045u3 = c0877c.mo5045u();
                                } else if (iMo5033J4 != 1) {
                                    c0877c.mo5034N();
                                    c0877c.mo5035R();
                                } else {
                                    c3726wlM23072d = v2d.m23072d(c0877c, gl5Var, iMo5045u3);
                                }
                            }
                            c0877c.mo5040e();
                            break;
                        case 2:
                            c3726wl2 = v2d.m23073e(c0877c, gl5Var);
                            break;
                        case 3:
                            gradientType = c0877c.mo5045u() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            c3726wlM23074f2 = v2d.m23074f(c0877c, gl5Var);
                            break;
                        case 5:
                            c3726wlM23074f3 = v2d.m23074f(c0877c, gl5Var);
                            break;
                        case 6:
                            fillType = c0877c.mo5045u() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zMo5043q5 = c0877c.mo5043q();
                            break;
                        default:
                            c0877c.mo5034N();
                            c0877c.mo5035R();
                            break;
                    }
                }
                if (c3726wl2 == null) {
                    c3726wl2 = new C3726wl(2, Collections.singletonList(new kj4(100)));
                }
                dp3Var = new dp3(strMo5046x4, gradientType, fillType, c3726wlM23072d, c3726wl2, c3726wlM23074f2, c3726wlM23074f3, zMo5043q5);
                x39Var = dp3Var;
                break;
            case "gr":
                p33 p33Var4 = a49.f244a;
                ArrayList arrayList = new ArrayList();
                String strMo5046x5 = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J5 = c0877c.mo5033J(a49.f244a);
                    if (iMo5033J5 == 0) {
                        strMo5046x5 = c0877c.mo5046x();
                    } else if (iMo5033J5 == 1) {
                        zMo5043q = c0877c.mo5043q();
                    } else if (iMo5033J5 != 2) {
                        c0877c.mo5035R();
                    } else {
                        c0877c.mo5037a();
                        while (c0877c.mo5042p()) {
                            cl1 cl1VarM10449a = m10449a(c0877c, gl5Var);
                            if (cl1VarM10449a != null) {
                                arrayList.add(cl1VarM10449a);
                            }
                        }
                        c0877c.mo5039c();
                    }
                }
                z39Var = new z39(strMo5046x5, arrayList, zMo5043q);
                x39Var = z39Var;
                break;
            case "gs":
                p33 p33Var5 = ip3.f44391a;
                ArrayList arrayList2 = new ArrayList();
                boolean zMo5043q6 = false;
                float fMo5044r = 0.0f;
                C3726wl c3726wl3 = null;
                String strMo5046x6 = null;
                GradientType gradientType2 = null;
                C3726wl c3726wlM23072d2 = null;
                C3726wl c3726wlM23074f4 = null;
                C3726wl c3726wlM23074f5 = null;
                C3763xl c3763xlM23071c = null;
                ShapeStroke$LineCapType shapeStroke$LineCapType = null;
                ShapeStroke$LineJoinType shapeStroke$LineJoinType = null;
                C3763xl c3763xl = null;
                while (c0877c.mo5042p()) {
                    switch (c0877c.mo5033J(ip3.f44391a)) {
                        case 0:
                            strMo5046x6 = c0877c.mo5046x();
                            break;
                        case 1:
                            c0877c.mo5038b();
                            int iMo5045u4 = -1;
                            while (c0877c.mo5042p()) {
                                int iMo5033J6 = c0877c.mo5033J(ip3.f44392b);
                                if (iMo5033J6 == 0) {
                                    iMo5045u4 = c0877c.mo5045u();
                                } else if (iMo5033J6 != 1) {
                                    c0877c.mo5034N();
                                    c0877c.mo5035R();
                                } else {
                                    c3726wlM23072d2 = v2d.m23072d(c0877c, gl5Var, iMo5045u4);
                                }
                            }
                            c0877c.mo5040e();
                            break;
                        case 2:
                            c3726wl3 = v2d.m23073e(c0877c, gl5Var);
                            break;
                        case 3:
                            gradientType2 = c0877c.mo5045u() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            c3726wlM23074f4 = v2d.m23074f(c0877c, gl5Var);
                            break;
                        case 5:
                            c3726wlM23074f5 = v2d.m23074f(c0877c, gl5Var);
                            break;
                        case 6:
                            c3763xlM23071c = v2d.m23071c(c0877c, gl5Var, true);
                            break;
                        case 7:
                            shapeStroke$LineCapType = ShapeStroke$LineCapType.values()[c0877c.mo5045u() - 1];
                            break;
                        case 8:
                            shapeStroke$LineJoinType = ShapeStroke$LineJoinType.values()[c0877c.mo5045u() - 1];
                            break;
                        case 9:
                            fMo5044r = (float) c0877c.mo5044r();
                            break;
                        case 10:
                            zMo5043q6 = c0877c.mo5043q();
                            break;
                        case 11:
                            c0877c.mo5037a();
                            while (c0877c.mo5042p()) {
                                c0877c.mo5038b();
                                String strMo5046x7 = null;
                                C3763xl c3763xlM23071c2 = null;
                                while (c0877c.mo5042p()) {
                                    int iMo5033J7 = c0877c.mo5033J(ip3.f44393c);
                                    if (iMo5033J7 == 0) {
                                        strMo5046x7 = c0877c.mo5046x();
                                    } else if (iMo5033J7 != 1) {
                                        c0877c.mo5034N();
                                        c0877c.mo5035R();
                                    } else {
                                        c3763xlM23071c2 = v2d.m23071c(c0877c, gl5Var, true);
                                    }
                                }
                                c0877c.mo5040e();
                                if (strMo5046x7.equals("o")) {
                                    c3763xl = c3763xlM23071c2;
                                } else if (strMo5046x7.equals("d") || strMo5046x7.equals("g")) {
                                    gl5Var.f40971o = true;
                                    arrayList2.add(c3763xlM23071c2);
                                }
                            }
                            c0877c.mo5039c();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((C3763xl) arrayList2.get(0));
                            }
                            break;
                        default:
                            c0877c.mo5034N();
                            c0877c.mo5035R();
                            break;
                    }
                }
                if (c3726wl3 == null) {
                    c3726wl3 = new C3726wl(2, Collections.singletonList(new kj4(100)));
                }
                dp3Var = new gp3(strMo5046x6, gradientType2, c3726wlM23072d2, c3726wl3, c3726wlM23074f4, c3726wlM23074f5, c3763xlM23071c, shapeStroke$LineCapType, shapeStroke$LineJoinType, fMo5044r, arrayList2, c3763xl, zMo5043q6);
                x39Var = dp3Var;
                break;
            case "mm":
                p33 p33Var6 = nx5.f53361a;
                MergePaths$MergePathsMode mergePaths$MergePathsModeForId = null;
                String strMo5046x8 = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J8 = c0877c.mo5033J(nx5.f53361a);
                    if (iMo5033J8 == 0) {
                        strMo5046x8 = c0877c.mo5046x();
                    } else if (iMo5033J8 == 1) {
                        mergePaths$MergePathsModeForId = MergePaths$MergePathsMode.forId(c0877c.mo5045u());
                    } else if (iMo5033J8 != 2) {
                        c0877c.mo5034N();
                        c0877c.mo5035R();
                    } else {
                        zMo5043q = c0877c.mo5043q();
                    }
                }
                kx5 kx5Var = new kx5(strMo5046x8, mergePaths$MergePathsModeForId, zMo5043q);
                gl5Var.m12727a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                x39Var = kx5Var;
                break;
            case "rc":
                p33 p33Var7 = l28.f48942a;
                boolean zMo5043q7 = false;
                String strMo5046x9 = null;
                InterfaceC2969em interfaceC2969emM25689b2 = null;
                C3726wl c3726wlM23074f6 = null;
                C3763xl c3763xlM23071c3 = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J9 = c0877c.mo5033J(l28.f48942a);
                    if (iMo5033J9 == 0) {
                        strMo5046x9 = c0877c.mo5046x();
                    } else if (iMo5033J9 == 1) {
                        interfaceC2969emM25689b2 = AbstractC3837zl.m25689b(c0877c, gl5Var);
                    } else if (iMo5033J9 == 2) {
                        c3726wlM23074f6 = v2d.m23074f(c0877c, gl5Var);
                    } else if (iMo5033J9 == 3) {
                        c3763xlM23071c3 = v2d.m23071c(c0877c, gl5Var, true);
                    } else if (iMo5033J9 != 4) {
                        c0877c.mo5035R();
                    } else {
                        zMo5043q7 = c0877c.mo5043q();
                    }
                }
                f21Var = new k28(strMo5046x9, interfaceC2969emM25689b2, c3726wlM23074f6, c3763xlM23071c3, zMo5043q7);
                x39Var = f21Var;
                break;
            case "rd":
                p33 p33Var8 = yi8.f69875a;
                String strMo5046x10 = null;
                C3763xl c3763xlM23071c4 = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J10 = c0877c.mo5033J(yi8.f69875a);
                    if (iMo5033J10 == 0) {
                        strMo5046x10 = c0877c.mo5046x();
                    } else if (iMo5033J10 == 1) {
                        c3763xlM23071c4 = v2d.m23071c(c0877c, gl5Var, true);
                    } else if (iMo5033J10 != 2) {
                        c0877c.mo5035R();
                    } else {
                        zMo5043q = c0877c.mo5043q();
                    }
                }
                if (zMo5043q) {
                    x39Var = null;
                    break;
                } else {
                    x39Var = new wi8(strMo5046x10, c3763xlM23071c4);
                    break;
                }
                break;
            case "rp":
                p33 p33Var9 = l68.f49198a;
                boolean zMo5043q8 = false;
                String strMo5046x11 = null;
                C3763xl c3763xlM23071c5 = null;
                C3763xl c3763xlM23071c6 = null;
                C0852cm c0852cmM10458c = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J11 = c0877c.mo5033J(l68.f49198a);
                    if (iMo5033J11 == 0) {
                        strMo5046x11 = c0877c.mo5046x();
                    } else if (iMo5033J11 == 1) {
                        c3763xlM23071c5 = v2d.m23071c(c0877c, gl5Var, false);
                    } else if (iMo5033J11 == 2) {
                        c3763xlM23071c6 = v2d.m23071c(c0877c, gl5Var, false);
                    } else if (iMo5033J11 == 3) {
                        c0852cmM10458c = AbstractC2933dm.m10458c(c0877c, gl5Var);
                    } else if (iMo5033J11 != 4) {
                        c0877c.mo5035R();
                    } else {
                        zMo5043q8 = c0877c.mo5043q();
                    }
                }
                f21Var = new k28(strMo5046x11, c3763xlM23071c5, c3763xlM23071c6, c0852cmM10458c, zMo5043q8);
                x39Var = f21Var;
                break;
            case "sh":
                p33 p33Var10 = n49.f52344a;
                int iMo5045u5 = 0;
                boolean zMo5043q9 = false;
                C3726wl c3726wl4 = null;
                String strMo5046x12 = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J12 = c0877c.mo5033J(n49.f52344a);
                    if (iMo5033J12 == 0) {
                        strMo5046x12 = c0877c.mo5046x();
                    } else if (iMo5033J12 == 1) {
                        iMo5045u5 = c0877c.mo5045u();
                    } else if (iMo5033J12 == 2) {
                        c3726wl4 = new C3726wl(5, nj4.m17476a(c0877c, gl5Var, fna.m11957c(), v39.f64794a, false));
                    } else if (iMo5033J12 != 3) {
                        c0877c.mo5035R();
                    } else {
                        zMo5043q9 = c0877c.mo5043q();
                    }
                }
                z39Var = new m49(strMo5046x12, iMo5045u5, c3726wl4, zMo5043q9);
                x39Var = z39Var;
                break;
            case "sr":
                p33 p33Var11 = bh7.f8542a;
                boolean z2 = iMo5045u == 3;
                boolean zMo5043q10 = false;
                String strMo5046x13 = null;
                PolystarShape$Type polystarShape$TypeForValue = null;
                C3763xl c3763xlM23071c7 = null;
                InterfaceC2969em interfaceC2969emM25689b3 = null;
                C3763xl c3763xlM23071c8 = null;
                C3763xl c3763xlM23071c9 = null;
                C3763xl c3763xlM23071c10 = null;
                C3763xl c3763xlM23071c11 = null;
                C3763xl c3763xlM23071c12 = null;
                while (c0877c.mo5042p()) {
                    switch (c0877c.mo5033J(bh7.f8542a)) {
                        case 0:
                            strMo5046x13 = c0877c.mo5046x();
                            break;
                        case 1:
                            polystarShape$TypeForValue = PolystarShape$Type.forValue(c0877c.mo5045u());
                            break;
                        case 2:
                            c3763xlM23071c7 = v2d.m23071c(c0877c, gl5Var, false);
                            break;
                        case 3:
                            interfaceC2969emM25689b3 = AbstractC3837zl.m25689b(c0877c, gl5Var);
                            break;
                        case 4:
                            c3763xlM23071c8 = v2d.m23071c(c0877c, gl5Var, false);
                            break;
                        case 5:
                            c3763xlM23071c10 = v2d.m23071c(c0877c, gl5Var, true);
                            break;
                        case 6:
                            c3763xlM23071c12 = v2d.m23071c(c0877c, gl5Var, false);
                            break;
                        case 7:
                            c3763xlM23071c9 = v2d.m23071c(c0877c, gl5Var, true);
                            break;
                        case 8:
                            c3763xlM23071c11 = v2d.m23071c(c0877c, gl5Var, false);
                            break;
                        case 9:
                            zMo5043q10 = c0877c.mo5043q();
                            break;
                        case 10:
                            z2 = c0877c.mo5045u() == 3;
                            break;
                        default:
                            c0877c.mo5034N();
                            c0877c.mo5035R();
                            break;
                    }
                }
                f21Var = new ah7(strMo5046x13, polystarShape$TypeForValue, c3763xlM23071c7, interfaceC2969emM25689b3, c3763xlM23071c8, c3763xlM23071c9, c3763xlM23071c10, c3763xlM23071c11, c3763xlM23071c12, zMo5043q10, z2);
                x39Var = f21Var;
                break;
            case "st":
                p33 p33Var12 = q49.f57267a;
                ArrayList arrayList3 = new ArrayList();
                boolean zMo5043q11 = false;
                float fMo5044r2 = 0.0f;
                C3726wl c3726wl5 = null;
                ShapeStroke$LineCapType shapeStroke$LineCapType2 = null;
                ShapeStroke$LineJoinType shapeStroke$LineJoinType2 = null;
                String strMo5046x14 = null;
                C3763xl c3763xl2 = null;
                C3726wl c3726wlM23070b2 = null;
                C3763xl c3763xlM23071c13 = null;
                while (c0877c.mo5042p()) {
                    switch (c0877c.mo5033J(q49.f57267a)) {
                        case 0:
                            strMo5046x14 = c0877c.mo5046x();
                            break;
                        case 1:
                            c3726wlM23070b2 = v2d.m23070b(c0877c, gl5Var);
                            break;
                        case 2:
                            c3763xlM23071c13 = v2d.m23071c(c0877c, gl5Var, true);
                            break;
                        case 3:
                            c3726wl5 = v2d.m23073e(c0877c, gl5Var);
                            break;
                        case 4:
                            shapeStroke$LineCapType2 = ShapeStroke$LineCapType.values()[c0877c.mo5045u() - 1];
                            break;
                        case 5:
                            shapeStroke$LineJoinType2 = ShapeStroke$LineJoinType.values()[c0877c.mo5045u() - 1];
                            break;
                        case 6:
                            fMo5044r2 = (float) c0877c.mo5044r();
                            break;
                        case 7:
                            zMo5043q11 = c0877c.mo5043q();
                            break;
                        case 8:
                            c0877c.mo5037a();
                            while (c0877c.mo5042p()) {
                                c0877c.mo5038b();
                                String strMo5046x15 = null;
                                C3763xl c3763xlM23071c14 = null;
                                while (c0877c.mo5042p()) {
                                    int iMo5033J13 = c0877c.mo5033J(q49.f57268b);
                                    if (iMo5033J13 == 0) {
                                        strMo5046x15 = c0877c.mo5046x();
                                    } else if (iMo5033J13 != 1) {
                                        c0877c.mo5034N();
                                        c0877c.mo5035R();
                                    } else {
                                        c3763xlM23071c14 = v2d.m23071c(c0877c, gl5Var, true);
                                    }
                                }
                                c0877c.mo5040e();
                                strMo5046x15.getClass();
                                switch (strMo5046x15) {
                                    case "d":
                                    case "g":
                                        gl5Var.f40971o = true;
                                        arrayList3.add(c3763xlM23071c14);
                                        break;
                                    case "o":
                                        c3763xl2 = c3763xlM23071c14;
                                        break;
                                }
                            }
                            c0877c.mo5039c();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((C3763xl) arrayList3.get(0));
                            }
                            break;
                        default:
                            c0877c.mo5035R();
                            break;
                    }
                }
                if (c3726wl5 == null) {
                    c3726wl5 = new C3726wl(2, Collections.singletonList(new kj4(100)));
                }
                C3726wl c3726wl6 = c3726wl5;
                if (shapeStroke$LineCapType2 == null) {
                    shapeStroke$LineCapType2 = ShapeStroke$LineCapType.BUTT;
                }
                ShapeStroke$LineCapType shapeStroke$LineCapType3 = shapeStroke$LineCapType2;
                if (shapeStroke$LineJoinType2 == null) {
                    shapeStroke$LineJoinType2 = ShapeStroke$LineJoinType.MITER;
                }
                x39Var = new p49(strMo5046x14, c3763xl2, arrayList3, c3726wlM23070b2, c3726wl6, c3763xlM23071c13, shapeStroke$LineCapType3, shapeStroke$LineJoinType2, fMo5044r2, zMo5043q11);
                break;
            case "tm":
                p33 p33Var13 = s49.f60305a;
                boolean zMo5043q12 = false;
                String strMo5046x16 = null;
                ShapeTrimPath$Type shapeTrimPath$TypeForId = null;
                C3763xl c3763xlM23071c15 = null;
                C3763xl c3763xlM23071c16 = null;
                C3763xl c3763xlM23071c17 = null;
                while (c0877c.mo5042p()) {
                    int iMo5033J14 = c0877c.mo5033J(s49.f60305a);
                    if (iMo5033J14 == 0) {
                        c3763xlM23071c15 = v2d.m23071c(c0877c, gl5Var, false);
                    } else if (iMo5033J14 == 1) {
                        c3763xlM23071c16 = v2d.m23071c(c0877c, gl5Var, false);
                    } else if (iMo5033J14 == 2) {
                        c3763xlM23071c17 = v2d.m23071c(c0877c, gl5Var, false);
                    } else if (iMo5033J14 == 3) {
                        strMo5046x16 = c0877c.mo5046x();
                    } else if (iMo5033J14 == 4) {
                        shapeTrimPath$TypeForId = ShapeTrimPath$Type.forId(c0877c.mo5045u());
                    } else if (iMo5033J14 != 5) {
                        c0877c.mo5035R();
                    } else {
                        zMo5043q12 = c0877c.mo5043q();
                    }
                }
                f21Var = new k28(strMo5046x16, shapeTrimPath$TypeForId, c3763xlM23071c15, c3763xlM23071c16, c3763xlM23071c17, zMo5043q12);
                x39Var = f21Var;
                break;
            case "tr":
                x39Var = AbstractC2933dm.m10458c(c0877c, gl5Var);
                break;
            default:
                tj5.m22151c("Unknown shape type ".concat(strMo5046x));
                x39Var = null;
                break;
        }
        while (c0877c.mo5042p()) {
            c0877c.mo5035R();
        }
        c0877c.mo5040e();
        return x39Var;
    }
}
