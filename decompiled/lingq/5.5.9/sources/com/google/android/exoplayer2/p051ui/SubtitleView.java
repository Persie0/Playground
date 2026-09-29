package com.google.android.exoplayer2.p051ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p219ka.C6640a;
import p294oa.InterfaceC8028b;
import p479xa.C10134c0;
import va.C9688b;
import va.C9704r;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List<C6640a> f13486a;

    /* JADX INFO: renamed from: b */
    public C9688b f13487b;

    /* JADX INFO: renamed from: c */
    public int f13488c;

    /* JADX INFO: renamed from: d */
    public float f13489d;

    /* JADX INFO: renamed from: e */
    public float f13490e;

    /* JADX INFO: renamed from: f */
    public boolean f13491f;

    /* JADX INFO: renamed from: g */
    public boolean f13492g;

    /* JADX INFO: renamed from: h */
    public int f13493h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2511a f13494i;

    /* JADX INFO: renamed from: j */
    public View f13495j;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    public interface InterfaceC2511a {
        /* JADX INFO: renamed from: a */
        void mo7418a(List<C6640a> list, C9688b c9688b, float f3, int i10, float f10);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13486a = Collections.emptyList();
        this.f13487b = C9688b.f49604g;
        this.f13488c = 0;
        this.f13489d = 0.0533f;
        this.f13490e = 0.08f;
        this.f13491f = true;
        this.f13492g = true;
        C2514a c2514a = new C2514a(context);
        this.f13494i = c2514a;
        this.f13495j = c2514a;
        addView(c2514a);
        this.f13493h = 1;
    }

    private List<C6640a> getCuesWithStylingPreferencesApplied() {
        if (this.f13491f && this.f13492g) {
            return this.f13486a;
        }
        ArrayList arrayList = new ArrayList(this.f13486a.size());
        for (int i10 = 0; i10 < this.f13486a.size(); i10++) {
            C6640a c6640a = this.f13486a.get(i10);
            c6640a.getClass();
            C6640a.a aVar = new C6640a.a(c6640a);
            if (!this.f13491f) {
                aVar.f37684n = false;
                CharSequence charSequence = aVar.f37671a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVar.f37671a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = aVar.f37671a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC8028b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                C9704r.m18214a(aVar);
            } else if (!this.f13492g) {
                C9704r.m18214a(aVar);
            }
            arrayList.add(aVar.m13277a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (C10134c0.f51354a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C9688b getUserCaptionStyle() {
        CaptioningManager captioningManager;
        C9688b c9688b;
        int i10 = C10134c0.f51354a;
        C9688b c9688b2 = C9688b.f49604g;
        if (i10 < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c9688b2;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i10 >= 21) {
            c9688b = new C9688b(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        } else {
            c9688b = new C9688b(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return c9688b;
    }

    private <T extends View & InterfaceC2511a> void setView(T t10) {
        removeView(this.f13495j);
        View view = this.f13495j;
        if (view instanceof C2519f) {
            ((C2519f) view).f13667b.destroy();
        }
        this.f13495j = t10;
        this.f13494i = t10;
        addView(t10);
    }

    /* JADX INFO: renamed from: a */
    public final void m7415a() {
        setStyle(getUserCaptionStyle());
    }

    /* JADX INFO: renamed from: b */
    public final void m7416b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* JADX INFO: renamed from: c */
    public final void m7417c() {
        this.f13494i.mo7418a(getCuesWithStylingPreferencesApplied(), this.f13487b, this.f13489d, this.f13488c, this.f13490e);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f13492g = z10;
        m7417c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f13491f = z10;
        m7417c();
    }

    public void setBottomPaddingFraction(float f3) {
        this.f13490e = f3;
        m7417c();
    }

    public void setCues(List<C6640a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f13486a = list;
        m7417c();
    }

    public void setFractionalTextSize(float f3) {
        this.f13488c = 0;
        this.f13489d = f3;
        m7417c();
    }

    public void setStyle(C9688b c9688b) {
        this.f13487b = c9688b;
        m7417c();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setViewType(int i10) {
        if (this.f13493h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new C2514a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C2519f(getContext()));
        }
        this.f13493h = i10;
    }
}
