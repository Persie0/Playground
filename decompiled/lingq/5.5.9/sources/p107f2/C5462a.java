package p107f2;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p128g2.C5663a;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5462a {

    /* JADX INFO: renamed from: f2.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34031a;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            f34031a = iArr;
            try {
                iArr[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34031a[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34031a[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34031a[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34031a[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34031a[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34031a[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11701a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: b */
    public static void m11702b(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + constraintAttribute.f5262b;
        try {
            boolean z10 = true;
            switch (a.f34031a[constraintAttribute.f5263c.ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM11701a = (m11701a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m11701a((int) (fArr[3] * 255.0f)) << 24) | (m11701a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m11701a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM11701a);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((m11701a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m11701a((int) (fArr[3] * 255.0f)) << 24) | (m11701a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m11701a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.f5262b);
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    objArr[0] = Boolean.valueOf(z10);
                    method2.invoke(view, objArr);
                    return;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            StringBuilder sbM854m = C0204c.m854m("cannot access method ", str, " on View \"");
            sbM854m.append(C5663a.m12021d(view));
            sbM854m.append("\"");
            Log.e("CustomSupport", sbM854m.toString());
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            StringBuilder sbM854m2 = C0204c.m854m("no method ", str, " on View \"");
            sbM854m2.append(C5663a.m12021d(view));
            sbM854m2.append("\"");
            Log.e("CustomSupport", sbM854m2.toString());
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }
}
