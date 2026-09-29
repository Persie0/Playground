package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import bj.ViewOnClickListenerC1583f;
import bj.ViewOnClickListenerC1588k;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistCoursePopupMenu {

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistCoursePopupMenu$PlaylistCourseMenuItem;", "", "(Ljava/lang/String;I)V", "RemovePlaylist", "OpenCourse", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum PlaylistCourseMenuItem {
        RemovePlaylist,
        OpenCourse
    }

    public PlaylistCoursePopupMenu(View view, InterfaceC2052l<? super PlaylistCourseMenuItem, C9072e> interfaceC2052l) {
        C5207g.m11111f(view, "view");
        Object systemService = view.getContext().getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_playlist_course, (ViewGroup) null, false);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate;
        int i10 = R.id.viewOpenCourse;
        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewOpenCourse);
        if (linearLayout != null) {
            i10 = R.id.viewRemovePlaylist;
            LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewRemovePlaylist);
            if (linearLayout2 != null) {
                PopupWindow popupWindow = new PopupWindow((View) materialCardView, -2, -2, true);
                linearLayout2.setOnClickListener(new ViewOnClickListenerC1583f(popupWindow, interfaceC2052l, 1));
                linearLayout.setOnClickListener(new ViewOnClickListenerC1588k(popupWindow, interfaceC2052l, 0));
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i11 = iArr[1];
                int i12 = (view.getContext().getResources().getDisplayMetrics().heightPixels * 2) / 3;
                if (i11 > i12) {
                    popupWindow.showAsDropDown(view, 0, -((i11 - i12) + 150));
                    return;
                } else {
                    popupWindow.showAsDropDown(view, 0, 0);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
