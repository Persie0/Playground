package androidx.compose.p017ui.platform;

import ae.C0062b;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.linguist.R;
import dm.C5207g;
import java.util.LinkedHashMap;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.internal.C7155e;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7832g0;
import no.C7851m1;
import p081e0.AbstractC5311g;
import p338qd.C8573r0;
import p389t2.C9187f;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0604a2 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f4280a = new LinkedHashMap();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7142w m2329a(Context context) {
        InterfaceC7142w interfaceC7142w;
        LinkedHashMap linkedHashMap = f4280a;
        synchronized (linkedHashMap) {
            Object objM353h2 = linkedHashMap.get(context);
            if (objM353h2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
                C7136q c7136q = new C7136q(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new C0683z1(abstractChannelM16738m, C9187f.m17522a(Looper.getMainLooper())), abstractChannelM16738m, context, null));
                C7851m1 c7851m1M380p = C0062b.m380p();
                C7178b c7178b = C7832g0.f42930a;
                objM353h2 = C0062b.m353h2(c7136q, new C7155e(c7851m1M380p.mo1471C(C7162l.f40438a)), new StartedWhileSubscribed(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, objM353h2);
            }
            interfaceC7142w = (InterfaceC7142w) objM353h2;
        }
        return interfaceC7142w;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC5311g m2330b(View view) {
        C5207g.m11111f(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC5311g) {
            return (AbstractC5311g) tag;
        }
        return null;
    }
}
