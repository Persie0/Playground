package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class snc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f61077a = new C0282a(1246588054, false, new de1(4));

    /* JADX INFO: renamed from: a */
    public static final boolean m21496a(String str, Map map, boolean z) {
        Object obj = map.get(str);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return bool != null ? bool.booleanValue() : z;
    }
}
