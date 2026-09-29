package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mta {

    /* JADX INFO: renamed from: a */
    public static final mta f51832a = new mta();

    /* JADX INFO: renamed from: b */
    public static WeakReference f51833b = new WeakReference(null);

    /* JADX INFO: renamed from: c */
    public static Method f51834c;

    /* JADX INFO: renamed from: a */
    public static final View m17034a(View view) {
        if (!lp1.f49971a.contains(mta.class)) {
            while (view != null) {
                try {
                    mta mtaVar = f51832a;
                    boolean zEquals = false;
                    if (!lp1.f49971a.contains(mtaVar)) {
                        try {
                            zEquals = view.getClass().getName().equals("com.facebook.react.ReactRootView");
                        } catch (Throwable th) {
                            lp1.m16420a(mtaVar, th);
                        }
                    }
                    if (!zEquals) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th2) {
                    lp1.m16420a(mta.class, th2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m17035b(View view) {
        if (lp1.f49971a.contains(mta.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lp1.m16420a(mta.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0050 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0062, B:39:0x005d, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:41:0x0062 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0062, B:39:0x005d, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static final int m17036c(View view) {
        Class<?> cls;
        Class cls2;
        Set set = lp1.f49971a;
        if (set.contains(mta.class)) {
            return 0;
        }
        try {
            view.getClass();
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            boolean zContains = set.contains(mta.class);
            mta mtaVar = f51832a;
            if (!zContains) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        if (set.contains(mtaVar)) {
                            cls = null;
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = lp1.f49971a.contains(mtaVar) ? null : rj6.class;
                                if (cls2 != null && cls2.isInstance(parent)) {
                                }
                            }
                        } else {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                                cls = null;
                            } catch (Throwable th) {
                                lp1.m16420a(mtaVar, th);
                                cls = null;
                            }
                            if (cls != null) {
                                if (lp1.f49971a.contains(mtaVar)) {
                                }
                                if (cls2 != null) {
                                }
                            } else {
                                if (lp1.f49971a.contains(mtaVar)) {
                                }
                                if (cls2 != null) {
                                }
                            }
                        }
                    }
                    i |= 512;
                } catch (Throwable th2) {
                    lp1.m16420a(mta.class, th2);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i | 16384;
                    }
                    return ((view instanceof ViewGroup) && mtaVar.m17047m(view, (View) f51833b.get())) ? i | 64 : i;
                }
                return i | 4096;
            }
            int i2 = i | 1025;
            if (view instanceof Button) {
                i2 = i | 1029;
                if (view instanceof Switch) {
                    i2 = i | 9221;
                } else if (view instanceof CheckBox) {
                    i2 = 33797 | i;
                }
            }
            int i3 = i2;
            return view instanceof EditText ? i3 | 2048 : i3;
        } catch (Throwable th3) {
            lp1.m16420a(mta.class, th3);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final JSONObject m17037d(View view) {
        if (lp1.f49971a.contains(mta.class)) {
            return null;
        }
        try {
            view.getClass();
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f51833b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m17043n(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListM17035b = m17035b(view);
                int size = arrayListM17035b.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(m17037d((View) arrayListM17035b.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e) {
                Log.e("mta", "Failed to create JSONObject for view.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            lp1.m16420a(mta.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final View.OnClickListener m17038f(View view) {
        Field declaredField;
        if (lp1.f49971a.contains(mta.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            obj2.getClass();
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            lp1.m16420a(mta.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final View.OnTouchListener m17039g(View view) {
        Field declaredField;
        try {
            if (!lp1.f49971a.contains(mta.class)) {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj != null && (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) != null) {
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        obj2.getClass();
                        return (View.OnTouchListener) obj2;
                    }
                } catch (ClassNotFoundException unused) {
                    sy2 sy2Var = sy2.f61585a;
                } catch (IllegalAccessException unused2) {
                    sy2 sy2Var2 = sy2.f61585a;
                } catch (NoSuchFieldException unused3) {
                    sy2 sy2Var3 = sy2.f61585a;
                }
            }
            return null;
        } catch (Throwable th) {
            lp1.m16420a(mta.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m17040h(View view) {
        CharSequence hint;
        String string;
        if (lp1.f49971a.contains(mta.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            lp1.m16420a(mta.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final ViewGroup m17041i(View view) {
        if (!lp1.f49971a.contains(mta.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th) {
                lp1.m16420a(mta.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f4 A[EDGE_INSN: B:42:0x00f4->B:43:0x00f5 BREAK  A[LOOP:0: B:32:0x00c8->B:38:0x00e2]] */
    /* JADX INFO: renamed from: j */
    public static final String m17042j(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (lp1.f49971a.contains(mta.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i++;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            currentHour.getClass();
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            currentMinute.getClass();
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(currentMinute.intValue())}, 2));
                        }
                    } else {
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            lp1.m16420a(mta.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m17043n(View view, JSONObject jSONObject) {
        if (lp1.f49971a.contains(mta.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String strM17042j = m17042j(view);
                String strM17040h = m17040h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m17036c(view));
                jSONObject.put("id", view.getId());
                if (bw8.m4197k(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", bna.m3913C(bna.m3978u0(strM17042j)));
                }
                jSONObject.put("hint", bna.m3913C(bna.m3978u0(strM17040h)));
                if (tag != null) {
                    jSONObject.put("tag", bna.m3913C(bna.m3978u0(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", bna.m3913C(bna.m3978u0(contentDescription.toString())));
                }
                jSONObject.put("dimension", f51832a.m17044e(view));
            } catch (JSONException unused) {
                sy2 sy2Var = sy2.f61585a;
            }
        } catch (Throwable th) {
            lp1.m16420a(mta.class, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m17044e(View view) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e) {
                Log.e("mta", "Failed to create JSONObject for dimension.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final View m17045k(View view, float[] fArr) {
        if (!lp1.f49971a.contains(this)) {
            try {
                m17046l();
                Method method = f51834c;
                if (method != null && view != null) {
                    try {
                        Object objInvoke = method.invoke(null, fArr, view);
                        objInvoke.getClass();
                        View view2 = (View) objInvoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            parent.getClass();
                            return (View) parent;
                        }
                    } catch (IllegalAccessException unused) {
                        sy2 sy2Var = sy2.f61585a;
                    } catch (InvocationTargetException unused2) {
                        sy2 sy2Var2 = sy2.f61585a;
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m17046l() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (f51834c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f51834c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                sy2 sy2Var = sy2.f61585a;
            } catch (NoSuchMethodException unused2) {
                sy2 sy2Var2 = sy2.f61585a;
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m17047m(View view, View view2) {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return false;
        }
        try {
            view.getClass();
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!set.contains(this)) {
                try {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    fArr = new float[]{iArr[0], iArr[1]};
                } catch (Throwable th) {
                    lp1.m16420a(this, th);
                }
            }
            View viewM17045k = m17045k(view2, fArr);
            return viewM17045k != null && viewM17045k.getId() == view.getId();
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
            return false;
        }
    }
}
