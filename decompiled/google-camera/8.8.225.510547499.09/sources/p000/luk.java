package p000;

import android.os.Process;
import android.util.Log;
import android.view.View;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class luk {

    /* JADX INFO: renamed from: a */
    private static final String f39227a = luk.class.getSimpleName();

    private luk() {
    }

    /* JADX INFO: renamed from: a */
    public static View m16003a() throws luf {
        Object obj;
        List<View> listAsList;
        View view;
        View view2 = null;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(objInvoke);
            if (obj2 != null) {
                listAsList = obj2 instanceof List ? (List) obj2 : Arrays.asList((View[]) obj2);
                Field declaredField2 = cls.getDeclaredField("mLock");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(objInvoke);
                if (obj == null) {
                    throw new AssertionError("Lock field cannot be null as it is needed to synchronize access to views field.");
                }
            } else {
                obj = null;
                listAsList = null;
            }
        } catch (ReflectiveOperationException e) {
            try {
                Class<?> cls2 = Class.forName("android.view.WindowManagerImpl");
                Object objInvoke2 = cls2.getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                Field declaredField3 = cls2.getDeclaredField("mViews");
                declaredField3.setAccessible(true);
                Object obj3 = declaredField3.get(objInvoke2);
                if (obj3 != null) {
                    listAsList = Arrays.asList((View[]) obj3);
                    obj = objInvoke2;
                } else {
                    obj = objInvoke2;
                    listAsList = null;
                }
            } catch (ReflectiveOperationException e2) {
                String str = f39227a;
                Log.e(str, "Failed to get views from WindowManagerGlobal.", e);
                Log.e(str, "Failed to get views from WindowManagerImpl.", e2);
                throw new AssertionError("Failed to get views from window manager. This is probably because the device is newer than Android 5.0, or the device's window manager implementation deviates from stock Android.");
            }
        }
        if (listAsList != null) {
            synchronized (obj) {
                view = null;
                for (View view3 : listAsList) {
                    if (view3.getWindowVisibility() != 0) {
                        view = view3;
                    } else {
                        if (view3.hasWindowFocus()) {
                            view2 = view3;
                            break;
                        }
                        view2 = view3;
                    }
                }
                if (view2 != null && !view2.hasWindowFocus()) {
                    Log.w(f39227a, "Could not find a focused window, using top-most visible window instead.");
                }
                if (view2 == null && view != null) {
                    Log.w(f39227a, "Could not find a visible window, using top-most non-visible window instead.");
                }
            }
        } else {
            view = null;
        }
        if (view2 != null || view != null) {
            return view2 != null ? view2 : view;
        }
        throw new luf(yTyWiTtGtnBhy.BFBOqoOMJUBhi + Process.myPid() + ". This means that there is no Activity in the process and that the process is likely just running a Service or BroadcastReceiver");
    }
}
