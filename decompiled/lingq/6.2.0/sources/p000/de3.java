package p000;

import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.Fragment$InstantiationException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class de3 {

    /* JADX INFO: renamed from: b */
    public static final l79 f35493b = new l79(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0638f f35494a;

    public de3(AbstractC0638f abstractC0638f) {
        this.f35494a = abstractC0638f;
    }

    /* JADX INFO: renamed from: b */
    public static Class m10307b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        l79 l79Var = f35493b;
        l79 l79Var2 = (l79) l79Var.get(classLoader);
        if (l79Var2 == null) {
            l79Var2 = new l79(0);
            l79Var.put(classLoader, l79Var2);
        }
        Class cls = (Class) l79Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        l79Var2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m10308c(ClassLoader classLoader, String str) {
        try {
            return m10307b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(wq1.m24118n("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(wq1.m24118n("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0635c m10309a(String str) {
        try {
            return (AbstractComponentCallbacksC0635c) m10308c(this.f35494a.f5763x.f42210L.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(wq1.m24118n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(wq1.m24118n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(wq1.m24118n("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(wq1.m24118n("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
