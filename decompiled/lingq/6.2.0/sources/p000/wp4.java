package p000;

import android.graphics.Color;
import android.view.animation.Interpolator;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask$MaskMode;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import com.airbnb.lottie.parser.moshi.C0877c;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wp4 {

    /* JADX INFO: renamed from: a */
    public static final p33 f67151a = p33.m18864S("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b */
    public static final p33 f67152b = p33.m18864S("d", "a");

    /* JADX INFO: renamed from: c */
    public static final p33 f67153c = p33.m18864S("ty", "nm");

    /* JADX WARN: Code duplicated, block: B:196:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ab  */
    /* JADX INFO: renamed from: a */
    public static tp4 m24097a(C0877c c0877c, gl5 gl5Var) {
        boolean z;
        String str;
        boolean z2;
        float f;
        Float f2;
        TextRangeUnits textRangeUnits;
        Float f3;
        C3763xl c3763xl;
        C3763xl c3763xl2;
        C3763xl c3763xl3;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Layer$MatteType layer$MatteType = Layer$MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c0877c.mo5038b();
        boolean z3 = false;
        Layer$MatteType layer$MatteType2 = layer$MatteType;
        LBlendMode lBlendMode2 = lBlendMode;
        float fMo5044r = 0.0f;
        float fMo5044r2 = 0.0f;
        float fMo5044r3 = 0.0f;
        float fMo5044r4 = 0.0f;
        float fMo5044r5 = 0.0f;
        boolean z4 = false;
        int iM11957c = 0;
        int iM11957c2 = 0;
        int color = 0;
        boolean zMo5043q = false;
        C0852cm c0852cmM10458c = null;
        Layer$LayerType layer$LayerType = null;
        String strMo5046x = null;
        hi8 hi8Var = null;
        ca1 ca1Var = null;
        C3726wl c3726wl = null;
        C3156jq c3156jq = null;
        C3763xl c3763xlM23071c = null;
        float fMo5044r6 = 1.0f;
        long jMo5045u = 0;
        String strMo5046x2 = null;
        String strMo5046x3 = "UNSET";
        long jMo5045u2 = -1;
        while (c0877c.mo5042p()) {
            boolean z5 = true;
            switch (c0877c.mo5033J(f67151a)) {
                case 0:
                    strMo5046x3 = c0877c.mo5046x();
                    strMo5046x2 = strMo5046x2;
                    break;
                case 1:
                    jMo5045u = c0877c.mo5045u();
                    strMo5046x2 = strMo5046x2;
                    fValueOf = fValueOf;
                    break;
                case 2:
                    strMo5046x = c0877c.mo5046x();
                    strMo5046x2 = strMo5046x2;
                    break;
                case 3:
                    fValueOf = fValueOf;
                    str = strMo5046x2;
                    z2 = z3;
                    f = fMo5044r6;
                    int iMo5045u = c0877c.mo5045u();
                    layer$LayerType = Layer$LayerType.UNKNOWN;
                    if (iMo5045u < layer$LayerType.ordinal()) {
                        layer$LayerType = Layer$LayerType.values()[iMo5045u];
                    }
                    z3 = z2;
                    strMo5046x2 = str;
                    fMo5044r6 = f;
                    fValueOf = fValueOf;
                    break;
                case 4:
                    jMo5045u2 = c0877c.mo5045u();
                    strMo5046x2 = strMo5046x2;
                    fValueOf = fValueOf;
                    break;
                case 5:
                    iM11957c = (int) (fna.m11957c() * c0877c.mo5045u());
                    strMo5046x2 = strMo5046x2;
                    fValueOf = fValueOf;
                    break;
                case 6:
                    iM11957c2 = (int) (fna.m11957c() * c0877c.mo5045u());
                    strMo5046x2 = strMo5046x2;
                    fValueOf = fValueOf;
                    break;
                case 7:
                    color = Color.parseColor(c0877c.mo5046x());
                    strMo5046x2 = strMo5046x2;
                    fValueOf = fValueOf;
                    break;
                case 8:
                    c0852cmM10458c = AbstractC2933dm.m10458c(c0877c, gl5Var);
                    strMo5046x2 = strMo5046x2;
                    break;
                case 9:
                    fValueOf = fValueOf;
                    str = strMo5046x2;
                    z2 = z3;
                    f = fMo5044r6;
                    int iMo5045u2 = c0877c.mo5045u();
                    if (iMo5045u2 >= Layer$MatteType.values().length) {
                        gl5Var.m12727a("Unsupported matte type: " + iMo5045u2);
                    } else {
                        layer$MatteType2 = Layer$MatteType.values()[iMo5045u2];
                        int i = vp4.f65759a[layer$MatteType2.ordinal()];
                        if (i == 1) {
                            gl5Var.m12727a("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            gl5Var.m12727a("Unsupported matte type: Luma Inverted");
                        }
                        gl5Var.f40972p++;
                    }
                    z3 = z2;
                    strMo5046x2 = str;
                    fMo5044r6 = f;
                    fValueOf = fValueOf;
                    break;
                case 10:
                    fValueOf = fValueOf;
                    f = fMo5044r6;
                    c0877c.mo5037a();
                    while (c0877c.mo5042p()) {
                        c0877c.mo5038b();
                        Mask$MaskMode mask$MaskMode = null;
                        C3726wl c3726wl2 = null;
                        C3726wl c3726wlM23073e = null;
                        boolean zMo5043q2 = false;
                        while (c0877c.mo5042p()) {
                            String strM5053h0 = c0877c.m5053h0();
                            strM5053h0.getClass();
                            switch (strM5053h0) {
                                case "o":
                                    strMo5046x2 = strMo5046x2;
                                    c3726wlM23073e = v2d.m23073e(c0877c, gl5Var);
                                    break;
                                case "pt":
                                    strMo5046x2 = strMo5046x2;
                                    c3726wl2 = new C3726wl(5, nj4.m17476a(c0877c, gl5Var, fna.m11957c(), v39.f64794a, false));
                                    break;
                                case "inv":
                                    zMo5043q2 = c0877c.mo5043q();
                                    break;
                                case "mode":
                                    String strMo5046x4 = c0877c.mo5046x();
                                    strMo5046x4.getClass();
                                    switch (strMo5046x4) {
                                        case "a":
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_ADD;
                                            break;
                                        case "i":
                                            gl5Var.m12727a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_INTERSECT;
                                            break;
                                        case "n":
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_NONE;
                                            break;
                                        case "s":
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_SUBTRACT;
                                            break;
                                        default:
                                            tj5.m22151c("Unknown mask mode " + strM5053h0 + ". Defaulting to Add.");
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_ADD;
                                            break;
                                    }
                                    break;
                                default:
                                    c0877c.mo5035R();
                                    break;
                            }
                            strMo5046x2 = strMo5046x2;
                        }
                        c0877c.mo5040e();
                        arrayList.add(new mq5(mask$MaskMode, c3726wl2, c3726wlM23073e, zMo5043q2));
                        strMo5046x2 = strMo5046x2;
                    }
                    str = strMo5046x2;
                    z2 = false;
                    gl5Var.f40972p += arrayList.size();
                    c0877c.mo5039c();
                    z3 = z2;
                    strMo5046x2 = str;
                    fMo5044r6 = f;
                    fValueOf = fValueOf;
                    break;
                case 11:
                    fValueOf = fValueOf;
                    f = fMo5044r6;
                    c0877c.mo5037a();
                    while (c0877c.mo5042p()) {
                        cl1 cl1VarM10449a = dl1.m10449a(c0877c, gl5Var);
                        if (cl1VarM10449a != null) {
                            arrayList2.add(cl1VarM10449a);
                        }
                    }
                    c0877c.mo5039c();
                    str = strMo5046x2;
                    z2 = false;
                    z3 = z2;
                    strMo5046x2 = str;
                    fMo5044r6 = f;
                    fValueOf = fValueOf;
                    break;
                case 12:
                    f2 = fValueOf;
                    c0877c.mo5038b();
                    while (c0877c.mo5042p()) {
                        int iMo5033J = c0877c.mo5033J(f67152b);
                        if (iMo5033J == 0) {
                            c3726wl = new C3726wl(6, nj4.m17476a(c0877c, gl5Var, fna.m11957c(), qi2.f57805a, false));
                        } else if (iMo5033J != 1) {
                            c0877c.mo5034N();
                            c0877c.mo5035R();
                        } else {
                            c0877c.mo5037a();
                            if (c0877c.mo5042p()) {
                                p33 p33Var = AbstractC0816bm.f8668a;
                                c0877c.mo5038b();
                                ca1 ca1Var2 = null;
                                C3329mb c3329mb = null;
                                while (c0877c.mo5042p()) {
                                    int iMo5033J2 = c0877c.mo5033J(AbstractC0816bm.f8668a);
                                    if (iMo5033J2 != 0) {
                                        boolean z6 = true;
                                        if (iMo5033J2 != 1) {
                                            c0877c.mo5034N();
                                            c0877c.mo5035R();
                                        } else {
                                            c0877c.mo5038b();
                                            C3726wl c3726wlM23070b = null;
                                            C3726wl c3726wlM23070b2 = null;
                                            C3763xl c3763xlM23071c2 = null;
                                            C3763xl c3763xlM23071c3 = null;
                                            C3726wl c3726wlM23073e2 = null;
                                            while (c0877c.mo5042p()) {
                                                int iMo5033J3 = c0877c.mo5033J(AbstractC0816bm.f8670c);
                                                if (iMo5033J3 == 0) {
                                                    c3726wlM23070b = v2d.m23070b(c0877c, gl5Var);
                                                } else if (iMo5033J3 == z6) {
                                                    c3726wlM23070b2 = v2d.m23070b(c0877c, gl5Var);
                                                } else if (iMo5033J3 == 2) {
                                                    c3763xlM23071c2 = v2d.m23071c(c0877c, gl5Var, z6);
                                                } else if (iMo5033J3 == 3) {
                                                    c3763xlM23071c3 = v2d.m23071c(c0877c, gl5Var, z6);
                                                } else if (iMo5033J3 != 4) {
                                                    c0877c.mo5034N();
                                                    c0877c.mo5035R();
                                                } else {
                                                    c3726wlM23073e2 = v2d.m23073e(c0877c, gl5Var);
                                                }
                                                z6 = true;
                                            }
                                            c0877c.mo5040e();
                                            ca1Var2 = new ca1(c3726wlM23070b, c3726wlM23070b2, c3763xlM23071c2, c3763xlM23071c3, c3726wlM23073e2);
                                        }
                                    } else {
                                        c0877c.mo5038b();
                                        C3726wl c3726wl3 = null;
                                        C3726wl c3726wlM23073e3 = null;
                                        C3726wl c3726wlM23073e4 = null;
                                        TextRangeUnits textRangeUnits2 = null;
                                        while (c0877c.mo5042p()) {
                                            int iMo5033J4 = c0877c.mo5033J(AbstractC0816bm.f8669b);
                                            if (iMo5033J4 != 0) {
                                                int i2 = 1;
                                                if (iMo5033J4 == 1) {
                                                    c3726wlM23073e3 = v2d.m23073e(c0877c, gl5Var);
                                                } else if (iMo5033J4 == 2) {
                                                    c3726wlM23073e4 = v2d.m23073e(c0877c, gl5Var);
                                                } else if (iMo5033J4 != 3) {
                                                    c0877c.mo5034N();
                                                    c0877c.mo5035R();
                                                } else {
                                                    int iMo5045u3 = c0877c.mo5045u();
                                                    if (iMo5045u3 == 1) {
                                                        if (iMo5045u3 == i2) {
                                                            textRangeUnits = TextRangeUnits.PERCENT;
                                                        } else {
                                                            textRangeUnits = TextRangeUnits.INDEX;
                                                        }
                                                        textRangeUnits2 = textRangeUnits;
                                                    } else if (iMo5045u3 != 2) {
                                                        gl5Var.m12727a("Unsupported text range units: " + iMo5045u3);
                                                        textRangeUnits2 = TextRangeUnits.INDEX;
                                                    } else {
                                                        i2 = 1;
                                                        if (iMo5045u3 == i2) {
                                                            textRangeUnits = TextRangeUnits.PERCENT;
                                                        } else {
                                                            textRangeUnits = TextRangeUnits.INDEX;
                                                        }
                                                        textRangeUnits2 = textRangeUnits;
                                                    }
                                                }
                                            } else {
                                                c3726wl3 = v2d.m23073e(c0877c, gl5Var);
                                            }
                                        }
                                        c0877c.mo5040e();
                                        if (c3726wl3 == null && c3726wlM23073e3 != null) {
                                            c3726wl3 = new C3726wl(2, Collections.singletonList(new kj4(0)));
                                        }
                                        c3329mb = new C3329mb(c3726wl3, c3726wlM23073e3, c3726wlM23073e4, textRangeUnits2, 1);
                                    }
                                }
                                c0877c.mo5040e();
                                c3156jq = new C3156jq(ca1Var2, c3329mb);
                            }
                            while (c0877c.mo5042p()) {
                                c0877c.mo5035R();
                            }
                            c0877c.mo5039c();
                        }
                    }
                    c0877c.mo5040e();
                    fMo5044r6 = fMo5044r6;
                    fValueOf = f2;
                    z3 = false;
                    break;
                case 13:
                    c0877c.mo5037a();
                    ArrayList arrayList3 = new ArrayList();
                    while (c0877c.mo5042p()) {
                        c0877c.mo5038b();
                        while (c0877c.mo5042p()) {
                            int iMo5033J5 = c0877c.mo5033J(f67153c);
                            if (iMo5033J5 == 0) {
                                int iMo5045u4 = c0877c.mo5045u();
                                if (iMo5045u4 == 29) {
                                    p33 p33Var2 = zd0.f71378a;
                                    hi8Var = null;
                                    while (c0877c.mo5042p()) {
                                        if (c0877c.mo5033J(zd0.f71378a) != 0) {
                                            c0877c.mo5034N();
                                            c0877c.mo5035R();
                                        } else {
                                            c0877c.mo5037a();
                                            while (c0877c.mo5042p()) {
                                                c0877c.mo5038b();
                                                boolean z7 = false;
                                                hi8 hi8Var2 = null;
                                                while (c0877c.mo5042p()) {
                                                    int iMo5033J6 = c0877c.mo5033J(zd0.f71379b);
                                                    if (iMo5033J6 == 0) {
                                                        z7 = c0877c.mo5045u() == 0;
                                                    } else if (iMo5033J6 != z5) {
                                                        c0877c.mo5034N();
                                                        c0877c.mo5035R();
                                                    } else if (z7) {
                                                        hi8Var2 = new hi8(v2d.m23071c(c0877c, gl5Var, z5), 5);
                                                    } else {
                                                        c0877c.mo5035R();
                                                    }
                                                    z5 = true;
                                                }
                                                c0877c.mo5040e();
                                                if (hi8Var2 != null) {
                                                    hi8Var = hi8Var2;
                                                }
                                                z5 = true;
                                            }
                                            c0877c.mo5039c();
                                            z5 = true;
                                        }
                                    }
                                } else {
                                    if (iMo5045u4 == 25) {
                                        rm2 rm2Var = new rm2();
                                        while (c0877c.mo5042p()) {
                                            if (c0877c.mo5033J(rm2.f59527f) != 0) {
                                                c0877c.mo5034N();
                                                c0877c.mo5035R();
                                            } else {
                                                c0877c.mo5037a();
                                                while (c0877c.mo5042p()) {
                                                    c0877c.mo5038b();
                                                    String strMo5046x5 = "";
                                                    while (c0877c.mo5042p()) {
                                                        int iMo5033J7 = c0877c.mo5033J(rm2.f59528g);
                                                        if (iMo5033J7 == 0) {
                                                            strMo5046x5 = c0877c.mo5046x();
                                                        } else if (iMo5033J7 == 1) {
                                                            strMo5046x5.getClass();
                                                            switch (strMo5046x5) {
                                                                case "Distance":
                                                                    rm2Var.f59532d = v2d.m23071c(c0877c, gl5Var, true);
                                                                    break;
                                                                case "Opacity":
                                                                    rm2Var.f59530b = v2d.m23071c(c0877c, gl5Var, false);
                                                                    break;
                                                                case "Direction":
                                                                    rm2Var.f59531c = v2d.m23071c(c0877c, gl5Var, false);
                                                                    break;
                                                                case "Shadow Color":
                                                                    rm2Var.f59529a = v2d.m23070b(c0877c, gl5Var);
                                                                    break;
                                                                case "Softness":
                                                                    rm2Var.f59533e = v2d.m23071c(c0877c, gl5Var, true);
                                                                    break;
                                                                default:
                                                                    c0877c.mo5035R();
                                                                    break;
                                                            }
                                                        } else {
                                                            c0877c.mo5034N();
                                                            c0877c.mo5035R();
                                                        }
                                                    }
                                                    c0877c.mo5040e();
                                                }
                                                c0877c.mo5039c();
                                            }
                                        }
                                        C3726wl c3726wl4 = rm2Var.f59529a;
                                        if (c3726wl4 == null || (c3763xl = rm2Var.f59530b) == null || (c3763xl2 = rm2Var.f59531c) == null) {
                                            f3 = fValueOf;
                                        } else {
                                            f3 = fValueOf;
                                            C3763xl c3763xl4 = rm2Var.f59532d;
                                            if (c3763xl4 != null && (c3763xl3 = rm2Var.f59533e) != null) {
                                                ca1Var = new ca1(c3726wl4, c3763xl, c3763xl2, c3763xl4, c3763xl3);
                                            }
                                        }
                                        ca1Var = null;
                                    }
                                    fValueOf = f3;
                                    z5 = true;
                                }
                            } else if (iMo5033J5 != z5) {
                                c0877c.mo5034N();
                                c0877c.mo5035R();
                            } else {
                                arrayList3.add(c0877c.mo5046x());
                            }
                            f3 = fValueOf;
                            fValueOf = f3;
                            z5 = true;
                        }
                        c0877c.mo5040e();
                        z5 = true;
                    }
                    f2 = fValueOf;
                    c0877c.mo5039c();
                    gl5Var.m12727a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fMo5044r6 = fMo5044r6;
                    fValueOf = f2;
                    z3 = false;
                    break;
                case 14:
                    fMo5044r6 = (float) c0877c.mo5044r();
                    z3 = false;
                    break;
                case 15:
                    fMo5044r5 = (float) c0877c.mo5044r();
                    z3 = false;
                    break;
                case 16:
                    fMo5044r3 = (float) (c0877c.mo5044r() * ((double) fna.m11957c()));
                    fMo5044r6 = fMo5044r6;
                    z3 = false;
                    break;
                case 17:
                    fMo5044r4 = (float) (c0877c.mo5044r() * ((double) fna.m11957c()));
                    fMo5044r6 = fMo5044r6;
                    z3 = false;
                    break;
                case 18:
                    fMo5044r = (float) c0877c.mo5044r();
                    break;
                case 19:
                    fMo5044r2 = (float) c0877c.mo5044r();
                    break;
                case 20:
                    c3763xlM23071c = v2d.m23071c(c0877c, gl5Var, z3);
                    break;
                case 21:
                    strMo5046x2 = c0877c.mo5046x();
                    break;
                case 22:
                    zMo5043q = c0877c.mo5043q();
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    z4 = c0877c.mo5045u() != 1 ? z3 : true;
                    break;
                case 24:
                    int iMo5045u5 = c0877c.mo5045u();
                    if (iMo5045u5 < LBlendMode.values().length) {
                        lBlendMode2 = LBlendMode.values()[iMo5045u5];
                    } else {
                        gl5Var.m12727a("Unsupported Blend Mode: " + iMo5045u5);
                        lBlendMode2 = LBlendMode.NORMAL;
                    }
                    break;
                default:
                    c0877c.mo5034N();
                    c0877c.mo5035R();
                    fValueOf = fValueOf;
                    str = strMo5046x2;
                    z2 = z3;
                    f = fMo5044r6;
                    z3 = z2;
                    strMo5046x2 = str;
                    fMo5044r6 = f;
                    fValueOf = fValueOf;
                    break;
            }
        }
        Float f4 = fValueOf;
        String str2 = strMo5046x2;
        float f5 = fMo5044r6;
        c0877c.mo5040e();
        ArrayList arrayList4 = new ArrayList();
        if (fMo5044r > 0.0f) {
            z = z4;
            arrayList4.add(new kj4(gl5Var, f4, f4, (Interpolator) null, 0.0f, Float.valueOf(fMo5044r)));
        } else {
            z = z4;
        }
        if (fMo5044r2 <= 0.0f) {
            fMo5044r2 = gl5Var.f40969m;
        }
        arrayList4.add(new kj4(gl5Var, fValueOf2, fValueOf2, (Interpolator) null, fMo5044r, Float.valueOf(fMo5044r2)));
        arrayList4.add(new kj4(gl5Var, f4, f4, (Interpolator) null, fMo5044r2, Float.valueOf(Float.MAX_VALUE)));
        if (strMo5046x3.endsWith(".ai") || "ai".equals(str2)) {
            gl5Var.m12727a("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            C0852cm c0852cm = c0852cmM10458c == null ? new C0852cm() : c0852cmM10458c;
            c0852cm.f10256m = z;
            c0852cmM10458c = c0852cm;
        }
        return new tp4(arrayList2, gl5Var, strMo5046x3, jMo5045u, layer$LayerType, jMo5045u2, strMo5046x, arrayList, c0852cmM10458c, iM11957c, iM11957c2, color, f5, fMo5044r5, fMo5044r3, fMo5044r4, c3726wl, c3156jq, arrayList4, layer$MatteType2, c3763xlM23071c, zMo5043q, hi8Var, ca1Var, lBlendMode2);
    }
}
