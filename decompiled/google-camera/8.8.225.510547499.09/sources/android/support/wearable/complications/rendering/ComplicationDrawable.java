package android.support.wearable.complications.rendering;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0900pe;
import p000.ActivityC0869oa;
import p000.C0866ny;
import p000.C0870ob;
import p000.C0872od;
import p000.C0873oe;
import p000.C0876oh;
import p000.C0877oi;
import p000.C0878oj;
import p000.C0880ol;
import p000.InterfaceC0875og;
import p000.RunnableC0852nk;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ComplicationDrawable extends Drawable implements Parcelable {
    public static final int BORDER_STYLE_DASHED = 2;
    public static final int BORDER_STYLE_NONE = 0;
    public static final int BORDER_STYLE_SOLID = 1;
    public static final Parcelable.Creator CREATOR = new C0870ob(3);
    private static final String FIELD_ACTIVE_STYLE_BUILDER = "active_style_builder";
    private static final String FIELD_AMBIENT_STYLE_BUILDER = "ambient_style_builder";
    private static final String FIELD_BOUNDS = "bounds";
    private static final String FIELD_HIGHLIGHT_DURATION = "highlight_duration";
    private static final String FIELD_NO_DATA_TEXT = "no_data_text";
    private static final String FIELD_RANGED_VALUE_PROGRESS_HIDDEN = "ranged_value_progress_hidden";
    private static final String TAG = "ComplicationDrawable";
    private final ComplicationStyle$Builder mActiveStyleBuilder;
    private boolean mAlreadyStyled;
    private final ComplicationStyle$Builder mAmbientStyleBuilder;
    private boolean mBurnInProtection;
    private C0877oi mComplicationRenderer;
    private Context mContext;
    private long mCurrentTimeMillis;
    private long mHighlightDuration;
    private boolean mInAmbientMode;
    private boolean mIsHighlighted;
    private boolean mIsInflatedFromXml;
    private boolean mIsStyleUpToDate;
    private boolean mLowBitAmbient;
    private final Handler mMainThreadHandler;
    private CharSequence mNoDataText;
    private boolean mRangedValueProgressHidden;
    private final InterfaceC0875og mRendererInvalidateListener;
    private final Runnable mUnhighlightRunnable;

    public ComplicationDrawable() {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new RunnableC0852nk(this, 4);
        this.mRendererInvalidateListener = new C0872od(this);
        this.mActiveStyleBuilder = new ComplicationStyle$Builder();
        this.mAmbientStyleBuilder = new ComplicationStyle$Builder();
    }

    public /* synthetic */ ComplicationDrawable(Parcel parcel, C0873oe c0873oe) {
        this(parcel);
    }

    public ComplicationDrawable(ComplicationDrawable complicationDrawable) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new RunnableC0852nk(this, 4);
        this.mRendererInvalidateListener = new C0872od(this);
        this.mActiveStyleBuilder = new ComplicationStyle$Builder(complicationDrawable.mActiveStyleBuilder);
        this.mAmbientStyleBuilder = new ComplicationStyle$Builder(complicationDrawable.mAmbientStyleBuilder);
        CharSequence charSequence = complicationDrawable.mNoDataText;
        this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        this.mHighlightDuration = complicationDrawable.mHighlightDuration;
        this.mRangedValueProgressHidden = complicationDrawable.mRangedValueProgressHidden;
        setBounds(complicationDrawable.getBounds());
        this.mAlreadyStyled = true;
    }

    private void assertInitialized() {
        if (this.mContext == null) {
            throw new IllegalStateException("ComplicationDrawable does not have a context. Use setContext(Context) to set it first.");
        }
    }

    private ComplicationStyle$Builder getComplicationStyleBuilder(boolean z) {
        return z ? this.mAmbientStyleBuilder : this.mActiveStyleBuilder;
    }

    private void inflateAttributes(Resources resources, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0866ny.f44992e);
        setRangedValueProgressHidden(typedArrayObtainAttributes.getBoolean(11, false));
        typedArrayObtainAttributes.recycle();
    }

    private void inflateStyle(boolean z, Resources resources, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0866ny.f44992e);
        ComplicationStyle$Builder complicationStyleBuilder = getComplicationStyleBuilder(z);
        if (typedArrayObtainAttributes.hasValue(0)) {
            complicationStyleBuilder.f1331a = typedArrayObtainAttributes.getColor(0, resources.getColor(C0100R.color.complicationDrawable_backgroundColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(1)) {
            complicationStyleBuilder.f1332b = typedArrayObtainAttributes.getDrawable(1);
        }
        if (typedArrayObtainAttributes.hasValue(14)) {
            complicationStyleBuilder.f1333c = typedArrayObtainAttributes.getColor(14, resources.getColor(C0100R.color.complicationDrawable_textColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(17)) {
            complicationStyleBuilder.f1334d = typedArrayObtainAttributes.getColor(17, resources.getColor(C0100R.color.complicationDrawable_titleColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(16)) {
            complicationStyleBuilder.f1335e = Typeface.create(typedArrayObtainAttributes.getString(16), 0);
        }
        if (typedArrayObtainAttributes.hasValue(19)) {
            complicationStyleBuilder.f1336f = Typeface.create(typedArrayObtainAttributes.getString(19), 0);
        }
        if (typedArrayObtainAttributes.hasValue(15)) {
            complicationStyleBuilder.f1337g = typedArrayObtainAttributes.getDimensionPixelSize(15, resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_textSize));
        }
        if (typedArrayObtainAttributes.hasValue(18)) {
            complicationStyleBuilder.f1338h = typedArrayObtainAttributes.getDimensionPixelSize(18, resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_titleSize));
        }
        if (typedArrayObtainAttributes.hasValue(9)) {
            complicationStyleBuilder.f1340j = typedArrayObtainAttributes.getColor(9, resources.getColor(C0100R.color.complicationDrawable_iconColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(2)) {
            complicationStyleBuilder.f1341k = typedArrayObtainAttributes.getColor(2, resources.getColor(C0100R.color.complicationDrawable_borderColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(5)) {
            complicationStyleBuilder.f1344n = typedArrayObtainAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_borderRadius));
        }
        if (typedArrayObtainAttributes.hasValue(6)) {
            complicationStyleBuilder.m1392b(typedArrayObtainAttributes.getInt(6, resources.getInteger(C0100R.integer.complicationDrawable_borderStyle)));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            complicationStyleBuilder.f1342l = typedArrayObtainAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_borderDashWidth));
        }
        if (typedArrayObtainAttributes.hasValue(3)) {
            complicationStyleBuilder.f1343m = typedArrayObtainAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_borderDashGap));
        }
        if (typedArrayObtainAttributes.hasValue(7)) {
            complicationStyleBuilder.f1345o = typedArrayObtainAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_borderWidth));
        }
        if (typedArrayObtainAttributes.hasValue(12)) {
            complicationStyleBuilder.f1346p = typedArrayObtainAttributes.getDimensionPixelSize(12, resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_rangedValueRingWidth));
        }
        if (typedArrayObtainAttributes.hasValue(10)) {
            complicationStyleBuilder.f1347q = typedArrayObtainAttributes.getColor(10, resources.getColor(C0100R.color.complicationDrawable_rangedValuePrimaryColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(13)) {
            complicationStyleBuilder.f1348r = typedArrayObtainAttributes.getColor(13, resources.getColor(C0100R.color.complicationDrawable_rangedValueSecondaryColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(8)) {
            complicationStyleBuilder.f1349s = typedArrayObtainAttributes.getColor(8, resources.getColor(C0100R.color.complicationDrawable_highlightColor, null));
        }
        typedArrayObtainAttributes.recycle();
    }

    private static void setStyleToDefaultValues(ComplicationStyle$Builder complicationStyle$Builder, Resources resources) {
        complicationStyle$Builder.f1331a = resources.getColor(C0100R.color.complicationDrawable_backgroundColor, null);
        complicationStyle$Builder.f1333c = resources.getColor(C0100R.color.complicationDrawable_textColor, null);
        complicationStyle$Builder.f1334d = resources.getColor(C0100R.color.complicationDrawable_titleColor, null);
        complicationStyle$Builder.f1335e = Typeface.create(resources.getString(C0100R.string.complicationDrawable_textTypeface), 0);
        complicationStyle$Builder.f1336f = Typeface.create(resources.getString(C0100R.string.complicationDrawable_titleTypeface), 0);
        complicationStyle$Builder.f1337g = resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_textSize);
        complicationStyle$Builder.f1338h = resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_titleSize);
        complicationStyle$Builder.f1340j = resources.getColor(C0100R.color.complicationDrawable_iconColor, null);
        complicationStyle$Builder.f1341k = resources.getColor(C0100R.color.complicationDrawable_borderColor, null);
        complicationStyle$Builder.f1345o = resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_borderWidth);
        complicationStyle$Builder.f1344n = resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_borderRadius);
        complicationStyle$Builder.m1392b(resources.getInteger(C0100R.integer.complicationDrawable_borderStyle));
        complicationStyle$Builder.f1342l = resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_borderDashWidth);
        complicationStyle$Builder.f1343m = resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_borderDashGap);
        complicationStyle$Builder.f1346p = resources.getDimensionPixelSize(C0100R.dimen.complicationDrawable_rangedValueRingWidth);
        complicationStyle$Builder.f1347q = resources.getColor(C0100R.color.complicationDrawable_rangedValuePrimaryColor, null);
        complicationStyle$Builder.f1348r = resources.getColor(C0100R.color.complicationDrawable_rangedValueSecondaryColor, null);
        complicationStyle$Builder.f1349s = resources.getColor(C0100R.color.complicationDrawable_highlightColor, null);
    }

    private void updateStyleIfRequired() {
        if (this.mIsStyleUpToDate) {
            return;
        }
        this.mComplicationRenderer.m18524g(this.mActiveStyleBuilder.m1391a(), this.mAmbientStyleBuilder.m1391a());
        this.mIsStyleUpToDate = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0195  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a0  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        C0876oh c0876oh;
        Drawable drawable;
        Drawable drawable2;
        assertInitialized();
        updateStyleIfRequired();
        C0877oi c0877oi = this.mComplicationRenderer;
        long j = this.mCurrentTimeMillis;
        boolean z = this.mInAmbientMode;
        boolean z2 = this.mLowBitAmbient;
        boolean z3 = this.mBurnInProtection;
        boolean z4 = this.mIsHighlighted;
        ComplicationData complicationData = c0877oi.f46057b;
        if (complicationData == null || (i = complicationData.f1312b) == 2 || i == 1 || j < complicationData.f1313c.getLong("START_TIME", 0L) || j > complicationData.f1313c.getLong("END_TIME", Long.MAX_VALUE) || c0877oi.f46058c.isEmpty()) {
            return;
        }
        if (z) {
            C0876oh c0876oh2 = c0877oi.f46078w;
            if (c0876oh2.f46001j != z2 || c0876oh2.f46002k != z3) {
                c0877oi.f46078w = new C0876oh(c0877oi.f46081z, true, z2, z3);
            }
            c0876oh = c0877oi.f46078w;
        } else {
            c0876oh = c0877oi.f46077v;
        }
        if (c0877oi.f46057b.m1371h() != null) {
            c0877oi.f46067l.m18647e(1);
            c0877oi.f46067l.m18649g(c0877oi.f46057b.m1371h().mo1374a(c0877oi.f46056a, j));
            if (c0877oi.f46057b.m1372i() != null) {
                c0877oi.f46068m.m18649g(c0877oi.f46057b.m1372i().mo1374a(c0877oi.f46056a, j));
            } else {
                c0877oi.f46068m.m18649g("");
            }
        }
        if (c0877oi.f46057b.m1369f() != null) {
            c0877oi.f46067l.m18649g(c0877oi.f46057b.m1369f().mo1374a(c0877oi.f46056a, j));
            if (c0877oi.f46057b.m1370g() != null) {
                c0877oi.f46068m.m18649g(c0877oi.f46057b.m1370g().mo1374a(c0877oi.f46056a, j));
                c0877oi.f46067l.m18647e(1);
            } else {
                c0877oi.f46068m.m18649g("");
                c0877oi.f46067l.m18647e(2);
            }
        }
        canvas.save();
        canvas.translate(c0877oi.f46058c.left, c0877oi.f46058c.top);
        int iM18518a = c0877oi.m18518a(c0876oh.f45999h);
        float f = iM18518a;
        canvas.drawRoundRect(c0877oi.f46070o, f, f, c0876oh.f45997f);
        if (c0876oh.f45999h.f46140c != null && !c0876oh.m18482a()) {
            c0877oi.f46064i.m18606a(c0876oh.f45999h.f46140c);
            C0880ol c0880ol = c0877oi.f46064i;
            c0880ol.f46225b = iM18518a;
            c0880ol.setBounds(c0877oi.f46069n);
            c0877oi.f46064i.draw(canvas);
        }
        if (!c0877oi.f46071p.isEmpty() && (drawable = c0877oi.f46059d) != null) {
            if (c0876oh.m18482a() && (drawable2 = c0877oi.f46060e) != null) {
                drawable = drawable2;
            }
            drawable.setColorFilter(c0876oh.f46003l);
            Rect rect = c0877oi.f46071p;
            drawable.setBounds(0, 0, rect.width(), rect.height());
            canvas.save();
            canvas.translate(rect.left, rect.top);
            drawable.draw(canvas);
            canvas.restore();
        }
        if (!c0877oi.f46072q.isEmpty()) {
            if (c0876oh.m18482a()) {
                c0877oi.f46066k.m18606a(c0877oi.f46062g);
                if (c0877oi.f46062g != null) {
                    if (c0877oi.f46057b.m1364a() == 2) {
                        c0877oi.f46066k.setColorFilter(null);
                        c0877oi.f46066k.f46225b = 0;
                    } else {
                        c0877oi.f46066k.setColorFilter(c0876oh.f45999h.f46147j);
                        c0877oi.f46066k.f46225b = c0877oi.m18519b(c0876oh.f45999h, c0877oi.f46072q);
                    }
                    c0877oi.f46066k.setBounds(c0877oi.f46072q);
                    c0877oi.f46066k.draw(canvas);
                }
            } else {
                c0877oi.f46066k.m18606a(c0877oi.f46061f);
                if (c0877oi.f46061f != null) {
                    if (c0877oi.f46057b.m1364a() == 2) {
                        c0877oi.f46066k.setColorFilter(null);
                        c0877oi.f46066k.f46225b = 0;
                    } else {
                        c0877oi.f46066k.setColorFilter(c0876oh.f45999h.f46147j);
                        c0877oi.f46066k.f46225b = c0877oi.m18519b(c0876oh.f45999h, c0877oi.f46072q);
                    }
                    c0877oi.f46066k.setBounds(c0877oi.f46072q);
                    c0877oi.f46066k.draw(canvas);
                }
            }
        }
        if (!c0877oi.f46073r.isEmpty() && !c0876oh.m18482a()) {
            c0877oi.f46065j.m18606a(c0877oi.f46063h);
            c0877oi.f46065j.f46225b = c0877oi.m18519b(c0876oh.f45999h, c0877oi.f46073r);
            c0877oi.f46065j.setBounds(c0877oi.f46073r);
            c0877oi.f46065j.setColorFilter(c0876oh.f45999h.f46147j);
            c0877oi.f46065j.draw(canvas);
        }
        if (!c0877oi.f46076u.isEmpty()) {
            ComplicationData complicationData2 = c0877oi.f46057b;
            ComplicationData.m1361k("MAX_VALUE", complicationData2.f1312b);
            float f2 = complicationData2.f1313c.getFloat("MAX_VALUE");
            ComplicationData complicationData3 = c0877oi.f46057b;
            ComplicationData.m1361k("MIN_VALUE", complicationData3.f1312b);
            float f3 = f2 - complicationData3.f1313c.getFloat("MIN_VALUE");
            float f4 = 0.0f;
            if (f3 > 0.0f) {
                ComplicationData complicationData4 = c0877oi.f46057b;
                ComplicationData.m1361k("VALUE", complicationData4.f1312b);
                f4 = complicationData4.f1313c.getFloat("VALUE") / f3;
            }
            int iCeil = (int) Math.ceil(c0876oh.f45994c.getStrokeWidth());
            float f5 = iCeil;
            c0877oi.f46076u.inset(f5, f5);
            float f6 = f4 * 352.0f;
            canvas.drawArc(c0877oi.f46076u, -88.0f, f6, false, c0876oh.f45994c);
            canvas.drawArc(c0877oi.f46076u, 4.0f + (-88.0f) + f6, 352.0f - f6, false, c0876oh.f45995d);
            float f7 = -iCeil;
            c0877oi.f46076u.inset(f7, f7);
        }
        if (!c0877oi.f46074s.isEmpty()) {
            TextPaint textPaint = c0877oi.f46079x;
            TextPaint textPaint2 = c0876oh.f45992a;
            if (textPaint != textPaint2) {
                c0877oi.f46079x = textPaint2;
                c0877oi.f46067l.m18648f(c0877oi.f46079x);
                c0877oi.f46067l.m18646d(c0876oh.f46000i);
            }
            c0877oi.f46067l.m18643a(canvas, c0877oi.f46074s);
        }
        if (!c0877oi.f46075t.isEmpty()) {
            TextPaint textPaint3 = c0877oi.f46080y;
            TextPaint textPaint4 = c0876oh.f45993b;
            if (textPaint3 != textPaint4) {
                c0877oi.f46080y = textPaint4;
                c0877oi.f46068m.m18648f(c0877oi.f46080y);
                c0877oi.f46068m.m18646d(c0876oh.f46000i);
            }
            c0877oi.f46068m.m18643a(canvas, c0877oi.f46075t);
        }
        if (z4 && !c0876oh.f46000i) {
            float fM18518a = c0877oi.m18518a(c0876oh.f45999h);
            canvas.drawRoundRect(c0877oi.f46070o, fM18518a, fM18518a, c0876oh.f45998g);
        }
        C0878oj c0878oj = c0876oh.f45999h;
        if (c0878oj.f46150m != 0) {
            float fM18518a2 = c0877oi.m18518a(c0878oj);
            canvas.drawRoundRect(c0877oi.f46070o, fM18518a2, fM18518a2, c0876oh.f45996e);
        }
        canvas.restore();
    }

    C0878oj getActiveStyle() {
        return this.mActiveStyleBuilder.m1391a();
    }

    C0878oj getAmbientStyle() {
        return this.mAmbientStyleBuilder.m1391a();
    }

    C0877oi getComplicationRenderer() {
        return this.mComplicationRenderer;
    }

    public long getHighlightDuration() {
        return this.mHighlightDuration;
    }

    public boolean getLowBitAmbient() {
        return this.mLowBitAmbient;
    }

    CharSequence getNoDataText() {
        return this.mNoDataText;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        this.mIsInflatedFromXml = true;
        int depth = xmlPullParser.getDepth();
        inflateAttributes(resources, xmlPullParser);
        setStyleToDefaultValues(this.mActiveStyleBuilder, resources);
        setStyleToDefaultValues(this.mAmbientStyleBuilder, resources);
        inflateStyle(false, resources, xmlPullParser);
        inflateStyle(true, resources, xmlPullParser);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
            } else if (next == 2) {
                String name = xmlPullParser.getName();
                if (TextUtils.equals(name, "ambient")) {
                    inflateStyle(true, resources, xmlPullParser);
                } else {
                    Log.w(TAG, VCYBIzY.PJXFTYQMkIhRI + name + " for ComplicationDrawable " + toString());
                }
            }
        }
        this.mIsStyleUpToDate = false;
    }

    public boolean isHighlighted() {
        return this.mIsHighlighted;
    }

    public boolean isRangedValueProgressHidden() {
        return this.mRangedValueProgressHidden;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        C0877oi c0877oi = this.mComplicationRenderer;
        if (c0877oi != null) {
            c0877oi.m18525h(rect);
        }
    }

    public boolean onTap(int i, int i2) {
        ComplicationData complicationData;
        C0877oi c0877oi = this.mComplicationRenderer;
        if (c0877oi == null || (complicationData = c0877oi.f46057b) == null || ((complicationData.m1365b() == null && complicationData.f1312b != 9) || !getBounds().contains(i, i2))) {
            return false;
        }
        if (complicationData.f1312b == 9) {
            Context context = this.mContext;
            if (!(context instanceof AbstractC0900pe)) {
                return false;
            }
            ComponentName componentName = new ComponentName(context, context.getClass());
            Intent intent = new Intent(context, (Class<?>) ActivityC0869oa.class);
            intent.setAction("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY");
            intent.addFlags(8388608);
            intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", componentName);
            context.startActivity(intent.addFlags(268435456));
        } else {
            try {
                complicationData.m1365b().send();
            } catch (PendingIntent.CanceledException e) {
                return false;
            }
        }
        if (getHighlightDuration() > 0) {
            setIsHighlighted(true);
            invalidateSelf();
            this.mMainThreadHandler.removeCallbacks(this.mUnhighlightRunnable);
            this.mMainThreadHandler.postDelayed(this.mUnhighlightRunnable, getHighlightDuration());
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setBackgroundColorActive(int i) {
        getComplicationStyleBuilder(false).f1331a = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1331a = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableActive(Drawable drawable) {
        getComplicationStyleBuilder(false).f1332b = drawable;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableAmbient(Drawable drawable) {
        getComplicationStyleBuilder(true).f1332b = drawable;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorActive(int i) {
        getComplicationStyleBuilder(false).f1341k = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1341k = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapActive(int i) {
        getComplicationStyleBuilder(false).f1343m = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapAmbient(int i) {
        getComplicationStyleBuilder(true).f1343m = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthActive(int i) {
        getComplicationStyleBuilder(false).f1342l = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthAmbient(int i) {
        getComplicationStyleBuilder(true).f1342l = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusActive(int i) {
        getComplicationStyleBuilder(false).f1344n = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusAmbient(int i) {
        getComplicationStyleBuilder(true).f1344n = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleActive(int i) {
        getComplicationStyleBuilder(false).m1392b(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleAmbient(int i) {
        getComplicationStyleBuilder(true).m1392b(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthActive(int i) {
        getComplicationStyleBuilder(false).f1345o = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthAmbient(int i) {
        getComplicationStyleBuilder(true).f1345o = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBurnInProtection(boolean z) {
        this.mBurnInProtection = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setComplicationData(ComplicationData complicationData) {
        assertInitialized();
        this.mComplicationRenderer.m18521d(complicationData);
    }

    public void setContext(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Argument \"context\" should not be null.");
        }
        if (Objects.equals(context, this.mContext)) {
            return;
        }
        this.mContext = context;
        if (!this.mIsInflatedFromXml && !this.mAlreadyStyled) {
            setStyleToDefaultValues(this.mActiveStyleBuilder, context.getResources());
            setStyleToDefaultValues(this.mAmbientStyleBuilder, context.getResources());
        }
        if (!this.mAlreadyStyled) {
            this.mHighlightDuration = context.getResources().getInteger(C0100R.integer.complicationDrawable_highlightDurationMs);
        }
        C0877oi c0877oi = new C0877oi(this.mContext, this.mActiveStyleBuilder.m1391a(), this.mAmbientStyleBuilder.m1391a());
        this.mComplicationRenderer = c0877oi;
        c0877oi.f46050A = this.mRendererInvalidateListener;
        CharSequence charSequence = this.mNoDataText;
        if (charSequence == null) {
            setNoDataText(context.getString(C0100R.string.complicationDrawable_noDataText));
        } else {
            c0877oi.m18522e(charSequence);
        }
        this.mComplicationRenderer.m18523f(this.mRangedValueProgressHidden);
        this.mComplicationRenderer.m18525h(getBounds());
        this.mIsStyleUpToDate = true;
    }

    public void setCurrentTimeMillis(long j) {
        this.mCurrentTimeMillis = j;
    }

    public void setHighlightColorActive(int i) {
        getComplicationStyleBuilder(false).f1349s = i;
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1349s = i;
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightDuration(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Highlight duration should be non-negative.");
        }
        this.mHighlightDuration = j;
    }

    public void setIconColorActive(int i) {
        getComplicationStyleBuilder(false).f1340j = i;
        this.mIsStyleUpToDate = false;
    }

    public void setIconColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1340j = i;
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterActive(ColorFilter colorFilter) {
        getComplicationStyleBuilder(false).f1339i = colorFilter;
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterAmbient(ColorFilter colorFilter) {
        getComplicationStyleBuilder(true).f1339i = colorFilter;
        this.mIsStyleUpToDate = false;
    }

    public void setInAmbientMode(boolean z) {
        this.mInAmbientMode = z;
    }

    public void setIsHighlighted(boolean z) {
        this.mIsHighlighted = z;
    }

    public void setLowBitAmbient(boolean z) {
        this.mLowBitAmbient = z;
    }

    public void setRangedValuePrimaryColorActive(int i) {
        getComplicationStyleBuilder(false).f1347q = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValuePrimaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1347q = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueProgressHidden(boolean z) {
        this.mRangedValueProgressHidden = z;
        C0877oi c0877oi = this.mComplicationRenderer;
        if (c0877oi != null) {
            c0877oi.m18523f(z);
        }
    }

    public void setRangedValueRingWidthActive(int i) {
        getComplicationStyleBuilder(false).f1346p = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueRingWidthAmbient(int i) {
        getComplicationStyleBuilder(true).f1346p = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorActive(int i) {
        getComplicationStyleBuilder(false).f1348r = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1348r = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorActive(int i) {
        getComplicationStyleBuilder(false).f1333c = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1333c = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeActive(int i) {
        getComplicationStyleBuilder(false).f1337g = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeAmbient(int i) {
        getComplicationStyleBuilder(true).f1337g = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).f1335e = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).f1335e = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorActive(int i) {
        getComplicationStyleBuilder(false).f1334d = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1334d = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeActive(int i) {
        getComplicationStyleBuilder(false).f1338h = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeAmbient(int i) {
        getComplicationStyleBuilder(true).f1338h = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).f1336f = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).f1336f = typeface;
        this.mIsStyleUpToDate = false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(FIELD_ACTIVE_STYLE_BUILDER, this.mActiveStyleBuilder);
        bundle.putParcelable(FIELD_AMBIENT_STYLE_BUILDER, this.mAmbientStyleBuilder);
        bundle.putCharSequence(FIELD_NO_DATA_TEXT, this.mNoDataText);
        bundle.putLong(FIELD_HIGHLIGHT_DURATION, this.mHighlightDuration);
        bundle.putBoolean(FIELD_RANGED_VALUE_PROGRESS_HIDDEN, this.mRangedValueProgressHidden);
        bundle.putParcelable(FIELD_BOUNDS, getBounds());
        parcel.writeBundle(bundle);
    }

    public void setNoDataText(CharSequence charSequence) {
        if (charSequence == null) {
            this.mNoDataText = "";
        } else {
            this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        }
        C0877oi c0877oi = this.mComplicationRenderer;
        if (c0877oi != null) {
            c0877oi.m18522e(this.mNoDataText);
        }
    }

    public ComplicationDrawable(Context context) {
        this();
        setContext(context);
    }

    private ComplicationDrawable(Parcel parcel) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new RunnableC0852nk(this, 4);
        this.mRendererInvalidateListener = new C0872od(this);
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.mActiveStyleBuilder = (ComplicationStyle$Builder) bundle.getParcelable(FIELD_ACTIVE_STYLE_BUILDER);
        this.mAmbientStyleBuilder = (ComplicationStyle$Builder) bundle.getParcelable(FIELD_AMBIENT_STYLE_BUILDER);
        this.mNoDataText = bundle.getCharSequence(FIELD_NO_DATA_TEXT);
        this.mHighlightDuration = bundle.getLong(FIELD_HIGHLIGHT_DURATION);
        this.mRangedValueProgressHidden = bundle.getBoolean(FIELD_RANGED_VALUE_PROGRESS_HIDDEN);
        setBounds((Rect) bundle.getParcelable(FIELD_BOUNDS));
        this.mAlreadyStyled = true;
    }

    @Deprecated
    public boolean onTap(int i, int i2, long j) {
        return onTap(i, i2);
    }

    public void draw(Canvas canvas, long j) {
        assertInitialized();
        setCurrentTimeMillis(j);
        draw(canvas);
    }
}
