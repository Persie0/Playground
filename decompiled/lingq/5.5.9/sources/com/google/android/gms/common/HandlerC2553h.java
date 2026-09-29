package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: com.google.android.gms.common.h */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
public final class HandlerC2553h extends HandlerC9517f {

    /* JADX INFO: renamed from: a */
    public final Context f13929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2548c f13930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2553h(C2548c c2548c, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f13930b = c2548c;
        this.f13929a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        C2548c c2548c = this.f13930b;
        Context context = this.f13929a;
        int iM7588e = c2548c.m7588e(context);
        if (C2550e.isUserRecoverableError(iM7588e)) {
            c2548c.m7589i(context, iM7588e, c2548c.m7591b(iM7588e, 0, context, "n"));
        }
    }
}
