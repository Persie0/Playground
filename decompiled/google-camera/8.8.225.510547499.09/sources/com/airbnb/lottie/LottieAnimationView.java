package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.HashSet;
import java.util.Set;
import p000.abx;
import p000.afe;
import p000.bgh;
import p000.bgi;
import p000.bgj;
import p000.bgk;
import p000.bgl;
import p000.bgm;
import p000.bgp;
import p000.bgv;
import p000.bgx;
import p000.bha;
import p000.bhd;
import p000.bhe;
import p000.bhf;
import p000.biw;
import p000.bko;
import p000.bme;
import p000.bzq;
import p000.kab;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: a */
    public static final bgx f6453a;

    /* JADX INFO: renamed from: b */
    public int f6454b;

    /* JADX INFO: renamed from: c */
    public final bgv f6455c;

    /* JADX INFO: renamed from: d */
    public boolean f6456d;

    /* JADX INFO: renamed from: e */
    public boolean f6457e;

    /* JADX INFO: renamed from: f */
    public final Set f6458f;

    /* JADX INFO: renamed from: g */
    public bgm f6459g;

    /* JADX INFO: renamed from: h */
    private final bgx f6460h;

    /* JADX INFO: renamed from: i */
    private final bgx f6461i;

    /* JADX INFO: renamed from: j */
    private boolean f6462j;

    /* JADX INFO: renamed from: k */
    private String f6463k;

    /* JADX INFO: renamed from: l */
    private int f6464l;

    /* JADX INFO: renamed from: m */
    private boolean f6465m;

    /* JADX INFO: renamed from: n */
    private boolean f6466n;

    /* JADX INFO: renamed from: o */
    private boolean f6467o;

    /* JADX INFO: renamed from: p */
    private boolean f6468p;

    /* JADX INFO: renamed from: q */
    private int f6469q;

    /* JADX INFO: renamed from: r */
    private bhd f6470r;

    /* JADX INFO: renamed from: s */
    private int f6471s;

    static {
        LottieAnimationView.class.getSimpleName();
        f6453a = new bgi();
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f6460h = new bgj(this, 1);
        this.f6461i = new bgj(this, 0);
        this.f6454b = 0;
        this.f6455c = new bgv();
        this.f6465m = false;
        this.f6466n = false;
        this.f6467o = false;
        this.f6456d = false;
        this.f6468p = false;
        this.f6457e = true;
        this.f6471s = 1;
        this.f6458f = new HashSet();
        this.f6469q = 0;
        m4013l(null, C0100R.attr.lottieAnimationViewStyle);
    }

    /* JADX INFO: renamed from: k */
    private final void m4012k() {
        bhd bhdVar = this.f6470r;
        if (bhdVar != null) {
            bhdVar.m2462g(this.f6460h);
            this.f6470r.m2461f(this.f6461i);
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m4013l(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bhe.f3271a, i, 0);
        this.f6457e = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(10);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(5);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(16);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(10, 0);
            if (resourceId != 0) {
                m4018d(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(5);
            if (string2 != null) {
                m4019e(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(16)) != null) {
            m4014m(this.f6457e ? bgp.m2427h(getContext(), string, "url_".concat(string)) : bgp.m2427h(getContext(), string, null));
        }
        this.f6454b = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.f6467o = true;
            this.f6468p = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(8, false)) {
            this.f6455c.m2448o(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            m4022h(typedArrayObtainStyledAttributes.getInt(13, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            m4021g(typedArrayObtainStyledAttributes.getInt(12, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.f6455c.f3206b.f3728b = typedArrayObtainStyledAttributes.getFloat(15, 1.0f);
        }
        this.f6455c.f3211g = typedArrayObtainStyledAttributes.getString(7);
        m4020f(typedArrayObtainStyledAttributes.getFloat(9, 0.0f));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        bgv bgvVar = this.f6455c;
        if (bgvVar.f3212h != z) {
            bgvVar.f3212h = z;
            if (bgvVar.f3205a != null) {
                bgvVar.m2439f();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f6455c.m2452s(new biw("**"), bha.f3233E, new bko(new bhf(abx.m171c(getContext(), typedArrayObtainStyledAttributes.getResourceId(2, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.f6455c.f3207c = typedArrayObtainStyledAttributes.getFloat(14, 1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
            bzq.m3251X();
            if (i2 >= 3) {
                i2 = 0;
            }
            m4024j(bzq.m3251X()[i2]);
        }
        this.f6455c.f3209e = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
        bgv bgvVar2 = this.f6455c;
        Context context = getContext();
        ThreadLocal threadLocal = bme.f3752a;
        bgvVar2.f3208d = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f).booleanValue();
        m4015a();
        this.f6462j = true;
    }

    /* JADX INFO: renamed from: m */
    private final void m4014m(bhd bhdVar) {
        this.f6459g = null;
        this.f6455c.m2441h();
        m4012k();
        bhdVar.m2460e(this.f6460h);
        bhdVar.m2459d(this.f6461i);
        this.f6470r = bhdVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m4016b() {
        this.f6468p = false;
        this.f6467o = false;
        this.f6466n = false;
        this.f6465m = false;
        this.f6455c.m2443j();
        m4015a();
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.f6469q++;
        super.buildDrawingCache(z);
        if (this.f6469q == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            m4024j(2);
        }
        this.f6469q--;
        bgh.m2413a();
    }

    /* JADX INFO: renamed from: c */
    public final void m4017c() {
        if (!isShown()) {
            this.f6465m = true;
        } else {
            this.f6455c.m2444k();
            m4015a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4018d(int i) {
        bhd bhdVarM2426g;
        this.f6464l = i;
        this.f6463k = null;
        if (isInEditMode()) {
            bhdVarM2426g = new bhd(new bgk(this, i), true);
        } else if (this.f6457e) {
            Context context = getContext();
            bhdVarM2426g = bgp.m2426g(context, i, bgp.m2428i(context, i));
        } else {
            bhdVarM2426g = bgp.m2426g(getContext(), i, null);
        }
        m4014m(bhdVarM2426g);
    }

    /* JADX INFO: renamed from: e */
    public final void m4019e(String str) {
        bhd bhdVarM2425f;
        this.f6463k = str;
        this.f6464l = 0;
        if (isInEditMode()) {
            bhdVarM2425f = new bhd(new kab(this, str, 1), true);
        } else {
            bhdVarM2425f = this.f6457e ? bgp.m2425f(getContext(), str, "asset_".concat(String.valueOf(str))) : bgp.m2425f(getContext(), str, null);
        }
        m4014m(bhdVarM2425f);
    }

    /* JADX INFO: renamed from: f */
    public final void m4020f(float f) {
        this.f6455c.m2447n(f);
    }

    /* JADX INFO: renamed from: g */
    public final void m4021g(int i) {
        this.f6455c.m2448o(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m4022h(int i) {
        this.f6455c.f3206b.setRepeatMode(i);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4023i() {
        return this.f6455c.m2449p();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        bgv bgvVar = this.f6455c;
        if (drawable2 == bgvVar) {
            super.invalidateDrawable(bgvVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4024j(int i) {
        this.f6471s = i;
        m4015a();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.f6468p || this.f6467o) {
            m4017c();
            this.f6468p = false;
            this.f6467o = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        if (m4023i()) {
            this.f6467o = false;
            this.f6466n = false;
            this.f6465m = false;
            this.f6455c.m2440g();
            m4015a();
            this.f6467o = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bgl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bgl bglVar = (bgl) parcelable;
        super.onRestoreInstanceState(bglVar.getSuperState());
        String str = bglVar.f3165a;
        this.f6463k = str;
        if (!TextUtils.isEmpty(str)) {
            m4019e(this.f6463k);
        }
        int i = bglVar.f3166b;
        this.f6464l = i;
        if (i != 0) {
            m4018d(i);
        }
        m4020f(bglVar.f3167c);
        if (bglVar.f3168d) {
            m4017c();
        }
        this.f6455c.f3211g = bglVar.f3169e;
        m4022h(bglVar.f3170f);
        m4021g(bglVar.f3171g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        bgl bglVar = new bgl(super.onSaveInstanceState());
        bglVar.f3165a = this.f6463k;
        bglVar.f3166b = this.f6464l;
        bglVar.f3167c = this.f6455c.m2436c();
        boolean z = true;
        if (!this.f6455c.m2449p() && (afe.m461e(this) || !this.f6467o)) {
            z = false;
        }
        bglVar.f3168d = z;
        bgv bgvVar = this.f6455c;
        bglVar.f3169e = bgvVar.f3211g;
        bglVar.f3170f = bgvVar.f3206b.getRepeatMode();
        bglVar.f3171g = this.f6455c.m2438e();
        return bglVar;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (this.f6462j) {
            if (!isShown()) {
                if (m4023i()) {
                    m4016b();
                    this.f6466n = true;
                    return;
                }
                return;
            }
            if (this.f6466n) {
                if (isShown()) {
                    this.f6455c.m2445l();
                    m4015a();
                }
            } else if (this.f6465m) {
                m4017c();
            }
            this.f6466n = false;
            this.f6465m = false;
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        m4012k();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        m4012k();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        m4012k();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        bgv bgvVar;
        if (!this.f6456d && drawable == (bgvVar = this.f6455c) && bgvVar.m2449p()) {
            m4016b();
        } else if (!this.f6456d && (drawable instanceof bgv)) {
            bgv bgvVar2 = (bgv) drawable;
            if (bgvVar2.m2449p()) {
                bgvVar2.m2443j();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* JADX INFO: renamed from: a */
    public final void m4015a() {
        int i = this.f6471s;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i3 = 1;
        switch (i2) {
            case 0:
                bgm bgmVar = this.f6459g;
                if (bgmVar == null || bgmVar.f3182k <= 4) {
                }
            case 1:
                i3 = 2;
                break;
        }
        if (i3 != getLayerType()) {
            setLayerType(i3, null);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6460h = new bgj(this, 1);
        this.f6461i = new bgj(this, 0);
        this.f6454b = 0;
        this.f6455c = new bgv();
        this.f6465m = false;
        this.f6466n = false;
        this.f6467o = false;
        this.f6456d = false;
        this.f6468p = false;
        this.f6457e = true;
        this.f6471s = 1;
        this.f6458f = new HashSet();
        this.f6469q = 0;
        m4013l(attributeSet, C0100R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6460h = new bgj(this, 1);
        this.f6461i = new bgj(this, 0);
        this.f6454b = 0;
        this.f6455c = new bgv();
        this.f6465m = false;
        this.f6466n = false;
        this.f6467o = false;
        this.f6456d = false;
        this.f6468p = false;
        this.f6457e = true;
        this.f6471s = 1;
        this.f6458f = new HashSet();
        this.f6469q = 0;
        m4013l(attributeSet, i);
    }
}
