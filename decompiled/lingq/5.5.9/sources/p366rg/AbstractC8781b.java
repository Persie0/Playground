package p366rg;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import androidx.activity.result.C0204c;
import com.kochava.core.json.internal.JsonType;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.DataPointLocation;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;
import p075dh.C5176d;
import p338qd.C8573r0;
import p349qo.C8656b;
import p534zf.C10485c;
import p534zf.InterfaceC10486d;
import p534zf.InterfaceC10488f;
import p535zg.C10489a;

/* JADX INFO: renamed from: rg.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8781b {

    /* JADX INFO: renamed from: b */
    public static final C0076c f46541b;

    /* JADX INFO: renamed from: a */
    public final C8780a[] f46542a = mo17042b();

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f46541b = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "DataPointCollection");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17041a(InterfaceC10486d interfaceC10486d) {
        C10485c c10485c = (C10485c) interfaceC10486d;
        if (!(c10485c.m19444f() == JsonType.Null)) {
            if (c10485c.m19444f() != JsonType.Invalid) {
                JsonType jsonTypeM19444f = c10485c.m19444f();
                JsonType jsonType = JsonType.String;
                Object obj = c10485c.f52417a;
                if (jsonTypeM19444f == jsonType && C8573r0.m16662A0(C8656b.m16889P(obj, ""))) {
                    return false;
                }
                if (c10485c.m19444f() == JsonType.JsonObject && c10485c.m19443a().length() == 0) {
                    return false;
                }
                return (c10485c.m19444f() == JsonType.JsonArray && C8656b.m16884K(obj).length() == 0) ? false : true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract C8780a[] mo17042b();

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC10486d mo17043c(Context context, C5176d c5176d, String str, ArrayList arrayList, List list) throws Exception;

    /* JADX INFO: renamed from: d */
    public final void m17044d(Context context, C5176d c5176d, boolean z10, boolean z11, ArrayList arrayList, List list, List list2, List list3, InterfaceC10488f interfaceC10488f, InterfaceC10488f interfaceC10488f2) {
        C0076c c0076c = f46541b;
        for (C8780a c8780a : this.f46542a) {
            String str = c8780a.f46535a;
            if (c8780a.f46540f.contains(c5176d.f33197a)) {
                DataPointLocation dataPointLocation = c8780a.f46536b;
                PayloadType payloadType = c5176d.f33197a;
                if ((z11 || dataPointLocation == DataPointLocation.Envelope || payloadType == PayloadType.Init) && !list.contains(str) && ((payloadType == PayloadType.Init || !list2.contains(str)) && ((c8780a.f46537c || !z10) && (c8780a.f46538d || ((dataPointLocation != DataPointLocation.Data || !interfaceC10488f2.mo19463m(str)) && (dataPointLocation != DataPointLocation.Envelope || !interfaceC10488f.mo19463m(str))))))) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        InterfaceC10486d interfaceC10486dMo17043c = mo17043c(context, c5176d, str, arrayList, list3);
                        if (m17041a(interfaceC10486dMo17043c)) {
                            DataPointLocation dataPointLocation2 = DataPointLocation.Envelope;
                            boolean z12 = c8780a.f46539e;
                            if (dataPointLocation == dataPointLocation2) {
                                if (z12) {
                                    interfaceC10488f.mo19464n(((C10485c) interfaceC10486dMo17043c).m19443a());
                                } else {
                                    interfaceC10488f.mo19458h(str, interfaceC10486dMo17043c);
                                }
                            } else if (dataPointLocation == DataPointLocation.Data) {
                                if (z12) {
                                    interfaceC10488f2.mo19464n(((C10485c) interfaceC10486dMo17043c).m19443a());
                                } else {
                                    interfaceC10488f2.mo19458h(str, interfaceC10486dMo17043c);
                                }
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (jCurrentTimeMillis2 > 500) {
                                StringBuilder sbM854m = C0204c.m854m("Datapoint gathering took longer then expected for ", str, " at ");
                                sbM854m.append(C5206f.m11011j1(jCurrentTimeMillis2));
                                sbM854m.append(" seconds");
                                c0076c.m459c(sbM854m.toString());
                            }
                        }
                    } catch (Throwable unused) {
                        c0076c.m459c("Unable to gather datapoint: " + str);
                    }
                }
            }
        }
    }
}
