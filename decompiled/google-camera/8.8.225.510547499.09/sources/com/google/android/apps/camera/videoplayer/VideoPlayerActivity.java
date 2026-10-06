package com.google.android.apps.camera.videoplayer;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.AbstractC0118cx;
import p000.ActivityC0157ei;
import p000.inz;
import p000.ioa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class VideoPlayerActivity extends ActivityC0157ei {

    /* JADX INFO: renamed from: q */
    private final BroadcastReceiver f7313q = new inz(this);

    /* JADX INFO: renamed from: n */
    private final ioa m4514n() {
        return (ioa) m3206bA().m5324d(C0100R.id.video_player_activity_layout);
    }

    /* JADX INFO: renamed from: o */
    private final void m4515o(Uri uri) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("no_seek_bar", false);
        bundle.putBoolean("auto_loop_enabled", false);
        ioa ioaVarM11558c = ioa.m11558c(bundle, uri);
        AbstractC0118cx abstractC0118cxM5327i = m3206bA().m5327i();
        abstractC0118cxM5327i.m5697m(C0100R.id.video_player_activity_layout, ioaVarM11558c);
        abstractC0118cxM5327i.mo2021h();
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0100R.layout.videoplayer_activity_main);
        if (m4514n() == null) {
            Uri data = getIntent().getData();
            data.getClass();
            m4515o(data);
        }
        registerReceiver(this.f7313q, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected final void onDestroy() {
        unregisterReceiver(this.f7313q);
        super.onDestroy();
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ioa ioaVarM4514n = m4514n();
        if (ioaVarM4514n != null) {
            AbstractC0118cx abstractC0118cxM5327i = m3206bA().m5327i();
            abstractC0118cxM5327i.mo2024k(ioaVarM4514n);
            abstractC0118cxM5327i.mo2021h();
        }
        Uri data = intent.getData();
        data.getClass();
        m4515o(data);
    }
}
