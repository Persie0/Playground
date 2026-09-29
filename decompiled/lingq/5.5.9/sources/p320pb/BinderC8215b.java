package p320pb;

import android.os.IBinder;
import android.support.v4.media.session.C0166e;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import p176ib.C6272i;

/* JADX INFO: renamed from: pb.b */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC8215b<T> extends InterfaceC8214a.a {

    /* JADX INFO: renamed from: a */
    public final Object f44471a;

    public BinderC8215b(Object obj) {
        this.f44471a = obj;
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: h0 */
    public static <T> T m16362h0(InterfaceC8214a interfaceC8214a) {
        if (interfaceC8214a instanceof BinderC8215b) {
            return (T) ((BinderC8215b) interfaceC8214a).f44471a;
        }
        IBinder iBinderAsBinder = interfaceC8214a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(C0166e.m761g("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        C6272i.m12915i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
