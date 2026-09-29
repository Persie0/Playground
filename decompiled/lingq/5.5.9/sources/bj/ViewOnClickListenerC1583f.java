package bj;

import android.view.View;
import android.widget.PopupWindow;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.playlist.PlaylistActionsPopupMenu$PlaylistActionsMenuItem;
import com.lingq.p055ui.home.playlist.PlaylistCoursePopupMenu;
import com.lingq.p055ui.home.playlist.PlaylistPopupMenu$PlaylistMenuItem;
import dm.C5207g;

/* JADX INFO: renamed from: bj.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1583f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PopupWindow f9058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2052l f9059c;

    public /* synthetic */ ViewOnClickListenerC1583f(PopupWindow popupWindow, InterfaceC2052l interfaceC2052l, int i10) {
        this.f9057a = i10;
        this.f9058b = popupWindow;
        this.f9059c = interfaceC2052l;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f9057a;
        InterfaceC2052l interfaceC2052l = this.f9059c;
        PopupWindow popupWindow = this.f9058b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(interfaceC2052l, "$itemSelected");
                popupWindow.dismiss();
                interfaceC2052l.mo528n(PlaylistActionsPopupMenu$PlaylistActionsMenuItem.DownloadAll);
                break;
            case 1:
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(interfaceC2052l, "$itemItemSelected");
                popupWindow.dismiss();
                interfaceC2052l.mo528n(PlaylistCoursePopupMenu.PlaylistCourseMenuItem.RemovePlaylist);
                break;
            default:
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(interfaceC2052l, "$itemItemSelected");
                popupWindow.dismiss();
                interfaceC2052l.mo528n(PlaylistPopupMenu$PlaylistMenuItem.OpenLesson);
                break;
        }
    }
}
