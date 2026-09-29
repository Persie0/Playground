package bj;

import android.view.View;
import android.widget.PopupWindow;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.playlist.PlaylistActionsPopupMenu$PlaylistActionsMenuItem;
import com.lingq.p055ui.home.playlist.PlaylistPopupMenu$PlaylistMenuItem;
import dm.C5207g;

/* JADX INFO: renamed from: bj.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1582e implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PopupWindow f9055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2052l f9056c;

    public /* synthetic */ ViewOnClickListenerC1582e(PopupWindow popupWindow, InterfaceC2052l interfaceC2052l, int i10) {
        this.f9054a = i10;
        this.f9055b = popupWindow;
        this.f9056c = interfaceC2052l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f9054a;
        InterfaceC2052l interfaceC2052l = this.f9056c;
        PopupWindow popupWindow = this.f9055b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(interfaceC2052l, "$itemSelected");
                popupWindow.dismiss();
                interfaceC2052l.mo528n(PlaylistActionsPopupMenu$PlaylistActionsMenuItem.Downloads);
                break;
            default:
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(interfaceC2052l, "$itemItemSelected");
                popupWindow.dismiss();
                interfaceC2052l.mo528n(PlaylistPopupMenu$PlaylistMenuItem.RemovePlaylist);
                break;
        }
    }
}
