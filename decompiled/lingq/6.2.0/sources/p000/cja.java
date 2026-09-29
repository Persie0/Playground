package p000;

import android.os.CountDownTimer;
import com.lingq.core.premium.C1853l;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes2.dex */
public final class cja extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1853l f10179a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DateTime f10180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cja(C1853l c1853l, DateTime dateTime, long j) {
        super(j, 1000L);
        this.f10179a = c1853l;
        this.f10180b = dateTime;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Object value;
        C3244l c3244l = this.f10179a.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, new vk8(0, 0, 0, 0, 15), null, false, null, null, null, false, false, false, null, false, 2097135)));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        Object value;
        Object value2;
        C1853l c1853l = this.f10179a;
        vk8 vk8VarM8580V2 = C1853l.m8580V2(c1853l, j);
        boolean zM22364c = new DateTime().m22364c(this.f10180b);
        C3244l c3244l = c1853l.f22544h;
        if (zM22364c) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, wia.m23988a((wia) value2, null, null, null, false, vk8.m23364a(vk8VarM8580V2, true), null, false, null, null, null, false, false, false, null, false, 2097135)));
            return;
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, vk8.m23364a(vk8VarM8580V2, false), null, false, null, null, null, false, false, false, null, false, 2097135)));
        CountDownTimer countDownTimer = c1853l.f22546j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
