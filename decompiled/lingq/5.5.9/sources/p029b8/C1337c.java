package p029b8;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p173i8.C6205a;
import p385sf.C9000b;
import p394t7.C9218d;

/* JADX INFO: renamed from: b8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1337c {

    /* JADX INFO: renamed from: a */
    public static final C1337c f8141a = new C1337c();

    /* JADX INFO: renamed from: b */
    public static final List<Class<? extends View>> f8142b = C9000b.m17252r(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* JADX INFO: renamed from: a */
    public static final ArrayList m4909a(View view) {
        if (C6205a.m12742b(C1337c.class)) {
            return null;
        }
        try {
            C5207g.m11111f(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = f8142b.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = C9218d.m17566a(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(m4909a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            C6205a.m12741a(C1337c.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final JSONObject m4910b(View view, View view2) {
        if (C6205a.m12742b(C1337c.class)) {
            return null;
        }
        try {
            C5207g.m11111f(view, "view");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m4912e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = C9218d.m17566a(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m4910b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            C6205a.m12741a(C1337c.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m4911d(View view) {
        if (C6205a.m12742b(C1337c.class)) {
            return null;
        }
        try {
            C5207g.m11111f(view, "hostView");
            String strM17573i = C9218d.m17573i(view);
            if (strM17573i.length() > 0) {
                return strM17573i;
            }
            String strJoin = TextUtils.join(" ", f8141a.m4913c(view));
            C5207g.m11110e(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th2) {
            C6205a.m12741a(C1337c.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4912e(View view, JSONObject jSONObject) {
        if (C6205a.m12742b(C1337c.class)) {
            return;
        }
        try {
            C5207g.m11111f(view, "view");
            try {
                String strM17573i = C9218d.m17573i(view);
                String strM17571g = C9218d.m17571g(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", C9218d.m17567b(view));
                boolean z10 = true;
                if (strM17573i.length() > 0) {
                    jSONObject.put("text", strM17573i);
                }
                if (strM17571g.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    jSONObject.put("hint", strM17571g);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C1337c.class, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m4913c(View view) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C9218d.m17566a(view)) {
                String strM17573i = C9218d.m17573i(view2);
                if (strM17573i.length() > 0) {
                    arrayList.add(strM17573i);
                }
                arrayList.addAll(m4913c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
