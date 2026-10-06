package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cks extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ckt f5999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cks(ckt cktVar, Looper looper) {
        super(looper);
        this.f5999a = cktVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ckt cktVar = this.f5999a;
        cktVar.m3849f(cktVar.m3847d());
    }
}
