package p000;

import android.util.Printer;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgt implements kaq {

    /* JADX INFO: renamed from: a */
    public final Set f35965a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final List f35966b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final khb f35967c;

    /* JADX INFO: renamed from: d */
    private final Executor f35968d;

    /* JADX INFO: renamed from: e */
    private final kbo f35969e;

    /* JADX INFO: renamed from: f */
    private final lpe f35970f;

    public kgt(kbo kboVar, Executor executor, khb khbVar, lpe lpeVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f35968d = new kcf(executor, kbzVar, "FrameBuffer");
        this.f35967c = khbVar;
        this.f35970f = lpeVar;
        this.f35969e = kboVar.mo6314a("FrameBufferMap");
    }

    @Override // p000.kaq
    /* JADX INFO: renamed from: a */
    public final void mo13885a(Printer printer) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized kba m14223b(Runnable runnable) {
        this.f35966b.add(runnable);
        return new igy(this, runnable, 6);
    }

    /* JADX INFO: renamed from: c */
    public final void m14224c() {
        mws mwsVarM17095j;
        synchronized (this) {
            mwsVarM17095j = mws.m17095j(this.f35966b);
        }
        if (mwsVarM17095j.isEmpty()) {
            return;
        }
        int size = mwsVarM17095j.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) mwsVarM17095j.get(i)).run();
        }
    }

    /* JADX INFO: renamed from: d */
    public final kgs m14225d(kho khoVar, int i) {
        kgs kgsVar;
        int i2 = khoVar.f36069e;
        if (i > i2 && i2 != -1) {
            this.f35969e.mo13947i("Desired capacity of " + i + " is larger than the max capacity of " + String.valueOf(khoVar) + ". Restricting capacity to " + khoVar.f36069e);
            i = khoVar.f36069e;
        }
        synchronized (this) {
            for (kgs kgsVar2 : this.f35965a) {
                lku.m15611F(kot.m14643i(khoVar, kgsVar2.f35958h, this.f35969e), "Cannot attach %s because it conflicts with %s (%s)", khoVar, kgsVar2, kgsVar2.f35958h);
            }
            kgsVar = new kgs(this, this.f35968d, khoVar, this.f35970f, i, null, null, null, null);
            this.f35967c.m14255u(kgsVar);
            this.f35965a.add(kgsVar);
            if (i > 0) {
                this.f35969e.mo13944f("Created " + kgsVar.toString() + " from " + String.valueOf(khoVar) + " with " + i + gBCSQzBeB.trPeVt);
            } else {
                this.f35969e.mo13944f("Created " + kgsVar.toString() + " from " + String.valueOf(khoVar));
            }
        }
        m14224c();
        return kgsVar;
    }
}
