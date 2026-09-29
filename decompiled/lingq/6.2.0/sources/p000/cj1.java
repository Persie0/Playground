package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import androidx.constraintlayout.widget.R$styleable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class cj1 {

    /* JADX INFO: renamed from: a */
    public boolean f10159a = false;

    /* JADX INFO: renamed from: b */
    public String f10160b;

    /* JADX INFO: renamed from: c */
    public ConstraintAttribute$AttributeType f10161c;

    /* JADX INFO: renamed from: d */
    public int f10162d;

    /* JADX INFO: renamed from: e */
    public float f10163e;

    /* JADX INFO: renamed from: f */
    public String f10164f;

    /* JADX INFO: renamed from: g */
    public boolean f10165g;

    /* JADX INFO: renamed from: h */
    public int f10166h;

    public cj1(cj1 cj1Var, Object obj) {
        this.f10160b = cj1Var.f10160b;
        this.f10161c = cj1Var.f10161c;
        m4768g(obj);
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m4762a(View view, HashMap map) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            cj1 cj1Var = (cj1) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new cj1(cj1Var, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new cj1(cj1Var, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbM17742q = AbstractC3393o1.m17742q(" Custom Attribute \"", str, "\" not found on ");
                sbM17742q.append(cls.getName());
                Log.e("TransitionLayout", sbM17742q.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sbM17742q2 = AbstractC3393o1.m17742q(" Custom Attribute \"", str, "\" not found on ");
                sbM17742q2.append(cls.getName());
                Log.e("TransitionLayout", sbM17742q2.toString(), e3);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: e */
    public static void m4763e(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == R$styleable.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == R$styleable.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                constraintAttribute$AttributeType2 = ConstraintAttribute$AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == R$styleable.CustomAttribute_customColorValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == R$styleable.CustomAttribute_customColorDrawableValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == R$styleable.CustomAttribute_customPixelDimension) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == R$styleable.CustomAttribute_customDimension) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R$styleable.CustomAttribute_customFloatValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == R$styleable.CustomAttribute_customIntegerValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == R$styleable.CustomAttribute_customStringValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R$styleable.CustomAttribute_customReference) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                constraintAttribute$AttributeType2 = constraintAttribute$AttributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            cj1 cj1Var = new cj1();
            cj1Var.f10160b = string;
            cj1Var.f10161c = constraintAttribute$AttributeType2;
            cj1Var.f10159a = z;
            cj1Var.m4768g(objValueOf2);
            map.put(string, cj1Var);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static void m4764f(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            cj1 cj1Var = (cj1) map.get(str);
            String strM17734i = !cj1Var.f10159a ? AbstractC3393o1.m17734i("set", str) : str;
            try {
                int iOrdinal = cj1Var.f10161c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strM17734i, cls3).invoke(view, Integer.valueOf(cj1Var.f10162d));
                        break;
                    case 1:
                        cls.getMethod(strM17734i, cls2).invoke(view, Float.valueOf(cj1Var.f10163e));
                        break;
                    case 2:
                        cls.getMethod(strM17734i, cls3).invoke(view, Integer.valueOf(cj1Var.f10166h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strM17734i, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(cj1Var.f10166h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strM17734i, CharSequence.class).invoke(view, cj1Var.f10164f);
                        break;
                    case 5:
                        cls.getMethod(strM17734i, Boolean.TYPE).invoke(view, Boolean.valueOf(cj1Var.f10165g));
                        break;
                    case 6:
                        cls.getMethod(strM17734i, cls2).invoke(view, Float.valueOf(cj1Var.f10163e));
                        break;
                    case 7:
                        cls.getMethod(strM17734i, cls3).invoke(view, Integer.valueOf(cj1Var.f10162d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbM17742q = AbstractC3393o1.m17742q(" Custom Attribute \"", str, "\" not found on ");
                sbM17742q.append(cls.getName());
                Log.e("TransitionLayout", sbM17742q.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strM17734i, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sbM17742q2 = AbstractC3393o1.m17742q(" Custom Attribute \"", str, "\" not found on ");
                sbM17742q2.append(cls.getName());
                Log.e("TransitionLayout", sbM17742q2.toString(), e3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m4765b() {
        switch (this.f10161c) {
            case INT_TYPE:
                return this.f10162d;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f10163e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                ho2.m13385e("Color does not have a single color to interpolate");
                return 0.0f;
            case STRING_TYPE:
                ho2.m13385e("Cannot interpolate String");
                return 0.0f;
            case BOOLEAN_TYPE:
                return this.f10165g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4766c(float[] fArr) {
        switch (this.f10161c) {
            case INT_TYPE:
                fArr[0] = this.f10162d;
                break;
            case FLOAT_TYPE:
                fArr[0] = this.f10163e;
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i = this.f10166h;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                break;
            case STRING_TYPE:
                ho2.m13385e("Color does not have a single color to interpolate");
                break;
            case BOOLEAN_TYPE:
                fArr[0] = this.f10165g ? 1.0f : 0.0f;
                break;
            case DIMENSION_TYPE:
                fArr[0] = this.f10163e;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m4767d() {
        int iOrdinal = this.f10161c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m4768g(Object obj) {
        switch (this.f10161c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f10162d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f10163e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f10166h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f10164f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f10165g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f10163e = ((Float) obj).floatValue();
                break;
        }
    }
}
