package p471x2;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10038g {

    /* JADX INFO: renamed from: a */
    public static boolean f51029a;

    /* JADX INFO: renamed from: b */
    public static Method f51030b;

    /* JADX INFO: renamed from: c */
    public static boolean f51031c;

    /* JADX INFO: renamed from: d */
    public static Field f51032d;

    /* JADX INFO: renamed from: x2.g$a */
    public interface a {
        /* JADX INFO: renamed from: v */
        boolean mo11393v(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18802a(View view, KeyEvent keyEvent) {
        WeakReference<View> weakReferenceValueAt;
        int iIndexOfKey;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = C10029b0.s.f51008d;
            C10029b0.s sVar = (C10029b0.s) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (sVar == null) {
                sVar = new C10029b0.s();
                view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
            }
            WeakReference<KeyEvent> weakReference = sVar.f51011c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                sVar.f51011c = new WeakReference<>(keyEvent);
                if (sVar.f51010b == null) {
                    sVar.f51010b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = sVar.f51010b;
                if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                    weakReferenceValueAt = null;
                } else {
                    weakReferenceValueAt = sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReferenceValueAt == null) {
                    weakReferenceValueAt = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReferenceValueAt != null) {
                    View view2 = weakReferenceValueAt.get();
                    if (view2 == null || !C10029b0.g.m18698b(view2)) {
                        return true;
                    }
                    C10029b0.s.m18777b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: b */
    public static boolean m18803b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (aVar == null) {
            return zBooleanValue;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo11393v(keyEvent);
        }
        if (!(callback instanceof Activity)) {
            if (!(callback instanceof Dialog)) {
                if ((view != null && C10029b0.m18647c(view, keyEvent)) || aVar.mo11393v(keyEvent)) {
                    zBooleanValue = true;
                }
                return zBooleanValue;
            }
            Dialog dialog = (Dialog) callback;
            if (!f51031c) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f51032d = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f51031c = true;
            }
            Field field = f51032d;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused2) {
                    onKeyListener = null;
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C10029b0.m18647c(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        Activity activity = (Activity) callback;
        activity.onUserInteraction();
        Window window2 = activity.getWindow();
        if (window2.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!f51029a) {
                    try {
                        Class<?> cls = actionBar.getClass();
                        Class<?>[] clsArr = new Class[1];
                        clsArr[zBooleanValue ? 1 : 0] = KeyEvent.class;
                        f51030b = cls.getMethod("onMenuKeyEvent", clsArr);
                    } catch (NoSuchMethodException unused3) {
                    }
                    f51029a = true;
                }
                Method method = f51030b;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[zBooleanValue ? 1 : 0] = keyEvent;
                        Object objInvoke = method.invoke(actionBar, objArr);
                        if (objInvoke != null) {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (C10029b0.m18647c(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView2 != null ? decorView2.getKeyDispatcherState() : null, activity);
    }
}
