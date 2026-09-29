package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class cn0 extends View implements en9 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f10301a;

    /* JADX INFO: renamed from: b */
    public List f10302b;

    /* JADX INFO: renamed from: c */
    public float f10303c;

    /* JADX INFO: renamed from: d */
    public kn0 f10304d;

    /* JADX INFO: renamed from: e */
    public float f10305e;

    public cn0(Context context, int i) {
        super(context, null);
        this.f10301a = new ArrayList();
        this.f10302b = Collections.EMPTY_LIST;
        this.f10303c = 0.0533f;
        this.f10304d = kn0.f47528g;
        this.f10305e = 0.08f;
    }

    @Override // p000.en9
    /* JADX INFO: renamed from: a */
    public final void mo4881a(List list, kn0 kn0Var, float f, float f2) {
        this.f10302b = list;
        this.f10304d = kn0Var;
        this.f10303c = f;
        this.f10305e = f2;
        while (true) {
            ArrayList arrayList = this.f10301a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new an9(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:258:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:260:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:262:0x05fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [kg0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [kg0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List listM15174e;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float f2;
        int i7;
        float f3;
        int i8;
        int iMax;
        int iMin;
        int iRound;
        int i9;
        cn0 cn0Var = this;
        Canvas canvas2 = canvas;
        List list = cn0Var.f10302b;
        if (list.isEmpty()) {
            return;
        }
        int height = cn0Var.getHeight();
        int paddingLeft = cn0Var.getPaddingLeft();
        int paddingTop = cn0Var.getPaddingTop();
        int width = cn0Var.getWidth() - cn0Var.getPaddingRight();
        int paddingBottom = height - cn0Var.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fM14878c = k5d.m14878c(cn0Var.f10303c, 0, height, i10);
        float f4 = 0.0f;
        if (fM14878c <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            cs1 cs1VarM4153a = (cs1) list.get(i11);
            float f5 = f4;
            if (cs1VarM4153a.f34479p != Integer.MIN_VALUE) {
                bs1 bs1VarM9869a = cs1VarM4153a.m9869a();
                bs1VarM9869a.f8920h = -3.4028235E38f;
                bs1VarM9869a.f8921i = Integer.MIN_VALUE;
                bs1VarM9869a.f8915c = null;
                int i12 = cs1VarM4153a.f34469f;
                float f6 = cs1VarM4153a.f34468e;
                if (i12 == 0) {
                    bs1VarM9869a.f8917e = 1.0f - f6;
                    i9 = 0;
                    bs1VarM9869a.f8918f = 0;
                } else {
                    i9 = 0;
                    bs1VarM9869a.f8917e = (-f6) - 1.0f;
                    bs1VarM9869a.f8918f = 1;
                }
                int i13 = cs1VarM4153a.f34470g;
                if (i13 == 0) {
                    bs1VarM9869a.f8919g = 2;
                } else if (i13 == 2) {
                    bs1VarM9869a.f8919g = i9;
                }
                cs1VarM4153a = bs1VarM9869a.m4153a();
            }
            float fM14878c2 = k5d.m14878c(cs1VarM4153a.f34478o, cs1VarM4153a.f34477n, height, i10);
            an9 an9Var = (an9) cn0Var.f10301a.get(i11);
            kn0 kn0Var = cn0Var.f10304d;
            List list2 = list;
            float f7 = cn0Var.f10305e;
            TextPaint textPaint = an9Var.f911f;
            int i14 = height;
            Bitmap bitmap = cs1VarM4153a.f34467d;
            int i15 = i10;
            float f8 = cs1VarM4153a.f34474k;
            int i16 = size;
            float f9 = cs1VarM4153a.f34473j;
            int i17 = i11;
            int i18 = cs1VarM4153a.f34472i;
            float f10 = cs1VarM4153a.f34471h;
            int i19 = cs1VarM4153a.f34470g;
            float f11 = fM14878c;
            int i20 = cs1VarM4153a.f34469f;
            float f12 = cs1VarM4153a.f34468e;
            Layout.Alignment alignment = cs1VarM4153a.f34465b;
            ?? spannableStringBuilder = cs1VarM4153a.f34464a;
            boolean z2 = bitmap == null;
            if (z2) {
                if (TextUtils.isEmpty(spannableStringBuilder)) {
                    i6 = paddingBottom;
                    z = false;
                } else {
                    f = f10;
                    i = cs1VarM4153a.f34475l ? cs1VarM4153a.f34476m : kn0Var.f47531c;
                }
                i11 = i17 + 1;
                cn0Var = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fM14878c = f11;
            } else {
                f = f10;
                i = -16777216;
            }
            ?? r14 = an9Var.f914i;
            if ((r14 == spannableStringBuilder || (r14 != 0 && r14.equals(spannableStringBuilder))) && Objects.equals(an9Var.f915j, alignment) && an9Var.f916k == bitmap && an9Var.f917l == f12 && an9Var.f918m == i20) {
                i2 = i19;
                if (Integer.valueOf(an9Var.f919n).equals(Integer.valueOf(i2)) && an9Var.f920o == f && Integer.valueOf(an9Var.f921p).equals(Integer.valueOf(i18)) && an9Var.f922q == f9 && an9Var.f923r == f8 && an9Var.f924s == kn0Var.f47529a && an9Var.f925t == kn0Var.f47530b && an9Var.f926u == i && an9Var.f928w == kn0Var.f47532d && an9Var.f927v == kn0Var.f47533e && Objects.equals(textPaint.getTypeface(), kn0Var.f47534f) && an9Var.f929x == f11 && an9Var.f930y == fM14878c2 && an9Var.f931z == f7 && an9Var.f896A == paddingLeft && an9Var.f897B == paddingTop && an9Var.f898C == width && an9Var.f899D == paddingBottom) {
                    an9Var.m616a(canvas2, z2);
                    i6 = paddingBottom;
                    z = false;
                }
                i11 = i17 + 1;
                cn0Var = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fM14878c = f11;
            } else {
                i2 = i19;
            }
            kg0 kg0Var = jc0.f45391a;
            if (spannableStringBuilder == 0) {
                i4 = width;
                paddingBottom = paddingBottom;
                z2 = z2;
            } else {
                int length = spannableStringBuilder.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = Character.codePointAt((CharSequence) spannableStringBuilder, iCharCount);
                        int i21 = length;
                        byte directionality = Character.getDirectionality(iCodePointAt);
                        int i22 = iCharCount;
                        if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                            if (spannableStringBuilder instanceof Spanned) {
                                spanned = (Spanned) spannableStringBuilder;
                                Object[] spans = spanned.getSpans(0, spannableStringBuilder.length(), Object.class);
                                int[] iArr3 = new int[spans.length];
                                iArr = new int[spans.length];
                                Arrays.fill(iArr3, -1);
                                Arrays.fill(iArr, -1);
                                objArr = spans;
                                iArr2 = iArr3;
                            } else {
                                objArr = null;
                                iArr = null;
                                spanned = null;
                                iArr2 = null;
                            }
                            int[] iArr4 = iArr;
                            if (spannableStringBuilder.toString().contains("\r\n")) {
                                listM15174e = jc0.f45392b.m15174e(spannableStringBuilder);
                                i3 = 2;
                            } else {
                                listM15174e = jc0.f45391a.m15174e(spannableStringBuilder);
                                i3 = 1;
                            }
                            List<String> list3 = listM15174e;
                            ArrayList arrayList = new ArrayList(list3.size());
                            int i23 = 0;
                            int i24 = 0;
                            for (String str : list3) {
                                int i25 = i3;
                                int i26 = width;
                                String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
                                if (objArr != null) {
                                    spanned.getClass();
                                    iArr2.getClass();
                                    iArr4.getClass();
                                    int length2 = strUnicodeWrap.length() - str.length();
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    for (int i27 = 0; i27 < objArr.length; i27 = i5 + 1) {
                                        if (iArr2[i27] >= 0 || spanned.getSpanStart(objArr[i27]) < i23) {
                                            i5 = i27;
                                        } else {
                                            i5 = i27;
                                            if (spanned.getSpanStart(objArr[i27]) < str.length() + i23) {
                                                iArr2[i5] = i24;
                                            }
                                        }
                                        if (iArr4[i5] < 0 && spanned.getSpanEnd(objArr[i5]) - 1 >= i23 && spanned.getSpanEnd(objArr[i5]) - 1 < str.length() + i23) {
                                            iArr4[i5] = i24;
                                        }
                                    }
                                    int length3 = str.length() + i25 + i23;
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    i23 = length3;
                                }
                                arrayList.add(strUnicodeWrap);
                                width = i26;
                                i3 = i25;
                                bidiFormatter = bidiFormatter;
                            }
                            i4 = width;
                            spannableStringBuilder = new SpannableStringBuilder(jc0.f45393c.m21395b(arrayList));
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int i28 = 0;
                                while (i28 < objArr.length) {
                                    int spanStart = spanned.getSpanStart(objArr[i28]) + iArr2[i28];
                                    int spanEnd = spanned.getSpanEnd(objArr[i28]) + iArr4[i28];
                                    int spanFlags = spanned.getSpanFlags(objArr[i28]);
                                    Object[] objArr2 = objArr;
                                    if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                                        StringBuilder sbM22994q = ux5.m22994q(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                                        sbM22994q.append(spannableStringBuilder.length());
                                        ss5.m21707d0("BidiUtils", sbM22994q.toString());
                                    } else {
                                        spannableStringBuilder.setSpan(objArr2[i28], spanStart, spanEnd, spanFlags);
                                    }
                                    i28++;
                                    objArr = objArr2;
                                }
                            }
                        } else {
                            iCharCount = Character.charCount(iCodePointAt) + i22;
                            length = i21;
                        }
                    } else {
                        i4 = width;
                        paddingBottom = paddingBottom;
                        z2 = z2;
                    }
                }
            }
            an9Var.f914i = spannableStringBuilder;
            an9Var.f915j = alignment;
            an9Var.f916k = bitmap;
            an9Var.f917l = f12;
            an9Var.f918m = i20;
            an9Var.f919n = i2;
            an9Var.f920o = f;
            an9Var.f921p = i18;
            an9Var.f922q = f9;
            an9Var.f923r = f8;
            an9Var.f924s = kn0Var.f47529a;
            an9Var.f925t = kn0Var.f47530b;
            an9Var.f926u = i;
            an9Var.f928w = kn0Var.f47532d;
            an9Var.f927v = kn0Var.f47533e;
            textPaint.setTypeface(kn0Var.f47534f);
            f11 = f11;
            an9Var.f929x = f11;
            an9Var.f930y = fM14878c2;
            an9Var.f931z = f7;
            an9Var.f896A = paddingLeft;
            an9Var.f897B = paddingTop;
            width = i4;
            an9Var.f898C = width;
            i6 = paddingBottom;
            an9Var.f899D = i6;
            if (z2) {
                an9Var.f914i.getClass();
                CharSequence charSequence = an9Var.f914i;
                SpannableStringBuilder spannableStringBuilder2 = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(an9Var.f914i);
                int i29 = an9Var.f898C - an9Var.f896A;
                int i30 = an9Var.f899D - an9Var.f897B;
                textPaint.setTextSize(an9Var.f929x);
                int i31 = (int) ((an9Var.f929x * 0.125f) + 0.5f);
                int i32 = i31 * 2;
                int i33 = i29 - i32;
                float f13 = an9Var.f922q;
                if (f13 != -3.4028235E38f) {
                    i33 = (int) (i33 * f13);
                }
                int i34 = i33;
                if (i34 <= 0) {
                    ss5.m21707d0("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f11 = f11;
                } else {
                    if (an9Var.f930y > f5) {
                        i8 = 0;
                        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) an9Var.f930y), 0, spannableStringBuilder2.length(), 16711680);
                    } else {
                        i8 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
                    if (an9Var.f928w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(i8, spannableStringBuilder3.length(), ForegroundColorSpan.class);
                        int i35 = 0;
                        for (int length4 = foregroundColorSpanArr.length; i35 < length4; length4 = length4) {
                            spannableStringBuilder3.removeSpan(foregroundColorSpanArr[i35]);
                            i35++;
                        }
                    }
                    if (Color.alpha(an9Var.f925t) > 0) {
                        int i36 = an9Var.f928w;
                        if (i36 == 0 || i36 == 2) {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(an9Var.f925t), 0, spannableStringBuilder2.length(), 16711680);
                        } else {
                            spannableStringBuilder3.setSpan(new BackgroundColorSpan(an9Var.f925t), 0, spannableStringBuilder3.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = an9Var.f915j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, r1, i34, alignment3, an9Var.f909d, an9Var.f910e, true);
                    an9Var.f900E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int i37 = 0;
                    int iMax2 = 0;
                    for (int lineCount = an9Var.f900E.getLineCount(); i37 < lineCount; lineCount = lineCount) {
                        iMax2 = Math.max((int) Math.ceil(an9Var.f900E.getLineWidth(i37)), iMax2);
                        i37++;
                        height2 = height2;
                    }
                    int i38 = height2;
                    int i39 = ((an9Var.f922q == -3.4028235E38f || iMax2 >= i34) ? iMax2 : i34) + i32;
                    float f14 = an9Var.f920o;
                    if (f14 != -3.4028235E38f) {
                        int iRound2 = Math.round(i29 * f14);
                        int i40 = an9Var.f896A;
                        int i41 = iRound2 + i40;
                        int i42 = an9Var.f921p;
                        if (i42 == 1) {
                            i41 = ((i41 * 2) - i39) / 2;
                        } else if (i42 == 2) {
                            i41 -= i39;
                        }
                        iMax = Math.max(i41, i40);
                        iMin = Math.min(iMax + i39, an9Var.f898C);
                    } else {
                        iMax = an9Var.f896A + ((i29 - i39) / 2);
                        iMin = iMax + i39;
                    }
                    int i43 = iMin - iMax;
                    if (i43 <= 0) {
                        ss5.m21707d0("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f15 = an9Var.f917l;
                        if (f15 != -3.4028235E38f) {
                            if (an9Var.f918m == 0) {
                                iRound = Math.round(i30 * f15) + an9Var.f897B;
                                int i44 = an9Var.f919n;
                                if (i44 == 2) {
                                    iRound -= i38;
                                } else if (i44 == 1) {
                                    iRound = ((iRound * 2) - i38) / 2;
                                }
                                z = false;
                            } else {
                                z = false;
                                int lineBottom = an9Var.f900E.getLineBottom(0) - an9Var.f900E.getLineTop(0);
                                float f16 = an9Var.f917l;
                                iRound = f16 >= f5 ? Math.round(f16 * lineBottom) + an9Var.f897B : (Math.round((f16 + 1.0f) * lineBottom) + an9Var.f899D) - i38;
                            }
                            int i45 = iRound + i38;
                            int i46 = an9Var.f899D;
                            if (i45 > i46) {
                                iRound = i46 - i38;
                            } else {
                                int i47 = an9Var.f897B;
                                if (iRound < i47) {
                                    iRound = i47;
                                }
                            }
                        } else {
                            z = false;
                            iRound = (an9Var.f899D - i38) - ((int) (i30 * an9Var.f931z));
                        }
                        an9Var.f900E = new StaticLayout(spannableStringBuilder4, r1, i43, alignment3, an9Var.f909d, an9Var.f910e, true);
                        an9Var.f901F = new StaticLayout(spannableStringBuilder3, textPaint, i43, alignment3, an9Var.f909d, an9Var.f910e, true);
                        an9Var.f902G = iMax;
                        an9Var.f903H = iRound;
                        an9Var.f904I = i31;
                    }
                }
                z = false;
            } else {
                f11 = f11;
                z = false;
                an9Var.f916k.getClass();
                Bitmap bitmap2 = an9Var.f916k;
                int i48 = an9Var.f898C;
                int i49 = an9Var.f896A;
                int i50 = an9Var.f899D;
                int i51 = an9Var.f897B;
                float f17 = i48 - i49;
                float f18 = (an9Var.f920o * f17) + i49;
                float f19 = i50 - i51;
                float f20 = (an9Var.f917l * f19) + i51;
                int iRound3 = Math.round(f17 * an9Var.f922q);
                float f21 = an9Var.f923r;
                int iRound4 = f21 != -3.4028235E38f ? Math.round(f19 * f21) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i52 = an9Var.f921p;
                if (i52 == 2) {
                    f2 = iRound3;
                } else {
                    if (i52 == 1) {
                        f2 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f18);
                    i7 = an9Var.f919n;
                    if (i7 == 2) {
                        f3 = iRound4;
                    } else {
                        if (i7 == 1) {
                            f3 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f20);
                        an9Var.f905J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f20 -= f3;
                    int iRound7 = Math.round(f20);
                    an9Var.f905J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f18 -= f2;
                int iRound8 = Math.round(f18);
                i7 = an9Var.f919n;
                if (i7 == 2) {
                    f3 = iRound4;
                } else {
                    if (i7 == 1) {
                        f3 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f20);
                    an9Var.f905J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f20 -= f3;
                int iRound10 = Math.round(f20);
                an9Var.f905J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            canvas2 = canvas;
            an9Var.m616a(canvas2, z2);
            i11 = i17 + 1;
            cn0Var = this;
            paddingBottom = i6;
            f4 = f5;
            list = list2;
            height = i14;
            i10 = i15;
            size = i16;
            fM14878c = f11;
        }
    }
}
