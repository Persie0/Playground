package p000;

import android.view.Surface;
import androidx.wear.ambient.AmbientDelegate;
import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkp implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f36394a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f36395b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f36396c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f36397d;

    public kkp(Map map, kkr kkrVar, InterfaceC0951rb interfaceC0951rb, int i) {
        this.f36397d = i;
        this.f36394a = map;
        this.f36395b = kkrVar;
        this.f36396c = interfaceC0951rb;
    }

    public kkp(kme kmeVar, cfx cfxVar, AmbientDelegate ambientDelegate, int i, byte[] bArr) {
        this.f36397d = i;
        this.f36394a = kmeVar;
        this.f36396c = cfxVar;
        this.f36395b = ambientDelegate;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kme] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rb] */
    /* JADX WARN: Type inference failed for: r7v8, types: [dhv, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ void mo3415bf(Object obj) {
        switch (this.f36397d) {
            case 0:
                mrm mrmVar = (mrm) obj;
                mrmVar.getClass();
                ?? r0 = this.f36394a;
                Object obj2 = this.f36395b;
                ?? r2 = this.f36396c;
                C0959rj c0959rj = (C0959rj) r0.get(obj2);
                if (c0959rj != null) {
                    String strM19387b = C0979sc.m19387b(c0959rj.f47553a);
                    Object objMo16812f = mrmVar.mo16812f();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting surface for external CameraStream, id=");
                    sb.append(strM19387b);
                    sb.append(", surface=");
                    sb.append(objMo16812f);
                    r2.mo19370c(c0959rj.f47553a, (Surface) mrmVar.mo16812f());
                }
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f36394a.mo13860g().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((cfx) this.f36396c).m3612d((kmg) it.next()));
                    }
                    AmbientDelegate ambientDelegate = (AmbientDelegate) this.f36395b;
                    DirtyLensHistory dirtyLensHistory = (DirtyLensHistory) ((bko) ambientDelegate.f1686b).f3652a;
                    GcamModuleJNI.DirtyLensHistory_Reset(dirtyLensHistory.f8241a, dirtyLensHistory);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((cfw) it2.next()).mo3415bf(((bko) ambientDelegate.f1686b).m2610d());
                    }
                    ?? r7 = ambientDelegate.f1687c;
                    dhx dhxVar = dhf.f11040a;
                    r7.mo6178f();
                }
                break;
        }
    }
}
