package p000;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class in9 {

    /* JADX INFO: renamed from: a */
    public static final in9 f44327a = new in9();

    /* JADX INFO: renamed from: b */
    public static final List f44328b = vz1.m23605K(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* JADX INFO: renamed from: a */
    public static final ArrayList m14034a(View view) {
        if (lp1.f49971a.contains(in9.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = f44328b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = mta.m17035b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(m14034a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            lp1.m16420a(in9.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final JSONObject m14035b(View view, View view2) {
        if (lp1.f49971a.contains(in9.class)) {
            return null;
        }
        try {
            view.getClass();
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m14037e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = mta.m17035b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m14035b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            lp1.m16420a(in9.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m14036d(View view) {
        if (lp1.f49971a.contains(in9.class)) {
            return null;
        }
        try {
            view.getClass();
            String strM17042j = mta.m17042j(view);
            if (strM17042j.length() > 0) {
                return strM17042j;
            }
            String strJoin = TextUtils.join(" ", f44327a.m14038c(view));
            strJoin.getClass();
            return strJoin;
        } catch (Throwable th) {
            lp1.m16420a(in9.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m14037e(View view, JSONObject jSONObject) {
        if (lp1.f49971a.contains(in9.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String strM17042j = mta.m17042j(view);
                String strM17040h = mta.m17040h(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", mta.m17036c(view));
                if (strM17042j.length() > 0) {
                    jSONObject.put("text", strM17042j);
                }
                if (strM17040h.length() > 0) {
                    jSONObject.put("hint", strM17040h);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            lp1.m16420a(in9.class, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m14038c(View view) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : mta.m17035b(view)) {
                String strM17042j = mta.m17042j(view2);
                if (strM17042j.length() > 0) {
                    arrayList.add(strM17042j);
                }
                arrayList.addAll(m14038c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }
}
