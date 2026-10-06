package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kje implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kjo f36248a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kpj f36249b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Handler f36250c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ jvb f36251d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ kjf f36252e;

    public kje(kjf kjfVar, kjo kjoVar, kpj kpjVar, Handler handler, jvb jvbVar) {
        this.f36252e = kjfVar;
        this.f36248a = kjoVar;
        this.f36249b = kpjVar;
        this.f36250c = handler;
        this.f36251d = jvbVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        kbz kbzVar;
        List list = (List) obj;
        this.f36252e.f36254b.mo13940b("createConstrainedHighSpeedCaptureSession");
        this.f36252e.f36255c.mo13961e("createCaptureSessionByOutputConfigurations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(new kpq(new klz(new OutputConfiguration(-1, (Surface) it.next()))));
            } catch (Throwable th) {
                this.f36252e.f36255c.mo13962f();
                throw th;
            }
        }
        try {
            this.f36252e.f36253a.m14435d(this.f36248a);
            this.f36252e.f36253a.m14432a(this.f36248a, arrayList);
            this.f36249b.mo14496f(list, this.f36248a, this.f36250c);
            kbzVar = this.f36252e.f36255c;
        } catch (kec e) {
            this.f36251d.close();
            kbzVar = this.f36252e.f36255c;
        }
        kbzVar.mo13962f();
    }
}
