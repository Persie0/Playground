package p312p2;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p286o2.C7904d;
import p404u2.C9393m;

/* JADX INFO: renamed from: p2.g */
/* JADX INFO: loaded from: classes.dex */
public class C8175g extends C8174f {

    /* JADX INFO: renamed from: f */
    public final Class<?> f44317f;

    /* JADX INFO: renamed from: g */
    public final Constructor<?> f44318g;

    /* JADX INFO: renamed from: h */
    public final Method f44319h;

    /* JADX INFO: renamed from: i */
    public final Method f44320i;

    /* JADX INFO: renamed from: j */
    public final Method f44321j;

    /* JADX INFO: renamed from: k */
    public final Method f44322k;

    /* JADX INFO: renamed from: l */
    public final Method f44323l;

    public C8175g() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodM16235l;
        Method methodM16236m;
        Method method2;
        Method methodMo16243n;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodM16235l = m16235l(cls);
            methodM16236m = m16236m(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodMo16243n = mo16243n(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method = null;
            constructor = null;
            methodM16235l = null;
            methodM16236m = null;
            method2 = null;
            methodMo16243n = null;
        }
        this.f44317f = cls;
        this.f44318g = constructor;
        this.f44319h = methodM16235l;
        this.f44320i = methodM16236m;
        this.f44321j = method2;
        this.f44322k = method;
        this.f44323l = methodMo16243n;
    }

    /* JADX INFO: renamed from: l */
    public static Method m16235l(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: m */
    public static Method m16236m(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // p312p2.C8174f, p312p2.C8181m
    /* JADX INFO: renamed from: a */
    public final Typeface mo16234a(Context context, C7904d.c cVar, Resources resources, int i10) {
        Object objNewInstance;
        if (!m16242k()) {
            return super.mo16234a(context, cVar, resources, i10);
        }
        try {
            objNewInstance = this.f44318g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (C7904d.d dVar : cVar.f43043a) {
            if (!m16239h(context, objNewInstance, dVar.f43044a, dVar.f43048e, dVar.f43045b, dVar.f43046c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f43047d))) {
                try {
                    this.f44322k.invoke(objNewInstance, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (m16241j(objNewInstance)) {
            return mo16240i(objNewInstance);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    @Override // p312p2.C8181m
    /* JADX INFO: renamed from: b */
    public final Typeface mo16237b(Context context, C9393m[] c9393mArr, int i10) {
        Object objNewInstance;
        Typeface typefaceMo16240i;
        boolean zBooleanValue;
        if (c9393mArr.length < 1) {
            return null;
        }
        if (!m16242k()) {
            C9393m c9393mMo16286e = mo16286e(i10, c9393mArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c9393mMo16286e.f48202a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c9393mMo16286e.f48204c).setItalic(c9393mMo16286e.f48205d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C9393m c9393m : c9393mArr) {
            if (c9393m.f48206e == 0) {
                Uri uri = c9393m.f48202a;
                if (!map.containsKey(uri)) {
                    map.put(uri, C8182n.m16294e(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        try {
            objNewInstance = this.f44318g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        int length = c9393mArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            Method method = this.f44322k;
            if (i11 >= length) {
                if (!z10) {
                    try {
                        method.invoke(objNewInstance, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                    return null;
                }
                if (m16241j(objNewInstance) && (typefaceMo16240i = mo16240i(objNewInstance)) != null) {
                    return Typeface.create(typefaceMo16240i, i10);
                }
                return null;
            }
            C9393m c9393m2 = c9393mArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c9393m2.f48202a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f44320i.invoke(objNewInstance, byteBuffer, Integer.valueOf(c9393m2.f48203b), null, Integer.valueOf(c9393m2.f48204c), Integer.valueOf(c9393m2.f48205d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused4) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    try {
                        method.invoke(objNewInstance, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                        return null;
                    }
                }
                z10 = true;
            }
            i11++;
            z10 = z10;
        }
    }

    @Override // p312p2.C8181m
    /* JADX INFO: renamed from: c */
    public final Typeface mo16238c(Context context, Resources resources, int i10, String str, int i11) {
        Object objNewInstance;
        if (!m16242k()) {
            return super.mo16238c(context, resources, i10, str, i11);
        }
        try {
            objNewInstance = this.f44318g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        if (!m16239h(context, objNewInstance, str, 0, -1, -1, null)) {
            try {
                this.f44322k.invoke(objNewInstance, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (m16241j(objNewInstance)) {
            return mo16240i(objNewInstance);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m16239h(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f44319h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public Typeface mo16240i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f44317f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f44323l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m16241j(Object obj) {
        try {
            return ((Boolean) this.f44321j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16242k() {
        Method method = this.f44319h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* JADX INFO: renamed from: n */
    public Method mo16243n(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
