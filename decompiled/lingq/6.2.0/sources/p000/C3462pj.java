package p000;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: pj */
/* JADX INFO: loaded from: classes.dex */
public final class C3462pj implements h37 {

    /* JADX INFO: renamed from: a */
    public final String f56284a;

    /* JADX INFO: renamed from: b */
    public final vx9 f56285b;

    /* JADX INFO: renamed from: c */
    public final List f56286c;

    /* JADX INFO: renamed from: d */
    public final List f56287d;

    /* JADX INFO: renamed from: e */
    public final wa3 f56288e;

    /* JADX INFO: renamed from: f */
    public final fb2 f56289f;

    /* JADX INFO: renamed from: g */
    public final C0851cl f56290g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f56291h;

    /* JADX INFO: renamed from: i */
    public final hq4 f56292i;

    /* JADX INFO: renamed from: j */
    public sq5 f56293j;

    /* JADX INFO: renamed from: k */
    public final boolean f56294k;

    /* JADX INFO: renamed from: l */
    public final int f56295l;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:231:0x046e  */
    /* JADX WARN: Code duplicated, block: B:243:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:244:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:246:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:250:0x04da  */
    /* JADX WARN: Code duplicated, block: B:251:0x04df  */
    /* JADX WARN: Code duplicated, block: B:253:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:254:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:256:0x0511  */
    /* JADX WARN: Code duplicated, block: B:259:0x0526  */
    /* JADX WARN: Code duplicated, block: B:261:0x0532  */
    /* JADX WARN: Code duplicated, block: B:270:0x0548  */
    /* JADX WARN: Code duplicated, block: B:283:0x0565  */
    /* JADX WARN: Code duplicated, block: B:286:0x059f  */
    /* JADX WARN: Code duplicated, block: B:288:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:291:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:294:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:296:0x05e5 A[LOOP:9: B:295:0x05e3->B:296:0x05e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:299:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:301:0x0601  */
    /* JADX WARN: Code duplicated, block: B:303:0x0608  */
    /* JADX WARN: Code duplicated, block: B:305:0x060c  */
    /* JADX WARN: Code duplicated, block: B:306:0x0615  */
    /* JADX WARN: Code duplicated, block: B:308:0x061f  */
    /* JADX WARN: Code duplicated, block: B:319:0x0657  */
    /* JADX WARN: Code duplicated, block: B:324:0x0674  */
    /* JADX WARN: Code duplicated, block: B:326:0x0680  */
    /* JADX WARN: Code duplicated, block: B:333:0x0694  */
    /* JADX WARN: Code duplicated, block: B:388:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:390:0x07db  */
    /* JADX WARN: Code duplicated, block: B:392:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:399:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:412:0x0848  */
    /* JADX WARN: Code duplicated, block: B:414:0x0859  */
    /* JADX WARN: Code duplicated, block: B:415:0x085d  */
    /* JADX WARN: Code duplicated, block: B:417:0x0868  */
    /* JADX WARN: Code duplicated, block: B:420:0x0872 A[LOOP:6: B:419:0x0870->B:420:0x0872, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:423:0x0887  */
    /* JADX WARN: Code duplicated, block: B:425:0x089f A[LOOP:8: B:424:0x089d->B:425:0x089f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:428:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:430:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:432:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:433:0x08df  */
    /* JADX WARN: Code duplicated, block: B:436:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:437:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:439:0x0907  */
    /* JADX WARN: Code duplicated, block: B:440:0x0909  */
    /* JADX WARN: Code duplicated, block: B:445:0x0932  */
    /* JADX WARN: Code duplicated, block: B:457:0x054b A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:423:0x0887, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pj] */
    public C3462pj(String str, vx9 vx9Var, List list, List list2, wa3 wa3Var, fb2 fb2Var) {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        bc3 bc3Var;
        int i2;
        Typeface typeface;
        CharSequence charSequenceM19454g;
        int i3;
        aw9 aw9Var;
        j37 j37Var;
        ArrayList arrayList;
        List list3;
        int size;
        int i4;
        he9 he9Var;
        xa3 xa3Var;
        he9 he9Var2;
        ia5 ia5Var;
        int size2;
        int i5;
        int[] iArr;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int size4;
        he9 he9VarM13212d;
        int i10;
        ArrayList arrayList2;
        he9 he9Var3;
        int i11;
        int i12;
        int i13;
        Collection collection;
        int size5;
        boolean z;
        int i14;
        List list4;
        Spannable spannable;
        List list5;
        aw9 aw9Var2;
        int size6;
        int i15;
        int size7;
        int i16;
        C3462pj c3462pj;
        int i17;
        long jM25847b;
        int i18;
        long jM25847b2;
        int i19;
        long j;
        long jM25847b3;
        int size8;
        int i20;
        C3378nn c3378nn;
        InterfaceC3190kn interfaceC3190kn;
        int i21;
        int i22;
        C3378nn c3378nn2;
        Object obj2;
        Spannable spannable2;
        j37 j37Var2;
        int i23;
        int i24;
        int i25;
        C3378nn c3378nn3;
        Object obj3;
        he9 he9Var4;
        int i26;
        long j2;
        long j3;
        long jM25847b4;
        float fM25848c;
        long jM25847b5;
        float fM25848c2;
        a97 a97Var;
        a97 a97Var2;
        ?? obj4 = new Object();
        obj4.f56284a = str;
        obj4.f56285b = vx9Var;
        obj4.f56286c = list;
        obj4.f56287d = list2;
        obj4.f56288e = wa3Var;
        obj4.f56289f = fb2Var;
        float fMo594a = fb2Var.mo594a();
        C0851cl c0851cl = new C0851cl(1);
        ((TextPaint) c0851cl).density = fMo594a;
        c0851cl.f10210b = rt9.f59801b;
        c0851cl.f10211c = 3;
        c0851cl.f10212d = l39.f48992d;
        obj4.f56290g = c0851cl;
        boolean zM21991e = te1.m21991e(vx9Var);
        he9 he9Var5 = vx9Var.f66065a;
        j37 j37Var3 = vx9Var.f66066b;
        int i27 = 0;
        if (zM21991e) {
            qn3 qn3Var = tq2.f62720a;
            qn3 qn3Var2 = tq2.f62720a;
            dh9 dh9VarM20074t = (dh9) qn3Var2.f57974a;
            if (dh9VarM20074t == null) {
                if (pq2.m19449d()) {
                    dh9VarM20074t = qn3Var2.m20074t();
                    qn3Var2.f57974a = dh9VarM20074t;
                } else {
                    dh9VarM20074t = b34.f7840a;
                }
            }
            zBooleanValue = ((Boolean) dh9VarM20074t.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj4.f56294k = zBooleanValue;
        int i28 = j37Var3.f45013b;
        xi5 xi5Var = he9Var5.f42274k;
        if (i28 == 4) {
            i = 2;
        } else if (i28 == 5) {
            i = 3;
        } else if (i28 == 1) {
            i = 0;
        } else if (i28 == 2) {
            i = 1;
        } else {
            if (i28 != 3 && i28 != 0) {
                C3386nv.m17633t("Invalid TextDirection.");
                throw null;
            }
            int iM4398c = c7d.m4398c((xi5Var == null || (locale = ((ti5) xi5Var.f68251a.get(0)).f62341a) == null) ? Locale.getDefault() : locale);
            if (iM4398c == 0 || iM4398c != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        obj4.f56295l = i;
        C3411oj c3411oj = new C3411oj(obj4, i27);
        ax9 ax9Var = j37Var3.f45020i;
        ax9Var = ax9Var == null ? ax9.f7649c : ax9Var;
        c0851cl.setFlags(ax9Var.f7652b ? c0851cl.getFlags() | 128 : c0851cl.getFlags() & (-129));
        int i29 = ax9Var.f7651a;
        if (i29 == 1) {
            c0851cl.setFlags(c0851cl.getFlags() | 64);
            c0851cl.setHinting(0);
        } else if (i29 == 2) {
            c0851cl.getFlags();
            c0851cl.setHinting(1);
        } else if (i29 == 3) {
            c0851cl.getFlags();
            c0851cl.setHinting(0);
        } else {
            c0851cl.getFlags();
        }
        int size9 = list.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size9) {
                obj = null;
                break;
            }
            obj = list.get(i30);
            if (((C3378nn) obj).f52979a instanceof he9) {
                break;
            } else {
                i30++;
            }
        }
        boolean z2 = obj != null;
        long j4 = he9Var5.f42265b;
        bc3 bc3Var2 = he9Var5.f42266c;
        wb3 wb3Var = he9Var5.f42267d;
        String str2 = he9Var5.f42270g;
        xi5 xi5Var2 = he9Var5.f42274k;
        xv9 xv9Var = he9Var5.f42264a;
        yv9 yv9Var = he9Var5.f42273j;
        long j5 = he9Var5.f42271h;
        long jM25847b6 = zx9.m25847b(j4);
        boolean z3 = z2;
        if (ay9.m3127a(jM25847b6, 4294967296L)) {
            c0851cl.setTextSize(fb2Var.mo903F0(j4));
        } else if (ay9.m3127a(jM25847b6, 8589934592L)) {
            c0851cl.setTextSize(zx9.m25848c(j4) * c0851cl.getTextSize());
        }
        xa3 xa3Var2 = he9Var5.f42269f;
        if (xa3Var2 != null || wb3Var != null || bc3Var2 != null) {
            if (bc3Var2 == null) {
                bc3Var = bc3.f8321g;
            }
            if (wb3Var != null) {
                bc3Var = bc3Var2;
                i2 = wb3Var.f66583a;
            } else {
                bc3Var = bc3Var2;
                i2 = 0;
            }
            xb3 xb3Var = he9Var5.f42268e;
            int i31 = xb3Var != null ? xb3Var.f68021a : 65535;
            C3462pj c3462pj2 = (C3462pj) c3411oj.f54387b;
            wda wdaVarM25018b = ((ya3) c3462pj2.f56288e).m25018b(xa3Var2, bc3Var, i2, i31);
            if (wdaVarM25018b instanceof vda) {
                Object obj5 = ((vda) wdaVarM25018b).f65260a;
                obj5.getClass();
                typeface = (Typeface) obj5;
            } else {
                sq5 sq5Var = new sq5(wdaVarM25018b, c3462pj2.f56293j);
                c3462pj2.f56293j = sq5Var;
                Object obj6 = sq5Var.f61250d;
                obj6.getClass();
                typeface = (Typeface) obj6;
            }
            c0851cl.setTypeface(typeface);
        }
        if (xi5Var2 != null) {
            xi5 xi5Var3 = xi5.f68250c;
            if (!xi5Var2.equals(z87.f71091a.m16516s())) {
                ArrayList arrayList3 = new ArrayList(v91.m23189q0(xi5Var2, 10));
                Iterator it = xi5Var2.f68251a.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ti5) it.next()).f62341a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                c0851cl.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            c0851cl.setFontFeatureSettings(str2);
        }
        if (yv9Var != null && !yv9Var.equals(yv9.f70559c)) {
            c0851cl.setTextScaleX(c0851cl.getTextScaleX() * yv9Var.f70560a);
            c0851cl.setTextSkewX(c0851cl.getTextSkewX() + yv9Var.f70561b);
        }
        c0851cl.m4829d(xv9Var.mo24173a());
        c0851cl.m4828c(xv9Var.mo24174b(), 9205357640488583168L, xv9Var.mo24175c());
        c0851cl.m4831f(he9Var5.f42277n);
        c0851cl.m4832g(he9Var5.f42276m);
        c0851cl.m4830e(he9Var5.f42279p);
        if (ay9.m3127a(zx9.m25847b(j5), 4294967296L) && zx9.m25848c(j5) != 0.0f) {
            float textScaleX = c0851cl.getTextScaleX() * c0851cl.getTextSize();
            float fMo903F0 = fb2Var.mo903F0(j5);
            if (textScaleX != 0.0f) {
                c0851cl.setLetterSpacing(fMo903F0 / textScaleX);
            }
        } else if (ay9.m3127a(zx9.m25847b(j5), 8589934592L)) {
            c0851cl.setLetterSpacing(zx9.m25848c(j5));
        }
        long j6 = he9Var5.f42275l;
        oa0 oa0Var = he9Var5.f42272i;
        boolean z4 = z3 && ay9.m3127a(zx9.m25847b(j5), 4294967296L) && zx9.m25848c(j5) != 0.0f;
        long j7 = aa1.f412k;
        boolean z5 = (aa1.m199c(j6, j7) || aa1.m199c(j6, aa1.f411j)) ? false : true;
        boolean z6 = (oa0Var == null || Float.compare(oa0Var.f54096a, 0.0f) == 0) ? false : true;
        he9 he9Var6 = (z4 || z5 || z6) ? new he9(0L, 0L, null, null, null, null, null, z4 ? j5 : zx9.f72359c, z6 ? oa0Var : null, null, null, z5 ? j6 : j7, null, null, 63103) : null;
        List list6 = obj4.f56286c;
        if (he9Var6 != null) {
            int size10 = list6.size() + 1;
            ArrayList arrayList4 = new ArrayList(size10);
            int i32 = 0;
            while (i32 < size10) {
                arrayList4.add(i32 == 0 ? new C3378nn(he9Var6, 0, obj4.f56284a.length()) : (C3378nn) obj4.f56286c.get(i32 - 1));
                i32++;
            }
            list6 = arrayList4;
        }
        String str3 = obj4.f56284a;
        float textSize = obj4.f56290g.getTextSize();
        vx9 vx9Var2 = obj4.f56285b;
        List list7 = obj4.f56287d;
        fb2 fb2Var2 = obj4.f56289f;
        boolean z7 = obj4.f56294k;
        C3337mj c3337mj = AbstractC3374nj.f52788a;
        if (z7 && pq2.m19449d()) {
            i97 i97Var = vx9Var2.f66067c;
            dr2 dr2Var = (i97Var == null || (a97Var2 = i97Var.f43743b) == null) ? null : new dr2(a97Var2.f383b);
            int i33 = (dr2Var != null && dr2Var.f36076a == 2) ? 1 : 0;
            charSequenceM19454g = pq2.m19448a().m19454g(0, str3.length(), i33, str3);
            charSequenceM19454g.getClass();
        } else {
            charSequenceM19454g = str3;
        }
        if (!list6.isEmpty() || !list7.isEmpty() || !fa4.m11650l(vx9Var2.f66066b.f45015d, aw9.f7624c) || (vx9Var2.f66066b.f45014c & 1095216660480L) != 0) {
            c3462pj = obj4;
            Spannable spannableString = charSequenceM19454g instanceof Spannable ? (Spannable) charSequenceM19454g : new SpannableString(charSequenceM19454g);
            he9 he9Var7 = vx9Var2.f66065a;
            j37 j37Var4 = vx9Var2.f66066b;
            if (fa4.m11650l(he9Var7.f42276m, rt9.f59802c)) {
                spannableString.setSpan(AbstractC3374nj.f52788a, 0, str3.length(), 33);
            }
            i97 i97Var2 = vx9Var2.f66067c;
            if (((i97Var2 == null || (a97Var = i97Var2.f43743b) == null) ? false : a97Var.f382a) && j37Var4.f45017f == null) {
                float fM19494B = pvc.m19494B(j37Var4.f45014c, textSize, fb2Var2);
                if (!Float.isNaN(fM19494B)) {
                    spannableString.setSpan(new nc5(fM19494B), 0, spannableString.length(), 33);
                }
            } else {
                rc5 rc5Var = j37Var4.f45017f;
                rc5Var = rc5Var == null ? rc5.f59067d : rc5Var;
                float fM19494B2 = pvc.m19494B(j37Var4.f45014c, textSize, fb2Var2);
                if (!Float.isNaN(fM19494B2)) {
                    int length = (spannableString.length() == 0 || vk9.m23392o0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i34 = rc5Var.f59069b;
                    i3 = 0;
                    spannableString.setSpan(new sc5(fM19494B2, length, (i34 & 1) > 0, (i34 & 16) > 0, rc5Var.f59068a, rc5Var.f59070c), 0, spannableString.length(), 33);
                }
                aw9Var = j37Var4.f45015d;
                if (aw9Var != null) {
                    i26 = i3;
                    j2 = aw9Var.f7625a;
                    j3 = aw9Var.f7626b;
                    if ((!zx9.m25846a(j2, d32.m10018P(i26)) && zx9.m25846a(j3, d32.m10018P(i26))) || (j2 & 1095216660480L) == r13 || (j3 & 1095216660480L) == 0) {
                        j37Var = j37Var4;
                    } else {
                        jM25847b4 = zx9.m25847b(j2);
                        j37Var = j37Var4;
                        if (ay9.m3127a(jM25847b4, 4294967296L)) {
                            fM25848c = fb2Var2.mo903F0(j2);
                        } else if (ay9.m3127a(jM25847b4, 8589934592L)) {
                            fM25848c = zx9.m25848c(j2) * textSize;
                        } else {
                            fM25848c = 0.0f;
                        }
                        jM25847b5 = zx9.m25847b(j3);
                        if (ay9.m3127a(jM25847b5, 4294967296L)) {
                            fM25848c2 = fb2Var2.mo903F0(j3);
                        } else if (ay9.m3127a(jM25847b5, 8589934592L)) {
                            fM25848c2 = zx9.m25848c(j3) * textSize;
                        } else {
                            fM25848c2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM25848c), (int) Math.ceil(fM25848c2)), 0, spannableString.length(), 33);
                    }
                } else {
                    j37Var = j37Var4;
                }
                arrayList = new ArrayList(list6.size());
                list3 = list6;
                size = list3.size();
                for (i4 = 0; i4 < size; i4++) {
                    c3378nn3 = (C3378nn) list6.get(i4);
                    obj3 = c3378nn3.f52979a;
                    if (obj3 instanceof he9) {
                        he9Var4 = (he9) obj3;
                        if (he9Var4.f42269f == null || he9Var4.f42267d != null || he9Var4.f42266c != null || ((he9) obj3).f42268e != null) {
                            arrayList.add(c3378nn3);
                        }
                    }
                }
                he9Var = vx9Var2.f66065a;
                xa3Var = he9Var.f42269f;
                if (xa3Var != null && he9Var.f42267d == null && he9Var.f42266c == null && he9Var.f42268e == null) {
                    he9Var2 = null;
                } else {
                    he9Var2 = new he9(0L, 0L, he9Var.f42266c, he9Var.f42267d, he9Var.f42268e, xa3Var, null, 0L, null, null, null, 0L, null, null, 65475);
                }
                ia5Var = new ia5(4, spannableString, c3411oj);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        C3378nn c3378nn4 = (C3378nn) arrayList.get(i6);
                        iArr[i6] = c3378nn4.f52980b;
                        iArr[i6 + size2] = c3378nn4.f52981c;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 != 0) {
                        uk9.m22775i("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            he9Var3 = he9Var2;
                            i11 = i8;
                        } else {
                            size4 = arrayList.size();
                            he9VarM13212d = he9Var2;
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList5 = arrayList;
                                C3378nn c3378nn5 = (C3378nn) arrayList.get(i10);
                                he9 he9Var8 = he9Var2;
                                i12 = c3378nn5.f52980b;
                                int i35 = i8;
                                i13 = c3378nn5.f52981c;
                                if (i12 == i13 && AbstractC3466pn.m19404b(i7, i9, i12, i13)) {
                                    he9 he9Var9 = (he9) c3378nn5.f52979a;
                                    he9VarM13212d = he9VarM13212d != null ? he9VarM13212d.m13212d(he9Var9) : he9Var9;
                                }
                                i10++;
                                he9Var2 = he9Var8;
                                arrayList = arrayList5;
                                i8 = i35;
                            }
                            arrayList2 = arrayList;
                            he9Var3 = he9Var2;
                            i11 = i8;
                            if (he9VarM13212d != null) {
                                ia5Var.invoke(he9VarM13212d, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8 = i11 + 1;
                        list3 = list3;
                        he9Var2 = he9Var3;
                        arrayList = arrayList2;
                    }
                } else if (!arrayList.isEmpty()) {
                    he9 he9Var10 = (he9) ((C3378nn) arrayList.get(0)).f52979a;
                    ia5Var.invoke(he9Var2 != null ? he9Var2.m13212d(he9Var10) : he9Var10, Integer.valueOf(((C3378nn) arrayList.get(0)).f52980b), Integer.valueOf(((C3378nn) arrayList.get(0)).f52981c));
                }
                collection = list3;
                size5 = collection.size();
                z = false;
                i14 = 0;
                while (i14 < size5) {
                    c3378nn2 = (C3378nn) list6.get(i14);
                    obj2 = c3378nn2.f52979a;
                    if (obj2 instanceof he9) {
                        i23 = c3378nn2.f52980b;
                        int i36 = c3378nn2.f52981c;
                        if (i23 >= 0 || i23 >= spannableString.length() || i36 <= i23 || i36 > spannableString.length()) {
                            size5 = size5;
                            list6 = list6;
                            spannable2 = spannableString;
                            j37Var2 = j37Var;
                        } else {
                            he9 he9Var11 = (he9) obj2;
                            long j8 = he9Var11.f42271h;
                            oa0 oa0Var2 = he9Var11.f42272i;
                            xv9 xv9Var2 = he9Var11.f42264a;
                            if (oa0Var2 != null) {
                                spannableString.setSpan(new pa0(0, oa0Var2.f54096a), i23, i36, 33);
                            }
                            pvc.m19498F(spannableString, xv9Var2.mo24173a(), i23, i36);
                            vi0 vi0VarMo24174b = xv9Var2.mo24174b();
                            float fMo24175c = xv9Var2.mo24175c();
                            if (vi0VarMo24174b != null) {
                                if (vi0VarMo24174b instanceof pd9) {
                                    pvc.m19498F(spannableString, ((pd9) vi0VarMo24174b).f55989a, i23, i36);
                                } else {
                                    spannableString.setSpan(new j39((i39) vi0VarMo24174b, fMo24175c), i23, i36, 33);
                                }
                            }
                            rt9 rt9Var = he9Var11.f42276m;
                            if (rt9Var != null) {
                                int i37 = rt9Var.f59804a;
                                st9 st9Var = new st9((i37 | 1) == i37, (i37 | 2) == i37);
                                i24 = 33;
                                spannableString.setSpan(st9Var, i23, i36, 33);
                            } else {
                                i24 = 33;
                            }
                            int i38 = i24;
                            j37Var2 = j37Var;
                            pvc.m19499G(spannableString, he9Var11.f42265b, fb2Var2, i23, i36);
                            spannable2 = spannableString;
                            String str4 = he9Var11.f42270g;
                            if (str4 != null) {
                                spannable2.setSpan(new ab3(str4, 0), i23, i36, i38);
                            }
                            yv9 yv9Var2 = he9Var11.f42273j;
                            if (yv9Var2 != null) {
                                spannable2.setSpan(new ScaleXSpan(yv9Var2.f70560a), i23, i36, i38);
                                spannable2.setSpan(new pa0(1, yv9Var2.f70561b), i23, i36, i38);
                            }
                            pvc.m19500H(spannable2, he9Var11.f42274k, i23, i36);
                            long j9 = he9Var11.f42275l;
                            if (j9 != 16) {
                                spannable2.setSpan(new BackgroundColorSpan(d32.m10042h0(j9)), i23, i36, i38);
                            }
                            l39 l39Var = he9Var11.f42277n;
                            if (l39Var != null) {
                                long j10 = l39Var.f48994b;
                                int iM10042h0 = d32.m10042h0(l39Var.f48993a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f = l39Var.f48995c;
                                n39 n39Var = new n39(iM10042h0, fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                i25 = 33;
                                spannable2.setSpan(n39Var, i23, i36, 33);
                            } else {
                                i25 = i38;
                            }
                            ml2 ml2Var = he9Var11.f42279p;
                            if (ml2Var != null) {
                                spannable2.setSpan(new nl2(ml2Var), i23, i36, i25);
                            }
                            z = (ay9.m3127a(zx9.m25847b(j8), 4294967296L) || ay9.m3127a(zx9.m25847b(j8), 8589934592L)) ? true : z;
                        }
                        z = z;
                    } else {
                        size5 = size5;
                        list6 = list6;
                        spannable2 = spannableString;
                        j37Var2 = j37Var;
                        z = z;
                    }
                    i14++;
                    list6 = list6;
                    j37Var = j37Var2;
                    spannableString = spannable2;
                    size5 = size5;
                }
                list4 = list6;
                spannable = spannableString;
                j37 j37Var5 = j37Var;
                if (z) {
                    size8 = collection.size();
                    i20 = 0;
                    while (i20 < size8) {
                        List list8 = list4;
                        c3378nn = (C3378nn) list8.get(i20);
                        interfaceC3190kn = (InterfaceC3190kn) c3378nn.f52979a;
                        if (interfaceC3190kn instanceof he9) {
                            i22 = c3378nn.f52980b;
                            int i39 = c3378nn.f52981c;
                            if (i22 >= 0 || i22 >= spannable.length() || i39 <= i22 || i39 > spannable.length()) {
                                i21 = i20;
                            } else {
                                long j11 = ((he9) interfaceC3190kn).f42271h;
                                long jM25847b7 = zx9.m25847b(j11);
                                i21 = i20;
                                Object p75Var = ay9.m3127a(jM25847b7, 4294967296L) ? new p75(fb2Var2.mo903F0(j11)) : ay9.m3127a(jM25847b7, 8589934592L) ? new o75(zx9.m25848c(j11)) : null;
                                if (p75Var != null) {
                                    spannable.setSpan(p75Var, i22, i39, 33);
                                }
                            }
                        } else {
                            i21 = i20;
                        }
                        i20 = i21 + 1;
                        list4 = list8;
                    }
                }
                list5 = list4;
                aw9Var2 = j37Var5.f45015d;
                if (aw9Var2 != null) {
                    j = aw9Var2.f7625a;
                    jM25847b3 = zx9.m25847b(j);
                    if (ay9.m3127a(jM25847b3, 4294967296L)) {
                        fb2Var2.mo903F0(j);
                    } else if (ay9.m3127a(jM25847b3, 8589934592L)) {
                        zx9.m25848c(j);
                    }
                }
                size6 = collection.size();
                for (i15 = 0; i15 < size6; i15++) {
                    Object obj7 = ((C3378nn) list5.get(i15)).f52979a;
                }
                size7 = list7.size();
                i16 = 0;
                while (i16 < size7) {
                    C3378nn c3378nn6 = (C3378nn) list7.get(i16);
                    p87 p87Var = (p87) c3378nn6.f52979a;
                    int i40 = c3378nn6.f52980b;
                    int i41 = c3378nn6.f52981c;
                    for (Object obj8 : spannable.getSpans(i40, i41, sda.class)) {
                        spannable.removeSpan((sda) obj8);
                    }
                    long j12 = p87Var.f55755a;
                    long j13 = p87Var.f55756b;
                    float fM25848c3 = zx9.m25848c(j12);
                    int i42 = i16;
                    jM25847b = zx9.m25847b(p87Var.f55755a);
                    int i43 = size7;
                    if (ay9.m3127a(jM25847b, 4294967296L)) {
                        i18 = 0;
                    } else if (ay9.m3127a(jM25847b, 8589934592L)) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    fb2 fb2Var3 = fb2Var2;
                    float fM25848c4 = zx9.m25848c(j13);
                    jM25847b2 = zx9.m25847b(j13);
                    if (ay9.m3127a(jM25847b2, 4294967296L)) {
                        i19 = 0;
                    } else if (ay9.m3127a(jM25847b2, 8589934592L)) {
                        i19 = 1;
                    } else {
                        i19 = 2;
                    }
                    q87 q87Var = new q87(fM25848c3, i18, fM25848c4, i19, fb2Var3, 3);
                    fb2Var2 = fb2Var3;
                    spannable.setSpan(q87Var, i40, i41, 33);
                    size7 = i43;
                    i16 = i42 + 1;
                }
                c3462pj = this;
                charSequenceM19454g = spannable;
            }
            i3 = 0;
            aw9Var = j37Var4.f45015d;
            if (aw9Var != null) {
                i26 = i3;
                j2 = aw9Var.f7625a;
                j3 = aw9Var.f7626b;
                if (!zx9.m25846a(j2, d32.m10018P(i26))) {
                    jM25847b4 = zx9.m25847b(j2);
                    j37Var = j37Var4;
                    if (ay9.m3127a(jM25847b4, 4294967296L)) {
                        fM25848c = fb2Var2.mo903F0(j2);
                    } else if (ay9.m3127a(jM25847b4, 8589934592L)) {
                        fM25848c = zx9.m25848c(j2) * textSize;
                    } else {
                        fM25848c = 0.0f;
                    }
                    jM25847b5 = zx9.m25847b(j3);
                    if (ay9.m3127a(jM25847b5, 4294967296L)) {
                        fM25848c2 = fb2Var2.mo903F0(j3);
                    } else if (ay9.m3127a(jM25847b5, 8589934592L)) {
                        fM25848c2 = zx9.m25848c(j3) * textSize;
                    } else {
                        fM25848c2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM25848c), (int) Math.ceil(fM25848c2)), 0, spannableString.length(), 33);
                } else {
                    jM25847b4 = zx9.m25847b(j2);
                    j37Var = j37Var4;
                    if (ay9.m3127a(jM25847b4, 4294967296L)) {
                        fM25848c = fb2Var2.mo903F0(j2);
                    } else if (ay9.m3127a(jM25847b4, 8589934592L)) {
                        fM25848c = zx9.m25848c(j2) * textSize;
                    } else {
                        fM25848c = 0.0f;
                    }
                    jM25847b5 = zx9.m25847b(j3);
                    if (ay9.m3127a(jM25847b5, 4294967296L)) {
                        fM25848c2 = fb2Var2.mo903F0(j3);
                    } else if (ay9.m3127a(jM25847b5, 8589934592L)) {
                        fM25848c2 = zx9.m25848c(j3) * textSize;
                    } else {
                        fM25848c2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM25848c), (int) Math.ceil(fM25848c2)), 0, spannableString.length(), 33);
                }
            } else {
                j37Var = j37Var4;
            }
            arrayList = new ArrayList(list6.size());
            list3 = list6;
            size = list3.size();
            while (i4 < size) {
                c3378nn3 = (C3378nn) list6.get(i4);
                obj3 = c3378nn3.f52979a;
                if (obj3 instanceof he9) {
                    he9Var4 = (he9) obj3;
                    if (he9Var4.f42269f == null) {
                        arrayList.add(c3378nn3);
                    } else {
                        arrayList.add(c3378nn3);
                    }
                }
            }
            he9Var = vx9Var2.f66065a;
            xa3Var = he9Var.f42269f;
            if (xa3Var != null) {
                he9Var2 = new he9(0L, 0L, he9Var.f42266c, he9Var.f42267d, he9Var.f42268e, xa3Var, null, 0L, null, null, null, 0L, null, null, 65475);
            } else {
                he9Var2 = new he9(0L, 0L, he9Var.f42266c, he9Var.f42267d, he9Var.f42268e, xa3Var, null, 0L, null, null, null, 0L, null, null, 65475);
            }
            ia5Var = new ia5(4, spannableString, c3411oj);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i5 = size2 * 2;
                iArr = new int[i5];
                size3 = arrayList.size();
                while (i6 < size3) {
                    C3378nn c3378nn7 = (C3378nn) arrayList.get(i6);
                    iArr[i6] = c3378nn7.f52980b;
                    iArr[i6 + size2] = c3378nn7.f52981c;
                }
                if (i5 > 1) {
                    Arrays.sort(iArr);
                }
                if (i5 != 0) {
                    uk9.m22775i("Array is empty.");
                    throw null;
                }
                i7 = iArr[0];
                i8 = 0;
                while (i8 < i5) {
                    i9 = iArr[i8];
                    if (i9 == i7) {
                        arrayList2 = arrayList;
                        he9Var3 = he9Var2;
                        i11 = i8;
                    } else {
                        size4 = arrayList.size();
                        he9VarM13212d = he9Var2;
                        i10 = 0;
                        while (i10 < size4) {
                            ArrayList arrayList6 = arrayList;
                            C3378nn c3378nn8 = (C3378nn) arrayList.get(i10);
                            he9 he9Var12 = he9Var2;
                            i12 = c3378nn8.f52980b;
                            int i310 = i8;
                            i13 = c3378nn8.f52981c;
                            if (i12 == i13) {
                            }
                            i10++;
                            he9Var2 = he9Var12;
                            arrayList = arrayList6;
                            i8 = i310;
                        }
                        arrayList2 = arrayList;
                        he9Var3 = he9Var2;
                        i11 = i8;
                        if (he9VarM13212d != null) {
                            ia5Var.invoke(he9VarM13212d, Integer.valueOf(i7), Integer.valueOf(i9));
                        }
                        i7 = i9;
                    }
                    i8 = i11 + 1;
                    list3 = list3;
                    he9Var2 = he9Var3;
                    arrayList = arrayList2;
                }
            } else if (!arrayList.isEmpty()) {
                he9 he9Var13 = (he9) ((C3378nn) arrayList.get(0)).f52979a;
                ia5Var.invoke(he9Var2 != null ? he9Var2.m13212d(he9Var13) : he9Var13, Integer.valueOf(((C3378nn) arrayList.get(0)).f52980b), Integer.valueOf(((C3378nn) arrayList.get(0)).f52981c));
            }
            collection = list3;
            size5 = collection.size();
            z = false;
            i14 = 0;
            while (i14 < size5) {
                c3378nn2 = (C3378nn) list6.get(i14);
                obj2 = c3378nn2.f52979a;
                if (obj2 instanceof he9) {
                    i23 = c3378nn2.f52980b;
                    int i311 = c3378nn2.f52981c;
                    if (i23 >= 0) {
                        size5 = size5;
                        list6 = list6;
                        spannable2 = spannableString;
                        j37Var2 = j37Var;
                        z = z;
                    } else {
                        size5 = size5;
                        list6 = list6;
                        spannable2 = spannableString;
                        j37Var2 = j37Var;
                        z = z;
                    }
                } else {
                    size5 = size5;
                    list6 = list6;
                    spannable2 = spannableString;
                    j37Var2 = j37Var;
                    z = z;
                }
                i14++;
                list6 = list6;
                j37Var = j37Var2;
                spannableString = spannable2;
                size5 = size5;
            }
            list4 = list6;
            spannable = spannableString;
            j37 j37Var6 = j37Var;
            if (z) {
                size8 = collection.size();
                i20 = 0;
                while (i20 < size8) {
                    List list9 = list4;
                    c3378nn = (C3378nn) list9.get(i20);
                    interfaceC3190kn = (InterfaceC3190kn) c3378nn.f52979a;
                    if (interfaceC3190kn instanceof he9) {
                        i22 = c3378nn.f52980b;
                        int i312 = c3378nn.f52981c;
                        if (i22 >= 0) {
                            i21 = i20;
                        } else {
                            i21 = i20;
                        }
                    } else {
                        i21 = i20;
                    }
                    i20 = i21 + 1;
                    list4 = list9;
                }
            }
            list5 = list4;
            aw9Var2 = j37Var6.f45015d;
            if (aw9Var2 != null) {
                j = aw9Var2.f7625a;
                jM25847b3 = zx9.m25847b(j);
                if (ay9.m3127a(jM25847b3, 4294967296L)) {
                    fb2Var2.mo903F0(j);
                } else if (ay9.m3127a(jM25847b3, 8589934592L)) {
                    zx9.m25848c(j);
                }
            }
            size6 = collection.size();
            while (i15 < size6) {
                Object obj9 = ((C3378nn) list5.get(i15)).f52979a;
            }
            size7 = list7.size();
            i16 = 0;
            while (i16 < size7) {
                C3378nn c3378nn9 = (C3378nn) list7.get(i16);
                p87 p87Var2 = (p87) c3378nn9.f52979a;
                int i44 = c3378nn9.f52980b;
                int i45 = c3378nn9.f52981c;
                while (i17 < r9) {
                    spannable.removeSpan((sda) obj8);
                }
                long j14 = p87Var2.f55755a;
                long j15 = p87Var2.f55756b;
                float fM25848c5 = zx9.m25848c(j14);
                int i46 = i16;
                jM25847b = zx9.m25847b(p87Var2.f55755a);
                int i47 = size7;
                if (ay9.m3127a(jM25847b, 4294967296L)) {
                    i18 = 0;
                } else if (ay9.m3127a(jM25847b, 8589934592L)) {
                    i18 = 1;
                } else {
                    i18 = 2;
                }
                fb2 fb2Var4 = fb2Var2;
                float fM25848c6 = zx9.m25848c(j15);
                jM25847b2 = zx9.m25847b(j15);
                if (ay9.m3127a(jM25847b2, 4294967296L)) {
                    i19 = 0;
                } else if (ay9.m3127a(jM25847b2, 8589934592L)) {
                    i19 = 1;
                } else {
                    i19 = 2;
                }
                q87 q87Var2 = new q87(fM25848c5, i18, fM25848c6, i19, fb2Var4, 3);
                fb2Var2 = fb2Var4;
                spannable.setSpan(q87Var2, i44, i45, 33);
                size7 = i47;
                i16 = i46 + 1;
            }
            c3462pj = this;
            charSequenceM19454g = spannable;
        }
        c3462pj = obj4;
        c3462pj.f56291h = charSequenceM19454g;
        c3462pj.f56292i = new hq4(charSequenceM19454g, c3462pj.f56290g, c3462pj.f56295l);
    }

    @Override // p000.h37
    /* JADX INFO: renamed from: a */
    public final boolean mo13024a() {
        sq5 sq5Var = this.f56293j;
        if (sq5Var != null ? sq5Var.m21580v() : false) {
            return true;
        }
        if (!this.f56294k && te1.m21991e(this.f56285b)) {
            qn3 qn3Var = tq2.f62720a;
            qn3 qn3Var2 = tq2.f62720a;
            dh9 dh9VarM20074t = (dh9) qn3Var2.f57974a;
            if (dh9VarM20074t == null) {
                if (pq2.m19449d()) {
                    dh9VarM20074t = qn3Var2.m20074t();
                    qn3Var2.f57974a = dh9VarM20074t;
                } else {
                    dh9VarM20074t = b34.f7840a;
                }
            }
            if (((Boolean) dh9VarM20074t.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.h37
    /* JADX INFO: renamed from: b */
    public final float mo13025b() {
        hq4 hq4Var = this.f56292i;
        float f = hq4Var.f42774e;
        TextPaint textPaint = hq4Var.f42771b;
        if (!Float.isNaN(f)) {
            return hq4Var.f42774e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = hq4Var.f42770a;
        lineInstance.setText(new wu0(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, eh0.f37246l);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new i84(i, next, 1));
            } else {
                i84 i84Var = (i84) priorityQueue.peek();
                if (i84Var != null && i84Var.f40380b - i84Var.f40379a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new i84(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                uk9.m22784s();
                return 0.0f;
            }
            i84 i84Var2 = (i84) it.next();
            desiredWidth = Layout.getDesiredWidth(hq4Var.m13431b(), i84Var2.f40379a, i84Var2.f40380b, textPaint);
            while (it.hasNext()) {
                i84 i84Var3 = (i84) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(hq4Var.m13431b(), i84Var3.f40379a, i84Var3.f40380b, textPaint));
            }
        }
        hq4Var.f42774e = desiredWidth;
        return desiredWidth;
    }

    @Override // p000.h37
    /* JADX INFO: renamed from: c */
    public final float mo13026c() {
        return this.f56292i.m13432c();
    }
}
