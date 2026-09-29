package p428v4;

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
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p286o2.C7906f;
import p286o2.C7911k;
import p326q.C8446b;
import p329q2.C8488a;

/* JADX INFO: renamed from: v4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9641d extends AbstractC9643f implements Animatable {

    /* JADX INFO: renamed from: b */
    public final b f49342b;

    /* JADX INFO: renamed from: c */
    public final Context f49343c;

    /* JADX INFO: renamed from: d */
    public C9642e f49344d;

    /* JADX INFO: renamed from: e */
    public ArrayList<AbstractC9640c> f49345e;

    /* JADX INFO: renamed from: f */
    public final a f49346f;

    /* JADX INFO: renamed from: v4.d$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            C9641d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            C9641d.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C9641d.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: v4.d$b */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public C9644g f49348a;

        /* JADX INFO: renamed from: b */
        public AnimatorSet f49349b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Animator> f49350c;

        /* JADX INFO: renamed from: d */
        public C8446b<Animator, String> f49351d;

        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX INFO: renamed from: v4.d$c */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f49352a;

        public c(Drawable.ConstantState constantState) {
            this.f49352a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f49352a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f49352a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C9641d c9641d = new C9641d();
            Drawable drawableNewDrawable = this.f49352a.newDrawable();
            c9641d.f49354a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c9641d.f49346f);
            return c9641d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C9641d c9641d = new C9641d();
            Drawable drawableNewDrawable = this.f49352a.newDrawable(resources);
            c9641d.f49354a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c9641d.f49346f);
            return c9641d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C9641d c9641d = new C9641d();
            Drawable drawableNewDrawable = this.f49352a.newDrawable(resources, theme);
            c9641d.f49354a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c9641d.f49346f);
            return c9641d;
        }
    }

    public C9641d() {
        this(null);
    }

    public C9641d(Context context) {
        this.f49344d = null;
        this.f49345e = null;
        a aVar = new a();
        this.f49346f = aVar;
        this.f49343c = context;
        this.f49342b = new b(aVar);
    }

    @Override // p428v4.AbstractC9643f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.b.m16563a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            return C8488a.b.m16564b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f49342b;
        bVar.f49348a.draw(canvas);
        if (bVar.f49349b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f49354a;
        return drawable != null ? C8488a.a.m16558a(drawable) : this.f49342b.f49348a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f49342b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f49354a;
        return drawable != null ? C8488a.b.m16565c(drawable) : this.f49342b.f49348a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f49354a != null) {
            return new c(this.f49354a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f49342b.f49348a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f49342b.f49348a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.getOpacity() : this.f49342b.f49348a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar;
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.b.m16566d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f49342b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM15693k = C7911k.m15693k(resources, theme, attributeSet, C9638a.f49338e);
                    int resourceId = typedArrayM15693k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C9644g c9644g = new C9644g();
                        ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
                        c9644g.f49354a = C7906f.a.m15676a(resources, resourceId, theme);
                        new C9644g.h(c9644g.f49354a.getConstantState());
                        c9644g.f49360f = false;
                        c9644g.setCallback(this.f49346f);
                        C9644g c9644g2 = bVar.f49348a;
                        if (c9644g2 != null) {
                            c9644g2.setCallback(null);
                        }
                        bVar.f49348a = c9644g;
                    }
                    typedArrayM15693k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C9638a.f49339f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f49343c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(bVar.f49348a.f49356b.f49408b.f49406o.getOrDefault(string, null));
                        if (bVar.f49350c == null) {
                            bVar.f49350c = new ArrayList<>();
                            bVar.f49351d = new C8446b<>();
                        }
                        bVar.f49350c.add(animatorLoadAnimator);
                        bVar.f49351d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (bVar.f49349b == null) {
            bVar.f49349b = new AnimatorSet();
        }
        bVar.f49349b.playTogether(bVar.f49350c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f49354a;
        return drawable != null ? C8488a.a.m16561d(drawable) : this.f49342b.f49348a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f49354a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f49342b.f49349b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.isStateful() : this.f49342b.f49348a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f49342b.f49348a.setBounds(rect);
        }
    }

    @Override // p428v4.AbstractC9643f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.setLevel(i10) : this.f49342b.f49348a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.setState(iArr) : this.f49342b.f49348a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f49342b.f49348a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.a.m16562e(drawable, z10);
        } else {
            this.f49342b.f49348a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f49342b.f49348a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.m16555a(drawable, i10);
        } else {
            this.f49342b.f49348a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.m16556b(drawable, colorStateList);
        } else {
            this.f49342b.f49348a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.m16557c(drawable, mode);
        } else {
            this.f49342b.f49348a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f49342b.f49348a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f49342b;
        if (bVar.f49349b.isStarted()) {
            return;
        }
        bVar.f49349b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f49342b.f49349b.end();
        }
    }
}
