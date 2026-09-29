package p000;

import com.amplitude.core.utilities.http.HttpStatus;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r70 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final String f58816b;

    /* JADX INFO: renamed from: c */
    public final Set f58817c;

    /* JADX INFO: renamed from: d */
    public final Set f58818d;

    /* JADX INFO: renamed from: e */
    public final Set f58819e;

    /* JADX INFO: renamed from: f */
    public final Set f58820f;

    public r70(JSONObject jSONObject) throws JSONException {
        super(HttpStatus.BAD_REQUEST);
        this.f58816b = b34.m3251r(jSONObject);
        EmptySet emptySet = EmptySet.f47640a;
        this.f58817c = emptySet;
        this.f58818d = emptySet;
        this.f58819e = emptySet;
        this.f58820f = emptySet;
        if (jSONObject.has("events_with_invalid_fields")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events_with_invalid_fields");
            jSONObject2.getClass();
            this.f58817c = b34.m3242h(jSONObject2);
        }
        if (jSONObject.has("events_with_missing_fields")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("events_with_missing_fields");
            jSONObject3.getClass();
            this.f58818d = b34.m3242h(jSONObject3);
        }
        if (jSONObject.has("silenced_devices")) {
            Object jSONArray = jSONObject.getJSONArray("silenced_devices");
            jSONArray.getClass();
            this.f58820f = u91.m22627s1((Iterable) jSONArray);
        }
        if (jSONObject.has("silenced_events")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("silenced_events");
            jSONArray2.getClass();
            this.f58819e = AbstractC3550rv.m20854v0(b34.m3227X(jSONArray2));
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m20420E() {
        return this.f58816b;
    }

    /* JADX INFO: renamed from: F */
    public final LinkedHashSet m20421F() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f58817c);
        linkedHashSet.addAll(this.f58818d);
        linkedHashSet.addAll(this.f58819e);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m20422G(b90 b90Var) {
        b90Var.getClass();
        String str = b90Var.f8143b;
        if (str != null) {
            return this.f58820f.contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m20423H() {
        String lowerCase = this.f58816b.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return vk9.m23380c0(lowerCase, "invalid api key", false);
    }
}
