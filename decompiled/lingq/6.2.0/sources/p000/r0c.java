package p000;

import com.google.android.gms.internal.clearcut.AbstractC0949b;
import com.google.android.gms.internal.clearcut.AbstractC0954g;
import com.google.android.gms.internal.clearcut.C0952e;
import com.google.android.gms.internal.clearcut.C0953f;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class r0c {

    /* JADX INFO: renamed from: c */
    public static final r0c f58470c = new r0c();

    /* JADX INFO: renamed from: a */
    public final zwb f58471a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f58472b = new ConcurrentHashMap();

    public r0c() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        zwb zwbVar = null;
        for (int i = 0; i <= 0; i++) {
            try {
                zwbVar = (zwb) Class.forName(strArr[0]).getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
                zwbVar = null;
            }
            if (zwbVar != null) {
                break;
            }
        }
        this.f58471a = zwbVar == null ? new zwb() : zwbVar;
    }

    /* JADX INFO: renamed from: a */
    public final m1c m20230a(Class cls) {
        uzb uzbVar;
        mvb mvbVar;
        a4c a4cVar;
        zqb zqbVar;
        byb bybVar;
        m1c m1cVarM5304m;
        Class cls2;
        Charset charset = btb.f8994a;
        if (cls == null) {
            C3386nv.m17635v("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f58472b;
        m1c m1cVar = (m1c) concurrentHashMap.get(cls);
        if (m1cVar != null) {
            return m1cVar;
        }
        zwb zwbVar = this.f58471a;
        zwbVar.getClass();
        Class cls3 = AbstractC0954g.f11797a;
        if (!AbstractC0949b.class.isAssignableFrom(cls) && (cls2 = AbstractC0954g.f11797a) != null && !cls2.isAssignableFrom(cls)) {
            C3386nv.m17626m("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        z0c z0cVarMo13548a = zwbVar.f72325a.mo13548a(cls);
        if (!((z0cVarMo13548a.f70739b.f38258d & 2) == 2)) {
            if (AbstractC0949b.class.isAssignableFrom(cls)) {
                if ((z0cVarMo13548a.f70739b.f38258d & 1) == 1) {
                    uzbVar = c0c.f9295b;
                    mvbVar = mvb.f51902b;
                    a4cVar = AbstractC0954g.f11800d;
                    zqbVar = jrb.f46049a;
                } else {
                    uzbVar = c0c.f9295b;
                    mvbVar = mvb.f51902b;
                    a4cVar = AbstractC0954g.f11800d;
                    zqbVar = null;
                }
                bybVar = cyb.f34716b;
            } else {
                if ((z0cVarMo13548a.f70739b.f38258d & 1) == 1) {
                    uzbVar = c0c.f9294a;
                    mvbVar = mvb.f51901a;
                    a4cVar = AbstractC0954g.f11798b;
                    zqbVar = jrb.f46050b;
                    if (zqbVar == null) {
                        C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    uzbVar = c0c.f9294a;
                    mvbVar = mvb.f51901a;
                    a4cVar = AbstractC0954g.f11799c;
                    zqbVar = null;
                }
                bybVar = cyb.f34715a;
            }
            m1cVarM5304m = C0952e.m5304m(z0cVarMo13548a, uzbVar, mvbVar, a4cVar, zqbVar, bybVar);
        } else if (AbstractC0949b.class.isAssignableFrom(cls)) {
            m1cVarM5304m = new C0953f(AbstractC0954g.f11800d, jrb.f46049a, z0cVarMo13548a.f70738a);
        } else {
            a4c a4cVar2 = AbstractC0954g.f11798b;
            zqb zqbVar2 = jrb.f46050b;
            if (zqbVar2 == null) {
                C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
                return null;
            }
            m1cVarM5304m = new C0953f(a4cVar2, zqbVar2, z0cVarMo13548a.f70738a);
        }
        m1c m1cVar2 = (m1c) concurrentHashMap.putIfAbsent(cls, m1cVarM5304m);
        return m1cVar2 != null ? m1cVar2 : m1cVarM5304m;
    }
}
