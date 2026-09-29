package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.exoplayer2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2379b {

    /* JADX INFO: renamed from: a */
    public final Context f12036a;

    /* JADX INFO: renamed from: b */
    public final a f12037b;

    /* JADX INFO: renamed from: c */
    public boolean f12038c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$a */
    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a */
        public final b f12039a;

        /* JADX INFO: renamed from: b */
        public final Handler f12040b;

        public a(Handler handler, C2413j.b bVar) {
            this.f12040b = handler;
            this.f12039a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f12040b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C2379b.this.f12038c) {
                C2413j.this.m7018A(-1, 3, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$b */
    public interface b {
    }

    public C2379b(Context context, Handler handler, C2413j.b bVar) {
        this.f12036a = context.getApplicationContext();
        this.f12037b = new a(handler, bVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m6898a(boolean z10) {
        a aVar = this.f12037b;
        Context context = this.f12036a;
        if (z10 && !this.f12038c) {
            context.registerReceiver(aVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f12038c = true;
        } else {
            if (z10 || !this.f12038c) {
                return;
            }
            context.unregisterReceiver(aVar);
            this.f12038c = false;
        }
    }
}
