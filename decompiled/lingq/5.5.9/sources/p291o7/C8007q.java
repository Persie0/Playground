package p291o7;

import android.support.v4.media.C0141b;
import com.facebook.GraphRequest;
import dm.C5207g;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: o7.q */
/* JADX INFO: loaded from: classes.dex */
public final class C8007q implements GraphRequest.InterfaceC2280d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList<String> f43576a;

    public C8007q(ArrayList<String> arrayList) {
        this.f43576a = arrayList;
    }

    @Override // com.facebook.GraphRequest.InterfaceC2280d
    /* JADX INFO: renamed from: a */
    public final void mo6631a(String str, String str2) throws IOException {
        C5207g.m11111f(str2, "value");
        this.f43576a.add(C0141b.m613i(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2, Locale.US, "%s=%s", "java.lang.String.format(locale, format, *args)"));
    }
}
