package p000;

import com.amplitude.core.utilities.http.HttpStatus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q67 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final String f57326b;

    public q67(JSONObject jSONObject) {
        super(HttpStatus.PAYLOAD_TOO_LARGE);
        this.f57326b = b34.m3251r(jSONObject);
    }

    /* JADX INFO: renamed from: E */
    public final String m19681E() {
        return this.f57326b;
    }
}
