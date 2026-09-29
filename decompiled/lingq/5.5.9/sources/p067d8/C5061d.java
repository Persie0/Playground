package p067d8;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import com.facebook.internal.GamingAction;
import dm.C5207g;
import java.util.ArrayList;
import p291o7.C8004n;

/* JADX INFO: renamed from: d8.d */
/* JADX INFO: loaded from: classes.dex */
public class C5061d {

    /* JADX INFO: renamed from: a */
    public Uri f32915a;

    public C5061d(Bundle bundle, String str) {
        Uri uriM10817b;
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] gamingActionArrValuesCustom = GamingAction.valuesCustom();
        ArrayList arrayList = new ArrayList(gamingActionArrValuesCustom.length);
        for (GamingAction gamingAction : gamingActionArrValuesCustom) {
            arrayList.add(gamingAction.getRawValue());
        }
        if (arrayList.contains(str)) {
            C5086z c5086z = C5086z.f33015a;
            int i10 = C5083w.f33011a;
            C8004n c8004n = C8004n.f43550a;
            uriM10817b = C5086z.m10817b(C0166e.m770q(new Object[]{"fb.gg"}, 1, "%s", "java.lang.String.format(format, *args)"), C5207g.m11116k(str, "/dialog/"), bundle);
        } else {
            C5086z c5086z2 = C5086z.f33015a;
            uriM10817b = C5086z.m10817b(C5083w.m10800a(), C8004n.m15874d() + "/dialog/" + str, bundle);
        }
        this.f32915a = uriM10817b;
    }
}
