package p000;

import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class euq extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ float f20133a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eur f20134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euq(eur eurVar, long j, long j2, float f) {
        super(j, j2);
        this.f20134b = eurVar;
        this.f20133a = f;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f20134b.f20135a.f20201s.mo11245q();
        cancel();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        fmi fmiVar = this.f20134b.f20135a.f20196n;
        float f = this.f20133a * 100.0f;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        iiu iiuVar = fmiVar.f22559b;
        iiuVar.f31136h = seconds;
        iiuVar.f31140l = String.format("%01d:%02d", Long.valueOf(seconds / 60), Long.valueOf(seconds % 60));
        iiuVar.invalidate();
        if (((int) f) >= 100) {
            fmiVar.f22558a.f7299c = true;
        } else {
            fmiVar.f22558a.f7299c = false;
        }
    }
}
