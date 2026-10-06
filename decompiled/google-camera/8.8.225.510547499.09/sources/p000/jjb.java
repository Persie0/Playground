package p000;

import android.os.IBinder;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjb extends cbr implements jjc {

    /* JADX INFO: renamed from: a */
    private final Object f34163a;

    public jjb() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    /* JADX INFO: renamed from: b */
    public static jjc m13304b(Object obj) {
        return new jjb(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Object m13305c(jjc jjcVar) {
        if (jjcVar instanceof jjb) {
            return ((jjb) jjcVar).f34163a;
        }
        IBinder iBinderAsBinder = jjcVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        jib.m13205j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    private jjb(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f34163a = obj;
    }
}
