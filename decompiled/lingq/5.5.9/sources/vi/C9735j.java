package vi;

import ae.C0062b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.course.CourseOverviewMenuItem;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import ni.C7793a;
import p199jd.ViewOnClickListenerC6464i;
import p254m2.C7472a;
import sl.C9072e;

/* JADX INFO: renamed from: vi.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C9735j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<CourseOverviewMenuItem, C9072e> f49760a;

    /* JADX WARN: Multi-variable type inference failed */
    public C9735j(boolean z10, boolean z11, boolean z12, View view, InterfaceC2052l<? super CourseOverviewMenuItem, C9072e> interfaceC2052l) {
        this.f49760a = interfaceC2052l;
        Object systemService = view.getContext().getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        final int i10 = 0;
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_course, (ViewGroup) null, false);
        int i11 = R.id.btnAddToPlaylist;
        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnAddToPlaylist);
        if (linearLayout != null) {
            i11 = R.id.btnCourseAudio;
            LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnCourseAudio);
            if (linearLayout2 != null) {
                i11 = R.id.btnLike;
                LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnLike);
                if (linearLayout3 != null) {
                    i11 = R.id.btnRemoveAllLessons;
                    LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnRemoveAllLessons);
                    if (linearLayout4 != null) {
                        i11 = R.id.btnReport;
                        LinearLayout linearLayout5 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnReport);
                        if (linearLayout5 != null) {
                            i11 = R.id.btnSaveAllLessons;
                            LinearLayout linearLayout6 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnSaveAllLessons);
                            if (linearLayout6 != null) {
                                i11 = R.id.like;
                                ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.like);
                                if (imageView != null) {
                                    i11 = R.id.tvLike;
                                    TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvLike);
                                    if (textView != null) {
                                        final int i12 = 1;
                                        final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                                        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: vi.g
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int i13 = i10;
                                                C9735j c9735j = this;
                                                PopupWindow popupWindow2 = popupWindow;
                                                switch (i13) {
                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                        C5207g.m11111f(c9735j, "this$0");
                                                        popupWindow2.dismiss();
                                                        c9735j.f49760a.mo528n(CourseOverviewMenuItem.AddToPlaylist);
                                                        break;
                                                    default:
                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                        C5207g.m11111f(c9735j, "this$0");
                                                        popupWindow2.dismiss();
                                                        c9735j.f49760a.mo528n(CourseOverviewMenuItem.Report);
                                                        break;
                                                }
                                            }
                                        });
                                        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: vi.h
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int i13 = i10;
                                                C9735j c9735j = this;
                                                PopupWindow popupWindow2 = popupWindow;
                                                switch (i13) {
                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                        C5207g.m11111f(c9735j, "this$0");
                                                        popupWindow2.dismiss();
                                                        c9735j.f49760a.mo528n(CourseOverviewMenuItem.PlayCourseAudio);
                                                        break;
                                                    default:
                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                        C5207g.m11111f(c9735j, "this$0");
                                                        popupWindow2.dismiss();
                                                        c9735j.f49760a.mo528n(CourseOverviewMenuItem.RemoveAllLessons);
                                                        break;
                                                }
                                            }
                                        });
                                        linearLayout3.setOnClickListener(new ViewOnClickListenerC9734i(popupWindow, 0, this));
                                        linearLayout6.setOnClickListener(new ViewOnClickListenerC6464i(popupWindow, 2, this));
                                        linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: vi.g
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int i13 = i12;
                                                C9735j c9735j = this;
                                                PopupWindow popupWindow2 = popupWindow;
                                                switch (i13) {
                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                        C5207g.m11111f(c9735j, "this$0");
                                                        popupWindow2.dismiss();
                                                        c9735j.f49760a.mo528n(CourseOverviewMenuItem.AddToPlaylist);
                                                        break;
                                                    default:
                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                        C5207g.m11111f(c9735j, "this$0");
                                                        popupWindow2.dismiss();
                                                        c9735j.f49760a.mo528n(CourseOverviewMenuItem.Report);
                                                        break;
                                                }
                                            }
                                        });
                                        linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: vi.h
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int i13 = i12;
                                                C9735j c9735j = this;
                                                PopupWindow popupWindow2 = popupWindow;
                                                switch (i13) {
                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                        C5207g.m11111f(c9735j, "this$0");
                                                        popupWindow2.dismiss();
                                                        c9735j.f49760a.mo528n(CourseOverviewMenuItem.PlayCourseAudio);
                                                        break;
                                                    default:
                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                        C5207g.m11111f(c9735j, "this$0");
                                                        popupWindow2.dismiss();
                                                        c9735j.f49760a.mo528n(CourseOverviewMenuItem.RemoveAllLessons);
                                                        break;
                                                }
                                            }
                                        });
                                        if (z11) {
                                            C4924a.m10442U(linearLayout6);
                                        } else if ((z11 && !z12) || (!z11 && !z12)) {
                                            C4924a.m10442U(linearLayout4);
                                        }
                                        if (z10) {
                                            Context context = view.getContext();
                                            Object obj = C7472a.f41322a;
                                            imageView.setImageDrawable(C7472a.c.m14849b(context, R.drawable.ic_heart_filled_s));
                                            textView.setText(view.getContext().getString(R.string.lingq_likes_past));
                                        } else {
                                            Context context2 = view.getContext();
                                            Object obj2 = C7472a.f41322a;
                                            imageView.setImageDrawable(C7472a.c.m14849b(context2, R.drawable.ic_heart_s));
                                            textView.setText(view.getContext().getString(R.string.lingq_like_present));
                                        }
                                        C7793a.m15503g(popupWindow);
                                        popupWindow.showAsDropDown(view, 0, 0);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
