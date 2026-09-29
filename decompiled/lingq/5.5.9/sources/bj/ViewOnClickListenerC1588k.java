package bj;

import android.view.View;
import android.widget.PopupWindow;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.playlist.PlaylistCoursePopupMenu;
import com.lingq.p055ui.home.playlist.PlaylistPopupMenu$PlaylistMenuItem;
import com.lingq.p055ui.home.playlist.PlaylistsMenuItem;
import dm.C5207g;

/* JADX INFO: renamed from: bj.k */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1588k implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9070a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PopupWindow f9071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2052l f9072c;

    public /* synthetic */ ViewOnClickListenerC1588k(PopupWindow popupWindow, InterfaceC2052l interfaceC2052l, int i10) {
        this.f9070a = i10;
        this.f9071b = popupWindow;
        this.f9072c = interfaceC2052l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f9070a;
        InterfaceC2052l interfaceC2052l = this.f9072c;
        PopupWindow popupWindow = this.f9071b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(interfaceC2052l, "$itemItemSelected");
                popupWindow.dismiss();
                interfaceC2052l.mo528n(PlaylistCoursePopupMenu.PlaylistCourseMenuItem.OpenCourse);
                break;
            case 1:
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(interfaceC2052l, "$itemItemSelected");
                popupWindow.dismiss();
                interfaceC2052l.mo528n(PlaylistPopupMenu$PlaylistMenuItem.LessonInfo);
                break;
            default:
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(interfaceC2052l, "$itemItemSelected");
                popupWindow.dismiss();
                interfaceC2052l.mo528n(PlaylistsMenuItem.EditPlaylist);
                break;
        }
    }
}
