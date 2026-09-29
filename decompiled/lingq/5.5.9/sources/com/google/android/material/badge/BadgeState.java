package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.linguist.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p072dd.C5150c;
import p153hc.C6031a;
import p507yc.C10344k;

/* JADX INFO: loaded from: classes.dex */
public final class BadgeState {

    /* JADX INFO: renamed from: a */
    public final State f14720a;

    /* JADX INFO: renamed from: b */
    public final State f14721b = new State();

    /* JADX INFO: renamed from: c */
    public final float f14722c;

    /* JADX INFO: renamed from: d */
    public final float f14723d;

    /* JADX INFO: renamed from: e */
    public final float f14724e;

    /* JADX INFO: renamed from: f */
    public final float f14725f;

    /* JADX INFO: renamed from: g */
    public final float f14726g;

    /* JADX INFO: renamed from: h */
    public final float f14727h;

    /* JADX INFO: renamed from: i */
    public final float f14728i;

    /* JADX INFO: renamed from: j */
    public final int f14729j;

    /* JADX INFO: renamed from: k */
    public final int f14730k;

    /* JADX INFO: renamed from: l */
    public final int f14731l;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C2946a();

        /* JADX INFO: renamed from: H */
        public CharSequence f14732H;

        /* JADX INFO: renamed from: I */
        public int f14733I;

        /* JADX INFO: renamed from: J */
        public int f14734J;

        /* JADX INFO: renamed from: K */
        public Integer f14735K;

        /* JADX INFO: renamed from: L */
        public Boolean f14736L;

        /* JADX INFO: renamed from: M */
        public Integer f14737M;

        /* JADX INFO: renamed from: N */
        public Integer f14738N;

        /* JADX INFO: renamed from: O */
        public Integer f14739O;

        /* JADX INFO: renamed from: P */
        public Integer f14740P;

        /* JADX INFO: renamed from: Q */
        public Integer f14741Q;

        /* JADX INFO: renamed from: R */
        public Integer f14742R;

        /* JADX INFO: renamed from: a */
        public int f14743a;

        /* JADX INFO: renamed from: b */
        public Integer f14744b;

        /* JADX INFO: renamed from: c */
        public Integer f14745c;

        /* JADX INFO: renamed from: d */
        public Integer f14746d;

        /* JADX INFO: renamed from: e */
        public Integer f14747e;

        /* JADX INFO: renamed from: f */
        public Integer f14748f;

        /* JADX INFO: renamed from: g */
        public Integer f14749g;

        /* JADX INFO: renamed from: h */
        public Integer f14750h;

        /* JADX INFO: renamed from: i */
        public int f14751i;

        /* JADX INFO: renamed from: j */
        public int f14752j;

        /* JADX INFO: renamed from: k */
        public int f14753k;

        /* JADX INFO: renamed from: l */
        public Locale f14754l;

