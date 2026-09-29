package p394t7;

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
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p173i8.C6205a;
import p471x2.InterfaceC10050m;

/* JADX INFO: renamed from: t7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9218d {

    /* JADX INFO: renamed from: a */
    public static final C9218d f47829a = new C9218d();

    /* JADX INFO: renamed from: b */
    public static final String f47830b = C9218d.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    public static WeakReference<View> f47831c = new WeakReference<>(null);

    /* JADX INFO: renamed from: d */
    public static Method f47832d;

    /* JADX INFO: renamed from: a */
    public static final ArrayList m17566a(View view) {
        int childCount;
        if (C6205a.m12742b(C9218d.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                    if (i11 >= childCount) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C6205a.m12741a(C9218d.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006a A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:16:0x0033, B:19:0x003e, B:32:0x0062, B:35:0x006a, B:42:0x0077, B:44:0x007d, B:27:0x0058, B:24:0x0050), top: B:90:0x0033, outer: #0, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:16:0x0033, B:19:0x003e, B:32:0x0062, B:35:0x006a, B:42:0x0077, B:44:0x007d, B:27:0x0058, B:24:0x0050), top: B:90:0x0033, outer: #0, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public static final int m17567b(View view) {
        Class<?> cls;
        boolean z10;
        if (C6205a.m12742b(C9218d.class)) {
            return 0;
        }
        try {
            C5207g.m11111f(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            boolean zM12742b = C6205a.m12742b(C9218d.class);
            C9218d c9218d = f47829a;
            if (zM12742b) {
                z10 = false;
            } else {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        c9218d.getClass();
                        Class<InterfaceC10050m> cls2 = null;
                        if (!C6205a.m12742b(c9218d)) {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                                cls = null;
                            } catch (Throwable th2) {
                                C6205a.m12741a(c9218d, th2);
                                cls = null;
                            }
                            if (cls != null || !cls.isInstance(parent)) {
                                if (!C6205a.m12742b(c9218d)) {
                                    cls2 = InterfaceC10050m.class;
                                }
                                if (cls2 != null || !cls2.isInstance(parent)) {
                                    z10 = false;
                                }
                            }
                        }
                        cls = null;
                        if (cls != null) {
                            if (!C6205a.m12742b(c9218d)) {
                                cls2 = InterfaceC10050m.class;
                            }
                            if (cls2 != null) {
                            }
                            z10 = false;
                        } else {
                            if (!C6205a.m12742b(c9218d)) {
                                cls2 = InterfaceC10050m.class;
                            }
                            if (cls2 != null) {
                            }
                            z10 = false;
                        }
                    }
                    z10 = true;
                } catch (Throwable th3) {
                    C6205a.m12741a(C9218d.class, th3);
                }
            }
            if (z10) {
                i10 |= 512;
            }
            if (view instanceof TextView) {
                i10 = i10 | 1024 | 1;
                if (view instanceof Button) {
                    i10 |= 4;
                    if (view instanceof Switch) {
                        i10 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i10 |= 32768;
                    }
                }
                if (view instanceof EditText) {
                    return i10 | 2048;
                }
            } else if ((view instanceof Spinner) || (view instanceof DatePicker)) {
                i10 |= 4096;
            } else {
                if (view instanceof RatingBar) {
                    return i10 | 65536;
                }
                if (view instanceof RadioGroup) {
                    return i10 | 16384;
                }
                if ((view instanceof ViewGroup) && c9218d.m17578l(view, f47831c.get())) {
                    return i10 | 64;
                }
            }
            return i10;
        } catch (Throwable th4) {
            C6205a.m12741a(C9218d.class, th4);
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final JSONObject m17568c(View view) {
        if (C6205a.m12742b(C9218d.class)) {
            return null;
        }
        try {
            C5207g.m11111f(view, "view");
            if (C5207g.m11106a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f47831c = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m17574m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListM17566a = m17566a(view);
                int size = arrayListM17566a.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(m17568c((View) arrayListM17566a.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e10) {
                Log.e(f47830b, "Failed to create JSONObject for view.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            C6205a.m12741a(C9218d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final View.OnClickListener m17569e(View view) {
        Field declaredField;
        if (C6205a.m12742b(C9218d.class)) {
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
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(C9218d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final View.OnTouchListener m17570f(View view) {
        Field declaredField;
        String str = f47830b;
        try {
            if (C6205a.m12742b(C9218d.class)) {
                return null;
            }
            try {
                Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
                Object obj = declaredField2.get(view);
                if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                    return null;
                }
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    return (View.OnTouchListener) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
            } catch (ClassNotFoundException e10) {
                C5086z.m10806E(str, e10);
                return null;
            } catch (IllegalAccessException e11) {
                C5086z.m10806E(str, e11);
                return null;
            } catch (NoSuchFieldException e12) {
                C5086z.m10806E(str, e12);
                return null;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C9218d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m17571g(View view) {
        CharSequence hint;
        String string;
        if (C6205a.m12742b(C9218d.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            C6205a.m12741a(C9218d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final ViewGroup m17572h(View view) {
        if (C6205a.m12742b(C9218d.class)) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(C9218d.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x013c A[EDGE_INSN: B:46:0x013c->B:47:0x013d BREAK  A[LOOP:0: B:34:0x0109->B:41:0x0129]] */
    /* JADX INFO: renamed from: i */
    public static final String m17573i(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (C6205a.m12742b(C9218d.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    int i10 = 0;
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
                                if (childCount <= 0) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                while (true) {
                                    int i11 = i10 + 1;
                                    View childAt = ((RadioGroup) view).getChildAt(i10);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    if (i11 >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            C5207g.m11110e(currentHour, "view.currentHour");
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            C5207g.m11110e(currentMinute, "view.currentMinute");
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(currentMinute.intValue())}, 2));
                            C5207g.m11110e(charSequenceValueOf, "java.lang.String.format(format, *args)");
                        }
                    } else {
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                        C5207g.m11110e(charSequenceValueOf, "java.lang.String.format(format, *args)");
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
            if (charSequenceValueOf != null && (string = charSequenceValueOf.toString()) != null) {
                return string;
            }
            return "";
        } catch (Throwable th2) {
            C6205a.m12741a(C9218d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m17574m(View view, JSONObject jSONObject) {
        if (C6205a.m12742b(C9218d.class)) {
            return;
        }
        try {
            C5207g.m11111f(view, "view");
            try {
                String strM17573i = m17573i(view);
                String strM17571g = m17571g(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m17567b(view));
                jSONObject.put("id", view.getId());
                if (C9216b.m17563b(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", C5086z.m10821f(C5086z.m10814M(strM17573i)));
                }
                jSONObject.put("hint", C5086z.m10821f(C5086z.m10814M(strM17571g)));
                if (tag != null) {
                    jSONObject.put("tag", C5086z.m10821f(C5086z.m10814M(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", C5086z.m10821f(C5086z.m10814M(contentDescription.toString())));
                }
                jSONObject.put("dimension", f47829a.m17575d(view));
            } catch (JSONException e10) {
                C5086z c5086z = C5086z.f33015a;
                C5086z.m10806E(f47830b, e10);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C9218d.class, th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m17575d(View view) {
        if (C6205a.m12742b(this)) {
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
            } catch (JSONException e10) {
                Log.e(f47830b, "Failed to create JSONObject for dimension.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final View m17576j(View view, float[] fArr) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            m17577k();
            Method method = f47832d;
            if (method != null && view != null) {
                String str = f47830b;
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    Object objInvoke = method.invoke(null, fArr, view);
                    if (objInvoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    View view2 = (View) objInvoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        if (parent != null) {
                            return (View) parent;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } catch (IllegalAccessException e10) {
                    C5086z c5086z = C5086z.f33015a;
                    C5086z.m10806E(str, e10);
                } catch (InvocationTargetException e11) {
                    C5086z c5086z2 = C5086z.f33015a;
                    C5086z.m10806E(str, e11);
                }
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m17577k() {
        String str = f47830b;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            if (f47832d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f47832d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e10) {
                C5086z c5086z = C5086z.f33015a;
                C5086z.m10806E(str, e10);
            } catch (NoSuchMethodException e11) {
                C5086z c5086z2 = C5086z.f33015a;
                C5086z.m10806E(str, e11);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17578l(View view, View view2) {
        float[] fArr;
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            C5207g.m11111f(view, "view");
            if (!C5207g.m11106a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            if (C6205a.m12742b(this)) {
                fArr = null;
            } else {
                try {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    fArr = new float[]{iArr[0], iArr[1]};
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                    fArr = null;
                }
            }
            View viewM17576j = m17576j(view2, fArr);
            return viewM17576j != null && viewM17576j.getId() == view.getId();
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return false;
        }
    }
}
