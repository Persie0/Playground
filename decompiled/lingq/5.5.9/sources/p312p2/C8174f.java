package p312p2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p286o2.C7904d;

/* JADX INFO: renamed from: p2.f */
/* JADX INFO: loaded from: classes.dex */
public class C8174f extends C8181m {

    /* JADX INFO: renamed from: a */
    public static Class<?> f44312a;

    /* JADX INFO: renamed from: b */
    public static Constructor<?> f44313b;

    /* JADX INFO: renamed from: c */
    public static Method f44314c;

    /* JADX INFO: renamed from: d */
    public static Method f44315d;

    /* JADX INFO: renamed from: e */
    public static boolean f44316e;

    /* JADX INFO: renamed from: f */
    public static boolean m16232f(Object obj, String str, int i10, boolean z10) {
        m16233g();
        try {
            return ((Boolean) f44314c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m16233g() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f44316e) {
            return;
        }
        f44316e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f44313b = constructor;
        f44312a = cls;
        f44314c = method2;
        f44315d = method;
    }

    @Override // p312p2.C8181m
    /* JADX INFO: renamed from: a */
    public Typeface mo16234a(Context context, C7904d.c cVar, Resources resources, int i10) {
        m16233g();
        try {
            Object objNewInstance = f44313b.newInstance(new Object[0]);
            for (C7904d.d dVar : cVar.f43043a) {
                File fileM16293d = C8182n.m16293d(context);
                if (fileM16293d == null) {
                    return null;
                }
                try {
                    if (!C8182n.m16291b(fileM16293d, resources, dVar.f43049f)) {
                        return null;
                    }
                    if (!m16232f(objNewInstance, fileM16293d.getPath(), dVar.f43045b, dVar.f43046c)) {
                        return null;
                    }
                    fileM16293d.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM16293d.delete();
                }
            }
            m16233g();
            try {
                Object objNewInstance2 = Array.newInstance(f44312a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f44315d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
