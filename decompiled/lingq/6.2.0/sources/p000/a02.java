package p000;

import androidx.compose.runtime.AbstractC0279g;
import com.kochava.tracker.datapoint.internal.DataPointLocation;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a02 {

    /* JADX INFO: renamed from: a */
    public final boolean f11a;

    /* JADX INFO: renamed from: b */
    public final boolean f12b;

    /* JADX INFO: renamed from: c */
    public boolean f13c;

    /* JADX INFO: renamed from: d */
    public final Object f14d;

    /* JADX INFO: renamed from: e */
    public final Object f15e;

    /* JADX INFO: renamed from: f */
    public final Object f16f;

    public a02(String str, DataPointLocation dataPointLocation, boolean z, boolean z2, boolean z3, PayloadType... payloadTypeArr) {
        this.f14d = str;
        this.f15e = dataPointLocation;
        this.f11a = z;
        this.f12b = z2;
        this.f13c = z3;
        this.f16f = new ArrayList(Arrays.asList(payloadTypeArr));
    }

    /* JADX INFO: renamed from: a */
    public static a02 m2a(String str, boolean z, boolean z2, PayloadType... payloadTypeArr) {
        return new a02(str, DataPointLocation.Data, true, z, z2, payloadTypeArr);
    }

    /* JADX INFO: renamed from: b */
    public static a02 m3b(String str, boolean z, boolean z2, PayloadType... payloadTypeArr) {
        return new a02(str, DataPointLocation.Envelope, z, z2, false, payloadTypeArr);
    }

    /* JADX INFO: renamed from: c */
    public Object m4c() {
        if (this.f11a) {
            return null;
        }
        Object obj = this.f16f;
        if (obj != null) {
            return obj;
        }
        cf1.m4606b("Unexpected form of a provided value");
        C3386nv.m17631r();
        return null;
    }

    public a02(AbstractC0279g abstractC0279g, Object obj, boolean z, yc9 yc9Var, boolean z2) {
        this.f14d = abstractC0279g;
        this.f11a = z;
        this.f15e = yc9Var;
        this.f12b = z2;
        this.f16f = obj;
        this.f13c = true;
    }
}
