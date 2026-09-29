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

/* JADX INFO: renamed from: pm */
/* JADX INFO: loaded from: classes2.dex */
public final class C3465pm extends goa implements Animatable {

    /* JADX INFO: renamed from: c */
    public final Context f56435c;

    /* JADX INFO: renamed from: d */
    public C3340mm f56436d = null;

    /* JADX INFO: renamed from: e */
    public ArrayList f56437e = null;

    /* JADX INFO: renamed from: f */
    public final C3303lm f56438f = new C3303lm(this, 0);

    /* JADX INFO: renamed from: b */
    public final C3377nm f56434b = new C3377nm();

    public C3465pm(Context context) {
        this.f56435c = context;
    }

    @Override // p000.goa, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C3377nm c3377nm = this.f56434b;
        c3377nm.f52939a.draw(canvas);
        if (c3377nm.f52940b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getAlpha() : this.f56434b.f52939a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f56434b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getColorFilter() : this.f56434b.f52939a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f41098a != null) {
            return new C3418om(this.f41098a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f56434b.f52939a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f56434b.f52939a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getOpacity() : this.f56434b.f52939a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C3377nm c3377nm;
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c3377nm = this.f56434b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM17383g = nda.m17383g(resources, theme, attributeSet, xx1.f68921e);
                    int resourceId = typedArrayM17383g.getResourceId(0, 0);
                    if (resourceId != 0) {
                        poa poaVar = new poa();
                        ThreadLocal threadLocal = f88.f38630a;
                        poaVar.f41098a = resources.getDrawable(resourceId, theme);
                        new ooa(poaVar.f41098a.getConstantState());
                        poaVar.f56604f = false;
                        poaVar.setCallback(this.f56438f);
                        poa poaVar2 = c3377nm.f52939a;
                        if (poaVar2 != null) {
                            poaVar2.setCallback(null);
                        }
                        c3377nm.f52939a = poaVar;
                    }
                    typedArrayM17383g.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, xx1.f68922f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f56435c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            C3386nv.m17633t("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c3377nm.f52939a.f56600b.f53069b.f51665o.get(string));
                        if (c3377nm.f52941c == null) {
                            c3377nm.f52941c = new ArrayList();
                            c3377nm.f52942d = new C3275kv(0);
                        }
                        c3377nm.f52941c.add(animatorLoadAnimator);
                        c3377nm.f52942d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c3377nm.f52940b == null) {
            c3377nm.f52940b = new AnimatorSet();
        }
        c3377nm.f52940b.playTogether(c3377nm.f52941c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.isAutoMirrored() : this.f56434b.f52939a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f41098a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f56434b.f52940b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.isStateful() : this.f56434b.f52939a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f56434b.f52939a.setBounds(rect);
        }
    }

    @Override // p000.goa, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.setLevel(i) : this.f56434b.f52939a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.setState(iArr) : this.f56434b.f52939a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f56434b.f52939a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f56434b.f52939a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f56434b.f52939a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f56434b.f52939a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f56434b.f52939a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f56434b.f52939a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f56434b.f52939a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C3377nm c3377nm = this.f56434b;
        if (c3377nm.f52940b.isStarted()) {
            return;
        }
        c3377nm.f52940b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f56434b.f52940b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
