package p000;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: g2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3023g2 {

    /* JADX INFO: renamed from: g */
    public static final String[] f40057g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h */
    public static final SimpleDateFormat f40058h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a */
    public final String f40059a;

    /* JADX INFO: renamed from: b */
    public final String f40060b;

    /* JADX INFO: renamed from: c */
    public final String f40061c;

    /* JADX INFO: renamed from: d */
    public final Date f40062d;

    /* JADX INFO: renamed from: e */
    public final long f40063e;

    /* JADX INFO: renamed from: f */
    public final long f40064f;

    public C3023g2(String str, String str2, String str3, Date date, long j, long j2) {
        this.f40059a = str;
        this.f40060b = str2;
        this.f40061c = str3;
        this.f40062d = date;
        this.f40063e = j;
        this.f40064f = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C3023g2 m12298a(C2999ff c2999ff) {
        String str = c2999ff.f38975d;
        if (str == null) {
            str = "";
        }
        return new C3023g2(c2999ff.f38973b, String.valueOf(c2999ff.f38974c), str, new Date(c2999ff.f38984m), c2999ff.f38976e, c2999ff.f38981j);
    }

    /* JADX INFO: renamed from: b */
    public static C3023g2 m12299b(Map map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String str = f40057g[i];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
        try {
            return new C3023g2((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f40058h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m12300c() {
        return this.f40059a;
    }

    /* JADX INFO: renamed from: d */
    public final String m12301d() {
        return this.f40060b;
    }

    /* JADX INFO: renamed from: e */
    public final C2999ff m12302e() {
        C2999ff c2999ff = new C2999ff();
        c2999ff.f38972a = "frc";
        c2999ff.f38984m = this.f40062d.getTime();
        c2999ff.f38973b = this.f40059a;
        c2999ff.f38974c = this.f40060b;
        String str = this.f40061c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        c2999ff.f38975d = str;
        c2999ff.f38976e = this.f40063e;
        c2999ff.f38981j = this.f40064f;
        return c2999ff;
    }
}
