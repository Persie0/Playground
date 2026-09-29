package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.R$dimen;
import com.google.android.material.R$plurals;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.badge.BadgeState$State;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c80 {

    /* JADX INFO: renamed from: a */
    public final BadgeState$State f9686a;

    /* JADX INFO: renamed from: b */
    public final BadgeState$State f9687b;

    /* JADX INFO: renamed from: c */
    public final float f9688c;

    /* JADX INFO: renamed from: d */
    public final float f9689d;

    /* JADX INFO: renamed from: e */
    public final float f9690e;

    /* JADX INFO: renamed from: f */
    public final float f9691f;

    /* JADX INFO: renamed from: g */
    public final float f9692g;

    /* JADX INFO: renamed from: h */
    public final float f9693h;

    /* JADX INFO: renamed from: i */
    public final int f9694i;

    /* JADX INFO: renamed from: j */
    public final int f9695j;

    /* JADX INFO: renamed from: k */
    public final int f9696k;

    /* JADX INFO: renamed from: l */
    public int f9697l;

    public c80(Context context, BadgeState$State badgeState$State) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        int i = x70.f67851J;
        int i2 = x70.f67850I;
        this.f9687b = new BadgeState$State();
        badgeState$State = badgeState$State == null ? new BadgeState$State() : badgeState$State;
        int i3 = badgeState$State.f12632a;
        if (i3 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayM10751d = dy9.m10751d(context, attributeSetAsAttributeSet, R$styleable.Badge, i, styleAttribute == 0 ? i2 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f9688c = typedArrayM10751d.getDimensionPixelSize(R$styleable.Badge_badgeRadius, -1);
        this.f9694i = context.getResources().getDimensionPixelSize(R$dimen.mtrl_badge_horizontal_edge_offset);
        this.f9695j = context.getResources().getDimensionPixelSize(R$dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f9689d = typedArrayM10751d.getDimensionPixelSize(R$styleable.Badge_badgeWithTextRadius, -1);
        this.f9690e = typedArrayM10751d.getDimension(R$styleable.Badge_badgeWidth, resources.getDimension(R$dimen.m3_badge_size));
        this.f9692g = typedArrayM10751d.getDimension(R$styleable.Badge_badgeWithTextWidth, resources.getDimension(R$dimen.m3_badge_with_text_size));
        this.f9691f = typedArrayM10751d.getDimension(R$styleable.Badge_badgeHeight, resources.getDimension(R$dimen.m3_badge_size));
        this.f9693h = typedArrayM10751d.getDimension(R$styleable.Badge_badgeWithTextHeight, resources.getDimension(R$dimen.m3_badge_with_text_size));
        this.f9696k = typedArrayM10751d.getInt(R$styleable.Badge_offsetAlignmentMode, 1);
        this.f9697l = typedArrayM10751d.getInt(R$styleable.Badge_badgeFixedEdge, 0);
        BadgeState$State badgeState$State2 = this.f9687b;
        int i4 = badgeState$State.f12640i;
        badgeState$State2.f12640i = i4 == -2 ? 255 : i4;
        int i5 = badgeState$State.f12642k;
        if (i5 != -2) {
            badgeState$State2.f12642k = i5;
        } else {
            boolean zHasValue = typedArrayM10751d.hasValue(R$styleable.Badge_number);
            BadgeState$State badgeState$State3 = this.f9687b;
            if (zHasValue) {
                badgeState$State3.f12642k = typedArrayM10751d.getInt(R$styleable.Badge_number, 0);
            } else {
                badgeState$State3.f12642k = -1;
            }
        }
        String str = badgeState$State.f12641j;
        if (str != null) {
            this.f9687b.f12641j = str;
        } else if (typedArrayM10751d.hasValue(R$styleable.Badge_badgeText)) {
            this.f9687b.f12641j = typedArrayM10751d.getString(R$styleable.Badge_badgeText);
        }
        BadgeState$State badgeState$State4 = this.f9687b;
        badgeState$State4.f12615J = badgeState$State.f12615J;
        CharSequence charSequence = badgeState$State.f12616K;
        badgeState$State4.f12616K = charSequence == null ? context.getString(R$string.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State5 = this.f9687b;
        int i6 = badgeState$State.f12617L;
        badgeState$State5.f12617L = i6 == 0 ? R$plurals.mtrl_badge_content_description : i6;
        int i7 = badgeState$State.f12618M;
        badgeState$State5.f12618M = i7 == 0 ? R$string.mtrl_exceed_max_badge_number_content_description : i7;
        Boolean bool = badgeState$State.f12620O;
        badgeState$State5.f12620O = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State6 = this.f9687b;
        int i8 = badgeState$State.f12643l;
        badgeState$State6.f12643l = i8 == -2 ? typedArrayM10751d.getInt(R$styleable.Badge_maxCharacterCount, -2) : i8;
        BadgeState$State badgeState$State7 = this.f9687b;
        int i9 = badgeState$State.f12613H;
        badgeState$State7.f12613H = i9 == -2 ? typedArrayM10751d.getInt(R$styleable.Badge_maxNumber, -2) : i9;
        BadgeState$State badgeState$State8 = this.f9687b;
        Integer num = badgeState$State.f12636e;
        badgeState$State8.f12636e = Integer.valueOf(num == null ? typedArrayM10751d.getResourceId(R$styleable.Badge_badgeShapeAppearance, R$style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State9 = this.f9687b;
        Integer num2 = badgeState$State.f12637f;
        badgeState$State9.f12637f = Integer.valueOf(num2 == null ? typedArrayM10751d.getResourceId(R$styleable.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        BadgeState$State badgeState$State10 = this.f9687b;
        Integer num3 = badgeState$State.f12638g;
        badgeState$State10.f12638g = Integer.valueOf(num3 == null ? typedArrayM10751d.getResourceId(R$styleable.Badge_badgeWithTextShapeAppearance, R$style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State11 = this.f9687b;
        Integer num4 = badgeState$State.f12639h;
        badgeState$State11.f12639h = Integer.valueOf(num4 == null ? typedArrayM10751d.getResourceId(R$styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        BadgeState$State badgeState$State12 = this.f9687b;
        Integer num5 = badgeState$State.f12633b;
        badgeState$State12.f12633b = Integer.valueOf(num5 == null ? pb1.m19054x(context, typedArrayM10751d, R$styleable.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State13 = this.f9687b;
        Integer num6 = badgeState$State.f12635d;
        badgeState$State13.f12635d = Integer.valueOf(num6 == null ? typedArrayM10751d.getResourceId(R$styleable.Badge_badgeTextAppearance, R$style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.f12634c;
        if (num7 != null) {
            this.f9687b.f12634c = num7;
        } else {
            boolean zHasValue2 = typedArrayM10751d.hasValue(R$styleable.Badge_badgeTextColor);
            BadgeState$State badgeState$State14 = this.f9687b;
            if (zHasValue2) {
                badgeState$State14.f12634c = Integer.valueOf(pb1.m19054x(context, typedArrayM10751d, R$styleable.Badge_badgeTextColor).getDefaultColor());
            } else {
                int iIntValue = badgeState$State14.f12635d.intValue();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, androidx.appcompat.R$styleable.TextAppearance);
                typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R$styleable.TextAppearance_android_textSize, 0.0f);
                ColorStateList colorStateListM19054x = pb1.m19054x(context, typedArrayObtainStyledAttributes, androidx.appcompat.R$styleable.TextAppearance_android_textColor);
                pb1.m19054x(context, typedArrayObtainStyledAttributes, androidx.appcompat.R$styleable.TextAppearance_android_textColorHint);
                pb1.m19054x(context, typedArrayObtainStyledAttributes, androidx.appcompat.R$styleable.TextAppearance_android_textColorLink);
                typedArrayObtainStyledAttributes.getInt(androidx.appcompat.R$styleable.TextAppearance_android_textStyle, 0);
                typedArrayObtainStyledAttributes.getInt(androidx.appcompat.R$styleable.TextAppearance_android_typeface, 1);
                int i10 = androidx.appcompat.R$styleable.TextAppearance_fontFamily;
                i10 = typedArrayObtainStyledAttributes.hasValue(i10) ? i10 : androidx.appcompat.R$styleable.TextAppearance_android_fontFamily;
                typedArrayObtainStyledAttributes.getResourceId(i10, 0);
                typedArrayObtainStyledAttributes.getString(i10);
                typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R$styleable.TextAppearance_textAllCaps, false);
                pb1.m19054x(context, typedArrayObtainStyledAttributes, androidx.appcompat.R$styleable.TextAppearance_android_shadowColor);
                typedArrayObtainStyledAttributes.getFloat(androidx.appcompat.R$styleable.TextAppearance_android_shadowDx, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(androidx.appcompat.R$styleable.TextAppearance_android_shadowDy, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(androidx.appcompat.R$styleable.TextAppearance_android_shadowRadius, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, R$styleable.MaterialTextAppearance);
                typedArrayObtainStyledAttributes2.hasValue(R$styleable.MaterialTextAppearance_android_letterSpacing);
                typedArrayObtainStyledAttributes2.getFloat(R$styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
                int i11 = R$styleable.MaterialTextAppearance_fontVariationSettings;
                typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(i11) ? i11 : R$styleable.MaterialTextAppearance_android_fontVariationSettings);
                typedArrayObtainStyledAttributes2.recycle();
                this.f9687b.f12634c = Integer.valueOf(colorStateListM19054x.getDefaultColor());
            }
        }
        BadgeState$State badgeState$State15 = this.f9687b;
        Integer num8 = badgeState$State.f12619N;
        badgeState$State15.f12619N = Integer.valueOf(num8 == null ? typedArrayM10751d.getInt(R$styleable.Badge_badgeGravity, 8388661) : num8.intValue());
        BadgeState$State badgeState$State16 = this.f9687b;
        Integer num9 = badgeState$State.f12621P;
        badgeState$State16.f12621P = Integer.valueOf(num9 == null ? typedArrayM10751d.getDimensionPixelSize(R$styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R$dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State17 = this.f9687b;
        Integer num10 = badgeState$State.f12622Q;
        badgeState$State17.f12622Q = Integer.valueOf(num10 == null ? typedArrayM10751d.getDimensionPixelSize(R$styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R$dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State18 = this.f9687b;
        Integer num11 = badgeState$State.f12623R;
        badgeState$State18.f12623R = Integer.valueOf(num11 == null ? typedArrayM10751d.getDimensionPixelOffset(R$styleable.Badge_horizontalOffset, 0) : num11.intValue());
        BadgeState$State badgeState$State19 = this.f9687b;
        Integer num12 = badgeState$State.f12624S;
        badgeState$State19.f12624S = Integer.valueOf(num12 == null ? typedArrayM10751d.getDimensionPixelOffset(R$styleable.Badge_verticalOffset, 0) : num12.intValue());
        BadgeState$State badgeState$State20 = this.f9687b;
        Integer num13 = badgeState$State.f12625T;
        badgeState$State20.f12625T = Integer.valueOf(num13 == null ? typedArrayM10751d.getDimensionPixelOffset(R$styleable.Badge_horizontalOffsetWithText, badgeState$State20.f12623R.intValue()) : num13.intValue());
        BadgeState$State badgeState$State21 = this.f9687b;
        Integer num14 = badgeState$State.f12626U;
        badgeState$State21.f12626U = Integer.valueOf(num14 == null ? typedArrayM10751d.getDimensionPixelOffset(R$styleable.Badge_verticalOffsetWithText, badgeState$State21.f12624S.intValue()) : num14.intValue());
        BadgeState$State badgeState$State22 = this.f9687b;
        Integer num15 = badgeState$State.f12629X;
        badgeState$State22.f12629X = Integer.valueOf(num15 == null ? typedArrayM10751d.getDimensionPixelOffset(R$styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        BadgeState$State badgeState$State23 = this.f9687b;
        Integer num16 = badgeState$State.f12627V;
        badgeState$State23.f12627V = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State24 = this.f9687b;
        Integer num17 = badgeState$State.f12628W;
        badgeState$State24.f12628W = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State25 = this.f9687b;
        Boolean bool2 = badgeState$State.f12630Y;
        badgeState$State25.f12630Y = Boolean.valueOf(bool2 == null ? typedArrayM10751d.getBoolean(R$styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        typedArrayM10751d.recycle();
        Locale locale = badgeState$State.f12614I;
        BadgeState$State badgeState$State26 = this.f9687b;
        if (locale == null) {
            badgeState$State26.f12614I = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            badgeState$State26.f12614I = locale;
        }
        this.f9686a = badgeState$State;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4399a() {
        return this.f9687b.f12641j != null;
    }
}
