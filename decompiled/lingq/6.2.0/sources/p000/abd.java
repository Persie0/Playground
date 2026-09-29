package p000;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import coil.C0855a;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.p012ui.R$drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class abd {
    /* JADX INFO: renamed from: a */
    public static final SpannableStringBuilder m245a(String str, String... strArr) {
        str.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (strArr.length != 0) {
            for (String str2 : strArr) {
                StyleSpan styleSpan = new StyleSpan(1);
                int iM23389l0 = vk9.m23389l0(str, str2, 0, false, 6);
                int length = str2.length() + iM23389l0;
                if (iM23389l0 > 0 && iM23389l0 < spannableStringBuilder.length() && length > 0 && length < spannableStringBuilder.length()) {
                    spannableStringBuilder.setSpan(styleSpan, iM23389l0, length, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static md2 m246b(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("event_name", "");
        strOptString.getClass();
        MapBuilder mapBuilderM15392b = null;
        if (!vk9.m23391n0(strOptString)) {
            double dOptDouble = jSONObject.optDouble("time", Double.NaN);
            if (!Double.isNaN(dOptDouble)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("event_properties");
                if (jSONObjectOptJSONObject != null) {
                    MapBuilder mapBuilder = new MapBuilder();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    itKeys.getClass();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        mapBuilder.put(next, m248d(jSONObjectOptJSONObject.opt(next)));
                    }
                    mapBuilderM15392b = mapBuilder.m15392b();
                }
                return new md2(strOptString, dOptDouble, mapBuilderM15392b);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static md2 m247c(String str) {
        try {
            return m246b(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m248d(Object obj) {
        if (fa4.m11650l(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            MapBuilder mapBuilder = new MapBuilder();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                mapBuilder.put(next, m248d(jSONObject.get(next)));
            }
            return mapBuilder.m15392b();
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        ListBuilder listBuilderM23650t = vz1.m23650t();
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            listBuilderM23650t.add(m248d(jSONArray.get(i)));
        }
        return vz1.m23635i(listBuilderM23650t);
    }

    /* JADX INFO: renamed from: e */
    public static final int m249e(int i, Context context, String str) {
        Integer numValueOf;
        context.getClass();
        try {
            numValueOf = Integer.valueOf(context.getResources().getIdentifier(str != null ? AbstractC3352my.m17091J(str) : "ic_none", "drawable", context.getPackageName()));
        } catch (Exception unused) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i;
    }

    /* JADX INFO: renamed from: f */
    public static final String m250f(int i, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        View view;
        if (abstractComponentCallbacksC0635c.m2105g() == null) {
            return "";
        }
        id3 id3VarM2105g = abstractComponentCallbacksC0635c.m2105g();
        if ((id3VarM2105g != null && id3VarM2105g.isFinishing()) || !abstractComponentCallbacksC0635c.m2115q() || abstractComponentCallbacksC0635c.m2117s() || (view = abstractComponentCallbacksC0635c.f5692d0) == null || view.getWindowToken() == null || abstractComponentCallbacksC0635c.f5692d0.getVisibility() != 0 || !abstractComponentCallbacksC0635c.m2115q()) {
            return "";
        }
        String strM2111m = abstractComponentCallbacksC0635c.m2111m(i);
        strM2111m.getClass();
        return strM2111m;
    }

    /* JADX INFO: renamed from: g */
    public static final void m251g(ImageView imageView, String str, float f) {
        if (str != null) {
            int identifier = imageView.getContext().getResources().getIdentifier(AbstractC3352my.m17091J(str), "drawable", imageView.getContext().getPackageName());
            if (identifier == 0) {
                Integer numValueOf = Integer.valueOf(R$drawable.ic_none);
                C0855a c0855aM18903m = p58.m18903m(imageView.getContext());
                d04 d04Var = new d04(imageView.getContext());
                d04Var.f34778c = numValueOf;
                d04Var.f34779d = new t04(imageView);
                d04Var.m9961b();
                d04Var.f34781f = l70.m15918I(AbstractC3550rv.m20852t0(new l9a[]{new d21()}));
                c0855aM18903m.m4951b(d04Var.m9960a());
                return;
            }
            Integer numValueOf2 = Integer.valueOf(identifier);
            int i = R$color.grey_light;
            imageView.setImageBitmap(null);
            Context context = imageView.getContext();
            context.getClass();
            d04 d04Var2 = new d04(context);
            d04Var2.f34778c = numValueOf2;
            d04Var2.f34790o = 0;
            d04Var2.f34781f = l70.m15918I(AbstractC3550rv.m20852t0(new l9a[]{new d21()}));
            d04Var2.f34786k = Boolean.FALSE;
            d04Var2.f34779d = new ffa(imageView, f, i, imageView);
            d04Var2.m9961b();
            e04 e04VarM9960a = d04Var2.m9960a();
            Context context2 = imageView.getContext();
            context2.getClass();
            p58.m18903m(context2).m4951b(e04VarM9960a);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final long m252h(String str) {
        str.getClass();
        return d32.m10035e(Color.parseColor(str));
    }

    /* JADX INFO: renamed from: i */
    public static final int m253i(String str) {
        str.getClass();
        return d32.m10042h0(d32.m10035e(Color.parseColor(str)));
    }

    /* JADX INFO: renamed from: j */
    public static Object m254j(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(m254j(it.next()));
            }
            return jSONArray;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                jSONObject.put((String) key, m254j(value));
            }
        }
        return jSONObject;
    }
}
