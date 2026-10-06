package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class luh implements lty {

    /* JADX INFO: renamed from: a */
    private static final String f39219a = luh.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private static HashMap f39220b;

    /* JADX INFO: renamed from: c */
    private static HashMap f39221c;

    /* JADX INFO: renamed from: d */
    private static HashMap f39222d;

    /* JADX INFO: renamed from: b */
    static String m15992b(Context context, int i) {
        return i >= 0 ? (String) mrm.m16828h(lud.m15989a(context.getResources(), i)).mo16811e("id/0x".concat(String.valueOf(Integer.toHexString(i)))) : "NO_ID";
    }

    /* JADX WARN: Code duplicated, block: B:51:0x011f A[Catch: IllegalAccessException -> 0x013d, TryCatch #1 {IllegalAccessException -> 0x013d, blocks: (B:31:0x00bd, B:34:0x00c5, B:51:0x011f, B:52:0x0123, B:35:0x00ce, B:37:0x00d5, B:38:0x00f5, B:40:0x00fc, B:42:0x0103, B:44:0x010b, B:48:0x0117, B:45:0x0111, B:23:0x008a, B:24:0x008f, B:26:0x0097, B:28:0x009d), top: B:64:0x00bd }] */
    /* JADX INFO: renamed from: c */
    static void m15993c(Context context, Object obj, lul lulVar, String str) {
        String str2;
        Object objValueOf;
        if (obj == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Class<?> superclass = obj.getClass();
        do {
            Field[] fieldArrM15999i = m15999i(superclass);
            int length = fieldArrM15999i.length;
            int i = 0;
            while (i < length) {
                Field field = fieldArrM15999i[i];
                try {
                    Class<?> type = field.getType();
                    ViewDebug.ExportedProperty exportedProperty = (ViewDebug.ExportedProperty) f39222d.get(field);
                    if (exportedProperty.category().length() != 0) {
                        str2 = exportedProperty.category() + ":";
                    } else {
                        str2 = "";
                    }
                    if (type == Integer.TYPE || type == Byte.TYPE) {
                        try {
                            if (!exportedProperty.resolveId() || context == null) {
                                ViewDebug.FlagToString[] flagToStringArrFlagMapping = exportedProperty.flagMapping();
                                if (flagToStringArrFlagMapping.length > 0) {
                                    m15997g(lulVar, flagToStringArrFlagMapping, field.getInt(obj), str2 + str + field.getName() + "_", hashSet);
                                }
                                ViewDebug.IntToString[] intToStringArrMapping = exportedProperty.mapping();
                                int length2 = intToStringArrMapping.length;
                                if (length2 > 0) {
                                    int i2 = field.getInt(obj);
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length2) {
                                            objValueOf = null;
                                            break;
                                        }
                                        ViewDebug.IntToString intToString = intToStringArrMapping[i3];
                                        if (intToString.from() == i2) {
                                            objValueOf = intToString.to();
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (objValueOf == null) {
                                        objValueOf = Integer.valueOf(i2);
                                    }
                                } else {
                                    objValueOf = null;
                                }
                            } else {
                                objValueOf = m15992b(context, field.getInt(obj));
                            }
                            if (objValueOf == null) {
                                objValueOf = field.get(obj);
                            }
                            m15998h(lulVar, str2 + str + field.getName(), objValueOf, hashSet);
                        } catch (IllegalAccessException e) {
                        }
                    } else if (type == int[].class) {
                        i = i;
                        m15996f(context, lulVar, exportedProperty, (int[]) field.get(obj), str2 + str + field.getName() + "_", "", hashSet);
                    } else {
                        i = i;
                        if (type.isPrimitive() || !exportedProperty.deepExport()) {
                            objValueOf = null;
                            if (objValueOf == null) {
                                objValueOf = field.get(obj);
                            }
                            m15998h(lulVar, str2 + str + field.getName(), objValueOf, hashSet);
                        } else {
                            m15993c(context, field.get(obj), lulVar, str + exportedProperty.prefix());
                        }
                    }
                } catch (IllegalAccessException e2) {
                    i = i;
                }
                i++;
            }
            m15995e(context, obj, lulVar, superclass, str, hashSet);
            superclass = superclass.getSuperclass();
        } while (superclass != Object.class);
    }

    /* JADX INFO: renamed from: d */
    private static Object m15994d(Method method, Object obj) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof View)) {
            return method.invoke(obj, null);
        }
        View view = (View) obj;
        FutureTask futureTask = new FutureTask(new cpb(method, view, 12));
        Handler handler = view.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            return method.invoke(view, null);
        }
        handler.post(futureTask);
        while (true) {
            try {
                return futureTask.get(4000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
            } catch (CancellationException e2) {
                throw new RuntimeException("Unexpected cancellation exception", e2);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof IllegalAccessException) {
                    throw ((IllegalAccessException) cause);
                }
                if (cause instanceof InvocationTargetException) {
                    throw ((InvocationTargetException) cause);
                }
                throw new RuntimeException("Unexpected exception", cause);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m15995e(Context context, Object obj, lul lulVar, Class cls, String str, Set set) {
        boolean z;
        for (Method method : m16000j(cls)) {
            try {
                Object objM15994d = m15994d(method, obj);
                Class<?> returnType = method.getReturnType();
                ViewDebug.ExportedProperty exportedProperty = (ViewDebug.ExportedProperty) f39222d.get(method);
                String str2 = exportedProperty.category().length() != 0 ? exportedProperty.category() + ":" : "";
                if (returnType != Integer.TYPE) {
                    if (returnType == int[].class) {
                        m15996f(context, lulVar, exportedProperty, (int[]) objM15994d, str2 + str + method.getName() + "_", "()", set);
                    } else if (!returnType.isPrimitive() && exportedProperty.deepExport()) {
                        m15993c(context, objM15994d, lulVar, str + exportedProperty.prefix());
                    }
                } else if (!exportedProperty.resolveId() || context == null) {
                    ViewDebug.FlagToString[] flagToStringArrFlagMapping = exportedProperty.flagMapping();
                    if (flagToStringArrFlagMapping.length > 0) {
                        m15997g(lulVar, flagToStringArrFlagMapping, ((Integer) objM15994d).intValue(), str2 + str + method.getName() + "_", set);
                    }
                    ViewDebug.IntToString[] intToStringArrMapping = exportedProperty.mapping();
                    int length = intToStringArrMapping.length;
                    if (length > 0) {
                        int iIntValue = ((Integer) objM15994d).intValue();
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                break;
                            }
                            ViewDebug.IntToString intToString = intToStringArrMapping[i];
                            if (intToString.from() == iIntValue) {
                                objM15994d = intToString.to();
                                z = true;
                                break;
                            }
                            i++;
                        }
                        if (!z) {
                            objM15994d = Integer.valueOf(iIntValue);
                        }
                    }
                } else {
                    objM15994d = m15992b(context, ((Integer) objM15994d).intValue());
                }
                m15998h(lulVar, str2 + str + method.getName() + "()", objM15994d, set);
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
            } catch (TimeoutException e3) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m15996f(Context context, lul lulVar, ViewDebug.ExportedProperty exportedProperty, int[] iArr, String str, String str2, Set set) {
        ViewDebug.IntToString[] intToStringArrIndexMapping = exportedProperty.indexMapping();
        int length = intToStringArrIndexMapping.length;
        ViewDebug.IntToString[] intToStringArrMapping = exportedProperty.mapping();
        int length2 = intToStringArrMapping.length;
        boolean z = exportedProperty.resolveId() && context != null;
        int length3 = iArr.length;
        for (int i = 0; i < length3; i++) {
            int i2 = iArr[i];
            String strValueOf = String.valueOf(i);
            if (length > 0) {
                for (ViewDebug.IntToString intToString : intToStringArrIndexMapping) {
                    if (intToString.from() == i) {
                        strValueOf = intToString.to();
                        break;
                    }
                }
            }
            String strValueOf2 = null;
            if (length2 > 0) {
                for (ViewDebug.IntToString intToString2 : intToStringArrMapping) {
                    if (intToString2.from() == i2) {
                        strValueOf2 = intToString2.to();
                        break;
                    }
                }
            }
            if (!z) {
                strValueOf2 = String.valueOf(i2);
            } else if (strValueOf2 == null) {
                strValueOf2 = m15992b(context, i2);
            }
            m15998h(lulVar, str + strValueOf + str2, strValueOf2, set);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX INFO: renamed from: g */
    private static void m15997g(lul lulVar, ViewDebug.FlagToString[] flagToStringArr, int i, String str, Set set) {
        for (ViewDebug.FlagToString flagToString : flagToStringArr) {
            boolean zOutputIf = flagToString.outputIf();
            int iMask = flagToString.mask() & i;
            boolean z = iMask == flagToString.equals();
            if (z) {
                if (zOutputIf) {
                    m15998h(lulVar, str.concat(String.valueOf(flagToString.name())), "0x".concat(String.valueOf(Integer.toHexString(iMask))), set);
                } else {
                    zOutputIf = false;
                    if (z) {
                    }
                }
            } else if (z && !zOutputIf) {
                m15998h(lulVar, str.concat(String.valueOf(flagToString.name())), "0x".concat(String.valueOf(Integer.toHexString(iMask))), set);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m15998h(lul lulVar, String str, Object obj, Set set) {
        String string;
        if (set.contains(str)) {
            return;
        }
        if (obj != null) {
            try {
                string = obj.getClass().isArray() ? Arrays.toString((Object[]) obj) : obj.toString();
                try {
                    string = string.replace("\n", "\\n");
                } catch (Throwable th) {
                }
            } catch (Throwable th2) {
                string = "[EXCEPTION]";
            }
        } else {
            string = "null";
        }
        lulVar.m16007a(str, string);
        set.add(str);
    }

    /* JADX INFO: renamed from: i */
    private static Field[] m15999i(Class cls) {
        Field[] declaredFields;
        if (f39220b == null) {
            f39220b = new HashMap();
        }
        if (f39222d == null) {
            f39222d = new HashMap(512);
        }
        HashMap map = f39220b;
        Field[] fieldArr = (Field[]) map.get(cls);
        if (fieldArr != null) {
            return fieldArr;
        }
        ArrayList arrayList = new ArrayList();
        try {
            declaredFields = cls.getDeclaredFields();
        } catch (NoClassDefFoundError e) {
            Log.w(f39219a, "Failed to export ".concat(String.valueOf(cls.getName())));
            declaredFields = new Field[0];
        }
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(ViewDebug.ExportedProperty.class) && !field.getName().contains("$$robo$$")) {
                field.setAccessible(true);
                arrayList.add(field);
                f39222d.put(field, (ViewDebug.ExportedProperty) field.getAnnotation(ViewDebug.ExportedProperty.class));
            }
        }
        Field[] fieldArr2 = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
        map.put(cls, fieldArr2);
        return fieldArr2;
    }

    /* JADX INFO: renamed from: j */
    private static Method[] m16000j(Class cls) {
        Method[] declaredMethods;
        if (f39221c == null) {
            f39221c = new HashMap(100);
        }
        if (f39222d == null) {
            f39222d = new HashMap(512);
        }
        HashMap map = f39221c;
        Method[] methodArr = (Method[]) map.get(cls);
        if (methodArr != null) {
            return methodArr;
        }
        ArrayList arrayList = new ArrayList();
        try {
            declaredMethods = cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            Log.w(f39219a, "Failed to export ".concat(String.valueOf(cls.getName())));
            declaredMethods = new Method[0];
        }
        for (Method method : declaredMethods) {
            if (method.getParameterTypes().length == 0 && method.isAnnotationPresent(ViewDebug.ExportedProperty.class) && method.getReturnType() != Void.class && !method.getName().contains("$$robo$$")) {
                method.setAccessible(true);
                arrayList.add(method);
                f39222d.put(method, (ViewDebug.ExportedProperty) method.getAnnotation(ViewDebug.ExportedProperty.class));
            }
        }
        Method[] methodArr2 = (Method[]) arrayList.toArray(new Method[arrayList.size()]);
        map.put(cls, methodArr2);
        return methodArr2;
    }

    @Override // p000.lty
    /* JADX INFO: renamed from: a */
    public final void mo15980a(lul lulVar, View view) {
        m15993c(view.getContext(), view, lulVar, "");
    }
}
