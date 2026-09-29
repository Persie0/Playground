package p128g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p107f2.AbstractC5465d;
import p143h2.C5881d;

/* JADX INFO: renamed from: g2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5673k extends AbstractC5666d {

    /* JADX INFO: renamed from: q */
    public float f34580q;

    /* JADX INFO: renamed from: e */
    public String f34568e = null;

    /* JADX INFO: renamed from: f */
    public int f34569f = -1;

    /* JADX INFO: renamed from: g */
    public String f34570g = null;

    /* JADX INFO: renamed from: h */
    public String f34571h = null;

    /* JADX INFO: renamed from: i */
    public int f34572i = -1;

    /* JADX INFO: renamed from: j */
    public int f34573j = -1;

    /* JADX INFO: renamed from: k */
    public View f34574k = null;

    /* JADX INFO: renamed from: l */
    public float f34575l = 0.1f;

    /* JADX INFO: renamed from: m */
    public boolean f34576m = true;

    /* JADX INFO: renamed from: n */
    public boolean f34577n = true;

    /* JADX INFO: renamed from: o */
    public boolean f34578o = true;

    /* JADX INFO: renamed from: p */
    public float f34579p = Float.NaN;

    /* JADX INFO: renamed from: r */
    public boolean f34581r = false;

    /* JADX INFO: renamed from: s */
    public int f34582s = -1;

    /* JADX INFO: renamed from: t */
    public int f34583t = -1;

    /* JADX INFO: renamed from: u */
    public int f34584u = -1;

    /* JADX INFO: renamed from: v */
    public RectF f34585v = new RectF();

    /* JADX INFO: renamed from: w */
    public RectF f34586w = new RectF();

    /* JADX INFO: renamed from: x */
    public HashMap<String, Method> f34587x = new HashMap<>();

    /* JADX INFO: renamed from: g2.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final SparseIntArray f34588a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f34588a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public C5673k() {
        this.f34500d = new HashMap<>();
    }

    /* JADX INFO: renamed from: i */
    public static void m12032i(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: a */
    public final void mo12024a(HashMap<String, AbstractC5465d> map) {
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: b */
    public final AbstractC5666d clone() {
        C5673k c5673k = new C5673k();
        super.m12026c(this);
        c5673k.f34568e = this.f34568e;
        c5673k.f34569f = this.f34569f;
        c5673k.f34570g = this.f34570g;
        c5673k.f34571h = this.f34571h;
        c5673k.f34572i = this.f34572i;
        c5673k.f34573j = this.f34573j;
        c5673k.f34574k = this.f34574k;
        c5673k.f34575l = this.f34575l;
        c5673k.f34576m = this.f34576m;
        c5673k.f34577n = this.f34577n;
        c5673k.f34578o = this.f34578o;
        c5673k.f34579p = this.f34579p;
        c5673k.f34580q = this.f34580q;
        c5673k.f34581r = this.f34581r;
        c5673k.f34585v = this.f34585v;
        c5673k.f34586w = this.f34586w;
        c5673k.f34587x = this.f34587x;
        return c5673k;
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: d */
    public final void mo12027d(HashSet<String> hashSet) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: e */
    public final void mo12028e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35176j);
        SparseIntArray sparseIntArray = a.f34588a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f34588a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f34570g = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f34571h = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f34568e = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f34575l = typedArrayObtainStyledAttributes.getFloat(index, this.f34575l);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f34572i = typedArrayObtainStyledAttributes.getResourceId(index, this.f34572i);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (MotionLayout.f5046Z0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f34498b);
                        this.f34498b = resourceId;
                        if (resourceId == -1) {
                            this.f34499c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f34499c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f34498b = typedArrayObtainStyledAttributes.getResourceId(index, this.f34498b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f34497a);
                    this.f34497a = integer;
                    this.f34579p = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f34573j = typedArrayObtainStyledAttributes.getResourceId(index, this.f34573j);
                    break;
                case 10:
                    this.f34581r = typedArrayObtainStyledAttributes.getBoolean(index, this.f34581r);
                    break;
                case 11:
                    this.f34569f = typedArrayObtainStyledAttributes.getResourceId(index, this.f34569f);
                    break;
                case 12:
                    this.f34584u = typedArrayObtainStyledAttributes.getResourceId(index, this.f34584u);
                    break;
                case 13:
                    this.f34582s = typedArrayObtainStyledAttributes.getResourceId(index, this.f34582s);
                    break;
                case 14:
                    this.f34583t = typedArrayObtainStyledAttributes.getResourceId(index, this.f34583t);
                    break;
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117 A[PHI: r0 r5
      0x0117: PHI (r0v11 boolean) = (r0v7 boolean), (r0v7 boolean), (r0v12 boolean) binds: [B:50:0x00f2, B:52:0x00f7, B:58:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r5v13 boolean) = (r5v7 boolean), (r5v7 boolean), (r5v14 boolean) binds: [B:50:0x00f2, B:52:0x00f7, B:58:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    public final void m12033g(View view, float f3) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        boolean z13;
        float f12;
        float f13;
        if (this.f34573j != -1) {
            if (this.f34574k == null) {
                this.f34574k = ((ViewGroup) view.getParent()).findViewById(this.f34573j);
            }
            m12032i(this.f34585v, this.f34574k, this.f34581r);
            m12032i(this.f34586w, view, this.f34581r);
            if (this.f34585v.intersect(this.f34586w)) {
                if (this.f34576m) {
                    this.f34576m = false;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f34578o) {
                    this.f34578o = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f34577n = true;
                z11 = false;
            } else {
                if (this.f34576m) {
                    z10 = false;
                } else {
                    this.f34576m = true;
                    z10 = true;
                }
                if (this.f34577n) {
                    this.f34577n = false;
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f34578o = true;
                z11 = z12;
                z13 = false;
            }
        } else {
            if (this.f34576m) {
                float f14 = this.f34579p;
                if ((this.f34580q - f14) * (f3 - f14) < 0.0f) {
                    this.f34576m = false;
                    z10 = true;
                }
                if (this.f34577n) {
                    f12 = this.f34579p;
                    f13 = f3 - f12;
                    if ((this.f34580q - f12) * f13 >= 0.0f && f13 < 0.0f) {
                        this.f34577n = false;
                        z11 = true;
                    }
                    if (this.f34578o) {
                        f10 = this.f34579p;
                        f11 = f3 - f10;
                        if ((this.f34580q - f10) * f11 < 0.0f || f11 <= 0.0f) {
                            z13 = false;
                        } else {
                            this.f34578o = false;
                            z13 = true;
                        }
                    } else {
                        if (Math.abs(f3 - this.f34579p) > this.f34575l) {
                            this.f34578o = true;
                        }
                        z12 = z11;
                        z11 = z12;
                        z13 = false;
                    }
                } else if (Math.abs(f3 - this.f34579p) > this.f34575l) {
                    this.f34577n = true;
                }
                z11 = false;
                if (this.f34578o) {
                    f10 = this.f34579p;
                    f11 = f3 - f10;
                    if ((this.f34580q - f10) * f11 < 0.0f) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                } else {
                    if (Math.abs(f3 - this.f34579p) > this.f34575l) {
                        this.f34578o = true;
                    }
                    z12 = z11;
                    z11 = z12;
                    z13 = false;
                }
            } else if (Math.abs(f3 - this.f34579p) > this.f34575l) {
                this.f34576m = true;
            }
            z10 = false;
            if (this.f34577n) {
                f12 = this.f34579p;
                f13 = f3 - f12;
                if ((this.f34580q - f12) * f13 >= 0.0f) {
                }
                if (this.f34578o) {
                    f10 = this.f34579p;
                    f11 = f3 - f10;
                    if ((this.f34580q - f10) * f11 < 0.0f) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                } else {
                    if (Math.abs(f3 - this.f34579p) > this.f34575l) {
                        this.f34578o = true;
                    }
                    z12 = z11;
                    z11 = z12;
                    z13 = false;
                }
            } else if (Math.abs(f3 - this.f34579p) > this.f34575l) {
                this.f34577n = true;
            }
            z11 = false;
            if (this.f34578o) {
                f10 = this.f34579p;
                f11 = f3 - f10;
                if ((this.f34580q - f10) * f11 < 0.0f) {
                    z13 = false;
                } else {
                    z13 = false;
                }
            } else {
                if (Math.abs(f3 - this.f34579p) > this.f34575l) {
                    this.f34578o = true;
                }
                z12 = z11;
                z11 = z12;
                z13 = false;
            }
        }
        this.f34580q = f3;
        if (z11 || z10 || z13) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            MotionLayout.InterfaceC0752i interfaceC0752i = motionLayout.f5091h0;
            if (interfaceC0752i != null) {
                interfaceC0752i.mo2826b();
            }
            CopyOnWriteArrayList<MotionLayout.InterfaceC0752i> copyOnWriteArrayList = motionLayout.f5108y0;
            if (copyOnWriteArrayList != null) {
                Iterator<MotionLayout.InterfaceC0752i> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo2826b();
                }
            }
        }
        View viewFindViewById = this.f34569f == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.f34569f);
        if (z11) {
            String str = this.f34570g;
            if (str != null) {
                m12034h(viewFindViewById, str);
            }
            if (this.f34582s != -1) {
                ((MotionLayout) view.getParent()).m2801M(this.f34582s, viewFindViewById);
            }
        }
        if (z13) {
            String str2 = this.f34571h;
            if (str2 != null) {
                m12034h(viewFindViewById, str2);
            }
            if (this.f34583t != -1) {
                ((MotionLayout) view.getParent()).m2801M(this.f34583t, viewFindViewById);
            }
        }
        if (z10) {
            String str3 = this.f34568e;
            if (str3 != null) {
                m12034h(viewFindViewById, str3);
            }
            if (this.f34584u != -1) {
                ((MotionLayout) view.getParent()).m2801M(this.f34584u, viewFindViewById);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12034h(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f34587x.containsKey(str)) {
                method = this.f34587x.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f34587x.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f34587x.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + C5663a.m12021d(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f34568e + "\"on class " + view.getClass().getSimpleName() + " " + C5663a.m12021d(view));
                return;
            }
        }
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f34500d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f34500d.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    boolean z11 = constraintAttribute.f5261a;
                    String str3 = constraintAttribute.f5262b;
                    String strM852k = !z11 ? C0204c.m852k("set", str3) : str3;
                    try {
                        switch (ConstraintAttribute.C0757a.f5269a[constraintAttribute.f5263c.ordinal()]) {
                            case 1:
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
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
                                Method method2 = cls.getMethod(strM852k, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.f5268h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                cls.getMethod(strM852k, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f5265e));
                                break;
                            case 8:
                                cls.getMethod(strM852k, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f5265e));
                                break;
                        }
                    } catch (IllegalAccessException e10) {
                        StringBuilder sbM854m = C0204c.m854m(" Custom Attribute \"", str3, "\" not found on ");
                        sbM854m.append(cls.getName());
                        Log.e("TransitionLayout", sbM854m.toString());
                        e10.printStackTrace();
                    } catch (NoSuchMethodException e11) {
                        Log.e("TransitionLayout", e11.getMessage());
                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + strM852k);
                    } catch (InvocationTargetException e12) {
                        StringBuilder sbM854m2 = C0204c.m854m(" Custom Attribute \"", str3, "\" not found on ");
                        sbM854m2.append(cls.getName());
                        Log.e("TransitionLayout", sbM854m2.toString());
                        e12.printStackTrace();
                    }
                }
            }
        }
    }
}
