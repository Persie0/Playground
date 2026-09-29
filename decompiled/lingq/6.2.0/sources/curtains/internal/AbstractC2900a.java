package curtains.internal;

import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.ii8;
import p000.vi3;

/* JADX INFO: renamed from: curtains.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2900a {
    /* JADX INFO: renamed from: a */
    public static ii8 m9901a() {
        Field field;
        final ii8 ii8Var = new ii8();
        vi3 vi3Var = new vi3() { // from class: curtains.internal.RootViewsSpy$Companion$install$1$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                RootViewsSpy$delegatingViewList$1 rootViewsSpy$delegatingViewList$1 = ii8Var.f44148b;
                rootViewsSpy$delegatingViewList$1.addAll(arrayList);
                return rootViewsSpy$delegatingViewList$1;
            }
        };
        try {
            Object value = C2902c.f34582b.getValue();
            if (value == null || (field = (Field) C2902c.f34583c.getValue()) == null) {
                return ii8Var;
            }
            Object obj = field.get(value);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
            }
            field.set(value, vi3Var.invoke((ArrayList) obj));
            return ii8Var;
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
            return ii8Var;
        }
    }
}
