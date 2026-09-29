package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.RunnableC3781y2;
import p000.bm5;
import p000.c9b;
import p000.ca1;
import p000.cz3;
import p000.d77;
import p000.dm5;
import p000.do7;
import p000.e13;
import p000.el5;
import p000.f06;
import p000.fl5;
import p000.gl5;
import p000.gv5;
import p000.il5;
import p000.ll5;
import p000.m79;
import p000.mi4;
import p000.nz3;
import p000.p33;
import p000.ra3;
import p000.rl5;
import p000.tt9;
import p000.wk4;
import p000.wq1;
import p000.xl5;
import p000.yl5;
import p000.zl5;

/* JADX INFO: loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: L */
    public static final el5 f10578L = new el5();

    /* JADX INFO: renamed from: H */
    public boolean f10579H;

    /* JADX INFO: renamed from: I */
    public final HashSet f10580I;

    /* JADX INFO: renamed from: J */
    public final HashSet f10581J;

    /* JADX INFO: renamed from: K */
    public bm5 f10582K;

    /* JADX INFO: renamed from: d */
    public final fl5 f10583d;

    /* JADX INFO: renamed from: e */
    public final fl5 f10584e;

    /* JADX INFO: renamed from: f */
    public xl5 f10585f;

    /* JADX INFO: renamed from: g */
    public int f10586g;

    /* JADX INFO: renamed from: h */
    public final C0868b f10587h;

    /* JADX INFO: renamed from: i */
    public String f10588i;

    /* JADX INFO: renamed from: j */
    public int f10589j;

    /* JADX INFO: renamed from: k */
    public boolean f10590k;

    /* JADX INFO: renamed from: l */
    public boolean f10591l;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0867a();

        /* JADX INFO: renamed from: a */
        public String f10592a;

        /* JADX INFO: renamed from: b */
        public int f10593b;

        /* JADX INFO: renamed from: c */
        public float f10594c;

        /* JADX INFO: renamed from: d */
        public boolean f10595d;

        /* JADX INFO: renamed from: e */
        public String f10596e;

        /* JADX INFO: renamed from: f */
        public int f10597f;

        /* JADX INFO: renamed from: g */
        public int f10598g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f10592a);
            parcel.writeFloat(this.f10594c);
            parcel.writeInt(this.f10595d ? 1 : 0);
            parcel.writeString(this.f10596e);
            parcel.writeInt(this.f10597f);
            parcel.writeInt(this.f10598g);
        }
    }

    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f10583d = new fl5(this, 1);
        this.f10584e = new fl5(this, 0);
        this.f10586g = 0;
        this.f10587h = new C0868b();
        this.f10590k = false;
        this.f10591l = false;
        this.f10579H = true;
        this.f10580I = new HashSet();
        this.f10581J = new HashSet();
        m4984d(null, R$attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(bm5 bm5Var) {
        zl5 zl5Var = bm5Var.f8689d;
        C0868b c0868b = this.f10587h;
        if (zl5Var != null && c0868b == getDrawable() && c0868b.f10620a == zl5Var.f71701a) {
            return;
        }
        this.f10580I.add(UserActionTaken.SET_ANIMATION);
        this.f10587h.m5000d();
        m4983c();
        bm5Var.m3874b(this.f10583d);
        bm5Var.m3873a(this.f10584e);
        this.f10582K = bm5Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m4983c() {
        bm5 bm5Var = this.f10582K;
        if (bm5Var != null) {
            fl5 fl5Var = this.f10583d;
            synchronized (bm5Var) {
                bm5Var.f8686a.remove(fl5Var);
            }
            bm5 bm5Var2 = this.f10582K;
            fl5 fl5Var2 = this.f10584e;
            synchronized (bm5Var2) {
                bm5Var2.f8687b.remove(fl5Var2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4984d(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView, i, 0);
        this.f10579H = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            C3386nv.m17626m("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            return;
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.f10591l = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false);
        C0868b c0868b = this.f10587h;
        if (z) {
            c0868b.f10622b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_progress);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_progress, 0.0f);
        if (zHasValue4) {
            this.f10580I.add(UserActionTaken.SET_PROGRESS);
        }
        c0868b.m4993G(f);
        c0868b.m5004i(LottieFeatureFlag.MergePathsApi19, typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_applyOpacityToLayers, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_applyShadowToLayers, true));
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_colorFilter)) {
            c0868b.m4997a(new mi4("**"), yl5.f69999I, new p33(new m79(do7.m10540p(getContext(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_renderMode)) {
            int i2 = R$styleable.LottieAnimationView_lottie_renderMode;
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i2, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_asyncUpdates)) {
            int i3 = R$styleable.LottieAnimationView_lottie_asyncUpdates;
            AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i3, asyncUpdates.ordinal());
            if (iOrdinal2 >= RenderMode.values().length) {
                iOrdinal2 = asyncUpdates.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public AsyncUpdates getAsyncUpdates() {
        AsyncUpdates asyncUpdates = this.f10587h.f10635h0;
        return asyncUpdates != null ? asyncUpdates : wk4.f66962a;
    }

    public boolean getAsyncUpdatesEnabled() {
        AsyncUpdates asyncUpdates = this.f10587h.f10635h0;
        if (asyncUpdates == null) {
            asyncUpdates = wk4.f66962a;
        }
        return asyncUpdates == AsyncUpdates.ENABLED;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f10587h.f10610Q;
    }

    public boolean getClipToCompositionBounds() {
        return this.f10587h.f10603J;
    }

    public gl5 getComposition() {
        Drawable drawable = getDrawable();
        C0868b c0868b = this.f10587h;
        if (drawable == c0868b) {
            return c0868b.f10620a;
        }
        return null;
    }

    public long getDuration() {
        gl5 composition = getComposition();
        if (composition != null) {
            return (long) composition.m12729c();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f10587h.f10622b.f35833h;
    }

    public String getImageAssetsFolder() {
        return this.f10587h.f10636i;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f10587h.f10602I;
    }

    public float getMaxFrame() {
        return this.f10587h.f10622b.m10474b();
    }

    public float getMinFrame() {
        return this.f10587h.f10622b.m10475c();
    }

    public d77 getPerformanceTracker() {
        gl5 gl5Var = this.f10587h.f10620a;
        if (gl5Var != null) {
            return gl5Var.f40957a;
        }
        return null;
    }

    public float getProgress() {
        return this.f10587h.f10622b.m10473a();
    }

    public RenderMode getRenderMode() {
        return this.f10587h.f10612S ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f10587h.f10622b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f10587h.f10622b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f10587h.f10622b.f35829d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C0868b) {
            if ((((C0868b) drawable).f10612S ? RenderMode.SOFTWARE : RenderMode.HARDWARE) == RenderMode.SOFTWARE) {
                this.f10587h.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C0868b c0868b = this.f10587h;
        if (drawable2 == c0868b) {
            super.invalidateDrawable(c0868b);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f10591l) {
            return;
        }
        this.f10587h.m5009o();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f10588i = savedState.f10592a;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        HashSet hashSet = this.f10580I;
        if (!hashSet.contains(userActionTaken) && !TextUtils.isEmpty(this.f10588i)) {
            setAnimation(this.f10588i);
        }
        this.f10589j = savedState.f10593b;
        if (!hashSet.contains(userActionTaken) && (i = this.f10589j) != 0) {
            setAnimation(i);
        }
        boolean zContains = hashSet.contains(UserActionTaken.SET_PROGRESS);
        C0868b c0868b = this.f10587h;
        if (!zContains) {
            c0868b.m4993G(savedState.f10594c);
        }
        UserActionTaken userActionTaken2 = UserActionTaken.PLAY_OPTION;
        if (!hashSet.contains(userActionTaken2) && savedState.f10595d) {
            hashSet.add(userActionTaken2);
            c0868b.m5009o();
        }
        if (!hashSet.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f10596e);
        }
        if (!hashSet.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f10597f);
        }
        if (hashSet.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f10598g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10592a = this.f10588i;
        savedState.f10593b = this.f10589j;
        C0868b c0868b = this.f10587h;
        dm5 dm5Var = c0868b.f10622b;
        dm5 dm5Var2 = c0868b.f10622b;
        savedState.f10594c = dm5Var.m10473a();
        if (c0868b.isVisible()) {
            z = dm5Var2.f35824H;
        } else {
            LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction = c0868b.f10630f;
            z = lottieDrawable$OnVisibleAction == LottieDrawable$OnVisibleAction.PLAY || lottieDrawable$OnVisibleAction == LottieDrawable$OnVisibleAction.RESUME;
        }
        savedState.f10595d = z;
        savedState.f10596e = c0868b.f10636i;
        savedState.f10597f = dm5Var2.getRepeatMode();
        savedState.f10598g = dm5Var2.getRepeatCount();
        return savedState;
    }

    public void setAnimation(String str) {
        bm5 bm5VarM16348a;
        this.f10588i = str;
        this.f10589j = 0;
        int i = 1;
        if (isInEditMode()) {
            bm5VarM16348a = new bm5(new e13(i, this, str), true);
        } else {
            String str2 = null;
            if (this.f10579H) {
                Context context = getContext();
                HashMap map = ll5.f49797a;
                String strM17734i = AbstractC3393o1.m17734i("asset_", str);
                bm5VarM16348a = ll5.m16348a(strM17734i, new il5(i, context.getApplicationContext(), str, strM17734i), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = ll5.f49797a;
                bm5VarM16348a = ll5.m16348a(null, new il5(i, context2.getApplicationContext(), str, str2), null);
            }
        }
        setCompositionTask(bm5VarM16348a);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(ll5.m16348a(null, new c9b(byteArrayInputStream, 2), new RunnableC3781y2(byteArrayInputStream, 25)));
    }

    public void setAnimationFromUrl(String str) {
        bm5 bm5VarM16348a;
        int i = 0;
        String str2 = null;
        if (this.f10579H) {
            Context context = getContext();
            HashMap map = ll5.f49797a;
            String strM17734i = AbstractC3393o1.m17734i("url_", str);
            bm5VarM16348a = ll5.m16348a(strM17734i, new il5(i, context, str, strM17734i), null);
        } else {
            bm5VarM16348a = ll5.m16348a(null, new il5(i, getContext(), str, str2), null);
        }
        setCompositionTask(bm5VarM16348a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f10587h.f10608O = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.f10587h.f10609P = z;
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.f10587h.f10635h0 = asyncUpdates;
    }

    public void setCacheComposition(boolean z) {
        this.f10579H = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        this.f10587h.m5015u(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f10587h.m5016v(z);
    }

    public void setComposition(gl5 gl5Var) {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        C0868b c0868b = this.f10587h;
        c0868b.setCallback(this);
        this.f10590k = true;
        boolean zM5017w = c0868b.m5017w(gl5Var);
        if (this.f10591l) {
            c0868b.m5009o();
        }
        this.f10590k = false;
        if (getDrawable() != c0868b || zM5017w) {
            if (!zM5017w) {
                dm5 dm5Var = c0868b.f10622b;
                boolean z = dm5Var != null ? dm5Var.f35824H : false;
                setImageDrawable(null);
                setImageDrawable(c0868b);
                if (z) {
                    c0868b.m5011q();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f10581J.iterator();
            if (it.hasNext()) {
                throw wq1.m24110f(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C0868b c0868b = this.f10587h;
        c0868b.f10642l = str;
        ca1 ca1VarM5006k = c0868b.m5006k();
        if (ca1VarM5006k != null) {
            ca1VarM5006k.f9785e = str;
        }
    }

    public void setFailureListener(xl5 xl5Var) {
        this.f10585f = xl5Var;
    }

    public void setFallbackResource(int i) {
        this.f10586g = i;
    }

    public void setFontAssetDelegate(ra3 ra3Var) {
        ca1 ca1Var = this.f10587h.f10638j;
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f10587h.m5018x(map);
    }

    public void setFrame(int i) {
        this.f10587h.m5019y(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f10587h.f10626d = z;
    }

    public void setImageAssetDelegate(nz3 nz3Var) {
        gv5 gv5Var = this.f10587h.f10634h;
    }

    public void setImageAssetsFolder(String str) {
        this.f10587h.f10636i = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f10589j = 0;
        this.f10588i = null;
        m4983c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f10589j = 0;
        this.f10588i = null;
        m4983c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.f10589j = 0;
        this.f10588i = null;
        m4983c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f10587h.f10602I = z;
    }

    public void setMaxFrame(int i) {
        this.f10587h.m4987A(i);
    }

    public void setMaxProgress(float f) {
        C0868b c0868b = this.f10587h;
        gl5 gl5Var = c0868b.f10620a;
        if (gl5Var == null) {
            c0868b.f10632g.add(new rl5(c0868b, f, 0));
            return;
        }
        dm5 dm5Var = c0868b.f10622b;
        dm5Var.m10481i(dm5Var.f35835j, f06.m11425f(gl5Var.f40968l, gl5Var.f40969m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.f10587h.m4989C(str);
    }

    public void setMinFrame(int i) {
        this.f10587h.m4990D(i);
    }

    public void setMinProgress(float f) {
        C0868b c0868b = this.f10587h;
        gl5 gl5Var = c0868b.f10620a;
        if (gl5Var == null) {
            c0868b.f10632g.add(new rl5(c0868b, f, 1));
        } else {
            c0868b.m4990D((int) f06.m11425f(gl5Var.f40968l, gl5Var.f40969m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f10587h.m4992F(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C0868b c0868b = this.f10587h;
        c0868b.f10606M = z;
        gl5 gl5Var = c0868b.f10620a;
        if (gl5Var != null) {
            gl5Var.f40957a.f35087a = z;
        }
    }

    public void setProgress(float f) {
        this.f10580I.add(UserActionTaken.SET_PROGRESS);
        this.f10587h.m4993G(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f10587h.m4994H(renderMode);
    }

    public void setRepeatCount(int i) {
        this.f10580I.add(UserActionTaken.SET_REPEAT_COUNT);
        this.f10587h.f10622b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f10580I.add(UserActionTaken.SET_REPEAT_MODE);
        this.f10587h.f10622b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f10587h.f10628e = z;
    }

    public void setSpeed(float f) {
        this.f10587h.f10622b.f35829d = f;
    }

    public void setTextDelegate(tt9 tt9Var) {
        this.f10587h.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f10587h.f10622b.f35825I = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        C0868b c0868b;
        dm5 dm5Var;
        C0868b c0868b2;
        boolean z = this.f10590k;
        if (!z && drawable == (c0868b2 = this.f10587h)) {
            dm5 dm5Var2 = c0868b2.f10622b;
            if (dm5Var2 == null ? false : dm5Var2.f35824H) {
                this.f10591l = false;
                c0868b2.m5008n();
            } else if (!z) {
                c0868b = (C0868b) drawable;
                dm5Var = c0868b.f10622b;
                if (dm5Var != null ? dm5Var.f35824H : false) {
                    c0868b.m5008n();
                }
            }
        } else if (!z && (drawable instanceof C0868b)) {
            c0868b = (C0868b) drawable;
            dm5Var = c0868b.f10622b;
            if (dm5Var != null ? dm5Var.f35824H : false) {
                c0868b.m5008n();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f10587h.m4988B(str);
    }

    public void setMinFrame(String str) {
        this.f10587h.m4991E(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10583d = new fl5(this, 1);
        this.f10584e = new fl5(this, 0);
        this.f10586g = 0;
        this.f10587h = new C0868b();
        this.f10590k = false;
        this.f10591l = false;
        this.f10579H = true;
        this.f10580I = new HashSet();
        this.f10581J = new HashSet();
        m4984d(attributeSet, R$attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10583d = new fl5(this, 1);
        this.f10584e = new fl5(this, 0);
        this.f10586g = 0;
        this.f10587h = new C0868b();
        this.f10590k = false;
        this.f10591l = false;
        this.f10579H = true;
        this.f10580I = new HashSet();
        this.f10581J = new HashSet();
        m4984d(attributeSet, i);
    }

    public void setAnimation(int i) {
        bm5 bm5VarM16354g;
        this.f10589j = i;
        this.f10588i = null;
        if (isInEditMode()) {
            bm5VarM16354g = new bm5(new cz3(this, i, 1), true);
        } else {
            bm5VarM16354g = this.f10579H ? ll5.m16354g(getContext(), i) : ll5.m16353f(i, getContext(), null);
        }
        setCompositionTask(bm5VarM16354g);
    }
}
