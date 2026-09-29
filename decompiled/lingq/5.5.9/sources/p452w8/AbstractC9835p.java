package p452w8;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.HashMap;
import p528z8.C10456a;
import p528z8.C10457b;
import p528z8.C10458c;
import p528z8.C10459d;
import p528z8.C10460e;
import ye.C10354c;
import ye.C10355d;

/* JADX INFO: renamed from: w8.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9835p {

    /* JADX INFO: renamed from: a */
    public static final C10355d f50041a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C10354c c10354c = C10355d.a.f52064a;
        map.put(AbstractC9835p.class, C9824e.f50000a);
        map2.remove(AbstractC9835p.class);
        map.put(C10456a.class, C9820a.f49987a);
        map2.remove(C10456a.class);
        map.put(C10460e.class, C9826g.f50005a);
        map2.remove(C10460e.class);
        map.put(C10458c.class, C9823d.f49997a);
        map2.remove(C10458c.class);
        map.put(LogEventDropped.class, C9822c.f49994a);
        map2.remove(LogEventDropped.class);
        map.put(C10457b.class, C9821b.f49992a);
        map2.remove(C10457b.class);
        map.put(C10459d.class, C9825f.f50002a);
        map2.remove(C10459d.class);
        f50041a = new C10355d(new HashMap(map), new HashMap(map2), c10354c);
    }

    /* JADX INFO: renamed from: a */
    public abstract C10456a m18329a();
}
