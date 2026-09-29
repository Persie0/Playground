package p000;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class q3b extends FrameLayout implements en9 {

    /* JADX INFO: renamed from: a */
    public final cn0 f57211a;

    /* JADX INFO: renamed from: b */
    public final sc4 f57212b;

    /* JADX INFO: renamed from: c */
    public List f57213c;

    /* JADX INFO: renamed from: d */
    public kn0 f57214d;

    /* JADX INFO: renamed from: e */
    public float f57215e;

    /* JADX INFO: renamed from: f */
    public float f57216f;

    public q3b(Context context) {
        super(context, null);
        this.f57213c = Collections.EMPTY_LIST;
        this.f57214d = kn0.f47528g;
        this.f57215e = 0.0533f;
        this.f57216f = 0.08f;
        cn0 cn0Var = new cn0(context, 0);
        this.f57211a = cn0Var;
        sc4 sc4Var = new sc4(context, (AttributeSet) null);
        this.f57212b = sc4Var;
        sc4Var.setBackgroundColor(0);
        sc4Var.getSettings().setAllowContentAccess(false);
        addView(cn0Var);
        addView(sc4Var);
    }

    @Override // p000.en9
    /* JADX INFO: renamed from: a */
    public final void mo4881a(List list, kn0 kn0Var, float f, float f2) {
        this.f57214d = kn0Var;
        this.f57215e = f;
        this.f57216f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            cs1 cs1Var = (cs1) list.get(i);
            if (cs1Var.f34467d != null) {
                arrayList.add(cs1Var);
            } else {
                arrayList2.add(cs1Var);
            }
        }
        if (!this.f57213c.isEmpty() || !arrayList2.isEmpty()) {
            this.f57213c = arrayList2;
            m19630c();
        }
        this.f57211a.mo4881a(arrayList, kn0Var, f, f2);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final String m19629b(int i, float f) {
        float fM14878c = k5d.m14878c(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fM14878c == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fM14878c / getContext().getResources().getDisplayMetrics().density)};
        String str = uma.f64080a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0244  */
    /* JADX WARN: Code duplicated, block: B:104:0x0252  */
    /* JADX WARN: Code duplicated, block: B:106:0x0270 A[LOOP:2: B:105:0x026e->B:106:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0293 A[LOOP:3: B:108:0x028d->B:110:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:118:0x0304  */
    /* JADX WARN: Code duplicated, block: B:120:0x030a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0322  */
    /* JADX WARN: Code duplicated, block: B:123:0x0328  */
    /* JADX WARN: Code duplicated, block: B:124:0x033e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0344  */
    /* JADX WARN: Code duplicated, block: B:127:0x0347  */
    /* JADX WARN: Code duplicated, block: B:129:0x034b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0354  */
    /* JADX WARN: Code duplicated, block: B:132:0x035a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0374  */
    /* JADX WARN: Code duplicated, block: B:136:0x0378  */
    /* JADX WARN: Code duplicated, block: B:137:0x0395  */
    /* JADX WARN: Code duplicated, block: B:139:0x0399  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:159:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0400  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:174:0x0417  */
    /* JADX WARN: Code duplicated, block: B:177:0x041b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0421  */
    /* JADX WARN: Code duplicated, block: B:180:0x0429  */
    /* JADX WARN: Code duplicated, block: B:182:0x042c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x042e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0431  */
    /* JADX WARN: Code duplicated, block: B:186:0x0435  */
    /* JADX WARN: Code duplicated, block: B:187:0x043b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0441  */
    /* JADX WARN: Code duplicated, block: B:189:0x0447  */
    /* JADX WARN: Code duplicated, block: B:192:0x0455  */
    /* JADX WARN: Code duplicated, block: B:193:0x0458  */
    /* JADX WARN: Code duplicated, block: B:196:0x046a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0482  */
    /* JADX WARN: Code duplicated, block: B:238:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:240:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:243:0x0512  */
    /* JADX WARN: Code duplicated, block: B:249:0x0541  */
    /* JADX WARN: Code duplicated, block: B:252:0x056d A[LOOP:6: B:250:0x0567->B:252:0x056d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x0588 A[LOOP:7: B:254:0x0582->B:256:0x0588, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:264:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:268:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:272:0x0600  */
    /* JADX WARN: Code duplicated, block: B:274:0x0603  */
    /* JADX WARN: Code duplicated, block: B:278:0x060a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0625  */
    /* JADX WARN: Code duplicated, block: B:284:0x0640  */
    /* JADX WARN: Code duplicated, block: B:286:0x064b  */
    /* JADX WARN: Code duplicated, block: B:288:0x064e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0651  */
    /* JADX WARN: Code duplicated, block: B:290:0x0654  */
    /* JADX WARN: Code duplicated, block: B:292:0x0672  */
    /* JADX WARN: Code duplicated, block: B:310:0x051f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0182  */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0194  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0203  */
    /* JADX WARN: Code duplicated, block: B:99:0x022a  */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x0293, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m19630c() {
        String strConcat;
        String str;
        String str2;
        int i;
        float f;
        String str3;
        Layout.Alignment alignment;
        int i2;
        int i3;
        Object obj;
        int i4;
        String str4;
        int i5;
        String str5;
        String str6;
        Object obj2;
        String str7;
        CharSequence charSequence;
        float f2;
        String str8;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i6;
        HashMap map;
        Iterator it;
        float f3;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i7;
        String str9;
        StringBuilder sb;
        int i8;
        int i9;
        C3404oc c3404oc;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z;
        boolean z2;
        Object[] objArr;
        cu9 cu9Var;
        int i10;
        int i11;
        StringBuilder sb2;
        int i12;
        String str10;
        String strM24118n;
        int i13;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str11;
        int spanStart;
        int spanEnd;
        ne9 ne9Var;
        ne9 ne9Var2;
        String str12;
        float f4;
        String str13;
        Layout.Alignment alignment2;
        int i14;
        String str14;
        String str15;
        String str16;
        boolean z3;
        StringBuilder sb3 = new StringBuilder();
        String strM11815a = ffd.m11815a(this.f57214d.f47529a);
        int i15 = 0;
        String strM19629b = m19629b(0, this.f57215e);
        float f5 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        kn0 kn0Var = this.f57214d;
        int i16 = kn0Var.f47532d;
        int i17 = kn0Var.f47533e;
        int i18 = 2;
        int i19 = 1;
        if (i16 == 1) {
            Object[] objArr2 = {ffd.m11815a(i17)};
            String str17 = uma.f64080a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i16 == 2) {
            String strM11815a2 = ffd.m11815a(i17);
            String str18 = uma.f64080a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strM11815a2);
        } else if (i16 == 3) {
            String strM11815a3 = ffd.m11815a(i17);
            String str19 = uma.f64080a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strM11815a3);
        } else if (i16 != 4) {
            strConcat = "unset";
        } else {
            String strM11815a4 = ffd.m11815a(i17);
            String str20 = uma.f64080a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strM11815a4);
        }
        Object[] objArr3 = {strM11815a, strM19629b, fValueOf, strConcat};
        String str21 = uma.f64080a;
        sb3.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map2 = new HashMap();
        String strM11815a5 = ffd.m11815a(this.f57214d.f47530b);
        String str22 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strM11815a5);
        String str23 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i20 = 0;
        while (i20 < this.f57213c.size()) {
            cs1 cs1Var = (cs1) this.f57213c.get(i20);
            float f6 = cs1Var.f34471h;
            int i21 = cs1Var.f34479p;
            float f7 = f6 != -3.4028235E38f ? f6 * 100.0f : 50.0f;
            float f8 = f5;
            int i22 = cs1Var.f34472i;
            int i23 = -100;
            int i24 = i22 != i19 ? i22 != i18 ? i15 : -100 : -50;
            float f9 = cs1Var.f34468e;
            if (f9 != -3.4028235E38f) {
                if (cs1Var.f34469f != i19) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f9 * 100.0f));
                    int i25 = cs1Var.f34470g;
                    if (i21 == i19) {
                        i23 = -(i25 != i19 ? i25 != i18 ? 0 : -100 : -50);
                    } else {
                        i23 = i25 != i19 ? i25 != i18 ? 0 : -100 : -50;
                    }
                } else {
                    if (f9 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f9 * f8));
                        i = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f9) - 1.0f) * f8));
                        i = i19;
                    }
                    i23 = 0;
                }
                f = cs1Var.f34473j;
                if (f != -3.4028235E38f) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str24 = str3;
                alignment = cs1Var.f34465b;
                if (alignment == null) {
                    i4 = i19;
                    obj = "center";
                    i3 = 2;
                } else {
                    i2 = p3b.f55536a[alignment.ordinal()];
                    if (i2 != i19) {
                        i3 = 2;
                        if (i2 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i3 = 2;
                        obj = "start";
                    }
                    i4 = 1;
                }
                if (i21 != i4) {
                    str4 = "vertical-rl";
                } else if (i21 != i3) {
                    str4 = "horizontal-tb";
                } else {
                    str4 = "vertical-lr";
                }
                String str25 = str4;
                String strM19629b2 = m19629b(cs1Var.f34477n, cs1Var.f34478o);
                if (cs1Var.f34475l) {
                    i5 = cs1Var.f34476m;
                } else {
                    i5 = this.f57214d.f47531c;
                }
                String strM11815a6 = ffd.m11815a(i5);
                if (i21 != 1) {
                    if (i != 0) {
                        str5 = "left";
                    } else {
                        str5 = "right";
                    }
                    str6 = str5;
                    obj2 = "top";
                } else if (i21 != 2) {
                    obj2 = "left";
                    str6 = i != 0 ? "bottom" : "top";
                } else {
                    if (i != 0) {
                        str5 = "right";
                    } else {
                        str5 = "left";
                    }
                    str6 = str5;
                    obj2 = "top";
                }
                if (i21 != 2 || i21 == 1) {
                    str7 = "height";
                    int i26 = i23;
                    i23 = i24;
                    i24 = i26;
                } else {
                    str7 = "width";
                }
                String str26 = str7;
                charSequence = cs1Var.f34464a;
                f2 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = oe9.f54250a;
                int i27 = i24;
                int i28 = i20;
                if (charSequence == null) {
                    c3404oc = new C3404oc("", 4);
                    str8 = "";
                } else {
                    str8 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i6 = 0;
                        while (i6 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i6].getBackgroundColor()));
                            i6++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strM22988k = ux5.m22988k(iIntValue, "bg_");
                            Iterator it4 = it;
                            String strM22991n = ux5.m22991n(".", strM22988k, ",.", strM22988k, " *");
                            String strM11815a7 = ffd.m11815a(iIntValue);
                            String str27 = uma.f64080a;
                            Locale locale4 = Locale.US;
                            map.put(strM22991n, str22 + strM11815a7 + str23);
                            it = it4;
                            f7 = f7;
                        }
                        f3 = f7;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i7 = 0;
                        for (length2 = spans.length; i7 < length2; length2 = length2) {
                            obj3 = spans[i7];
                            String str28 = str23;
                            z = obj3 instanceof StrikethroughSpan;
                            String str29 = null;
                            if (z) {
                                z2 = z;
                                strM24118n = "<span style='text-decoration:line-through;'>";
                            } else {
                                z2 = z;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strM11815a8 = ffd.m11815a(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str30 = uma.f64080a;
                                    Locale locale5 = Locale.US;
                                    strM24118n = wq1.m24118n("<span style='color:", strM11815a8, ";'>");
                                } else {
                                    str22 = str22;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str31 = uma.f64080a;
                                        Locale locale6 = Locale.US;
                                        objArr = spans;
                                        strM24118n = ux5.m22989l("<span class='bg_", backgroundColor, "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj3 instanceof ov3) {
                                            strM24118n = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr4 = {Float.valueOf(size)};
                                            String str32 = uma.f64080a;
                                            strM24118n = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str33 = uma.f64080a;
                                            strM24118n = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str34 = uma.f64080a;
                                                Locale locale7 = Locale.US;
                                                strM24118n = wq1.m24118n("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strM24118n = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strM24118n = "<b>";
                                            } else if (style != 2) {
                                                strM24118n = "<i>";
                                            } else if (style != 3) {
                                                strM24118n = null;
                                            } else {
                                                strM24118n = "<b><i>";
                                            }
                                        } else if (obj3 instanceof yj8) {
                                            i13 = ((yj8) obj3).f69915b;
                                            if (i13 != -1) {
                                                strM24118n = "<ruby style='ruby-position:unset;'>";
                                            } else if (i13 != 1) {
                                                strM24118n = "<ruby style='ruby-position:over;'>";
                                            } else if (i13 != 2) {
                                                strM24118n = null;
                                            } else {
                                                strM24118n = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strM24118n = "<u>";
                                        } else if (obj3 instanceof cu9) {
                                            cu9Var = (cu9) obj3;
                                            i10 = cu9Var.f34557a;
                                            i11 = cu9Var.f34558b;
                                            sb2 = new StringBuilder();
                                            if (i11 != 1) {
                                                i12 = 2;
                                                if (i11 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i12 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i10 != 0) {
                                                sb2.append("none");
                                            } else if (i10 != 1) {
                                                sb2.append("circle");
                                            } else if (i10 != i12) {
                                                sb2.append("dot");
                                            } else if (i10 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (cu9Var.f34559c != 2) {
                                                str10 = "over right";
                                            } else {
                                                str10 = "under left";
                                            }
                                            Object[] objArr6 = {string, str10};
                                            String str35 = uma.f64080a;
                                            strM24118n = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                        } else {
                                            strM24118n = null;
                                        }
                                    }
                                }
                                if (z2 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof ov3) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof cu9)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str11 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str29 = "</b>";
                                            } else if (style2 == 2) {
                                                str29 = "</i>";
                                            } else if (style2 == 3) {
                                                str29 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof yj8) {
                                            str29 = "<rt>" + oe9.m17952a(((yj8) obj3).f69914a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str29 = "</u>";
                                        }
                                        str11 = str29;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strM24118n != null) {
                                    str11.getClass();
                                    me9 me9Var = new me9(strM24118n, spanStart, spanEnd, str11);
                                    ne9Var = (ne9) sparseArray.get(spanStart);
                                    if (ne9Var == null) {
                                        ne9Var = new ne9();
                                        sparseArray.put(spanStart, ne9Var);
                                    }
                                    ne9Var.f52655a.add(me9Var);
                                    ne9Var2 = (ne9) sparseArray.get(spanEnd);
                                    if (ne9Var2 == null) {
                                        ne9Var2 = new ne9();
                                        sparseArray.put(spanEnd, ne9Var2);
                                    }
                                    ne9Var2.f52656b.add(me9Var);
                                }
                                i7++;
                                str23 = str28;
                                str22 = str22;
                                spans = objArr;
                            }
                            objArr = spans;
                            str11 = z2 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM24118n != null) {
                                str11.getClass();
                                me9 me9Var2 = new me9(strM24118n, spanStart, spanEnd, str11);
                                ne9Var = (ne9) sparseArray.get(spanStart);
                                if (ne9Var == null) {
                                    ne9Var = new ne9();
                                    sparseArray.put(spanStart, ne9Var);
                                }
                                ne9Var.f52655a.add(me9Var2);
                                ne9Var2 = (ne9) sparseArray.get(spanEnd);
                                if (ne9Var2 == null) {
                                    ne9Var2 = new ne9();
                                    sparseArray.put(spanEnd, ne9Var2);
                                }
                                ne9Var2.f52656b.add(me9Var2);
                            }
                            i7++;
                            str23 = str28;
                            str22 = str22;
                            spans = objArr;
                        }
                        str23 = str23;
                        str9 = str22;
                        sb = new StringBuilder(spanned.length());
                        i8 = 0;
                        i9 = 0;
                        while (i9 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i9);
                            sb.append(oe9.m17952a(spanned.subSequence(i8, iKeyAt)));
                            ne9 ne9Var3 = (ne9) sparseArray.get(iKeyAt);
                            ArrayList arrayList = ne9Var3.f52656b;
                            ArrayList arrayList2 = ne9Var3.f52655a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, me9.f51217f);
                            it2 = ne9Var3.f52656b.iterator();
                            while (it2.hasNext()) {
                                sb.append(((me9) it2.next()).f51221d);
                            }
                            Collections.sort(arrayList2, me9.f51216e);
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                sb.append(((me9) it3.next()).f51220c);
                            }
                            i9++;
                            i8 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb.append(oe9.m17952a(spanned.subSequence(i8, spanned.length())));
                        c3404oc = new C3404oc(sb.toString(), 4);
                    } else {
                        c3404oc = new C3404oc(oe9.m17952a(charSequence), 4);
                    }
                    str12 = c3404oc.f54162b;
                    for (String str36 : map2.keySet()) {
                        str16 = (String) map2.put(str36, (String) map2.get(str36));
                        if (str16 != null || str16.equals(map2.get(str36))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bna.m3987z(z3);
                    }
                    Integer numValueOf = Integer.valueOf(i28);
                    Float fValueOf2 = Float.valueOf(f3);
                    Integer numValueOf2 = Integer.valueOf(i27);
                    Integer numValueOf3 = Integer.valueOf(i23);
                    f4 = cs1Var.f34480q;
                    if (f4 != 0.0f) {
                        if (i21 != 2 || i21 == 1) {
                            str15 = "skewY";
                        } else {
                            str15 = "skewX";
                        }
                        Object[] objArr7 = {str15, Float.valueOf(f4)};
                        String str37 = uma.f64080a;
                        str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                    } else {
                        str13 = str8;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str6, str2, str26, str24, obj, str25, strM19629b2, strM11815a6, numValueOf2, numValueOf3, str13));
                    sb3.append("<span class='default_bg'>");
                    alignment2 = cs1Var.f34466c;
                    if (alignment2 != null) {
                        i14 = p3b.f55536a[alignment2.ordinal()];
                        if (i14 != 1) {
                            i18 = 2;
                            if (i14 != 2) {
                                str14 = "center";
                            } else {
                                str14 = "end";
                            }
                        } else {
                            i18 = 2;
                            str14 = "start";
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                        sb3.append(str12);
                        sb3.append("</span>");
                    } else {
                        i18 = 2;
                        sb3.append(str12);
                    }
                    sb3.append("</span></div>");
                    i20 = i28 + 1;
                    f5 = f8;
                    str23 = str23;
                    str22 = str9;
                    i15 = 0;
                    i19 = 1;
                }
                str9 = str22;
                f3 = f7;
                str12 = c3404oc.f54162b;
                while (r4.hasNext()) {
                    str16 = (String) map2.put(str36, (String) map2.get(str36));
                    if (str16 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    bna.m3987z(z3);
                }
                Integer numValueOf4 = Integer.valueOf(i28);
                Float fValueOf3 = Float.valueOf(f3);
                Integer numValueOf5 = Integer.valueOf(i27);
                Integer numValueOf6 = Integer.valueOf(i23);
                f4 = cs1Var.f34480q;
                if (f4 != 0.0f) {
                    if (i21 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr8 = {str15, Float.valueOf(f4)};
                    String str38 = uma.f64080a;
                    str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
                } else {
                    str13 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str6, str2, str26, str24, obj, str25, strM19629b2, strM11815a6, numValueOf5, numValueOf6, str13));
                sb3.append("<span class='default_bg'>");
                alignment2 = cs1Var.f34466c;
                if (alignment2 != null) {
                    i14 = p3b.f55536a[alignment2.ordinal()];
                    if (i14 != 1) {
                        i18 = 2;
                        if (i14 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i18 = 2;
                        str14 = "start";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str12);
                    sb3.append("</span>");
                } else {
                    i18 = 2;
                    sb3.append(str12);
                }
                sb3.append("</span></div>");
                i20 = i28 + 1;
                f5 = f8;
                str23 = str23;
                str22 = str9;
                i15 = 0;
                i19 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f57216f) * 100.0f));
            }
            str2 = str;
            i = 0;
            f = cs1Var.f34473j;
            if (f != -3.4028235E38f) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = cs1Var.f34465b;
            if (alignment == null) {
                i4 = i19;
                obj = "center";
                i3 = 2;
            } else {
                i2 = p3b.f55536a[alignment.ordinal()];
                if (i2 != i19) {
                    i3 = 2;
                    if (i2 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i3 = 2;
                    obj = "start";
                }
                i4 = 1;
            }
            if (i21 != i4) {
                str4 = "vertical-rl";
            } else if (i21 != i3) {
                str4 = "horizontal-tb";
            } else {
                str4 = "vertical-lr";
            }
            String str211 = str4;
            String strM19629b3 = m19629b(cs1Var.f34477n, cs1Var.f34478o);
            if (cs1Var.f34475l) {
                i5 = cs1Var.f34476m;
            } else {
                i5 = this.f57214d.f47531c;
            }
            String strM11815a9 = ffd.m11815a(i5);
            if (i21 != 1) {
                if (i != 0) {
                    str5 = "left";
                } else {
                    str5 = "right";
                }
                str6 = str5;
                obj2 = "top";
            } else if (i21 != 2) {
                obj2 = "left";
                str6 = i != 0 ? "bottom" : "top";
            } else {
                if (i != 0) {
                    str5 = "right";
                } else {
                    str5 = "left";
                }
                str6 = str5;
                obj2 = "top";
            }
            if (i21 != 2) {
                str7 = "height";
                int i29 = i23;
                i23 = i24;
                i24 = i29;
            } else {
                str7 = "height";
                int i210 = i23;
                i23 = i24;
                i24 = i210;
            }
            String str212 = str7;
            charSequence = cs1Var.f34464a;
            f2 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = oe9.f54250a;
            int i211 = i24;
            int i212 = i20;
            if (charSequence == null) {
                c3404oc = new C3404oc("", 4);
                str8 = "";
            } else {
                str8 = "";
                if (charSequence instanceof Spanned) {
                    c3404oc = new C3404oc(oe9.m17952a(charSequence), 4);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i6 = 0;
                    while (i6 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i6].getBackgroundColor()));
                        i6++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strM22988k2 = ux5.m22988k(iIntValue2, "bg_");
                        Iterator it5 = it;
                        String strM22991n2 = ux5.m22991n(".", strM22988k2, ",.", strM22988k2, " *");
                        String strM11815a10 = ffd.m11815a(iIntValue2);
                        String str213 = uma.f64080a;
                        Locale locale8 = Locale.US;
                        map.put(strM22991n2, str22 + strM11815a10 + str23);
                        it = it5;
                        f7 = f7;
                    }
                    f3 = f7;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i7 = 0;
                    while (i7 < length2) {
                        obj3 = spans[i7];
                        String str214 = str23;
                        z = obj3 instanceof StrikethroughSpan;
                        String str215 = null;
                        if (z) {
                            z2 = z;
                            strM24118n = "<span style='text-decoration:line-through;'>";
                        } else {
                            z2 = z;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strM11815a11 = ffd.m11815a(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str39 = uma.f64080a;
                                Locale locale9 = Locale.US;
                                strM24118n = wq1.m24118n("<span style='color:", strM11815a11, ";'>");
                            } else {
                                str22 = str22;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str310 = uma.f64080a;
                                    Locale locale10 = Locale.US;
                                    objArr = spans;
                                    strM24118n = ux5.m22989l("<span class='bg_", backgroundColor2, "'>");
                                } else {
                                    objArr = spans;
                                    if (obj3 instanceof ov3) {
                                        strM24118n = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr9 = {Float.valueOf(size)};
                                        String str311 = uma.f64080a;
                                        strM24118n = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr9);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr10 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str312 = uma.f64080a;
                                        strM24118n = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr10);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str313 = uma.f64080a;
                                            Locale locale11 = Locale.US;
                                            strM24118n = wq1.m24118n("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strM24118n = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strM24118n = "<b>";
                                        } else if (style != 2) {
                                            strM24118n = "<i>";
                                        } else if (style != 3) {
                                            strM24118n = null;
                                        } else {
                                            strM24118n = "<b><i>";
                                        }
                                    } else if (obj3 instanceof yj8) {
                                        i13 = ((yj8) obj3).f69915b;
                                        if (i13 != -1) {
                                            strM24118n = "<ruby style='ruby-position:unset;'>";
                                        } else if (i13 != 1) {
                                            strM24118n = "<ruby style='ruby-position:over;'>";
                                        } else if (i13 != 2) {
                                            strM24118n = null;
                                        } else {
                                            strM24118n = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strM24118n = "<u>";
                                    } else if (obj3 instanceof cu9) {
                                        cu9Var = (cu9) obj3;
                                        i10 = cu9Var.f34557a;
                                        i11 = cu9Var.f34558b;
                                        sb2 = new StringBuilder();
                                        if (i11 != 1) {
                                            i12 = 2;
                                            if (i11 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i12 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i10 != 0) {
                                            sb2.append("none");
                                        } else if (i10 != 1) {
                                            sb2.append("circle");
                                        } else if (i10 != i12) {
                                            sb2.append("dot");
                                        } else if (i10 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (cu9Var.f34559c != 2) {
                                            str10 = "over right";
                                        } else {
                                            str10 = "under left";
                                        }
                                        Object[] objArr11 = {string2, str10};
                                        String str314 = uma.f64080a;
                                        strM24118n = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr11);
                                    } else {
                                        strM24118n = null;
                                    }
                                }
                            }
                            if (z2) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM24118n != null) {
                                str11.getClass();
                                me9 me9Var3 = new me9(strM24118n, spanStart, spanEnd, str11);
                                ne9Var = (ne9) sparseArray.get(spanStart);
                                if (ne9Var == null) {
                                    ne9Var = new ne9();
                                    sparseArray.put(spanStart, ne9Var);
                                }
                                ne9Var.f52655a.add(me9Var3);
                                ne9Var2 = (ne9) sparseArray.get(spanEnd);
                                if (ne9Var2 == null) {
                                    ne9Var2 = new ne9();
                                    sparseArray.put(spanEnd, ne9Var2);
                                }
                                ne9Var2.f52656b.add(me9Var3);
                            }
                            i7++;
                            str23 = str214;
                            str22 = str22;
                            spans = objArr;
                        }
                        objArr = spans;
                        if (z2) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strM24118n != null) {
                            str11.getClass();
                            me9 me9Var4 = new me9(strM24118n, spanStart, spanEnd, str11);
                            ne9Var = (ne9) sparseArray.get(spanStart);
                            if (ne9Var == null) {
                                ne9Var = new ne9();
                                sparseArray.put(spanStart, ne9Var);
                            }
                            ne9Var.f52655a.add(me9Var4);
                            ne9Var2 = (ne9) sparseArray.get(spanEnd);
                            if (ne9Var2 == null) {
                                ne9Var2 = new ne9();
                                sparseArray.put(spanEnd, ne9Var2);
                            }
                            ne9Var2.f52656b.add(me9Var4);
                        }
                        i7++;
                        str23 = str214;
                        str22 = str22;
                        spans = objArr;
                    }
                    str23 = str23;
                    str9 = str22;
                    sb = new StringBuilder(spanned.length());
                    i8 = 0;
                    i9 = 0;
                    while (i9 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i9);
                        sb.append(oe9.m17952a(spanned.subSequence(i8, iKeyAt2)));
                        ne9 ne9Var4 = (ne9) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = ne9Var4.f52656b;
                        ArrayList arrayList4 = ne9Var4.f52655a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList3, me9.f51217f);
                        it2 = ne9Var4.f52656b.iterator();
                        while (it2.hasNext()) {
                            sb.append(((me9) it2.next()).f51221d);
                        }
                        Collections.sort(arrayList4, me9.f51216e);
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            sb.append(((me9) it3.next()).f51220c);
                        }
                        i9++;
                        i8 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb.append(oe9.m17952a(spanned.subSequence(i8, spanned.length())));
                    c3404oc = new C3404oc(sb.toString(), 4);
                }
                str12 = c3404oc.f54162b;
                while (r4.hasNext()) {
                    str16 = (String) map2.put(str36, (String) map2.get(str36));
                    if (str16 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    bna.m3987z(z3);
                }
                Integer numValueOf7 = Integer.valueOf(i212);
                Float fValueOf4 = Float.valueOf(f3);
                Integer numValueOf8 = Integer.valueOf(i211);
                Integer numValueOf9 = Integer.valueOf(i23);
                f4 = cs1Var.f34480q;
                if (f4 != 0.0f) {
                    if (i21 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr12 = {str15, Float.valueOf(f4)};
                    String str315 = uma.f64080a;
                    str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str13 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str6, str2, str212, str210, obj, str211, strM19629b3, strM11815a9, numValueOf8, numValueOf9, str13));
                sb3.append("<span class='default_bg'>");
                alignment2 = cs1Var.f34466c;
                if (alignment2 != null) {
                    i14 = p3b.f55536a[alignment2.ordinal()];
                    if (i14 != 1) {
                        i18 = 2;
                        if (i14 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i18 = 2;
                        str14 = "start";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str12);
                    sb3.append("</span>");
                } else {
                    i18 = 2;
                    sb3.append(str12);
                }
                sb3.append("</span></div>");
                i20 = i212 + 1;
                f5 = f8;
                str23 = str23;
                str22 = str9;
                i15 = 0;
                i19 = 1;
            }
            str9 = str22;
            f3 = f7;
            str12 = c3404oc.f54162b;
            while (r4.hasNext()) {
                str16 = (String) map2.put(str36, (String) map2.get(str36));
                if (str16 != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                bna.m3987z(z3);
            }
            Integer numValueOf10 = Integer.valueOf(i212);
            Float fValueOf5 = Float.valueOf(f3);
            Integer numValueOf11 = Integer.valueOf(i211);
            Integer numValueOf12 = Integer.valueOf(i23);
            f4 = cs1Var.f34480q;
            if (f4 != 0.0f) {
                if (i21 != 2) {
                    str15 = "skewY";
                } else {
                    str15 = "skewY";
                }
                Object[] objArr13 = {str15, Float.valueOf(f4)};
                String str316 = uma.f64080a;
                str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr13);
            } else {
                str13 = str8;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str6, str2, str212, str210, obj, str211, strM19629b3, strM11815a9, numValueOf11, numValueOf12, str13));
            sb3.append("<span class='default_bg'>");
            alignment2 = cs1Var.f34466c;
            if (alignment2 != null) {
                i14 = p3b.f55536a[alignment2.ordinal()];
                if (i14 != 1) {
                    i18 = 2;
                    if (i14 != 2) {
                        str14 = "center";
                    } else {
                        str14 = "end";
                    }
                } else {
                    i18 = 2;
                    str14 = "start";
                }
                sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                sb3.append(str12);
                sb3.append("</span>");
            } else {
                i18 = 2;
                sb3.append(str12);
            }
            sb3.append("</span></div>");
            i20 = i212 + 1;
            f5 = f8;
            str23 = str23;
            str22 = str9;
            i15 = 0;
            i19 = 1;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str40 : map2.keySet()) {
            sb5.append(str40);
            sb5.append("{");
            sb5.append((String) map2.get(str40));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, (CharSequence) sb5);
        this.f57212b.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f57213c.isEmpty()) {
            return;
        }
        m19630c();
    }
}
