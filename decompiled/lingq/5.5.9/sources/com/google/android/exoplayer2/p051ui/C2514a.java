package com.google.android.exoplayer2.p051ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p219ka.C6640a;
import p479xa.C10134c0;
import p479xa.C10145n;
import va.C9688b;
import va.C9702p;
import va.C9704r;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2514a extends View implements SubtitleView.InterfaceC2511a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f13511a;

    /* JADX INFO: renamed from: b */
    public List<C6640a> f13512b;

    /* JADX INFO: renamed from: c */
    public int f13513c;

    /* JADX INFO: renamed from: d */
    public float f13514d;

    /* JADX INFO: renamed from: e */
    public C9688b f13515e;

    /* JADX INFO: renamed from: f */
    public float f13516f;

    public C2514a(Context context) {
        super(context, null);
        this.f13511a = new ArrayList();
        this.f13512b = Collections.emptyList();
        this.f13513c = 0;
        this.f13514d = 0.0533f;
        this.f13515e = C9688b.f49604g;
        this.f13516f = 0.08f;
    }

    @Override // com.google.android.exoplayer2.p051ui.SubtitleView.InterfaceC2511a
    /* JADX INFO: renamed from: a */
    public final void mo7418a(List<C6640a> list, C9688b c9688b, float f3, int i10, float f10) {
        this.f13512b = list;
        this.f13515e = c9688b;
        this.f13514d = f3;
        this.f13513c = i10;
        this.f13516f = f10;
        while (true) {
            ArrayList arrayList = this.f13511a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C9702p(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:200:0x050a  */
    /* JADX WARN: Code duplicated, block: B:201:0x050c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0510  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        float f3;
        int i14;
        float f10;
        boolean z11;
        int i15;
        int iMax;
        int iMin;
        int iRound;
        int i16;
        Canvas canvas2;
        float f11;
        int i17;
        List<C6640a> list = this.f13512b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i18 = paddingBottom - paddingTop;
        float fM18215b = C9704r.m18215b(this.f13514d, this.f13513c, height, i18);
        if (fM18215b <= 0.0f) {
            return;
        }
        int size = list.size();
        int i19 = 0;
        while (i19 < size) {
            C6640a c6640a = list.get(i19);
            if (c6640a.f37657K != Integer.MIN_VALUE) {
                CharSequence charSequence = c6640a.f37659a;
                Bitmap bitmap = c6640a.f37662d;
                Layout.Alignment alignment = c6640a.f37661c;
                int i20 = c6640a.f37655I;
                float f12 = c6640a.f37656J;
                float f13 = c6640a.f37668j;
                float f14 = c6640a.f37669k;
                boolean z12 = c6640a.f37670l;
                int i21 = c6640a.f37654H;
                int i22 = c6640a.f37657K;
                float f15 = c6640a.f37658L;
                int i23 = c6640a.f37664f;
                float f16 = c6640a.f37663e;
                if (i23 == 0) {
                    f11 = 1.0f - f16;
                    i17 = 0;
                } else {
                    f11 = (-f16) - 1.0f;
                    i17 = 1;
                }
                int i24 = c6640a.f37665g;
                c6640a = new C6640a(charSequence, null, alignment, bitmap, f11, i17, i24 != 0 ? i24 != 2 ? i24 : 0 : 2, -3.4028235E38f, Integer.MIN_VALUE, i20, f12, f13, f14, z12, i21, i22, f15);
            }
            float fM18215b2 = C9704r.m18215b(c6640a.f37656J, c6640a.f37655I, height, i18);
            int i25 = i19;
            C9702p c9702p = (C9702p) this.f13511a.get(i25);
            C9688b c9688b = this.f13515e;
            float f17 = this.f13516f;
            c9702p.getClass();
            Bitmap bitmap2 = c6640a.f37662d;
            boolean z13 = bitmap2 == null;
            CharSequence charSequence2 = c6640a.f37659a;
            if (z13) {
                if (TextUtils.isEmpty(charSequence2)) {
                    canvas2 = canvas;
                    i11 = height;
                    i12 = i18;
                    i13 = i25;
                } else {
                    i10 = c6640a.f37670l ? c6640a.f37654H : c9688b.f49607c;
                }
                canvas = canvas2;
                i19 = i13 + 1;
                height = i11;
                i18 = i12;
                list = list;
                size = size;
                paddingBottom = paddingBottom;
                width = width;
                paddingTop = paddingTop;
                paddingLeft = paddingLeft;
                fM18215b = fM18215b;
            } else {
                i10 = -16777216;
            }
            CharSequence charSequence3 = c9702p.f49696i;
            boolean z14 = charSequence3 == charSequence2 || (charSequence3 != null && charSequence3.equals(charSequence2));
            TextPaint textPaint = c9702p.f49693f;
            float f18 = c6640a.f37669k;
            float f19 = c6640a.f37668j;
            i11 = height;
            int i26 = c6640a.f37667i;
            i12 = i18;
            float f20 = c6640a.f37666h;
            i13 = i25;
            int i27 = c6640a.f37665g;
            int i28 = c6640a.f37664f;
            boolean z15 = z13;
            float f21 = c6640a.f37663e;
            Layout.Alignment alignment2 = c6640a.f37660b;
            if (z14 && C10134c0.m19034a(c9702p.f49697j, alignment2) && c9702p.f49698k == bitmap2 && c9702p.f49699l == f21 && c9702p.f49700m == i28) {
                if (C10134c0.m19034a(Integer.valueOf(c9702p.f49701n), Integer.valueOf(i27)) && c9702p.f49702o == f20 && C10134c0.m19034a(Integer.valueOf(c9702p.f49703p), Integer.valueOf(i26)) && c9702p.f49704q == f19 && c9702p.f49705r == f18 && c9702p.f49706s == c9688b.f49605a && c9702p.f49707t == c9688b.f49606b && c9702p.f49708u == i10 && c9702p.f49710w == c9688b.f49608d && c9702p.f49709v == c9688b.f49609e && C10134c0.m19034a(textPaint.getTypeface(), c9688b.f49610f) && c9702p.f49711x == fM18215b && c9702p.f49712y == fM18215b2 && c9702p.f49713z == f17) {
                    int i29 = paddingLeft;
                    if (c9702p.f49678A == i29) {
                        paddingLeft = i29;
                        int i30 = paddingTop;
                        if (c9702p.f49679B == i30) {
                            paddingTop = i30;
                            int i31 = width;
                            if (c9702p.f49680C == i31) {
                                width = i31;
                                int i32 = paddingBottom;
                                if (c9702p.f49681D == i32) {
                                    canvas2 = canvas;
                                    paddingBottom = i32;
                                    c9702p.m18213a(canvas2, z15);
                                    canvas = canvas2;
                                    i19 = i13 + 1;
                                    height = i11;
                                    i18 = i12;
                                    list = list;
                                    size = size;
                                    paddingBottom = paddingBottom;
                                    width = width;
                                    paddingTop = paddingTop;
                                    paddingLeft = paddingLeft;
                                    fM18215b = fM18215b;
                                } else {
                                    paddingBottom = i32;
                                }
                            } else {
                                width = i31;
                            }
                        } else {
                            paddingTop = i30;
                        }
                    } else {
                        paddingLeft = i29;
                    }
                }
            }
            c9702p.f49696i = charSequence2;
            c9702p.f49697j = alignment2;
            c9702p.f49698k = bitmap2;
            c9702p.f49699l = f21;
            c9702p.f49700m = i28;
            c9702p.f49701n = i27;
            c9702p.f49702o = f20;
            c9702p.f49703p = i26;
            c9702p.f49704q = f19;
            c9702p.f49705r = f18;
            c9702p.f49706s = c9688b.f49605a;
            c9702p.f49707t = c9688b.f49606b;
            c9702p.f49708u = i10;
            c9702p.f49710w = c9688b.f49608d;
            c9702p.f49709v = c9688b.f49609e;
            textPaint.setTypeface(c9688b.f49610f);
            fM18215b = fM18215b;
            c9702p.f49711x = fM18215b;
            c9702p.f49712y = fM18215b2;
            c9702p.f49713z = f17;
            int i33 = paddingLeft;
            c9702p.f49678A = i33;
            paddingTop = paddingTop;
            c9702p.f49679B = paddingTop;
            int i34 = width;
            c9702p.f49680C = i34;
            paddingBottom = paddingBottom;
            c9702p.f49681D = paddingBottom;
            if (z15 != 0) {
                c9702p.f49696i.getClass();
                CharSequence charSequence4 = c9702p.f49696i;
                SpannableStringBuilder spannableStringBuilder = charSequence4 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence4 : new SpannableStringBuilder(c9702p.f49696i);
                int i35 = c9702p.f49680C - c9702p.f49678A;
                int i36 = c9702p.f49681D - c9702p.f49679B;
                textPaint.setTextSize(c9702p.f49711x);
                int i37 = (int) ((c9702p.f49711x * 0.125f) + 0.5f);
                int i38 = i37 * 2;
                int i39 = i35 - i38;
                float f22 = c9702p.f49704q;
                if (f22 != -3.4028235E38f) {
                    i39 = (int) (i39 * f22);
                }
                if (i39 <= 0) {
                    C10145n.m19099g("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    paddingLeft = i33;
                    fM18215b = fM18215b;
                    paddingTop = paddingTop;
                    paddingBottom = paddingBottom;
                    width = i34;
                    z11 = z15;
                } else {
                    paddingLeft = i33;
                    if (c9702p.f49712y > 0.0f) {
                        i15 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c9702p.f49712y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i15 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (c9702p.f49710w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i15, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i40 = 0;
                        for (int length = foregroundColorSpanArr.length; i40 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i40]);
                            i40++;
                        }
                    }
                    if (Color.alpha(c9702p.f49707t) > 0) {
                        int i41 = c9702p.f49710w;
                        if (i41 == 0 || i41 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(c9702p.f49707t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(c9702p.f49707t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment3 = c9702p.f49697j;
                    if (alignment3 == null) {
                        alignment3 = Layout.Alignment.ALIGN_CENTER;
                    }
                    width = i34;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i39, alignment3, c9702p.f49691d, c9702p.f49692e, true);
                    c9702p.f49682E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = c9702p.f49682E.getLineCount();
                    int i42 = 0;
                    int iMax2 = 0;
                    while (i42 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(c9702p.f49682E.getLineWidth(i42)), iMax2);
                        i42++;
                        lineCount = lineCount;
                        z15 = z15;
                        i37 = i37;
                    }
                    int i43 = i37;
                    z10 = z15;
                    if (c9702p.f49704q == -3.4028235E38f || iMax2 >= i39) {
                        i39 = iMax2;
                    }
                    int i44 = i39 + i38;
                    float f23 = c9702p.f49702o;
                    if (f23 != -3.4028235E38f) {
                        int iRound2 = Math.round(i35 * f23);
                        int i45 = c9702p.f49678A;
                        int i46 = iRound2 + i45;
                        int i47 = c9702p.f49703p;
                        if (i47 == 1) {
                            i46 = ((i46 * 2) - i44) / 2;
                        } else if (i47 == 2) {
                            i46 -= i44;
                        }
                        iMax = Math.max(i46, i45);
                        iMin = Math.min(i44 + iMax, c9702p.f49680C);
                    } else {
                        iMax = c9702p.f49678A + ((i35 - i44) / 2);
                        iMin = iMax + i44;
                    }
                    int i48 = iMin - iMax;
                    if (i48 <= 0) {
                        C10145n.m19099g("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                        z11 = z10;
                    } else {
                        float f24 = c9702p.f49699l;
                        if (f24 != -3.4028235E38f) {
                            if (c9702p.f49700m == 0) {
                                iRound = Math.round(i36 * f24) + c9702p.f49679B;
                                int i49 = c9702p.f49701n;
                                if (i49 == 2) {
                                    iRound -= height2;
                                } else if (i49 == 1) {
                                    iRound = ((iRound * 2) - height2) / 2;
                                }
                            } else {
                                int lineBottom = c9702p.f49682E.getLineBottom(0) - c9702p.f49682E.getLineTop(0);
                                float f25 = c9702p.f49699l;
                                if (f25 >= 0.0f) {
                                    iRound = Math.round(f25 * lineBottom) + c9702p.f49679B;
                                } else {
                                    iRound = Math.round((f25 + 1.0f) * lineBottom) + c9702p.f49681D;
                                    iRound -= height2;
                                }
                            }
                            int i50 = iRound + height2;
                            int i51 = c9702p.f49681D;
                            if (i50 > i51) {
                                iRound = i51 - height2;
                            } else {
                                i16 = c9702p.f49679B;
                                if (iRound >= i16) {
                                }
                                Layout.Alignment alignment4 = alignment3;
                                c9702p.f49682E = new StaticLayout(spannableStringBuilder, textPaint, i48, alignment4, c9702p.f49691d, c9702p.f49692e, true);
                                c9702p.f49683F = new StaticLayout(spannableStringBuilder2, textPaint, i48, alignment4, c9702p.f49691d, c9702p.f49692e, true);
                                c9702p.f49684G = iMax;
                                c9702p.f49685H = i16;
                                c9702p.f49686I = i43;
                            }
                        } else {
                            iRound = (c9702p.f49681D - height2) - ((int) (i36 * c9702p.f49713z));
                        }
                        i16 = iRound;
                        Layout.Alignment alignment5 = alignment3;
                        c9702p.f49682E = new StaticLayout(spannableStringBuilder, textPaint, i48, alignment5, c9702p.f49691d, c9702p.f49692e, true);
                        c9702p.f49683F = new StaticLayout(spannableStringBuilder2, textPaint, i48, alignment5, c9702p.f49691d, c9702p.f49692e, true);
                        c9702p.f49684G = iMax;
                        c9702p.f49685H = i16;
                        c9702p.f49686I = i43;
                    }
                }
                c9702p.m18213a(canvas, z11);
                i19 = i13 + 1;
                height = i11;
                i18 = i12;
                list = list;
                size = size;
                paddingBottom = paddingBottom;
                width = width;
                paddingTop = paddingTop;
                paddingLeft = paddingLeft;
                fM18215b = fM18215b;
            } else {
                paddingLeft = i33;
                fM18215b = fM18215b;
                paddingTop = paddingTop;
                paddingBottom = paddingBottom;
                width = i34;
                z10 = z15;
                c9702p.f49698k.getClass();
                Bitmap bitmap3 = c9702p.f49698k;
                int i52 = c9702p.f49680C;
                int i53 = c9702p.f49678A;
                int i54 = c9702p.f49681D;
                int i55 = c9702p.f49679B;
                float f26 = i52 - i53;
                float f27 = (c9702p.f49702o * f26) + i53;
                float f28 = i54 - i55;
                float f29 = (c9702p.f49699l * f28) + i55;
                int iRound3 = Math.round(f26 * c9702p.f49704q);
                float f30 = c9702p.f49705r;
                int iRound4 = f30 != -3.4028235E38f ? Math.round(f28 * f30) : Math.round((bitmap3.getHeight() / bitmap3.getWidth()) * iRound3);
                int i56 = c9702p.f49703p;
                if (i56 == 2) {
                    f3 = iRound3;
                } else {
                    if (i56 == 1) {
                        f3 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f27);
                    i14 = c9702p.f49701n;
                    if (i14 == 2) {
                        f10 = iRound4;
                    } else {
                        if (i14 == 1) {
                            f10 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f29);
                        c9702p.f49687J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f29 -= f10;
                    int iRound7 = Math.round(f29);
                    c9702p.f49687J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f27 -= f3;
                int iRound8 = Math.round(f27);
                i14 = c9702p.f49701n;
                if (i14 == 2) {
                    f10 = iRound4;
                } else {
                    if (i14 == 1) {
                        f10 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f29);
                    c9702p.f49687J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f29 -= f10;
                int iRound10 = Math.round(f29);
                c9702p.f49687J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            z11 = z10;
            c9702p.m18213a(canvas, z11);
            i19 = i13 + 1;
            height = i11;
            i18 = i12;
            list = list;
            size = size;
            paddingBottom = paddingBottom;
            width = width;
            paddingTop = paddingTop;
            paddingLeft = paddingLeft;
            fM18215b = fM18215b;
        }
    }
}
