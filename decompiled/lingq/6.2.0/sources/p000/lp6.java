package p000;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class lp6 extends qcb implements by3 {

    /* JADX INFO: renamed from: g */
    public final Object f49979g;

    public lp6(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.f49979g = obj;
    }

    /* JADX INFO: renamed from: H */
    public static by3 m16421H(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof by3 ? (by3) iInterfaceQueryLocalInterface : new hob(iBinder);
    }

    /* JADX INFO: renamed from: I */
    public static Object m16422I(by3 by3Var) {
        if (by3Var instanceof lp6) {
            return ((lp6) by3Var).f49979g;
        }
        IBinder iBinderAsBinder = by3Var.asBinder();
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
            int length = declaredFields.length;
            C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
            return null;
        }
        lda.m16130p(field);
        if (field.isAccessible()) {
            C3386nv.m17626m("IObjectWrapper declared field not private!");
            return null;
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
}
