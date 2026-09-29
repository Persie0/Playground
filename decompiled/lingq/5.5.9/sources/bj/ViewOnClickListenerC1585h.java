package bj;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.playlist.PlaylistAddFragment;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import dm.C5207g;
import km.InterfaceC6727j;
import p338qd.C8573r0;
import sh.InterfaceC9008d;

/* JADX INFO: renamed from: bj.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1585h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9064a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9065b;

    public /* synthetic */ ViewOnClickListenerC1585h(int i10, Object obj) {
        this.f9064a = i10;
        this.f9065b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f9064a;
        Object obj = this.f9065b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                PlaylistAddFragment playlistAddFragment = (PlaylistAddFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistAddFragment.f25416T0;
                C5207g.m11111f(playlistAddFragment, "this$0");
                C8573r0.m16725g0(playlistAddFragment).m3995p();
                break;
            default:
                PlaylistPlayerView playlistPlayerView = (PlaylistPlayerView) obj;
                int i11 = PlaylistPlayerView.f25566c;
                C5207g.m11111f(playlistPlayerView, "this$0");
                InterfaceC9008d interfaceC9008d = playlistPlayerView.f25568b;
                if (interfaceC9008d != null) {
                    interfaceC9008d.mo9873k();
                }
                break;
        }
    }
}
