package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import p143h2.C5881d;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAttribute {

    /* JADX INFO: renamed from: a */
    public final boolean f5261a;

    /* JADX INFO: renamed from: b */
    public final String f5262b;

    /* JADX INFO: renamed from: c */
    public final AttributeType f5263c;

    /* JADX INFO: renamed from: d */
    public int f5264d;

    /* JADX INFO: renamed from: e */
    public float f5265e;

    /* JADX INFO: renamed from: f */
    public String f5266f;

    /* JADX INFO: renamed from: g */
    public boolean f5267g;

    /* JADX INFO: renamed from: h */
    public int f5268h;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintAttribute$a */
    public static /* synthetic */ class C0757a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5269a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f5269a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5269a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5269a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5269a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5269a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5269a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5269a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5269a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f5261a = false;
        this.f5262b = constraintAttribute.f5262b;
        this.f5263c = constraintAttribute.f5263c;
        m2861f(obj);
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z10) {
        this.f5261a = false;
        this.f5262b = str;
        this.f5263c = attributeType;
        this.f5261a = z10;
        m2861f(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m2856d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35171e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    attributeType = AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    attributeType = AttributeType.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new ConstraintAttribute(string, attributeType2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: e */
    public static void m2857e(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            String strM852k = !constraintAttribute.f5261a ? C0204c.m852k("set", str) : str;
            try {
                switch (C0757a.f5269a[constraintAttribute.f5263c.ordinal()]) {
                    case 1:
                        cls.getMethod(strM852k, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f5264d));
                        break;
                    case 2:
                        cls.getMethod(strM852k, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f5267g));
                        break;
                    case 3:
                        cls.getMethod(strM852k, CharSequence.class).invoke(view, constraintAttribute.f5266f);
                        break;
                    case 4:
                        cls.getMethod(strM852k, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f5268h));
                        break;
                    case 5:
                        Method method = cls.getMethod(strM852k, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f5268h);
                        method.invoke(view, colorDrawable);
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        cls.getMethod(strM852k, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f5264d));
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        cls.getMethod(strM852k, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f5265e));
                        break;
                    case 8:
                        cls.getMethod(strM852k, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f5265e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder sbM854m = C0204c.m854m(" Custom Attribute \"", str, "\" not found on ");
                sbM854m.append(cls.getName());
                Log.e("TransitionLayout", sbM854m.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strM852k);
            } catch (InvocationTargetException e12) {
                StringBuilder sbM854m2 = C0204c.m854m(" Custom Attribute \"", str, "\" not found on ");
                sbM854m2.append(cls.getName());
                Log.e("TransitionLayout", sbM854m2.toString());
                e12.printStackTrace();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final float m2858a() {
        switch (C0757a.f5269a[this.f5263c.ordinal()]) {
            case 2:
                return this.f5267g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f5264d;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f5265e;
            case 8:
                return this.f5265e;
            default:
                return Float.NaN;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m2859b(float[] fArr) {
        switch (C0757a.f5269a[this.f5263c.ordinal()]) {
            case 2:
                fArr[0] = this.f5267g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i10 = this.f5268h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                fArr[0] = this.f5264d;
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                fArr[0] = this.f5265e;
                return;
            case 8:
                fArr[0] = this.f5265e;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2860c() {
        int i10 = C0757a.f5269a[this.f5263c.ordinal()];
        return (i10 == 4 || i10 == 5) ? 4 : 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m2861f(Object obj) {
        switch (C0757a.f5269a[this.f5263c.ordinal()]) {
            case 1:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f5264d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f5267g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f5266f = (String) obj;
                break;
            case 4:
            case 5:
                this.f5268h = ((Integer) obj).intValue();
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f5265e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f5265e = ((Float) obj).floatValue();
                break;
            default:
                break;
        }
    }
}
