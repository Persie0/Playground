package cc;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.u3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1950u3 {

    /* JADX INFO: renamed from: a */
    public final String f10230a;

    /* JADX INFO: renamed from: b */
    public final Bundle f10231b;

    /* JADX INFO: renamed from: c */
    public Bundle f10232c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1986y3 f10233d;

    public C1950u3(C1986y3 c1986y3) {
        this.f10233d = c1986y3;
        C6272i.m12912f("default_event_parameters");
        this.f10230a = "default_event_parameters";
        this.f10231b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX INFO: renamed from: a */
    public final Bundle m5893a() {
        byte b10;
        if (this.f10232c == null) {
            C1986y3 c1986y3 = this.f10233d;
            String string = c1986y3.m5917l().getString(this.f10230a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115) {
                                        b10 = string3.equals("s") ? (byte) 0 : (byte) -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b10 = 2;
                                }
                            } else if (string3.equals("d")) {
                                b10 = 1;
                            }
                            if (b10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b10 != 2) {
                                C1860k3 c1860k3 = ((C1897o4) c1986y3.f10430a).f10086i;
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9942f.m5624b(string3, "Unrecognized persisted bundle type. Type");
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            C1860k3 c1860k4 = ((C1897o4) c1986y3.f10430a).f10086i;
                            C1897o4.m5776k(c1860k4);
                            c1860k4.f9942f.m5623a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f10232c = bundle;
                } catch (JSONException unused2) {
                    C1860k3 c1860k5 = ((C1897o4) c1986y3.f10430a).f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9942f.m5623a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f10232c == null) {
                this.f10232c = this.f10231b;
            }
        }
        return this.f10232c;
    }

    /* JADX INFO: renamed from: b */
    public final void m5894b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C1986y3 c1986y3 = this.f10233d;
        SharedPreferences.Editor editorEdit = c1986y3.m5917l().edit();
        int size = bundle.size();
        String str = this.f10230a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            C1860k3 c1860k3 = ((C1897o4) c1986y3.f10430a).f10086i;
                            C1897o4.m5776k(c1860k3);
                            c1860k3.f9942f.m5624b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        C1860k3 c1860k4 = ((C1897o4) c1986y3.f10430a).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9942f.m5624b(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f10232c = bundle;
    }
}
