package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jma {

    /* JADX INFO: renamed from: a */
    private static final Object f34344a = new Object();

    /* JADX INFO: renamed from: b */
    private static volatile jlx f34345b;

    private jma() {
    }

    /* JADX INFO: renamed from: a */
    public static IInterface m13349a(Context context, String str, jlz jlzVar) throws jly {
        jjn jjnVar;
        if (f34345b == null) {
            synchronized (f34344a) {
                if (f34345b == null) {
                    f34345b = m13350b(context);
                }
            }
        }
        try {
            synchronized (jlx.f34341a) {
                if (jlx.f34342b == null) {
                    try {
                        jlx.f34342b = jjn.m13312d(context, jjn.f34171a, "com.google.android.gms.brella_dynamite");
                        jlx.m13344a(context, true);
                    } catch (jjj e) {
                        jlx.m13344a(context, false);
                        jlx.f34343c = true;
                        throw e;
                    }
                }
                jjnVar = jlx.f34342b;
            }
            IBinder iBinderM13319c = jjnVar.m13319c(str);
            IInterface iInterfaceMo13345a = iBinderM13319c == null ? null : jlzVar.mo13345a(iBinderM13319c);
            if (iInterfaceMo13345a != null) {
                return iInterfaceMo13345a;
            }
            throw new jly("null impl for ".concat(str));
        } catch (jjj e2) {
            throw new jly("Couldn't load impl " + str + ": " + e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static jlx m13350b(Context context) throws jly {
        Class<?> clsLoadClass;
        try {
            clsLoadClass = jma.class.getClassLoader().loadClass("com.google.android.gms.learning.internal.dynamite.FatDynamiteLoader");
        } catch (ClassNotFoundException e) {
            try {
                clsLoadClass = jma.class.getClassLoader().loadClass("jlx");
            } catch (ClassNotFoundException e2) {
                throw new jly("No dynamite loader found: ".concat(String.valueOf(e2.getMessage())), e2);
            }
        }
        try {
            return (jlx) clsLoadClass.getConstructor(Context.class).newInstance(context);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
            throw new jly("Failed to create dynamite loader instance: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
