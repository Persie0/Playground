package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p329q2.InterfaceC8491d;

/* JADX INFO: renamed from: androidx.appcompat.widget.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0311f0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f1174a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f1175b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f1176c = new Rect();

    /* JADX INFO: renamed from: androidx.appcompat.widget.f0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final boolean f1177a;

        /* JADX INFO: renamed from: b */
        public static final Method f1178b;

        /* JADX INFO: renamed from: c */
        public static final Field f1179c;

        /* JADX INFO: renamed from: d */
        public static final Field f1180d;

        /* JADX INFO: renamed from: e */
        public static final Field f1181e;

        /* JADX INFO: renamed from: f */
        public static final Field f1182f;

        /* JADX WARN: Code duplicated, block: B:25:0x005a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0069  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z10 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1178b = method;
                            f1179c = field;
                            f1180d = field2;
                            f1181e = field3;
                            f1182f = field4;
                            f1177a = true;
                            return;
                        }
                        f1178b = null;
                        f1179c = null;
                        f1180d = null;
                        f1181e = null;
                        f1182f = null;
                        f1177a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1178b = method;
                            f1179c = field;
                            f1180d = field2;
                            f1181e = field3;
                            f1182f = field4;
                            f1177a = true;
                            return;
                        }
                        f1178b = null;
                        f1179c = null;
                        f1180d = null;
                        f1181e = null;
                        f1182f = null;
                        f1177a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1178b = method;
                            f1179c = field;
                            f1180d = field2;
                            f1181e = field3;
                            f1182f = field4;
                            f1177a = true;
                            return;
                        }
                        f1178b = null;
                        f1179c = null;
                        f1180d = null;
                        f1181e = null;
                        f1182f = null;
                        f1177a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1178b = method;
                        f1179c = field;
                        f1180d = field2;
                        f1181e = field3;
                        f1182f = field4;
                        f1177a = true;
                        return;
                    }
                    f1178b = null;
                    f1179c = null;
                    f1180d = null;
                    f1181e = null;
                    f1182f = null;
                    f1177a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1178b = method;
                        f1179c = field;
                        f1180d = field2;
                        f1181e = field3;
                        f1182f = field4;
                        f1177a = true;
                        return;
                    }
                    f1178b = null;
                    f1179c = null;
                    f1180d = null;
                    f1181e = null;
                    f1182f = null;
                    f1177a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1178b = method;
                        f1179c = field;
                        f1180d = field2;
                        f1181e = field3;
                        f1182f = field4;
                        f1177a = true;
                        return;
                    }
                    f1178b = null;
                    f1179c = null;
                    f1180d = null;
                    f1181e = null;
                    f1182f = null;
                    f1177a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f1178b = method;
                f1179c = field;
                f1180d = field2;
                f1181e = field3;
                f1182f = field4;
                f1177a = true;
                return;
            }
            f1178b = null;
            f1179c = null;
            f1180d = null;
            f1181e = null;
            f1182f = null;
            f1177a = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.f0$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Insets m1189a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1186a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f1174a);
            } else {
                drawable.setState(f1175b);
            }
            drawable.setState(state);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Rect m1187b(Drawable drawable) {
        Object objM16578b;
        Drawable drawable2 = drawable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets insetsM1189a = b.m1189a(drawable2);
            return new Rect(insetsM1189a.left, insetsM1189a.top, insetsM1189a.right, insetsM1189a.bottom);
        }
        if (drawable2 instanceof InterfaceC8491d) {
            objM16578b = drawable2;
            objM16578b = ((InterfaceC8491d) drawable2).m16578b();
        }
        if (i10 >= 29) {
            boolean z10 = a.f1177a;
        } else if (a.f1177a) {
            try {
                Object objInvoke = a.f1178b.invoke(objM16578b, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(a.f1179c.getInt(objInvoke), a.f1180d.getInt(objInvoke), a.f1181e.getInt(objInvoke), a.f1182f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1176c;
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m1188c(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
