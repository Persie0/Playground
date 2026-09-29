package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.C2927dg;
import p000.c54;
import p000.u87;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformInitializer implements c54 {
    @Override // p000.c54
    /* JADX INFO: renamed from: a */
    public final List mo2060a() {
        return EmptyList.f47638a;
    }

    @Override // p000.c54
    /* JADX INFO: renamed from: b */
    public final Object mo2061b(Context context) {
        context.getClass();
        C2927dg c2927dg = u87.f63590a;
        C2927dg c2927dg2 = u87.f63590a;
        if (c2927dg2 == null) {
            c2927dg2 = null;
        }
        if (c2927dg2 != null) {
            c2927dg2.f35577c = context;
        }
        return u87.f63590a;
    }
}
