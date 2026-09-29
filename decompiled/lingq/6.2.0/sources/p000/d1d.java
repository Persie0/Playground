package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.lingq.feature.widget.PlaylistPlayerAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d1d {
    /* JADX INFO: renamed from: a */
    public static Intent m9993a(yaa yaaVar, AbstractC3027g6 abstractC3027g6) {
        Intent intentPutExtra = new Intent().setComponent((ComponentName) yaaVar.f69582o.f50862d).putExtra("ActionCallbackBroadcastReceiver:callbackClass", PlaylistPlayerAction.class.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", yaaVar.f69569b);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((o56) abstractC3027g6).f53865a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            C2953e6 c2953e6 = (C2953e6) entry.getKey();
            arrayList.add(new Pair(c2953e6.f36732a, entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        intentPutExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", omd.m18160p((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return intentPutExtra;
    }

    /* JADX INFO: renamed from: b */
    public static o56 m9994b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            C3386nv.m17626m("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
            return null;
        }
        o56 o56VarM13073a = AbstractC3064h6.m13073a(new C2990f6[0]);
        LinkedHashMap linkedHashMap = o56VarM13073a.f53865a;
        for (String str : bundle2.keySet()) {
            C2953e6 c2953e6 = new C2953e6(str);
            Object obj = bundle2.get(str);
            linkedHashMap.get(c2953e6);
            if (obj == null) {
                linkedHashMap.remove(c2953e6);
            } else {
                linkedHashMap.put(c2953e6, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            Boolean boolValueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            C2953e6 c2953e7 = cxc.f34697a;
            linkedHashMap.get(c2953e7);
            linkedHashMap.put(c2953e7, boolValueOf);
        }
        return o56VarM13073a;
    }
}
