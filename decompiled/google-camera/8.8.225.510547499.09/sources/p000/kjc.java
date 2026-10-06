package p000;

import android.os.Handler;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kjc extends kkf {
    public kjc(kmd kmdVar, kfn kfnVar, kkz kkzVar, kkk kkkVar, kbo kboVar, kbz kbzVar) {
        super(kmdVar.mo14547P(), kfnVar.f35838b, kkzVar, kkkVar, kboVar, kbzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.kkf
    /* JADX INFO: renamed from: a */
    protected final void mo14372a(kpj kpjVar, kjo kjoVar, List list, Handler handler) {
        lku.m15614I(true, "InputConfiguration is not supported on Android L.");
        try {
            ArrayList arrayList = new ArrayList(((mzr) list).f41859c);
            nba it = ((mws) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((kjs) it.next()).m14395c());
            }
            kpjVar.mo14494d(arrayList, kjoVar, handler);
        } catch (Throwable th) {
            this.f36343b.mo13948j(wUzNh.HDkXkGkMROKw.concat(String.valueOf(String.valueOf(kjoVar))), th);
            kjoVar.m14383b();
        }
    }
}
