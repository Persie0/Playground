package p000;

import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdk extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    int f21439a;

    /* JADX INFO: renamed from: b */
    long f21440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fdl f21441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdk(fdl fdlVar) {
        super(2147483647L, 12000L);
        this.f21441c = fdlVar;
        this.f21439a = 0;
        this.f21440b = -1L;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        fdl fdlVar = this.f21441c;
        fdlVar.f21443b.remove(fdlVar.f21445d);
        cet cetVar = (cet) jvh.m13560h(this.f21441c.f21448g);
        if (cetVar != null) {
            cetVar.mo3577c();
        }
    }

    @Override // android.os.CountDownTimer
    public final synchronized void onTick(long j) {
        if (this.f21440b == -1) {
            this.f21440b = j;
            return;
        }
        fdl fdlVar = this.f21441c;
        if (!fdlVar.f21443b.contains(fdlVar.f21445d) && this.f21440b - j >= TimeUnit.SECONDS.toMillis(30L)) {
            fdl fdlVar2 = this.f21441c;
            fdlVar2.f21443b.add(fdlVar2.f21445d);
            this.f21439a = this.f21441c.f21443b.size() - 1;
        }
        idb idbVar = (idb) this.f21441c.f21443b.get(this.f21439a);
        int i = this.f21439a + 1;
        this.f21439a = i;
        this.f21439a = i % this.f21441c.f21443b.size();
        this.f21441c.f21442a.execute(new ewo(this, idbVar, 5));
    }
}
