package p000;

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
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.constraintlayout.widget.R$styleable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class bj4 extends qh4 {

    /* JADX INFO: renamed from: w */
    public float f8605w;

    /* JADX INFO: renamed from: e */
    public float f8587e = 0.1f;

    /* JADX INFO: renamed from: f */
    public int f8588f = -1;

    /* JADX INFO: renamed from: g */
    public int f8589g = -1;

    /* JADX INFO: renamed from: h */
    public int f8590h = -1;

    /* JADX INFO: renamed from: i */
    public RectF f8591i = new RectF();

    /* JADX INFO: renamed from: j */
    public RectF f8592j = new RectF();

    /* JADX INFO: renamed from: k */
    public HashMap f8593k = new HashMap();

    /* JADX INFO: renamed from: l */
    public String f8594l = null;

    /* JADX INFO: renamed from: m */
    public int f8595m = -1;

    /* JADX INFO: renamed from: n */
    public String f8596n = null;

    /* JADX INFO: renamed from: o */
    public String f8597o = null;

    /* JADX INFO: renamed from: p */
    public int f8598p = -1;

    /* JADX INFO: renamed from: q */
    public int f8599q = -1;

    /* JADX INFO: renamed from: r */
    public View f8600r = null;

    /* JADX INFO: renamed from: s */
    public boolean f8601s = true;

    /* JADX INFO: renamed from: t */
    public boolean f8602t = true;

    /* JADX INFO: renamed from: u */
    public boolean f8603u = true;

    /* JADX INFO: renamed from: v */
    public float f8604v = Float.NaN;

    /* JADX INFO: renamed from: x */
    public boolean f8606x = false;

    public bj4() {
        this.f57782d = new HashMap();
    }

    /* JADX INFO: renamed from: i */
    public static void m3769i(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: a */
    public final void mo3770a(HashMap map) {
        throw null;
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qh4 clone() {
        bj4 bj4Var = new bj4();
        super.m19971c(this);
        bj4Var.f8594l = this.f8594l;
        bj4Var.f8595m = this.f8595m;
        bj4Var.f8596n = this.f8596n;
        bj4Var.f8597o = this.f8597o;
        bj4Var.f8598p = this.f8598p;
        bj4Var.f8599q = this.f8599q;
        bj4Var.f8600r = this.f8600r;
        bj4Var.f8587e = this.f8587e;
        bj4Var.f8601s = this.f8601s;
        bj4Var.f8602t = this.f8602t;
        bj4Var.f8603u = this.f8603u;
        bj4Var.f8604v = this.f8604v;
        bj4Var.f8605w = this.f8605w;
        bj4Var.f8606x = this.f8606x;
        bj4Var.f8591i = this.f8591i;
        bj4Var.f8592j = this.f8592j;
        bj4Var.f8593k = this.f8593k;
        return bj4Var;
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: d */
    public final void mo3772d(HashSet hashSet) {
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: e */
    public final void mo3773e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyTrigger);
        SparseIntArray sparseIntArray = aj4.f725a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = aj4.f725a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f8596n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f8597o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f8594l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f8587e = typedArrayObtainStyledAttributes.getFloat(index, this.f8587e);
                    break;
                case 6:
                    this.f8598p = typedArrayObtainStyledAttributes.getResourceId(index, this.f8598p);
                    break;
                case 7:
                    if (AbstractC0475b.f5366S0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f57780b);
                        this.f57780b = resourceId;
                        if (resourceId == -1) {
                            this.f57781c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f57781c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f57780b = typedArrayObtainStyledAttributes.getResourceId(index, this.f57780b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f57779a);
                    this.f57779a = integer;
                    this.f8604v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f8599q = typedArrayObtainStyledAttributes.getResourceId(index, this.f8599q);
                    break;
                case 10:
                    this.f8606x = typedArrayObtainStyledAttributes.getBoolean(index, this.f8606x);
                    break;
                case 11:
                    this.f8595m = typedArrayObtainStyledAttributes.getResourceId(index, this.f8595m);
                    break;
                case 12:
                    this.f8590h = typedArrayObtainStyledAttributes.getResourceId(index, this.f8590h);
                    break;
                case 13:
                    this.f8588f = typedArrayObtainStyledAttributes.getResourceId(index, this.f8588f);
                    break;
                case 14:
                    this.f8589g = typedArrayObtainStyledAttributes.getResourceId(index, this.f8589g);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX INFO: renamed from: g */
    public final void m3774g(View view, float f) {
        boolean z;
        boolean z2;
        float f2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        boolean z8 = false;
        if (this.f8599q != -1) {
            if (this.f8600r == null) {
                this.f8600r = ((ViewGroup) view.getParent()).findViewById(this.f8599q);
            }
            m3769i(this.f8591i, this.f8600r, this.f8606x);
            m3769i(this.f8592j, view, this.f8606x);
            boolean zIntersect = this.f8591i.intersect(this.f8592j);
            boolean z9 = this.f8601s;
            if (zIntersect) {
                if (z9) {
                    this.f8601s = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f8603u) {
                    this.f8603u = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f8602t = true;
            } else {
                if (z9) {
                    z = false;
                } else {
                    this.f8601s = true;
                    z = true;
                }
                if (this.f8602t) {
                    this.f8602t = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f8603u = true;
                boolean z10 = z5;
                z6 = false;
                z8 = z10;
            }
            z7 = z6;
        } else {
            boolean z11 = this.f8601s;
            float f6 = this.f8604v;
            if (z11) {
                if ((this.f8605w - f6) * (f - f6) < 0.0f) {
                    this.f8601s = false;
                    z = true;
                }
                z2 = this.f8602t;
                f2 = this.f8604v;
                if (z2) {
                    f5 = f - f2;
                    if ((this.f8605w - f2) * f5 >= 0.0f && f5 < 0.0f) {
                        this.f8602t = false;
                        z3 = true;
                    }
                    z4 = this.f8603u;
                    f3 = this.f8604v;
                    if (z4) {
                        f4 = f - f3;
                        if ((this.f8605w - f3) * f4 >= 0.0f && f4 > 0.0f) {
                            this.f8603u = false;
                        }
                        z8 = z3;
                    } else if (Math.abs(f - f3) > this.f8587e) {
                        this.f8603u = true;
                    }
                    z7 = false;
                    z8 = z3;
                } else if (Math.abs(f - f2) > this.f8587e) {
                    this.f8602t = true;
                }
                z3 = false;
                z4 = this.f8603u;
                f3 = this.f8604v;
                if (z4) {
                    f4 = f - f3;
                    if ((this.f8605w - f3) * f4 >= 0.0f) {
                    }
                    z8 = z3;
                } else if (Math.abs(f - f3) > this.f8587e) {
                    this.f8603u = true;
                }
                z7 = false;
                z8 = z3;
            } else if (Math.abs(f - f6) > this.f8587e) {
                this.f8601s = true;
            }
            z = false;
            z2 = this.f8602t;
            f2 = this.f8604v;
            if (z2) {
                f5 = f - f2;
                if ((this.f8605w - f2) * f5 >= 0.0f) {
                }
                z4 = this.f8603u;
                f3 = this.f8604v;
                if (z4) {
                    f4 = f - f3;
                    if ((this.f8605w - f3) * f4 >= 0.0f) {
                    }
                    z8 = z3;
                } else if (Math.abs(f - f3) > this.f8587e) {
                    this.f8603u = true;
                }
                z7 = false;
                z8 = z3;
            } else if (Math.abs(f - f2) > this.f8587e) {
                this.f8602t = true;
            }
            z3 = false;
            z4 = this.f8603u;
            f3 = this.f8604v;
            if (z4) {
                f4 = f - f3;
                if ((this.f8605w - f3) * f4 >= 0.0f) {
                }
                z8 = z3;
            } else if (Math.abs(f - f3) > this.f8587e) {
                this.f8603u = true;
            }
            z7 = false;
            z8 = z3;
        }
        this.f8605w = f;
        if (z8 || z || z7) {
            ((AbstractC0475b) view.getParent()).getClass();
        }
        View viewFindViewById = this.f8595m == -1 ? view : ((AbstractC0475b) view.getParent()).findViewById(this.f8595m);
        if (z8) {
            String str = this.f8596n;
            if (str != null) {
                m3775h(viewFindViewById, str);
            }
            if (this.f8588f != -1) {
                ((AbstractC0475b) view.getParent()).m1937B(this.f8588f, viewFindViewById);
            }
        }
        if (z7) {
            String str2 = this.f8597o;
            if (str2 != null) {
                m3775h(viewFindViewById, str2);
            }
            if (this.f8589g != -1) {
                ((AbstractC0475b) view.getParent()).m1937B(this.f8589g, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.f8594l;
            if (str3 != null) {
                m3775h(viewFindViewById, str3);
            }
            if (this.f8590h != -1) {
                ((AbstractC0475b) view.getParent()).m1937B(this.f8590h, viewFindViewById);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3775h(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f8593k.containsKey(str)) {
                method = (Method) this.f8593k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.f8593k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f8593k.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + qad.m19842d(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f8594l + "\"on class " + view.getClass().getSimpleName() + " " + qad.m19842d(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f57782d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                cj1 cj1Var = (cj1) this.f57782d.get(str2);
                if (cj1Var != null) {
                    Class<?> cls = view.getClass();
                    String str3 = cj1Var.f10160b;
                    String strM17734i = !cj1Var.f10159a ? AbstractC3393o1.m17734i("set", str3) : str3;
                    try {
                        int iOrdinal = cj1Var.f10161c.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strM17734i, cls2).invoke(view, Integer.valueOf(cj1Var.f10162d));
                                break;
                            case 1:
                                cls.getMethod(strM17734i, cls3).invoke(view, Float.valueOf(cj1Var.f10163e));
                                break;
                            case 2:
                                cls.getMethod(strM17734i, cls2).invoke(view, Integer.valueOf(cj1Var.f10166h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strM17734i, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(cj1Var.f10166h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strM17734i, CharSequence.class).invoke(view, cj1Var.f10164f);
                                break;
                            case 5:
                                cls.getMethod(strM17734i, Boolean.TYPE).invoke(view, Boolean.valueOf(cj1Var.f10165g));
                                break;
                            case 6:
                                cls.getMethod(strM17734i, cls3).invoke(view, Float.valueOf(cj1Var.f10163e));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbM17742q = AbstractC3393o1.m17742q(" Custom Attribute \"", str3, "\" not found on ");
                        sbM17742q.append(cls.getName());
                        Log.e("TransitionLayout", sbM17742q.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + strM17734i, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbM17742q2 = AbstractC3393o1.m17742q(" Custom Attribute \"", str3, "\" not found on ");
                        sbM17742q2.append(cls.getName());
                        Log.e("TransitionLayout", sbM17742q2.toString(), e3);
                    }
                }
            }
        }
    }
}
