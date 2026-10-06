package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ati extends atj implements Animatable {

    /* JADX INFO: renamed from: a */
    public final atf f2303a;

    /* JADX INFO: renamed from: b */
    public Animator.AnimatorListener f2304b;

    /* JADX INFO: renamed from: c */
    public ArrayList f2305c;

    /* JADX INFO: renamed from: d */
    public final Drawable.Callback f2306d;

    /* JADX INFO: renamed from: f */
    private final Context f2307f;

    public ati() {
        this(null);
    }

    @Override // p000.atj, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m233b(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            return acv.m240i(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2303a.f2298b.draw(canvas);
        if (this.f2303a.f2299c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2308e;
        return drawable != null ? acu.m226a(drawable) : this.f2303a.f2298b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        int i = this.f2303a.f2297a;
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2308e;
        return drawable != null ? acv.m232a(drawable) : this.f2303a.f2298b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            return new atg(drawable.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2303a.f2298b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2303a.f2298b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.getOpacity() : this.f2303a.f2298b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2308e;
        return drawable != null ? acu.m230e(drawable) : this.f2303a.f2298b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2308e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2303a.f2299c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.isStateful() : this.f2303a.f2298b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // p000.atj, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2303a.f2298b.setBounds(rect);
        }
    }

    @Override // p000.atj, android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.setLevel(i) : this.f2303a.f2298b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.setState(iArr) : this.f2303a.f2298b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f2303a.f2298b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acu.m229d(drawable, z);
        } else {
            this.f2303a.f2298b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2303a.f2298b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m237f(drawable, i);
        } else {
            this.f2303a.f2298b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m238g(drawable, colorStateList);
        } else {
            this.f2303a.f2298b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m239h(drawable, mode);
        } else {
            this.f2303a.f2298b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f2303a.f2298b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f2303a.f2299c.isStarted()) {
                return;
            }
            this.f2303a.f2299c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2303a.f2299c.end();
        }
    }

    public ati(Context context) {
        this.f2304b = null;
        this.f2305c = null;
        this.f2306d = new atd(this, 0);
        this.f2307f = context;
        this.f2303a = new atf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m234c(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM42f = aar.m42f(resources, theme, attributeSet, ata.f2290e);
                    int resourceId = typedArrayM42f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        atr atrVar = new atr();
                        atrVar.f2308e = ach.m188a(resources, resourceId, theme);
                        atrVar.f2370c = false;
                        atrVar.setCallback(this.f2306d);
                        atr atrVar2 = this.f2303a.f2298b;
                        if (atrVar2 != null) {
                            atrVar2.setCallback(null);
                        }
                        this.f2303a.f2298b = atrVar;
                    }
                    typedArrayM42f.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, ata.f2291f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2307f;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(this.f2303a.f2298b.f2369b.f2356b.f2349l.get(string));
                        atf atfVar = this.f2303a;
                        if (atfVar.f2300d == null) {
                            atfVar.f2300d = new ArrayList();
                            this.f2303a.f2301e = new C1109wy();
                        }
                        this.f2303a.f2300d.add(animatorLoadAnimator);
                        this.f2303a.f2301e.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        atf atfVar2 = this.f2303a;
        if (atfVar2.f2299c == null) {
            atfVar2.f2299c = new AnimatorSet();
        }
        atfVar2.f2299c.playTogether(atfVar2.f2300d);
    }
}
