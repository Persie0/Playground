package p366rg;

import com.kochava.tracker.datapoint.internal.DataPointLocation;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: rg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8780a {

    /* JADX INFO: renamed from: a */
    public final String f46535a;

    /* JADX INFO: renamed from: b */
    public final DataPointLocation f46536b;

    /* JADX INFO: renamed from: c */
    public final boolean f46537c;

    /* JADX INFO: renamed from: d */
    public final boolean f46538d;

    /* JADX INFO: renamed from: e */
    public final boolean f46539e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f46540f;

    public C8780a(String str, DataPointLocation dataPointLocation, boolean z10, boolean z11, boolean z12, PayloadType... payloadTypeArr) {
        this.f46535a = str;
        this.f46536b = dataPointLocation;
        this.f46537c = z10;
        this.f46538d = z11;
        this.f46539e = z12;
        this.f46540f = new ArrayList(Arrays.asList(payloadTypeArr));
    }

    /* JADX INFO: renamed from: a */
    public static C8780a m17039a(String str, boolean z10, boolean z11, PayloadType... payloadTypeArr) {
        return new C8780a(str, DataPointLocation.Data, true, z10, z11, payloadTypeArr);
    }

    /* JADX INFO: renamed from: b */
    public static C8780a m17040b(String str, boolean z10, boolean z11, PayloadType... payloadTypeArr) {
        return new C8780a(str, DataPointLocation.Envelope, z10, z11, false, payloadTypeArr);
    }
}
