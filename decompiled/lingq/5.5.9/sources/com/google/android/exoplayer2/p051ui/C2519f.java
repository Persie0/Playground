package com.google.android.exoplayer2.p051ui;

import android.content.Context;
import android.support.v4.media.session.C0166e;
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
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p219ka.C6640a;
import p260m8.C7499b;
import p294oa.C8027a;
import p294oa.C8029c;
import p294oa.C8030d;
import p479xa.C10129a;
import p479xa.C10134c0;
import p482xd.C10170b;
import va.C9688b;
import va.C9704r;
import va.C9706t;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2519f extends FrameLayout implements SubtitleView.InterfaceC2511a {

    /* JADX INFO: renamed from: a */
    public final C2514a f13666a;

    /* JADX INFO: renamed from: b */
    public final C9706t f13667b;

    /* JADX INFO: renamed from: c */
    public List<C6640a> f13668c;

    /* JADX INFO: renamed from: d */
    public C9688b f13669d;

    /* JADX INFO: renamed from: e */
    public float f13670e;

    /* JADX INFO: renamed from: f */
    public int f13671f;

    /* JADX INFO: renamed from: g */
    public float f13672g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13673a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f13673a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13673a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13673a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2519f(Context context) {
        super(context, null);
        this.f13668c = Collections.emptyList();
        this.f13669d = C9688b.f49604g;
        this.f13670e = 0.0533f;
        this.f13671f = 0;
        this.f13672g = 0.08f;
        C2514a c2514a = new C2514a(context);
        this.f13666a = c2514a;
        C9706t c9706t = new C9706t(context);
        this.f13667b = c9706t;
        c9706t.setBackgroundColor(0);
        addView(c2514a);
        addView(c9706t);
    }

    @Override // com.google.android.exoplayer2.p051ui.SubtitleView.InterfaceC2511a
    /* JADX INFO: renamed from: a */
    public final void mo7418a(List<C6640a> list, C9688b c9688b, float f3, int i10, float f10) {
        this.f13669d = c9688b;
        this.f13670e = f3;
        this.f13671f = i10;
        this.f13672g = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C6640a c6640a = list.get(i11);
            if (c6640a.f37662d != null) {
                arrayList.add(c6640a);
            } else {
                arrayList2.add(c6640a);
            }
        }
        if (!this.f13668c.isEmpty() || !arrayList2.isEmpty()) {
            this.f13668c = arrayList2;
            m7462c();
        }
        this.f13666a.mo7418a(arrayList, c9688b, f3, i10, f10);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final String m7461b(int i10, float f3) {
        float fM18215b = C9704r.m18215b(f3, i10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fM18215b == -3.4028235E38f ? "unset" : C10134c0.m19045l("%.2fpx", Float.valueOf(fM18215b / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0251  */
    /* JADX WARN: Code duplicated, block: B:102:0x0271 A[LOOP:2: B:101:0x026f->B:102:0x0271, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0294 A[LOOP:3: B:104:0x028e->B:106:0x0294, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:112:0x0301  */
    /* JADX WARN: Code duplicated, block: B:114:0x0307  */
    /* JADX WARN: Code duplicated, block: B:116:0x0326  */
    /* JADX WARN: Code duplicated, block: B:118:0x032e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0346  */
    /* JADX WARN: Code duplicated, block: B:121:0x034a  */
    /* JADX WARN: Code duplicated, block: B:122:0x034d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0351  */
    /* JADX WARN: Code duplicated, block: B:126:0x035a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0360  */
    /* JADX WARN: Code duplicated, block: B:129:0x0378  */
    /* JADX WARN: Code duplicated, block: B:131:0x037e  */
    /* JADX WARN: Code duplicated, block: B:132:0x039d  */
    /* JADX WARN: Code duplicated, block: B:134:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:149:0x03df  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:164:0x0403  */
    /* JADX WARN: Code duplicated, block: B:166:0x040e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0412  */
    /* JADX WARN: Code duplicated, block: B:170:0x0428  */
    /* JADX WARN: Code duplicated, block: B:173:0x042c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0432  */
    /* JADX WARN: Code duplicated, block: B:176:0x043b  */
    /* JADX WARN: Code duplicated, block: B:178:0x043e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0440  */
    /* JADX WARN: Code duplicated, block: B:181:0x0444  */
    /* JADX WARN: Code duplicated, block: B:182:0x0448  */
    /* JADX WARN: Code duplicated, block: B:183:0x044e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0454  */
    /* JADX WARN: Code duplicated, block: B:185:0x045a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0468  */
    /* JADX WARN: Code duplicated, block: B:189:0x046b  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:234:0x0500  */
    /* JADX WARN: Code duplicated, block: B:236:0x0510  */
    /* JADX WARN: Code duplicated, block: B:239:0x0525  */
    /* JADX WARN: Code duplicated, block: B:245:0x055a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0582 A[LOOP:6: B:246:0x057c->B:248:0x0582, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x059f A[LOOP:7: B:250:0x0599->B:252:0x059f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:258:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:260:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:264:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:268:0x064e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0655 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x065b  */
    /* JADX WARN: Code duplicated, block: B:275:0x066f  */
    /* JADX WARN: Code duplicated, block: B:278:0x069a  */
    /* JADX WARN: Code duplicated, block: B:280:0x06a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:281:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:282:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:283:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:285:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:303:0x0532 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01af  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0200  */
    /* JADX WARN: Code duplicated, block: B:95:0x0220  */
    /* JADX WARN: Code duplicated, block: B:96:0x022c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0232  */
    /* JADX INFO: renamed from: c */
    public final void m7462c() {
        String strM19045l;
        float f3;
        String strM19045l2;
        int i10;
        String strM19045l3;
        Object obj;
        int i11;
        Object obj2;
        String str;
        int i12;
        String str2;
        int i13;
        String str3;
        String str4;
        float f10;
        CharSequence charSequence;
        String str5;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i14;
        HashMap map;
        Iterator it;
        String str6;
        Object obj3;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i15;
        String str7;
        String str8;
        String str9;
        StringBuilder sb2;
        int i16;
        int i17;
        C2516c.a aVar;
        Iterator it2;
        Iterator it3;
        Object obj4;
        boolean z10;
        String str10;
        int i18;
        C8030d c8030d;
        int i19;
        StringBuilder sb3;
        int i20;
        int i21;
        String str11;
        String strM19045l4;
        String strM19045l5;
        int i22;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str12;
        int spanStart;
        int spanEnd;
        C2516c.c cVar;
        C2516c.c cVar2;
        String str13;
        float f11;
        int i23;
        String strM19045l6;
        String str14;
        Layout.Alignment alignment;
        int i24;
        Object obj5;
        String str15;
        String str16;
        boolean z11;
        String strM19045l7;
        int i25;
        C2519f c2519f = this;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr = new Object[4];
        int i26 = 0;
        objArr[0] = C7499b.m14893A0(c2519f.f13669d.f49605a);
        int i27 = 1;
        objArr[1] = c2519f.m7461b(c2519f.f13671f, c2519f.f13670e);
        int i28 = 2;
        objArr[2] = Float.valueOf(1.2f);
        C9688b c9688b = c2519f.f13669d;
        int i29 = c9688b.f49608d;
        int i30 = c9688b.f49609e;
        if (i29 == 1) {
            strM19045l = C10134c0.m19045l("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C7499b.m14893A0(i30));
        } else if (i29 == 2) {
            strM19045l = C10134c0.m19045l("0.1em 0.12em 0.15em %s", C7499b.m14893A0(i30));
        } else if (i29 != 3) {
            strM19045l = i29 != 4 ? "unset" : C10134c0.m19045l("-0.05em -0.05em 0.15em %s", C7499b.m14893A0(i30));
        } else {
            strM19045l = C10134c0.m19045l("0.06em 0.08em 0.15em %s", C7499b.m14893A0(i30));
        }
        objArr[3] = strM19045l;
        sb4.append(C10134c0.m19045l("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr));
        HashMap map2 = new HashMap();
        String str17 = "background-color:%s;";
        map2.put(".default_bg,.default_bg *", C10134c0.m19045l("background-color:%s;", C7499b.m14893A0(c2519f.f13669d.f49606b)));
        int i31 = 0;
        while (i26 < c2519f.f13668c.size()) {
            C6640a c6640a = c2519f.f13668c.get(i26);
            float f12 = c6640a.f37666h;
            float f13 = f12 != -3.4028235E38f ? f12 * 100.0f : 50.0f;
            int i32 = c6640a.f37667i;
            int i33 = i32 != i27 ? i32 != i28 ? i31 : -100 : -50;
            float f14 = c6640a.f37663e;
            int i34 = c6640a.f37657K;
            if (f14 != -3.4028235E38f) {
                if (c6640a.f37664f != i27) {
                    Object[] objArr2 = new Object[i27];
                    objArr2[i31] = Float.valueOf(f14 * 100.0f);
                    strM19045l7 = C10134c0.m19045l("%.2f%%", objArr2);
                    int i35 = c6640a.f37665g;
                    if (i34 == i27) {
                        i25 = -(i35 != i27 ? i35 != i28 ? i31 : -100 : -50);
                    } else if (i35 != i27) {
                        i25 = i35 != i28 ? i31 : -100;
                    } else {
                        i25 = -50;
                    }
                    i10 = i25;
                } else if (f14 >= 0.0f) {
                    Object[] objArr3 = new Object[i27];
                    objArr3[i31] = Float.valueOf(f14 * 1.2f);
                    strM19045l7 = C10134c0.m19045l("%.2fem", objArr3);
                    i10 = i31;
                } else {
                    Object[] objArr4 = new Object[i27];
                    objArr4[i31] = Float.valueOf(((-f14) - 1.0f) * 1.2f);
                    strM19045l7 = C10134c0.m19045l("%.2fem", objArr4);
                    i10 = i31;
                    i31 = i27;
                }
                strM19045l2 = strM19045l7;
                f3 = 100.0f;
            } else {
                Object[] objArr5 = new Object[i27];
                f3 = 100.0f;
                objArr5[i31] = Float.valueOf((1.0f - c2519f.f13672g) * 100.0f);
                strM19045l2 = C10134c0.m19045l("%.2f%%", objArr5);
                i10 = -100;
            }
            float f15 = c6640a.f37668j;
            if (f15 != -3.4028235E38f) {
                Object[] objArr6 = new Object[i27];
                objArr6[0] = Float.valueOf(f15 * f3);
                strM19045l3 = C10134c0.m19045l("%.2f%%", objArr6);
            } else {
                strM19045l3 = "fit-content";
            }
            Layout.Alignment alignment2 = c6640a.f37660b;
            if (alignment2 == null) {
                i11 = 2;
                obj = "start";
            } else {
                int i36 = a.f13673a[alignment2.ordinal()];
                obj = "start";
                if (i36 == 1) {
                    i11 = 2;
                    obj2 = obj;
                } else if (i36 != 2) {
                    i11 = 2;
                } else {
                    i11 = 2;
                    obj2 = "end";
                }
                if (i34 != 1) {
                    str = "vertical-rl";
                } else if (i34 != i11) {
                    str = "horizontal-tb";
                } else {
                    str = "vertical-lr";
                }
                String strM7461b = c2519f.m7461b(c6640a.f37655I, c6640a.f37656J);
                if (c6640a.f37670l) {
                    i12 = c6640a.f37654H;
                } else {
                    i12 = c2519f.f13669d.f49607c;
                }
                String strM14893A0 = C7499b.m14893A0(i12);
                str2 = "left";
                if (i34 != 1) {
                    if (i31 == 0) {
                        str2 = "right";
                    }
                    i13 = 2;
                    str3 = str2;
                    str2 = "top";
                } else if (i34 != 2) {
                    str3 = i31 != 0 ? "bottom" : "top";
                    i13 = 2;
                } else {
                    if (i31 != 0) {
                        str2 = "right";
                    }
                    i13 = 2;
                    str3 = str2;
                    str2 = "top";
                }
                if (i34 != i13 || i34 == 1) {
                    str4 = "height";
                } else {
                    str4 = "width";
                    i33 = i10;
                    i10 = i33;
                }
                f10 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = C2516c.f13559a;
                StringBuilder sb5 = sb4;
                charSequence = c6640a.f37659a;
                if (charSequence == null) {
                    aVar = new C2516c.a("", ImmutableMap.m9070h());
                    str5 = "";
                } else {
                    str5 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i14 = 0;
                        while (i14 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i14].getBackgroundColor()));
                            i14++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strM761g = C0166e.m761g("bg_", iIntValue);
                            map.put(C0166e.m766l(".", strM761g, ",.", strM761g, " *"), C10134c0.m19045l(str17, C7499b.m14893A0(iIntValue)));
                            it = it;
                            str = str;
                            obj2 = obj2;
                        }
                        str6 = str;
                        obj3 = obj2;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        length2 = spans.length;
                        i15 = 0;
                        while (i15 < length2) {
                            obj4 = spans[i15];
                            Object[] objArr7 = spans;
                            z10 = obj4 instanceof StrikethroughSpan;
                            String str18 = null;
                            if (z10) {
                                i18 = length2;
                                strM19045l4 = "<span style='text-decoration:line-through;'>";
                                str10 = str17;
                            } else {
                                str10 = str17;
                                if (obj4 instanceof ForegroundColorSpan) {
                                    i18 = length2;
                                    strM19045l5 = C10134c0.m19045l("<span style='color:%s;'>", C7499b.m14893A0(((ForegroundColorSpan) obj4).getForegroundColor()));
                                } else {
                                    i18 = length2;
                                    if (obj4 instanceof BackgroundColorSpan) {
                                        strM19045l5 = C10134c0.m19045l("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj4).getBackgroundColor()));
                                    } else if (obj4 instanceof C8027a) {
                                        strM19045l5 = "<span style='text-combine-upright:all;'>";
                                    } else if (obj4 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj4;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f10;
                                        }
                                        strM19045l5 = C10134c0.m19045l("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
                                    } else {
                                        if (obj4 instanceof RelativeSizeSpan) {
                                            strM19045l5 = C10134c0.m19045l("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj4).getSizeChange() * 100.0f));
                                        } else if (obj4 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj4).getFamily();
                                            if (family != null) {
                                                strM19045l5 = C10134c0.m19045l("<span style='font-family:\"%s\";'>", family);
                                            } else {
                                                strM19045l4 = null;
                                            }
                                        } else if (obj4 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj4).getStyle();
                                            if (style != 1) {
                                                strM19045l5 = "<b>";
                                            } else if (style != 2) {
                                                strM19045l5 = "<i>";
                                            } else if (style != 3) {
                                                strM19045l4 = null;
                                            } else {
                                                strM19045l5 = "<b><i>";
                                            }
                                        } else if (obj4 instanceof C8029c) {
                                            i22 = ((C8029c) obj4).f43656b;
                                            if (i22 != -1) {
                                                strM19045l5 = "<ruby style='ruby-position:unset;'>";
                                            } else if (i22 != 1) {
                                                strM19045l5 = "<ruby style='ruby-position:over;'>";
                                            } else if (i22 != 2) {
                                                strM19045l4 = null;
                                            } else {
                                                strM19045l5 = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj4 instanceof UnderlineSpan) {
                                            strM19045l5 = "<u>";
                                        } else if (obj4 instanceof C8030d) {
                                            c8030d = (C8030d) obj4;
                                            i19 = c8030d.f43657a;
                                            sb3 = new StringBuilder();
                                            i20 = c8030d.f43658b;
                                            if (i20 != 1) {
                                                i21 = 2;
                                                if (i20 == 2) {
                                                    sb3.append("open ");
                                                }
                                            } else {
                                                i21 = 2;
                                                sb3.append("filled ");
                                            }
                                            if (i19 != 0) {
                                                sb3.append("none");
                                            } else if (i19 != 1) {
                                                sb3.append("circle");
                                            } else if (i19 != i21) {
                                                sb3.append("dot");
                                            } else if (i19 != 3) {
                                                sb3.append("unset");
                                            } else {
                                                sb3.append("sesame");
                                            }
                                            String string = sb3.toString();
                                            if (c8030d.f43659c != 2) {
                                                str11 = "over right";
                                            } else {
                                                str11 = "under left";
                                            }
                                            strM19045l4 = C10134c0.m19045l("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", string, str11);
                                        } else {
                                            strM19045l4 = null;
                                        }
                                        strM19045l4 = strM19045l5;
                                    }
                                }
                                strM19045l4 = strM19045l5;
                            }
                            if (!z10 || (obj4 instanceof ForegroundColorSpan) || (obj4 instanceof BackgroundColorSpan) || (obj4 instanceof C8027a) || (obj4 instanceof AbsoluteSizeSpan) || (obj4 instanceof RelativeSizeSpan) || (obj4 instanceof C8030d)) {
                                str12 = "</span>";
                            } else {
                                if (obj4 instanceof TypefaceSpan) {
                                    if (((TypefaceSpan) obj4).getFamily() != null) {
                                        str12 = "</span>";
                                    }
                                } else if (obj4 instanceof StyleSpan) {
                                    int style2 = ((StyleSpan) obj4).getStyle();
                                    if (style2 == 1) {
                                        str13 = "</b>";
                                    } else if (style2 == 2) {
                                        str13 = "</i>";
                                    } else if (style2 == 3) {
                                        str13 = "</i></b>";
                                    }
                                    str18 = str13;
                                } else {
                                    if (obj4 instanceof C8029c) {
                                        str13 = "<rt>" + C2516c.m7429a(((C8029c) obj4).f43655a) + "</rt></ruby>";
                                    } else if (obj4 instanceof UnderlineSpan) {
                                        str13 = "</u>";
                                    }
                                    str18 = str13;
                                }
                                str12 = str18;
                            }
                            spanStart = spanned.getSpanStart(obj4);
                            spanEnd = spanned.getSpanEnd(obj4);
                            if (strM19045l4 != null) {
                                str12.getClass();
                                C2516c.b bVar = new C2516c.b(spanStart, spanEnd, strM19045l4, str12);
                                cVar = (C2516c.c) sparseArray.get(spanStart);
                                if (cVar == null) {
                                    cVar = new C2516c.c();
                                    sparseArray.put(spanStart, cVar);
                                }
                                cVar.f13568a.add(bVar);
                                cVar2 = (C2516c.c) sparseArray.get(spanEnd);
                                if (cVar2 == null) {
                                    cVar2 = new C2516c.c();
                                    sparseArray.put(spanEnd, cVar2);
                                }
                                cVar2.f13569b.add(bVar);
                            }
                            i15++;
                            spans = objArr7;
                            str17 = str10;
                            length2 = i18;
                            f10 = f10;
                            strM19045l3 = strM19045l3;
                            str4 = str4;
                        }
                        str7 = str4;
                        str8 = str17;
                        str9 = strM19045l3;
                        sb2 = new StringBuilder(spanned.length());
                        i16 = 0;
                        i17 = 0;
                        while (i16 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i16);
                            sb2.append(C2516c.m7429a(spanned.subSequence(i17, iKeyAt)));
                            C2516c.c cVar3 = (C2516c.c) sparseArray.get(iKeyAt);
                            Collections.sort(cVar3.f13569b, C2516c.b.f13563f);
                            it2 = cVar3.f13569b.iterator();
                            while (it2.hasNext()) {
                                sb2.append(((C2516c.b) it2.next()).f13567d);
                            }
                            ArrayList arrayList = cVar3.f13568a;
                            Collections.sort(arrayList, C2516c.b.f13562e);
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                sb2.append(((C2516c.b) it3.next()).f13566c);
                            }
                            i16++;
                            i17 = iKeyAt;
                        }
                        sb2.append(C2516c.m7429a(spanned.subSequence(i17, spanned.length())));
                        aVar = new C2516c.a(sb2.toString(), map);
                    } else {
                        aVar = new C2516c.a(C2516c.m7429a(charSequence), ImmutableMap.m9070h());
                    }
                    for (String str19 : map2.keySet()) {
                        str16 = (String) map2.put(str19, (String) map2.get(str19));
                        if (str16 != null || str16.equals(map2.get(str19))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        C10129a.m18992d(z11);
                    }
                    Object[] objArr8 = new Object[14];
                    objArr8[0] = Integer.valueOf(i26);
                    objArr8[1] = str2;
                    objArr8[2] = Float.valueOf(f13);
                    objArr8[3] = str3;
                    objArr8[4] = strM19045l2;
                    objArr8[5] = str7;
                    objArr8[6] = str9;
                    objArr8[7] = obj3;
                    objArr8[8] = str6;
                    objArr8[9] = strM7461b;
                    objArr8[10] = strM14893A0;
                    objArr8[11] = Integer.valueOf(i10);
                    objArr8[12] = Integer.valueOf(i33);
                    f11 = c6640a.f37658L;
                    if (f11 != 0.0f) {
                        i23 = 1;
                        if (i34 != 2 || i34 == 1) {
                            str15 = "skewY";
                        } else {
                            str15 = "skewX";
                        }
                        strM19045l6 = C10134c0.m19045l("%s(%.2fdeg)", str15, Float.valueOf(f11));
                    } else {
                        i23 = 1;
                        strM19045l6 = str5;
                    }
                    objArr8[13] = strM19045l6;
                    sb4 = sb5;
                    sb4.append(C10134c0.m19045l("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr8));
                    Object[] objArr9 = new Object[i23];
                    objArr9[0] = "default_bg";
                    sb4.append(C10134c0.m19045l("<span class='%s'>", objArr9));
                    str14 = aVar.f13560a;
                    alignment = c6640a.f37661c;
                    if (alignment != null) {
                        Object[] objArr10 = new Object[i23];
                        i24 = a.f13673a[alignment.ordinal()];
                        i28 = 2;
                        if (i24 != i23) {
                            obj5 = obj;
                        } else if (i24 != 2) {
                            obj5 = "center";
                        } else {
                            obj5 = "end";
                        }
                        objArr10[0] = obj5;
                        sb4.append(C10134c0.m19045l("<span style='display:inline-block; text-align:%s;'>", objArr10));
                        sb4.append(str14);
                        sb4.append("</span>");
                    } else {
                        sb4.append(str14);
                        i28 = 2;
                    }
                    sb4.append("</span></div>");
                    i26++;
                    i27 = 1;
                    i31 = 0;
                    c2519f = this;
                    str17 = str8;
                }
                str7 = str4;
                str8 = str17;
                str9 = strM19045l3;
                str6 = str;
                obj3 = obj2;
                while (r0.hasNext()) {
                    str16 = (String) map2.put(str19, (String) map2.get(str19));
                    if (str16 != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    C10129a.m18992d(z11);
                }
                Object[] objArr11 = new Object[14];
                objArr11[0] = Integer.valueOf(i26);
                objArr11[1] = str2;
                objArr11[2] = Float.valueOf(f13);
                objArr11[3] = str3;
                objArr11[4] = strM19045l2;
                objArr11[5] = str7;
                objArr11[6] = str9;
                objArr11[7] = obj3;
                objArr11[8] = str6;
                objArr11[9] = strM7461b;
                objArr11[10] = strM14893A0;
                objArr11[11] = Integer.valueOf(i10);
                objArr11[12] = Integer.valueOf(i33);
                f11 = c6640a.f37658L;
                if (f11 != 0.0f) {
                    i23 = 1;
                    if (i34 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    strM19045l6 = C10134c0.m19045l("%s(%.2fdeg)", str15, Float.valueOf(f11));
                } else {
                    i23 = 1;
                    strM19045l6 = str5;
                }
                objArr11[13] = strM19045l6;
                sb4 = sb5;
                sb4.append(C10134c0.m19045l("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr11));
                Object[] objArr12 = new Object[i23];
                objArr12[0] = "default_bg";
                sb4.append(C10134c0.m19045l("<span class='%s'>", objArr12));
                str14 = aVar.f13560a;
                alignment = c6640a.f37661c;
                if (alignment != null) {
                    Object[] objArr13 = new Object[i23];
                    i24 = a.f13673a[alignment.ordinal()];
                    i28 = 2;
                    if (i24 != i23) {
                        obj5 = obj;
                    } else if (i24 != 2) {
                        obj5 = "center";
                    } else {
                        obj5 = "end";
                    }
                    objArr13[0] = obj5;
                    sb4.append(C10134c0.m19045l("<span style='display:inline-block; text-align:%s;'>", objArr13));
                    sb4.append(str14);
                    sb4.append("</span>");
                } else {
                    sb4.append(str14);
                    i28 = 2;
                }
                sb4.append("</span></div>");
                i26++;
                i27 = 1;
                i31 = 0;
                c2519f = this;
                str17 = str8;
            }
            obj2 = "center";
            if (i34 != 1) {
                str = "vertical-rl";
            } else if (i34 != i11) {
                str = "horizontal-tb";
            } else {
                str = "vertical-lr";
            }
            String strM7461b2 = c2519f.m7461b(c6640a.f37655I, c6640a.f37656J);
            if (c6640a.f37670l) {
                i12 = c6640a.f37654H;
            } else {
                i12 = c2519f.f13669d.f49607c;
            }
            String strM14893A1 = C7499b.m14893A0(i12);
            str2 = "left";
            if (i34 != 1) {
                if (i31 == 0) {
                    str2 = "right";
                }
                i13 = 2;
                str3 = str2;
                str2 = "top";
            } else if (i34 != 2) {
                if (i31 != 0) {
                }
                i13 = 2;
            } else {
                if (i31 != 0) {
                    str2 = "right";
                }
                i13 = 2;
                str3 = str2;
                str2 = "top";
            }
            if (i34 != i13) {
                str4 = "height";
            } else {
                str4 = "height";
            }
            f10 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = C2516c.f13559a;
            StringBuilder sb6 = sb4;
            charSequence = c6640a.f37659a;
            if (charSequence == null) {
                aVar = new C2516c.a("", ImmutableMap.m9070h());
                str5 = "";
            } else {
                str5 = "";
                if (charSequence instanceof Spanned) {
                    aVar = new C2516c.a(C2516c.m7429a(charSequence), ImmutableMap.m9070h());
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i14 = 0;
                    while (i14 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i14].getBackgroundColor()));
                        i14++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strM761g2 = C0166e.m761g("bg_", iIntValue2);
                        map.put(C0166e.m766l(".", strM761g2, ",.", strM761g2, " *"), C10134c0.m19045l(str17, C7499b.m14893A0(iIntValue2)));
                        it = it;
                        str = str;
                        obj2 = obj2;
                    }
                    str6 = str;
                    obj3 = obj2;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    length2 = spans.length;
                    i15 = 0;
                    while (i15 < length2) {
                        obj4 = spans[i15];
                        Object[] objArr14 = spans;
                        z10 = obj4 instanceof StrikethroughSpan;
                        String str110 = null;
                        if (z10) {
                            i18 = length2;
                            strM19045l4 = "<span style='text-decoration:line-through;'>";
                            str10 = str17;
                        } else {
                            str10 = str17;
                            if (obj4 instanceof ForegroundColorSpan) {
                                i18 = length2;
                                strM19045l5 = C10134c0.m19045l("<span style='color:%s;'>", C7499b.m14893A0(((ForegroundColorSpan) obj4).getForegroundColor()));
                            } else {
                                i18 = length2;
                                if (obj4 instanceof BackgroundColorSpan) {
                                    strM19045l5 = C10134c0.m19045l("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj4).getBackgroundColor()));
                                } else if (obj4 instanceof C8027a) {
                                    strM19045l5 = "<span style='text-combine-upright:all;'>";
                                } else if (obj4 instanceof AbsoluteSizeSpan) {
                                    absoluteSizeSpan = (AbsoluteSizeSpan) obj4;
                                    if (absoluteSizeSpan.getDip()) {
                                        size = absoluteSizeSpan.getSize();
                                    } else {
                                        size = absoluteSizeSpan.getSize() / f10;
                                    }
                                    strM19045l5 = C10134c0.m19045l("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
                                } else {
                                    if (obj4 instanceof RelativeSizeSpan) {
                                        strM19045l5 = C10134c0.m19045l("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj4).getSizeChange() * 100.0f));
                                    } else if (obj4 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj4).getFamily();
                                        if (family != null) {
                                            strM19045l5 = C10134c0.m19045l("<span style='font-family:\"%s\";'>", family);
                                        } else {
                                            strM19045l4 = null;
                                        }
                                    } else if (obj4 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj4).getStyle();
                                        if (style != 1) {
                                            strM19045l5 = "<b>";
                                        } else if (style != 2) {
                                            strM19045l5 = "<i>";
                                        } else if (style != 3) {
                                            strM19045l4 = null;
                                        } else {
                                            strM19045l5 = "<b><i>";
                                        }
                                    } else if (obj4 instanceof C8029c) {
                                        i22 = ((C8029c) obj4).f43656b;
                                        if (i22 != -1) {
                                            strM19045l5 = "<ruby style='ruby-position:unset;'>";
                                        } else if (i22 != 1) {
                                            strM19045l5 = "<ruby style='ruby-position:over;'>";
                                        } else if (i22 != 2) {
                                            strM19045l4 = null;
                                        } else {
                                            strM19045l5 = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj4 instanceof UnderlineSpan) {
                                        strM19045l5 = "<u>";
                                    } else if (obj4 instanceof C8030d) {
                                        c8030d = (C8030d) obj4;
                                        i19 = c8030d.f43657a;
                                        sb3 = new StringBuilder();
                                        i20 = c8030d.f43658b;
                                        if (i20 != 1) {
                                            i21 = 2;
                                            if (i20 == 2) {
                                                sb3.append("open ");
                                            }
                                        } else {
                                            i21 = 2;
                                            sb3.append("filled ");
                                        }
                                        if (i19 != 0) {
                                            sb3.append("none");
                                        } else if (i19 != 1) {
                                            sb3.append("circle");
                                        } else if (i19 != i21) {
                                            sb3.append("dot");
                                        } else if (i19 != 3) {
                                            sb3.append("unset");
                                        } else {
                                            sb3.append("sesame");
                                        }
                                        String string2 = sb3.toString();
                                        if (c8030d.f43659c != 2) {
                                            str11 = "over right";
                                        } else {
                                            str11 = "under left";
                                        }
                                        strM19045l4 = C10134c0.m19045l("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", string2, str11);
                                    } else {
                                        strM19045l4 = null;
                                    }
                                    strM19045l4 = strM19045l5;
                                }
                            }
                            strM19045l4 = strM19045l5;
                        }
                        if (z10) {
                            str12 = "</span>";
                        } else {
                            str12 = "</span>";
                        }
                        spanStart = spanned.getSpanStart(obj4);
                        spanEnd = spanned.getSpanEnd(obj4);
                        if (strM19045l4 != null) {
                            str12.getClass();
                            C2516c.b bVar2 = new C2516c.b(spanStart, spanEnd, strM19045l4, str12);
                            cVar = (C2516c.c) sparseArray.get(spanStart);
                            if (cVar == null) {
                                cVar = new C2516c.c();
                                sparseArray.put(spanStart, cVar);
                            }
                            cVar.f13568a.add(bVar2);
                            cVar2 = (C2516c.c) sparseArray.get(spanEnd);
                            if (cVar2 == null) {
                                cVar2 = new C2516c.c();
                                sparseArray.put(spanEnd, cVar2);
                            }
                            cVar2.f13569b.add(bVar2);
                        }
                        i15++;
                        spans = objArr14;
                        str17 = str10;
                        length2 = i18;
                        f10 = f10;
                        strM19045l3 = strM19045l3;
                        str4 = str4;
                    }
                    str7 = str4;
                    str8 = str17;
                    str9 = strM19045l3;
                    sb2 = new StringBuilder(spanned.length());
                    i16 = 0;
                    i17 = 0;
                    while (i16 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i16);
                        sb2.append(C2516c.m7429a(spanned.subSequence(i17, iKeyAt2)));
                        C2516c.c cVar4 = (C2516c.c) sparseArray.get(iKeyAt2);
                        Collections.sort(cVar4.f13569b, C2516c.b.f13563f);
                        it2 = cVar4.f13569b.iterator();
                        while (it2.hasNext()) {
                            sb2.append(((C2516c.b) it2.next()).f13567d);
                        }
                        ArrayList arrayList2 = cVar4.f13568a;
                        Collections.sort(arrayList2, C2516c.b.f13562e);
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            sb2.append(((C2516c.b) it3.next()).f13566c);
                        }
                        i16++;
                        i17 = iKeyAt2;
                    }
                    sb2.append(C2516c.m7429a(spanned.subSequence(i17, spanned.length())));
                    aVar = new C2516c.a(sb2.toString(), map);
                }
                while (r0.hasNext()) {
                    str16 = (String) map2.put(str19, (String) map2.get(str19));
                    if (str16 != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    C10129a.m18992d(z11);
                }
                Object[] objArr15 = new Object[14];
                objArr15[0] = Integer.valueOf(i26);
                objArr15[1] = str2;
                objArr15[2] = Float.valueOf(f13);
                objArr15[3] = str3;
                objArr15[4] = strM19045l2;
                objArr15[5] = str7;
                objArr15[6] = str9;
                objArr15[7] = obj3;
                objArr15[8] = str6;
                objArr15[9] = strM7461b2;
                objArr15[10] = strM14893A1;
                objArr15[11] = Integer.valueOf(i10);
                objArr15[12] = Integer.valueOf(i33);
                f11 = c6640a.f37658L;
                if (f11 != 0.0f) {
                    i23 = 1;
                    if (i34 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    strM19045l6 = C10134c0.m19045l("%s(%.2fdeg)", str15, Float.valueOf(f11));
                } else {
                    i23 = 1;
                    strM19045l6 = str5;
                }
                objArr15[13] = strM19045l6;
                sb4 = sb6;
                sb4.append(C10134c0.m19045l("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr15));
                Object[] objArr16 = new Object[i23];
                objArr16[0] = "default_bg";
                sb4.append(C10134c0.m19045l("<span class='%s'>", objArr16));
                str14 = aVar.f13560a;
                alignment = c6640a.f37661c;
                if (alignment != null) {
                    Object[] objArr17 = new Object[i23];
                    i24 = a.f13673a[alignment.ordinal()];
                    i28 = 2;
                    if (i24 != i23) {
                        obj5 = obj;
                    } else if (i24 != 2) {
                        obj5 = "center";
                    } else {
                        obj5 = "end";
                    }
                    objArr17[0] = obj5;
                    sb4.append(C10134c0.m19045l("<span style='display:inline-block; text-align:%s;'>", objArr17));
                    sb4.append(str14);
                    sb4.append("</span>");
                } else {
                    sb4.append(str14);
                    i28 = 2;
                }
                sb4.append("</span></div>");
                i26++;
                i27 = 1;
                i31 = 0;
                c2519f = this;
                str17 = str8;
            }
            str7 = str4;
            str8 = str17;
            str9 = strM19045l3;
            str6 = str;
            obj3 = obj2;
            while (r0.hasNext()) {
                str16 = (String) map2.put(str19, (String) map2.get(str19));
                if (str16 != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                C10129a.m18992d(z11);
            }
            Object[] objArr18 = new Object[14];
            objArr18[0] = Integer.valueOf(i26);
            objArr18[1] = str2;
            objArr18[2] = Float.valueOf(f13);
            objArr18[3] = str3;
            objArr18[4] = strM19045l2;
            objArr18[5] = str7;
            objArr18[6] = str9;
            objArr18[7] = obj3;
            objArr18[8] = str6;
            objArr18[9] = strM7461b2;
            objArr18[10] = strM14893A1;
            objArr18[11] = Integer.valueOf(i10);
            objArr18[12] = Integer.valueOf(i33);
            f11 = c6640a.f37658L;
            if (f11 != 0.0f) {
                i23 = 1;
                if (i34 != 2) {
                    str15 = "skewY";
                } else {
                    str15 = "skewY";
                }
                strM19045l6 = C10134c0.m19045l("%s(%.2fdeg)", str15, Float.valueOf(f11));
            } else {
                i23 = 1;
                strM19045l6 = str5;
            }
            objArr18[13] = strM19045l6;
            sb4 = sb6;
            sb4.append(C10134c0.m19045l("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr18));
            Object[] objArr19 = new Object[i23];
            objArr19[0] = "default_bg";
            sb4.append(C10134c0.m19045l("<span class='%s'>", objArr19));
            str14 = aVar.f13560a;
            alignment = c6640a.f37661c;
            if (alignment != null) {
                Object[] objArr110 = new Object[i23];
                i24 = a.f13673a[alignment.ordinal()];
                i28 = 2;
                if (i24 != i23) {
                    obj5 = obj;
                } else if (i24 != 2) {
                    obj5 = "center";
                } else {
                    obj5 = "end";
                }
                objArr110[0] = obj5;
                sb4.append(C10134c0.m19045l("<span style='display:inline-block; text-align:%s;'>", objArr110));
                sb4.append(str14);
                sb4.append("</span>");
            } else {
                sb4.append(str14);
                i28 = 2;
            }
            sb4.append("</span></div>");
            i26++;
            i27 = 1;
            i31 = 0;
            c2519f = this;
            str17 = str8;
        }
        sb4.append("</div></body></html>");
        StringBuilder sb7 = new StringBuilder("<html><head><style>");
        for (String str20 : map2.keySet()) {
            sb7.append(str20);
            sb7.append("{");
            sb7.append((String) map2.get(str20));
            sb7.append("}");
        }
        sb7.append("</style></head>");
        sb4.insert(0, sb7.toString());
        this.f13667b.loadData(Base64.encodeToString(sb4.toString().getBytes(C10170b.f51477c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f13668c.isEmpty()) {
            m7462c();
        }
    }
}
