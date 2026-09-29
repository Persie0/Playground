package p000;

import com.google.android.gms.internal.vision.AbstractC1034s;
import com.google.android.gms.internal.vision.AbstractC1039x;
import com.google.android.gms.internal.vision.C1036u;
import com.google.android.gms.internal.vision.C1038w;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ovc {

    /* JADX INFO: renamed from: c */
    public static final ovc f55046c = new ovc();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f55048b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final hi8 f55047a = new hi8(1);

    /* JADX INFO: renamed from: a */
    public final iwc m18526a(Class cls) {
        iwc iwcVarM5755l;
        Class cls2;
        Charset charset = noc.f53082a;
        if (cls == null) {
            C3386nv.m17635v("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f55048b;
        iwc iwcVar = (iwc) concurrentHashMap.get(cls);
        if (iwcVar != null) {
            return iwcVar;
        }
        hi8 hi8Var = this.f55047a;
        hi8Var.getClass();
        Class cls3 = AbstractC1039x.f12262a;
        if (!AbstractC1034s.class.isAssignableFrom(cls) && (cls2 = AbstractC1039x.f12262a) != null && !cls2.isAssignableFrom(cls)) {
            C3386nv.m17626m("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        awc awcVarMo2961a = ((ksc) hi8Var.f42410b).mo2961a(cls);
        if ((awcVarMo2961a.f7634d & 2) == 2) {
            if (AbstractC1034s.class.isAssignableFrom(cls)) {
                iwcVarM5755l = new C1038w(AbstractC1039x.f12265d, vlc.f65574a, awcVarMo2961a.f7631a);
            } else {
                izc izcVar = AbstractC1039x.f12263b;
                olc olcVar = vlc.f65575b;
                if (olcVar == null) {
                    C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                iwcVarM5755l = new C1038w(izcVar, olcVar, awcVarMo2961a.f7631a);
            }
        } else if (AbstractC1034s.class.isAssignableFrom(cls)) {
            iwcVarM5755l = (awcVarMo2961a.f7634d & 1) == 1 ? C1036u.m5755l(awcVarMo2961a, wuc.f67325b, sqc.f61273b, AbstractC1039x.f12265d, vlc.f65574a, gtc.f41315b) : C1036u.m5755l(awcVarMo2961a, wuc.f67325b, sqc.f61273b, AbstractC1039x.f12265d, null, gtc.f41315b);
        } else if ((awcVarMo2961a.f7634d & 1) == 1) {
            cvc cvcVar = wuc.f67324a;
            crc crcVar = sqc.f61272a;
            izc izcVar2 = AbstractC1039x.f12263b;
            olc olcVar2 = vlc.f65575b;
            if (olcVar2 == null) {
                C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
                return null;
            }
            iwcVarM5755l = C1036u.m5755l(awcVarMo2961a, cvcVar, crcVar, izcVar2, olcVar2, gtc.f41314a);
        } else {
            iwcVarM5755l = C1036u.m5755l(awcVarMo2961a, wuc.f67324a, sqc.f61272a, AbstractC1039x.f12264c, null, gtc.f41314a);
        }
        iwc iwcVar2 = (iwc) concurrentHashMap.putIfAbsent(cls, iwcVarM5755l);
        return iwcVar2 != null ? iwcVar2 : iwcVarM5755l;
    }
}
