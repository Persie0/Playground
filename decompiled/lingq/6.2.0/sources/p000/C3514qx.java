package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: qx */
/* JADX INFO: loaded from: classes.dex */
public final class C3514qx extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final ew2 f58322a;

    /* JADX INFO: renamed from: b */
    public final qp9 f58323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3552rx f58324c;

    public C3514qx(C3552rx c3552rx, qp9 qp9Var, ew2 ew2Var) {
        this.f58324c = c3552rx;
        this.f58323b = qp9Var;
        this.f58322a = ew2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f58323b.m20098c(new RunnableC3781y2(this, 4));
        }
    }
}
