package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.RemoteCreator;
import com.linguist.R;
import p092eb.C5387a;
import p176ib.C6264e0;
import p176ib.C6272i;
import p176ib.C6278l;
import p262mb.C7529b;
import p329q2.C8488a;

/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public int f13863a;

    /* JADX INFO: renamed from: b */
    public int f13864b;

    /* JADX INFO: renamed from: c */
    public View f13865c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f13866d;

    public SignInButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f13866d = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C5387a.f33807a, 0, 0);
        try {
            this.f13863a = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.f13864b = typedArrayObtainStyledAttributes.getInt(1, 2);
            typedArrayObtainStyledAttributes.recycle();
            m7532a(this.f13863a, this.f13864b);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7532a(int i10, int i11) {
        this.f13863a = i10;
        this.f13864b = i11;
        Context context = getContext();
        View view = this.f13865c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f13865c = C6264e0.m12898c(this.f13863a, context, this.f13864b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i12 = this.f13863a;
            int i13 = this.f13864b;
            C6278l c6278l = new C6278l(context);
            Resources resources = context.getResources();
            c6278l.setTypeface(Typeface.DEFAULT_BOLD);
            c6278l.setTextSize(14.0f);
            int i14 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            c6278l.setMinHeight(i14);
            c6278l.setMinWidth(i14);
            int iM12922a = C6278l.m12922a(i13, R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_icon_light);
            int iM12922a2 = C6278l.m12922a(i13, R.drawable.common_google_signin_btn_text_dark, R.drawable.common_google_signin_btn_text_light, R.drawable.common_google_signin_btn_text_light);
            if (i12 == 0 || i12 == 1) {
                iM12922a = iM12922a2;
            } else if (i12 != 2) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown button size: ");
                sb2.append(i12);
                throw new IllegalStateException(sb2.toString());
            }
            Drawable drawable = resources.getDrawable(iM12922a);
            C8488a.b.m16570h(drawable, resources.getColorStateList(R.color.common_google_signin_btn_tint));
            C8488a.b.m16571i(drawable, PorterDuff.Mode.SRC_ATOP);
            c6278l.setBackgroundDrawable(drawable);
            ColorStateList colorStateList = resources.getColorStateList(C6278l.m12922a(i13, R.color.common_google_signin_btn_text_dark, R.color.common_google_signin_btn_text_light, R.color.common_google_signin_btn_text_light));
            C6272i.m12915i(colorStateList);
            c6278l.setTextColor(colorStateList);
            if (i12 == 0) {
                c6278l.setText(resources.getString(R.string.common_signin_button_text));
            } else if (i12 == 1) {
                c6278l.setText(resources.getString(R.string.common_signin_button_text_long));
            } else {
                if (i12 != 2) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Unknown button size: ");
                    sb3.append(i12);
                    throw new IllegalStateException(sb3.toString());
                }
                c6278l.setText((CharSequence) null);
            }
            c6278l.setTransformationMethod(null);
            if (C7529b.m15040a(c6278l.getContext())) {
                c6278l.setGravity(19);
            }
            this.f13865c = c6278l;
        }
        addView(this.f13865c);
        this.f13865c.setEnabled(isEnabled());
        this.f13865c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f13866d;
        if (onClickListener == null || view != this.f13865c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i10) {
        m7532a(this.f13863a, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f13865c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13866d = onClickListener;
        View view = this.f13865c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        m7532a(this.f13863a, this.f13864b);
    }

    public void setSize(int i10) {
        m7532a(i10, this.f13864b);
    }
}
