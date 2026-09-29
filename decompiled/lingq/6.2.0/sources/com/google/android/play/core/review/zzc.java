package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p000.wr9;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wr9 f13365a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, wr9 wr9Var) {
        super(handler);
        this.f13365a = wr9Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f13365a.m24140d(null);
    }
}