        /* JADX INFO: renamed from: com.google.android.material.badge.BadgeState$State$a */
        public class C2946a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
            this.f14751i = 255;
            this.f14752j = -2;
            this.f14753k = -2;
            this.f14736L = Boolean.TRUE;
        }

        public State(Parcel parcel) {
            this.f14751i = 255;
            this.f14752j = -2;
            this.f14753k = -2;
            this.f14736L = Boolean.TRUE;
            this.f14743a = parcel.readInt();
            this.f14744b = (Integer) parcel.readSerializable();
            this.f14745c = (Integer) parcel.readSerializable();
            this.f14746d = (Integer) parcel.readSerializable();
            this.f14747e = (Integer) parcel.readSerializable();
            this.f14748f = (Integer) parcel.readSerializable();
            this.f14749g = (Integer) parcel.readSerializable();
            this.f14750h = (Integer) parcel.readSerializable();
            this.f14751i = parcel.readInt();
            this.f14752j = parcel.readInt();
            this.f14753k = parcel.readInt();
            this.f14732H = parcel.readString();
            this.f14733I = parcel.readInt();
            this.f14735K = (Integer) parcel.readSerializable();
            this.f14737M = (Integer) parcel.readSerializable();
            this.f14738N = (Integer) parcel.readSerializable();
            this.f14739O = (Integer) parcel.readSerializable();
            this.f14740P = (Integer) parcel.readSerializable();
            this.f14741Q = (Integer) parcel.readSerializable();
            this.f14742R = (Integer) parcel.readSerializable();
            this.f14736L = (Boolean) parcel.readSerializable();
            this.f14754l = (Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f14743a);
            parcel.writeSerializable(this.f14744b);
            parcel.writeSerializable(this.f14745c);
            parcel.writeSerializable(this.f14746d);
            parcel.writeSerializable(this.f14747e);
            parcel.writeSerializable(this.f14748f);
            parcel.writeSerializable(this.f14749g);
            parcel.writeSerializable(this.f14750h);
            parcel.writeInt(this.f14751i);
            parcel.writeInt(this.f14752j);
            parcel.writeInt(this.f14753k);
            CharSequence charSequence = this.f14732H;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f14733I);
            parcel.writeSerializable(this.f14735K);
            parcel.writeSerializable(this.f14737M);
            parcel.writeSerializable(this.f14738N);
            parcel.writeSerializable(this.f14739O);
            parcel.writeSerializable(this.f14740P);
            parcel.writeSerializable(this.f14741Q);
            parcel.writeSerializable(this.f14742R);
            parcel.writeSerializable(this.f14736L);
            parcel.writeSerializable(this.f14754l);
        }
    }

    public BadgeState(Context context, State state) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        State state2 = state == null ? new State() : state;
        int i10 = state2.f14743a;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
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
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                attributeSet = attributeSetAsAttributeSet;
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayM19357d = C10344k.m19357d(context, attributeSet, C6031a.f35653c, R.attr.badgeStyle, styleAttribute == 0 ? 2132149372 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f14722c = typedArrayM19357d.getDimensionPixelSize(3, -1);
        this.f14728i = typedArrayM19357d.getDimensionPixelSize(8, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f14729j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f14730k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f14723d = typedArrayM19357d.getDimensionPixelSize(11, -1);
        this.f14724e = typedArrayM19357d.getDimension(9, resources.getDimension(R.dimen.m3_badge_size));
        this.f14726g = typedArrayM19357d.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f14725f = typedArrayM19357d.getDimension(2, resources.getDimension(R.dimen.m3_badge_size));
        this.f14727h = typedArrayM19357d.getDimension(10, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f14731l = typedArrayM19357d.getInt(19, 1);
        State state3 = this.f14721b;
        int i11 = state2.f14751i;
        state3.f14751i = i11 == -2 ? 255 : i11;
        CharSequence charSequence = state2.f14732H;
        state3.f14732H = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state4 = this.f14721b;
        int i12 = state2.f14733I;
        state4.f14733I = i12 == 0 ? R.plurals.mtrl_badge_content_description : i12;
        int i13 = state2.f14734J;
        state4.f14734J = i13 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i13;
        Boolean bool = state2.f14736L;
        state4.f14736L = Boolean.valueOf(bool == null || bool.booleanValue());
        State state5 = this.f14721b;
        int i14 = state2.f14753k;
        state5.f14753k = i14 == -2 ? typedArrayM19357d.getInt(17, 4) : i14;
        int i15 = state2.f14752j;
        if (i15 != -2) {
            this.f14721b.f14752j = i15;
        } else if (typedArrayM19357d.hasValue(18)) {
            this.f14721b.f14752j = typedArrayM19357d.getInt(18, 0);
        } else {
            this.f14721b.f14752j = -1;
        }
        State state6 = this.f14721b;
        Integer num = state2.f14747e;
        state6.f14747e = Integer.valueOf(num == null ? typedArrayM19357d.getResourceId(4, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state7 = this.f14721b;
        Integer num2 = state2.f14748f;
        state7.f14748f = Integer.valueOf(num2 == null ? typedArrayM19357d.getResourceId(5, 0) : num2.intValue());
        State state8 = this.f14721b;
        Integer num3 = state2.f14749g;
        state8.f14749g = Integer.valueOf(num3 == null ? typedArrayM19357d.getResourceId(12, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state9 = this.f14721b;
        Integer num4 = state2.f14750h;
        state9.f14750h = Integer.valueOf(num4 == null ? typedArrayM19357d.getResourceId(13, 0) : num4.intValue());
        State state10 = this.f14721b;
        Integer num5 = state2.f14744b;
        state10.f14744b = Integer.valueOf(num5 == null ? C5150c.m10925a(context, typedArrayM19357d, 0).getDefaultColor() : num5.intValue());
        State state11 = this.f14721b;
        Integer num6 = state2.f14746d;
        state11.f14746d = Integer.valueOf(num6 == null ? typedArrayM19357d.getResourceId(6, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state2.f14745c;
        if (num7 != null) {
            this.f14721b.f14745c = num7;
        } else if (typedArrayM19357d.hasValue(7)) {
            this.f14721b.f14745c = Integer.valueOf(C5150c.m10925a(context, typedArrayM19357d, 7).getDefaultColor());
        } else {
            int iIntValue = this.f14721b.f14746d.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, C6031a.f35646O);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListM10925a = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 3);
            C5150c.m10925a(context, typedArrayObtainStyledAttributes, 4);
            C5150c.m10925a(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i16 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i16, 0);
            typedArrayObtainStyledAttributes.getString(i16);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            C5150c.m10925a(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, C6031a.f35676z);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f14721b.f14745c = Integer.valueOf(colorStateListM10925a.getDefaultColor());
        }
        State state12 = this.f14721b;
        Integer num8 = state2.f14735K;
        state12.f14735K = Integer.valueOf(num8 == null ? typedArrayM19357d.getInt(1, 8388661) : num8.intValue());
        State state13 = this.f14721b;
        Integer num9 = state2.f14737M;
        state13.f14737M = Integer.valueOf(num9 == null ? typedArrayM19357d.getDimensionPixelOffset(15, 0) : num9.intValue());
        State state14 = this.f14721b;
        Integer num10 = state2.f14738N;
        state14.f14738N = Integer.valueOf(num10 == null ? typedArrayM19357d.getDimensionPixelOffset(20, 0) : num10.intValue());
        State state15 = this.f14721b;
        Integer num11 = state2.f14739O;
        state15.f14739O = Integer.valueOf(num11 == null ? typedArrayM19357d.getDimensionPixelOffset(16, state15.f14737M.intValue()) : num11.intValue());
        State state16 = this.f14721b;
        Integer num12 = state2.f14740P;
        state16.f14740P = Integer.valueOf(num12 == null ? typedArrayM19357d.getDimensionPixelOffset(21, state16.f14738N.intValue()) : num12.intValue());
        State state17 = this.f14721b;
        Integer num13 = state2.f14741Q;
        state17.f14741Q = Integer.valueOf(num13 == null ? 0 : num13.intValue());
        State state18 = this.f14721b;
        Integer num14 = state2.f14742R;
        state18.f14742R = Integer.valueOf(num14 != null ? num14.intValue() : 0);
        typedArrayM19357d.recycle();
        Locale locale = state2.f14754l;
        if (locale == null) {
            this.f14721b.f14754l = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f14721b.f14754l = locale;
        }
        this.f14720a = state2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8571a() {
        return this.f14721b.f14752j != -1;
    }
}
