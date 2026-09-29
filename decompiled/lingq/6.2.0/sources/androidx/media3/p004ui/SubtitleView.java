package androidx.media3.p004ui;

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
import p000.bs1;
import p000.cn0;
import p000.cs1;
import p000.en9;
import p000.ij6;
import p000.k5d;
import p000.kn0;
import p000.q3b;
import p000.xl4;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List f6519a;

    /* JADX INFO: renamed from: b */
    public kn0 f6520b;

    /* JADX INFO: renamed from: c */
    public float f6521c;

    /* JADX INFO: renamed from: d */
    public float f6522d;

    /* JADX INFO: renamed from: e */
    public boolean f6523e;

    /* JADX INFO: renamed from: f */
    public boolean f6524f;

    /* JADX INFO: renamed from: g */
    public int f6525g;

    /* JADX INFO: renamed from: h */
    public en9 f6526h;

    /* JADX INFO: renamed from: i */
    public View f6527i;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6519a = Collections.EMPTY_LIST;
        this.f6520b = kn0.f47528g;
        this.f6521c = 0.0533f;
        this.f6522d = 0.08f;
        this.f6523e = true;
        this.f6524f = true;
        cn0 cn0Var = new cn0(context, 0);
        this.f6526h = cn0Var;
        this.f6527i = cn0Var;
        addView(cn0Var);
        this.f6525g = 1;
    }

    private List<cs1> getCuesWithStylingPreferencesApplied() {
        if (this.f6523e && this.f6524f) {
            return this.f6519a;
        }
        ArrayList arrayList = new ArrayList(this.f6519a.size());
        for (int i = 0; i < this.f6519a.size(); i++) {
            bs1 bs1VarM9869a = ((cs1) this.f6519a.get(i)).m9869a();
            if (!this.f6523e) {
                bs1VarM9869a.f8926n = false;
                CharSequence charSequence = bs1VarM9869a.f8913a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        bs1VarM9869a.f8913a = SpannableString.valueOf(charSequence);
                        bs1VarM9869a.f8914b = null;
                    }
                    CharSequence charSequence2 = bs1VarM9869a.f8913a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof xl4)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                k5d.m14877b(bs1VarM9869a);
            } else if (!this.f6524f) {
                k5d.m14877b(bs1VarM9869a);
            }
            arrayList.add(bs1VarM9869a.m4153a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private kn0 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        kn0 kn0Var = kn0.f47528g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return kn0Var;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new kn0(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & en9> void setView(T t) {
        removeView(this.f6527i);
        View view = this.f6527i;
        if (view instanceof q3b) {
            ((q3b) view).f57212b.destroy();
        }
        this.f6527i = t;
        this.f6526h = t;
        addView(t);
    }

    /* JADX INFO: renamed from: a */
    public final void m2570a() {
        this.f6526h.mo4881a(getCuesWithStylingPreferencesApplied(), this.f6520b, this.f6521c, this.f6522d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f6524f = z;
        m2570a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f6523e = z;
        m2570a();
    }

    public void setBottomPaddingFraction(float f) {
        this.f6522d = f;
        m2570a();
    }

    public void setCues(List<cs1> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f6519a = list;
        m2570a();
    }

    public void setFractionalTextSize(float f) {
        this.f6521c = f;
        m2570a();
    }

    public void setStyle(kn0 kn0Var) {
        this.f6520b = kn0Var;
        m2570a();
    }

    public void setViewType(int i) {
        if (this.f6525g == i) {
            return;
        }
        if (i == 1) {
            setView(new cn0(getContext(), 0));
        } else {
            if (i != 2) {
                ij6.m13959q();
                return;
            }
            setView(new q3b(getContext()));
        }
        this.f6525g = i;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
